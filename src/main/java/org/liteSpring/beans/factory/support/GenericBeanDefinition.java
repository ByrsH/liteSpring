package org.liteSpring.beans.factory.support;

import org.liteSpring.beans.BeanDefinition;

/**
 * @Author: yangrusheng
 * @Description:
 * @Date: Created in 20:18 2018/7/5
 * @Modified By:
 */
public class GenericBeanDefinition implements BeanDefinition {

    private String id;
    private String beanClassName;

    public GenericBeanDefinition(String id, String beanClassName) {
        this.id = id;
        this.beanClassName = beanClassName;
    }

    public String getBeanClassName() {
        return this.beanClassName;
    }
}
