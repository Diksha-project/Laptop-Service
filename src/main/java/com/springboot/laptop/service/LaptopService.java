package com.springboot.laptop.service;


import com.springboot.laptop.entity.Laptop;

import java.util.List;

public interface LaptopService {

   Laptop SaveLaptopDetails(Laptop laptop) ;

   Laptop GetOneLaptop(Long laptopId);


//   List<Laptop> GetByUserId(String userId);
}
