package main.java.com.soft2036.study.week6;

/**
 * @ClassName BTNode
 * @Description TODO
 * @Author gqfeng
 * @Date 2020/11/10
 **/
 class BTNode<E> {
     E data;
     BTNode lchild;
     BTNode rchild;
     public BTNode(){
         lchild=rchild=null;}
         public BTNode(E d){
         data=d;
         lchild=rchild=null;
     }
}
