package Weekend;
/*
（1）、根据杨梅和香蕉的共性，抽取父类水果（Fruits）
私有属性：水果的形状（shape）和口感（taste）
方法：
①.带参构造函数（参数为shape和taste）
②.创建无参无返回值得方法eat（描述内容为：水果可供人们食用！）
③.重写equals方法，比较两个对象是否相等（比较shape，taste）

（2）、子类Waxberry
私有属性：颜色（color）
方法：
①.调用父类的构造方法，完成属性赋值
②.创建不允许重写的face方法，描述为：杨梅：xx、xx，果味酸甜适中。
③.重写父类eat方法，描述为：杨梅酸甜适中，非常好吃！
④.重写toString方法，输出的表现形式不同（输出shape,color,taste）
⑤.要求Waxberry类不允许有子类

（3）、子类：Banana
私有属性：品种（variety）
方法：
①.带参构造方法为所有属性赋值
②.创建无参无返回值的advantage方法，描述为：xx果形xx,果肉香甜，可供生食。
③.重载要求(2)中的advantage方法（带参数color），描述为：xx颜色为xx

（4）、测试，运行效果参照效果图：
①.实例化2个父类对象，并传入两组相同的参数值
②.调用父类eat方法
③.测试重写equals方法，判断两个对象是否相等
④.实例化子类Waxberry对象，并传入相关参数值
⑤.调用子类face方法和重写父类eat方法后的eat方法
⑥.测试重写toString方法，输出子类对象的信息
⑦.实例化Banana类对象，并传入相关参数值
⑧.调用子类的advantage和它的重载方法
 */
public class Friut {
}
