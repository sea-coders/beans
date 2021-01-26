package edu.nf.beans;

/**
 * @author wangl
 */
public class BeanDefinition {

    /**
     * 默认单例
     */
    private boolean singleton = true;

    /**
     * bean的Class
     */
    private Class<?> beanClass;

    public boolean isSingleton() {
        return singleton;
    }

    public void setSingleton(boolean singleton) {
        this.singleton = singleton;
    }

    public Class<?> getBeanClass() {
        return beanClass;
    }

    public void setBeanClass(Class<?> beanClass) {
        this.beanClass = beanClass;
    }
}
