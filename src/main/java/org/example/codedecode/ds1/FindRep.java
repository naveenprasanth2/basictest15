package org.example.codedecode.ds1;

import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindRep {
    public static void main(String[] args) {
        List<String> input = List.of("cat", "mat", "bat", "cat", "cat", "mat", "bat", "bat");
      List<Map.Entry<String, Long>>  test =  input.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .sorted((x1, x2) -> {
                    if (!Objects.equals(x1.getValue(), x2.getValue())){
                        return (int) (x2.getValue() - x1.getValue());
                    }else {
                        return x1.getKey().compareTo(x2.getKey());
                    }
                }).toList();

        System.out.println(test);
    }
}
