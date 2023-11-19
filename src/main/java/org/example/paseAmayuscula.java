package org.example;

import java.util.List;
import java.util.stream.Collectors;

public interface paseAmayuscula {
    public static List<String> mayusculas(List<String> listaStrings) {
        return listaStrings.stream().map(String::toUpperCase).collect( Collectors.toList());
    }
}
