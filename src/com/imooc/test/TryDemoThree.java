package com.imooc.test;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryDemoThree {
	public static void main(String[] args) {
		//1、
		try {
			int result = test();
			System.out.println("one和two的商是：" + result);
		} catch (ArithmeticException e) {
			System.out.println("除数不允许为零");
			e.printStackTrace();
		} catch (InputMismatchException e) {
			System.out.println("请输入整数");
			e.printStackTrace();
		}
		//2、
		try {
			int result2 = test2();
			System.out.println("one和two的商是：" + result2);
		} catch (ArithmeticException e) {
			System.out.println("除数不允许为零");
			e.printStackTrace();
		} catch (InputMismatchException e) {
			System.out.println("请输入整数");
			e.printStackTrace();
		}catch(Exception e) {//必须
			System.out.println("出错啦");
		}

	}

	//通过throws抛出异常时，针对可能出现的多种异常情况，解决方案：
	/*
	 *1、throws后面接多个异常类型，中间用逗号分隔
	 */
	/**
	 * 测试接受数据相除结果的方法
	 * @return 两个接受数据的商
	 * @throws ArithmeticException
	 * @throws InputMismatchException
	 */
	public static int test() throws ArithmeticException,InputMismatchException{
		Scanner input = new Scanner(System.in);
		System.out.println("====运算开始====");
		System.out.print("请输入第一个整数：");
		int one = input.nextInt();
		System.out.print("请输入第二个整数：");
		int two = input.nextInt();
		System.out.println("====运算结束====");
		return one / two;
	}
	/*
	 * 2、throws后面接Exception
	 */
	
	public static int test2() throws Exception{
		Scanner input = new Scanner(System.in);
		System.out.println("====运算开始====");
		System.out.print("请输入第一个整数：");
		int one = input.nextInt();
		System.out.print("请输入第二个整数：");
		int two = input.nextInt();
		System.out.println("====运算结束====");
		return one / two;
	}
}
