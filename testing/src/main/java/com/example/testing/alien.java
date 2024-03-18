package com.example.testing;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;



@Entity
@Table

public class alien {
    @Id
    @GeneratedValue
    @Column(name="id")
    private int id;

    @Column(name="Alien_name")
    private String name;

    @Column(name="Alien_color")
    private String color;
    

    public alien(int id, String name, String color) {
        this.id = id;
        this.name = name;
        this.color = color;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    
}
