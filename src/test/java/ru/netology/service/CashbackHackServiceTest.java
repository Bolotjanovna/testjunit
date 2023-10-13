package ru.netology.service;

import static org.testng.AssertJUnit.assertEquals;

class CashbackHackServiceTest {

    @org.testng.annotations.Test
    public void remain() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 1;
        assertEquals(expected, actual);
    }
    @org.testng.annotations.Test
    public void boundary() {
        CashbackHackService service = new CashbackHackService();
        int amount = 900;
        int actual = service.remain(amount);
        int expected = 100;
        assertEquals(expected, actual);
    }
}