package org.example.chatgpt.coding_challenges;

public class ReplaceString {
    public static void main(String[] args) {
        String ssid = "ABCDEF898900TTR";

//        System.out.println(ssid.replaceAll("^.{0,6}", "XXXXXX"));
        System.out.println("X".repeat(6) + ssid.substring(6));
    }
}
