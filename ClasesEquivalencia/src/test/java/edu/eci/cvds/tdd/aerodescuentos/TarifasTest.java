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
    
    @Test
    public void pruebaTarifa2()
    {
        double ans = calculadora.calculoTarifa(500,6,25);
        double res= 500;
        
        Assert.assertEquals(ans,res,0.0f);
    }
     @Test
    public void pruebaDiasAntelacion1() {
        
        try{
            double res = calculadora.calculoTarifa(800,-15,30);
        }catch(Exception e){
            Assert.assertTrue(true);
        }
        
    }
    @Test
    public void pruebaDiasAntelacion2() {
        
        
        double res = calculadora.calculoTarifa(800,8,30);
        double cor =800;
        
        Assert.assertEquals(res,cor,0.0f);
        
        
    }
    @Test
    public void pruebaDiasAntelacion3() {
        
        
        double res = calculadora.calculoTarifa(800,29,30);
        double cor =680;
        
        Assert.assertEquals(res,cor,0.0f);
        
        
    }
    @Test
    public void pruebaDiasAntelacion4() {
        
        try{
            double res = calculadora.calculoTarifa(800,10000,30);
        }catch(Exception e){
            Assert.assertTrue(true);
        }
        
    }
    @Test
    public void pruebaFronteraEdad1() {
        
        try{
            double res = calculadora.calculoTarifa(500,10,-1);
        }catch(Exception e){
            Assert.assertTrue(true);
        }
        
    }
    @Test
    public void pruebaFronteraEdad2() {
        
        double res = calculadora.calculoTarifa(500,10,0);
        double cor =475;
        
        Assert.assertEquals(res,cor,0.0f);
        
    }
    @Test
    public void pruebaFronteraEdad3() {
        
        double res = calculadora.calculoTarifa(500,10,1);
        double cor =475;
        
        Assert.assertEquals(res,cor,0.0f);
        
    }
    @Test
    public void pruebaFronteraEdad4() {
        
        double res = calculadora.calculoTarifa(500,10,17);
        double cor =475;
        
        Assert.assertEquals(res,cor,0.0f);
        
    }
    @Test
    public void pruebaFronteraEdad5() {
        
        double res = calculadora.calculoTarifa(500,10,18);
        double cor =500;
        
        Assert.assertEquals(res,cor,0.0f);
        
    }
    @Test
    public void pruebaFronteraEdad6() {
        
        double res = calculadora.calculoTarifa(500,10,19);
        double cor =500;
        
        Assert.assertEquals(res,cor,0.0f);
        
    }
    @Test
    public void pruebaFronteraEdad7() {
        
        double res = calculadora.calculoTarifa(500,10,64);
        double cor =500;
        
        Assert.assertEquals(res,cor,0.0f);
        
    }
    @Test
    public void pruebaFronteraEdad8() {
        
        double res = calculadora.calculoTarifa(500,10,65);
        double cor =500;
        
        Assert.assertEquals(res,cor,0.0f);
        
    }
    @Test
    public void pruebaFronteraEdad9() {
        
        double res = calculadora.calculoTarifa(500,10,66);
        double cor =460;
        
        Assert.assertEquals(res,cor,0.0f);
        
    }
    @Test
    public void pruebaFronteraEdad10() {
        
        double res = calculadora.calculoTarifa(500,10,109);
        double cor =460;
        
        Assert.assertEquals(res,cor,0.0f);
        
    }
    @Test
    public void pruebaFronteraEdad11() {
        
        double res = calculadora.calculoTarifa(500,10,110);
        double cor =460;
        
        Assert.assertEquals(res,cor,0.0f);
        
    }
    @Test
    public void pruebaFronteraEdad12() {
        
        try{
            double res = calculadora.calculoTarifa(500,10,111);
        }catch(Exception e){
            Assert.assertTrue(true);
        }
        
    }
    @Test
    public void pruebaFronteraTarifa1() {
        
        try{
            double res = calculadora.calculoTarifa(-1,10,25);
        }catch(Exception e){
            Assert.assertTrue(true);
        }
        
    }
    @Test
    public void pruebaFronteraTarifa2() {
        
        double res = calculadora.calculoTarifa(0,10,25);
        double cor =0;
        
        Assert.assertEquals(res,cor,0.0f);
        
    }
    @Test
    public void pruebaFronteraDiasAntelacion1() {
        
        try{
            double res = calculadora.calculoTarifa(500,-1,25);
        }catch(Exception e){
            Assert.assertTrue(true);
        }
        
    }
    @Test
    public void pruebaFronteraDiasAntelacion2() {
        
        double res = calculadora.calculoTarifa(500,0,25);
        double cor =500;
        
        Assert.assertEquals(res,cor,0.0f);
        
    }
    @Test
    public void pruebaFronteraDiasAntelacion3() {
        
        double res = calculadora.calculoTarifa(500,1,25);
        double cor =500;
        
        Assert.assertEquals(res,cor,0.0f);
        
    }
    @Test
    public void pruebaFronteraDiasAntelacion4() {
        
        double res = calculadora.calculoTarifa(500,19,25);
        double cor =500;
        
        Assert.assertEquals(res,cor,0.0f);
        
    }
    @Test
    public void pruebaFronteraDiasAntelacion5() {
        
        double res = calculadora.calculoTarifa(500,20,25);
        double cor =500;
        
        Assert.assertEquals(res,cor,0.0f);
        
    }
    @Test
    public void pruebaFronteraDiasAntelacion6() {
        
        double res = calculadora.calculoTarifa(500,21,25);
        double cor =425;
        
        Assert.assertEquals(res,cor,0.0f);
        
    }
    @Test
    public void pruebaFronteraDiasAntelacion7() {
        
        double res = calculadora.calculoTarifa(500,9999,25);
        double cor =425;
        Assert.assertEquals(res,cor,0.0f);
        
    }
    @Test
    public void pruebaFronteraDiasAntelacion8() {
        
        try{
            double res = calculadora.calculoTarifa(500,10000,25);
        }catch(Exception e){
            Assert.assertTrue(true);
        }
    }
}
