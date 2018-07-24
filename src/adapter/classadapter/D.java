package adapter.classadapter;

/**
 * 转换器 将B接口实现转为A接口实现类
 */
public class D extends C implements A {
    @Override
    public boolean isA() {
        return isB();
    }
}
