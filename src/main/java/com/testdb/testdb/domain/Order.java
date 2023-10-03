package com.testdb.testdb.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import java.time.LocalDate;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
public class Order {

  @Id
  private Long id;
  private Long userId;
  private LocalDate orderDate;
  private String orderStatus;


}
