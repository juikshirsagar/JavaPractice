package collectionsexample.com;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;

import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String args[]) throws ParseException
	{
		
//Date  formating
		String pattern="dd-MM-yyyy hh:mm:ss";
		SimpleDateFormat ft = new SimpleDateFormat (pattern);
		
//		ArrayList
	    ArrayList<CallLogs> list=new  ArrayList<>();
        list.add(new CallLogs("8123456789",ft.parse("10-10-2015 10:00:00"),ft.parse("10-10-2015 16:08:01")));
		list.add( new CallLogs("8123456789",ft.parse("12-10-2015 12:00:00"),ft.parse("18-10-2015 16:08:01")));
		list.add( new CallLogs("8123456789",ft.parse("11-10-2015 12:00:00"),ft.parse("18-10-2015 16:08:01")));
		
		Collections.sort( list,new sortbystart());
		
		 ArrayList<CallLogs> list2=new  ArrayList<>();
		 list2.add(new CallLogs("9123456789",ft.parse("16-10-2015 16:08:01"),ft.parse("10-10-2015 16:08:01")));
		 Collections.sort( list2,new sortbystart());
		 
		 ArrayList<CallLogs> list3=new  ArrayList<>();
		 list3.add(new CallLogs("0422-201430",ft.parse("12-10-2015 12:00:00"),ft.parse("12-10-2015 12:05:16")));
		 list3.add( new CallLogs("0422-201430",ft.parse("12-10-2015 12:06:00"),ft.parse("12-10-2015 12:10:20")));

		 Collections.sort( list3,new sortbystart());
		 
		 ArrayList<CallLogs> list4=new  ArrayList<>();
		 list4.add(new CallLogs("9764318520",ft.parse("13-10-2015 13:00:00"),ft.parse("13-10-2015 13:10:15")));
		 Collections.sort( list4,new sortbystart());
		 
		 ArrayList<CallLogs> list5=new  ArrayList<>();
		 list5.add(new CallLogs("0422-201430",ft.parse("16-10-2015 12:00:00"),ft.parse("16-10-2015 12:05:16")));
		 list5.add( new CallLogs("0422-201430",ft.parse("18-10-2015 14:05:00"),ft.parse("18-10-2015 14:15:00")));
		 list5.add(new CallLogs("0422-201430",ft.parse("19-10-2015 16:08:01"),ft.parse("19-10-2015 16:35:57")));
		
		 Collections.sort( list5,new sortbystart());
		 
		Map<String ,ArrayList>  map=new HashMap<>();
		map.put("C101", list);
		map.put("C103", list2);
		map.put("C105", list3);
		map.put("C107", list4);
		map.put("C109", list5);
		
		//System.out.println(map);

      for(Map.Entry m:map.entrySet())  
		     {  
		        System.out.println( "Costomer Name :"+m.getKey()+"\n"+"Contact Number \t Call Starts  \t\t\t Call Ends"+" \n"+m.getValue().toString());   
		     }  
	}



}
