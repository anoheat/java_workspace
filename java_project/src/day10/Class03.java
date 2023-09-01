package day10;

import java.util.Scanner;

public class Class03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Tv tv = new Tv();
		

		while(true) {			
			while(!tv.isPower()) {
				System.out.println("리모컨");
				System.out.println("1 : 전원");
				System.out.println("2 : 나가기");
				int i = sc.nextInt();
				switch(i) {
				case 1:
					tv.start();break;
				case 2:
					return;
				default :
					System.out.println("잘못된 입력");
				}
			}			
			System.out.println("리모컨");
			System.out.println("1 : 전원");
			System.out.println("2 : 이전채널");
			System.out.println("3 : 다음채널");
			System.out.println("4 : 볼륨업");
			System.out.println("5 : 볼륨다운");
			System.out.println("6 : 음소거");
			int i = sc.nextInt();
			switch(i) {
			case 1:
				tv.start();break;
			case 2:
				tv.chnDown();break;
			case 3:
				tv.chnUp();break;
			case 4:
				tv.volUp();break;
			case 5:
				tv.volDown();break;
			case 6:
				tv.setVolume(0);
				tv.volPrint();
				break;
			default :
				System.out.println("잘못된 입력");					
			}
			
		}
	}

}

class Tv{
	private boolean power;
	private int channel,volume;
	
	void start() {
		power = (power ? false : true);
		System.out.println("전원이 " + (power ? "켜집니다." : "꺼집니다."));
	}
	
	void volUp() {
		if(power) {
			if(volume<100)volume += 1;
			volPrint();
		}
	}
	
	void volDown() {
		if(power) {
			if(volume>0)volume-=1;
			volPrint();
		}	
	}
	void volPrint() {
		if(power) {
			System.out.println("볼륨 "+volume);
		}
	}
	void chnPrint() {
		if(power) {
			System.out.println("채널 "+channel);
		}
	}
	void chnUp() {
		if(power) {
			if(channel<100)channel += 1;
			if(channel==100)channel = 0;
			chnPrint();
		}
	}
	void chnDown() {
		if(power) {
			if(channel>-1)channel -= 1;
			if(channel==-1)channel = 99;
			chnPrint();
		}
	}

	
	
	
	public boolean isPower() {
		return power;
	}

	public void setPower(boolean power) {
		this.power = power;
	}

	public int getChannel() {
		return channel;
	}

	public void setChannel(int channel) {
		this.channel = channel;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}
	
}	
	
	
	
	
	