package multiton;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Emperor {
    private static int maxNumberOfEmperor = 2;

    private static List<String> emperorNameList = new ArrayList<>(maxNumberOfEmperor);

    private static List<Emperor> emperorList = new ArrayList<>(maxNumberOfEmperor);

    private static int countNumOfEmperor = 0;

    static {
        for(int i = 0;i<maxNumberOfEmperor;i++){
            emperorList.add(new Emperor("第"+(i+1)+"个皇帝"));
        }
    }

    private Emperor() {
    }

    private Emperor(String name){
        emperorNameList.add(name);
    }

    public static Emperor getInstance(){
        Random random = new Random();
        countNumOfEmperor = random.nextInt(maxNumberOfEmperor);
        return emperorList.get(countNumOfEmperor);
    }

    public static String getEmperorName(){
        return emperorNameList.get(countNumOfEmperor);
    }

}
