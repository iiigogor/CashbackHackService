package ru.netology.service;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.*;

public class CashbackHackServiceTestNG {
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
        int amount = 1000;
        assertEquals(service.remain(1000), 0);
    }
}
