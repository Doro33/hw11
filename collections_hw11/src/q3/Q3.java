package q3;

import java.util.ArrayList;

public class Q3 {
    public static ArrayList<Integer> validate(ArrayList<Integer> input){
        if(input.size()%2==1)
            input.remove(input.size()-1);
        ArrayList<Integer> output= new ArrayList<>();
        for (int i = 0 ; i < input.size() ; i=i+2){
            if(input.get(i) <= input.get(i+1)){
                output.add(input.get(i));
                output.add(input.get(i+1));
            }
        }
        return output;
    }

    public static void main(String[] args) {
        ArrayList<Integer> input= new ArrayList<>();
        input.add(3);
        input.add(7);
        input.add(9);
        input.add(2);
        input.add(5);
        input.add(5);
        input.add(8);
        input.add(5);
        input.add(6);
        input.add(3);
        input.add(4);
        input.add(7);
        input.add(3);
        input.add(1);
        //odd size
        input.add(10);

        System.out.println(input);
        System.out.println(validate(input));
        System.out.println(validate(new ArrayList<>()));
    }
}