package Test;

import java.util.HashSet;


public class Hashset{
    public static void main(String[] args) {
        HashSet<Integer> add = new HashSet<>();
        add.add(1);
        add.add(new Integer(2));
        add.add(new Integer(2));
        System.out.println(add);
    }
}
