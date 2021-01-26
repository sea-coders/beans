package edu.nf.beans.util;

public class BeanNameUtils {

	public static String toLowerBeanName(String beanName) {
		return beanName.substring(0, 1).toLowerCase()
				+ beanName.substring(1);
	}

}
