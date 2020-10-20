package week7;

import week6.SqStringClass;

import java.util.Stack;

/**
 * @ClassName SqStackClass
 * @Description TODO
 * @Author 付洁
 * @Date 2020/10/20
 **/
public class SqStackClass<E> {
//    final int intcapacity = 10;
//    private int capacity;
//    private E[] data;
//    private int top;
//
//    public SqStackClass() {
//        data = (E[])new Object[intcapacity];
//        capacity=intcapacity;
//        top=-1;
//    }
//
//    private void updatecapacity(int newcapacity){
//    E[] newdata = (E[])new Object[newcapacity];
//    for (int i=0; i<top;i++){
//        newdata[i] = data[i];
//        capacity = newcapacity;
//        data = newdata;
//    }
//}
//    public boolean empty(){
//         return  top==-1;
//    }
//
//    public void push(E e){
//        if (top==capacity-1){
//            updatecapacity(2*(top+1));
//            top++;
//            data[top] = e;
//        }
//    }


    static char[] in={'a','b','c'};

    public static void main(String[] args){
        fun(0,new Stack<Character>(),"");
    }

    static void fun(int n, Stack<Character> stk, String sout)
    {
        //System.out.println("当前进度"+n+"    "+"当前已出"+sout);

        if(n == in.length && stk.isEmpty()){
            System.out.println(sout);
        }
        else
        {
            Stack<Character> s1=(Stack<Character>) stk.clone();
            Stack<Character> s2=(Stack<Character>) stk.clone();

            if (n <  in.length) {
                s1.push(in[n]);
                fun(n + 1, s1, sout + "");
            }

            if (!s2.isEmpty()){

                String temp=sout+ s2.peek();
                s2.pop();
                fun(n, s2, temp);
            }
        }
    }
}