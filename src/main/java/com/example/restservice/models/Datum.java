package com.example.restservice.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "datumi")
public class Datum implements Serializable {
 
    private static final long serialVersionUID = -2343243243242432341L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    
    @Column (name = "datum")
    private String datum;
    
	protected Datum() {
	}
 
	public Datum(String datum) {
        this.datum = datum;
	
	}
}