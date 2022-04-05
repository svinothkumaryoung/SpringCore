package com.cognizant.reactBatches;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.FileSystemResource;

import javax.net.ssl.X509KeyManager;
import javax.security.auth.x500.X500Principal;

public class MainClass {
    public static void main(String[] args) {
        BeanFactory beanFactory=new XmlBeanFactory(new FileSystemResource("xmlfile.xml"));
        StudentInfo studentInfo=(StudentInfo) beanFactory.getBean("studInfo");
        studentInfo.printData();
    }
}
