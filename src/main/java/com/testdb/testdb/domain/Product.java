package com.testdb.testdb.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
public class Product {

  @Id
  private Long id;
  private String name;
  private String description;
  private int price;


}
