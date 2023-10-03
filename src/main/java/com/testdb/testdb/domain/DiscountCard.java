package com.testdb.testdb.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class DiscountCard {

  @Id
  public Long id;
  public String cardType;
  public int cardValue;
}
