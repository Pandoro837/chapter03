package com.javaex.ex03;

public class Rectangle {

//	필드
	private int width;
	private int height;
	
//	생성자
	public Rectangle() {
		
	}
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
//	겟터 셋터
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
//	메소드 일반
	
	@Override
	public boolean equals(Object obj) {
		
		if(this.width == ((Rectangle)obj).getWidth() &&
				this.height == ((Rectangle)obj).getHeight()) {
			return true;
		} else {
			return false;
		}
		
	}
	
	
	
	
}
