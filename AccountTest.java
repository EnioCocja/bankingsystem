package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    private Account acc1;
    private Account acc2;

    @BeforeEach
    void setUp() {
        acc1 = new Account();
        acc2 = new Account();
    }

    @Test
    void deposit() {
        acc1.deposit(1200);
        assertEquals(1200, acc1.checkBalance());
        acc1.deposit(800);
        assertEquals(2000, acc1.checkBalance());
    }

    @Test
    void withdraw() {
        acc1.deposit(1500);
        acc1.withdraw(500);
        assertEquals(1000, acc1.checkBalance());
        acc1.withdraw(300);
        assertEquals(700, acc1.checkBalance());
    }

    @Test
    void checkBalance() {
        acc1.deposit(1000);
        assertEquals(1000, acc1.checkBalance());
        acc1.withdraw(200);
        assertEquals(800, acc1.checkBalance());
    }

    @Test
    void transfer() {
        acc1.deposit(1500);
        acc1.transfer(500, acc2);
        assertEquals(1000, acc1.checkBalance());
        assertEquals(500, acc2.checkBalance());
    }
}
