package com.trainee;
public class Square extends Rectangle {

	public Square(int side) {
		super(side, side);
	}

	@Override
	public void setWidth(int width) {
		// TODO Auto-generated method stub
		setSide(width);
	}

	@Override
	public void setHeight(int height) {
		// TODO Auto-generated method stub
		setSide(height);
	}
	private void setSide(int side){
		super.setWidth(side);
		super.setHeight(side);
	}
}
