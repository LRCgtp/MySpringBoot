package com.hand.exam1.utills;

import com.hand.exam1.entity.JdbcProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import java.io.Serializable;

public class GetJdbcProperties implements Serializable {

    public static JdbcProperties getjdbcProperties(){
        try {
            ApplicationContext applicationContext = new FileSystemXmlApplicationContext("classpath:applicationContext.xml");
            JdbcProperties jdbcProperties = (JdbcProperties) applicationContext.getBean("jdbcProperties");
            return jdbcProperties;
        }catch (Exception e){
            System.out.println("数据库属性不存在!!");
        }
        return null;
    }

    public static void main(String[] args) {
        System.out.println(getjdbcProperties().toString());
    }
}
