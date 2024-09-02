public class LC1598CrawlerLogFolder {
    public int minOperations(String[] logs) {
        int i = 0;
        for(String s : logs){
            String[] curLog = s.split("/");
            switch(curLog[0]){
                case ".." :
                    if(i > 0)
                        i--;
                    break;
                case "." :
                    break;
                default :
                    i++;
            }
        }
        return i;
    }

    public static void main(String[] args) {
        LC1598CrawlerLogFolder lc = new LC1598CrawlerLogFolder();
        System.out.println(lc.minOperations(new String[]{"d1/","../","../","../"}));
    }
}
