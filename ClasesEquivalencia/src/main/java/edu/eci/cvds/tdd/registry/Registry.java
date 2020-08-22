/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.cvds.tdd.registry;

public class Registry {
    public RegisterResult registerVoter(Person p) {
        RegisterResult result;
        boolean duplicado;
        
        
        if(p.getAge()<18)
        {
            result=RegisterResult.UNDERAGE;
        }else if(!p.isAlive())
        {
            result=RegisterResult.DEAD;
        }else if(p.getAge()>122)
        {
            result=RegisterResult.INVALID_AGE;
        }else 
        {
            result=RegisterResult.VALID;
        } 
        return result;
    }
}
