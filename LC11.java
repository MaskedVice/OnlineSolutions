public class LC11 {
    public int maxArea(int[] height) {
        int l = 0;
        int r = height.length-1;
        int area=0;
        while(l<r)
        {
            int y = Math.min(height[l], height[r]);
            int x = r-l;
            area = Math.max(area, x*y);
            if(height[l]>height[r])
            {
                r--;
            }
            else
            {
                l++;
            }
        }
        return area;
    }

    public static void main(String[] args) {
        LC11 a = new LC11();
        System.out.println(a.maxArea(new int[]{1,8,6,2,5,4,8,3,7}));
    }
}
