package main.java.com.soft2036.study.week6;

import com.sun.org.apache.regexp.internal.RE;

import java.security.PublicKey;
import java.util.Random;
import java.util.Stack;

/**
 * @ClassName BTNode
 * @Description TODO
 * @Author gqfeng
 * @Date 2020/11/10
 **/
 class BTreeClass<E> {
    BTNode<Character> b;
    String bstr;

    public BTreeClass() {
        b = null;
    }

    public void CreateBTree(String str) {
        Stack<BTNode> st = new Stack<BTNode>();
        BTNode<Character> p = null;
        boolean flag = true;
        char ch;
        int i = 0;
        while (i < str.length()) {
            ch = str.charAt(i);
            switch (ch) {
                case '(':
                    st.push(p);
                    flag = true;
                    break;
                case ')':
                    st.pop();
                    break;
                case ',':
                    flag = false;
                    break;
                default:
                    p = new BTNode<Character>(ch);
                    if (b == null) {
                        b = p;
                    } else {
                        if (flag) {
                            if (!st.empty()) {
                                st.peek().lchild = p;
                            }
                        } else {
                            if (!st.empty()) {
                                st.peek().rchild = p;
                            }
                        }
                    }
                    break;
            }
            i++;
        }
    }
    @Override
    public String toString(){
        bstr="";
        toString1(b);
        return bstr;
    }
    private void toString1(BTNode<Character> t){
        if (t!=null)
        {bstr+=t.data;
        if (t.lchild!=null || t.rchild!=null){
            bstr+="(";
            toString1(t.lchild);
            if (t.rchild!=null)
                bstr+=",";
            toString1(t.rchild);
            bstr+=")";
        }
    }
        }
        public BTNode<Character> FindNode(char x){
        return  FindNode1(b,x);
        }
        private BTNode<Character> FindNode1(BTNode<Character> t,char x){
        BTNode<Character>p;
        if(t==null) {
            return null;
        } else if (t.data==x) {
            return t;
        } else{
            p=FindNode1(t.lchild,x);
            if(p!=null) {
                return p;
            } else {
                return FindNode1(t.rchild,x);
            }
        }
        }
 public int Height(){
        return Height1(b);
 }
  private int Height1(BTNode<Character> t){
        int lchildh,rchildh;
        if (t==null) {
            return 0;
        } else{
            lchildh=Height1(t.lchild);
            rchildh=Height1(t.rchild);
            return Math.max(lchildh, rchildh)+1;
        }
  }

    public void PreOrder1(BTreeClass bt)		//先序遍历的递归算法
    {
        PreOrder11(bt.b);
    }
    private void PreOrder11(BTNode t) 	//被PreOrder1方法调用
    {
        if (t!=null)
        {
            System.out.print(t.data+ " ");		//访问根结点
            PreOrder11(t.lchild);			//先序遍历左子树
            PreOrder11(t.rchild);			//先序遍历右子树
        }
    }
    public void InOrder1(BTreeClass bt)		//先序遍历的递归算法
    {
        InOrder11(bt.b);
    }
    private void InOrder11(BTNode t) 	//被PreOrder1方法调用
    {
        if (t!=null)
        {
            InOrder11(t.lchild);			//先序遍历左子树
            System.out.print(t.data+ " ");		//访问根结点
            InOrder11(t.rchild);			//先序遍历右子树
        }
    }
    public void PostOrder1(BTreeClass bt)		//先序遍历的递归算法
    {
        PostOrder11(bt.b);
    }
    private void PostOrder11(BTNode t) 	//被PreOrder1方法调用
    {
        if (t!=null)
        {
            PostOrder11(t.lchild);			//先序遍历左子树
            PostOrder11(t.rchild);			//先序遍历右子树
            System.out.print(t.data+ " ");		//访问根结点
        }
    }

}
