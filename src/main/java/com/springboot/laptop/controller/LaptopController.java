package com.springboot.laptop.controller;
import com.springboot.laptop.entity.Laptop;
import com.springboot.laptop.service.LaptopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RequestMapping("/laptop")
@RestController
public class LaptopController {

    @Autowired
    public LaptopService laptopService;

    @PostMapping()
    public ResponseEntity<Laptop> SaveLaptop(@RequestBody Laptop laptop){
        Laptop newLaptop = laptopService.SaveLaptopDetails(laptop);
        return new ResponseEntity<>(newLaptop, HttpStatus.OK);
    }

    @GetMapping("/{laptopId}")
    public ResponseEntity<Laptop> GetLaptop(@PathVariable ("laptopId") Long laptopId){
        Laptop newLaptop = laptopService.GetOneLaptop(laptopId);
        return new ResponseEntity<>(newLaptop, HttpStatus.OK);
    }

    @GetMapping("/user/{userId}")
    public ResponseEntity<List<Laptop>> GetLaptopByUserId(@PathVariable ("userId") String userId){
        List<Laptop> newLaptop = laptopService.GetByUserId(userId);
        return new ResponseEntity<>(newLaptop, HttpStatus.OK);
    }



}
