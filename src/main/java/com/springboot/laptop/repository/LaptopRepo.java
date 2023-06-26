package com.springboot.laptop.repository;

import com.springboot.laptop.entity.Laptop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface LaptopRepo extends JpaRepository<Laptop, Long> {

  List<Laptop> findByUserId(String userId);
}
