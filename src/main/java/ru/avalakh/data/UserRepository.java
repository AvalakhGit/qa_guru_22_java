package ru.avalakh.data;

import ru.avalakh.domain.User;

import java.sql.SQLException;
import java.util.Optional;

public interface UserRepository {

    Optional<User> findByUsername(String username);

    class MockUserRepository implements UserRepository {
        @Override
        public Optional<User> findByUsername(String username) {
            if ("max".equals(username)) {
                return Optional.of(
                        new User(
                                "max",
                                "12345"
                        )
                );
            } else {
                return Optional.empty();
            }
        }
    }
}