package visitor;

/**
 * 接受访问者接口
 */
public interface ComputerPart {
    public void accept(ComputerPartVisitor computerPartVisitor);
}
