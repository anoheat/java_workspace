package day10;

public class CardMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CardPack cp = new CardPack();
		for(int i=0;i<cp.getPack().length;i++) {
		cp.getPack()[i].print();
		if((i+1)%13==0) {System.out.println();}
		}
		
		cp.shuffle();
		System.out.println("=======");
		for(int i=0;i<cp.getPack().length;i++) {
			cp.getPack()[i].print();
			if((i+1)%13==0) {System.out.println();}
		}
		System.out.println("==========");
		for(int i=1;i<53;i++) {
		cp.pick().print();
		}
		Card tmp = cp.pick();
		
	}
		
	}
	


