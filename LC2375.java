public class LC2375 {
    
    public static void main(String[] args) {
        LC2375 k = new LC2375();
       System.out.println(k.smallestNumber("IIIDIDDD"));
    }
    public boolean finished = false;
    public String smallestNumber(String pattern) {
        int length = pattern.length();
        int[] a = new int[pattern.length()+2];
        String[]s = new String[1];
        BackTrack(a,0,pattern.length()+1,s,pattern);
        return s[0];
    }

    private void BackTrack(int[] a, int k, int length,String[] s, String pattern) {
        int[] c = new int[pattern.length()+2];
        int[] nc = new int[]{0};

        if(isSolution(k,length))
        {
            processSolution(a,k,length,s);
            return;
        }
        else{
            
            k++;
            constructCandidates(a,k,length,c,nc,pattern);

            for (int i = 0; i < nc[0]; i++) {
                a[k] = c[i];
                if(finished)return;
                BackTrack(a, k, length,s, pattern);
            }
        }
    }

    private void constructCandidates(int[] a, int k, int length, int[] c, int[] nc, String pattern) {
        boolean[] isUsed = new  boolean[pattern.length()+2];
        for (int i = 0; i < isUsed.length; i++) {
            isUsed[i] = false;
        }
        for (int i = 1; i < k; i++) {
            isUsed[a[i]] = true;
        }
        nc[0] = 0;
        
        if(k<pattern.length() && pattern.charAt(k-1) == 'I' )
        {
            for (int j = 1; j < isUsed.length; j++) {
                if(!isUsed[j])
                {
                    c[nc[0]++] = j;
                }
            }
        }
        else{
            int i = k;
            while(i< pattern.length()+1 && pattern.charAt(i-1) =='D')
            {
                i++;
            }
            while(isUsed[i])
            {
                i--;
            }
            c[0] = i;
            isUsed[i] = true;
            nc[0] = 1;
        }
       

    }

    private void processSolution(int[] a, int k, int length, String[] s) {
        StringBuilder ss = new StringBuilder();
        for (int i = 1; i < a.length; i++) {
            ss.append(a[i]);
        }
        finished = true;
        s[0] = ss.toString();
    }

    private boolean isSolution(int k, int length) {
        return k == length;
    }
}
