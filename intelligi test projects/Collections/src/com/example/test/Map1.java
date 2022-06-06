package com.example.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Map1
{
    public static void main(String[] args)
    {
        Map<String , String> languages = new HashMap<>();
        languages.put("Java" , "a compiled high leve , objected oriented , platform independent language");
        languages.put("Python" ,"an interpreted , object oriented , high level level programming language with dynamic semantics" );
        languages.put("Algol", "an algorithmic language");
        System.out.println(languages.put("Basic" , "Beginners all purposes Symbolic Instruction Code"));
        System.out.println(languages.put("Lisp", "Therein lies madness"));

        if (languages.containsKey("Java"))
        {
            System.out.println("Java is already there ");
        }

        System.out.println(languages.put("Java", "this course is about Java")) ;
        System.out.println(languages.get("Java"));

        System.out.println("===========================================");
        //languages.remove("Lisp");
        if (languages.remove("Algol" ,"a family of algorithmic languages"))
        {
            System.out.println("Algol removes ");
        }
        else
        {
            System.out.println("Algol not removed , key value pair not found");
        }
        if (languages.replace("Lisp","this will not work", " a functional programming language with imperative features "))
            System.out.println("Lisp replaced");
        else
            System.out.println("Lisp wasn't replaced");
        System.out.println(languages.replace("Scala", "this will not be added"));
        for (String key : languages.keySet())
        {
            System.out.println(key + ": "+languages.get(key));
        }
    }
}
