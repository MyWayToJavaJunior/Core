package towersOfHanoi;

public class Towers {
	public  void doTowers(int topN, char from, char inter, char to) {
		
		if(topN==1)
			System.out.println("Disk 1 from " + from + " to "+ to);
		else {
			doTowers(topN-1, from, to, inter); // from-->inter
			System.out.println("Disk " + topN +
			" from " + from + " to "+ to);
			doTowers(topN-1, inter, from, to); // inter-->to
		}
	}

}
