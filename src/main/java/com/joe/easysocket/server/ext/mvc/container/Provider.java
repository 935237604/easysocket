package com.joe.easysocket.server.ext.mvc.container;

import java.lang.annotation.*;

/**
 * 功能提供者
 * 
 * @author joe
 *
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.TYPE })
public @interface Provider {
	/**
	 * 优先级，取值-10000-10000，只对filter有效，优先处理优先级高的
	 * @return
	 */
	int priority() default 10;
}
