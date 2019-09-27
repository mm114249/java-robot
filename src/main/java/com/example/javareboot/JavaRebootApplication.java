package com.example.javareboot;

import java.awt.*;
import java.util.ArrayList;
import java.util.Random;

public class JavaRebootApplication {

	public static void main(String[] args) throws Exception {
		System.out.println("防掉线服务已经启动。。。。。");
		JavaRebootApplication j = new JavaRebootApplication();
		j.run(null);
	}

	public void run(String... args) throws Exception {
		Robot robot = new Robot();
		ArrayList<Integer> list = new ArrayList<Integer>();
//		list.add(87);
//		list.add(83);
		list.add(65);
		list.add(68);
		list.add(69);
		list.add(81);
		list.add(82);
		list.add(84);
		list.add(90);
		while (true){
			Thread.sleep(60*1000);
			int max=list.size()-1;
			Random generate = new Random();
			int j = generate.nextInt(max);
			int key=list.get(j);
			for(int i=0;i<5;i++){
				robot.keyPress(key);
				robot.delay(1000);
				robot.keyRelease(key);
			}
		}
	}


}
