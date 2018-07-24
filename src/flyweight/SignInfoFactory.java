package flyweight;

import java.util.HashMap;
import java.util.Map;

public class SignInfoFactory {
    private static Map<String,SignInfo> pool = new HashMap<>();

    public static SignInfo getSignInfo(){
        return new SignInfo();
    }

    public static SignInfo getSignInfo(String key){
        SignInfo result = null;
        if(!pool.containsKey(key)){
            result = new SignInfo4Pool(key);
            pool.put(key,result);
        }else result = pool.get(key);
        return result;
    }
}
