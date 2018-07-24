package observer;

import java.util.ArrayList;
import java.util.List;

public class WechatServer implements Observerable {
    private List<Observer> list;
    private String message;

    public WechatServer() {
        this.list = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
       list.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        if(!list.isEmpty())list.remove(observer);
    }

    @Override
    public void notifyObserver() {
         for(int i = 0;i<list.size();i++){
             Observer observer = list.get(i);
             observer.update(message);
         }
    }

    public void setInfomation(String message){
        this.message = message;
        notifyObserver();
    }
}
