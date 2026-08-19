class Solution {
    public int trap(int[] height) {
          int water=0;
        int rightside[]= new int[height.length];
        rightside[height.length-1]=height[height.length-1];
        int leftside[]= new int[height.length];
        leftside[0]=height[0];
        for(int i=1;i<height.length;i++){
          leftside[i]=Math.max(height[i],leftside[i-1]);
         
        }
        for(int i=height.length-2;i>=0;i--){
            rightside[i]=Math.max(height[i],rightside[i+1]);
        }
        for(int i=0;i<height.length;i++){
            int level=Math.min(rightside[i],leftside[i]);
            water += level-height[i];
        }
        return water;
        // public  void main(String[] args){
        //     int height[];
        //     trap(height);

         }
        
    
}