package com.autoMobiles.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.autoMobiles.entity.Bike;
import com.autoMobiles.service.BikeService;

@RestController
public class BikeController {
	@Autowired
	BikeService bs;
	@PostMapping("/setBike")
	public String setBike(@RequestBody  Bike b) {
		return bs.setBike(b);
	}
	@PostMapping ("/setAllBike")
	public String setBikeAll(@RequestBody List <Bike> b) {
		return bs.setBikeAll(b);
	}
	@GetMapping ("/getAll")
	public List <Bike> getAll() {
		return bs.getAll();
	}
	
	@GetMapping ("/getId/{id}")
	public Bike getById(@PathVariable int id ) {
		return bs.getById(id);
	}
	@GetMapping("/deleteId/{id}")
	
	public String deleteId(@PathVariable int id ) {
		return bs.deleteId(id);
	}
	@GetMapping ("/getBrand/{b}")
	public List <Bike> getByBrand(@PathVariable String b ) {
		
		 return bs.getByBrand(b);
	

	}
	@GetMapping ("/getAllByPrice/{b}/{c}")
	public List <Bike> getByPrice(@PathVariable int b, @PathVariable int c) {
		
		 return bs.getByPrice(b,c);
}
	@GetMapping ("/getMin")
	public Bike getmini() {
		
		 return bs.getmini();
}
	

}
