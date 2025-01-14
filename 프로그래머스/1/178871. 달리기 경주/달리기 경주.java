import java.util.HashMap;
import java.util.stream.IntStream;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        
        HashMap<String,Integer> indexMap = new HashMap<>();
        IntStream.range(0, players.length)
            .forEach(i -> indexMap.put(players[i], i));
        
        for (String name : callings) {
            int index = indexMap.get(name);
            
            players[index] = players[index - 1];
            players[index - 1] = name;
            
            indexMap.put(players[index], index);
            indexMap.put(players[index-1], index-1);
        }
        
        return players;
    }

}