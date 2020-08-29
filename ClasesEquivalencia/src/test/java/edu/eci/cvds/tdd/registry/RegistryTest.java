/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.cvds.tdd.registry;

import org.junit.Assert;
import org.junit.Test;
/**
 * @author javier.lopez-p
 * @author andres.davila-g
 */
public class RegistryTest {

    private Registry registry = new Registry();

    @Test
    public void validateRegistryResult() {

        Person person = new Person("Andres Davila", 1032496251, 22,Gender.MALE, true);
        RegisterResult result = registry.registerVoter(person);
        Assert.assertEquals(RegisterResult.VALID, result);
    }
    @Test
    public void validateRegistryDead() {

        Person person = new Person("MIchael jackson",447017832,45,Gender.MALE,false);

        RegisterResult result = registry.registerVoter(person);

        Assert.assertEquals(RegisterResult.DEAD, result);
    }
    @Test
    public void validateRegistryDuplicated() {

        Person person = new Person("Andres Davila", 1032496251, 22,Gender.MALE, true);

        RegisterResult result = registry.registerVoter(person);

        result = registry.registerVoter(person);

        Assert.assertEquals(RegisterResult.DUPLICATED, result);
    }
    @Test
    public void validateRegistryUnderAge() {

        Person person = new Person("elver galarga",1001520057,10,Gender.MALE,true);

        RegisterResult result = registry.registerVoter(person);

        Assert.assertEquals(RegisterResult.UNDERAGE, result);
    }
    @Test
    public void validateRegistryValidAge() {

        Person person = new Person("Reina Isabelle",549675,138,Gender.FEMALE,true);

        RegisterResult result = registry.registerVoter(person);

        Assert.assertEquals(RegisterResult.INVALID_AGE, result);
    }

    // TODO Complete with more test cases
}