package designpatterns.proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author by chu_yang_yang
 * @Classname ProxyHandle
 * @Description
 * @Date 2019/9/20 10:30
 */
public abstract class ProxyHandle implements InvocationHandler {

    private Object tagert;

    public ProxyHandle(Object tagert) {
        this.tagert = tagert;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        doBefore();
        method.invoke(tagert, args);
        doAfter();
        return null;
    }

    abstract void doBefore();

    abstract void doAfter();
}
