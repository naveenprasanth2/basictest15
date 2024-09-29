package org.example.gpt_challenges;

public class UserExample {
    public static void main(String[] args) {
        User user = new User();
        user.setName("naveen");

        System.out.println(user.getEmailId().orElse("naveen@gmail.com"));
    }
}
