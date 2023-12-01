public class Main {
    public static void main(String[] args) {

        MyHashMap<String,Integer> hashMap = new MyHashMap<>();
        hashMap.put("key1", 1);
        hashMap.put("key2",2);
        hashMap.put("key3", 3);
        System.out.println(hashMap.getting.get("key1"));
        System.out.println(hashMap.isin.in("key2"));
        hashMap.put("key3", 4);
        hashMap.print();
        System.out.println("______________________________");
        hashMap.remove("key3");
        hashMap.print();
        hashMap.put("key4", 4);
        System.out.println("______________________________");
        hashMap.print();
    }
}
