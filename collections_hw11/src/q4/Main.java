package q4;

public class Main {
    public static void main(String[] args) {
        CustomHashMap test = new CustomHashMap();
        CustomHashMap test1 = new CustomHashMap();
        test.put(1,11);
        test.put(2,22);
        test.put(3,33);
        System.out.println(test);
        System.out.println("do we have key 1 :"+ test.containsKey(1));
        System.out.println("do we have key 4 :"+ test.containsKey(4));
        System.out.println();

        System.out.println("is test empty: " + test.isEmpty());
        System.out.println("is test1 empty: " +test1.isEmpty());
        System.out.println();

        System.out.println("values: " + test.values());
        System.out.println();
        System.out.println("replace value of key 2.");
        test.replace(2,44);
        System.out.println(test);
    }
}
