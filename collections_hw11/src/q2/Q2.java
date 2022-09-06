package q2;

import java.util.TreeSet;

public class Q2 {

    public static TreeSet<Character> union(TreeSet<Character> set1,TreeSet<Character> set2){
        TreeSet<Character> copySet1=new TreeSet<>();
        copySet1.addAll(set1);
        TreeSet<Character> copySet2=new TreeSet<>();
        copySet2.addAll(set2);
        copySet1.addAll(copySet2);
        return copySet1;
    }
    public static TreeSet<Character> intersection(TreeSet<Character> set1, TreeSet<Character> set2){
        TreeSet<Character> copySet1=new TreeSet<>();
        copySet1.addAll(set1);
        TreeSet<Character> copySet2=new TreeSet<>();
        copySet2.addAll(set2);
        copySet1.retainAll(copySet2);
        return copySet1;
    }
    public static void main(String[] args) {
        TreeSet<Character> set1 = new TreeSet<>();
        TreeSet<Character> set2 = new TreeSet<>();

        set1.add('a');
        set1.add('w');
        set1.add('j');
        set1.add('p');
        set1.add('q');
        set1.add('l');
        set1.add('m');
        set1.add('z');
        set1.add('k');
        set1.add('n');

        set2.add('c');
        set2.add('w');
        set2.add('f');
        set2.add('g');
        set2.add('a');
        set2.add('q');
        set2.add('o');
        set2.add('h');
        set2.add('v');
        set2.add('z');

        System.out.println("set1: " + set1);
        System.out.println("set2: " + set2);
        System.out.println("union: " + union(set1,set2));
        System.out.println("intersection: " + intersection(set1,set2));
    }
}