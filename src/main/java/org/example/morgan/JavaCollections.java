package org.example.morgan;

import java.util.Collection;
import java.util.List;

public class JavaCollections {
    //chars = a, b
    //numbers = 1,2
    //colours = Y, G
    //op = a1y, a2y, a1g, a2g, b1y, b2y, b1g, b2g
//    O(n2) + O (n2)
//    list2, list 3

    //op = a1, a2 , b1, b2
//

    public static void main(String[] args) {
        char[] chars = {'a', 'b'};
        List<Integer> integerList = List.of(1, 2);
        List<String> colours = List.of("Y", "G");
        List<Character> characterList = new String(chars).chars().mapToObj(x -> (char) x).toList();
        List<String> test = characterList.stream()
                .map(x -> integerList.stream().map(y -> y + String.valueOf(x)).toList())
                .flatMap(Collection::stream)
                .map(x -> colours.stream().map(z -> z + x).toList())
                .flatMap(Collection::stream).toList();

        System.out.println(test);
    }
}
