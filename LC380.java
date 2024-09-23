import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.List;

public class LC380 {
    class RandomizedSet {
        List<Integer> list;
        Map<Integer,Integer> map;
        Random r;
        int size;
        public RandomizedSet() {
            this.list = new ArrayList<>();
            this.map = new HashMap<>();
            this.r = new Random();
            this.size = 0;
        }
        
        public boolean insert(int val) {
            if(!map.containsKey(val)){
                return false;
            }
            map.put(val, list.size());
            list.add(val);
            size++;
            return true;
            
        }
        
        public boolean remove(int val) {
            if(!map.containsKey(val)){
                return false;
            }
            int index = map.get(val);
            int last = list.get(size-1);
            list.set(index, last);
            map.put(last, index);
            list.remove(size-1);
            map.remove(val);
            size--;
            return true;
            
        }
        
        public int getRandom() {
            return list.get(r.nextInt(size));
            
        }
    }
    
    /**
     * Your RandomizedSet object will be instantiated and called as such:
     * RandomizedSet obj = new RandomizedSet();
     * boolean param_1 = obj.insert(val);
     * boolean param_2 = obj.remove(val);
     * int param_3 = obj.getRandom();
     */
}
