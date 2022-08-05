
import java.util.HashMap;
import java.util.Map.Entry;

public class CountElements {
    public static void count(int ar[]){

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0;i<ar.length;i++){
            int count = map.getOrDefault(ar[i], 0);
            map.put(ar[i],count+1);
        }
        System.out.println(map);

        //for each loop using Entry and entrySet()

        for(Entry<Integer,Integer> entry : map.entrySet()){
            System.out.println(entry.getKey()+" --> " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        int ar[] = {2,6,7,6,12,6,3,2};
        count(ar);
    }
}
