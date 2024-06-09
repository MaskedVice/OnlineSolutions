public class LC13_Roman2Integer {
    public int romanToInt(String s) {
        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == 'I'){
                ans+=1;
            }
            if(s.charAt(i) == 'V'){
                ans+=5;
            }
            if(s.charAt(i) == 'X'){
                ans+=10;
            }
            if(s.charAt(i) == 'L'){
                ans+=50;
            }
            if(s.charAt(i) == 'C'){
                ans+=100;
            }
            if(s.charAt(i) == 'D'){
                ans+=500;
            }
            if(s.charAt(i) == 'M'){
                ans+=1000;
            }

            if(i>0){
                if(s.charAt(i) == 'V' && s.charAt(i-1) == 'I'){
                    ans-=2;
                }
                else if (s.charAt(i) == 'X' && s.charAt(i-1) == 'I'){
                    ans-=2;
                }
                else if (s.charAt(i) == 'L' && s.charAt(i-1) == 'X'){
                    ans-=20;
                }
                else if (s.charAt(i) == 'C' && s.charAt(i-1) == 'X'){
                    ans-=20;
                }
                else if (s.charAt(i) == 'D' && s.charAt(i-1) == 'C'){
                    ans-=200;
                }
                else if (s.charAt(i) == 'M' && s.charAt(i-1) == 'C'){
                    ans-=200;
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        LC13_Roman2Integer obj = new LC13_Roman2Integer();
        String s = "MCMXCIV";
        System.out.println(obj.romanToInt(s));
    }
            
}
