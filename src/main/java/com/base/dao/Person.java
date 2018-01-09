/**
 * com.gmq.tech.com
 * Copyright (C) 2004-2017 All Rights Reserved.
 */
package com.base.dao;

/**
 * @author admin
 * @version $Id Person.java, v 0.1 2017-11-12 17:16 admin Exp $$
 */
public class Person {
    private String name;
    private int age;
    private char gender;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * Getter method for property <tt>name</tt>.
     *
     * @return property value of name
     */
    public String getName() {
        return name;
    }

    /**
     * Setter method for property <tt>name</tt>.
     *
     * @param name value to be assigned to property name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter method for property <tt>age</tt>.
     *
     * @return property value of age
     */
    public int getAge() {
        return age;
    }

    /**
     * Setter method for property <tt>age</tt>.
     *
     * @param age value to be assigned to property age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Getter method for property <tt>gender</tt>.
     *
     * @return property value of gender
     */
    public char getGender() {
        return gender;
    }

    /**
     * Setter method for property <tt>gender</tt>.
     *
     * @param gender value to be assigned to property gender
     */
    public void setGender(char gender) {
        this.gender = gender;
    }
}

