package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;
public class CashbackHackServiceTest {

    @Test
    public void testRemain() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 900;
        int expected = 100;
        int actual = cashbackHackService.remain(amount);

        assertEquals(actual, expected);
    }
}