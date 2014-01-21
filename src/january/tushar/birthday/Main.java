package january.tushar.birthday;

import org.jfugue.Pattern;
import org.jfugue.Player;

public class Main {
	public static void main(String[] args) {
		Player player =  new Player();
		Pattern pattern = new Pattern("Ci D C F Ew Ci D C G Fw Ci C6 A F E Dw Bb Bb A F G Fw");
		System.out.println("Happy Birthday to you Tushar.\nPlaying piano...");
		player.play(pattern);
		System.out.println(":-)");
		System.exit(0);
	}
}
