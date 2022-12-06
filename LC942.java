public class LC942 {
    public int[] diStringMatch(String s) {
        int[] sampleSpace = new int[s.length()+1],ans = new int[s.length()+1];
        for (int j = 0; j < sampleSpace.length; j++) {
            sampleSpace[j] = j;
        }
        int i = 0 , j = s.length(),k = 0;

        while(k<s.length())
        {
            if(s.charAt(k) == 'D')
            {
                ans[k++] = sampleSpace[j--]; 
            }
            else{
                ans[k++] = sampleSpace[i++];
            }
        }
        while(i<=j)
        {
            ans[k++] = sampleSpace[i++];
        }
        return ans;
    }

    public static void main(String[] args) {
        LC942 a = new LC942();
        a.diStringMatch("DDI");
    }
}
