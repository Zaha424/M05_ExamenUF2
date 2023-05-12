/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.m05_examenuf2;

import org.junit.jupiter.api.Test;

import com.mycompany.m05_examenuf2.Suma;

import static org.junit.jupiter.api.Assertions.assertEquals;



/**
 *
 * @author Zakaria
 */
public class SumaTest {
    /**
     * Test del metodo Sumar()
     */
    @Test
    public void testSumar() {
        Suma suma = new Suma(30, 15);
        int result = suma.Sumar();
        int expected = 45;
        assertEquals(expected, result);
    }

    /**
     * Test del metodo getNum1()
     */
    @Test
    public void testGetNum1() {
        Suma suma = new Suma(33, 60);
        int result = suma.getNum1();
        int expected = 33;
        assertEquals(expected, result);
    }

    /**
     * Test del metodo sumaValorAbsolut()
     */
    @Test
    public void testSumaValorAbsolut() {
        Suma suma = new Suma(33, 33);
        double result = suma.sumaValorAbsolut();
        double expected = 66;
        assertEquals(expected, result);
    }
    
}
