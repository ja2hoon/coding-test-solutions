class Solution {
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        
        int videoSec = stringToSeconds(video_len);
        int posSec = stringToSeconds(pos);
        int opStartSec = stringToSeconds(op_start);
        int opEndSec = stringToSeconds(op_end);
        
        posSec = skip(posSec, opStartSec, opEndSec);
        
        for(String cmd : commands) {
            if("prev".equals(cmd)) {
                posSec = Math.max(posSec - 10, 0);
            } else {
                posSec = Math.min(posSec + 10, videoSec);
            }
            posSec = skip(posSec, opStartSec, opEndSec);
        }
        
        return secondsToString(posSec);
    }
    
    /** 
    * 오프닝 건너뛰기 함수
    */
    private int skip(int pos, int start, int end) { 
        
        if(start <= pos && pos <= end){
           return end; 
        }
        return pos;        
    }
    
    /**
    * mm:ss 형식의 문자열을 int 타입 초로 변환하는 함수
    */
    private int stringToSeconds(String formattedTime) {
        
        String[] parts = formattedTime.split(":");
        int min = Integer.parseInt(parts[0]);
        int sec = Integer.parseInt(parts[1]);
        
        return min * 60 + sec;
    }
    
    /**
    * int 타입 초를 mm:ss 형식의 문자열로 변환하는 함수
    */
    private String secondsToString(int seconds) {
        
        int min = seconds / 60;
        int sec = seconds % 60;
        
        return String.format("%02d:%02d", min, sec);
    }
    
}