package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class cashbackhackservicetestng {
    @Test
    public void belowTheBorder() {
        CashbackHackService service = new CashbackHackService();
        int amount = 900;
        int expected=100;
        int actual=service.remain(amount);
        assertEquals(actual,expected );
    }

    @Test
    public void aboveTheBorder() {
        CashbackHackService service = new CashbackHackService();
        assertEquals(service.remain(1100), 900);
    }

   
    @Test
    public void equalsBorder() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        assertEquals(service.remain(1000), 0);
    }
}
