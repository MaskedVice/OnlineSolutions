public class HR_DrawingBook {
    public static int pageCount(int n, int p) {
        // Write your code here
        int start = 0;
        int end = n;
        int startFlips = 0;
        int endFLips = 0;

        while(start<=n){
            if(start + 1 == p || start == p){
                break;
            }
            start+=2;
            startFlips++;    
        }
        if(n%2 == 0){
            end++;
        }
        while(end>0){
            if(end == p || end - 1 ==p){
                break;
            }
            end-=2;
            endFLips++;
        }
        return endFLips > startFlips ? startFlips : endFLips;
    }
    public static void main(String[] args) {
        System.out.println(pageCount(6, 5));
    }
}
