import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class LC981TimeBasedKey_ValueStore {

        private Map<String,TreeMap<Integer,String>> map;
    
        /** Initialize your data structure here. */
        public LC981TimeBasedKey_ValueStore() {
            map = new HashMap<>();
        }
    
        public void set(String key, String value, int timestamp) {
            if(!map.containsKey(key)) {
                map.put(key,new TreeMap<>());
            }
            map.get(key).put(timestamp,value);
        }
    
        public String get(String key, int timestamp) {
            TreeMap<Integer,String> treeMap = map.get(key);
            if(treeMap==null) {
                return "";
            }
            Integer floor = treeMap.floorKey(timestamp);
            if(floor==null) {
                return "";
            }
            return treeMap.get(floor);
        }
    public static void main(String[] args) {
        LC981TimeBasedKey_ValueStore s = new LC981TimeBasedKey_ValueStore();
        s.set("foo", "bar", 1);
        
        System.out.println(s.get("foo",1));
        System.out.println(s.get("foo",3));

        s.set("foo","bar2",4);

        System.out.println(s.get("foo",4));
        System.out.println(s.get("foo",4));


    }
}
