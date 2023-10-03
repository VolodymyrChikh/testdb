package com.testdb.testdb.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class DiscountCardToUser {

  @Id
  public Long id;
  public Long userId;
  public Long discountCardId;
}
