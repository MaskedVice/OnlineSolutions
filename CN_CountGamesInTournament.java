public class CN_CountGamesInTournament {
    public static int totalMatches(int n) {
		// Write your code here.
		int i = 0;
		i = countGames(i,n);
        return i;
	}

	private static int countGames(int i, int n){
		if(n == 1) return i;
		if(n %2 != 0){
			i++;
			n--;
		}
		return countGames(i + n/2, n/2);
	}

    public static void main(String[] args) {
        int n = 9;
        System.out.println(totalMatches(n));
    }
}
