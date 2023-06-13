package com.tujuhsembilan;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

public class App {

    public static void main(String[] args) {
        var object = SampleModel.builder()
                .id(UUID.randomUUID())
                .string("This is sample string")
                .condition(false)
                .value(BigDecimal.valueOf(123_456_789L))
                .timestamp(LocalDateTime.now())
                .build();
        System.out.println(object);
    }

}
