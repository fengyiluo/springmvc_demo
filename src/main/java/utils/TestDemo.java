/**
 * com.gmq.tech.com
 * Copyright (C) 2004-2017 All Rights Reserved.
 */
package utils;


import com.base.dao.Person;
import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.function.Predicate;

/**
 * 使用流来遍历集合
 *
 * @author gmq
 * @version $Id TestDemo.java, v 0.1 2017-11-12 17:29 admin Exp $$
 *
 * @version $Id TestDemo.java, v 0.2 2017-12-17 10:30 admin Exp $$
 */
public class TestDemo {

    private static final Logger logger = Logger.getLogger(TestDemo.class);

    public static void getData() {
        List<Person> pList = new ArrayList<Person>();
        pList.add(new Person("John", 24));
        pList.add(new Person("Lise", 30));
        pList.add(new Person("Alice", 45));
        pList.add(new Person("dou", 26));

        //串行流
        long count = pList.stream().count();
        long sum = pList.stream().mapToInt(p -> p.getAge()).sum();
        OptionalDouble avg = pList.stream().mapToInt(p -> p.getAge()).average();

        pList.stream().forEach(person -> logger.info(person.getName()));
        logger.info("plist size:" + count);
        logger.info("sum age:" + sum);
        logger.info("avg age:" + avg);
        //并行流
        Predicate<Person> pred = (person -> person.getAge() > 26);
        pList.parallelStream().filter(pred).forEach(person -> logger.info(person.getAge()+":"+person.getName()));

    }

    public static void main(String[] args) {
        TestDemo.getData();
    }


}