package Stack;
//给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
//
//有效字符串需满足：
//
//左括号必须用相同类型的右括号闭合。
//左括号必须以正确的顺序闭合。
//注意空字符串可被认为是有效字符串。
//
//示例 1:
//
//输入: "()"
//输出: true
//示例 2:
//
//输入: "()[]{}"
//输出: true
//示例 3:
//
//输入: "(]"
//输出: false
//示例 4:
//
//输入: "([)]"
//输出: false
//示例 5:
//
//输入: "{[]}"
//输出: true

/*
	类似的这种匹配问题，用栈来解决是比较方便的，因为栈本身是先进后出的规则，在匹配方面，根据从字符串中取到的数据，
	与从栈中弹出(pop)的数据进行比较，判断是否配对，以及，是否满足配对规则。

	就本题而言，大致步骤和思想如下：
		1，先行剔除字符个数不是偶数的字符串
		2，创建Chracter类型的 Stack 对象
		3，进行对字符串中所有字符的遍历配对
				a, 从字符串中取出字符，判断字符类型(左侧 or 右侧)后，入栈
				b, 针对右侧符号是否首先出来进行剔除判断
				c, 将栈中字符pop，与字符串中数据进行比较
		4, 判断栈是否为空

 */
import java.util.Stack;

public class ArraySolution {
    public boolean isValid(String s){
        Stack<Character> stack = new Stack<>();
        if(s.length() % 2 != 0){
            return false;
        }
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(c == '(' || c == '{' || c == '['){
                stack.push(c);  //入栈
            }
            else{
                if(stack.isEmpty()){ //如果没有左侧符号，则说明第一个元素是右边类型，直接返回false
                    return false;
                }
                char top = stack.pop(); //出栈
                if(c == ')' && top != '('){
                    return false;
                }
                if(c == '}' && top != '{'){
                    return false;
                }
                if(c == ']' && top != '['){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
