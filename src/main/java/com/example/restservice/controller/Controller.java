package com.example.restservice.controller;

import java.sql.Date;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import java.util.List;

import com.example.restservice.models.Datum;
import com.example.restservice.models.DatumClass;
import com.example.restservice.models.Sporocilo;
import com.example.restservice.repository.RepositoryDatumov;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import jdk.jfr.internal.Repository;

@RestController
public class Controller {


	@Autowired
	RepositoryDatumov repository;


	//endpoint ki vrne pozdrav "Hello, world" : http://localhost:8080/pozdrav
	@GetMapping("/pozdrav")
	public Sporocilo Pozdrav() {
		return new Sporocilo(1, "Hello, world");
	}

	//endpoint, ki shrani vnesen datum v podatkovno bazo in vrne odgovor "Shranjen datum 'xx-xx-xxxx'." : http://localhost:8080/datum{"datum": "xx.xx.xxxx"}
	@PostMapping("/datum")
	public Sporocilo DodajDatum(@RequestBody DatumClass datum){

		repository.save(new Datum(datum.getDatum()));

		return new Sporocilo(2 , "Shranjen datum '" + datum.getDatum() + "'.");
	}


}
