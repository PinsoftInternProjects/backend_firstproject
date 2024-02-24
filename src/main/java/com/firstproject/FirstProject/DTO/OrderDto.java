package com.firstproject.FirstProject.DTO;

import com.firstproject.FirstProject.Entity.User;
import lombok.Data;

@Data
public class OrderDto {
    private Long userId;
    private String name;
    private Float price;
    private int quantity;
}
