package com.example.demo.entitiy;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Student {
	
	@Id
    public String id;
	
    public String name;
    public String company;
    
}