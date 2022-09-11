package com.clost.stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author clost
 * @date 2022/9/11 10:37
 */
public class PolandNotation {

    public static void main(String[] args) {
        //定义逆波兰表达式
        //(3+4)x5-6 ==>  3 4 + 5 x 6 -

        String suffixExpression = "30 4 + 5 * 6 -";
        List<String> newExpression = getListString(suffixExpression);
        System.out.println(newExpression);

        System.out.println("计算结果为: "+calculate(newExpression));

    }

    public static List<String> getListString(String suffixExpression) {
        String[] newExpression = suffixExpression.split(" ");
        ArrayList<String> list = new ArrayList<>();
        for (String item : newExpression) {
            list.add(item);
        }
        return list;
    }

    public static int calculate(List<String> list) {

        //创建一个栈
        Stack<String> stack = new Stack<>();
        for (String item : list) {
            if (item.matches("\\d+")) {
                stack.push(item);
            } else {
                //取出两个数，运算后再入栈
                int num1 = Integer.parseInt(stack.pop());
                int num2 = Integer.parseInt(stack.pop());
                int result = 0;
                switch (item) {
                    case "+" -> result = num2 + num1;
                    case "-" -> result = num2 - num1;
                    case "*" -> result = num2 * num1;
                    case "/" -> result = num2 / num1;
                    default -> throw new RuntimeException("输出的表达式有误!");
                }

                stack.push(result + "");

            }
        }

        //最后留在栈中的数据即是计算结果
        return Integer.parseInt(stack.pop());
    }

}
