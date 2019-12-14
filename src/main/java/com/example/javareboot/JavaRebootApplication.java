package com.example.javareboot;

import java.awt.*;
import java.util.ArrayList;
import java.util.Random;

public class JavaRebootApplication {

	private static final Integer W=87;
	private static final Integer S=83;
	private static final Integer A=65;
	private static final Integer D=68;
	private static final Integer X=88;
	private static final Integer J=74;
	private static final Integer Q=81;



	public static void main(String[] args) throws Exception {
		System.out.println("boot has start .............");
		JavaRebootApplication j = new JavaRebootApplication();
		j.run(null);
	}

	public void run(String... args) throws Exception {
		Robot robot = new Robot();
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(W);
		list.add(S);
		list.add(A);
		list.add(D);
		list.add(X);

		


		while (true){
			//先设置为走动
		robot.keyPress(J);
		robot.delay(100);
		robot.keyRelease(J);

		//进入潜行
		Thread.sleep(1*1000);
		robot.keyPress(Q);
		robot.delay(100);
		robot.keyRelease(Q);
			
			Thread.sleep(20*1000);
			int max=list.size();
			Random generate = new Random();
			int j = generate.nextInt(max);
			int key=list.get(j);
			robot.keyPress(key);
			robot.delay(1000);
			robot.keyRelease(key);
		}
	}


}
