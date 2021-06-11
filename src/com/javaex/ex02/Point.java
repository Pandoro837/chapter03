package com.javaex.ex02;

public class Point {
//	필드
	private int x;
	private int y;
//	생성자
	public Point() {
	
	}
	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
//	겟터셋터
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
//	메소드 일반
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	@Override
	public boolean equals(Object obj) {
		
		if(this.x == ((Point)obj).x && this.y == ((Point)obj).y) {
			return true;
		} else {
			return false;
		}
		
//		Point p = ((Point)obj);
//		
//		if(this.x == p.x && this.y == p.y) {
//			return true;
//		} else {
//			return false;
//		}
		
	}

	
	
}
