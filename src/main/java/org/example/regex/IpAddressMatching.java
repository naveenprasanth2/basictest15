package org.example.regex;

import java.util.List;
import java.util.Arrays;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IpAddressMatching {
    public static void main(String[] args) {
        List<String> testStrings = Arrays.asList(
                "Some IP addresses: 192.168.1.1, 10.0.0.1, 255.255.255.255.",
                "Invalid IPs: 256.256.256.256, 123.456.78.90, 192.168.1., 355.355.355.355"
        );

        Pattern pattern = Pattern.compile(" \\d{1,3}.\\d{1,3}.\\d{1,3}.\\d{1,3}");

        List<String> result = testStrings.stream()
                .flatMap(x -> {
                    Matcher matcher = pattern.matcher(x);
                    return matcher.results().map(MatchResult::group);
                })
                .filter(IpAddressMatching::isValidIP)
                .toList();

        System.out.println(result);
    }

    public static boolean isValidIP(String value) {
        String[] values = value.split("[.]");

        for (String val : values) {
            if (Integer.parseInt(val) > 255) {
                return false;
            }
        }

        return true;
    }
}
