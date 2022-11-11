package com.jewellers.jeseekajewellersapp.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;

@Data
@Entity
@Table(name = "tbl_products")
public class Products {
    @Id
    private int id;
    private String productName;
    private BigDecimal itemPrice;
    private String itemDescription;
}
