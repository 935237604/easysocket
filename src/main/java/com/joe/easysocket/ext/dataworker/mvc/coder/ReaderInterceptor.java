package com.joe.easysocket.ext.dataworker.mvc.coder;

import com.joe.easysocket.ext.dataworker.mvc.Bean;
import com.joe.easysocket.ext.dataworker.mvc.context.RequestContext;
import com.joe.easysocket.ext.dataworker.mvc.exception.ParamValidationException;
import com.joe.easysocket.ext.dataworker.mvc.param.ParamParserContainer;
import com.joe.easysocket.ext.dataworker.mvc.resource.Param;

import java.util.List;

/**
 * 数据解析器接口，必须实现该接口并且注解{@link com.joe.easysocket.ext.dataworker.mvc.container.Provider}才会生效
 *
 * @author joe
 */
public interface ReaderInterceptor extends Bean {
    /**
     * 是否可读
     *
     * @param contentType 接口的参数格式
     * @return <li>true：可读</li>
     * <li>false：不可读</li>
     */
    boolean isReadable(String contentType);

    /**
     * 将数据读取为接口需要的参数数组
     *
     * @param params         调用的接口参数说明
     * @param requestContext 请求上下文
     * @param data           接口调用数据
     * @return 读取的参数数组
     * @throws ParamValidationException 数据读取成功但是校验失败
     */
    Object[] read(List<Param<?>> params, RequestContext requestContext, String data) throws ParamValidationException;

    /**
     * 初始化
     *
     * @param container 提供一个参数容器，提供解析不同注解类型的参数的能力
     */
    void init(ParamParserContainer container);
}