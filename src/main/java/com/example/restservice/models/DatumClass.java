package com.example.restservice.models;

public class DatumClass {
	private String datum;

	protected DatumClass() {
	}


	public DatumClass(String datum) {
		this.datum = datum;
	}

	public String getDatum(){
		return datum;
	}


}
