package main.java.com.soft2036.study.week6;

/**
 * @ClassName TestBTree
 * @Description TODO
 * @Author gqfeng
 * @Date 2020/11/10
 **/
public class TestBTree {
    public static void main(String[] args) {
        String data;
        data = "A(B(D(,F(H))),C(,E(G))";
        System.out.println("括号表示法："+data);
        BTreeClass btree = new BTreeClass();
        btree.CreateBTree(data);
        //System.out.println("树的结果："+btree.toString());
        // System.out.println("查找：");
        // btree.FindNode('C').SetData('X');
        //  System.out.println("修改值后的结果："+btree.toString());
        //System.out.println(_node.data);
        System.out.println("高度为："+btree.Height());
        System.out.println("先序序列：");
       btree.PreOrder1(btree);
        System.out.println();
        System.out.println("中序排列:");
        btree.InOrder1(btree);
        System.out.println();
        System.out.println("后续排列：");
        btree.PostOrder1(btree);
    }
}
