/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package system.test.jenkins.docker.integration;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Daniel García Arcos
 */
public class TemperatureConverterIT {
    
    public TemperatureConverterIT() {
    }

    /**
     * Test of celsiusToFahrenheit method, of class TemperatureConverter.
     */
    @org.junit.jupiter.api.Test
    public void testCelsiusToFahrenheit() {
        System.out.println("celsiusToFahrenheit");
        double celsius = 0.0;
        TemperatureConverter instance = new TemperatureConverter();
        double expResult = 32.0;
        double result = instance.celsiusToFahrenheit(celsius);
        assertEquals(expResult, result, "La prueba pasó");
    }

    /**
     * Test of farenheitToCelsius method, of class TemperatureConverter.
     */
    @org.junit.jupiter.api.Test
    public void testFarenheitToCelsius() {
        System.out.println("farenheitToCelsius");
        double fahrenheit = 86.0;
        TemperatureConverter instance = new TemperatureConverter();
        double expResult = 30.0;
        double result = instance.farenheitToCelsius(fahrenheit);
        assertEquals(expResult, result, "La prueba pasó");
    }
    
}
