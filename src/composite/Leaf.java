package composite;

public class Leaf extends Component {
    @Override
    public void add(Component c) {
        System.out.println("不能对叶子节点进行增加节点操作！");
    }

    @Override
    public void remove(Component c) {
        System.out.println("不能对叶子节点进行删除节点操作！");
    }

    @Override
    public Component getChild(int i) {
        System.out.println("不能对叶子节点进行获取节点操作！");
        return null;
    }

    @Override
    public void operation() {
       System.out.println("叶子节点具体操作！");
    }
}
