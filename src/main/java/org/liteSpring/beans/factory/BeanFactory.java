package org.liteSpring.beans.factory;

import org.liteSpring.beans.BeanDefinition;

/**
 * @Author: yangrusheng
 * @Description:
 * @Date: Created in 20:07 2018/6/13
 * @Modified By:
 */
public interface BeanFactory {
    BeanDefinition getBeanDefinition(String beanID);

    Object getBean(String beanID);
}
