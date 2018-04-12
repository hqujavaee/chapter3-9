package cn.edu.hqu.cst.javaee.performance.impl;

import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.stereotype.Component;

@Component
public class PerformanceManager {
	public void perform(String title) {
		
	}
	public void silenceCellPhones(String title) {
		System.out.println("电影《"+title+"》即将开始，请将手机调为静音！");
	}
	
	public void takeSeats(String title) {
		System.out.println("请坐在自己位置上，不要到处走动");
	}
	public void orderlyRetreat(String title) {
		System.out.println("电影《"+title+"》播放完毕，请大家有序退场");
	}
	public void refound(String title) {
		System.out.println("到售票处退票");
	}
	public void checkSecurity(ProceedingJoinPoint jp,String title) {
		try {
			System.out.println("电影《"+title+"》表演前安全检查");
			jp.proceed();
			System.out.println("电影《"+title+"》表演后安全检查");
		}catch(Throwable e){
			System.out.println("《"+title+"》播放出现问题");
		}
		
	}
	
}
