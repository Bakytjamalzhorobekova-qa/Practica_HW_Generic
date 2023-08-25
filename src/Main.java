import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        System.out.println("Key : Integer,Vlaue : String");
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"Akmaral");
        map.put(2,"Aida");
        map.put(3,"Aizirek");
        map.put(4,"Nurjigit");
        map.put(5,"Nurtegin");
        getMapMethod(map);
        System.out.println("==========================================================");
        System.out.println("Key : String,Value : String");
        Map<String,String> map1 = new HashMap<>();
        map1.put("1","Bakytzhamal");
        map1.put("2","Rysbek");
        map1.put("3","Nurtegin");
        getMapMethod(map1);
    }
    public  static<M> void getMapMethod(M arg){
        System.out.println(arg);
    }

}