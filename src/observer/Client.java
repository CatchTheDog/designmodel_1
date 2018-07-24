package observer;

public class Client {
    public static void main(String [] args){
        WechatServer server = new WechatServer();

        Observer userZhang = new User("Zhangsan");
        Observer siLi = new User("Lisi");
        Observer maziWang = new User("Wangmazi");

        server.registerObserver(userZhang);
        server.registerObserver(siLi);
        server.registerObserver(maziWang);

        server.setInfomation("设计模式确实好，真的好啊！");
        System.out.println("-----------------------------------------------------");
        server.removeObserver(userZhang);
        server.setInfomation("尤其是观察者模式，简直亮爆了！");
    }
}
