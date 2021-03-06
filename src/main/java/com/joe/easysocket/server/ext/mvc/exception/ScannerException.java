package com.joe.easysocket.server.ext.mvc.exception;


import com.joe.easysocket.server.exception.SystemException;

/**
 * 扫描类时的异常
 * 
 * @author joe
 *
 */
public class ScannerException extends SystemException {
	private static final long serialVersionUID = -2914885047283866123L;

	public ScannerException(String message) {
		super(message);
	}

	public ScannerException(String message, Throwable cause) {
		super(message, cause);
	}
}
