package com.autoMobiles.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.autoMobiles.entity.Bike;

public interface BikeRepository extends JpaRepository<Bike, Integer> {

@Query(value="select * from  bike_details where brand like ?",nativeQuery = true)
	List<Bike> getByBrand(String b);


@Query(value="select * from  bike_details where price >  ? and price < ?",nativeQuery = true)
List<Bike> getByPrice(int b,int c);



@Query(value="select * from bike_details where price= (select min(price) from bike_details)",nativeQuery = true)
Bike getmini();







//@Query(value="select * from bike_details where price= (select max(price) from bike_details)",nativeQuery = true)
//Bike getmaxi();

}
