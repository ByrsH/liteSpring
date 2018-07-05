package org.liteSpring.beans;

/**
 * @Author: yangrusheng
 * @Description:
 * @Date: Created in 21:01 2018/7/5
 * @Modified By:
 */
public class BeansException extends RuntimeException {
    public BeansException(String msg) {
        super(msg);
    }

    public BeansException(String msg, Throwable cause) {
        super(msg, cause);
    }
}
