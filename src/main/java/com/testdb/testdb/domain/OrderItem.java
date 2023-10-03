package com.testdb.testdb.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class OrderItem {

  @Id
  public Long id;
  public Long orderId;
  public Long productId;
  public int quantity;
}
