class Solution {
    public int maxArea(int[] height) {
        int totalNum = height.length;
        int tmp = 0;

        if ((totalNum == 0) && (totalNum == 1))
            return 0;

        for (int x=0; x<totalNum-1; x++){
            //int a = height[x];
            for (int y=x+1; y<totalNum; y++){
                int length = y-x;
                if((length * (height[x]<height[y]?height[x]:height[y])) > tmp)
                    tmp = (length * (height[x]<height[y]?height[x]:height[y]));             
            }
        }

        return tmp;
    }
}
