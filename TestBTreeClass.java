package week9;

/**
 * @ClassName TestBTreeClass
 * @Description TODO
 * @Author 付洁
 * @Date 2020/11/3
 **/
public class TestBTreeClass {
    public static void main(String[] args) {
        BTreeClass a = new BTreeClass();
        a.CreateBTree("(a),(b),(c)");
        System.out.println("二叉树的高度" +a.H);
        System.out.println(a.FindNode('a').data);
        System.out.println(a.toString());
    }
}

