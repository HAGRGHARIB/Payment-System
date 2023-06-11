package Phase1_SW;

import java.util.LinkedList;
import java.util.Scanner;

public class PaymentForm implements Form {

	@SuppressWarnings({ "resource", "unchecked" })
	@Override
	public void open() {
		double amountOfMoney;
		int paymentOption;
		
		System.out.println("Enter the  service you want : ");
		Scanner cin = new Scanner(System.in);
		String s = cin.nextLine();
		String S =new String(s);
		DiscountList list =new DiscountList();
		LinkedList<Discount> link=list.getDiscount();
		if(S.equals("Mobile Services Recharge")) {
			/*for (int i = 0; i < link.size(); i++) {
		      if(link.get(i).service_name.equals(S)) {}*/
		 System.out.println("Choose from services\n		1-Mobile Recharge Services We\r\n"
				+ "		2-Mobile Recharge Services Orange\r\n"
				+ "		3- Mobile Recharge Services Vodafone\r\n"
				+ "		4-Mobile Recharge Services Etisalat ");
		}
		else if(S.equals("Internet Payment Services")) {
			/*for (int i = 0; i < link.size(); i++) {
		      if(link.get(i).service_name.equals(S)) {}}*/
	     System.out.println("Choose from services\n5		-Internet Payment Services We\r\n"
				+ "		6- Internet Payment Services Orange\r\n"
				+ "		7- Internet Payment Services Vodafone\r\n"
				+ "	    8-Internet Payment Services Etisalat ");}
		else  if(S.equals("Donations ") ){
			/*for (int i = 0; i < link.size(); i++) {
		      if(link.get(i).service_name.equals(S)) {}*/
		 System.out.println("Choose from services\n		9-Non Profiable Orangizations\r\n"
	
				+ "		10- Schools\r\n"
				+ "		11-Cancer Hospital \r\n ");}
		else  if (S.equals("Landline Services")) {
		System.out.println("Choose from services\n		12-MonthlyReceipt "
				+ "     13- QuarterReceipt");}
		else {
			System.out.println("please enter  correct name from this services ");
		    System.out.println("Mobile Services Recharge\n");
			System.out.println("Internet Payment Services\n");
			System.out.println("Donations \n");
			System.out.println("Landline Services\n");

		    this.open();}

		System.out.println("Enter the  number of  service provider  you want : ");
		int num = cin.nextInt();
	 if(num==1) {
		  Form f=new MWeForm();
		  f.open();
	 }
	 else if(num==2) {
		  Form f=new MOrangeForm();
		  f.open();
	 }
	 else if(num==3) {
		  Form f=new MVodafoneForm();
		  f.open();
	 }
	 else if(num==4) {
		  Form f=new MEtisalatForm();
		  f.open();
	 }
	 else if(num==5) {
		  Form f=new IWeForm();
		  f.open();
	 }
	 else if(num==6) {
		  Form f=new IOrangeForm();
		  f.open();
	 }
	 else if(num==7) {
		  Form f=new IVodafoneForm();
		  f.open();
	 }
	 
	 else if(num==7) {
		  Form f=new IVodafoneForm();
		  f.open();
	 }
	 else if(num==8) {
		  Form f=new IEtisalatForm();
		  f.open();
	 }
	 else if(num==9) {
		  Form f=new NGOsForm();
		  f.open();
	 }
	 else if(num==10) {
		  Form f=new SchoolsForm();
		  f.open();
	 }
	 else if(num==11) {
		  Form f=new CancerHospitalForm();
		  f.open();
	 }
	 else if(num==12) {
		  Form f=new MonthlyReceiptForm();
		  f.open();
	 }
	 else if(num==13) {
		  Form f=new QuarterReceiptForm();
		  f.open();
	 }
	 else
			System.out.println("please enter  available provider");
	 Form f1=new MenueCustomerForm();
	 f1.open();
		
		
	}}


