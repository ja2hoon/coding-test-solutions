class Solution {
    public int solution(int[] common) {
        
        int x = common[1] - common[0];
        int y = common[2] - common[1];
        
        if(x == y){
            return common[common.length-1] + x;
        } else {
            return common[common.length-1] * common[1] / common[0];
        }
        
    }
    
}