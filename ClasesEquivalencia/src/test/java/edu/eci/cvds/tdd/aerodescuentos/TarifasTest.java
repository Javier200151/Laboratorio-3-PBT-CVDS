/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.cvds.tdd.aerodescuentos;

import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author USUARIO
 */
public class TarifasTest {
    
    CalculadorDescuentos calculadora= new CalculadorDescuentos();
    
    @Test
    public void pruebasEdad1()
    {
        try 
        {
            double ans = calculadora.calculoTarifa(1000,6,-45);
        }
        catch(Exception e)
        {
            Assert.assertTrue(true);
        }
    }
    @Test
    public void pruebasEdad2()
    {
        double ans = calculadora.calculoTarifa(1000,7,15);
        double value= 950;
        Assert.assertEquals(ans, value,0.0f);
    }
    @Test
    public void pruebasEdad3()
    {
        double ans = calculadora.calculoTarifa(1000,7,35);
        double value= 1000;
        Assert.assertEquals(ans, value,0.0f);
    }
    @Test
    public void pruebasEdad4()
    {
        double ans = calculadora.calculoTarifa(1000,7,90);
        double value= 920;
        Assert.assertEquals(ans, value,0.0f);
    }
    
    @Test
    public void pruebasEdad5()
    {
        try 
        {
            double ans = calculadora.calculoTarifa(1000,6,300);
        }
        catch(Exception e)
        {
            Assert.assertTrue(true);
        }
    }
    @Test
    public void pruebaTarifa1()
    {
        try 
        {
            double ans = calculadora.calculoTarifa(-3000,6,25);
        }
        catch(Exception e)
        {
            Assert.assertTrue(true);
        }
    }
    
    
}
