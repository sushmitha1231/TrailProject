package com.autoMobiles.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.autoMobiles.Dao.BikeDao;
import com.autoMobiles.entity.Bike;
@Service
public class BikeService {
	@Autowired
	BikeDao bd;
	public String setBike(Bike x) {
		return bd.setBike(x);
	}
	public String setBikeAll(List <Bike> x) {
		return bd.setBikeAll(x);
	}
	public List <Bike> getAll() {
		return bd.getAll();
	}
	public Bike getById( int id ) {
		return bd.getById(id);
	}

	public String deleteId( int id ) {
		return bd.deleteId(id);
	}
	public List <Bike> getByBrand( String b ) {
		
		 return bd.getByBrand(b);
	}
	public List <Bike> getByPrice( int b,int c ) {
		
		 return bd.getByPrice(b,c);
}
	public Bike getmini( ) {
		
		 return bd.getmini();
}
}
