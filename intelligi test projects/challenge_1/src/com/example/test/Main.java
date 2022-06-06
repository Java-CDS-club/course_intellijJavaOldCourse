package com.example.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args)
    {
       Function<String , String> lambdaFunction =  s->{
            StringBuilder returnVal = new StringBuilder();
            for (int i = 0; i < s.length(); i++) {
                if (i % 2 == 1) {
                    returnVal.append(s.charAt(i));
                }
            }

            return returnVal.toString();
        };
        System.out.println(everySecondCharacter(lambdaFunction , "1234567890"));
        //Supplier<String> iLoveJava = ()->"I love Java!";
        Supplier<String> iLoveJava = ()-> {
            return "I love Java!";
        };
        String supplierResut = iLoveJava.get();
        System.out.println(supplierResut);
        List<String> topNames2015 = Arrays.asList(
                "Amelia",
                "Olivia",
                "emily",
                "Isla",
                "Ava",
                "oliver",
                "Jack",
                "Charlie",
                "harry",
                "Jacob"
        );
        List<String> firstUpperCaseList = new ArrayList<>();
       // topNames2015.forEach(name-> firstUpperCaseList.add(name.substring(0,1).toUpperCase()+name.substring(1)));
        topNames2015.stream().map(name->name.substring(0 , 1).toUpperCase()+name.substring(1)).sorted(String::compareTo).forEach(System.out::println);
        long namesBeginingWithA = topNames2015.stream().map(name->name.substring(0,1).toUpperCase()+name.substring(1)).filter(name->name.startsWith("A")).count();
        System.out.println("Number of names begining with A is :"+namesBeginingWithA);
        topNames2015.stream().map(name->name.substring(0 , 1).toUpperCase()+name.substring(1)).peek(System.out::println).sorted(String::compareTo).collect(Collectors.toList());



    }
    public static String everySecondCharacter(Function<String , String> func , String source)
    {
        return func.apply(source);
    }

}
