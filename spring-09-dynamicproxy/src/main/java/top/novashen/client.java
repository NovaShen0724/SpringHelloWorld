package top.novashen;

import java.lang.reflect.Proxy;

public class client {
    public static void main(String[] args) {
        Host host = new Host();
        ProxyInvocationHandler p = new ProxyInvocationHandler();
        p.setRent(host);
        Rent proxy = (Rent) p.getProxy();
        proxy.rent();
    }
}
