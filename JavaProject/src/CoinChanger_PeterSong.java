
/*
 * Peter Song
 * Instructor: Mr.Daniel
 * APCS S3C7
 * This program allows people to change money into coins.
 * 10/11/2017
 */
public class CoinChanger_PeterSong {
	public static void coinChanger(double money1) {
		double money2=money1;
		int halfdoller=0;
		while(money2>50) {
			halfdoller++;
			money2-=50;
		}
		int quarter=0;
		while(money2>25) {
			quarter++;
			money2-=25;
		}
		int dime=0;
		while(money2>10) {
			dime++;
			money2-=10;
		}
		int nickel=0;
		while(money2>5) {
			nickel++;
			money2-=5;
		}
		System.out.println(halfdoller+" half dollar(s) ");
		System.out.println(quarter+" quarter dollar(s) ");
		System.out.println(dime+" dime dollar(s) ");
		System.out.println(nickel+" nickel dollar(s) ");
		System.out.println(money2+" pennies remain ");
	}
	public static int halfdoller(int money1) {
		int money2=money1;
		int halfdoller=0;
		while(money2>50) {
			halfdoller++;
			money2-=50;
		}
		return halfdoller;
	}
	public static int quarterdoller(int money1) {
		int money2=money1;
		money2=money2-CoinChanger_PeterSong.halfdoller(money1)*50;
		int quarterdoller=0;
		while(money2>25) {
			quarterdoller++;
			money2-=25;
		}
		return quarterdoller;
	}
	public static int dimedoller(int money1) {
		int money2=money1;
		money2=money2-CoinChanger_PeterSong.halfdoller(money1)*50-CoinChanger_PeterSong.quarterdoller(money1)*25;
		int dimedoller=0;
		while(money2>10) {
			dimedoller++;
			money2-=10;
		}
		return dimedoller;
	}
	public static int nickeldoller(int money1) {
		int money2=money1;
		money2=money2-CoinChanger_PeterSong.halfdoller(money1)*50-CoinChanger_PeterSong.quarterdoller(money1)*25-CoinChanger_PeterSong.dimedoller(money1)*10;
		int nickeldoller=0;
		while(money2>5) {
			nickeldoller++;
			money2-=5;
		}
		return nickeldoller;
	}
	public static int pennydoller(int money1) {
		int money2=money1;
		money2=money2-CoinChanger_PeterSong.halfdoller(money1)*50-CoinChanger_PeterSong.quarterdoller(money1)*25-CoinChanger_PeterSong.dimedoller(money1)*10-CoinChanger_PeterSong.nickeldoller(money1)*5;
		return money2;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CoinChanger_PeterSong.coinChanger(79);
		System.out.println(CoinChanger_PeterSong.halfdoller(79));
		System.out.println(CoinChanger_PeterSong.quarterdoller(79));
		System.out.println(CoinChanger_PeterSong.dimedoller(79));
		System.out.println(CoinChanger_PeterSong.nickeldoller(79));
	}

}
