
package com.example.restservice.repository;

import java.util.List;
import com.example.restservice.models.Datum;
import com.example.restservice.models.DatumClass;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryDatumov extends CrudRepository<Datum, Long>{
}