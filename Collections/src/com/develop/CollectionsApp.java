package com.develop;

import java.util.*;

import static java.lang.System.out;
class One
{
    String name;
    One(String name) { this.name = name; }
    public boolean equals(Object other) {
        return this.name.equals(((One)other).name);
    }
    
    public int hashCode() {
        return name.hashCode();
    }
}

class OneComparator implements Comparator<One> {

    @Override
    public int compare(One o1, One o2) {
        return o1.name.compareTo(o2.name);
    }
    
}
public class CollectionsApp {

    public static void main(String[] args) {
        SortedSet<One> set = new TreeSet<One>(new OneComparator());
        
        set.add(new One("one"));
        set.add(new One("two"));
        set.add(new One("aaa"));
        
        for (One o : set) {
            out.println(o.name);
        }
    }

}

//Set<One> set = new HashSet<One>();
//
//set.add(new One("one"));
//set.add(new One("two"));
//set.add(new One("one"));
//
//for (One o : set) {
//    out.println(o.name);
//}