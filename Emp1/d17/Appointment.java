package first;

import java.sql.Date;

public class Appointment {

	
	private Date appDate;
	private int noOfPatients;
	
	
	public Date getAppDate() {
		return appDate;
	}
	public void setAppDate(Date appDate) {
		
		this.appDate = appDate;
	}
	public int getNoOfPatients() {
		return noOfPatients;
	}
	public void setNoOfPatients(int noOfPatients) {
		
		if(noOfPatients>1 && noOfPatients<16)
		{
		this.noOfPatients = noOfPatients;
		}
		else{
			try{
		
			throw new InvalidDataException("");
		
			}
		
		
		catch (InvalidDataException message)
		{
			System.out.println("Invalid data is put");
			
		}
		}
	}
	@Override
	public String toString() {
		return "Appointment [appDate=" + appDate + ", noOfPatients="
				+ noOfPatients + "]";
	}
	
	
	
	
	
	
	
}
