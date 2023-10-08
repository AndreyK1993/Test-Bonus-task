package org.example.app.service;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BonusServiceTest {

    private BonusService service;

    @BeforeEach
    void setUp() {
        service = new BonusService();
    }

    @AfterEach
    void tearDown() {
        service = null;
    }

    @DisplayName("Test Bonus Service with expected result")
    @Test

    void test_Bonus_Service_With_Expected_Result(){
        assertEquals("10,00", service.getRes(100.0));
    }

    @DisplayName("Test Bonus Service with unexpected result")
    @Test

    void test_Bonus_Service_With_Unexpected_Result(){
        assertEquals("Incorrect value!", service.getRes(-100.0));
    }
}