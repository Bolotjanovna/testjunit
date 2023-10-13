package ru.netology.service;

import static org.junit.Assert.assertEquals;


class CashbackHackServiceTest {

    @org.junit.Test
    public void remain() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 1;
        assertEquals(expected, actual);
    }
    @org.junit.Test
    public void boundary() {
        CashbackHackService service = new CashbackHackService();
        int amount = 900;
        int actual = service.remain(amount);
        int expected = 100;
        assertEquals(expected, actual);
    }
}