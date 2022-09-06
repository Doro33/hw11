package q4;

import java.util.ArrayList;

public class CustomHashMap {
    private ArrayList<Object> keys = new ArrayList<>();
    private ArrayList<Object> values = new ArrayList<>();
    public void put(Object key, Object values){
        if (!containsKey(key)) {
            keys.add(key);
            this.values.add(values);
        }
        else System.out.println("key "+key+ " has already been made.");
    }
    public boolean containsKey(Object key){
        return keys.contains(key);
    }
    public boolean isEmpty(){
        return keys.isEmpty();
    }

    public ArrayList<Object> values(){
        return values;
    }

    public void replace(Object key, Object newValues){
        if(containsKey(key)){
            int index = keys.indexOf(key);
            values.set(index,newValues);
        }
    }
    @Override
    public String toString(){
        String output="";
        for (int i = 0 ;i<keys.size();i++)
            output+= "key: " + keys.get(i).toString()+" values:"+values.get(i).toString()+'\n';
        return output;
    }
}