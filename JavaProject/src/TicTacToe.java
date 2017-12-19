/*
 * Peter Song
 * APCS
 * This program is a TicTacToe game.
 * Mr.Daniel
 * 11/23/2017
 */
import java.util.Scanner;
public class TicTacToe {
	private String[][] board;
	private static final int rows=3;
	private static final int cols=3;
	
	public TicTacToe() {
		board = new String[rows][cols];
		for(int i=0;i<board.length;i++) {
			for(int j=0;j<board[0].length;j++) {
				board[i][j]="";
			}
		}
	}
	
	public void makeMove(int r, int c, String symbole) {
		board[r][c]=symbole;
	}
	
	public boolean checkMove(int r, int c) {
		return this.board[r][c].equals("");
	}
	public boolean checkxWin() {
		boolean win=false;
		if(this.board[0][0].equals("x")&&this.board[0][1].equals("x")&&this.board[0][2].equals("x")) {
			win=true;
		}
		else if(this.board[1][0].equals("x")&&this.board[1][1].equals("x")&&this.board[1][2].equals("x")) {
			win=true;
		}
		else if(this.board[2][0].equals("x")&&this.board[2][1].equals("x")&&this.board[2][2].equals("x")) {
			win=true;
		}
		else if(this.board[0][0].equals("x")&&this.board[1][0].equals("x")&&this.board[2][0].equals("x")) {
			win=true;
		}
		else if(this.board[0][1].equals("x")&&this.board[1][1].equals("x")&&this.board[2][1].equals("x")) {
			win=true;
		}
		else if(this.board[0][2].equals("x")&&this.board[1][2].equals("x")&&this.board[2][2].equals("x")) {
			win=true;
		}
		else if(this.board[0][0].equals("x")&&this.board[1][1].equals("x")&&this.board[2][2].equals("x")) {
			win=true;
		}
		else if(this.board[2][0].equals("x")&&this.board[1][1].equals("x")&&this.board[2][0].equals("x")) {
			win=true;
		}
		return win;
	}
	public boolean checkoWin() {
		boolean win=false;
		if(this.board[0][0]=="o"&&this.board[0][1]=="o"&&this.board[0][2]=="o") {
			win=true;
		}
		else if(this.board[1][0]=="o"&&this.board[1][1]=="o"&&this.board[1][2]=="o") {
			win=true;
		}
		else if(this.board[2][0]=="o"&&this.board[2][1]=="o"&&this.board[2][2]=="o") {
			win=true;
		}
		else if(this.board[0][0]=="o"&&this.board[1][0]=="o"&&this.board[2][0]=="o") {
			win=true;
		}
		else if(this.board[0][1]=="o"&&this.board[1][1]=="o"&&this.board[2][1]=="o") {
			win=true;
		}
		else if(this.board[0][2]=="o"&&this.board[1][2]=="o"&&this.board[2][2]=="o") {
			win=true;
		}
		else if(this.board[0][0]=="o"&&this.board[1][1]=="o"&&this.board[2][2]=="o") {
			win=true;
		}
		else if(this.board[2][0]=="o"&&this.board[1][1]=="o"&&this.board[2][0]=="o") {
			win=true;
		}
		return win;
	}
	public String toString() {
		String s="";
		for(int i=0; i<board.length;i++) {
			s+="|";
			for(int j=0;j<board[0].length;j++) {
				if(!board[i][j].equals("")) {
				s+=board[i][j];
				}
				else {
					s+=" ";
				}
			}
			s+="|";
			s+="\n";
		}
		return s;
	}
	public boolean checkremain0() {
		int count=0;
			for(int j=0;j<this.board[0].length;j++) {
				if(this.board[0][j].equals("o")) {
					count++;
				}
			}
		
		if(count==2) {
			return true;
		}
		else return false;
	}
	public boolean checkremain00() {
		int count=0;
			for(int j=0;j<this.board.length;j++) {
				if(this.board[j][0].equals("o")) {
					count++;
				}
			}
		
		if(count==2) {
			return true;
		}
		else return false;
	}
	public boolean checkremain01() {
		int count=0;
			for(int j=0;j<this.board.length;j++) {
				if(this.board[j][1].equals("o")) {
					count++;
				}
			}
		
		if(count==2) {
			return true;
		}
		else return false;
	}
	public boolean checkremain02() {
		int count=0;
			for(int j=0;j<this.board.length;j++) {
				if(this.board[j][2].equals("o")) {
					count++;
				}
			}
		
		if(count==2) {
			return true;
		}
		else return false;
	}
	public boolean chackremain3() {
		int count=0;
		if(this.board[0][0]=="o") {
			count++;
		}
		if(this.board[1][1]=="o") {
			count++;
		}
		if(this.board[2][2]=="o") {
			count++;
		}
	
	if(count==2) {
		return true;
	}
	else return false;
	}
	public boolean chackremain4() {
		int count=0;
		if(this.board[0][2]=="o") {
			count++;
		}
		if(this.board[1][1]=="o") {
			count++;
		}
		if(this.board[2][0]=="o") {
			count++;
		}
	
	if(count==2) {
		return true;
	}
	else return false;
	}
	public boolean checkremain1() {
		int count=0;
			for(int j=0;j<this.board[0].length;j++) {
				if(this.board[1][j].equals("o")) {
					count++;
				}
			}
		
		if(count==2) {
			return true;
		}
		else return false;
	}
	public boolean checkremain2() {
		int count=0;
			for(int j=0;j<this.board[0].length;j++) {
				if(this.board[2][j].equals("o")) {
					count++;
				}
			}
		
		if(count==2) {
			return true;
		}
		else return false;
	}
	public boolean checkleftcorner() {
		if(this.board[0][0].equals("")||this.board[2][0].equals("")) {
			return true;
		}
		else return false;
	}
	public boolean checkrightcorner() {
		if(this.board[0][2].equals("")||this.board[2][2].equals("")) {
			return true;
		}
		else return false;
	}
	public boolean checkmiddle() {
		return this.board[1][1].equals("");
	}
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		TicTacToe game=new TicTacToe();
		int i=0;
		while(i<9) {
			boolean nil=false;
			int ca=(int)(Math.random()*3);
			 int cb= (int) (Math.random()*3);
			while(!nil) {
				if(game.checkmiddle()) {
					ca=1;
					cb=1;
				}
				else if(game.checkremain0()) {
					ca=0;
					cb=(int)(Math.random()*3);
				}
				else if(game.checkremain1()) {
					ca=1;
					cb=(int)(Math.random()*3);
				}
				else if(game.checkremain2()) {
					ca=2;
					cb=(int)(Math.random()*3);
				}
				else if(game.checkleftcorner()) {
					ca=(int)(Math.random()*3);
					while(ca%2==1) {
						ca=(int)(Math.random()*3);
					}
					cb=0;
				}
				else if(game.checkrightcorner()) {
					while(ca%2==1) {
						ca=(int)(Math.random()*3);
					}
					cb=2;
				}
				else {
		    ca=(int)(Math.random()*3);
		    cb=(int)(Math.random()*3);
				}
			nil=game.checkMove(ca, cb);			
			}
			game.makeMove(ca, cb, "x");
			i++;
			System.out.println(game.toString());
//			if(game.checkxWin()) {
//				System.out.println("Computer wins!");
//				break;
//			}
			if(i!=10) {
			System.out.print("It's o's turn.  ");
			System.out.print("Row: ");
			int a=input.nextInt();
			System.out.print("Col: ");
			int b=input.nextInt();
			game.makeMove(a,b,"o");
			System.out.println(game.toString());
			if(game.checkoWin()) {
				System.out.println("User wins!");
				break;
			}

			}
		}
		if((!game.checkoWin())&&(!game.checkxWin())) {
			System.out.println("Tie!");
		}
//		Scanner input= new Scanner(System.in);
//		TicTacToe game=new TicTacToe();
//		int i=0;
//		while(i<5) {
//			boolean nil=false;
//			int ca=(int)(Math.random()*3);
//			 int cb= (int) (Math.random()*3);
//			while(!nil) {
//				
//					System.out.print("It's o's turn.  ");
//					System.out.print("Row: ");
//					int a=input.nextInt();
//					System.out.print("Col: ");
//					int b=input.nextInt();
//					game.makeMove(a,b,"o");
//					System.out.println(game.toString());
//					if(game.checkoWin()) {
//						System.out.println("User wins!");
//						break;
//					}
//
//					if(i!=5) {
//				if(game.checkmiddle()) {
//					ca=1;
//					cb=1;
//				}
//				else if(game.checkremain0()) {
//					ca=0;
//					cb=(int)(Math.random()*3);
//				}
//				else if(game.checkremain00()) {
//					ca=(int)(Math.random()*3);
//					cb=0;
//				}
//				
//				else if(game.checkremain01()) {
//					ca=(int)(Math.random()*3);
//					cb=1;
//				}
//				else if(game.checkremain02()) {
//					ca=(int)(Math.random()*3);
//					cb=2;
//				}
//				else if(game.checkremain1()) {
//					ca=1;
//					cb=(int)(Math.random()*3);
//				}
//				else if(game.checkremain2()) {
//					ca=2;
//					cb=(int)(Math.random()*3);
//				}
//				else if(game.checkleftcorner()) {
//					ca=(int)(Math.random()*3);
//					while(ca%2==1) {
//						ca=(int)(Math.random()*3);
//					}
//					cb=0;
//				}
//				else if(game.checkrightcorner()) {
//					while(ca%2==1) {
//						ca=(int)(Math.random()*3);
//					}
//					cb=2;
//				}
//				else {
//		    ca=(int)(Math.random()*3);
//		    cb=(int)(Math.random()*3);
//				}
//			nil=game.checkMove(ca, cb);			
//			}
//			game.makeMove(ca, cb, "x");
//			i++;
//			System.out.println(game.toString());
//			}
////			if(game.checkxWin()) {
////				System.out.println("Computer wins!");
////				break;
////			}
//			
//			}
//		
//		if(!game.checkoWin()&&!game.checkxWin()) {
//			System.out.println("Tie!");
//		}
//		
//	}
	
}
}
