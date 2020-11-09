package main.java.com.soft2036.study.week5;

/**
 * @ClassName Hello
 * @Description TODO
 * @Author gqfeng
 * @Date 2020/11/6
 **/
    public class LinkNode<E>		//单链表结点泛型类
    {
        public static void main(String[] args) {

        }
        E data;
        LinkNode<E> next;
        public LinkNode()		//构造方法
        {   next=null;  }
        public LinkNode(E d)		//重载构造方法
        {  data=d;
            next=null;
        }
    }
    class LinkListClass<E>	//单链表泛型类
    {

        LinkNode<E> head;		//存放头结点
        public LinkListClass()	//构造方法
        {  head=new LinkNode<E>();	//创建头结点
            head.next=null;		//头结点next成员置为next
        }
        //基本运算算法
        public static int Maxcount(LinkListClass<Integer>L) {
            int cnt = 1;
            Integer maxe;
            LinkNode<Integer> p = L.head.next;
            maxe = p.data;
            while (p.next != null) {
                if (p.next.data > maxe) {
                    maxe = p.next.data ;
                    cnt = 1;
                } else if (p.next.data == maxe) {
                    cnt++;
                }
                p = p.next;
            }
            return cnt;
        }
    }

