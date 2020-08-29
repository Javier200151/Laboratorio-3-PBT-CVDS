/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.cvds.tdd.registry;
import java.util.ArrayList;

/**
 * @author javier.lopez-p
 * @author andres.davila-g
 */
public class Registry {
    private ArrayList<Person> persons = new ArrayList<Person>();
    public RegisterResult registerVoter(Person p) {
        
        if (!p.isAlive())
        {
            return RegisterResult.DEAD;
        }
        else if (persons.contains(p))
        {
            return RegisterResult.DUPLICATED;
        }
        else if (p.getAge()<18)
        {
            return RegisterResult.UNDERAGE;
        }
        else if (p.getAge()<0 || p.getAge()>122)
        {
            return RegisterResult.INVALID_AGE;
        }
        else 
        {
            persons.add(p);
            return RegisterResult.VALID;
        }
    }
}
