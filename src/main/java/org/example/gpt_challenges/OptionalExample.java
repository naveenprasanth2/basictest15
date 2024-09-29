package org.example.gpt_challenges;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        List<User> users = List.of(
                new User("Alice", "alice@example.com"),
                new User("Bob", null),
                new User("Charlie", "charlie@example.com")
        );
        findFirstUserEmail(users).or(() -> Optional.of("email not found"))
                .ifPresentOrElse(System.out::println, NoSuchElementException::new);
        Optional<User> test = Optional.ofNullable(new User("name", "naveen@gmail.com"));
    }

    private static Optional<String> findFirstUserEmail(List<User> users) {
        return users.stream()
                .map(User::getEmailId)
                .filter(Optional::isPresent)
                .map(Optional::get)
                .findFirst();
    }
}
