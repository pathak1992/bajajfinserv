package com.example.demo.pojos;

import java.util.Arrays;

public class Details {
	String[] data;

	public Details() {
		super();
	}

	public Details(String[] data) {
		super();
		this.data = data;
	}

	public String[] getData() {
		return data;
	}

	public void setData(String[] data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "Details [data=" + Arrays.toString(data) + "]";
	}
	
}
