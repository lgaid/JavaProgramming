package day40_collections;

import java.util.Map;
import java.util.TreeMap;

public class MapMethods {

    public static void main(String[] args) {


        Map<String,String> map = new TreeMap<>();
        map.put("C02", "Josh");
        map.put("B03","Nora");
        map.put("A02","Khashayar");
        map.put("D02","Abidullah");
        map.put("A03","Tatiana");
        map.put("A04","Tatiana");
        map.put("A05","Tatiana");
        map.put("A06","Tatiana");
        map.put("A07","Tatiana");

        System.out.println(map.size());

        map.put("A04", "Lucy");
        map.put("A06","Madayar");

        System.out.println(map);

        System.out.println(map.get("B03"));

        map.replace("C02", "Aseel");
        map.replace("A07", "Marika");

        System.out.println(map);


        map.remove("A05");

        System.out.println(map);


        System.out.println(map.containsKey("B03"));
        System.out.println( map.containsKey("H98"));

        System.out.println(map.containsValue("Lucy"));
        System.out.println(map.containsValue("Muhtar"));

        System.out.println(map.isEmpty());
        System.out.println(map.equals(map));

        map.clear();

        System.out.println(map);










    }

}
/*
           put(): inserts the key and value as a pair to the map
         size(): returns thw size (total number of pairs) of the map
         get(key): returns the value of the given key from the map
          replace(key, new value): replaces the value of the given key
          remove(key): removes the given key, and it's value from the map
          contains(key): checks if the given key  is contained in the map, returns boolean
          containsValue(value): checks if the value is contained in the map, return boolean
          isEmpty(): checks if the map is empty
          equals(MapObject): checks if the map is equal to the given map in the argument, returns boolean
          clear(): removes all keys and values from the map, size will be set to 0

 */
