package com.ricardosouto.hotel_booking;

import java.math.BigDecimal;

public class Room {




    private String number;
    private BigDecimal dailyRate;


    public Room(String number, BigDecimal dailyRate) {
        if(dailyRate.compareTo(BigDecimal.ZERO) <= 0){
            throw new IllegalArgumentException("The rate of the night is incorrect");
        }

        this.number = number;
        this.dailyRate = dailyRate;
    }

    public String getNumber() {
        return number;
    }

    public BigDecimal getDailyRate() {
        return dailyRate;
    }
}
