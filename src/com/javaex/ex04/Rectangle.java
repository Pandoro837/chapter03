package com.javaex.ex04;

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
	public int area() {
		return this.width * this.height;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if(this.area() == ((Rectangle)obj).area()) {
			return true;
		} else {
			return false;
		}
		
	}
	
	
	
	
}
