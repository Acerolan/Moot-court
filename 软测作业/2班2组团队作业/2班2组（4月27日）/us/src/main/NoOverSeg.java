package main;

/**算法提高 不重叠的线段
 * 问题描述
　　给出在数轴上的n条线段的左右端点的坐标l,r和它们的价值v，请你选出若干条没有公共点的线段(端点重合也算有公共点)，使得它们的价值和最大，输出最大价值和。
输入格式
　　第一行一个正整数n。

　　接下来n行，每行三个整数l,r,v分别表示一条线段的左端点，右端点和价值。l<r，v>0。
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


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.util.Arrays;
import java.util.Comparator;

public class NoOverSeg {
  static StreamTokenizer in = new StreamTokenizer(new BufferedReader(
      new InputStreamReader(System.in)));

  /**创建runNoOverSeg()方法.
  *
  */
  public int runNoOverSeg(int number,int [] data) {
    //int number = 5;
    //System.out.println(number);
    //return number;
    int fla = 0;
    LineYa[] all = new LineYa[number];  //创建数组
    for (int i = 0; i < number; i++) {
      // 每行三个整数l,r,v分别表示一条线段的左端点，右端点和价值。 l < r ，v > 0。
      int left1 = data[fla];
      fla++;
      int right = data[fla];
      int left = left1;
      fla++;
      int value = data[fla];
      fla++;
      all[i] = new LineYa(left,right, value);
    }

    //调用Comparator接口
    Comparator<LineYa> comparator = new Comparator<LineYa>() {
      @Override
      public int compare(LineYa o1, LineYa o2) {  //将lineYa o1和lineYa o2进行比较
        if (o1.left == o2.left) {
          return o1.right - o2.right;
        }
        return o1.left - o2.left;
      }
    };
    Arrays.sort(all, comparator);               //将元素按照从小到大的顺序排序
    // for( int i = 0 ; i < n ; i++ ) {
    // System.out.println( a[i].l + "  " + a[i].r +"  "+ a[i].v);
    // }
    int[] dp = new int[number];
    int ans = 0;
    for (int i = 0; i < number; i++) { // 第 i 条线段
      dp[i] = all[i].value; // 初始化
      int max = 0;
      for (int j = 0; j < i; j++) {  //选出第i条线段前符合不与第i条线重合的最大价值线段
        if (all[j].right < all[i].left) {
          max = Math.max(max, dp[j]);
        }
      }
      dp[i] += max;
      ans = Math.max(ans, dp[i]);
    }
    return ans;
    //System.out.println(ans);  //输出结果
  }

  /**创建getInt()方法.
   *
   */
  public static int getInt() {
    try {
      in.nextToken();   //获取下一个匹配的字段
    } catch (IOException exception) {
      exception.printStackTrace();
    }
    return (int) in.nval;
  }
}
