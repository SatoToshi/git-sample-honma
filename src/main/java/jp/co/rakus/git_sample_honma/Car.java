package jp.co.rakus.git_sample_honma;

/**
 * 車を表すドメイン
 * @author yuta.honma
 *
 */
public class Car {
	private int speed;
	private String bodyColor;
	
	/**
	 * スピードアップ
	 */
	public void run(){
		this.speed += 5;
	}
	
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public String getBodyColor() {
		return bodyColor;
	}
	public void setBodyColor(String bodyColor) {
		this.bodyColor = bodyColor;
	}
	
	
}
