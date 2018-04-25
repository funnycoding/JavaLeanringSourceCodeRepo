package win.xuyanxin.com.javademo.generic.chapter1;

import java.util.ArrayList;

/**
 * Created by xuyan on 2018/4/25.
 *
 * 这里是第一个Demo，一个简单的ArrayList
 *
 * 对比的有不使用ArrayList我们怎样缓存对象
 */
public class ArrayListDemo {

  public static void main(String[] args) {
    ArrayList<String> strings = new ArrayList<>();
    strings.add("Hello World!");
    System.out.println("我们存入ArrayList的字符串是 " + strings.get(0));

    Container container = new Container();
    container.setO(1);
    String o = (String) container.getO(); //cast runtime exception that we cant cast Integer to String
    System.out.println(o);
  }
}
