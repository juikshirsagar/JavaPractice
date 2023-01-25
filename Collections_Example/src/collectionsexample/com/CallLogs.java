package collectionsexample.com;

import java.util.Comparator;
import java.util.Date;

public class CallLogs {
	private String numberCalled ;
	 private Date startTime;
	 private Date endTime;
	 
	public CallLogs(String numberCalled, Date startTime, Date endTime) {
		super();
		this.numberCalled = numberCalled;
		this.startTime = startTime;
		this.endTime = endTime;
	}
	public String getNumberCalled() {
		return numberCalled;
	}
	public void setNumberCalled(String numberCalled) {
		this.numberCalled = numberCalled;
	}
	public Date getStartTime() {
		return startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}
	public Date getEndTime() {
		return endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}
	@Override
	public String toString() {
		return  
		           numberCalled +" \t" +startTime +"\t "+endTime + "\n";
	}
	
	
}
class sortbystart implements Comparator<CallLogs> { 
	  
    // override the compare() method 
	
    public int compare(CallLogs c1, CallLogs c2) 
    {

    return c1.getStartTime().compareTo(c2.getStartTime());
    
    } 
} 