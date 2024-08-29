package com.example.demoCICD;

import org.junit.jupiter.api.Test;

import java.util.logging.Logger;

import static org.junit.jupiter.api.Assertions.*;

class DemoCicdApplicationTest {

    static Logger logger = Logger.getLogger(DemoCicdApplicationTest.class.getName());

    @Test
    void testMethod(){
        logger.info("Running from test class");
    }


}