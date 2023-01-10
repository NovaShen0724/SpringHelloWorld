package top.novashen.demo1;

public class Client {
    public static void main(String[] args) {
        Rent host = new Host();
        Proxy proxy = new Proxy(host);
        proxy.rent();
    }
}
