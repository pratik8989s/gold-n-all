package first;

import java.util.ArrayList;

public class Doctor {

	private String docId;
	private String docName;
	private  ArrayList<Appointment> apptList = new ArrayList<Appointment>();
	
	
	
	public String getDocId() {
		return docId;
	}
	public void setDocId(String docId) {
		this.docId = docId;
	}
	public String getDocName() {
		return docName;
	}
	public void setDocName(String docName) {
		this.docName = docName;
	}
	public ArrayList<Appointment> getApptList() {
		return apptList;
	}
	public void setApptList(ArrayList<Appointment> apptList) {
		this.apptList = apptList;
	}
	public void addAppointment(Appointment app)
	{
		
		apptList.add(app);
		
		
	}
	public void printAppoinment()
	{
		System.out.println("Doctor [docId=" + docId + ", docName=" + docName
				+ ", apptList=" + apptList + "]");
	}
	@Override
	public String toString() {
		return "Doctor [docId=" + docId + ", docName=" + docName
				+ ", apptList=" + apptList + "]";
	}
	
	
}
