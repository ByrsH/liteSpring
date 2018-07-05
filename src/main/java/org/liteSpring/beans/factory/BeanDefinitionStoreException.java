package org.liteSpring.beans.factory;

import org.liteSpring.beans.BeansException;

/**
 * @Author: yangrusheng
 * @Description:
 * @Date: Created in 21:04 2018/7/5
 * @Modified By:
 */
public class BeanDefinitionStoreException extends BeansException {
    public BeanDefinitionStoreException(String msg, Throwable cause) {
        super(msg, cause);
    }
}
