package com.joe.easysocket.server.exception;

/**
 * 非法请求，当请求数据不符合要求时会抛出该异常
 *
 * @author joe
 */
public class IllegalRequestException extends SystemException {
    private static final long serialVersionUID = 855898103206510828L;

    public IllegalRequestException(String cause) {
        super("非法请求：" + cause);
    }

    public IllegalRequestException(Throwable cause) {
        super("非法请求：", cause);
    }
}
