public class LC2423 {
    public boolean equalFrequency(String word) {
        int[] data = new int[26];
        for (char c: word.toCharArray()) data[c -'a']++;
        for (int i = 0; i < 26; i++){
            data[i]--;
            if (isEqual(data)) return true;
            data[i]++;
        }
        return false;
    }
    private boolean isEqual(int[] data){
        int lastCount = 0;
        for (int count: data){
            if (count == 0) continue;
            if (lastCount != 0 && count != lastCount) return false;
            lastCount = count;
        }
        return true;
    }
    public static void main(String[] args) {
        LC2423 a = new LC2423();
       System.out.println(a.equalFrequency("aazz"));
    }
}
