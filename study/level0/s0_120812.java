package study.level0;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class s0_120812 {
    public static void main(String[] args) {
        int[] array = {1,2,3,3,3,4};
        System.out.println(solution(array));
    }
    public static int solution(int[] array) {
        int answer = 0, max = 0, cnt=0;

        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0; i<array.length; i++){
            if(map.get(array[i]) != null){
                map.put(array[i],map.get(array[i])+1);
            }else{
               map.put(array[i],1);
            }
        }

        Iterator<Integer> keys = map.keySet().iterator();
        int ans = 0;
        while(keys.hasNext()){
            int val = keys.next();
            if(max < map.get(val)){
                max = map.get(val);
                ans = val;
                cnt=1;
            }else{
                if(max == map.get(val)){
                    cnt++;
                }
            }
        }

        answer = (cnt>1) ? -1:ans;

        return answer;
    }
}
