package top.novashen.demo1;

public class Proxy implements Rent{

    private Rent host;

    public Proxy() {
    }

    public Proxy(Rent host) {
        this.host = host;
    }

    @Override
    public void rent() {
        look();
        sign();
        host.rent();
    }
    private void look(){
        System.out.println("看房");
    }
    private void sign(){
        System.out.println("签合同");
    }
}
