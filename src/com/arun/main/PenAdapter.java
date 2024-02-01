package com.arun.main;

import com.arun.friend.InkPen;

public class PenAdapter implements Pen{

	InkPen ip=new InkPen();
	@Override
	public void write(String str) {
		
		ip.mark(str);
		
	}

}
