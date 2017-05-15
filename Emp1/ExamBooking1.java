package pom.Emp1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class ExamBooking1 {
	File f=new File("emp_exam.txt");
	
	public int searchExam(String Examcode)throws InvalidException{
		try{
		return ExamDetails1.ed.get(Examcode);}
	catch(Exception e){
		throw new InvalidException("Invalid Exam Code");
			}
		}

		public void addBooking(String empname, String ExamCode1)throws InvalidException {
			int fee = searchExam(ExamCode1);
			try{
			if(!f.exists()){
				f.createNewFile();
				}
				PrintWriter pr=new PrintWriter(new FileOutputStream(f,true));
				pr.print(Employee1.empid);
				pr.print(";");
				pr.print(empname);
				pr.print(";");
				pr.print(ExamCode1);	
				pr.print(";");
				pr.println(fee);
				pr.close();}
				catch (IOException e) {
				}	
			}
			public void ExamBooking1(String empname)	{
				try{
				BufferedReader br=new BufferedReader(new FileReader(f));
				String s;
				System.out.println("\t\tExam Booking Details\t");
				System.out.println("================================================");
				System.out.println("EmpId\tEName\tExam Code\tFees");
				while((s=br.readLine())!=null){
					//StringTokenizer st=new StringTokenizer(s, ";");
					String d[]=s.split(";");
					if(d[1].equals(empname)){
						System.out.println(s);
					}
					/*while (st.hasMoreTokens()){
						System.out.print(st.nextToken()+"\t");
						}
					System.out.print("\n");
					}*/
				}
				br.close();
				}catch (IOException e) {
				}				
			
			
		
	}
	

}
