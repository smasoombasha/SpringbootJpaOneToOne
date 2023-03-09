package com.OneToOne.demo.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name="product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int pid;
    @Column
    private String pname;
    private double pprice;
    // OneToMany Relational Jpa data
    public Product(String pname, int pprice) {
        this.pname = pname;
        this.pprice=pprice;
    }

}
