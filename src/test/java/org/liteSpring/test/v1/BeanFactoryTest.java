package org.liteSpring.test.v1;

import org.junit.Test;
import org.liteSpring.beans.BeanDefinition;
import org.liteSpring.beans.factory.BeanFactory;
import org.liteSpring.beans.factory.support.DefaultBeanFactory;
import org.liteSpring.service.v1.PetStoreService;

import static org.junit.Assert.*;

/**
 * @Author: yangrusheng
 * @Description:
 * @Date: Created in 19:50 2018/6/13
 * @Modified By:
 */
public class BeanFactoryTest {

    @Test
    public void testGetBean() {
        BeanFactory factory = new DefaultBeanFactory("petstore-v1.xml");
        BeanDefinition bd = factory.getBeanDefinition("petStore");

        assertEquals("org.liteSpring.service.v1.PetStoreService", bd.getBeanClassName());

        PetStoreService petStore = (PetStoreService) factory.getBean("petStore");
        assertNotNull(petStore);
    }

}
