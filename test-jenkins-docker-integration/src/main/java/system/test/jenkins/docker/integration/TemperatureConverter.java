/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package system.test.jenkins.docker.integration;

/**
 *
 * @author Daniel García Arcos
 */
public class TemperatureConverter {
    
    public TemperatureConverter() {
        
    }
    
    public double celsiusToFahrenheit(double celsius) {
        return ((celsius * (9/5)) + 32);
    }
    
    public double farenheitToCelsius(double fahrenheit) {
        return ((fahrenheit - 32.0) * 5/9);
    }
}
