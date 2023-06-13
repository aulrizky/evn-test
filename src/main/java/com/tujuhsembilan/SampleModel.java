package com.tujuhsembilan;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SampleModel {

  private UUID id;

  private String string;

  private Boolean condition;

  private BigDecimal value;

  private LocalDateTime timestamp;

}
