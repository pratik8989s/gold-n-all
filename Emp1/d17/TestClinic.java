package first;

import java.sql.Date;
import java.util.Scanner;

public class TestClinic {

	public static void main(String[] args) {

		Doctor[] arr = new Doctor[2];
		
		Scanner input= new Scanner(System.in);
		// arr[i] = new Doctor();
		
		for (int i = 0; i < 2; i++) {
			
			Doctor d = new Doctor();
			System.out.println("Enter Doctors id");
			String docId = input.next();
			d.setDocId(docId);
			System.out.println("Enter doc name");
			String name= input.next();
			d.setDocName(name);
			
			for (int j = 0; j < 2; j++) {
				Appointment app = new Appointment();
				//System.out.println("Enter date:");
				app.setAppDate(new Date(15101995));
				
				System.out.println("Enter no of patients");
				app.setNoOfPatients(input.nextInt());
				
				d.addAppointment(app);
			}
			

			
			arr[i]=d;
		}

		
		for (int i = 0; i < 2; i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println("enter the doctor's id");
		String did=input.next();
		boolean flag=false;
		int x=0;
		for (int i = 0; i < 2; i++) {
			
			if(arr[i].getDocId().equals(did))
				
			{
				
				//System.out.println(arr[i]);
				flag=true;
				x=i;
			
			}
			
			
		}
		
		if (flag) {
			System.out.println(arr[x]);
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
