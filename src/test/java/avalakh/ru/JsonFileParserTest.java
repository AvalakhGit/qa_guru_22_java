package avalakh.ru;

import avalakh.ru.model.MobilePhone;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class JsonFileParserTest {
    ObjectMapper mapper = new ObjectMapper();

    @Test
    public void jsonFileParseTest() throws Exception{

        File file = new File ("src/test/resources/phones.json");
        List<MobilePhone> phoneList=mapper.readValue(file, new TypeReference<>() {});
        assertThat(phoneList).hasSize(3);
        assertThat(phoneList.get(0).getManufacturer()).isEqualTo("Xiaomi");
        assertThat(phoneList.get(0).getModel()).isEqualTo("Redmi Note 10");
        System.out.println("Successful check json file.");

    }
}
