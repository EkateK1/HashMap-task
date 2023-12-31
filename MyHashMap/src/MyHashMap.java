import java.util.ArrayList;

import static java.lang.Math.abs;

public class MyHashMap<K, V>
{

    public final int size = 16;

    ArrayList <K> Keys= new ArrayList<>(size);
    ArrayList <V> Values= new ArrayList<>(size);

    K key;
    V value;

    public MyHashMap(){
        for (int i = 0; i < size; i++){
            Keys.add(null);
            Values.add(null);
        }
    }

    public void put(K key, V value){

        int index = abs(key.hashCode()%size);
        for (int i=index;i<size;i++){
            if (Keys.get(i)==null) {
                Keys.add(i,key);
                Values.add(i,value);
                break;
            } else if (Keys.get(i)==key) {
                Keys.set(i,key);
                Values.set(i,value);
                break;
            }
        }
    }

    public void remove(K key){
        if (Keys.contains(key)) {
            int index = Keys.indexOf(key);
            Keys.remove(index);
            Values.remove(index);
        } else{
            System.out.println("такой ключ не найден");
        }
    }

    public void print(){
        for (int i = 0; i < size; i++){
            System.out.println(Keys.get(i) + " " + Values.get(i));
        }
    }

    Getting getting = (key) -> (Values.get( key.hashCode()%size));

    IsIn isin = (key) -> (Keys.contains(key));

}
