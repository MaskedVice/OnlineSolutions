public class LC2446 {
    public boolean haveConflict(String[] event1, String[] event2) {
        double s1 = Double.parseDouble(event1[0].replace(":", "."));
        double e1 = Double.parseDouble(event1[1].replace(":", "."));
        double s2 = Double.parseDouble(event2[0].replace(":", "."));
        double e2 = Double.parseDouble(event2[1].replace(":", "."));
        if(s1<=s2 && s2<=e1)
            return true;
        else if(s2<=s1 && s1<=e2)
            return true;
        return false;
    }
    public static void main(String[] args) {
        LC2446 a = new LC2446();
        a.haveConflict(new String[]{"08:27","15:55"}, new String[]{"08:21","08:23"});
    }
}
