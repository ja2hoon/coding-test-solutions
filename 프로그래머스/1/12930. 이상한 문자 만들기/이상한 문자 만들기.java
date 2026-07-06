class Solution {
    public String solution(String s) {
        
        char[] arr = s.toCharArray();
        int wordIdx = 0;
        
        for (int i = 0; i < arr.length; i ++) {
            // 문자가 공백이면 wordIdx 초기화
            if (arr[i] == ' ') {
                wordIdx = 0;
            } else {
                if (wordIdx % 2 == 0) {
                    arr[i] = Character.toUpperCase(arr[i]);
                } else {
                    arr[i] = Character.toLowerCase(arr[i]);
                }
                wordIdx ++;
            }
        }
        
        return new String(arr);
    }
}