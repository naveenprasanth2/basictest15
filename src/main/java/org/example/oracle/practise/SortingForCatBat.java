package org.example.oracle.practise;

import java.util.Comparator;
import java.util.Map;
import java.util.Objects;

public class SortingForCatBat{
  static Comparator<Map.Entry<String, Long>> comparator = (o1, o2) -> {
       if (!Objects.equals(o1.getValue(), o2.getValue())){
           return (int) (o2.getValue() - o1.getValue());
       }else {
           return o1.getKey().compareTo(o2.getKey());
       }
   };
}
