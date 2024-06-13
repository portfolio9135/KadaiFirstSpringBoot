package com.techacademy;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.DayOfWeek;

@RestController
public class KadaiFirstController {

//【仕様1：指定日の曜日を算定する】
    @GetMapping("/dayofweek/{date}")
    public String dispDayOfWeek(@PathVariable String date) {
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd");
            LocalDate localDate = LocalDate.parse(date, formatter);
            DayOfWeek dayOfWeek = localDate.getDayOfWeek();
            return dayOfWeek.toString();
        } catch (DateTimeParseException e) {
            return "Invalid date format. Please use yyyymmdd.";
        }
    }

//【仕様2：四則演算を行なう__足し算】
    @GetMapping("/plus/{val1}/{val2}")
    public String calcPlus(@PathVariable int val1, @PathVariable int val2) {
    	int res = 0;
    	res = val1 + val2;
    	return "計算結果:" + res;
    }

  //【仕様2：四則演算を行なう__引き算】
    @GetMapping("/minus/{val1}/{val2}")
    public String calcMinus(@PathVariable int val1, @PathVariable int val2) {
    	int res = 0;
    	res = val1 - val2;
    	return "計算結果:" + res;
    }

  //【仕様2：四則演算を行なう__掛け算】
    @GetMapping("/times/{val1}/{val2}")
    public String calcTimes(@PathVariable int val1, @PathVariable int val2) {
    	int res = 0;
    	res = val1 * val2;
    	return "計算結果:" + res;
    }

  //【仕様2：四則演算を行なう__割り算】
    @GetMapping("/divide/{val1}/{val2}")
    public String calcDivide(@PathVariable int val1, @PathVariable int val2) {
    	int res = 0;
    	res = val1 / val2;
    	return "計算結果:" + res;
    }






}