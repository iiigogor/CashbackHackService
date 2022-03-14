package ru.netology.service;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashbackHackServiceTestng {

    @Test
    public void belowTheBorder() {
        CashbackHackService service = new CashbackHackService();
        assertEquals(service.remain(900), 100);
    }

    @Test
    public void aboveTheBorder() {
        CashbackHackService service = new CashbackHackService();
        assertEquals(service.remain(1100), 900);
    }

   
    @Test
    public void equalsBorder() {
        CashbackHackService service = new CashbackHackService();
        int amount = 2000;
        assertEquals(service.remain(1000), 0);
    }
}
