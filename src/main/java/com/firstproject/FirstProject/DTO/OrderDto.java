package com.firstproject.FirstProject.DTO;

import com.firstproject.FirstProject.Entity.User;
import lombok.Data;

@Data
public class OrderDto {
    private User user;
    private String name;
    private Float price;
    private int quantity;
}
