package com.springboot.laptop.service;

import com.springboot.laptop.entity.Laptop;
import com.springboot.laptop.repository.LaptopRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LaptopServiceImpl implements LaptopService{

    @Autowired
    public LaptopRepo laptopRepo;

    @Override
    public Laptop SaveLaptopDetails(Laptop laptops) {
       return laptopRepo.save(laptops);
    }

    @Override
    public Laptop GetOneLaptop(Long laptopId) {
       return laptopRepo.findById(laptopId).get();
    }

//    @Override
//    public List<Laptop> GetByUserId(String userId) {
//        List<Laptop> laptop =  laptopRepo.findByUserId(userId);
//        return laptop;
//    }


}
