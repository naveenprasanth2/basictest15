package org.example.gpt_challenges;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Optional;

@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private @Getter String name;
    private String emailId;

    public Optional<String> getEmailId() {
        return Optional.ofNullable(this.emailId);
    }
}
