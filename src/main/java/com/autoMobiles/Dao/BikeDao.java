package com.autoMobiles.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.autoMobiles.entity.Bike;
import com.autoMobiles.repository.BikeRepository;

@Repository
public class BikeDao {
	@Autowired
	BikeRepository br;

	public String setBike(Bike r) {
		br.save(r);
		return "SAVED";
	}

	public String setBikeAll(List<Bike> r) {
		br.saveAll(r);
		return "Successfull";
	}

	public List<Bike> getAll() {
		return br.findAll();
	}

	public Bike getById(int id) {
		return br.findById(id).get();
	}

	public String deleteId(int id) {
		br.deleteById(id);
		return "DELETED";
	}

	public List<Bike> getByBrand(String b) {

		return br.getByBrand(b);
	}

	public List<Bike> getByPrice(int b, int c) {

		return br.getByPrice(b,c);
	}
	public  Bike getmini( ) {
		
		 return br.getmini();
}
}
