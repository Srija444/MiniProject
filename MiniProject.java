package Projects;
import java.util.*;
class patientdetails{
	private String name,gender,city,address,guardians_name,guardians_address,dateofadmission,status;
	private int age,unique_id;
	 private long AadharCardnumber,contact_number,guardian_number;
	 
	 
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
	
	public String getGuardians_name() {
		return guardians_name;
	}
	public void setGuardians_name(String guardians_name) {
		this.guardians_name = guardians_name;
	}
	
	
	
	
	public String getGuardians_address() {
		return guardians_address;
	}
	public void setGuardians_address(String guardians_address) {
		this.guardians_address = guardians_address;
	}
	
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	
	public String getDateofadmission() {
		return dateofadmission;
	}
	public void setDateofadmission(String dateofadmission) {
		this.dateofadmission = dateofadmission;
	}
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status=status;
	}
	
	public int getUnique_id() {
		return unique_id;
	}
	public void setUnique_id(int unique_id) {
		this.unique_id = unique_id;
	}
	
	
	
	public long getAadharCardnumber() {
		return AadharCardnumber;
	}
	public void setAadharCardnumber(long aadharCardnumber) {
		AadharCardnumber = aadharCardnumber;
	}
	
	
	
	
	public long getContact_number() {
		return contact_number;
	}
	public void setContact_number(long contact_number) {
		this.contact_number = contact_number;
	}
	
	
	public long getGuardian_number() {
		return guardian_number;
	}
	public void setGuardian_number(long guardian_number) {
		this.guardian_number = guardian_number;
	}
	 
}


public class MiniProject {

ArrayList <patientdetails>al=new ArrayList<patientdetails>();

int count2=0;

public void addnamegendercity(Scanner s,int n) {
	
	for(int i=0;i<n;i++) {
		patientdetails pd=new patientdetails();	
	System.out.println("enter patient name: ");
	String name=s.next();
	pd.setName(name);
	count2++;
	System.out.println("patient id generated automatically: ");
	pd.setUnique_id(count2);
	
	System.out.println("enter patient gender: ");
	String gender=s.next();
	pd.setGender(gender);
	System.out.println("enter patient city: ");
	String city=s.next();
	pd.setCity(city);
	
	System.out.println("enter guardiens name: ");
	String gnames=s.next();
	pd.setGuardians_name(gnames);
	System.out.println("enter patient address: ");
	String paddress=s.next();
	pd.setAddress(paddress);
	pd.setStatus("not recovered");
	System.out.println("enter guardien address: ");
	String gaddress=s.next();
	pd.setGuardians_address(gaddress);
	
	do {
		System.out.println("enter age: ");
	int age=s.nextInt();
	if(age>0 && age<=99) {
		pd.setAge(age);
		break;
	}else {
		System.out.println("enter valid age is in between 1 & 99");
	}
	}while(true);
System.out.println("enter date of admission: ");
	String admission=s.next();
	pd.setDateofadmission(admission);
	
	
	
	String input;

	 boolean valid = false;

	 int count = 0;


	 

	 do {

	 if (count == 0) {

	 s.nextLine();

	 }

	 System.out.println("Enter the Contact Number:");

	 input = s.next();


	 

	 if (input.length() == 10 && (input.charAt(0) == '6' || input.charAt(0) == '7' || input.charAt(0) == '8'

	 || input.charAt(0) == '9')) {

	 boolean allDigits = true;

	 for (int j = 0; j < input.length(); j++) {

	 if (!Character.isDigit(input.charAt(j))) {

	 allDigits = false;

	 break;

	 }

	 }

	 if (allDigits) {

	 valid = true;

	 } else {

	 count++;

	 System.out.println("Invalid input. Please enter a valid 10-digit phone number.");

	 }

	 } else {

	 count++;

	 System.out.println("Please enter a valid 10-digit phone number starting with 6, 7, 8, or 9.");

	 }

	 } while (!valid);


	 pd.setContact_number(Long.parseLong(input));
	 
	 
	 
	 String input1;

	 boolean valid1 = false;

	 int count1 = 0;


	 

	 do {

	 if (count1 == 0) {

	 s.nextLine();

	 }

	 System.out.println("Enter the  guardian Contact Number:");

	 input1 = s.nextLine();


	 

	 if (input1.length() == 10 && (input1.charAt(0) == '6' || input1.charAt(0) == '7' || input1.charAt(0) == '8'

	 || input1.charAt(0) == '9')) {

	 boolean allDigits1 = true;

	 for (int j1 = 0; j1 < input1.length(); j1++) {

	 if (!Character.isDigit(input1.charAt(j1))) {

	 allDigits1 = false;

	 break;

	 }

	 }

	 if (allDigits1) {

	 valid1 = true;

	 } else {

	 count1++;

	 System.out.println("Invalid input. Please enter a valid 10-digit phone number.");

	 }

	 } else {

	 count1++;

	 System.out.println("Please enter a valid 10-digit phone number starting with 6, 7, 8, or 9.");

	 }

	 } while (!valid1);


	 pd.setGuardian_number(Long.parseLong(input1));
	 


	 
String input3;
boolean valid3=false;
	 do {

	 System.out.println("Enter the Patient Aadhar Number:");

	 input3 = s.nextLine();


	 

	 if (input3.length() == 12) {

	 boolean allDigits3 = true;

	 for (int k = 0; k < input3.length(); k++) {

	 if (!Character.isDigit(input3.charAt(k))) {

	 allDigits3 = false;

	 break;

	 }

	 }

	 if (allDigits3) {

	 valid3 = true;

	 } else {

	 System.out.println("Invalid input. Please enter a valid 12-digit Aadhar number.");

	 }

	 } else {

	 System.out.println(" Please enter a valid 12-digit Aadhar number ");

	 }

	 } while (!valid3);

	 pd.setAadharCardnumber(Long.parseLong(input3));
	al.add(pd);	
	}
}
	 

public void diplaydetails() {
	for(int i=0;i<al.size();i++) {
		System.out.println(" the patient name is: "+al.get(i).getName());
		System.out.println(" patient id: "+al.get(i).getUnique_id());
		System.out.println(" patient gender: "+al.get(i).getGender());
		System.out.println(" patient city: "+al.get(i).getCity());
		System.out.println(" guardiens name: "+al.get(i).getGuardians_name());
		System.out.println(" patient address: "+al.get(i).getAddress());
		System.out.println(" guardien address: "+al.get(i).getGuardians_address());
		System.out.println(" age: "+al.get(i).getAge());
		System.out.println(" date of admission: "+al.get(i).getDateofadmission());
		System.out.println(" Contact Number: "+al.get(i).getContact_number());
		System.out.println(" guardian Contact Number: "+al.get(i).getGuardian_number());
		System.out.println(" Patient Aadhar Number: "+al.get(i).getAadharCardnumber());
		System.out.println(" patient status: "+al.get(i).getStatus());

	}
}
public void diplaydetails1(patientdetails p) {
	
		System.out.println(" the patient name is: "+p.getName());
		System.out.println(" patient id: "+p.getUnique_id());
		System.out.println(" patient gender: "+p.getGender());
		System.out.println(" patient city: "+p.getCity());
		System.out.println(" guardiens name: "+p.getGuardians_name());
		System.out.println(" patient address: "+p.getAddress());
		System.out.println(" guardien address: "+p.getGuardians_address());
		System.out.println(" age: "+p.getAge());
		System.out.println(" date of admission: "+p.getDateofadmission());
		System.out.println(" Contact Number: "+p.getContact_number());
		System.out.println(" guardian Contact Number: "+p.getGuardian_number());
		System.out.println(" Patient Aadhar Number: "+p.getAadharCardnumber());
		System.out.println(" patient status: "+p.getStatus());
	
}

public void searchid() {
	
	Scanner s=new Scanner(System.in);
	int count=0;
	boolean a=true;
	while(a) {
		try {
	System.out.println("enter patient id which you want: ");
	long id=s.nextLong();
	for(int i=0;i<al.size();i++) {
	
	if(id==al.get(i).getUnique_id()) {
		patientdetails p=al.get(i);
		diplaydetails1(p);
		count++;
		a=false;
	}
	
}
	if(count==0) {
		System.out.println("invalid id");
	}
		}catch(Exception e) {
			System.out.println("enter correct id format");
			s.nextLine();
		}
}
}


public void searchcity() {
	Scanner s=new Scanner(System.in);
	int count=0;
	boolean a=true;
	while(a) {
		try {
	System.out.println("enter city name to get details of patient: ");
	String city=s.next();
	for(int i=0;i<al.size();i++) {
		
		if(city.equals(al.get(i).getCity())) {
			patientdetails p=al.get(i);
			diplaydetails1(p);
			count++;
			a=false;
		}
	}
		
	
	if(count==0) {
		System.out.println("invalid city name");
	
		}
	}catch(Exception e) {
		System.out.println("the enter city name correctly with in string format only");
	}
	}
	
}

public void searchage() {
	Scanner s=new Scanner(System.in);
	int count=0;
	System.out.println("enter age1: ");
	int age1=s.nextInt();
	System.out.println("enter age2: ");
	int age2=s.nextInt();
	for(int i=0;i<al.size();i++) {
		
		if(al.get(i).getAge()>=50 && al.get(i).getAge()<=60) {
			patientdetails p=al.get(i);
			diplaydetails1(p);
			count++;
		}
	}
	
	if(count==0) {
		System.out.println("invalid age");
	}
}


public void removeid() {
	Scanner s=new Scanner(System.in);
	
	System.out.println("enter id to remove the details of patient: ");
	long id=s.nextLong();
	int index=-1;
	for(int i=0;i<al.size();i++) {
		if(id==al.get(i).getUnique_id()) {
			index=i;
			break;
		}
	}
	if(index!=-1) {
		al.remove(index);
		System.out.println("patient details are removed successfully");
	}
	
		else {
		
		
			System.out.println("invalid id");
	
	
		
	}
}



public void markrecovery(int id1) {
	
	for(int i=0;i<al.size();i++) {
		if(id1==al.get(i).getUnique_id()) {
			System.out.println("patient name: "+al.get(i).getName()+" is recovered");
			al.get(i).setStatus("Recoverd");
		}
	}
}
	 public void viewOptions(Scanner s) {
		    do {
		    	System.out.println("=====WELCOME TO AROGYA HOSPITAL=====");
		    System.out.println("1:add patient details");
		    System.out.println("2:Search patient by id ");
		    System.out.println("3:Search patient by city name");
		    System.out.println("4:Search patient by ages");
		    System.out.println("5:remove patient by id");
		    System.out.println("6:view list of patients");
		    System.out.println("7:mark patient as recover by id");
		    System.out.println("0:exit");
		    System.out.println("enter the options ");
		    

		 

		    int option=s.nextInt();
		    switch(option) {
		    case 1:{
		    	boolean a=true;
		    	while(a) {
		       System.out.println("how many patient details you want to enter: ");
		       try{
		    	   int n=s.nextInt();
		    	   addnamegendercity(s,n);
		    	   a=false;
		    	   
		    	   break;
		       }catch(Exception e) {
		    	  System.out.println("enter correct format of details to enter");
		    	  s.nextLine();
		       }
		    	}
		       
		       break;
		    
		    }
		    
		    
		    case 2:{
		    	searchid();
		
		    	break;
		    }
		    	
		    
		    
		    case 3:{
		    	
		    	searchcity();
		    	
		    	break;
		    }
		    	
		    
		    case 4:{
		    	boolean c=true;
		    	while(c) {
		    		try {
		    	searchage();
		    	c=false;
		    	break;
		    		}catch(Exception e) {
		    			System.out.println("enter correct age to search");
		    			s.nextLine();
		    		}
		    }
		    	break;
		    }
		    
		    
		    case 5:{
		    	while(true) {
		    		try {
		    	removeid();
		    	break;
		    		}catch(Exception e) {
		    			System.out.println("enter correct id format: ");
		    			s.nextLine();
		    		}
		    }
		    	break;
		    }
		    case 6:{
		    	System.out.println(" the patient details are: ");
		    	diplaydetails();
		    	break;
		    }
		    case 7:{
		    	System.out.println("enter id: ");
		    	int id=s.nextInt();
		    	markrecovery(id);
		    	break;
		    }
		    case 0:{
		    	System.out.println("===============");
		    	System.out.println(" Thank you ");
		    	System.exit(0);
		    	break;
		    }
		}
		    }while(true);

		 


		}

		 

		
	
	
	

	
	









	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		MiniProject mp=new MiniProject();
		mp.viewOptions(s);
		
	}

}
