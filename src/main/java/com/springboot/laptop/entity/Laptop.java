package com.springboot.laptop.entity;
import lombok.Data;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.Table;


@Data
@Table(name="t_laptop")
@Entity
public class Laptop {

    @Id
    private Long LaptopId;
    @Column
    private String LaptopName;
    @Column
    private String UserId;
}
