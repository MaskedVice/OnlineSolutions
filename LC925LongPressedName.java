public class LC925LongPressedName {
    // public boolean isLongPressedName(String name, String typed) {
    //     int m = name.length();
    //     int n = typed.length();
    //     int i = 0,j = 0;
    //     while(i<m){
    //         if(j == n) return false;
    //         if(name.charAt(i) == typed.charAt(j)){
    //             i++;j++;
    //         } else {
    //             j++;
    //         }
    //     }
    //     return i == m;
    // }

    public boolean isLongPressedName(String name, String typed) {
        int m = name.length();
        int n = typed.length();
        int i = 0,j = 0;
        while(i<m){
            if(j == n) return false;
            if(name.charAt(i) == typed.charAt(j)){
                i++;j++;
            } else if(i > 0 && name.charAt(i-1) == typed.charAt(j)){
                j++;
            } else {
                return false;
            }
        }
        return i == m;
    }


    public boolean isLongPressedName1(String name, String typed) {
        int m = name.length(), n = typed.length(), i = 0, j = 0;
        while (i < m && j < n) {
            if (name.charAt(i) != typed.charAt(j)) {
                if (i == 0 || name.charAt(i - 1) != typed.charAt(j)) return false;
                j++;
            } else {
                i++; j++;
            }
        }
        return i == m;
    }

    public static void main(String[] args) {
        LC925LongPressedName obj = new LC925LongPressedName();
        String name = "saeed";
        String typed = "ssaaedd";
        System.out.println(obj.isLongPressedName(name,typed));
    }
}
