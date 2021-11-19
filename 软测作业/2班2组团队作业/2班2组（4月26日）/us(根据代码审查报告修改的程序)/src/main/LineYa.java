package main;

/**创建lineYa类.
 * 
 */
public class LineYa {
  int left;            //定义左端点、右端点、价值变量
  int right;
  int value;
  
  /**lineYa构造方法,用于给数组a[i]赋值.
   * 
   */
  public LineYa(int left, int right, int value) {
    super();           //调用父类的初始化方法
    this.left = left;  //用成员变量给局部变量数值
    this.right = right;
    this.value = value;
  }
}
