package com.develop;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.Stream;

public class StreamApp {

    public static void main(String[] args) throws Exception {
        Path p = Paths.get("stuff.txt");
        Stream<String> s = Files.lines(p);
        Stream<String[]> sm = s.map(line -> line.split("\\s+"));
        Stream<String> ssm = sm.flatMap(Arrays::stream);
        Stream<String> sssm = ssm.distinct(); // Stream<Stream<String>>
        sssm.forEach(System.out::println);
//        Object[] a = ssm.toArray();
//
//        System.out.println(a[0]);
//        System.out.println(((String[])a[0])[0]);
//        for (Object o : a) {
//            Stream<String> v = (Stream<String>)o;
//            Object[] ss = v.toArray();
//            for (Object os : ss) {
//                System.out.println(os);
//            }
//        }
//        Files.lines()
//        .map(line -> { System.out.println(line);line.split("\\s+"); }) // Stream<String[]>
//        .map(Arrays::stream) // Stream<Stream<String>>
//        .distinct() // Stream<Stream<String>>
//        .forEach(System.out::println);
    }

}
