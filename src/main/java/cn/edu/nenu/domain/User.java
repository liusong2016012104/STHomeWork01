
/*定义学生类*/

package cn.edu.nenu.domain;

import java.io.Serializable;


/*修改前
* 问题：
* 14 是否合理地使用了空格使程序更清晰？
* 01 命名规则是否与所采用的规范保持一致？
* 10 每行是否只声明了一个变量？（特别是那些可能出错的类型）
* 11 变量是否已经在定义的同时初始化？
* */

/*

public class user implements Serializable {

    private long id; //
    private String username; //用户名
    private String password; //密码
    private String name; //姓名
  private String sex; //性别
    private String xuehao,bariday; //学号。生日
}
}
*/

/*修改后*/

public class User implements Serializable {

    private long id; //
    private String username; //用户名
    private String password; //密码
    private String name; //姓名
    private String sex; //性别
    private String stuid; //学号
    private String bairday;//生日
}
