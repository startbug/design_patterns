package com.ggs.custom_framework.beans.factory.xml;

import com.ggs.custom_framework.beans.BeanDefinition;
import com.ggs.custom_framework.beans.MutablePropertyValues;
import com.ggs.custom_framework.beans.PropertyValue;
import com.ggs.custom_framework.beans.factory.support.BeanDefinitionReader;
import com.ggs.custom_framework.beans.factory.support.BeanDefinitionRegistry;
import com.ggs.custom_framework.beans.factory.support.SimpleBeanDefinitionRegistry;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.InputStream;
import java.util.List;

/**
 * @Author lianghaohui
 * @Date 2022/3/19 21:33
 * @Description 针对xml配置文件进行解析的类
 */
public class XmlBeanDefinitionReader implements BeanDefinitionReader {

    //声明注册表对象
    private BeanDefinitionRegistry beanDefinitionRegistry;

    public XmlBeanDefinitionReader() {
        this.beanDefinitionRegistry = new SimpleBeanDefinitionRegistry();
    }

    @Override
    public BeanDefinitionRegistry getRegistry() {
        return beanDefinitionRegistry;
    }

    @Override
    public void loadDefinitions(String configLocation) throws DocumentException {
        //使用dom4j进行xml配置文件的解析
        SAXReader reader = new SAXReader();
        InputStream is = XmlBeanDefinitionReader.class.getClassLoader().getResourceAsStream(configLocation);
        Document document = reader.read(is);
        //根据Document对象获取根标签对象beans
        Element rootElement = document.getRootElement();
        //获取根标签下所有的bean标签对象
        List<Element> beanElements = rootElement.elements("bean");
        //遍历集合
        for (Element beanElement : beanElements) {
            //获取id
            String id = beanElement.attributeValue("id");
            //获取class
            String className = beanElement.attributeValue("class");
            //封装到beanDefinition对象中
            //1.创建BeanDefinition对象
            BeanDefinition beanDefinition = new BeanDefinition();
            beanDefinition.setId(id);
            beanDefinition.setClassName(className);

            //创建MutablePropertyValues对象
            MutablePropertyValues propertyValues = new MutablePropertyValues();

            //获取bean标签下的property标签对象
            List<Element> propertyElements = beanElement.elements("property");
            for (Element propertyElement : propertyElements) {
                String value = propertyElement.attributeValue("value");
                String ref = propertyElement.attributeValue("ref");
                String name = propertyElement.attributeValue("name");
                PropertyValue propertyValue = new PropertyValue(name, ref, value);
                propertyValues.addPropertyValue(propertyValue);
            }

            //将MutablePropertyValues对象封装到BeanDefinition对象中
            beanDefinition.setMutablePropertyValues(propertyValues);

            //将BeanDefinition对象注册到注册表中
            this.beanDefinitionRegistry.registerBeanDefinition(id, beanDefinition);
        }
    }
}
