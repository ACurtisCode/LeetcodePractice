import java.util.*;

public class Winners {
    public Winners() {
    }

    public List<List<Integer>> findWinners(int[][] matches) {
        Map<Integer, Integer> losses = new HashMap<>();
        Set<Integer> winners = new HashSet<>();
        List<List<Integer>> results = new ArrayList<>();


        for(int[] match: matches) {
            losses.put(match[1], losses.getOrDefault(match[1], 0) + 1);
        }
        for(int[] match: matches) {
            if(!losses.containsKey(match[0])) {
                winners.add(match[0]);
            }
        }
        List<Integer> win = new ArrayList<>(winners);
        Collections.sort(win);
        results.add(win);

        List<Integer> lose = new ArrayList<>();
        for(int loss: losses.keySet()) {
            if(losses.get(loss) == 1){
                lose.add(loss);
            }
        }
        Collections.sort(lose);
        results.add(lose);
        return results;

    }
}
