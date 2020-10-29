package week8;

import java.util.ArrayList;
import java.util.List;
/**
 * @ClassName SpanMartrix
 * @Description TODO
 * @Author 付洁
 * @Date 2020/10/27
 **/
public class SpanMartrix {
    public int rows;

    //列数

    public int cols;

    //非零元素个数

    public int dNum;

    List<Three> list;

    public SpanMartrix(int max) {

        rows=cols=dNum=0;

        list=new ArrayList<>(max);

    }

    //根据用户传来的三元组类数组来初始化稀疏矩阵

    public void evaluate(int rows, int cols, int dNum, Three three[]) {

        this.rows=rows;

        this.cols=cols;

        this.dNum=dNum;

        for (int i = 0; i < dNum; i++) {

            list.add(i,three[i]);

        }

    }

    //打印稀疏矩阵

    public void printSpanMartrix() {

        System.out.println("行数："+this.rows);

        System.out.println("列数："+this.cols);

        System.out.println("非零元素个数："+this.dNum);

        System.out.println("三元组类：");

        for (int i = 0; i < dNum; i++) {

            System.out.println("martrix<"+list.get(i).row+","+list.get(i).col+">="+list.get(i).value);

        }

    }

    //矩阵的转置
    public SpanMartrix transport() {

        SpanMartrix newMartrix=new SpanMartrix(list.size());

        newMartrix.rows=this.cols;

        newMartrix.cols=this.rows;

        newMartrix.dNum=this.dNum;

        for(int i=0;i<dNum;i++) {

            Three three=list.get(i);

            newMartrix.list.add(new Three(three.col,three.row,three.value));

        }
        return newMartrix;

    }

}

