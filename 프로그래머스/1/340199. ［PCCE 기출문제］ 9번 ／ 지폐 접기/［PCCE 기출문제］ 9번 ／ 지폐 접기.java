class Solution {
    public int solution(int[] wallet, int[] bill) {
        int answer = 0;
        
        while( !canFit(bill, wallet) ){
            bill[ bill[0] > bill[1] ? 0 : 1] /= 2;
            answer ++;
        }
        
        return answer;
    }
    
    private boolean canFit(int[] bill, int[] wallet) {
        return bill[0] <= wallet[0] && bill[1] <= wallet[1] || bill[0] <= wallet[1] && bill[1] <= wallet[0];
    }
}