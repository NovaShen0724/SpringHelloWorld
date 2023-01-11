package top.novashen;

public class Host implements Rent{
    @Override
    public void rent() {
        System.out.println("房东想要把房子租出去");
    }
    @Override
    public void look(){
        System.out.println("看看房子");
    }
}
