
public class MesoInherit extends MesoAbstract {
	
	//create String to reference to when finding average letter
	private String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	//create instance variable to store base average value in order to be used for all averages
	private int ave;
	//used to implement abstract member variable: station
	private String station;
	
	
	//use "this." statement to utilize mesoStation's getStID method
	public MesoInherit (MesoStation mesoStation) {
		
		this.station = mesoStation.getStID();
	}
	/**
	 * The idea behind the code was to be able to store values needed to compute each of
	 * the averages into 4 separate variable of type int and use these to compute the overall
	 * average value which would be of type double. In the end I'll be using this value (set to a 
	 * variable of type double) to calculate each average and put these averages into the final 
	 * int array.
	 * 
	 */
	@Override
	public int[] calAverage() {
		
		//create array of ints to store averages into to be returned at end
		int[] averages = new int[3];
		
		//create int variables to use for normal average value
		int a = alphabet.indexOf(station.charAt(0)) + 64;
		int b = alphabet.indexOf(station.charAt(1)) + 64;
		int c = alphabet.indexOf(station.charAt(2)) + 64;
		int d = alphabet.indexOf(station.charAt(3)) + 64;
		
		//create double value to store normal average value into
		double ave1 = (a + b + c + d)/4;
		//initialize int value to be utilized for letterAverage method
		ave = (int)(ave1 + 0.5);
		
		//set values to int array to be returned
		averages[0] = (int)(Math.ceil(ave1) + 2);
		averages[1] = (int)Math.round(ave1 + 0.5);
		averages[2] = (int)Math.round(ave1 + 2);
		
		
		//return int array
		return averages;
	}

	@Override
	public char letterAverage() {
		//goes into alphabet String to find the number that correlates to the average minus 63
		return alphabet.charAt(ave - 63);
		
	}
	
}
//Now I'm not saying T-Pain is the most influential artist of our generation. Pre-MAGA days I'd have given that to Mr. West, but he's been on this wacko thing lately. I digress.'
//I shall now make a list of who I believe to be the most influential artists of our generation:
// 1) Beyonce
// 2) Kanye West (Pre-MAGA hat wearing days)
// 3) Taylor Swift (Hate the player, not the game)
// 4) J. Cole (Greatest rapper in my book. Able to make efforts beyond the rap game to help shape the minds of youth everywhere
// 5) 6ix 9ine (Terrible, terrible, terrible artist all-around. However Tekashi taught the world what NOT to do if one is exposed to money and fame)
// 6) Frank Ocean (This man had everybody feeling Some Type Of Way long before the term came into existence and continues to grow and evolve his music into masterpiece's such as the song entitled 'Chanel')
// 7) Lil Wayne (In hindsight, I placed Dwayne way too late on this list)
// 8) Childish Gambino (I'm not sure how this multi-talented, jack-of-all-trades, actor-musician is able to convey messages in such a way that everybody can get on-board, but he does it. Ex: 'This Is America')
// 9) Drake (Because who hasn't been hurt and finds that the shoulder that fits oh-so-perfectly to cry on is none other than the 6 God himself)
// 10) Kendrick Lamar (Okay this was a big screw-up. Kendrick should have at least been numero dos on this list, but you can almost take this list and reverse it at this point. Kendrick gives new meaning to the term, GOAT. His long-awaited album 'DAMN' may well go down in history as one of the best albums of all-time.)