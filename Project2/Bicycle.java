/*
 * @author Peter Song
 * APCS 
 * Mr. Daniel
 * 2/28/2018
 * This is a bicycle class that contains several functions.
 */
package test;

public class Bicycle {
	private int wheel=2;
	private boolean container;
	private int numofseat;
	private static int distance=0;
	private static int damage;
	
	public Bicycle() {
		container=false;
		numofseat=1;
	}
	
	public void run(int num) {
		if (checkdamage()) {		
		distance+=num;
		damage+=num/10;
		System.out.println("The bicycle run for "+distance+" miles. "+"Damage:"+damage);
		}		
	}
	
	public void clean() {
		
	 if(damage<3) {
			damage=0;
		}
	 else {
		damage-=3;
		System.out.println("Alleviate damage by cleaning. Damage:"+damage);
	 }
	}
	
	public void repair() {
		 if(damage<8) {
				damage=0;
			}
		 else {
			damage-=8;
			System.out.println("Alleviate damage by reparing. Damage:"+damage);
		 }
		} 
	
	public boolean checkdamage() {
		if(damage>20) {
			System.out.println("The bicycle cannot run anymore");
			return false;
		}
		else return true;
	}
	
	public int getNumberofSeat() {
		return numofseat;
	}
	
	public int seedamage() {
		return damage;
	}
	
	public void carryPerson() {
		if (numofseat>1&&checkdamage()) {		
			damage+=1;
			System.out.println("Gain damage by carrying a person. Damage:"+damage);
			}
		else {
			System.out.println("Need one more seat.");
		}
	}
	
	public void carryThings() {
		if (container&&checkdamage()) {		
			damage+=1;
			System.out.println("Gain damage by carrying things. Damage:"+damage);
			}	
		else {
			System.out.println("Need one more container.");
		}
	}
	
	public void installContainer() {
		container=true;
	}
	
	public void increaseSeat() {
		numofseat++;
	}
	
	public static void main(String[] args) {
    		Bicycle a = new Bicycle();
    		a.run(100);
    		a.carryPerson();
    		a.carryThings();
    		a.increaseSeat();
    		a.installContainer();
    		a.carryPerson();
    		a.carryThings();
    		a.getNumberofSeat();
    		a.seedamage();
    		a.clean();
    		a.repair();
    		a.repair();
    		System.out.println("Damage: "+a.seedamage());		      
    }  
	
}
