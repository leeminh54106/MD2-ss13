import java.util.HashMap;
import java.util.Map;

public class bt2 {
    public static void main(String[] args) {
        //Tim phan tu duy nhat
        int[] mang ={8,8,8,0,34,0,6,5,4,8,5};
        Map<Integer,Integer> list = new HashMap<>();

        for (int x : mang){
            if(list.containsKey(x)){
                list.remove(x);
            }else {
                list.put(x,1);
            }
        }
        System.out.println(list);
    }
}
