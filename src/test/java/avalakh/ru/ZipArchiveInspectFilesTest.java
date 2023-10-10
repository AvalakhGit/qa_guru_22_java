package avalakh.ru;

import com.codeborne.pdftest.PDF;
import com.codeborne.xlstest.XLS;
import com.opencsv.CSVReader;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ZipArchiveInspectFilesTest {
    ClassLoader cl = ZipArchiveInspectFilesTest.class.getClassLoader();

    @Test
    public void zipTest() throws Exception {
        try (InputStream stream = cl.getResourceAsStream("sample.zip");
            ZipInputStream zis = new ZipInputStream(stream)) {
            ZipEntry entry;
            while ((entry = zis.getNextEntry()) != null) {
                final String name = entry.getName();
                System.out.println(name);
                switch (name) {
                    case "qa_guru.csv":
                        CSVReader csvReader = new CSVReader(new InputStreamReader(zis));
                        List<String[]> content = csvReader.readAll();
                        assertEquals(3, content.size());

                        final String[] firstRow = content.get(0);
                        final String[] secondRow = content.get(1);
                        final String[] thirdRow = content.get(2);

                        Assertions.assertArrayEquals(new String[] {"Teacher", "lesson"}, firstRow);
                        Assertions.assertArrayEquals(new String[] {"Tuchs", "Files"}, secondRow);
                        Assertions.assertArrayEquals(new String[] {"Vasenkov", "REST Assured"}, thirdRow);
                        System.out.println("CSV - проверен!");
                        break;
                    case "sample.pdf":
                        PDF pdf = new PDF(zis);
                        assertEquals(31, pdf.numberOfPages);
                        assertTrue(pdf.text.contains("Java Code"));
                        System.out.println("PDF - проверен!");
                        break;
                    case "sample-xlsx-file.xlsx":
                        XLS xls = new XLS(zis);
                        Assertions.assertEquals("First Name",
                                xls.excel.getSheetAt(0)
                                        .getRow(0)
                                        .getCell(1)
                                        .getStringCellValue());
                        System.out.println("XLS - проверен!");
                        break;
                }
            }
        }
    }
}
