package ru.netology.service;

import static org.junit.Assert.*;
import org.junit.Test;

public class CashbackHackServiceTestJu4 {
    @Test
    public void belowTheBorder() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(900);
        assertEquals(100, actual);
    }

    @Test
    public void aboveTheBorder() {
        CashbackHackService service = new CashbackHackService();
        assertEquals(900,service.remain(1100));
    }


    @Test
    public void  equalsBorder(){
        CashbackHackService service= new CashbackHackService();
        int amount=1000;
        assertEquals(0,service.remain(1000));
    }
}
