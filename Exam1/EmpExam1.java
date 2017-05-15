package pom.Exam1;

import java.util.Scanner;

import pom.Emp1.Employee1;
import pom.Emp1.ExamBooking1;
import pom.Emp1.ExamDetails1;
import pom.Emp1.InvalidException;

public class EmpExam1 {

	public static void main(String[] args) {
		int eid;
		String ecode;
		String v="y";
		Employee1 e=new Employee1();
		
		ExamBooking1 eb=new ExamBooking1();
		Scanner sc = new Scanner(System.in);
		ExamDetails1.init();
		
		while(v.equals("y")||v.equals("Y")){
			try{
			eid=(int)Math.round(Math.random()*1000);
			e.setEmpid(eid);
			System.out.println("enter the emp name");
			e.setEmpname(sc.next());
			System.out.println("enter the dept name");
			e.setEmpdept(sc.next());
			System.out.println("enter the exam code");
			ecode=sc.next();
			new Employee1(e.getEmpid(), e.getEmpname(), e.getEmpdept());
			eb.addBooking(e.getEmpname(), ecode);
			System.out.println("do ypu want to continue?(y\n)");
			v=sc.next();
			}
			catch(InvalidException e1){
				System.out.println(e1);
				}
		}
		eb.ExamBooking1("PANKAJ");
		}
	}


