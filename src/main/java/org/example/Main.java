package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class Main {
    public static void main(String[] args) {
        //ejercicio 1
        List<String> lista = new ArrayList<String> ();
        lista.add ( "argentina" );
        lista.add ( "colombia" );
        lista.add ( "chile" );
        lista.add ( "mexico" );
        lista.add ( "uruguay" );
        lista.add ( "estados unidos" );
        List<String> paseAmayuscula = lista.stream ().toList ()
                .stream ().map ( frase -> frase.toUpperCase () ).collect ( Collectors.toList () );
        System.out.println ( paseAmayuscula );
        //ejercicio2
        String concatenado = longitudMin ( lista, 4 );
        System.out.println (concatenado);


    }

    public static String longitudMin (List<String> lista, Integer longitud) {
        return lista.stream ().filter ( frase -> frase.length () > longitud ).collect( Collectors.joining (", "));

    }

}


