package main;
/**算法提高 不重叠的线段.
 * 问题描述
　　给出在数轴上的n条线段的左右端点的坐标l,r和它们的价值v，请你选出若干条没有公共点的线段(端点重合也算有公共点)，使得它们的价值和最大，输出最大价值和。
输入格式
　　第一行一个正整数n。

　　接下来n行，每行三个整数l,r,v分别表示一条线段的左端点，右端点和价值。l < r , v > 0。
输出格式
　　输出一个整数表示最大价值和。
样例输入
4
1 3 4
3 5 7
5 7 3
2 6 8
样例输出
8
数据规模和约定
　　n<=2000
　　l,r,v<=1000000

 */


public class Main {

  /**.
  * @param args:
  */
  public static void main(String[] args) {
    NoOverSeg runNoOverSeg = new NoOverSeg();      //实例化一个对象

    runNoOverSeg.runNoOverSeg();                   //调用runNoOverSeg()方法

  }

}
