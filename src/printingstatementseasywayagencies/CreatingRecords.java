/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package printingstatementseasywayagencies;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Date;
/**
 *
 * @author Muhammad Taha Azam
 */
 public class CreatingRecords {
     Scanner obj=new Scanner(System.in);
     
      Date obj1=new Date();
      int empArray[]=new int [16];
      
      String clientName[]=new String [150];
      String clientid[]=new String [150];
      String clientdate[]=new String[150];
      double clientamount[]=new  double[150];
              
      String month;
    int  noofemp; int sal;String name1,name2,name3,name4,name5,name6,name7,name8,name9,name10,name11,name12,name13,name14,name15;int n; double rent;
    double electricitybill;double internetpayment;double stationarypayment; double otherexpenses;
    int noofclient;
    public void EmployeeAttributes(int noofemp, int sal, int n,double rent,
            double electricitybill,double internetpayement,double stationarypayement,double otherexpenses,String month)
    {
        this.noofemp=noofemp;
    this.sal=sal;
    this.month=month;
//    this.name=name;
    this.n=n;
    this.electricitybill=electricitybill;
   // this.gasbill=
    this.internetpayment=internetpayement;
    this.stationarypayment=stationarypayement;
    this.otherexpenses=otherexpenses;
    }
    
    int i; double total;
    
    String clientname;double amount; String Clientdate;String ClientID;
    public void ClientAttributes(String Clientname,double amount,String Clientdate,String ClientID){
            this.ClientID=ClientID;
            this.amount=amount;
            this.clientname=clientname;
            this.Clientdate=Clientdate;
    }
    
    
    public void Client(){
        
        System.out.println("For How Many Clients You want to maintain the record ? ");
        noofclient=obj.nextInt();
        
       switch(noofclient){
           case 1:    
       
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        ClientID=obj.nextLine(); ClientID=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientname=obj.nextLine();
        System.out.println("Enter the Date");
        Clientdate=obj.nextLine();
        System.out.println("Enter Amount of"+ClientID);
        amount=obj.nextDouble();
        
        total=amount;
               System.out.println("-----------------------------------------------------------------------------------------------");
           System.out.println("EASY WAYS AGENCIES");
        
           System.out.println("-----------------------------------------------------------------------------------------------");
           System.out.println("Client ID# \t\t\t\t DATE \t\t\t\t  Client Name \t\t\t\t Amount");
           
           System.out.println();
           System.out.println("-----------------------------------------------------------------------------------------------------------------");
           System.out.println(ClientID+"\t\t\t\t "+Clientdate+"\t\t\t"+clientname+"\t\t\t"+total);
           System.out.println("-----------------------------------------------------------------------------------------------------------------");
           System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t Total Amount:   "+total);
           System.out.println("-----------------------------------------------------------------------------------------------------------------");
        
       break;
        
           case 2:
        
        
        System.out.println("Enter the data of CLIENT #01");        
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[0]=obj.nextLine(); clientid[0]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[0]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[0]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[0]);
        clientamount[0]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #02");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[1]=obj.nextLine(); clientid[0]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[1]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[1]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[1]);
        clientamount[1]=obj.nextDouble();
        
        
        total=clientamount[0]+clientamount[1];
          
           break;
        
           case 3:
           
        System.out.println("Enter the data of CLIENT #01");        
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[0]=obj.nextLine(); clientid[0]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[0]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[0]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[0]);
        clientamount[0]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #02");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[1]=obj.nextLine(); clientid[1]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[1]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[1]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[1]);
        clientamount[1]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #03");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[2]=obj.nextLine(); clientid[2]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[2]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[2]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[1]);
        clientamount[2]=obj.nextDouble();
        
        
           break;
           
           case 4:
        
        System.out.println("Enter the data of CLIENT #01");        
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[0]=obj.nextLine(); clientid[0]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[0]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[0]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[0]);
        clientamount[0]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #02");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[1]=obj.nextLine(); clientid[1]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[1]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[1]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[1]);
        clientamount[1]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #03");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[2]=obj.nextLine(); clientid[2]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[2]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[2]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[2]);
        clientamount[2]=obj.nextDouble();
        
        
        System.out.println("Enter the data of CLIENT #04");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[3]=obj.nextLine(); clientid[3]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[3]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[3]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[3]);
        clientamount[3]=obj.nextDouble();
        
        break;
        
           case 5:
        
            
        System.out.println("Enter the data of CLIENT #01");        
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[0]=obj.nextLine(); clientid[0]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[0]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[0]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[0]);
        clientamount[0]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #02");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[1]=obj.nextLine(); clientid[1]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[1]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[1]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[1]);
        clientamount[1]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #03");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[2]=obj.nextLine(); clientid[2]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[2]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[2]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[2]);
        clientamount[2]=obj.nextDouble();
        
        
        System.out.println("Enter the data of CLIENT #04");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[3]=obj.nextLine(); clientid[3]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[3]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[3]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[3]);
        clientamount[3]=obj.nextDouble();
        
            
        System.out.println("Enter the data of CLIENT #05");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[4]=obj.nextLine(); clientid[4]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[4]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[4]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[4]);
        clientamount[4]=obj.nextDouble();
        
        break;
        
           case 6:
               
        
            
        System.out.println("Enter the data of CLIENT #01");        
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[0]=obj.nextLine(); clientid[0]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[0]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[0]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[0]);
        clientamount[0]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #02");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[1]=obj.nextLine(); clientid[1]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[1]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[1]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[1]);
        clientamount[1]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #03");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[2]=obj.nextLine(); clientid[2]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[2]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[2]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[2]);
        clientamount[2]=obj.nextDouble();
        
        
        System.out.println("Enter the data of CLIENT #04");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[3]=obj.nextLine(); clientid[3]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[3]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[3]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[3]);
        clientamount[3]=obj.nextDouble();
        
            
        System.out.println("Enter the data of CLIENT #05");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[4]=obj.nextLine(); clientid[4]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[4]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[4]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[4]);
        clientamount[4]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #06");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[5]=obj.nextLine(); clientid[5]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[5]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[5]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[5]);
        clientamount[5]=obj.nextDouble();
        
        break;
        
           case 7:
        
        System.out.println("Enter the data of CLIENT #01");        
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[0]=obj.nextLine(); clientid[0]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[0]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[0]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[0]);
        clientamount[0]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #02");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[1]=obj.nextLine(); clientid[1]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[1]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[1]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[1]);
        clientamount[1]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #03");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[2]=obj.nextLine(); clientid[2]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[2]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[2]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[2]);
        clientamount[2]=obj.nextDouble();
        
        
        System.out.println("Enter the data of CLIENT #04");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[3]=obj.nextLine(); clientid[3]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[3]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[3]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[3]);
        clientamount[3]=obj.nextDouble();
        
            
        System.out.println("Enter the data of CLIENT #05");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[4]=obj.nextLine(); clientid[4]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[4]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[4]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[4]);
        clientamount[4]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #06");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[5]=obj.nextLine(); clientid[5]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[5]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[5]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[5]);
        clientamount[5]=obj.nextDouble();
        
        
        System.out.println("Enter the data of CLIENT #07");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[7]=obj.nextLine(); clientid[7]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[7]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[7]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[7]);
        clientamount[7]=obj.nextDouble();
        
        break;
           case 8:
        
        System.out.println("Enter the data of CLIENT #01");        
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[0]=obj.nextLine(); clientid[0]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[0]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[0]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[0]);
        clientamount[0]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #02");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[1]=obj.nextLine(); clientid[1]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[1]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[1]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[1]);
        clientamount[1]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #03");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[2]=obj.nextLine(); clientid[2]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[2]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[2]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[2]);
        clientamount[2]=obj.nextDouble();
        
        
        System.out.println("Enter the data of CLIENT #04");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[3]=obj.nextLine(); clientid[3]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[3]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[3]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[3]);
        clientamount[3]=obj.nextDouble();
        
            
        System.out.println("Enter the data of CLIENT #05");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[4]=obj.nextLine(); clientid[4]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[4]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[4]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[4]);
        clientamount[4]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #06");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[5]=obj.nextLine(); clientid[5]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[5]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[5]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[5]);
        clientamount[5]=obj.nextDouble();
        
        
        System.out.println("Enter the data of CLIENT #07");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[7]=obj.nextLine(); clientid[7]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[7]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[7]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[7]);
        clientamount[7]=obj.nextDouble();
        
break;
           case 9:
        
        System.out.println("Enter the data of CLIENT #01");        
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[0]=obj.nextLine(); clientid[0]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[0]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[0]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[0]);
        clientamount[0]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #02");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[1]=obj.nextLine(); clientid[1]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[1]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[1]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[1]);
        clientamount[1]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #03");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[2]=obj.nextLine(); clientid[2]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[2]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[2]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[2]);
        clientamount[2]=obj.nextDouble();
        
        
        System.out.println("Enter the data of CLIENT #04");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[3]=obj.nextLine(); clientid[3]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[3]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[3]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[3]);
        clientamount[3]=obj.nextDouble();
        
            
        System.out.println("Enter the data of CLIENT #05");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[4]=obj.nextLine(); clientid[4]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[4]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[4]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[4]);
        clientamount[4]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #06");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[5]=obj.nextLine(); clientid[5]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[5]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[5]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[5]);
        clientamount[5]=obj.nextDouble();
        
        
        System.out.println("Enter the data of CLIENT #07");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[6]=obj.nextLine(); clientid[6]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[6]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[6]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[6]);
        clientamount[6]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #08");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[7]=obj.nextLine(); clientid[7]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[7]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[7]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[7]);
        clientamount[7]=obj.nextDouble();
        
        
        System.out.println("Enter the data of CLIENT #09");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[8]=obj.nextLine(); clientid[8]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[8]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[8]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[8]);
        clientamount[8]=obj.nextDouble();
        
        break;
             
           case 10:
        
        System.out.println("Enter the data of CLIENT #01");        
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[0]=obj.nextLine(); clientid[0]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[0]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[0]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[0]);
        clientamount[0]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #02");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[1]=obj.nextLine(); clientid[1]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[1]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[1]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[1]);
        clientamount[1]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #03");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[2]=obj.nextLine(); clientid[2]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[2]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[2]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[2]);
        clientamount[2]=obj.nextDouble();
        
        
        System.out.println("Enter the data of CLIENT #04");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[3]=obj.nextLine(); clientid[3]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[3]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[3]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[3]);
        clientamount[3]=obj.nextDouble();
        
            
        System.out.println("Enter the data of CLIENT #05");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[4]=obj.nextLine(); clientid[4]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[4]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[4]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[4]);
        clientamount[4]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #06");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[5]=obj.nextLine(); clientid[5]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[5]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[5]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[5]);
        clientamount[5]=obj.nextDouble();
        
        
        System.out.println("Enter the data of CLIENT #07");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[6]=obj.nextLine(); clientid[7]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[6]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[6]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[6]);
        clientamount[6]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #08");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[7]=obj.nextLine(); clientid[7]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[7]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[7]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[7]);
        clientamount[7]=obj.nextDouble();
        
        
        System.out.println("Enter the data of CLIENT #09");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[8]=obj.nextLine(); clientid[8]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[8]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[8]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[8]);
        clientamount[8]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #10");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[9]=obj.nextLine(); clientid[9]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[9]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[9]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[9]);
        clientamount[9]=obj.nextDouble();
        
      break;
      
           case 11:
        
        System.out.println("Enter the data of CLIENT #01");        
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[0]=obj.nextLine(); clientid[0]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[0]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[0]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[0]);
        clientamount[0]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #02");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[1]=obj.nextLine(); clientid[1]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[1]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[1]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[1]);
        clientamount[1]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #03");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[2]=obj.nextLine(); clientid[2]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[2]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[2]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[2]);
        clientamount[2]=obj.nextDouble();
        
        
        System.out.println("Enter the data of CLIENT #04");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[3]=obj.nextLine(); clientid[3]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[3]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[3]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[3]);
        clientamount[3]=obj.nextDouble();
        
            
        System.out.println("Enter the data of CLIENT #05");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[4]=obj.nextLine(); clientid[4]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[4]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[4]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[4]);
        clientamount[4]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #06");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[5]=obj.nextLine(); clientid[5]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[5]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[5]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[5]);
        clientamount[5]=obj.nextDouble();
        
        
        System.out.println("Enter the data of CLIENT #07");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[6]=obj.nextLine(); clientid[6]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[6]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[6]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[6]);
        clientamount[6]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #08");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[7]=obj.nextLine(); clientid[7]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[7]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[7]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[7]);
        clientamount[7]=obj.nextDouble();
        
        
        System.out.println("Enter the data of CLIENT #09");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[8]=obj.nextLine(); clientid[8]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[8]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[8]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[8]);
        clientamount[8]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #10");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[9]=obj.nextLine(); clientid[9]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[9]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[9]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[9]);
        clientamount[9]=obj.nextDouble();
        
         System.out.println("Enter the data of CLIENT #11");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[10]=obj.nextLine(); clientid[9]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[10]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[10]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[10]);
        clientamount[10]=obj.nextDouble();
        
            break;

           case 12:
        
        System.out.println("Enter the data of CLIENT #01");        
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[0]=obj.nextLine(); clientid[0]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[0]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[0]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[0]);
        clientamount[0]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #02");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[1]=obj.nextLine(); clientid[1]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[1]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[1]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[1]);
        clientamount[1]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #03");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[2]=obj.nextLine(); clientid[2]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[2]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[2]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[2]);
        clientamount[2]=obj.nextDouble();
        
        
        System.out.println("Enter the data of CLIENT #04");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[3]=obj.nextLine(); clientid[3]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[3]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[3]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[3]);
        clientamount[3]=obj.nextDouble();
        
            
        System.out.println("Enter the data of CLIENT #05");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[4]=obj.nextLine(); clientid[4]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[4]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[4]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[4]);
        clientamount[4]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #06");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[5]=obj.nextLine(); clientid[5]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[5]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[5]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[5]);
        clientamount[5]=obj.nextDouble();
        
        
        System.out.println("Enter the data of CLIENT #07");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[6]=obj.nextLine(); clientid[6]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[6]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[6]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[6]);
        clientamount[6]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #08");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[7]=obj.nextLine(); clientid[7]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[7]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[7]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[7]);
        clientamount[7]=obj.nextDouble();
        
        
        System.out.println("Enter the data of CLIENT #09");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[8]=obj.nextLine(); clientid[8]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[8]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[8]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[8]);
        clientamount[8]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #10");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[9]=obj.nextLine(); clientid[9]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[9]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[9]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[9]);
        clientamount[9]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #11");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[10]=obj.nextLine(); clientid[9]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[10]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[10]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[10]);
        clientamount[10]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #12");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[11]=obj.nextLine(); clientid[11]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[11]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[11]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[11]);
        clientamount[11]=obj.nextDouble();
        
        
        
        break;
           case 13:
               
        
        System.out.println("Enter the data of CLIENT #01");        
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[0]=obj.nextLine(); clientid[0]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[0]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[0]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[0]);
        clientamount[0]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #02");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[1]=obj.nextLine(); clientid[1]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[1]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[1]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[1]);
        clientamount[1]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #03");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[2]=obj.nextLine(); clientid[2]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[2]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[2]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[2]);
        clientamount[2]=obj.nextDouble();
        
        
        System.out.println("Enter the data of CLIENT #04");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[3]=obj.nextLine(); clientid[3]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[3]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[3]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[3]);
        clientamount[3]=obj.nextDouble();
        
            
        System.out.println("Enter the data of CLIENT #05");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[4]=obj.nextLine(); clientid[4]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[4]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[4]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[4]);
        clientamount[4]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #06");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[5]=obj.nextLine(); clientid[5]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[5]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[5]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[5]);
        clientamount[5]=obj.nextDouble();
        
        
        System.out.println("Enter the data of CLIENT #07");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[6]=obj.nextLine(); clientid[6]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[6]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[6]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[6]);
        clientamount[6]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #08");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[7]=obj.nextLine(); clientid[7]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[7]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[7]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[7]);
        clientamount[7]=obj.nextDouble();
        
        
        System.out.println("Enter the data of CLIENT #09");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[8]=obj.nextLine(); clientid[8]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[8]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[8]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[8]);
        clientamount[8]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #10");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[9]=obj.nextLine(); clientid[9]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[9]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[9]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[9]);
        clientamount[9]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #11");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[10]=obj.nextLine(); clientid[9]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[10]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[10]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[10]);
        clientamount[10]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #13");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[12]=obj.nextLine(); clientid[12]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[12]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[12]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[12]);
        clientamount[12]=obj.nextDouble(); 
       
break;

           case 14:
        
        System.out.println("Enter the data of CLIENT #01");        
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[0]=obj.nextLine(); clientid[0]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[0]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[0]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[0]);
        clientamount[0]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #02");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[1]=obj.nextLine(); clientid[1]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[1]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[1]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[1]);
        clientamount[1]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #03");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[2]=obj.nextLine(); clientid[2]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[2]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[2]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[2]);
        clientamount[2]=obj.nextDouble();
        
        
        System.out.println("Enter the data of CLIENT #04");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[3]=obj.nextLine(); clientid[3]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[3]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[3]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[3]);
        clientamount[3]=obj.nextDouble();
        
            
        System.out.println("Enter the data of CLIENT #05");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[4]=obj.nextLine(); clientid[4]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[4]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[4]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[4]);
        clientamount[4]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #06");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[5]=obj.nextLine(); clientid[5]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[5]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[5]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[5]);
        clientamount[5]=obj.nextDouble();
        
        
        System.out.println("Enter the data of CLIENT #07");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[6]=obj.nextLine(); clientid[6]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[6]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[6]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[6]);
        clientamount[6]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #08");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[7]=obj.nextLine(); clientid[7]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[7]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[7]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[7]);
        clientamount[7]=obj.nextDouble();
        
        
        System.out.println("Enter the data of CLIENT #09");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[8]=obj.nextLine(); clientid[8]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[8]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[8]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[8]);
        clientamount[8]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #10");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[9]=obj.nextLine(); clientid[9]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[9]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[9]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[9]);
        clientamount[9]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #11");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[10]=obj.nextLine(); clientid[9]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[10]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[10]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[10]);
        clientamount[10]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #13");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[12]=obj.nextLine(); clientid[12]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[12]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[12]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[12]);
        clientamount[12]=obj.nextDouble(); 
        
        
          System.out.println("Enter the data of CLIENT #14");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[13]=obj.nextLine(); clientid[13]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[13]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[13]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[13]);
        clientamount[13]=obj.nextDouble(); 
       
        
        break;
             
           case 15:
        
        System.out.println("Enter the data of CLIENT #01");        
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[0]=obj.nextLine(); clientid[0]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[0]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[0]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[0]);
        clientamount[0]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #02");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[1]=obj.nextLine(); clientid[1]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[1]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[1]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[1]);
        clientamount[1]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #03");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[2]=obj.nextLine(); clientid[2]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[2]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[2]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[2]);
        clientamount[2]=obj.nextDouble();
        
        
        System.out.println("Enter the data of CLIENT #04");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[3]=obj.nextLine(); clientid[3]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[3]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[3]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[3]);
        clientamount[3]=obj.nextDouble();
        
            
        System.out.println("Enter the data of CLIENT #05");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[4]=obj.nextLine(); clientid[4]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[4]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[4]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[4]);
        clientamount[4]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #06");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[5]=obj.nextLine(); clientid[5]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[5]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[5]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[5]);
        clientamount[5]=obj.nextDouble();
        
        
        System.out.println("Enter the data of CLIENT #07");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[6]=obj.nextLine(); clientid[6]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[6]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[6]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[6]);
        clientamount[6]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #08");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[7]=obj.nextLine(); clientid[7]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[7]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[7]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[7]);
        clientamount[7]=obj.nextDouble();
        
        
        System.out.println("Enter the data of CLIENT #09");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[8]=obj.nextLine(); clientid[8]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[8]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[8]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[8]);
        clientamount[8]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #10");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[9]=obj.nextLine(); clientid[9]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[9]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[9]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[9]);
        clientamount[9]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #11");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[10]=obj.nextLine(); clientid[9]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[10]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[10]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[10]);
        clientamount[10]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #13");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[12]=obj.nextLine(); clientid[12]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[12]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[12]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[12]);
        clientamount[12]=obj.nextDouble(); 
        
        
          System.out.println("Enter the data of CLIENT #14");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[13]=obj.nextLine(); clientid[13]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[13]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[13]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[13]);
        clientamount[13]=obj.nextDouble(); 
        
        System.out.println("Enter the data of CLIENT #15");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[14]=obj.nextLine(); clientid[14]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[14]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[14]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[14]);
        clientamount[14]=obj.nextDouble(); 
       
        
        break;
             
           case 16:
        
        System.out.println("Enter the data of CLIENT #01");        
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[0]=obj.nextLine(); clientid[0]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[0]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[0]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[0]);
        clientamount[0]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #02");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[1]=obj.nextLine(); clientid[1]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[1]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[1]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[1]);
        clientamount[1]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #03");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[2]=obj.nextLine(); clientid[2]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[2]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[2]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[2]);
        clientamount[2]=obj.nextDouble();
        
        
        System.out.println("Enter the data of CLIENT #04");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[3]=obj.nextLine(); clientid[3]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[3]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[3]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[3]);
        clientamount[3]=obj.nextDouble();
        
            
        System.out.println("Enter the data of CLIENT #05");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[4]=obj.nextLine(); clientid[4]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[4]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[4]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[4]);
        clientamount[4]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #06");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[5]=obj.nextLine(); clientid[5]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[5]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[5]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[5]);
        clientamount[5]=obj.nextDouble();
        
        
        System.out.println("Enter the data of CLIENT #07");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[6]=obj.nextLine(); clientid[6]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[6]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[6]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[6]);
        clientamount[6]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #08");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[7]=obj.nextLine(); clientid[7]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[7]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[7]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[7]);
        clientamount[7]=obj.nextDouble();
        
        
        System.out.println("Enter the data of CLIENT #09");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[8]=obj.nextLine(); clientid[8]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[8]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[8]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[8]);
        clientamount[8]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #10");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[9]=obj.nextLine(); clientid[9]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[9]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[9]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[9]);
        clientamount[9]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #11");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[10]=obj.nextLine(); clientid[9]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[10]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[10]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[10]);
        clientamount[10]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #13");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[12]=obj.nextLine(); clientid[12]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[12]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[12]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[12]);
        clientamount[12]=obj.nextDouble(); 
        
        
          System.out.println("Enter the data of CLIENT #14");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[13]=obj.nextLine(); clientid[13]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[13]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[13]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[13]);
        clientamount[13]=obj.nextDouble(); 
        
        System.out.println("Enter the data of CLIENT #15");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[14]=obj.nextLine(); clientid[14]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[14]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[14]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[14]);
        clientamount[14]=obj.nextDouble(); 
        
         System.out.println("Enter the data of CLIENT #16");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[15]=obj.nextLine(); clientid[15]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[15]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[15]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[15]);
        clientamount[15]=obj.nextDouble(); 
       
         
        break;
             
           case 17:
        
        System.out.println("Enter the data of CLIENT #01");        
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[0]=obj.nextLine(); clientid[0]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[0]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[0]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[0]);
        clientamount[0]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #02");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[1]=obj.nextLine(); clientid[1]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[1]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[1]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[1]);
        clientamount[1]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #03");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[2]=obj.nextLine(); clientid[2]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[2]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[2]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[2]);
        clientamount[2]=obj.nextDouble();
        
        
        System.out.println("Enter the data of CLIENT #04");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[3]=obj.nextLine(); clientid[3]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[3]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[3]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[3]);
        clientamount[3]=obj.nextDouble();
        
            
        System.out.println("Enter the data of CLIENT #05");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[4]=obj.nextLine(); clientid[4]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[4]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[4]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[4]);
        clientamount[4]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #06");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[5]=obj.nextLine(); clientid[5]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[5]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[5]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[5]);
        clientamount[5]=obj.nextDouble();
        
        
        System.out.println("Enter the data of CLIENT #07");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[6]=obj.nextLine(); clientid[6]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[6]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[6]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[6]);
        clientamount[6]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #08");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[7]=obj.nextLine(); clientid[7]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[7]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[7]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[7]);
        clientamount[7]=obj.nextDouble();
        
        
        System.out.println("Enter the data of CLIENT #09");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[8]=obj.nextLine(); clientid[8]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[8]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[8]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[8]);
        clientamount[8]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #10");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[9]=obj.nextLine(); clientid[9]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[9]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[9]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[9]);
        clientamount[9]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #11");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[10]=obj.nextLine(); clientid[9]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[10]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[10]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[10]);
        clientamount[10]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #13");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[12]=obj.nextLine(); clientid[12]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[12]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[12]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[12]);
        clientamount[12]=obj.nextDouble(); 
        
        
          System.out.println("Enter the data of CLIENT #14");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[13]=obj.nextLine(); clientid[13]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[13]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[13]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[13]);
        clientamount[13]=obj.nextDouble(); 
        
        System.out.println("Enter the data of CLIENT #15");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[14]=obj.nextLine(); clientid[14]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[14]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[14]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[14]);
        clientamount[14]=obj.nextDouble(); 
        
         System.out.println("Enter the data of CLIENT #16");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[15]=obj.nextLine(); clientid[15]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[15]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[15]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[14]);
        clientamount[15]=obj.nextDouble(); 
        
        
        
         System.out.println("Enter the data of CLIENT #17");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[16]=obj.nextLine(); clientid[16]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[16]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[16]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[16]);
        clientamount[16]=obj.nextDouble(); 
       
        
        break;
             
           case 18:
        
        System.out.println("Enter the data of CLIENT #01");        
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[0]=obj.nextLine(); clientid[0]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[0]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[0]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[0]);
        clientamount[0]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #02");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[1]=obj.nextLine(); clientid[1]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[1]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[1]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[1]);
        clientamount[1]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #03");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[2]=obj.nextLine(); clientid[2]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[2]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[2]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[2]);
        clientamount[2]=obj.nextDouble();
        
        
        System.out.println("Enter the data of CLIENT #04");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[3]=obj.nextLine(); clientid[3]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[3]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[3]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[3]);
        clientamount[3]=obj.nextDouble();
        
            
        System.out.println("Enter the data of CLIENT #05");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[4]=obj.nextLine(); clientid[4]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[4]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[4]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[4]);
        clientamount[4]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #06");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[5]=obj.nextLine(); clientid[5]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[5]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[5]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[5]);
        clientamount[5]=obj.nextDouble();
        
        
        System.out.println("Enter the data of CLIENT #07");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[6]=obj.nextLine(); clientid[6]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[6]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[6]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[6]);
        clientamount[6]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #08");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[7]=obj.nextLine(); clientid[7]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[7]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[7]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[7]);
        clientamount[7]=obj.nextDouble();
        
        
        System.out.println("Enter the data of CLIENT #09");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[8]=obj.nextLine(); clientid[8]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[8]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[8]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[8]);
        clientamount[8]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #10");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[9]=obj.nextLine(); clientid[9]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[9]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[9]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[9]);
        clientamount[9]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #11");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[10]=obj.nextLine(); clientid[9]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[10]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[10]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[10]);
        clientamount[10]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #13");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[12]=obj.nextLine(); clientid[12]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[12]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[12]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[12]);
        clientamount[12]=obj.nextDouble(); 
        
        
          System.out.println("Enter the data of CLIENT #14");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[13]=obj.nextLine(); clientid[13]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[13]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[13]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[13]);
        clientamount[13]=obj.nextDouble(); 
        
        System.out.println("Enter the data of CLIENT #15");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[14]=obj.nextLine(); clientid[14]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[14]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[14]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[14]);
        clientamount[14]=obj.nextDouble(); 
        
         System.out.println("Enter the data of CLIENT #16");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[15]=obj.nextLine(); clientid[15]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[15]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[15]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[14]);
        clientamount[15]=obj.nextDouble(); 
        
        
        
         System.out.println("Enter the data of CLIENT #17");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[16]=obj.nextLine(); clientid[16]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[16]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[16]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[16]);
        clientamount[16]=obj.nextDouble(); 
        
        
        System.out.println("Enter the data of CLIENT #18");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[17]=obj.nextLine(); clientid[17]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[17]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[17]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[17]);
        clientamount[17]=obj.nextDouble(); 
       
        
        break;
        
           case 19:
        
        System.out.println("Enter the data of CLIENT #01");        
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[0]=obj.nextLine(); clientid[0]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[0]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[0]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[0]);
        clientamount[0]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #02");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[1]=obj.nextLine(); clientid[1]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[1]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[1]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[1]);
        clientamount[1]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #03");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[2]=obj.nextLine(); clientid[2]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[2]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[2]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[2]);
        clientamount[2]=obj.nextDouble();
        
        
        System.out.println("Enter the data of CLIENT #04");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[3]=obj.nextLine(); clientid[3]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[3]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[3]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[3]);
        clientamount[3]=obj.nextDouble();
        
            
        System.out.println("Enter the data of CLIENT #05");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[4]=obj.nextLine(); clientid[4]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[4]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[4]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[4]);
        clientamount[4]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #06");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[5]=obj.nextLine(); clientid[5]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[5]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[5]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[5]);
        clientamount[5]=obj.nextDouble();
        
        
        System.out.println("Enter the data of CLIENT #07");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[6]=obj.nextLine(); clientid[6]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[6]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[6]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[6]);
        clientamount[6]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #08");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[7]=obj.nextLine(); clientid[7]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[7]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[7]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[7]);
        clientamount[7]=obj.nextDouble();
        
        
        System.out.println("Enter the data of CLIENT #09");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[8]=obj.nextLine(); clientid[8]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[8]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[8]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[8]);
        clientamount[8]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #10");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[9]=obj.nextLine(); clientid[9]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[9]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[9]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[9]);
        clientamount[9]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #11");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[10]=obj.nextLine(); clientid[9]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[10]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[10]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[10]);
        clientamount[10]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #13");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[12]=obj.nextLine(); clientid[12]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[12]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[12]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[12]);
        clientamount[12]=obj.nextDouble(); 
        
        
          System.out.println("Enter the data of CLIENT #14");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[13]=obj.nextLine(); clientid[13]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[13]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[13]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[13]);
        clientamount[13]=obj.nextDouble(); 
        
        System.out.println("Enter the data of CLIENT #15");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[14]=obj.nextLine(); clientid[14]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[14]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[14]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[14]);
        clientamount[14]=obj.nextDouble(); 
        
         System.out.println("Enter the data of CLIENT #16");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[15]=obj.nextLine(); clientid[15]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[15]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[15]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[14]);
        clientamount[15]=obj.nextDouble(); 
        
        
        
         System.out.println("Enter the data of CLIENT #17");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[16]=obj.nextLine(); clientid[16]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[16]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[16]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[16]);
        clientamount[16]=obj.nextDouble(); 
        
        
        System.out.println("Enter the data of CLIENT #18");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[17]=obj.nextLine(); clientid[17]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[17]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[17]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[17]);
        clientamount[17]=obj.nextDouble(); 
       
        System.out.println("Enter the data of CLIENT #19");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[18]=obj.nextLine(); clientid[18]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[18]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[18]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[18]);
        clientamount[18]=obj.nextDouble(); 
       
        
        break;
            

           case 20:
        System.out.println("Enter the data of CLIENT #01");        
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[0]=obj.nextLine(); clientid[0]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[0]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[0]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[0]);
        clientamount[0]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #02");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[1]=obj.nextLine(); clientid[1]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[1]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[1]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[1]);
        clientamount[1]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #03");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[2]=obj.nextLine(); clientid[2]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[2]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[2]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[2]);
        clientamount[2]=obj.nextDouble();
        
        
        System.out.println("Enter the data of CLIENT #04");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[3]=obj.nextLine(); clientid[3]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[3]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[3]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[3]);
        clientamount[3]=obj.nextDouble();
        
            
        System.out.println("Enter the data of CLIENT #05");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[4]=obj.nextLine(); clientid[4]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[4]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[4]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[4]);
        clientamount[4]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #06");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[5]=obj.nextLine(); clientid[5]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[5]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[5]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[5]);
        clientamount[5]=obj.nextDouble();
        
        
        System.out.println("Enter the data of CLIENT #07");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[6]=obj.nextLine(); clientid[6]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[6]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[6]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[6]);
        clientamount[6]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #08");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[7]=obj.nextLine(); clientid[7]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[7]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[7]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[7]);
        clientamount[7]=obj.nextDouble();
        
        
        System.out.println("Enter the data of CLIENT #09");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[8]=obj.nextLine(); clientid[8]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[8]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[8]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[8]);
        clientamount[8]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #10");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[9]=obj.nextLine(); clientid[9]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[9]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[9]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[9]);
        clientamount[9]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #11");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[10]=obj.nextLine(); clientid[9]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[10]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[10]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[10]);
        clientamount[10]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #13");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[12]=obj.nextLine(); clientid[12]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[12]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[12]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[12]);
        clientamount[12]=obj.nextDouble(); 
        
        
          System.out.println("Enter the data of CLIENT #14");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[13]=obj.nextLine(); clientid[13]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[13]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[13]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[13]);
        clientamount[13]=obj.nextDouble(); 
        
        System.out.println("Enter the data of CLIENT #15");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[14]=obj.nextLine(); clientid[14]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[14]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[14]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[14]);
        clientamount[14]=obj.nextDouble(); 
        
         System.out.println("Enter the data of CLIENT #16");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[15]=obj.nextLine(); clientid[15]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[15]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[15]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[14]);
        clientamount[15]=obj.nextDouble(); 
        
        
        
         System.out.println("Enter the data of CLIENT #17");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[16]=obj.nextLine(); clientid[16]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[16]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[16]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[16]);
        clientamount[16]=obj.nextDouble(); 
        
        
        System.out.println("Enter the data of CLIENT #18");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[17]=obj.nextLine(); clientid[17]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[17]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[17]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[17]);
        clientamount[17]=obj.nextDouble(); 
       
        System.out.println("Enter the data of CLIENT #19");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[18]=obj.nextLine(); clientid[18]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[18]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[18]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[18]);
        clientamount[18]=obj.nextDouble(); 
        
        System.out.println("Enter the data of CLIENT #20");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[19]=obj.nextLine(); clientid[19]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[19]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[19]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[19]);
        clientamount[19]=obj.nextDouble(); 
       
       break;
        
        
             
           case 21:
        
        System.out.println("Enter the data of CLIENT #01");        
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[0]=obj.nextLine(); clientid[0]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[0]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[0]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[0]);
        clientamount[0]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #02");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[1]=obj.nextLine(); clientid[1]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[1]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[1]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[1]);
        clientamount[1]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #03");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[2]=obj.nextLine(); clientid[2]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[2]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[2]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[2]);
        clientamount[2]=obj.nextDouble();
        
        
        System.out.println("Enter the data of CLIENT #04");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[3]=obj.nextLine(); clientid[3]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[3]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[3]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[3]);
        clientamount[3]=obj.nextDouble();
        
            
        System.out.println("Enter the data of CLIENT #05");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[4]=obj.nextLine(); clientid[4]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[4]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[4]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[4]);
        clientamount[4]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #06");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[5]=obj.nextLine(); clientid[5]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[5]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[5]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[5]);
        clientamount[5]=obj.nextDouble();
        
        
        System.out.println("Enter the data of CLIENT #07");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[6]=obj.nextLine(); clientid[6]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[6]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[6]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[6]);
        clientamount[6]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #08");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[7]=obj.nextLine(); clientid[7]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[7]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[7]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[7]);
        clientamount[7]=obj.nextDouble();
        
        
        System.out.println("Enter the data of CLIENT #09");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[8]=obj.nextLine(); clientid[8]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[8]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[8]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[8]);
        clientamount[8]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #10");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[9]=obj.nextLine(); clientid[9]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[9]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[9]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[9]);
        clientamount[9]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #11");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[10]=obj.nextLine(); clientid[9]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[10]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[10]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[10]);
        clientamount[10]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #13");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[12]=obj.nextLine(); clientid[12]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[12]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[12]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[12]);
        clientamount[12]=obj.nextDouble(); 
        
        
          System.out.println("Enter the data of CLIENT #14");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[13]=obj.nextLine(); clientid[13]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[13]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[13]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[13]);
        clientamount[13]=obj.nextDouble(); 
        
        System.out.println("Enter the data of CLIENT #15");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[14]=obj.nextLine(); clientid[14]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[14]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[14]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[14]);
        clientamount[14]=obj.nextDouble(); 
        
         System.out.println("Enter the data of CLIENT #16");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[15]=obj.nextLine(); clientid[15]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[15]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[15]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[14]);
        clientamount[15]=obj.nextDouble(); 
        
        
        
         System.out.println("Enter the data of CLIENT #17");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[16]=obj.nextLine(); clientid[16]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[16]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[16]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[16]);
        clientamount[16]=obj.nextDouble(); 
        
        
        System.out.println("Enter the data of CLIENT #18");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[17]=obj.nextLine(); clientid[17]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[17]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[17]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[17]);
        clientamount[17]=obj.nextDouble(); 
       
        System.out.println("Enter the data of CLIENT #19");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[18]=obj.nextLine(); clientid[18]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[18]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[18]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[18]);
        clientamount[18]=obj.nextDouble(); 
        
        System.out.println("Enter the data of CLIENT #20");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[19]=obj.nextLine(); clientid[19]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[19]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[19]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[19]);
        clientamount[19]=obj.nextDouble(); 
        
         System.out.println("Enter the data of CLIENT #21");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[20]=obj.nextLine(); clientid[20]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[20]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[20]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[20]);
        clientamount[20]=obj.nextDouble(); 
       
       
        
        break;
             
           case 22:
        
        System.out.println("Enter the data of CLIENT #01");        
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[0]=obj.nextLine(); clientid[0]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[0]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[0]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[0]);
        clientamount[0]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #02");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[1]=obj.nextLine(); clientid[1]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[1]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[1]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[1]);
        clientamount[1]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #03");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[2]=obj.nextLine(); clientid[2]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[2]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[2]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[2]);
        clientamount[2]=obj.nextDouble();
        
        
        System.out.println("Enter the data of CLIENT #04");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[3]=obj.nextLine(); clientid[3]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[3]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[3]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[3]);
        clientamount[3]=obj.nextDouble();
        
            
        System.out.println("Enter the data of CLIENT #05");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[4]=obj.nextLine(); clientid[4]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[4]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[4]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[4]);
        clientamount[4]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #06");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[5]=obj.nextLine(); clientid[5]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[5]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[5]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[5]);
        clientamount[5]=obj.nextDouble();
        
        
        System.out.println("Enter the data of CLIENT #07");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[6]=obj.nextLine(); clientid[6]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[6]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[6]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[6]);
        clientamount[6]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #08");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[7]=obj.nextLine(); clientid[7]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[7]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[7]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[7]);
        clientamount[7]=obj.nextDouble();
        
        
        System.out.println("Enter the data of CLIENT #09");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[8]=obj.nextLine(); clientid[8]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[8]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[8]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[8]);
        clientamount[8]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #10");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[9]=obj.nextLine(); clientid[9]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[9]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[9]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[9]);
        clientamount[9]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #11");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[10]=obj.nextLine(); clientid[9]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[10]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[10]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[10]);
        clientamount[10]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #13");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[12]=obj.nextLine(); clientid[12]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[12]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[12]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[12]);
        clientamount[12]=obj.nextDouble(); 
        
        
          System.out.println("Enter the data of CLIENT #14");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[13]=obj.nextLine(); clientid[13]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[13]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[13]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[13]);
        clientamount[13]=obj.nextDouble(); 
        
        System.out.println("Enter the data of CLIENT #15");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[14]=obj.nextLine(); clientid[14]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[14]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[14]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[14]);
        clientamount[14]=obj.nextDouble(); 
        
         System.out.println("Enter the data of CLIENT #16");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[15]=obj.nextLine(); clientid[15]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[15]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[15]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[14]);
        clientamount[15]=obj.nextDouble(); 
        
        
        
         System.out.println("Enter the data of CLIENT #17");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[16]=obj.nextLine(); clientid[16]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[16]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[16]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[16]);
        clientamount[16]=obj.nextDouble(); 
        
        
        System.out.println("Enter the data of CLIENT #18");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[17]=obj.nextLine(); clientid[17]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[17]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[17]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[17]);
        clientamount[17]=obj.nextDouble(); 
       
        System.out.println("Enter the data of CLIENT #19");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[18]=obj.nextLine(); clientid[18]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[18]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[18]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[18]);
        clientamount[18]=obj.nextDouble(); 
        
        System.out.println("Enter the data of CLIENT #20");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[19]=obj.nextLine(); clientid[19]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[19]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[19]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[19]);
        clientamount[19]=obj.nextDouble(); 
        
         System.out.println("Enter the data of CLIENT #21");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[20]=obj.nextLine(); clientid[20]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[20]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[20]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[20]);
        clientamount[20]=obj.nextDouble(); 
        
        System.out.println("Enter the data of CLIENT #22");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[21]=obj.nextLine(); clientid[21]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[21]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[21]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[21]);
        clientamount[21]=obj.nextDouble(); 
       
       
        
        break;
             
           case 23:
        
        System.out.println("Enter the data of CLIENT #01");        
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[0]=obj.nextLine(); clientid[0]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[0]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[0]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[0]);
        clientamount[0]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #02");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[1]=obj.nextLine(); clientid[1]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[1]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[1]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[1]);
        clientamount[1]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #03");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[2]=obj.nextLine(); clientid[2]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[2]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[2]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[2]);
        clientamount[2]=obj.nextDouble();
        
        
        System.out.println("Enter the data of CLIENT #04");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[3]=obj.nextLine(); clientid[3]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[3]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[3]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[3]);
        clientamount[3]=obj.nextDouble();
        
            
        System.out.println("Enter the data of CLIENT #05");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[4]=obj.nextLine(); clientid[4]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[4]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[4]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[4]);
        clientamount[4]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #06");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[5]=obj.nextLine(); clientid[5]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[5]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[5]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[5]);
        clientamount[5]=obj.nextDouble();
        
        
        System.out.println("Enter the data of CLIENT #07");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[6]=obj.nextLine(); clientid[6]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[6]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[6]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[6]);
        clientamount[6]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #08");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[7]=obj.nextLine(); clientid[7]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[7]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[7]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[7]);
        clientamount[7]=obj.nextDouble();
        
        
        System.out.println("Enter the data of CLIENT #09");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[8]=obj.nextLine(); clientid[8]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[8]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[8]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[8]);
        clientamount[8]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #10");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[9]=obj.nextLine(); clientid[9]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[9]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[9]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[9]);
        clientamount[9]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #11");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[10]=obj.nextLine(); clientid[9]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[10]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[10]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[10]);
        clientamount[10]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #13");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[12]=obj.nextLine(); clientid[12]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[12]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[12]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[12]);
        clientamount[12]=obj.nextDouble(); 
        
        
          System.out.println("Enter the data of CLIENT #14");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[13]=obj.nextLine(); clientid[13]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[13]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[13]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[13]);
        clientamount[13]=obj.nextDouble(); 
        
        System.out.println("Enter the data of CLIENT #15");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[14]=obj.nextLine(); clientid[14]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[14]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[14]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[14]);
        clientamount[14]=obj.nextDouble(); 
        
         System.out.println("Enter the data of CLIENT #16");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[15]=obj.nextLine(); clientid[15]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[15]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[15]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[14]);
        clientamount[15]=obj.nextDouble(); 
        
        
        
         System.out.println("Enter the data of CLIENT #17");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[16]=obj.nextLine(); clientid[16]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[16]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[16]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[16]);
        clientamount[16]=obj.nextDouble(); 
        
        
        System.out.println("Enter the data of CLIENT #18");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[17]=obj.nextLine(); clientid[17]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[17]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[17]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[17]);
        clientamount[17]=obj.nextDouble(); 
       
        System.out.println("Enter the data of CLIENT #19");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[18]=obj.nextLine(); clientid[18]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[18]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[18]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[18]);
        clientamount[18]=obj.nextDouble(); 
        
        System.out.println("Enter the data of CLIENT #20");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[19]=obj.nextLine(); clientid[19]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[19]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[19]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[19]);
        clientamount[19]=obj.nextDouble(); 
        
         System.out.println("Enter the data of CLIENT #21");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[20]=obj.nextLine(); clientid[20]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[20]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[20]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[20]);
        clientamount[20]=obj.nextDouble(); 
        
        System.out.println("Enter the data of CLIENT #22");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[21]=obj.nextLine(); clientid[21]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[21]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[21]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[21]);
        clientamount[21]=obj.nextDouble(); 
        
        
         System.out.println("Enter the data of CLIENT #23");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[22]=obj.nextLine(); clientid[22]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[22]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[22]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[22]);
        clientamount[22]=obj.nextDouble(); 
       
       
        
        break;
             
           case 24:
        
        System.out.println("Enter the data of CLIENT #01");        
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[0]=obj.nextLine(); clientid[0]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[0]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[0]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[0]);
        clientamount[0]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #02");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[1]=obj.nextLine(); clientid[1]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[1]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[1]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[1]);
        clientamount[1]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #03");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[2]=obj.nextLine(); clientid[2]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[2]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[2]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[2]);
        clientamount[2]=obj.nextDouble();
        
        
        System.out.println("Enter the data of CLIENT #04");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[3]=obj.nextLine(); clientid[3]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[3]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[3]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[3]);
        clientamount[3]=obj.nextDouble();
        
            
        System.out.println("Enter the data of CLIENT #05");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[4]=obj.nextLine(); clientid[4]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[4]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[4]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[4]);
        clientamount[4]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #06");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[5]=obj.nextLine(); clientid[5]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[5]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[5]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[5]);
        clientamount[5]=obj.nextDouble();
        
        
        System.out.println("Enter the data of CLIENT #07");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[6]=obj.nextLine(); clientid[6]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[6]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[6]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[6]);
        clientamount[6]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #08");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[7]=obj.nextLine(); clientid[7]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[7]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[7]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[7]);
        clientamount[7]=obj.nextDouble();
        
        
        System.out.println("Enter the data of CLIENT #09");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[8]=obj.nextLine(); clientid[8]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[8]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[8]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[8]);
        clientamount[8]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #10");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[9]=obj.nextLine(); clientid[9]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[9]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[9]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[9]);
        clientamount[9]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #11");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[10]=obj.nextLine(); clientid[9]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[10]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[10]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[10]);
        clientamount[10]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #13");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[12]=obj.nextLine(); clientid[12]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[12]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[12]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[12]);
        clientamount[12]=obj.nextDouble(); 
        
        
          System.out.println("Enter the data of CLIENT #14");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[13]=obj.nextLine(); clientid[13]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[13]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[13]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[13]);
        clientamount[13]=obj.nextDouble(); 
        
        System.out.println("Enter the data of CLIENT #15");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[14]=obj.nextLine(); clientid[14]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[14]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[14]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[14]);
        clientamount[14]=obj.nextDouble(); 
        
         System.out.println("Enter the data of CLIENT #16");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[15]=obj.nextLine(); clientid[15]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[15]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[15]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[14]);
        clientamount[15]=obj.nextDouble(); 
        
        
        
         System.out.println("Enter the data of CLIENT #17");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[16]=obj.nextLine(); clientid[16]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[16]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[16]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[16]);
        clientamount[16]=obj.nextDouble(); 
        
        
        System.out.println("Enter the data of CLIENT #18");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[17]=obj.nextLine(); clientid[17]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[17]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[17]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[17]);
        clientamount[17]=obj.nextDouble(); 
       
        System.out.println("Enter the data of CLIENT #19");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[18]=obj.nextLine(); clientid[18]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[18]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[18]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[18]);
        clientamount[18]=obj.nextDouble(); 
        
        System.out.println("Enter the data of CLIENT #20");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[19]=obj.nextLine(); clientid[19]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[19]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[19]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[19]);
        clientamount[19]=obj.nextDouble(); 
        
         System.out.println("Enter the data of CLIENT #21");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[20]=obj.nextLine(); clientid[20]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[20]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[20]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[20]);
        clientamount[20]=obj.nextDouble(); 
        
        System.out.println("Enter the data of CLIENT #22");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[21]=obj.nextLine(); clientid[21]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[21]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[21]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[21]);
        clientamount[21]=obj.nextDouble(); 
        
        
         System.out.println("Enter the data of CLIENT #23");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[22]=obj.nextLine(); clientid[22]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[22]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[22]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[22]);
        clientamount[22]=obj.nextDouble(); 
        
         System.out.println("Enter the data of CLIENT #24");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[23]=obj.nextLine(); clientid[23]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[23]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[23]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[23]);
        clientamount[23]=obj.nextDouble(); 
         
        break;
       
        
        
             
           case 25:
        
        System.out.println("Enter the data of CLIENT #01");        
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[0]=obj.nextLine(); clientid[0]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[0]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[0]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[0]);
        clientamount[0]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #02");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[1]=obj.nextLine(); clientid[1]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[1]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[1]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[1]);
        clientamount[1]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #03");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[2]=obj.nextLine(); clientid[2]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[2]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[2]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[2]);
        clientamount[2]=obj.nextDouble();
        
        
        System.out.println("Enter the data of CLIENT #04");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[3]=obj.nextLine(); clientid[3]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[3]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[3]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[3]);
        clientamount[3]=obj.nextDouble();
        
            
        System.out.println("Enter the data of CLIENT #05");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[4]=obj.nextLine(); clientid[4]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[4]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[4]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[4]);
        clientamount[4]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #06");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[5]=obj.nextLine(); clientid[5]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[5]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[5]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[5]);
        clientamount[5]=obj.nextDouble();
        
        
        System.out.println("Enter the data of CLIENT #07");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[6]=obj.nextLine(); clientid[6]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[6]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[6]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[6]);
        clientamount[6]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #08");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[7]=obj.nextLine(); clientid[7]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[7]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[7]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[7]);
        clientamount[7]=obj.nextDouble();
        
        
        System.out.println("Enter the data of CLIENT #09");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[8]=obj.nextLine(); clientid[8]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[8]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[8]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[8]);
        clientamount[8]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #10");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[9]=obj.nextLine(); clientid[9]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[9]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[9]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[9]);
        clientamount[9]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #11");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[10]=obj.nextLine(); clientid[9]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[10]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[10]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[10]);
        clientamount[10]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #13");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[12]=obj.nextLine(); clientid[12]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[12]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[12]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[12]);
        clientamount[12]=obj.nextDouble(); 
        
        
          System.out.println("Enter the data of CLIENT #14");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[13]=obj.nextLine(); clientid[13]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[13]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[13]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[13]);
        clientamount[13]=obj.nextDouble(); 
        
        System.out.println("Enter the data of CLIENT #15");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[14]=obj.nextLine(); clientid[14]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[14]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[14]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[14]);
        clientamount[14]=obj.nextDouble(); 
        
         System.out.println("Enter the data of CLIENT #16");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[15]=obj.nextLine(); clientid[15]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[15]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[15]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[14]);
        clientamount[15]=obj.nextDouble(); 
        
        
        
         System.out.println("Enter the data of CLIENT #17");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[16]=obj.nextLine(); clientid[16]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[16]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[16]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[16]);
        clientamount[16]=obj.nextDouble(); 
        
        
        System.out.println("Enter the data of CLIENT #18");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[17]=obj.nextLine(); clientid[17]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[17]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[17]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[17]);
        clientamount[17]=obj.nextDouble(); 
       
        System.out.println("Enter the data of CLIENT #19");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[18]=obj.nextLine(); clientid[18]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[18]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[18]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[18]);
        clientamount[18]=obj.nextDouble(); 
        
        System.out.println("Enter the data of CLIENT #20");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[19]=obj.nextLine(); clientid[19]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[19]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[19]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[19]);
        clientamount[19]=obj.nextDouble(); 
        
         System.out.println("Enter the data of CLIENT #21");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[20]=obj.nextLine(); clientid[20]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[20]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[20]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[20]);
        clientamount[20]=obj.nextDouble(); 
        
        System.out.println("Enter the data of CLIENT #22");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[21]=obj.nextLine(); clientid[21]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[21]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[21]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[21]);
        clientamount[21]=obj.nextDouble(); 
        
        
         System.out.println("Enter the data of CLIENT #23");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[22]=obj.nextLine(); clientid[22]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[22]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[22]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[22]);
        clientamount[22]=obj.nextDouble(); 
        
         System.out.println("Enter the data of CLIENT #24");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[23]=obj.nextLine(); clientid[23]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[23]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[23]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[23]);
        clientamount[23]=obj.nextDouble(); 
        
        System.out.println("Enter the data of CLIENT #25");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[24]=obj.nextLine(); clientid[24]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[24]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[24]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[24]);
        clientamount[24]=obj.nextDouble(); 
       
       
        
        break;
             
             
           case 26:
        
        System.out.println("Enter the data of CLIENT #01");        
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[0]=obj.nextLine(); clientid[0]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[0]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[0]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[0]);
        clientamount[0]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #02");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[1]=obj.nextLine(); clientid[1]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[1]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[1]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[1]);
        clientamount[1]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #03");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[2]=obj.nextLine(); clientid[2]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[2]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[2]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[2]);
        clientamount[2]=obj.nextDouble();
        
        
        System.out.println("Enter the data of CLIENT #04");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[3]=obj.nextLine(); clientid[3]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[3]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[3]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[3]);
        clientamount[3]=obj.nextDouble();
        
            
        System.out.println("Enter the data of CLIENT #05");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[4]=obj.nextLine(); clientid[4]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[4]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[4]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[4]);
        clientamount[4]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #06");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[5]=obj.nextLine(); clientid[5]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[5]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[5]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[5]);
        clientamount[5]=obj.nextDouble();
        
        
        System.out.println("Enter the data of CLIENT #07");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[6]=obj.nextLine(); clientid[6]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[6]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[6]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[6]);
        clientamount[6]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #08");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[7]=obj.nextLine(); clientid[7]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[7]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[7]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[7]);
        clientamount[7]=obj.nextDouble();
        
        
        System.out.println("Enter the data of CLIENT #09");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[8]=obj.nextLine(); clientid[8]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[8]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[8]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[8]);
        clientamount[8]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #10");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[9]=obj.nextLine(); clientid[9]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[9]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[9]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[9]);
        clientamount[9]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #11");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[10]=obj.nextLine(); clientid[9]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[10]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[10]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[10]);
        clientamount[10]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #13");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[12]=obj.nextLine(); clientid[12]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[12]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[12]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[12]);
        clientamount[12]=obj.nextDouble(); 
        
        
          System.out.println("Enter the data of CLIENT #14");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[13]=obj.nextLine(); clientid[13]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[13]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[13]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[13]);
        clientamount[13]=obj.nextDouble(); 
        
        System.out.println("Enter the data of CLIENT #15");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[14]=obj.nextLine(); clientid[14]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[14]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[14]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[14]);
        clientamount[14]=obj.nextDouble(); 
        
         System.out.println("Enter the data of CLIENT #16");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[15]=obj.nextLine(); clientid[15]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[15]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[15]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[14]);
        clientamount[15]=obj.nextDouble(); 
        
        
        
         System.out.println("Enter the data of CLIENT #17");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[16]=obj.nextLine(); clientid[16]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[16]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[16]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[16]);
        clientamount[16]=obj.nextDouble(); 
        
        
        System.out.println("Enter the data of CLIENT #18");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[17]=obj.nextLine(); clientid[17]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[17]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[17]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[17]);
        clientamount[17]=obj.nextDouble(); 
       
        System.out.println("Enter the data of CLIENT #19");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[18]=obj.nextLine(); clientid[18]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[18]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[18]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[18]);
        clientamount[18]=obj.nextDouble(); 
        
        System.out.println("Enter the data of CLIENT #20");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[19]=obj.nextLine(); clientid[19]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[19]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[19]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[19]);
        clientamount[19]=obj.nextDouble(); 
        
         System.out.println("Enter the data of CLIENT #21");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[20]=obj.nextLine(); clientid[20]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[20]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[20]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[20]);
        clientamount[20]=obj.nextDouble(); 
        
        System.out.println("Enter the data of CLIENT #22");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[21]=obj.nextLine(); clientid[21]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[21]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[21]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[21]);
        clientamount[21]=obj.nextDouble(); 
        
        
         System.out.println("Enter the data of CLIENT #23");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[22]=obj.nextLine(); clientid[22]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[22]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[22]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[22]);
        clientamount[22]=obj.nextDouble(); 
        
         System.out.println("Enter the data of CLIENT #24");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[23]=obj.nextLine(); clientid[23]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[23]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[23]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[23]);
        clientamount[23]=obj.nextDouble(); 
        
        System.out.println("Enter the data of CLIENT #25");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[24]=obj.nextLine(); clientid[24]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[24]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[24]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[24]);
        clientamount[24]=obj.nextDouble(); 
        
        
         System.out.println("Enter the data of CLIENT #26");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[25]=obj.nextLine(); clientid[25]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[25]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[25]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[25]);
        clientamount[25]=obj.nextDouble(); 
       
       
        break;
        
              
           case 27:
        
        System.out.println("Enter the data of CLIENT #01");        
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[0]=obj.nextLine(); clientid[0]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[0]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[0]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[0]);
        clientamount[0]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #02");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[1]=obj.nextLine(); clientid[1]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[1]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[1]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[1]);
        clientamount[1]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #03");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[2]=obj.nextLine(); clientid[2]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[2]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[2]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[2]);
        clientamount[2]=obj.nextDouble();
        
        
        System.out.println("Enter the data of CLIENT #04");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[3]=obj.nextLine(); clientid[3]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[3]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[3]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[3]);
        clientamount[3]=obj.nextDouble();
        
            
        System.out.println("Enter the data of CLIENT #05");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[4]=obj.nextLine(); clientid[4]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[4]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[4]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[4]);
        clientamount[4]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #06");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[5]=obj.nextLine(); clientid[5]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[5]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[5]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[5]);
        clientamount[5]=obj.nextDouble();
        
        
        System.out.println("Enter the data of CLIENT #07");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[6]=obj.nextLine(); clientid[6]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[6]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[6]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[6]);
        clientamount[6]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #08");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[7]=obj.nextLine(); clientid[7]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[7]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[7]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[7]);
        clientamount[7]=obj.nextDouble();
        
        
        System.out.println("Enter the data of CLIENT #09");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[8]=obj.nextLine(); clientid[8]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[8]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[8]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[8]);
        clientamount[8]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #10");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[9]=obj.nextLine(); clientid[9]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[9]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[9]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[9]);
        clientamount[9]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #11");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[10]=obj.nextLine(); clientid[9]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[10]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[10]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[10]);
        clientamount[10]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #13");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[12]=obj.nextLine(); clientid[12]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[12]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[12]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[12]);
        clientamount[12]=obj.nextDouble(); 
        
        
          System.out.println("Enter the data of CLIENT #14");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[13]=obj.nextLine(); clientid[13]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[13]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[13]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[13]);
        clientamount[13]=obj.nextDouble(); 
        
        System.out.println("Enter the data of CLIENT #15");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[14]=obj.nextLine(); clientid[14]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[14]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[14]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[14]);
        clientamount[14]=obj.nextDouble(); 
        
         System.out.println("Enter the data of CLIENT #16");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[15]=obj.nextLine(); clientid[15]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[15]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[15]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[14]);
        clientamount[15]=obj.nextDouble(); 
        
        
        
         System.out.println("Enter the data of CLIENT #17");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[16]=obj.nextLine(); clientid[16]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[16]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[16]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[16]);
        clientamount[16]=obj.nextDouble(); 
        
        
        System.out.println("Enter the data of CLIENT #18");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[17]=obj.nextLine(); clientid[17]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[17]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[17]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[17]);
        clientamount[17]=obj.nextDouble(); 
       
        System.out.println("Enter the data of CLIENT #19");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[18]=obj.nextLine(); clientid[18]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[18]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[18]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[18]);
        clientamount[18]=obj.nextDouble(); 
        
        System.out.println("Enter the data of CLIENT #20");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[19]=obj.nextLine(); clientid[19]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[19]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[19]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[19]);
        clientamount[19]=obj.nextDouble(); 
        
         System.out.println("Enter the data of CLIENT #21");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[20]=obj.nextLine(); clientid[20]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[20]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[20]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[20]);
        clientamount[20]=obj.nextDouble(); 
        
        System.out.println("Enter the data of CLIENT #22");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[21]=obj.nextLine(); clientid[21]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[21]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[21]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[21]);
        clientamount[21]=obj.nextDouble(); 
        
        
         System.out.println("Enter the data of CLIENT #23");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[22]=obj.nextLine(); clientid[22]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[22]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[22]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[22]);
        clientamount[22]=obj.nextDouble(); 
        
         System.out.println("Enter the data of CLIENT #24");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[23]=obj.nextLine(); clientid[23]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[23]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[23]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[23]);
        clientamount[23]=obj.nextDouble(); 
        
        System.out.println("Enter the data of CLIENT #25");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[24]=obj.nextLine(); clientid[24]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[24]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[24]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[24]);
        clientamount[24]=obj.nextDouble(); 
        
        
         System.out.println("Enter the data of CLIENT #26");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[25]=obj.nextLine(); clientid[25]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[25]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[25]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[25]);
        clientamount[25]=obj.nextDouble(); 
        
        System.out.println("Enter the data of CLIENT #27");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[26]=obj.nextLine(); clientid[26]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[26]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[26]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[26]);
        clientamount[26]=obj.nextDouble(); 
       
        break;
        
        
             
             
           case 28:
        
        System.out.println("Enter the data of CLIENT #01");        
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[0]=obj.nextLine(); clientid[0]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[0]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[0]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[0]);
        clientamount[0]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #02");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[1]=obj.nextLine(); clientid[1]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[1]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[1]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[1]);
        clientamount[1]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #03");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[2]=obj.nextLine(); clientid[2]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[2]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[2]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[2]);
        clientamount[2]=obj.nextDouble();
        
        
        System.out.println("Enter the data of CLIENT #04");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[3]=obj.nextLine(); clientid[3]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[3]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[3]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[3]);
        clientamount[3]=obj.nextDouble();
        
            
        System.out.println("Enter the data of CLIENT #05");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[4]=obj.nextLine(); clientid[4]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[4]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[4]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[4]);
        clientamount[4]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #06");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[5]=obj.nextLine(); clientid[5]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[5]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[5]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[5]);
        clientamount[5]=obj.nextDouble();
        
        
        System.out.println("Enter the data of CLIENT #07");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[6]=obj.nextLine(); clientid[6]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[6]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[6]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[6]);
        clientamount[6]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #08");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[7]=obj.nextLine(); clientid[7]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[7]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[7]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[7]);
        clientamount[7]=obj.nextDouble();
        
        
        System.out.println("Enter the data of CLIENT #09");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[8]=obj.nextLine(); clientid[8]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[8]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[8]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[8]);
        clientamount[8]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #10");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[9]=obj.nextLine(); clientid[9]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[9]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[9]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[9]);
        clientamount[9]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #11");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[10]=obj.nextLine(); clientid[9]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[10]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[10]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[10]);
        clientamount[10]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #13");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[12]=obj.nextLine(); clientid[12]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[12]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[12]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[12]);
        clientamount[12]=obj.nextDouble(); 
        
        
          System.out.println("Enter the data of CLIENT #14");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[13]=obj.nextLine(); clientid[13]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[13]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[13]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[13]);
        clientamount[13]=obj.nextDouble(); 
        
        System.out.println("Enter the data of CLIENT #15");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[14]=obj.nextLine(); clientid[14]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[14]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[14]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[14]);
        clientamount[14]=obj.nextDouble(); 
        
         System.out.println("Enter the data of CLIENT #16");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[15]=obj.nextLine(); clientid[15]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[15]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[15]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[14]);
        clientamount[15]=obj.nextDouble(); 
        
        
        
         System.out.println("Enter the data of CLIENT #17");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[16]=obj.nextLine(); clientid[16]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[16]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[16]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[16]);
        clientamount[16]=obj.nextDouble(); 
        
        
        System.out.println("Enter the data of CLIENT #18");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[17]=obj.nextLine(); clientid[17]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[17]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[17]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[17]);
        clientamount[17]=obj.nextDouble(); 
       
        System.out.println("Enter the data of CLIENT #19");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[18]=obj.nextLine(); clientid[18]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[18]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[18]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[18]);
        clientamount[18]=obj.nextDouble(); 
        
        System.out.println("Enter the data of CLIENT #20");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[19]=obj.nextLine(); clientid[19]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[19]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[19]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[19]);
        clientamount[19]=obj.nextDouble(); 
        
         System.out.println("Enter the data of CLIENT #21");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[20]=obj.nextLine(); clientid[20]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[20]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[20]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[20]);
        clientamount[20]=obj.nextDouble(); 
        
        System.out.println("Enter the data of CLIENT #22");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[21]=obj.nextLine(); clientid[21]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[21]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[21]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[21]);
        clientamount[21]=obj.nextDouble(); 
        
        
         System.out.println("Enter the data of CLIENT #23");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[22]=obj.nextLine(); clientid[22]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[22]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[22]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[22]);
        clientamount[22]=obj.nextDouble(); 
        
         System.out.println("Enter the data of CLIENT #24");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[23]=obj.nextLine(); clientid[23]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[23]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[23]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[23]);
        clientamount[23]=obj.nextDouble(); 
        
        System.out.println("Enter the data of CLIENT #25");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[24]=obj.nextLine(); clientid[24]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[24]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[24]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[24]);
        clientamount[24]=obj.nextDouble(); 
        
        
         System.out.println("Enter the data of CLIENT #26");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[25]=obj.nextLine(); clientid[25]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[25]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[25]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[25]);
        clientamount[25]=obj.nextDouble(); 
        
        System.out.println("Enter the data of CLIENT #27");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[26]=obj.nextLine(); clientid[26]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[26]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[26]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[26]);
        clientamount[26]=obj.nextDouble(); 
        
        System.out.println("Enter the data of CLIENT #28");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[27]=obj.nextLine(); clientid[27]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[27]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[27]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[26]);
        clientamount[27]=obj.nextDouble(); 
       
        break;
        
        
           case 29:
        
        System.out.println("Enter the data of CLIENT #01");        
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[0]=obj.nextLine(); clientid[0]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[0]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[0]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[0]);
        clientamount[0]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #02");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[1]=obj.nextLine(); clientid[1]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[1]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[1]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[1]);
        clientamount[1]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #03");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[2]=obj.nextLine(); clientid[2]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[2]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[2]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[2]);
        clientamount[2]=obj.nextDouble();
        
        
        System.out.println("Enter the data of CLIENT #04");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[3]=obj.nextLine(); clientid[3]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[3]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[3]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[3]);
        clientamount[3]=obj.nextDouble();
        
            
        System.out.println("Enter the data of CLIENT #05");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[4]=obj.nextLine(); clientid[4]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[4]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[4]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[4]);
        clientamount[4]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #06");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[5]=obj.nextLine(); clientid[5]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[5]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[5]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[5]);
        clientamount[5]=obj.nextDouble();
        
        
        System.out.println("Enter the data of CLIENT #07");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[6]=obj.nextLine(); clientid[6]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[6]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[6]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[6]);
        clientamount[6]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #08");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[7]=obj.nextLine(); clientid[7]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[7]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[7]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[7]);
        clientamount[7]=obj.nextDouble();
        
        
        System.out.println("Enter the data of CLIENT #09");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[8]=obj.nextLine(); clientid[8]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[8]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[8]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[8]);
        clientamount[8]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #10");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[9]=obj.nextLine(); clientid[9]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[9]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[9]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[9]);
        clientamount[9]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #11");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[10]=obj.nextLine(); clientid[9]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[10]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[10]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[10]);
        clientamount[10]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #13");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[12]=obj.nextLine(); clientid[12]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[12]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[12]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[12]);
        clientamount[12]=obj.nextDouble(); 
        
        
          System.out.println("Enter the data of CLIENT #14");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[13]=obj.nextLine(); clientid[13]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[13]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[13]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[13]);
        clientamount[13]=obj.nextDouble(); 
        
        System.out.println("Enter the data of CLIENT #15");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[14]=obj.nextLine(); clientid[14]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[14]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[14]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[14]);
        clientamount[14]=obj.nextDouble(); 
        
         System.out.println("Enter the data of CLIENT #16");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[15]=obj.nextLine(); clientid[15]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[15]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[15]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[14]);
        clientamount[15]=obj.nextDouble(); 
        
        
        
         System.out.println("Enter the data of CLIENT #17");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[16]=obj.nextLine(); clientid[16]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[16]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[16]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[16]);
        clientamount[16]=obj.nextDouble(); 
        
        
        System.out.println("Enter the data of CLIENT #18");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[17]=obj.nextLine(); clientid[17]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[17]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[17]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[17]);
        clientamount[17]=obj.nextDouble(); 
       
        System.out.println("Enter the data of CLIENT #19");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[18]=obj.nextLine(); clientid[18]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[18]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[18]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[18]);
        clientamount[18]=obj.nextDouble(); 
        
        System.out.println("Enter the data of CLIENT #20");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[19]=obj.nextLine(); clientid[19]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[19]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[19]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[19]);
        clientamount[19]=obj.nextDouble(); 
        
         System.out.println("Enter the data of CLIENT #21");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[20]=obj.nextLine(); clientid[20]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[20]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[20]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[20]);
        clientamount[20]=obj.nextDouble(); 
        
        System.out.println("Enter the data of CLIENT #22");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[21]=obj.nextLine(); clientid[21]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[21]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[21]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[21]);
        clientamount[21]=obj.nextDouble(); 
        
        
         System.out.println("Enter the data of CLIENT #23");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[22]=obj.nextLine(); clientid[22]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[22]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[22]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[22]);
        clientamount[22]=obj.nextDouble(); 
        
         System.out.println("Enter the data of CLIENT #24");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[23]=obj.nextLine(); clientid[23]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[23]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[23]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[23]);
        clientamount[23]=obj.nextDouble(); 
        
        System.out.println("Enter the data of CLIENT #25");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[24]=obj.nextLine(); clientid[24]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[24]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[24]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[24]);
        clientamount[24]=obj.nextDouble(); 
        
        
         System.out.println("Enter the data of CLIENT #26");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[25]=obj.nextLine(); clientid[25]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[25]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[25]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[25]);
        clientamount[25]=obj.nextDouble(); 
        
        System.out.println("Enter the data of CLIENT #27");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[26]=obj.nextLine(); clientid[26]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[26]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[26]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[26]);
        clientamount[26]=obj.nextDouble(); 
        
        System.out.println("Enter the data of CLIENT #28");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[27]=obj.nextLine(); clientid[27]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[27]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[27]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[26]);
        clientamount[27]=obj.nextDouble(); 
        
          System.out.println("Enter the data of CLIENT #29");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[28]=obj.nextLine(); clientid[28]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[28]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[28]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[28]);
        clientamount[28]=obj.nextDouble(); 
       
       
        
        break;
           case 30:
        
        System.out.println("Enter the data of CLIENT #01");        
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[0]=obj.nextLine(); clientid[0]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[0]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[0]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[0]);
        clientamount[0]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #02");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[1]=obj.nextLine(); clientid[1]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[1]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[1]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[1]);
        clientamount[1]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #03");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[2]=obj.nextLine(); clientid[2]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[2]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[2]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[2]);
        clientamount[2]=obj.nextDouble();
        
        
        System.out.println("Enter the data of CLIENT #04");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[3]=obj.nextLine(); clientid[3]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[3]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[3]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[3]);
        clientamount[3]=obj.nextDouble();
        
            
        System.out.println("Enter the data of CLIENT #05");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[4]=obj.nextLine(); clientid[4]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[4]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[4]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[4]);
        clientamount[4]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #06");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[5]=obj.nextLine(); clientid[5]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[5]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[5]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[5]);
        clientamount[5]=obj.nextDouble();
        
        
        System.out.println("Enter the data of CLIENT #07");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[6]=obj.nextLine(); clientid[6]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[6]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[6]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[6]);
        clientamount[6]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #08");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[7]=obj.nextLine(); clientid[7]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[7]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[7]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[7]);
        clientamount[7]=obj.nextDouble();
        
        
        System.out.println("Enter the data of CLIENT #09");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[8]=obj.nextLine(); clientid[8]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[8]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[8]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[8]);
        clientamount[8]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #10");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[9]=obj.nextLine(); clientid[9]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[9]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[9]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[9]);
        clientamount[9]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #11");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[10]=obj.nextLine(); clientid[9]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[10]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[10]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[10]);
        clientamount[10]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #13");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[12]=obj.nextLine(); clientid[12]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[12]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[12]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[12]);
        clientamount[12]=obj.nextDouble(); 
        
        
          System.out.println("Enter the data of CLIENT #14");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[13]=obj.nextLine(); clientid[13]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[13]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[13]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[13]);
        clientamount[13]=obj.nextDouble(); 
        
        System.out.println("Enter the data of CLIENT #15");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[14]=obj.nextLine(); clientid[14]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[14]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[14]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[14]);
        clientamount[14]=obj.nextDouble(); 
        
         System.out.println("Enter the data of CLIENT #16");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[15]=obj.nextLine(); clientid[15]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[15]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[15]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[14]);
        clientamount[15]=obj.nextDouble(); 
        
        
        
         System.out.println("Enter the data of CLIENT #17");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[16]=obj.nextLine(); clientid[16]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[16]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[16]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[16]);
        clientamount[16]=obj.nextDouble(); 
        
        
        System.out.println("Enter the data of CLIENT #18");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[17]=obj.nextLine(); clientid[17]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[17]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[17]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[17]);
        clientamount[17]=obj.nextDouble(); 
       
        System.out.println("Enter the data of CLIENT #19");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[18]=obj.nextLine(); clientid[18]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[18]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[18]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[18]);
        clientamount[18]=obj.nextDouble(); 
        
        System.out.println("Enter the data of CLIENT #20");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[19]=obj.nextLine(); clientid[19]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[19]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[19]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[19]);
        clientamount[19]=obj.nextDouble(); 
        
         System.out.println("Enter the data of CLIENT #21");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[20]=obj.nextLine(); clientid[20]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[20]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[20]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[20]);
        clientamount[20]=obj.nextDouble(); 
        
        System.out.println("Enter the data of CLIENT #22");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[21]=obj.nextLine(); clientid[21]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[21]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[21]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[21]);
        clientamount[21]=obj.nextDouble(); 
        
        
         System.out.println("Enter the data of CLIENT #23");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[22]=obj.nextLine(); clientid[22]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[22]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[22]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[22]);
        clientamount[22]=obj.nextDouble(); 
        
         System.out.println("Enter the data of CLIENT #24");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[23]=obj.nextLine(); clientid[23]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[23]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[23]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[23]);
        clientamount[23]=obj.nextDouble(); 
        
        System.out.println("Enter the data of CLIENT #25");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[24]=obj.nextLine(); clientid[24]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[24]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[24]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[24]);
        clientamount[24]=obj.nextDouble(); 
        
        
         System.out.println("Enter the data of CLIENT #26");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[25]=obj.nextLine(); clientid[25]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[25]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[25]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[25]);
        clientamount[25]=obj.nextDouble(); 
        
        System.out.println("Enter the data of CLIENT #27");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[26]=obj.nextLine(); clientid[26]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[26]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[26]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[26]);
        clientamount[26]=obj.nextDouble(); 
        
        System.out.println("Enter the data of CLIENT #28");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[27]=obj.nextLine(); clientid[27]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[27]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[27]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[26]);
        clientamount[27]=obj.nextDouble(); 
        
          System.out.println("Enter the data of CLIENT #29");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[28]=obj.nextLine(); clientid[28]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[28]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[28]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[28]);
        clientamount[28]=obj.nextDouble(); 
        
        System.out.println("Enter the data of CLIENT #30");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[29]=obj.nextLine(); clientid[29]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[29]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[29]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[29]);
        clientamount[29]=obj.nextDouble(); 
       
        break;
        
        
           case 31:
        
        System.out.println("Enter the data of CLIENT #01");        
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[0]=obj.nextLine(); clientid[0]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[0]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[0]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[0]);
        clientamount[0]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #02");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[1]=obj.nextLine(); clientid[1]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[1]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[1]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[1]);
        clientamount[1]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #03");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[2]=obj.nextLine(); clientid[2]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[2]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[2]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[2]);
        clientamount[2]=obj.nextDouble();
        
        
        System.out.println("Enter the data of CLIENT #04");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[3]=obj.nextLine(); clientid[3]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[3]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[3]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[3]);
        clientamount[3]=obj.nextDouble();
        
            
        System.out.println("Enter the data of CLIENT #05");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[4]=obj.nextLine(); clientid[4]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[4]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[4]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[4]);
        clientamount[4]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #06");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[5]=obj.nextLine(); clientid[5]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[5]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[5]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[5]);
        clientamount[5]=obj.nextDouble();
        
        
        System.out.println("Enter the data of CLIENT #07");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[6]=obj.nextLine(); clientid[6]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[6]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[6]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[6]);
        clientamount[6]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #08");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[7]=obj.nextLine(); clientid[7]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[7]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[7]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[7]);
        clientamount[7]=obj.nextDouble();
        
        
        System.out.println("Enter the data of CLIENT #09");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[8]=obj.nextLine(); clientid[8]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[8]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[8]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[8]);
        clientamount[8]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #10");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[9]=obj.nextLine(); clientid[9]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[9]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[9]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[9]);
        clientamount[9]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #11");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[10]=obj.nextLine(); clientid[9]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[10]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[10]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[10]);
        clientamount[10]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #13");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[12]=obj.nextLine(); clientid[12]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[12]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[12]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[12]);
        clientamount[12]=obj.nextDouble(); 
        
        
          System.out.println("Enter the data of CLIENT #14");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[13]=obj.nextLine(); clientid[13]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[13]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[13]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[13]);
        clientamount[13]=obj.nextDouble(); 
        
        System.out.println("Enter the data of CLIENT #15");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[14]=obj.nextLine(); clientid[14]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[14]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[14]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[14]);
        clientamount[14]=obj.nextDouble(); 
        
         System.out.println("Enter the data of CLIENT #16");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[15]=obj.nextLine(); clientid[15]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[15]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[15]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[14]);
        clientamount[15]=obj.nextDouble(); 
        
        
        
         System.out.println("Enter the data of CLIENT #17");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[16]=obj.nextLine(); clientid[16]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[16]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[16]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[16]);
        clientamount[16]=obj.nextDouble(); 
        
        
        System.out.println("Enter the data of CLIENT #18");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[17]=obj.nextLine(); clientid[17]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[17]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[17]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[17]);
        clientamount[17]=obj.nextDouble(); 
       
        System.out.println("Enter the data of CLIENT #19");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[18]=obj.nextLine(); clientid[18]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[18]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[18]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[18]);
        clientamount[18]=obj.nextDouble(); 
        
        System.out.println("Enter the data of CLIENT #20");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[19]=obj.nextLine(); clientid[19]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[19]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[19]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[19]);
        clientamount[19]=obj.nextDouble(); 
        
         System.out.println("Enter the data of CLIENT #21");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[20]=obj.nextLine(); clientid[20]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[20]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[20]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[20]);
        clientamount[20]=obj.nextDouble(); 
        
        System.out.println("Enter the data of CLIENT #22");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[21]=obj.nextLine(); clientid[21]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[21]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[21]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[21]);
        clientamount[21]=obj.nextDouble(); 
        
        
         System.out.println("Enter the data of CLIENT #23");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[22]=obj.nextLine(); clientid[22]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[22]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[22]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[22]);
        clientamount[22]=obj.nextDouble(); 
        
         System.out.println("Enter the data of CLIENT #24");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[23]=obj.nextLine(); clientid[23]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[23]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[23]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[23]);
        clientamount[23]=obj.nextDouble(); 
        
        System.out.println("Enter the data of CLIENT #25");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[24]=obj.nextLine(); clientid[24]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[24]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[24]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[24]);
        clientamount[24]=obj.nextDouble(); 
        
        
         System.out.println("Enter the data of CLIENT #26");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[25]=obj.nextLine(); clientid[25]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[25]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[25]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[25]);
        clientamount[25]=obj.nextDouble(); 
        
        System.out.println("Enter the data of CLIENT #27");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[26]=obj.nextLine(); clientid[26]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[26]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[26]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[26]);
        clientamount[26]=obj.nextDouble(); 
        
        System.out.println("Enter the data of CLIENT #28");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[27]=obj.nextLine(); clientid[27]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[27]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[27]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[26]);
        clientamount[27]=obj.nextDouble(); 
        
          System.out.println("Enter the data of CLIENT #29");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[28]=obj.nextLine(); clientid[28]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[28]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[28]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[28]);
        clientamount[28]=obj.nextDouble(); 
        
        System.out.println("Enter the data of CLIENT #30");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[29]=obj.nextLine(); clientid[29]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[29]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[29]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[29]);
        clientamount[29]=obj.nextDouble(); 
        
         
        System.out.println("Enter the data of CLIENT #31");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[30]=obj.nextLine(); clientid[30]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[30]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[30]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[30]);
        clientamount[30]=obj.nextDouble(); 
       
       
        
        break;
             
           case 32:
        
        System.out.println("Enter the data of CLIENT #01");        
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[0]=obj.nextLine(); clientid[0]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[0]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[0]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[0]);
        clientamount[0]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #02");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[1]=obj.nextLine(); clientid[1]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[1]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[1]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[1]);
        clientamount[1]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #03");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[2]=obj.nextLine(); clientid[2]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[2]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[2]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[2]);
        clientamount[2]=obj.nextDouble();
        
        
        System.out.println("Enter the data of CLIENT #04");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[3]=obj.nextLine(); clientid[3]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[3]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[3]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[3]);
        clientamount[3]=obj.nextDouble();
        
            
        System.out.println("Enter the data of CLIENT #05");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[4]=obj.nextLine(); clientid[4]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[4]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[4]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[4]);
        clientamount[4]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #06");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[5]=obj.nextLine(); clientid[5]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[5]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[5]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[5]);
        clientamount[5]=obj.nextDouble();
        
        
        System.out.println("Enter the data of CLIENT #07");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[6]=obj.nextLine(); clientid[6]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[6]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[6]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[6]);
        clientamount[6]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #08");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[7]=obj.nextLine(); clientid[7]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[7]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[7]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[7]);
        clientamount[7]=obj.nextDouble();
        
        
        System.out.println("Enter the data of CLIENT #09");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[8]=obj.nextLine(); clientid[8]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[8]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[8]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[8]);
        clientamount[8]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #10");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[9]=obj.nextLine(); clientid[9]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[9]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[9]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[9]);
        clientamount[9]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #11");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[10]=obj.nextLine(); clientid[9]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[10]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[10]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[10]);
        clientamount[10]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #13");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[12]=obj.nextLine(); clientid[12]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[12]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[12]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[12]);
        clientamount[12]=obj.nextDouble(); 
        
        
          System.out.println("Enter the data of CLIENT #14");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[13]=obj.nextLine(); clientid[13]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[13]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[13]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[13]);
        clientamount[13]=obj.nextDouble(); 
        
        System.out.println("Enter the data of CLIENT #15");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[14]=obj.nextLine(); clientid[14]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[14]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[14]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[14]);
        clientamount[14]=obj.nextDouble(); 
        
         System.out.println("Enter the data of CLIENT #16");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[15]=obj.nextLine(); clientid[15]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[15]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[15]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[14]);
        clientamount[15]=obj.nextDouble(); 
        
        
        
         System.out.println("Enter the data of CLIENT #17");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[16]=obj.nextLine(); clientid[16]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[16]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[16]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[16]);
        clientamount[16]=obj.nextDouble(); 
        
        
        System.out.println("Enter the data of CLIENT #18");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[17]=obj.nextLine(); clientid[17]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[17]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[17]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[17]);
        clientamount[17]=obj.nextDouble(); 
       
        System.out.println("Enter the data of CLIENT #19");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[18]=obj.nextLine(); clientid[18]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[18]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[18]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[18]);
        clientamount[18]=obj.nextDouble(); 
        
        System.out.println("Enter the data of CLIENT #20");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[19]=obj.nextLine(); clientid[19]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[19]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[19]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[19]);
        clientamount[19]=obj.nextDouble(); 
        
         System.out.println("Enter the data of CLIENT #21");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[20]=obj.nextLine(); clientid[20]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[20]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[20]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[20]);
        clientamount[20]=obj.nextDouble(); 
        
        System.out.println("Enter the data of CLIENT #22");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[21]=obj.nextLine(); clientid[21]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[21]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[21]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[21]);
        clientamount[21]=obj.nextDouble(); 
        
        
         System.out.println("Enter the data of CLIENT #23");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[22]=obj.nextLine(); clientid[22]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[22]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[22]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[22]);
        clientamount[22]=obj.nextDouble(); 
        
         System.out.println("Enter the data of CLIENT #24");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[23]=obj.nextLine(); clientid[23]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[23]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[23]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[23]);
        clientamount[23]=obj.nextDouble(); 
        
        System.out.println("Enter the data of CLIENT #25");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[24]=obj.nextLine(); clientid[24]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[24]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[24]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[24]);
        clientamount[24]=obj.nextDouble(); 
        
        
         System.out.println("Enter the data of CLIENT #26");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[25]=obj.nextLine(); clientid[25]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[25]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[25]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[25]);
        clientamount[25]=obj.nextDouble(); 
        
        System.out.println("Enter the data of CLIENT #27");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[26]=obj.nextLine(); clientid[26]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[26]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[26]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[26]);
        clientamount[26]=obj.nextDouble(); 
        
        System.out.println("Enter the data of CLIENT #28");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[27]=obj.nextLine(); clientid[27]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[27]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[27]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[26]);
        clientamount[27]=obj.nextDouble(); 
        
          System.out.println("Enter the data of CLIENT #29");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[28]=obj.nextLine(); clientid[28]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[28]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[28]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[28]);
        clientamount[28]=obj.nextDouble(); 
        
        System.out.println("Enter the data of CLIENT #30");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[29]=obj.nextLine(); clientid[29]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[29]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[29]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[29]);
        clientamount[29]=obj.nextDouble(); 
        
         
        System.out.println("Enter the data of CLIENT #31");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[30]=obj.nextLine(); clientid[30]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[30]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[29]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[30]);
        clientamount[30]=obj.nextDouble(); 
       
        
         System.out.println("Enter the data of CLIENT #32");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[31]=obj.nextLine(); clientid[31]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[31]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[31]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[31]);
        clientamount[31]=obj.nextDouble(); 
       
        break;
        
       
           case 33:
        
        System.out.println("Enter the data of CLIENT #01");        
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[0]=obj.nextLine(); clientid[0]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[0]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[0]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[0]);
        clientamount[0]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #02");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[1]=obj.nextLine(); clientid[1]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[1]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[1]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[1]);
        clientamount[1]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #03");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[2]=obj.nextLine(); clientid[2]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[2]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[2]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[2]);
        clientamount[2]=obj.nextDouble();
        
        
        System.out.println("Enter the data of CLIENT #04");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[3]=obj.nextLine(); clientid[3]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[3]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[3]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[3]);
        clientamount[3]=obj.nextDouble();
        
            
        System.out.println("Enter the data of CLIENT #05");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[4]=obj.nextLine(); clientid[4]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[4]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[4]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[4]);
        clientamount[4]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #06");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[5]=obj.nextLine(); clientid[5]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[5]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[5]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[5]);
        clientamount[5]=obj.nextDouble();
        
        
        System.out.println("Enter the data of CLIENT #07");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[6]=obj.nextLine(); clientid[6]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[6]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[6]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[6]);
        clientamount[6]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #08");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[7]=obj.nextLine(); clientid[7]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[7]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[7]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[7]);
        clientamount[7]=obj.nextDouble();
        
        
        System.out.println("Enter the data of CLIENT #09");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[8]=obj.nextLine(); clientid[8]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[8]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[8]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[8]);
        clientamount[8]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #10");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[9]=obj.nextLine(); clientid[9]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[9]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[9]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[9]);
        clientamount[9]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #11");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[10]=obj.nextLine(); clientid[9]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[10]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[10]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[10]);
        clientamount[10]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #13");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[12]=obj.nextLine(); clientid[12]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[12]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[12]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[12]);
        clientamount[12]=obj.nextDouble(); 
        
        
          System.out.println("Enter the data of CLIENT #14");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[13]=obj.nextLine(); clientid[13]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[13]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[13]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[13]);
        clientamount[13]=obj.nextDouble(); 
        
        System.out.println("Enter the data of CLIENT #15");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[14]=obj.nextLine(); clientid[14]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[14]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[14]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[14]);
        clientamount[14]=obj.nextDouble(); 
        
         System.out.println("Enter the data of CLIENT #16");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[15]=obj.nextLine(); clientid[15]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[15]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[15]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[14]);
        clientamount[15]=obj.nextDouble(); 
        
        
        
         System.out.println("Enter the data of CLIENT #17");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[16]=obj.nextLine(); clientid[16]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[16]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[16]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[16]);
        clientamount[16]=obj.nextDouble(); 
        
        
        System.out.println("Enter the data of CLIENT #18");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[17]=obj.nextLine(); clientid[17]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[17]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[17]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[17]);
        clientamount[17]=obj.nextDouble(); 
       
        System.out.println("Enter the data of CLIENT #19");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[18]=obj.nextLine(); clientid[18]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[18]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[18]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[18]);
        clientamount[18]=obj.nextDouble(); 
        
        System.out.println("Enter the data of CLIENT #20");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[19]=obj.nextLine(); clientid[19]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[19]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[19]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[19]);
        clientamount[19]=obj.nextDouble(); 
        
         System.out.println("Enter the data of CLIENT #21");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[20]=obj.nextLine(); clientid[20]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[20]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[20]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[20]);
        clientamount[20]=obj.nextDouble(); 
        
        System.out.println("Enter the data of CLIENT #22");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[21]=obj.nextLine(); clientid[21]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[21]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[21]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[21]);
        clientamount[21]=obj.nextDouble(); 
        
        
         System.out.println("Enter the data of CLIENT #23");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[22]=obj.nextLine(); clientid[22]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[22]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[22]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[22]);
        clientamount[22]=obj.nextDouble(); 
        
         System.out.println("Enter the data of CLIENT #24");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[23]=obj.nextLine(); clientid[23]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[23]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[23]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[23]);
        clientamount[23]=obj.nextDouble(); 
        
        System.out.println("Enter the data of CLIENT #25");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[24]=obj.nextLine(); clientid[24]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[24]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[24]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[24]);
        clientamount[24]=obj.nextDouble(); 
        
        
         System.out.println("Enter the data of CLIENT #26");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[25]=obj.nextLine(); clientid[25]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[25]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[25]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[25]);
        clientamount[25]=obj.nextDouble(); 
        
        System.out.println("Enter the data of CLIENT #27");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[26]=obj.nextLine(); clientid[26]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[26]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[26]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[26]);
        clientamount[26]=obj.nextDouble(); 
        
        System.out.println("Enter the data of CLIENT #28");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[27]=obj.nextLine(); clientid[27]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[27]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[27]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[26]);
        clientamount[27]=obj.nextDouble(); 
        
          System.out.println("Enter the data of CLIENT #29");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[28]=obj.nextLine(); clientid[28]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[28]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[28]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[28]);
        clientamount[28]=obj.nextDouble(); 
        
        System.out.println("Enter the data of CLIENT #30");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[29]=obj.nextLine(); clientid[29]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[29]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[29]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[29]);
        clientamount[29]=obj.nextDouble(); 
        
         
        System.out.println("Enter the data of CLIENT #31");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[30]=obj.nextLine(); clientid[30]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[30]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[29]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[30]);
        clientamount[30]=obj.nextDouble(); 
       
        
         System.out.println("Enter the data of CLIENT #32");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[31]=obj.nextLine(); clientid[31]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[31]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[31]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[31]);
        clientamount[31]=obj.nextDouble(); 
        
         System.out.println("Enter the data of CLIENT #33");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[32]=obj.nextLine(); clientid[32]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[32]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[32]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[32]);
        clientamount[32]=obj.nextDouble(); 
       
       break;
        
           case 34:
        
        System.out.println("Enter the data of CLIENT #01");        
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[0]=obj.nextLine(); clientid[0]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[0]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[0]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[0]);
        clientamount[0]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #02");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[1]=obj.nextLine(); clientid[1]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[1]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[1]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[1]);
        clientamount[1]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #03");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[2]=obj.nextLine(); clientid[2]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[2]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[2]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[2]);
        clientamount[2]=obj.nextDouble();
        
        
        System.out.println("Enter the data of CLIENT #04");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[3]=obj.nextLine(); clientid[3]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[3]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[3]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[3]);
        clientamount[3]=obj.nextDouble();
        
            
        System.out.println("Enter the data of CLIENT #05");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[4]=obj.nextLine(); clientid[4]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[4]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[4]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[4]);
        clientamount[4]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #06");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[5]=obj.nextLine(); clientid[5]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[5]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[5]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[5]);
        clientamount[5]=obj.nextDouble();
        
        
        System.out.println("Enter the data of CLIENT #07");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[6]=obj.nextLine(); clientid[6]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[6]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[6]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[6]);
        clientamount[6]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #08");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[7]=obj.nextLine(); clientid[7]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[7]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[7]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[7]);
        clientamount[7]=obj.nextDouble();
        
        
        System.out.println("Enter the data of CLIENT #09");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[8]=obj.nextLine(); clientid[8]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[8]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[8]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[8]);
        clientamount[8]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #10");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[9]=obj.nextLine(); clientid[9]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[9]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[9]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[9]);
        clientamount[9]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #11");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[10]=obj.nextLine(); clientid[9]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[10]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[10]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[10]);
        clientamount[10]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #13");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[12]=obj.nextLine(); clientid[12]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[12]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[12]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[12]);
        clientamount[12]=obj.nextDouble(); 
        
        
          System.out.println("Enter the data of CLIENT #14");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[13]=obj.nextLine(); clientid[13]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[13]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[13]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[13]);
        clientamount[13]=obj.nextDouble(); 
        
        System.out.println("Enter the data of CLIENT #15");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[14]=obj.nextLine(); clientid[14]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[14]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[14]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[14]);
        clientamount[14]=obj.nextDouble(); 
        
         System.out.println("Enter the data of CLIENT #16");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[15]=obj.nextLine(); clientid[15]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[15]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[15]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[14]);
        clientamount[15]=obj.nextDouble(); 
        
        
        
         System.out.println("Enter the data of CLIENT #17");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[16]=obj.nextLine(); clientid[16]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[16]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[16]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[16]);
        clientamount[16]=obj.nextDouble(); 
        
        
        System.out.println("Enter the data of CLIENT #18");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[17]=obj.nextLine(); clientid[17]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[17]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[17]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[17]);
        clientamount[17]=obj.nextDouble(); 
       
        System.out.println("Enter the data of CLIENT #19");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[18]=obj.nextLine(); clientid[18]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[18]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[18]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[18]);
        clientamount[18]=obj.nextDouble(); 
        
        System.out.println("Enter the data of CLIENT #20");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[19]=obj.nextLine(); clientid[19]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[19]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[19]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[19]);
        clientamount[19]=obj.nextDouble(); 
        
         System.out.println("Enter the data of CLIENT #21");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[20]=obj.nextLine(); clientid[20]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[20]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[20]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[20]);
        clientamount[20]=obj.nextDouble(); 
        
        System.out.println("Enter the data of CLIENT #22");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[21]=obj.nextLine(); clientid[21]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[21]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[21]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[21]);
        clientamount[21]=obj.nextDouble(); 
        
        
         System.out.println("Enter the data of CLIENT #23");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[22]=obj.nextLine(); clientid[22]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[22]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[22]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[22]);
        clientamount[22]=obj.nextDouble(); 
        
         System.out.println("Enter the data of CLIENT #24");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[23]=obj.nextLine(); clientid[23]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[23]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[23]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[23]);
        clientamount[23]=obj.nextDouble(); 
        
        System.out.println("Enter the data of CLIENT #25");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[24]=obj.nextLine(); clientid[24]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[24]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[24]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[24]);
        clientamount[24]=obj.nextDouble(); 
        
        
         System.out.println("Enter the data of CLIENT #26");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[25]=obj.nextLine(); clientid[25]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[25]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[25]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[25]);
        clientamount[25]=obj.nextDouble(); 
        
        System.out.println("Enter the data of CLIENT #27");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[26]=obj.nextLine(); clientid[26]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[26]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[26]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[26]);
        clientamount[26]=obj.nextDouble(); 
        
        System.out.println("Enter the data of CLIENT #28");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[27]=obj.nextLine(); clientid[27]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[27]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[27]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[26]);
        clientamount[27]=obj.nextDouble(); 
        
          System.out.println("Enter the data of CLIENT #29");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[28]=obj.nextLine(); clientid[28]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[28]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[28]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[28]);
        clientamount[28]=obj.nextDouble(); 
        
        System.out.println("Enter the data of CLIENT #30");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[29]=obj.nextLine(); clientid[29]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[29]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[29]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[29]);
        clientamount[29]=obj.nextDouble(); 
        
         
        System.out.println("Enter the data of CLIENT #31");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[30]=obj.nextLine(); clientid[30]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[30]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[29]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[30]);
        clientamount[30]=obj.nextDouble(); 
       
        
         System.out.println("Enter the data of CLIENT #32");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[31]=obj.nextLine(); clientid[31]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[31]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[31]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[31]);
        clientamount[31]=obj.nextDouble(); 
        
         System.out.println("Enter the data of CLIENT #33");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[32]=obj.nextLine(); clientid[32]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[32]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[32]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[32]);
        clientamount[32]=obj.nextDouble(); 
        
        System.out.println("Enter the data of CLIENT #34");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[33]=obj.nextLine(); clientid[33]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[33]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[33]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[33]);
        clientamount[33]=obj.nextDouble(); 
       
        break;
        
           case 35:
        System.out.println("Enter the data of CLIENT #01");        
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[0]=obj.nextLine(); clientid[0]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[0]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[0]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[0]);
        clientamount[0]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #02");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[1]=obj.nextLine(); clientid[1]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[1]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[1]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[1]);
        clientamount[1]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #03");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[2]=obj.nextLine(); clientid[2]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[2]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[2]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[2]);
        clientamount[2]=obj.nextDouble();
        
        
        System.out.println("Enter the data of CLIENT #04");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[3]=obj.nextLine(); clientid[3]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[3]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[3]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[3]);
        clientamount[3]=obj.nextDouble();
        
            
        System.out.println("Enter the data of CLIENT #05");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[4]=obj.nextLine(); clientid[4]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[4]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[4]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[4]);
        clientamount[4]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #06");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[5]=obj.nextLine(); clientid[5]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[5]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[5]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[5]);
        clientamount[5]=obj.nextDouble();
        
        
        System.out.println("Enter the data of CLIENT #07");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[6]=obj.nextLine(); clientid[6]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[6]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[6]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[6]);
        clientamount[6]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #08");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[7]=obj.nextLine(); clientid[7]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[7]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[7]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[7]);
        clientamount[7]=obj.nextDouble();
        
        
        System.out.println("Enter the data of CLIENT #09");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[8]=obj.nextLine(); clientid[8]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[8]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[8]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[8]);
        clientamount[8]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #10");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[9]=obj.nextLine(); clientid[9]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[9]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[9]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[9]);
        clientamount[9]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #11");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[10]=obj.nextLine(); clientid[9]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[10]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[10]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[10]);
        clientamount[10]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #13");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[12]=obj.nextLine(); clientid[12]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[12]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[12]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[12]);
        clientamount[12]=obj.nextDouble(); 
        
        
          System.out.println("Enter the data of CLIENT #14");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[13]=obj.nextLine(); clientid[13]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[13]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[13]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[13]);
        clientamount[13]=obj.nextDouble(); 
        
        System.out.println("Enter the data of CLIENT #15");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[14]=obj.nextLine(); clientid[14]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[14]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[14]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[14]);
        clientamount[14]=obj.nextDouble(); 
        
         System.out.println("Enter the data of CLIENT #16");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[15]=obj.nextLine(); clientid[15]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[15]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[15]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[14]);
        clientamount[15]=obj.nextDouble(); 
        
        
        
         System.out.println("Enter the data of CLIENT #17");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[16]=obj.nextLine(); clientid[16]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[16]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[16]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[16]);
        clientamount[16]=obj.nextDouble(); 
        
        
        System.out.println("Enter the data of CLIENT #18");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[17]=obj.nextLine(); clientid[17]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[17]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[17]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[17]);
        clientamount[17]=obj.nextDouble(); 
       
        System.out.println("Enter the data of CLIENT #19");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[18]=obj.nextLine(); clientid[18]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[18]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[18]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[18]);
        clientamount[18]=obj.nextDouble(); 
        
        System.out.println("Enter the data of CLIENT #20");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[19]=obj.nextLine(); clientid[19]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[19]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[19]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[19]);
        clientamount[19]=obj.nextDouble(); 
        
         System.out.println("Enter the data of CLIENT #21");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[20]=obj.nextLine(); clientid[20]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[20]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[20]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[20]);
        clientamount[20]=obj.nextDouble(); 
        
        System.out.println("Enter the data of CLIENT #22");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[21]=obj.nextLine(); clientid[21]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[21]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[21]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[21]);
        clientamount[21]=obj.nextDouble(); 
        
        
         System.out.println("Enter the data of CLIENT #23");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[22]=obj.nextLine(); clientid[22]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[22]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[22]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[22]);
        clientamount[22]=obj.nextDouble(); 
        
         System.out.println("Enter the data of CLIENT #24");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[23]=obj.nextLine(); clientid[23]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[23]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[23]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[23]);
        clientamount[23]=obj.nextDouble(); 
        
        System.out.println("Enter the data of CLIENT #25");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[24]=obj.nextLine(); clientid[24]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[24]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[24]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[24]);
        clientamount[24]=obj.nextDouble(); 
        
        
         System.out.println("Enter the data of CLIENT #26");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[25]=obj.nextLine(); clientid[25]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[25]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[25]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[25]);
        clientamount[25]=obj.nextDouble(); 
        
        System.out.println("Enter the data of CLIENT #27");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[26]=obj.nextLine(); clientid[26]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[26]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[26]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[26]);
        clientamount[26]=obj.nextDouble(); 
        
        System.out.println("Enter the data of CLIENT #28");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[27]=obj.nextLine(); clientid[27]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[27]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[27]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[26]);
        clientamount[27]=obj.nextDouble(); 
        
          System.out.println("Enter the data of CLIENT #29");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[28]=obj.nextLine(); clientid[28]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[28]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[28]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[28]);
        clientamount[28]=obj.nextDouble(); 
        
        System.out.println("Enter the data of CLIENT #30");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[29]=obj.nextLine(); clientid[29]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[29]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[29]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[29]);
        clientamount[29]=obj.nextDouble(); 
        
         
        System.out.println("Enter the data of CLIENT #31");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[30]=obj.nextLine(); clientid[30]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[30]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[29]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[30]);
        clientamount[30]=obj.nextDouble(); 
       
        
         System.out.println("Enter the data of CLIENT #32");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[31]=obj.nextLine(); clientid[31]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[31]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[31]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[31]);
        clientamount[31]=obj.nextDouble(); 
        
         System.out.println("Enter the data of CLIENT #33");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[32]=obj.nextLine(); clientid[32]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[32]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[32]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[32]);
        clientamount[32]=obj.nextDouble(); 
        
        System.out.println("Enter the data of CLIENT #34");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[33]=obj.nextLine(); clientid[33]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[33]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[33]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[33]);
        clientamount[33]=obj.nextDouble(); 
        
         System.out.println("Enter the data of CLIENT #35");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[34]=obj.nextLine(); clientid[34]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[34]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[34]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[34]);
        clientamount[34]=obj.nextDouble(); 
       
       
        break;
        
           case 36: 
        
        System.out.println("Enter the data of CLIENT #01");        
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[0]=obj.nextLine(); clientid[0]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[0]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[0]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[0]);
        clientamount[0]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #02");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[1]=obj.nextLine(); clientid[1]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[1]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[1]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[1]);
        clientamount[1]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #03");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[2]=obj.nextLine(); clientid[2]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[2]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[2]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[2]);
        clientamount[2]=obj.nextDouble();
        
        
        System.out.println("Enter the data of CLIENT #04");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[3]=obj.nextLine(); clientid[3]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[3]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[3]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[3]);
        clientamount[3]=obj.nextDouble();
        
            
        System.out.println("Enter the data of CLIENT #05");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[4]=obj.nextLine(); clientid[4]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[4]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[4]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[4]);
        clientamount[4]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #06");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[5]=obj.nextLine(); clientid[5]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[5]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[5]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[5]);
        clientamount[5]=obj.nextDouble();
        
        
        System.out.println("Enter the data of CLIENT #07");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[6]=obj.nextLine(); clientid[6]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[6]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[6]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[6]);
        clientamount[6]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #08");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[7]=obj.nextLine(); clientid[7]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[7]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[7]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[7]);
        clientamount[7]=obj.nextDouble();
        
        
        System.out.println("Enter the data of CLIENT #09");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[8]=obj.nextLine(); clientid[8]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[8]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[8]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[8]);
        clientamount[8]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #10");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[9]=obj.nextLine(); clientid[9]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[9]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[9]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[9]);
        clientamount[9]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #11");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[10]=obj.nextLine(); clientid[9]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[10]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[10]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[10]);
        clientamount[10]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #13");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[12]=obj.nextLine(); clientid[12]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[12]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[12]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[12]);
        clientamount[12]=obj.nextDouble(); 
        
        
          System.out.println("Enter the data of CLIENT #14");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[13]=obj.nextLine(); clientid[13]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[13]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[13]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[13]);
        clientamount[13]=obj.nextDouble(); 
        
        System.out.println("Enter the data of CLIENT #15");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[14]=obj.nextLine(); clientid[14]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[14]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[14]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[14]);
        clientamount[14]=obj.nextDouble(); 
        
         System.out.println("Enter the data of CLIENT #16");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[15]=obj.nextLine(); clientid[15]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[15]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[15]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[14]);
        clientamount[15]=obj.nextDouble(); 
        
        
        
         System.out.println("Enter the data of CLIENT #17");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[16]=obj.nextLine(); clientid[16]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[16]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[16]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[16]);
        clientamount[16]=obj.nextDouble(); 
        
        
        System.out.println("Enter the data of CLIENT #18");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[17]=obj.nextLine(); clientid[17]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[17]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[17]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[17]);
        clientamount[17]=obj.nextDouble(); 
       
        System.out.println("Enter the data of CLIENT #19");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[18]=obj.nextLine(); clientid[18]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[18]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[18]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[18]);
        clientamount[18]=obj.nextDouble(); 
        
        System.out.println("Enter the data of CLIENT #20");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[19]=obj.nextLine(); clientid[19]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[19]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[19]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[19]);
        clientamount[19]=obj.nextDouble(); 
        
         System.out.println("Enter the data of CLIENT #21");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[20]=obj.nextLine(); clientid[20]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[20]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[20]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[20]);
        clientamount[20]=obj.nextDouble(); 
        
        System.out.println("Enter the data of CLIENT #22");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[21]=obj.nextLine(); clientid[21]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[21]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[21]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[21]);
        clientamount[21]=obj.nextDouble(); 
        
        
         System.out.println("Enter the data of CLIENT #23");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[22]=obj.nextLine(); clientid[22]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[22]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[22]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[22]);
        clientamount[22]=obj.nextDouble(); 
        
         System.out.println("Enter the data of CLIENT #24");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[23]=obj.nextLine(); clientid[23]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[23]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[23]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[23]);
        clientamount[23]=obj.nextDouble(); 
        
        System.out.println("Enter the data of CLIENT #25");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[24]=obj.nextLine(); clientid[24]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[24]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[24]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[24]);
        clientamount[24]=obj.nextDouble(); 
        
        
         System.out.println("Enter the data of CLIENT #26");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[25]=obj.nextLine(); clientid[25]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[25]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[25]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[25]);
        clientamount[25]=obj.nextDouble(); 
        
        System.out.println("Enter the data of CLIENT #27");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[26]=obj.nextLine(); clientid[26]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[26]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[26]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[26]);
        clientamount[26]=obj.nextDouble(); 
        
        System.out.println("Enter the data of CLIENT #28");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[27]=obj.nextLine(); clientid[27]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[27]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[27]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[26]);
        clientamount[27]=obj.nextDouble(); 
        
          System.out.println("Enter the data of CLIENT #29");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[28]=obj.nextLine(); clientid[28]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[28]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[28]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[28]);
        clientamount[28]=obj.nextDouble(); 
        
        System.out.println("Enter the data of CLIENT #30");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[29]=obj.nextLine(); clientid[29]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[29]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[29]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[29]);
        clientamount[29]=obj.nextDouble(); 
        
         
        System.out.println("Enter the data of CLIENT #31");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[30]=obj.nextLine(); clientid[30]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[30]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[29]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[30]);
        clientamount[30]=obj.nextDouble(); 
       
        
         System.out.println("Enter the data of CLIENT #32");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[31]=obj.nextLine(); clientid[31]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[31]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[31]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[31]);
        clientamount[31]=obj.nextDouble(); 
        
         System.out.println("Enter the data of CLIENT #33");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[32]=obj.nextLine(); clientid[32]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[32]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[32]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[32]);
        clientamount[32]=obj.nextDouble(); 
        
        System.out.println("Enter the data of CLIENT #34");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[33]=obj.nextLine(); clientid[33]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[33]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[33]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[33]);
        clientamount[33]=obj.nextDouble(); 
        
         System.out.println("Enter the data of CLIENT #35");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[34]=obj.nextLine(); clientid[34]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[34]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[34]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[34]);
        clientamount[34]=obj.nextDouble(); 
        
         System.out.println("Enter the data of CLIENT #36");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[35]=obj.nextLine(); clientid[35]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[35]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[35]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[35]);
        clientamount[35]=obj.nextDouble(); 
       
        break;
        
        
           case 37:
        
        System.out.println("Enter the data of CLIENT #01");        
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[0]=obj.nextLine(); clientid[0]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[0]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[0]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[0]);
        clientamount[0]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #02");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[1]=obj.nextLine(); clientid[1]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[1]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[1]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[1]);
        clientamount[1]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #03");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[2]=obj.nextLine(); clientid[2]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[2]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[2]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[2]);
        clientamount[2]=obj.nextDouble();
        
        
        System.out.println("Enter the data of CLIENT #04");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[3]=obj.nextLine(); clientid[3]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[3]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[3]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[3]);
        clientamount[3]=obj.nextDouble();
        
            
        System.out.println("Enter the data of CLIENT #05");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[4]=obj.nextLine(); clientid[4]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[4]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[4]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[4]);
        clientamount[4]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #06");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[5]=obj.nextLine(); clientid[5]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[5]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[5]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[5]);
        clientamount[5]=obj.nextDouble();
        
        
        System.out.println("Enter the data of CLIENT #07");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[6]=obj.nextLine(); clientid[6]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[6]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[6]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[6]);
        clientamount[6]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #08");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[7]=obj.nextLine(); clientid[7]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[7]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[7]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[7]);
        clientamount[7]=obj.nextDouble();
        
        
        System.out.println("Enter the data of CLIENT #09");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[8]=obj.nextLine(); clientid[8]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[8]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[8]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[8]);
        clientamount[8]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #10");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[9]=obj.nextLine(); clientid[9]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[9]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[9]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[9]);
        clientamount[9]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #11");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[10]=obj.nextLine(); clientid[9]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[10]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[10]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[10]);
        clientamount[10]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #13");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[12]=obj.nextLine(); clientid[12]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[12]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[12]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[12]);
        clientamount[12]=obj.nextDouble(); 
        
        
          System.out.println("Enter the data of CLIENT #14");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[13]=obj.nextLine(); clientid[13]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[13]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[13]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[13]);
        clientamount[13]=obj.nextDouble(); 
        
        System.out.println("Enter the data of CLIENT #15");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[14]=obj.nextLine(); clientid[14]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[14]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[14]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[14]);
        clientamount[14]=obj.nextDouble(); 
        
         System.out.println("Enter the data of CLIENT #16");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[15]=obj.nextLine(); clientid[15]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[15]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[15]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[14]);
        clientamount[15]=obj.nextDouble(); 
        
        
        
         System.out.println("Enter the data of CLIENT #17");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[16]=obj.nextLine(); clientid[16]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[16]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[16]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[16]);
        clientamount[16]=obj.nextDouble(); 
        
        
        System.out.println("Enter the data of CLIENT #18");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[17]=obj.nextLine(); clientid[17]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[17]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[17]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[17]);
        clientamount[17]=obj.nextDouble(); 
       
        System.out.println("Enter the data of CLIENT #19");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[18]=obj.nextLine(); clientid[18]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[18]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[18]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[18]);
        clientamount[18]=obj.nextDouble(); 
        
        System.out.println("Enter the data of CLIENT #20");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[19]=obj.nextLine(); clientid[19]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[19]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[19]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[19]);
        clientamount[19]=obj.nextDouble(); 
        
         System.out.println("Enter the data of CLIENT #21");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[20]=obj.nextLine(); clientid[20]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[20]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[20]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[20]);
        clientamount[20]=obj.nextDouble(); 
        
        System.out.println("Enter the data of CLIENT #22");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[21]=obj.nextLine(); clientid[21]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[21]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[21]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[21]);
        clientamount[21]=obj.nextDouble(); 
        
        
         System.out.println("Enter the data of CLIENT #23");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[22]=obj.nextLine(); clientid[22]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[22]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[22]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[22]);
        clientamount[22]=obj.nextDouble(); 
        
         System.out.println("Enter the data of CLIENT #24");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[23]=obj.nextLine(); clientid[23]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[23]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[23]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[23]);
        clientamount[23]=obj.nextDouble(); 
        
        System.out.println("Enter the data of CLIENT #25");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[24]=obj.nextLine(); clientid[24]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[24]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[24]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[24]);
        clientamount[24]=obj.nextDouble(); 
        
        
         System.out.println("Enter the data of CLIENT #26");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[25]=obj.nextLine(); clientid[25]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[25]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[25]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[25]);
        clientamount[25]=obj.nextDouble(); 
        
        System.out.println("Enter the data of CLIENT #27");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[26]=obj.nextLine(); clientid[26]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[26]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[26]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[26]);
        clientamount[26]=obj.nextDouble(); 
        
        System.out.println("Enter the data of CLIENT #28");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[27]=obj.nextLine(); clientid[27]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[27]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[27]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[26]);
        clientamount[27]=obj.nextDouble(); 
        
          System.out.println("Enter the data of CLIENT #29");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[28]=obj.nextLine(); clientid[28]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[28]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[28]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[28]);
        clientamount[28]=obj.nextDouble(); 
        
        System.out.println("Enter the data of CLIENT #30");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[29]=obj.nextLine(); clientid[29]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[29]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[29]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[29]);
        clientamount[29]=obj.nextDouble(); 
        
         
        System.out.println("Enter the data of CLIENT #31");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[30]=obj.nextLine(); clientid[30]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[30]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[29]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[30]);
        clientamount[30]=obj.nextDouble(); 
       
        
         System.out.println("Enter the data of CLIENT #32");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[31]=obj.nextLine(); clientid[31]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[31]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[31]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[31]);
        clientamount[31]=obj.nextDouble(); 
        
         System.out.println("Enter the data of CLIENT #33");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[32]=obj.nextLine(); clientid[32]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[32]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[32]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[32]);
        clientamount[32]=obj.nextDouble(); 
        
        System.out.println("Enter the data of CLIENT #34");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[33]=obj.nextLine(); clientid[33]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[33]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[33]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[33]);
        clientamount[33]=obj.nextDouble(); 
        
         System.out.println("Enter the data of CLIENT #35");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[34]=obj.nextLine(); clientid[34]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[34]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[34]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[34]);
        clientamount[34]=obj.nextDouble(); 
        
         System.out.println("Enter the data of CLIENT #36");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[35]=obj.nextLine(); clientid[35]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[35]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[35]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[35]);
        clientamount[35]=obj.nextDouble(); 
        
        
        System.out.println("Enter the data of CLIENT #37");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[36]=obj.nextLine(); clientid[36]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[36]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[36]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[36]);
        clientamount[36]=obj.nextDouble(); 
       
       
        
        break;
           case 38:
        
        System.out.println("Enter the data of CLIENT #01");        
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[0]=obj.nextLine(); clientid[0]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[0]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[0]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[0]);
        clientamount[0]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #02");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[1]=obj.nextLine(); clientid[1]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[1]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[1]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[1]);
        clientamount[1]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #03");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[2]=obj.nextLine(); clientid[2]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[2]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[2]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[2]);
        clientamount[2]=obj.nextDouble();
        
        
        System.out.println("Enter the data of CLIENT #04");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[3]=obj.nextLine(); clientid[3]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[3]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[3]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[3]);
        clientamount[3]=obj.nextDouble();
        
            
        System.out.println("Enter the data of CLIENT #05");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[4]=obj.nextLine(); clientid[4]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[4]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[4]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[4]);
        clientamount[4]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #06");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[5]=obj.nextLine(); clientid[5]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[5]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[5]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[5]);
        clientamount[5]=obj.nextDouble();
        
        
        System.out.println("Enter the data of CLIENT #07");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[6]=obj.nextLine(); clientid[6]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[6]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[6]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[6]);
        clientamount[6]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #08");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[7]=obj.nextLine(); clientid[7]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[7]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[7]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[7]);
        clientamount[7]=obj.nextDouble();
        
        
        System.out.println("Enter the data of CLIENT #09");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[8]=obj.nextLine(); clientid[8]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[8]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[8]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[8]);
        clientamount[8]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #10");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[9]=obj.nextLine(); clientid[9]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[9]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[9]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[9]);
        clientamount[9]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #11");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[10]=obj.nextLine(); clientid[9]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[10]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[10]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[10]);
        clientamount[10]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #13");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[12]=obj.nextLine(); clientid[12]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[12]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[12]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[12]);
        clientamount[12]=obj.nextDouble(); 
        
        
          System.out.println("Enter the data of CLIENT #14");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[13]=obj.nextLine(); clientid[13]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[13]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[13]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[13]);
        clientamount[13]=obj.nextDouble(); 
        
        System.out.println("Enter the data of CLIENT #15");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[14]=obj.nextLine(); clientid[14]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[14]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[14]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[14]);
        clientamount[14]=obj.nextDouble(); 
        
         System.out.println("Enter the data of CLIENT #16");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[15]=obj.nextLine(); clientid[15]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[15]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[15]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[14]);
        clientamount[15]=obj.nextDouble(); 
        
        
        
         System.out.println("Enter the data of CLIENT #17");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[16]=obj.nextLine(); clientid[16]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[16]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[16]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[16]);
        clientamount[16]=obj.nextDouble(); 
        
        
        System.out.println("Enter the data of CLIENT #18");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[17]=obj.nextLine(); clientid[17]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[17]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[17]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[17]);
        clientamount[17]=obj.nextDouble(); 
       
        System.out.println("Enter the data of CLIENT #19");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[18]=obj.nextLine(); clientid[18]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[18]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[18]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[18]);
        clientamount[18]=obj.nextDouble(); 
        
        System.out.println("Enter the data of CLIENT #20");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[19]=obj.nextLine(); clientid[19]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[19]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[19]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[19]);
        clientamount[19]=obj.nextDouble(); 
        
         System.out.println("Enter the data of CLIENT #21");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[20]=obj.nextLine(); clientid[20]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[20]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[20]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[20]);
        clientamount[20]=obj.nextDouble(); 
        
        System.out.println("Enter the data of CLIENT #22");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[21]=obj.nextLine(); clientid[21]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[21]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[21]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[21]);
        clientamount[21]=obj.nextDouble(); 
        
        
         System.out.println("Enter the data of CLIENT #23");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[22]=obj.nextLine(); clientid[22]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[22]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[22]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[22]);
        clientamount[22]=obj.nextDouble(); 
        
         System.out.println("Enter the data of CLIENT #24");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[23]=obj.nextLine(); clientid[23]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[23]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[23]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[23]);
        clientamount[23]=obj.nextDouble(); 
        
        System.out.println("Enter the data of CLIENT #25");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[24]=obj.nextLine(); clientid[24]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[24]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[24]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[24]);
        clientamount[24]=obj.nextDouble(); 
        
        
         System.out.println("Enter the data of CLIENT #26");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[25]=obj.nextLine(); clientid[25]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[25]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[25]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[25]);
        clientamount[25]=obj.nextDouble(); 
        
        System.out.println("Enter the data of CLIENT #27");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[26]=obj.nextLine(); clientid[26]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[26]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[26]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[26]);
        clientamount[26]=obj.nextDouble(); 
        
        System.out.println("Enter the data of CLIENT #28");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[27]=obj.nextLine(); clientid[27]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[27]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[27]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[26]);
        clientamount[27]=obj.nextDouble(); 
        
          System.out.println("Enter the data of CLIENT #29");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[28]=obj.nextLine(); clientid[28]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[28]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[28]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[28]);
        clientamount[28]=obj.nextDouble(); 
        
        System.out.println("Enter the data of CLIENT #30");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[29]=obj.nextLine(); clientid[29]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[29]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[29]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[29]);
        clientamount[29]=obj.nextDouble(); 
        
         
        System.out.println("Enter the data of CLIENT #31");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[30]=obj.nextLine(); clientid[30]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[30]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[29]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[30]);
        clientamount[30]=obj.nextDouble(); 
       
        
         System.out.println("Enter the data of CLIENT #32");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[31]=obj.nextLine(); clientid[31]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[31]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[31]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[31]);
        clientamount[31]=obj.nextDouble(); 
        
         System.out.println("Enter the data of CLIENT #33");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[32]=obj.nextLine(); clientid[32]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[32]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[32]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[32]);
        clientamount[32]=obj.nextDouble(); 
        
        System.out.println("Enter the data of CLIENT #34");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[33]=obj.nextLine(); clientid[33]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[33]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[33]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[33]);
        clientamount[33]=obj.nextDouble(); 
        
         System.out.println("Enter the data of CLIENT #35");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[34]=obj.nextLine(); clientid[34]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[34]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[34]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[34]);
        clientamount[34]=obj.nextDouble(); 
        
         System.out.println("Enter the data of CLIENT #36");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[35]=obj.nextLine(); clientid[35]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[35]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[35]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[35]);
        clientamount[35]=obj.nextDouble(); 
        
        
        System.out.println("Enter the data of CLIENT #37");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[36]=obj.nextLine(); clientid[36]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[36]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[36]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[36]);
        clientamount[36]=obj.nextDouble(); 
        
        
        System.out.println("Enter the data of CLIENT #38");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[37]=obj.nextLine(); clientid[37]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[37]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[37]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[37]);
        clientamount[37]=obj.nextDouble(); 
       
       
        
        break;
             
             
           case 39:
        
        System.out.println("Enter the data of CLIENT #01");        
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[0]=obj.nextLine(); clientid[0]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[0]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[0]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[0]);
        clientamount[0]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #02");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[1]=obj.nextLine(); clientid[1]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[1]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[1]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[1]);
        clientamount[1]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #03");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[2]=obj.nextLine(); clientid[2]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[2]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[2]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[2]);
        clientamount[2]=obj.nextDouble();
        
        
        System.out.println("Enter the data of CLIENT #04");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[3]=obj.nextLine(); clientid[3]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[3]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[3]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[3]);
        clientamount[3]=obj.nextDouble();
        
            
        System.out.println("Enter the data of CLIENT #05");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[4]=obj.nextLine(); clientid[4]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[4]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[4]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[4]);
        clientamount[4]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #06");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[5]=obj.nextLine(); clientid[5]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[5]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[5]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[5]);
        clientamount[5]=obj.nextDouble();
        
        
        System.out.println("Enter the data of CLIENT #07");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[6]=obj.nextLine(); clientid[6]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[6]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[6]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[6]);
        clientamount[6]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #08");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[7]=obj.nextLine(); clientid[7]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[7]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[7]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[7]);
        clientamount[7]=obj.nextDouble();
        
        
        System.out.println("Enter the data of CLIENT #09");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[8]=obj.nextLine(); clientid[8]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[8]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[8]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[8]);
        clientamount[8]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #10");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[9]=obj.nextLine(); clientid[9]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[9]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[9]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[9]);
        clientamount[9]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #11");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[10]=obj.nextLine(); clientid[9]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[10]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[10]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[10]);
        clientamount[10]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #13");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[12]=obj.nextLine(); clientid[12]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[12]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[12]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[12]);
        clientamount[12]=obj.nextDouble(); 
        
        
          System.out.println("Enter the data of CLIENT #14");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[13]=obj.nextLine(); clientid[13]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[13]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[13]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[13]);
        clientamount[13]=obj.nextDouble(); 
        
        System.out.println("Enter the data of CLIENT #15");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[14]=obj.nextLine(); clientid[14]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[14]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[14]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[14]);
        clientamount[14]=obj.nextDouble(); 
        
         System.out.println("Enter the data of CLIENT #16");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[15]=obj.nextLine(); clientid[15]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[15]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[15]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[14]);
        clientamount[15]=obj.nextDouble(); 
        
        
        
         System.out.println("Enter the data of CLIENT #17");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[16]=obj.nextLine(); clientid[16]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[16]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[16]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[16]);
        clientamount[16]=obj.nextDouble(); 
        
        
        System.out.println("Enter the data of CLIENT #18");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[17]=obj.nextLine(); clientid[17]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[17]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[17]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[17]);
        clientamount[17]=obj.nextDouble(); 
       
        System.out.println("Enter the data of CLIENT #19");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[18]=obj.nextLine(); clientid[18]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[18]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[18]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[18]);
        clientamount[18]=obj.nextDouble(); 
        
        System.out.println("Enter the data of CLIENT #20");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[19]=obj.nextLine(); clientid[19]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[19]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[19]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[19]);
        clientamount[19]=obj.nextDouble(); 
        
         System.out.println("Enter the data of CLIENT #21");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[20]=obj.nextLine(); clientid[20]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[20]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[20]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[20]);
        clientamount[20]=obj.nextDouble(); 
        
        System.out.println("Enter the data of CLIENT #22");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[21]=obj.nextLine(); clientid[21]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[21]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[21]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[21]);
        clientamount[21]=obj.nextDouble(); 
        
        
         System.out.println("Enter the data of CLIENT #23");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[22]=obj.nextLine(); clientid[22]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[22]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[22]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[22]);
        clientamount[22]=obj.nextDouble(); 
        
         System.out.println("Enter the data of CLIENT #24");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[23]=obj.nextLine(); clientid[23]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[23]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[23]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[23]);
        clientamount[23]=obj.nextDouble(); 
        
        System.out.println("Enter the data of CLIENT #25");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[24]=obj.nextLine(); clientid[24]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[24]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[24]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[24]);
        clientamount[24]=obj.nextDouble(); 
        
        
         System.out.println("Enter the data of CLIENT #26");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[25]=obj.nextLine(); clientid[25]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[25]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[25]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[25]);
        clientamount[25]=obj.nextDouble(); 
        
        System.out.println("Enter the data of CLIENT #27");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[26]=obj.nextLine(); clientid[26]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[26]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[26]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[26]);
        clientamount[26]=obj.nextDouble(); 
        
        System.out.println("Enter the data of CLIENT #28");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[27]=obj.nextLine(); clientid[27]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[27]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[27]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[26]);
        clientamount[27]=obj.nextDouble(); 
        
          System.out.println("Enter the data of CLIENT #29");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[28]=obj.nextLine(); clientid[28]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[28]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[28]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[28]);
        clientamount[28]=obj.nextDouble(); 
        
        System.out.println("Enter the data of CLIENT #30");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[29]=obj.nextLine(); clientid[29]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[29]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[29]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[29]);
        clientamount[29]=obj.nextDouble(); 
        
         
        System.out.println("Enter the data of CLIENT #31");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[30]=obj.nextLine(); clientid[30]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[30]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[29]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[30]);
        clientamount[30]=obj.nextDouble(); 
       
        
         System.out.println("Enter the data of CLIENT #32");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[31]=obj.nextLine(); clientid[31]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[31]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[31]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[31]);
        clientamount[31]=obj.nextDouble(); 
        
         System.out.println("Enter the data of CLIENT #33");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[32]=obj.nextLine(); clientid[32]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[32]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[32]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[32]);
        clientamount[32]=obj.nextDouble(); 
        
        System.out.println("Enter the data of CLIENT #34");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[33]=obj.nextLine(); clientid[33]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[33]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[33]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[33]);
        clientamount[33]=obj.nextDouble(); 
        
         System.out.println("Enter the data of CLIENT #35");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[34]=obj.nextLine(); clientid[34]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[34]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[34]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[34]);
        clientamount[34]=obj.nextDouble(); 
        
         System.out.println("Enter the data of CLIENT #36");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[35]=obj.nextLine(); clientid[35]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[35]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[35]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[35]);
        clientamount[35]=obj.nextDouble(); 
        
        
        System.out.println("Enter the data of CLIENT #37");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[36]=obj.nextLine(); clientid[36]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[36]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[36]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[36]);
        clientamount[36]=obj.nextDouble(); 
        
        
        System.out.println("Enter the data of CLIENT #38");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[37]=obj.nextLine(); clientid[37]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[37]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[37]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[37]);
        clientamount[37]=obj.nextDouble(); 
        
        System.out.println("Enter the data of CLIENT #39");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[38]=obj.nextLine(); clientid[38]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[38]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[38]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[38]);
        clientamount[38]=obj.nextDouble(); 
       
       
        
        break;
             
           case 40:
        
        System.out.println("Enter the data of CLIENT #01");        
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[0]=obj.nextLine(); clientid[0]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[0]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[0]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[0]);
        clientamount[0]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #02");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[1]=obj.nextLine(); clientid[1]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[1]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[1]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[1]);
        clientamount[1]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #03");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[2]=obj.nextLine(); clientid[2]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[2]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[2]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[2]);
        clientamount[2]=obj.nextDouble();
        
        
        System.out.println("Enter the data of CLIENT #04");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[3]=obj.nextLine(); clientid[3]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[3]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[3]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[3]);
        clientamount[3]=obj.nextDouble();
        
            
        System.out.println("Enter the data of CLIENT #05");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[4]=obj.nextLine(); clientid[4]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[4]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[4]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[4]);
        clientamount[4]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #06");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[5]=obj.nextLine(); clientid[5]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[5]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[5]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[5]);
        clientamount[5]=obj.nextDouble();
        
        
        System.out.println("Enter the data of CLIENT #07");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[6]=obj.nextLine(); clientid[6]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[6]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[6]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[6]);
        clientamount[6]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #08");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[7]=obj.nextLine(); clientid[7]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[7]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[7]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[7]);
        clientamount[7]=obj.nextDouble();
        
        
        System.out.println("Enter the data of CLIENT #09");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[8]=obj.nextLine(); clientid[8]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[8]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[8]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[8]);
        clientamount[8]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #10");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[9]=obj.nextLine(); clientid[9]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[9]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[9]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[9]);
        clientamount[9]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #11");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[10]=obj.nextLine(); clientid[9]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[10]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[10]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[10]);
        clientamount[10]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #13");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[12]=obj.nextLine(); clientid[12]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[12]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[12]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[12]);
        clientamount[12]=obj.nextDouble(); 
        
        
          System.out.println("Enter the data of CLIENT #14");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[13]=obj.nextLine(); clientid[13]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[13]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[13]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[13]);
        clientamount[13]=obj.nextDouble(); 
        
        System.out.println("Enter the data of CLIENT #15");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[14]=obj.nextLine(); clientid[14]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[14]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[14]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[14]);
        clientamount[14]=obj.nextDouble(); 
        
         System.out.println("Enter the data of CLIENT #16");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[15]=obj.nextLine(); clientid[15]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[15]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[15]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[14]);
        clientamount[15]=obj.nextDouble(); 
        
        
        
         System.out.println("Enter the data of CLIENT #17");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[16]=obj.nextLine(); clientid[16]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[16]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[16]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[16]);
        clientamount[16]=obj.nextDouble(); 
        
        
        System.out.println("Enter the data of CLIENT #18");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[17]=obj.nextLine(); clientid[17]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[17]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[17]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[17]);
        clientamount[17]=obj.nextDouble(); 
       
        System.out.println("Enter the data of CLIENT #19");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[18]=obj.nextLine(); clientid[18]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[18]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[18]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[18]);
        clientamount[18]=obj.nextDouble(); 
        
        System.out.println("Enter the data of CLIENT #20");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[19]=obj.nextLine(); clientid[19]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[19]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[19]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[19]);
        clientamount[19]=obj.nextDouble(); 
        
         System.out.println("Enter the data of CLIENT #21");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[20]=obj.nextLine(); clientid[20]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[20]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[20]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[20]);
        clientamount[20]=obj.nextDouble(); 
        
        System.out.println("Enter the data of CLIENT #22");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[21]=obj.nextLine(); clientid[21]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[21]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[21]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[21]);
        clientamount[21]=obj.nextDouble(); 
        
        
         System.out.println("Enter the data of CLIENT #23");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[22]=obj.nextLine(); clientid[22]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[22]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[22]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[22]);
        clientamount[22]=obj.nextDouble(); 
        
         System.out.println("Enter the data of CLIENT #24");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[23]=obj.nextLine(); clientid[23]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[23]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[23]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[23]);
        clientamount[23]=obj.nextDouble(); 
        
        System.out.println("Enter the data of CLIENT #25");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[24]=obj.nextLine(); clientid[24]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[24]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[24]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[24]);
        clientamount[24]=obj.nextDouble(); 
        
        
         System.out.println("Enter the data of CLIENT #26");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[25]=obj.nextLine(); clientid[25]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[25]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[25]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[25]);
        clientamount[25]=obj.nextDouble(); 
        
        System.out.println("Enter the data of CLIENT #27");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[26]=obj.nextLine(); clientid[26]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[26]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[26]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[26]);
        clientamount[26]=obj.nextDouble(); 
        
        System.out.println("Enter the data of CLIENT #28");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[27]=obj.nextLine(); clientid[27]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[27]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[27]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[26]);
        clientamount[27]=obj.nextDouble(); 
        
          System.out.println("Enter the data of CLIENT #29");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[28]=obj.nextLine(); clientid[28]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[28]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[28]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[28]);
        clientamount[28]=obj.nextDouble(); 
        
        System.out.println("Enter the data of CLIENT #30");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[29]=obj.nextLine(); clientid[29]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[29]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[29]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[29]);
        clientamount[29]=obj.nextDouble(); 
        
         
        System.out.println("Enter the data of CLIENT #31");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[30]=obj.nextLine(); clientid[30]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[30]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[29]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[30]);
        clientamount[30]=obj.nextDouble(); 
       
        
         System.out.println("Enter the data of CLIENT #32");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[31]=obj.nextLine(); clientid[31]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[31]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[31]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[31]);
        clientamount[31]=obj.nextDouble(); 
        
         System.out.println("Enter the data of CLIENT #33");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[32]=obj.nextLine(); clientid[32]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[32]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[32]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[32]);
        clientamount[32]=obj.nextDouble(); 
        
        System.out.println("Enter the data of CLIENT #34");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[33]=obj.nextLine(); clientid[33]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[33]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[33]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[33]);
        clientamount[33]=obj.nextDouble(); 
        
         System.out.println("Enter the data of CLIENT #35");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[34]=obj.nextLine(); clientid[34]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[34]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[34]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[34]);
        clientamount[34]=obj.nextDouble(); 
        
         System.out.println("Enter the data of CLIENT #36");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[35]=obj.nextLine(); clientid[35]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[35]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[35]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[35]);
        clientamount[35]=obj.nextDouble(); 
        
        
        System.out.println("Enter the data of CLIENT #37");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[36]=obj.nextLine(); clientid[36]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[36]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[36]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[36]);
        clientamount[36]=obj.nextDouble(); 
        
        
        System.out.println("Enter the data of CLIENT #38");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[37]=obj.nextLine(); clientid[37]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[37]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[37]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[37]);
        clientamount[37]=obj.nextDouble(); 
        
        System.out.println("Enter the data of CLIENT #39");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[38]=obj.nextLine(); clientid[38]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[38]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[38]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[38]);
        clientamount[38]=obj.nextDouble(); 
        
         System.out.println("Enter the data of CLIENT #40");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[39]=obj.nextLine(); clientid[39]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[39]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[39]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[39]);
        clientamount[39]=obj.nextDouble(); 
       
       
        
        break;
        
           case 41:
        System.out.println("Enter the data of CLIENT #01");        
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[0]=obj.nextLine(); clientid[0]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[0]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[0]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[0]);
        clientamount[0]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #02");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[1]=obj.nextLine(); clientid[1]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[1]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[1]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[1]);
        clientamount[1]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #03");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[2]=obj.nextLine(); clientid[2]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[2]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[2]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[2]);
        clientamount[2]=obj.nextDouble();
        
        
        System.out.println("Enter the data of CLIENT #04");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[3]=obj.nextLine(); clientid[3]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[3]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[3]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[3]);
        clientamount[3]=obj.nextDouble();
        
            
        System.out.println("Enter the data of CLIENT #05");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[4]=obj.nextLine(); clientid[4]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[4]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[4]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[4]);
        clientamount[4]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #06");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[5]=obj.nextLine(); clientid[5]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[5]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[5]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[5]);
        clientamount[5]=obj.nextDouble();
        
        
        System.out.println("Enter the data of CLIENT #07");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[6]=obj.nextLine(); clientid[6]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[6]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[6]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[6]);
        clientamount[6]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #08");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[7]=obj.nextLine(); clientid[7]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[7]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[7]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[7]);
        clientamount[7]=obj.nextDouble();
        
        
        System.out.println("Enter the data of CLIENT #09");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[8]=obj.nextLine(); clientid[8]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[8]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[8]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[8]);
        clientamount[8]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #10");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[9]=obj.nextLine(); clientid[9]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[9]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[9]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[9]);
        clientamount[9]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #11");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[10]=obj.nextLine(); clientid[9]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[10]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[10]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[10]);
        clientamount[10]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #13");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[12]=obj.nextLine(); clientid[12]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[12]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[12]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[12]);
        clientamount[12]=obj.nextDouble(); 
        
        
          System.out.println("Enter the data of CLIENT #14");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[13]=obj.nextLine(); clientid[13]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[13]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[13]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[13]);
        clientamount[13]=obj.nextDouble(); 
        
        System.out.println("Enter the data of CLIENT #15");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[14]=obj.nextLine(); clientid[14]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[14]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[14]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[14]);
        clientamount[14]=obj.nextDouble(); 
        
         System.out.println("Enter the data of CLIENT #16");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[15]=obj.nextLine(); clientid[15]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[15]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[15]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[14]);
        clientamount[15]=obj.nextDouble(); 
        
        
        
         System.out.println("Enter the data of CLIENT #17");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[16]=obj.nextLine(); clientid[16]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[16]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[16]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[16]);
        clientamount[16]=obj.nextDouble(); 
        
        
        System.out.println("Enter the data of CLIENT #18");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[17]=obj.nextLine(); clientid[17]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[17]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[17]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[17]);
        clientamount[17]=obj.nextDouble(); 
       
        System.out.println("Enter the data of CLIENT #19");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[18]=obj.nextLine(); clientid[18]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[18]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[18]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[18]);
        clientamount[18]=obj.nextDouble(); 
        
        System.out.println("Enter the data of CLIENT #20");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[19]=obj.nextLine(); clientid[19]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[19]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[19]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[19]);
        clientamount[19]=obj.nextDouble(); 
        
         System.out.println("Enter the data of CLIENT #21");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[20]=obj.nextLine(); clientid[20]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[20]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[20]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[20]);
        clientamount[20]=obj.nextDouble(); 
        
        System.out.println("Enter the data of CLIENT #22");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[21]=obj.nextLine(); clientid[21]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[21]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[21]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[21]);
        clientamount[21]=obj.nextDouble(); 
        
        
         System.out.println("Enter the data of CLIENT #23");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[22]=obj.nextLine(); clientid[22]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[22]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[22]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[22]);
        clientamount[22]=obj.nextDouble(); 
        
         System.out.println("Enter the data of CLIENT #24");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[23]=obj.nextLine(); clientid[23]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[23]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[23]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[23]);
        clientamount[23]=obj.nextDouble(); 
        
        System.out.println("Enter the data of CLIENT #25");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[24]=obj.nextLine(); clientid[24]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[24]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[24]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[24]);
        clientamount[24]=obj.nextDouble(); 
        
        
         System.out.println("Enter the data of CLIENT #26");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[25]=obj.nextLine(); clientid[25]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[25]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[25]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[25]);
        clientamount[25]=obj.nextDouble(); 
        
        System.out.println("Enter the data of CLIENT #27");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[26]=obj.nextLine(); clientid[26]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[26]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[26]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[26]);
        clientamount[26]=obj.nextDouble(); 
        
        System.out.println("Enter the data of CLIENT #28");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[27]=obj.nextLine(); clientid[27]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[27]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[27]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[26]);
        clientamount[27]=obj.nextDouble(); 
        
          System.out.println("Enter the data of CLIENT #29");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[28]=obj.nextLine(); clientid[28]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[28]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[28]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[28]);
        clientamount[28]=obj.nextDouble(); 
        
        System.out.println("Enter the data of CLIENT #30");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[29]=obj.nextLine(); clientid[29]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[29]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[29]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[29]);
        clientamount[29]=obj.nextDouble(); 
        
         
        System.out.println("Enter the data of CLIENT #31");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[30]=obj.nextLine(); clientid[30]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[30]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[29]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[30]);
        clientamount[30]=obj.nextDouble(); 
       
        
         System.out.println("Enter the data of CLIENT #32");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[31]=obj.nextLine(); clientid[31]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[31]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[31]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[31]);
        clientamount[31]=obj.nextDouble(); 
        
         System.out.println("Enter the data of CLIENT #33");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[32]=obj.nextLine(); clientid[32]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[32]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[32]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[32]);
        clientamount[32]=obj.nextDouble(); 
        
        System.out.println("Enter the data of CLIENT #34");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[33]=obj.nextLine(); clientid[33]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[33]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[33]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[33]);
        clientamount[33]=obj.nextDouble(); 
        
         System.out.println("Enter the data of CLIENT #35");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[34]=obj.nextLine(); clientid[34]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[34]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[34]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[34]);
        clientamount[34]=obj.nextDouble(); 
        
         System.out.println("Enter the data of CLIENT #36");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[35]=obj.nextLine(); clientid[35]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[35]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[35]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[35]);
        clientamount[35]=obj.nextDouble(); 
        
        
        System.out.println("Enter the data of CLIENT #37");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[36]=obj.nextLine(); clientid[36]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[36]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[36]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[36]);
        clientamount[36]=obj.nextDouble(); 
        
        
        System.out.println("Enter the data of CLIENT #38");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[37]=obj.nextLine(); clientid[37]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[37]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[37]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[37]);
        clientamount[37]=obj.nextDouble(); 
        
        System.out.println("Enter the data of CLIENT #39");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[38]=obj.nextLine(); clientid[38]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[38]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[38]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[38]);
        clientamount[38]=obj.nextDouble(); 
        
         System.out.println("Enter the data of CLIENT #40");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[39]=obj.nextLine(); clientid[39]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[39]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[39]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[39]);
        clientamount[39]=obj.nextDouble(); 
        
        System.out.println("Enter the data of CLIENT #41");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[40]=obj.nextLine(); clientid[40]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[40]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[40]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[40]);
        clientamount[40]=obj.nextDouble(); 
       
       
        
        break;
             
           case 42:
        
        System.out.println("Enter the data of CLIENT #01");        
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[0]=obj.nextLine(); clientid[0]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[0]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[0]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[0]);
        clientamount[0]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #02");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[1]=obj.nextLine(); clientid[1]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[1]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[1]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[1]);
        clientamount[1]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #03");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[2]=obj.nextLine(); clientid[2]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[2]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[2]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[2]);
        clientamount[2]=obj.nextDouble();
        
        
        System.out.println("Enter the data of CLIENT #04");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[3]=obj.nextLine(); clientid[3]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[3]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[3]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[3]);
        clientamount[3]=obj.nextDouble();
        
            
        System.out.println("Enter the data of CLIENT #05");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[4]=obj.nextLine(); clientid[4]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[4]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[4]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[4]);
        clientamount[4]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #06");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[5]=obj.nextLine(); clientid[5]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[5]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[5]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[5]);
        clientamount[5]=obj.nextDouble();
        
        
        System.out.println("Enter the data of CLIENT #07");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[6]=obj.nextLine(); clientid[6]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[6]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[6]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[6]);
        clientamount[6]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #08");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[7]=obj.nextLine(); clientid[7]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[7]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[7]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[7]);
        clientamount[7]=obj.nextDouble();
        
        
        System.out.println("Enter the data of CLIENT #09");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[8]=obj.nextLine(); clientid[8]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[8]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[8]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[8]);
        clientamount[8]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #10");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[9]=obj.nextLine(); clientid[9]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[9]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[9]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[9]);
        clientamount[9]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #11");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[10]=obj.nextLine(); clientid[9]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[10]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[10]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[10]);
        clientamount[10]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #13");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[12]=obj.nextLine(); clientid[12]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[12]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[12]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[12]);
        clientamount[12]=obj.nextDouble(); 
        
        
          System.out.println("Enter the data of CLIENT #14");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[13]=obj.nextLine(); clientid[13]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[13]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[13]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[13]);
        clientamount[13]=obj.nextDouble(); 
        
        System.out.println("Enter the data of CLIENT #15");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[14]=obj.nextLine(); clientid[14]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[14]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[14]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[14]);
        clientamount[14]=obj.nextDouble(); 
        
         System.out.println("Enter the data of CLIENT #16");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[15]=obj.nextLine(); clientid[15]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[15]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[15]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[14]);
        clientamount[15]=obj.nextDouble(); 
        
        
        
         System.out.println("Enter the data of CLIENT #17");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[16]=obj.nextLine(); clientid[16]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[16]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[16]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[16]);
        clientamount[16]=obj.nextDouble(); 
        
        
        System.out.println("Enter the data of CLIENT #18");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[17]=obj.nextLine(); clientid[17]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[17]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[17]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[17]);
        clientamount[17]=obj.nextDouble(); 
       
        System.out.println("Enter the data of CLIENT #19");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[18]=obj.nextLine(); clientid[18]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[18]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[18]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[18]);
        clientamount[18]=obj.nextDouble(); 
        
        System.out.println("Enter the data of CLIENT #20");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[19]=obj.nextLine(); clientid[19]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[19]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[19]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[19]);
        clientamount[19]=obj.nextDouble(); 
        
         System.out.println("Enter the data of CLIENT #21");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[20]=obj.nextLine(); clientid[20]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[20]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[20]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[20]);
        clientamount[20]=obj.nextDouble(); 
        
        System.out.println("Enter the data of CLIENT #22");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[21]=obj.nextLine(); clientid[21]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[21]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[21]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[21]);
        clientamount[21]=obj.nextDouble(); 
        
        
         System.out.println("Enter the data of CLIENT #23");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[22]=obj.nextLine(); clientid[22]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[22]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[22]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[22]);
        clientamount[22]=obj.nextDouble(); 
        
         System.out.println("Enter the data of CLIENT #24");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[23]=obj.nextLine(); clientid[23]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[23]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[23]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[23]);
        clientamount[23]=obj.nextDouble(); 
        
        System.out.println("Enter the data of CLIENT #25");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[24]=obj.nextLine(); clientid[24]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[24]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[24]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[24]);
        clientamount[24]=obj.nextDouble(); 
        
        
         System.out.println("Enter the data of CLIENT #26");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[25]=obj.nextLine(); clientid[25]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[25]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[25]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[25]);
        clientamount[25]=obj.nextDouble(); 
        
        System.out.println("Enter the data of CLIENT #27");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[26]=obj.nextLine(); clientid[26]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[26]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[26]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[26]);
        clientamount[26]=obj.nextDouble(); 
        
        System.out.println("Enter the data of CLIENT #28");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[27]=obj.nextLine(); clientid[27]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[27]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[27]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[26]);
        clientamount[27]=obj.nextDouble(); 
        
          System.out.println("Enter the data of CLIENT #29");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[28]=obj.nextLine(); clientid[28]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[28]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[28]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[28]);
        clientamount[28]=obj.nextDouble(); 
        
        System.out.println("Enter the data of CLIENT #30");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[29]=obj.nextLine(); clientid[29]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[29]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[29]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[29]);
        clientamount[29]=obj.nextDouble(); 
        
         
        System.out.println("Enter the data of CLIENT #31");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[30]=obj.nextLine(); clientid[30]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[30]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[29]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[30]);
        clientamount[30]=obj.nextDouble(); 
       
        
         System.out.println("Enter the data of CLIENT #32");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[31]=obj.nextLine(); clientid[31]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[31]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[31]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[31]);
        clientamount[31]=obj.nextDouble(); 
        
         System.out.println("Enter the data of CLIENT #33");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[32]=obj.nextLine(); clientid[32]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[32]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[32]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[32]);
        clientamount[32]=obj.nextDouble(); 
        
        System.out.println("Enter the data of CLIENT #34");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[33]=obj.nextLine(); clientid[33]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[33]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[33]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[33]);
        clientamount[33]=obj.nextDouble(); 
        
         System.out.println("Enter the data of CLIENT #35");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[34]=obj.nextLine(); clientid[34]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[34]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[34]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[34]);
        clientamount[34]=obj.nextDouble(); 
        
         System.out.println("Enter the data of CLIENT #36");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[35]=obj.nextLine(); clientid[35]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[35]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[35]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[35]);
        clientamount[35]=obj.nextDouble(); 
        
        
        System.out.println("Enter the data of CLIENT #37");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[36]=obj.nextLine(); clientid[36]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[36]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[36]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[36]);
        clientamount[36]=obj.nextDouble(); 
        
        
        System.out.println("Enter the data of CLIENT #38");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[37]=obj.nextLine(); clientid[37]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[37]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[37]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[37]);
        clientamount[37]=obj.nextDouble(); 
        
        System.out.println("Enter the data of CLIENT #39");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[38]=obj.nextLine(); clientid[38]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[38]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[38]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[38]);
        clientamount[38]=obj.nextDouble(); 
        
         System.out.println("Enter the data of CLIENT #40");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[39]=obj.nextLine(); clientid[39]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[39]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[39]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[38]);
        clientamount[39]=obj.nextDouble(); 
        
        System.out.println("Enter the data of CLIENT #41");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[40]=obj.nextLine(); clientid[40]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[40]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[40]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[40]);
        clientamount[40]=obj.nextDouble(); 
        
        System.out.println("Enter the data of CLIENT #42");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[41]=obj.nextLine(); clientid[41]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[41]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[41]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[41]);
        clientamount[41]=obj.nextDouble(); 
       
       
        
        break;
             
           case 43:
        
        System.out.println("Enter the data of CLIENT #01");        
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[0]=obj.nextLine(); clientid[0]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[0]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[0]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[0]);
        clientamount[0]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #02");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[1]=obj.nextLine(); clientid[1]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[1]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[1]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[1]);
        clientamount[1]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #03");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[2]=obj.nextLine(); clientid[2]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[2]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[2]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[2]);
        clientamount[2]=obj.nextDouble();
        
        
        System.out.println("Enter the data of CLIENT #04");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[3]=obj.nextLine(); clientid[3]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[3]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[3]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[3]);
        clientamount[3]=obj.nextDouble();
        
            
        System.out.println("Enter the data of CLIENT #05");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[4]=obj.nextLine(); clientid[4]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[4]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[4]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[4]);
        clientamount[4]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #06");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[5]=obj.nextLine(); clientid[5]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[5]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[5]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[5]);
        clientamount[5]=obj.nextDouble();
        
        
        System.out.println("Enter the data of CLIENT #07");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[6]=obj.nextLine(); clientid[6]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[6]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[6]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[6]);
        clientamount[6]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #08");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[7]=obj.nextLine(); clientid[7]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[7]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[7]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[7]);
        clientamount[7]=obj.nextDouble();
        
        
        System.out.println("Enter the data of CLIENT #09");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[8]=obj.nextLine(); clientid[8]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[8]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[8]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[8]);
        clientamount[8]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #10");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[9]=obj.nextLine(); clientid[9]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[9]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[9]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[9]);
        clientamount[9]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #11");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[10]=obj.nextLine(); clientid[9]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[10]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[10]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[10]);
        clientamount[10]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #13");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[12]=obj.nextLine(); clientid[12]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[12]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[12]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[12]);
        clientamount[12]=obj.nextDouble(); 
        
        
          System.out.println("Enter the data of CLIENT #14");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[13]=obj.nextLine(); clientid[13]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[13]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[13]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[13]);
        clientamount[13]=obj.nextDouble(); 
        
        System.out.println("Enter the data of CLIENT #15");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[14]=obj.nextLine(); clientid[14]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[14]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[14]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[14]);
        clientamount[14]=obj.nextDouble(); 
        
         System.out.println("Enter the data of CLIENT #16");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[15]=obj.nextLine(); clientid[15]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[15]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[15]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[14]);
        clientamount[15]=obj.nextDouble(); 
        
        
        
         System.out.println("Enter the data of CLIENT #17");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[16]=obj.nextLine(); clientid[16]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[16]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[16]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[16]);
        clientamount[16]=obj.nextDouble(); 
        
        
        System.out.println("Enter the data of CLIENT #18");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[17]=obj.nextLine(); clientid[17]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[17]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[17]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[17]);
        clientamount[17]=obj.nextDouble(); 
       
        System.out.println("Enter the data of CLIENT #19");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[18]=obj.nextLine(); clientid[18]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[18]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[18]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[18]);
        clientamount[18]=obj.nextDouble(); 
        
        System.out.println("Enter the data of CLIENT #20");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[19]=obj.nextLine(); clientid[19]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[19]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[19]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[19]);
        clientamount[19]=obj.nextDouble(); 
        
         System.out.println("Enter the data of CLIENT #21");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[20]=obj.nextLine(); clientid[20]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[20]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[20]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[20]);
        clientamount[20]=obj.nextDouble(); 
        
        System.out.println("Enter the data of CLIENT #22");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[21]=obj.nextLine(); clientid[21]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[21]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[21]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[21]);
        clientamount[21]=obj.nextDouble(); 
        
        
         System.out.println("Enter the data of CLIENT #23");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[22]=obj.nextLine(); clientid[22]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[22]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[22]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[22]);
        clientamount[22]=obj.nextDouble(); 
        
         System.out.println("Enter the data of CLIENT #24");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[23]=obj.nextLine(); clientid[23]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[23]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[23]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[23]);
        clientamount[23]=obj.nextDouble(); 
        
        System.out.println("Enter the data of CLIENT #25");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[24]=obj.nextLine(); clientid[24]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[24]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[24]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[24]);
        clientamount[24]=obj.nextDouble(); 
        
        
         System.out.println("Enter the data of CLIENT #26");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[25]=obj.nextLine(); clientid[25]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[25]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[25]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[25]);
        clientamount[25]=obj.nextDouble(); 
        
        System.out.println("Enter the data of CLIENT #27");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[26]=obj.nextLine(); clientid[26]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[26]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[26]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[26]);
        clientamount[26]=obj.nextDouble(); 
        
        System.out.println("Enter the data of CLIENT #28");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[27]=obj.nextLine(); clientid[27]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[27]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[27]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[26]);
        clientamount[27]=obj.nextDouble(); 
        
          System.out.println("Enter the data of CLIENT #29");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[28]=obj.nextLine(); clientid[28]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[28]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[28]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[28]);
        clientamount[28]=obj.nextDouble(); 
        
        System.out.println("Enter the data of CLIENT #30");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[29]=obj.nextLine(); clientid[29]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[29]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[29]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[29]);
        clientamount[29]=obj.nextDouble(); 
        
         
        System.out.println("Enter the data of CLIENT #31");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[30]=obj.nextLine(); clientid[30]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[30]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[29]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[30]);
        clientamount[30]=obj.nextDouble(); 
       
        
         System.out.println("Enter the data of CLIENT #32");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[31]=obj.nextLine(); clientid[31]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[31]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[31]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[31]);
        clientamount[31]=obj.nextDouble(); 
        
         System.out.println("Enter the data of CLIENT #33");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[32]=obj.nextLine(); clientid[32]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[32]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[32]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[32]);
        clientamount[32]=obj.nextDouble(); 
        
        System.out.println("Enter the data of CLIENT #34");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[33]=obj.nextLine(); clientid[33]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[33]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[33]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[33]);
        clientamount[33]=obj.nextDouble(); 
        
         System.out.println("Enter the data of CLIENT #35");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[34]=obj.nextLine(); clientid[34]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[34]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[34]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[34]);
        clientamount[34]=obj.nextDouble(); 
        
         System.out.println("Enter the data of CLIENT #36");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[35]=obj.nextLine(); clientid[35]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[35]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[35]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[35]);
        clientamount[35]=obj.nextDouble(); 
        
        
        System.out.println("Enter the data of CLIENT #37");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[36]=obj.nextLine(); clientid[36]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[36]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[36]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[36]);
        clientamount[36]=obj.nextDouble(); 
        
        
        System.out.println("Enter the data of CLIENT #38");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[37]=obj.nextLine(); clientid[37]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[37]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[37]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[37]);
        clientamount[37]=obj.nextDouble(); 
        
        System.out.println("Enter the data of CLIENT #39");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[38]=obj.nextLine(); clientid[38]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[38]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[38]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[38]);
        clientamount[38]=obj.nextDouble(); 
        
         System.out.println("Enter the data of CLIENT #40");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[39]=obj.nextLine(); clientid[39]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[39]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[39]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[38]);
        clientamount[39]=obj.nextDouble(); 
        
        System.out.println("Enter the data of CLIENT #41");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[40]=obj.nextLine(); clientid[40]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[40]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[40]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[40]);
        clientamount[40]=obj.nextDouble(); 
        
        System.out.println("Enter the data of CLIENT #42");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[41]=obj.nextLine(); clientid[41]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[41]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[41]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[41]);
        clientamount[41]=obj.nextDouble(); 
        
         System.out.println("Enter the data of CLIENT #43");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[42]=obj.nextLine(); clientid[42]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[42]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[42]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[42]);
        clientamount[42]=obj.nextDouble(); 
       
       
        break;
        
           case 44:
        
        System.out.println("Enter the data of CLIENT #01");        
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[0]=obj.nextLine(); clientid[0]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[0]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[0]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[0]);
        clientamount[0]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #02");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[1]=obj.nextLine(); clientid[1]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[1]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[1]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[1]);
        clientamount[1]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #03");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[2]=obj.nextLine(); clientid[2]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[2]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[2]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[2]);
        clientamount[2]=obj.nextDouble();
        
        
        System.out.println("Enter the data of CLIENT #04");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[3]=obj.nextLine(); clientid[3]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[3]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[3]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[3]);
        clientamount[3]=obj.nextDouble();
        
            
        System.out.println("Enter the data of CLIENT #05");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[4]=obj.nextLine(); clientid[4]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[4]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[4]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[4]);
        clientamount[4]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #06");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[5]=obj.nextLine(); clientid[5]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[5]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[5]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[5]);
        clientamount[5]=obj.nextDouble();
        
        
        System.out.println("Enter the data of CLIENT #07");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[6]=obj.nextLine(); clientid[6]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[6]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[6]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[6]);
        clientamount[6]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #08");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[7]=obj.nextLine(); clientid[7]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[7]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[7]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[7]);
        clientamount[7]=obj.nextDouble();
        
        
        System.out.println("Enter the data of CLIENT #09");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[8]=obj.nextLine(); clientid[8]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[8]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[8]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[8]);
        clientamount[8]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #10");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[9]=obj.nextLine(); clientid[9]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[9]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[9]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[9]);
        clientamount[9]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #11");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[10]=obj.nextLine(); clientid[9]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[10]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[10]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[10]);
        clientamount[10]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #13");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[12]=obj.nextLine(); clientid[12]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[12]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[12]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[12]);
        clientamount[12]=obj.nextDouble(); 
        
        
          System.out.println("Enter the data of CLIENT #14");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[13]=obj.nextLine(); clientid[13]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[13]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[13]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[13]);
        clientamount[13]=obj.nextDouble(); 
        
        System.out.println("Enter the data of CLIENT #15");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[14]=obj.nextLine(); clientid[14]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[14]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[14]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[14]);
        clientamount[14]=obj.nextDouble(); 
        
         System.out.println("Enter the data of CLIENT #16");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[15]=obj.nextLine(); clientid[15]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[15]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[15]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[14]);
        clientamount[15]=obj.nextDouble(); 
        
        
        
         System.out.println("Enter the data of CLIENT #17");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[16]=obj.nextLine(); clientid[16]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[16]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[16]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[16]);
        clientamount[16]=obj.nextDouble(); 
        
        
        System.out.println("Enter the data of CLIENT #18");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[17]=obj.nextLine(); clientid[17]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[17]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[17]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[17]);
        clientamount[17]=obj.nextDouble(); 
       
        System.out.println("Enter the data of CLIENT #19");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[18]=obj.nextLine(); clientid[18]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[18]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[18]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[18]);
        clientamount[18]=obj.nextDouble(); 
        
        System.out.println("Enter the data of CLIENT #20");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[19]=obj.nextLine(); clientid[19]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[19]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[19]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[19]);
        clientamount[19]=obj.nextDouble(); 
        
         System.out.println("Enter the data of CLIENT #21");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[20]=obj.nextLine(); clientid[20]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[20]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[20]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[20]);
        clientamount[20]=obj.nextDouble(); 
        
        System.out.println("Enter the data of CLIENT #22");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[21]=obj.nextLine(); clientid[21]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[21]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[21]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[21]);
        clientamount[21]=obj.nextDouble(); 
        
        
         System.out.println("Enter the data of CLIENT #23");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[22]=obj.nextLine(); clientid[22]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[22]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[22]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[22]);
        clientamount[22]=obj.nextDouble(); 
        
         System.out.println("Enter the data of CLIENT #24");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[23]=obj.nextLine(); clientid[23]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[23]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[23]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[23]);
        clientamount[23]=obj.nextDouble(); 
        
        System.out.println("Enter the data of CLIENT #25");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[24]=obj.nextLine(); clientid[24]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[24]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[24]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[24]);
        clientamount[24]=obj.nextDouble(); 
        
        
         System.out.println("Enter the data of CLIENT #26");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[25]=obj.nextLine(); clientid[25]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[25]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[25]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[25]);
        clientamount[25]=obj.nextDouble(); 
        
        System.out.println("Enter the data of CLIENT #27");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[26]=obj.nextLine(); clientid[26]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[26]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[26]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[26]);
        clientamount[26]=obj.nextDouble(); 
        
        System.out.println("Enter the data of CLIENT #28");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[27]=obj.nextLine(); clientid[27]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[27]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[27]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[26]);
        clientamount[27]=obj.nextDouble(); 
        
          System.out.println("Enter the data of CLIENT #29");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[28]=obj.nextLine(); clientid[28]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[28]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[28]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[28]);
        clientamount[28]=obj.nextDouble(); 
        
        System.out.println("Enter the data of CLIENT #30");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[29]=obj.nextLine(); clientid[29]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[29]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[29]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[29]);
        clientamount[29]=obj.nextDouble(); 
        
         
        System.out.println("Enter the data of CLIENT #31");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[30]=obj.nextLine(); clientid[30]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[30]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[29]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[30]);
        clientamount[30]=obj.nextDouble(); 
       
        
         System.out.println("Enter the data of CLIENT #32");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[31]=obj.nextLine(); clientid[31]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[31]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[31]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[31]);
        clientamount[31]=obj.nextDouble(); 
        
         System.out.println("Enter the data of CLIENT #33");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[32]=obj.nextLine(); clientid[32]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[32]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[32]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[32]);
        clientamount[32]=obj.nextDouble(); 
        
        System.out.println("Enter the data of CLIENT #34");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[33]=obj.nextLine(); clientid[33]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[33]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[33]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[33]);
        clientamount[33]=obj.nextDouble(); 
        
         System.out.println("Enter the data of CLIENT #35");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[34]=obj.nextLine(); clientid[34]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[34]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[34]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[34]);
        clientamount[34]=obj.nextDouble(); 
        
         System.out.println("Enter the data of CLIENT #36");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[35]=obj.nextLine(); clientid[35]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[35]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[35]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[35]);
        clientamount[35]=obj.nextDouble(); 
        
        
        System.out.println("Enter the data of CLIENT #37");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[36]=obj.nextLine(); clientid[36]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[36]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[36]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[36]);
        clientamount[36]=obj.nextDouble(); 
        
        
        System.out.println("Enter the data of CLIENT #38");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[37]=obj.nextLine(); clientid[37]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[37]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[37]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[37]);
        clientamount[37]=obj.nextDouble(); 
        
        System.out.println("Enter the data of CLIENT #39");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[38]=obj.nextLine(); clientid[38]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[38]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[38]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[38]);
        clientamount[38]=obj.nextDouble(); 
        
         System.out.println("Enter the data of CLIENT #40");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[39]=obj.nextLine(); clientid[39]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[39]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[39]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[38]);
        clientamount[39]=obj.nextDouble(); 
        
        System.out.println("Enter the data of CLIENT #41");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[40]=obj.nextLine(); clientid[40]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[40]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[40]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[40]);
        clientamount[40]=obj.nextDouble(); 
        
        System.out.println("Enter the data of CLIENT #42");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[41]=obj.nextLine(); clientid[41]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[41]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[41]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[41]);
        clientamount[41]=obj.nextDouble(); 
        
         System.out.println("Enter the data of CLIENT #43");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[42]=obj.nextLine(); clientid[42]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[42]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[42]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[42]);
        clientamount[42]=obj.nextDouble(); 
       
       
        
        break;
             
           case 45:
        
        System.out.println("Enter the data of CLIENT #01");        
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[0]=obj.nextLine(); clientid[0]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[0]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[0]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[0]);
        clientamount[0]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #02");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[1]=obj.nextLine(); clientid[1]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[1]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[1]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[1]);
        clientamount[1]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #03");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[2]=obj.nextLine(); clientid[2]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[2]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[2]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[2]);
        clientamount[2]=obj.nextDouble();
        
        
        System.out.println("Enter the data of CLIENT #04");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[3]=obj.nextLine(); clientid[3]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[3]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[3]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[3]);
        clientamount[3]=obj.nextDouble();
        
            
        System.out.println("Enter the data of CLIENT #05");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[4]=obj.nextLine(); clientid[4]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[4]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[4]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[4]);
        clientamount[4]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #06");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[5]=obj.nextLine(); clientid[5]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[5]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[5]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[5]);
        clientamount[5]=obj.nextDouble();
        
        
        System.out.println("Enter the data of CLIENT #07");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[6]=obj.nextLine(); clientid[6]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[6]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[6]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[6]);
        clientamount[6]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #08");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[7]=obj.nextLine(); clientid[7]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[7]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[7]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[7]);
        clientamount[7]=obj.nextDouble();
        
        
        System.out.println("Enter the data of CLIENT #09");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[8]=obj.nextLine(); clientid[8]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[8]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[8]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[8]);
        clientamount[8]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #10");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[9]=obj.nextLine(); clientid[9]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[9]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[9]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[9]);
        clientamount[9]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #11");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[10]=obj.nextLine(); clientid[9]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[10]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[10]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[10]);
        clientamount[10]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #13");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[12]=obj.nextLine(); clientid[12]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[12]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[12]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[12]);
        clientamount[12]=obj.nextDouble(); 
        
        
          System.out.println("Enter the data of CLIENT #14");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[13]=obj.nextLine(); clientid[13]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[13]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[13]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[13]);
        clientamount[13]=obj.nextDouble(); 
        
        System.out.println("Enter the data of CLIENT #15");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[14]=obj.nextLine(); clientid[14]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[14]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[14]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[14]);
        clientamount[14]=obj.nextDouble(); 
        
         System.out.println("Enter the data of CLIENT #16");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[15]=obj.nextLine(); clientid[15]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[15]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[15]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[14]);
        clientamount[15]=obj.nextDouble(); 
        
        
        
         System.out.println("Enter the data of CLIENT #17");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[16]=obj.nextLine(); clientid[16]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[16]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[16]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[16]);
        clientamount[16]=obj.nextDouble(); 
        
        
        System.out.println("Enter the data of CLIENT #18");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[17]=obj.nextLine(); clientid[17]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[17]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[17]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[17]);
        clientamount[17]=obj.nextDouble(); 
       
        System.out.println("Enter the data of CLIENT #19");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[18]=obj.nextLine(); clientid[18]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[18]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[18]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[18]);
        clientamount[18]=obj.nextDouble(); 
        
        System.out.println("Enter the data of CLIENT #20");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[19]=obj.nextLine(); clientid[19]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[19]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[19]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[19]);
        clientamount[19]=obj.nextDouble(); 
        
         System.out.println("Enter the data of CLIENT #21");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[20]=obj.nextLine(); clientid[20]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[20]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[20]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[20]);
        clientamount[20]=obj.nextDouble(); 
        
        System.out.println("Enter the data of CLIENT #22");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[21]=obj.nextLine(); clientid[21]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[21]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[21]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[21]);
        clientamount[21]=obj.nextDouble(); 
        
        
         System.out.println("Enter the data of CLIENT #23");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[22]=obj.nextLine(); clientid[22]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[22]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[22]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[22]);
        clientamount[22]=obj.nextDouble(); 
        
         System.out.println("Enter the data of CLIENT #24");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[23]=obj.nextLine(); clientid[23]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[23]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[23]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[23]);
        clientamount[23]=obj.nextDouble(); 
        
        System.out.println("Enter the data of CLIENT #25");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[24]=obj.nextLine(); clientid[24]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[24]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[24]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[24]);
        clientamount[24]=obj.nextDouble(); 
        
        
         System.out.println("Enter the data of CLIENT #26");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[25]=obj.nextLine(); clientid[25]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[25]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[25]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[25]);
        clientamount[25]=obj.nextDouble(); 
        
        System.out.println("Enter the data of CLIENT #27");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[26]=obj.nextLine(); clientid[26]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[26]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[26]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[26]);
        clientamount[26]=obj.nextDouble(); 
        
        System.out.println("Enter the data of CLIENT #28");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[27]=obj.nextLine(); clientid[27]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[27]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[27]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[26]);
        clientamount[27]=obj.nextDouble(); 
        
          System.out.println("Enter the data of CLIENT #29");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[28]=obj.nextLine(); clientid[28]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[28]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[28]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[28]);
        clientamount[28]=obj.nextDouble(); 
        
        System.out.println("Enter the data of CLIENT #30");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[29]=obj.nextLine(); clientid[29]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[29]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[29]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[29]);
        clientamount[29]=obj.nextDouble(); 
        
         
        System.out.println("Enter the data of CLIENT #31");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[30]=obj.nextLine(); clientid[30]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[30]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[29]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[30]);
        clientamount[30]=obj.nextDouble(); 
       
        
         System.out.println("Enter the data of CLIENT #32");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[31]=obj.nextLine(); clientid[31]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[31]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[31]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[31]);
        clientamount[31]=obj.nextDouble(); 
        
         System.out.println("Enter the data of CLIENT #33");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[32]=obj.nextLine(); clientid[32]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[32]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[32]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[32]);
        clientamount[32]=obj.nextDouble(); 
        
        System.out.println("Enter the data of CLIENT #34");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[33]=obj.nextLine(); clientid[33]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[33]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[33]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[33]);
        clientamount[33]=obj.nextDouble(); 
        
         System.out.println("Enter the data of CLIENT #35");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[34]=obj.nextLine(); clientid[34]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[34]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[34]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[34]);
        clientamount[34]=obj.nextDouble(); 
        
         System.out.println("Enter the data of CLIENT #36");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[35]=obj.nextLine(); clientid[35]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[35]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[35]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[35]);
        clientamount[35]=obj.nextDouble(); 
        
        
        System.out.println("Enter the data of CLIENT #37");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[36]=obj.nextLine(); clientid[36]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[36]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[36]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[36]);
        clientamount[36]=obj.nextDouble(); 
        
        
        System.out.println("Enter the data of CLIENT #38");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[37]=obj.nextLine(); clientid[37]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[37]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[37]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[37]);
        clientamount[37]=obj.nextDouble(); 
        
        System.out.println("Enter the data of CLIENT #39");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[38]=obj.nextLine(); clientid[38]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[38]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[38]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[38]);
        clientamount[38]=obj.nextDouble(); 
        
         System.out.println("Enter the data of CLIENT #40");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[39]=obj.nextLine(); clientid[39]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[39]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[39]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[38]);
        clientamount[39]=obj.nextDouble(); 
        
        System.out.println("Enter the data of CLIENT #41");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[40]=obj.nextLine(); clientid[40]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[40]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[40]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[40]);
        clientamount[40]=obj.nextDouble(); 
        
        System.out.println("Enter the data of CLIENT #42");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[41]=obj.nextLine(); clientid[41]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[41]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[41]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[41]);
        clientamount[41]=obj.nextDouble(); 
        
         System.out.println("Enter the data of CLIENT #43");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[42]=obj.nextLine(); clientid[42]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[42]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[42]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[42]);
        clientamount[42]=obj.nextDouble(); 
        
         System.out.println("Enter the data of CLIENT #44");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[43]=obj.nextLine(); clientid[43]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[43]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[43]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[43]);
        clientamount[43]=obj.nextDouble(); 
       
       System.out.println("Enter the data of CLIENT #45");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[44]=obj.nextLine(); clientid[44]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[44]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[45]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[45]);
        clientamount[45]=obj.nextDouble(); 
        
        break;
             
           
             
           case 46:
        
        System.out.println("Enter the data of CLIENT #01");        
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[0]=obj.nextLine(); clientid[0]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[0]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[0]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[0]);
        clientamount[0]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #02");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[1]=obj.nextLine(); clientid[1]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[1]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[1]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[1]);
        clientamount[1]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #03");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[2]=obj.nextLine(); clientid[2]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[2]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[2]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[2]);
        clientamount[2]=obj.nextDouble();
        
        
        System.out.println("Enter the data of CLIENT #04");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[3]=obj.nextLine(); clientid[3]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[3]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[3]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[3]);
        clientamount[3]=obj.nextDouble();
        
            
        System.out.println("Enter the data of CLIENT #05");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[4]=obj.nextLine(); clientid[4]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[4]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[4]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[4]);
        clientamount[4]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #06");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[5]=obj.nextLine(); clientid[5]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[5]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[5]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[5]);
        clientamount[5]=obj.nextDouble();
        
        
        System.out.println("Enter the data of CLIENT #07");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[6]=obj.nextLine(); clientid[6]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[6]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[6]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[6]);
        clientamount[6]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #08");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[7]=obj.nextLine(); clientid[7]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[7]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[7]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[7]);
        clientamount[7]=obj.nextDouble();
        
        
        System.out.println("Enter the data of CLIENT #09");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[8]=obj.nextLine(); clientid[8]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[8]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[8]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[8]);
        clientamount[8]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #10");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[9]=obj.nextLine(); clientid[9]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[9]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[9]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[9]);
        clientamount[9]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #11");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[10]=obj.nextLine(); clientid[9]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[10]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[10]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[10]);
        clientamount[10]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #13");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[12]=obj.nextLine(); clientid[12]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[12]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[12]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[12]);
        clientamount[12]=obj.nextDouble(); 
        
        
          System.out.println("Enter the data of CLIENT #14");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[13]=obj.nextLine(); clientid[13]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[13]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[13]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[13]);
        clientamount[13]=obj.nextDouble(); 
        
        System.out.println("Enter the data of CLIENT #15");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[14]=obj.nextLine(); clientid[14]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[14]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[14]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[14]);
        clientamount[14]=obj.nextDouble(); 
        
         System.out.println("Enter the data of CLIENT #16");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[15]=obj.nextLine(); clientid[15]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[15]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[15]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[14]);
        clientamount[15]=obj.nextDouble(); 
        
        
        
         System.out.println("Enter the data of CLIENT #17");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[16]=obj.nextLine(); clientid[16]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[16]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[16]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[16]);
        clientamount[16]=obj.nextDouble(); 
        
        
        System.out.println("Enter the data of CLIENT #18");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[17]=obj.nextLine(); clientid[17]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[17]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[17]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[17]);
        clientamount[17]=obj.nextDouble(); 
       
        System.out.println("Enter the data of CLIENT #19");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[18]=obj.nextLine(); clientid[18]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[18]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[18]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[18]);
        clientamount[18]=obj.nextDouble(); 
        
        System.out.println("Enter the data of CLIENT #20");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[19]=obj.nextLine(); clientid[19]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[19]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[19]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[19]);
        clientamount[19]=obj.nextDouble(); 
        
         System.out.println("Enter the data of CLIENT #21");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[20]=obj.nextLine(); clientid[20]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[20]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[20]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[20]);
        clientamount[20]=obj.nextDouble(); 
        
        System.out.println("Enter the data of CLIENT #22");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[21]=obj.nextLine(); clientid[21]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[21]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[21]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[21]);
        clientamount[21]=obj.nextDouble(); 
        
        
         System.out.println("Enter the data of CLIENT #23");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[22]=obj.nextLine(); clientid[22]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[22]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[22]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[22]);
        clientamount[22]=obj.nextDouble(); 
        
         System.out.println("Enter the data of CLIENT #24");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[23]=obj.nextLine(); clientid[23]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[23]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[23]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[23]);
        clientamount[23]=obj.nextDouble(); 
        
        System.out.println("Enter the data of CLIENT #25");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[24]=obj.nextLine(); clientid[24]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[24]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[24]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[24]);
        clientamount[24]=obj.nextDouble(); 
        
        
         System.out.println("Enter the data of CLIENT #26");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[25]=obj.nextLine(); clientid[25]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[25]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[25]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[25]);
        clientamount[25]=obj.nextDouble(); 
        
        System.out.println("Enter the data of CLIENT #27");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[26]=obj.nextLine(); clientid[26]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[26]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[26]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[26]);
        clientamount[26]=obj.nextDouble(); 
        
        System.out.println("Enter the data of CLIENT #28");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[27]=obj.nextLine(); clientid[27]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[27]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[27]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[26]);
        clientamount[27]=obj.nextDouble(); 
        
          System.out.println("Enter the data of CLIENT #29");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[28]=obj.nextLine(); clientid[28]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[28]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[28]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[28]);
        clientamount[28]=obj.nextDouble(); 
        
        System.out.println("Enter the data of CLIENT #30");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[29]=obj.nextLine(); clientid[29]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[29]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[29]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[29]);
        clientamount[29]=obj.nextDouble(); 
        
         
        System.out.println("Enter the data of CLIENT #31");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[30]=obj.nextLine(); clientid[30]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[30]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[29]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[30]);
        clientamount[30]=obj.nextDouble(); 
       
        
         System.out.println("Enter the data of CLIENT #32");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[31]=obj.nextLine(); clientid[31]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[31]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[31]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[31]);
        clientamount[31]=obj.nextDouble(); 
        
         System.out.println("Enter the data of CLIENT #33");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[32]=obj.nextLine(); clientid[32]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[32]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[32]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[32]);
        clientamount[32]=obj.nextDouble(); 
        
        System.out.println("Enter the data of CLIENT #34");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[33]=obj.nextLine(); clientid[33]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[33]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[33]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[33]);
        clientamount[33]=obj.nextDouble(); 
        
         System.out.println("Enter the data of CLIENT #35");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[34]=obj.nextLine(); clientid[34]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[34]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[34]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[34]);
        clientamount[34]=obj.nextDouble(); 
        
         System.out.println("Enter the data of CLIENT #36");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[35]=obj.nextLine(); clientid[35]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[35]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[35]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[35]);
        clientamount[35]=obj.nextDouble(); 
        
        
        System.out.println("Enter the data of CLIENT #37");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[36]=obj.nextLine(); clientid[36]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[36]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[36]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[36]);
        clientamount[36]=obj.nextDouble(); 
        
        
        System.out.println("Enter the data of CLIENT #38");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[37]=obj.nextLine(); clientid[37]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[37]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[37]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[37]);
        clientamount[37]=obj.nextDouble(); 
        
        System.out.println("Enter the data of CLIENT #39");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[38]=obj.nextLine(); clientid[38]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[38]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[38]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[38]);
        clientamount[38]=obj.nextDouble(); 
        
         System.out.println("Enter the data of CLIENT #40");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[39]=obj.nextLine(); clientid[39]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[39]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[39]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[38]);
        clientamount[39]=obj.nextDouble(); 
        
        System.out.println("Enter the data of CLIENT #41");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[40]=obj.nextLine(); clientid[40]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[40]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[40]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[40]);
        clientamount[40]=obj.nextDouble(); 
        
        System.out.println("Enter the data of CLIENT #42");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[41]=obj.nextLine(); clientid[41]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[41]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[41]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[41]);
        clientamount[41]=obj.nextDouble(); 
        
         System.out.println("Enter the data of CLIENT #43");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[42]=obj.nextLine(); clientid[42]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[42]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[42]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[42]);
        clientamount[42]=obj.nextDouble(); 
        
         System.out.println("Enter the data of CLIENT #44");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[43]=obj.nextLine(); clientid[43]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[43]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[43]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[43]);
        clientamount[43]=obj.nextDouble(); 
        
        System.out.println("Enter the data of CLIENT #45");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[44]=obj.nextLine(); clientid[44]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[44]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[44]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[44]);
        clientamount[44]=obj.nextDouble(); 
        
        
        
         System.out.println("Enter the data of CLIENT #46");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[45]=obj.nextLine(); clientid[45]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[45]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[45]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[45]);
        clientamount[45]=obj.nextDouble(); 
       
       
        
        break;
           
             
           case 47: 
        
        System.out.println("Enter the data of CLIENT #01");        
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[0]=obj.nextLine(); clientid[0]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[0]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[0]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[0]);
        clientamount[0]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #02");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[1]=obj.nextLine(); clientid[1]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[1]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[1]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[1]);
        clientamount[1]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #03");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[2]=obj.nextLine(); clientid[2]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[2]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[2]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[2]);
        clientamount[2]=obj.nextDouble();
        
        
        System.out.println("Enter the data of CLIENT #04");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[3]=obj.nextLine(); clientid[3]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[3]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[3]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[3]);
        clientamount[3]=obj.nextDouble();
        
            
        System.out.println("Enter the data of CLIENT #05");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[4]=obj.nextLine(); clientid[4]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[4]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[4]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[4]);
        clientamount[4]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #06");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[5]=obj.nextLine(); clientid[5]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[5]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[5]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[5]);
        clientamount[5]=obj.nextDouble();
        
        
        System.out.println("Enter the data of CLIENT #07");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[6]=obj.nextLine(); clientid[6]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[6]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[6]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[6]);
        clientamount[6]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #08");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[7]=obj.nextLine(); clientid[7]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[7]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[7]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[7]);
        clientamount[7]=obj.nextDouble();
        
        
        System.out.println("Enter the data of CLIENT #09");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[8]=obj.nextLine(); clientid[8]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[8]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[8]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[8]);
        clientamount[8]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #10");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[9]=obj.nextLine(); clientid[9]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[9]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[9]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[9]);
        clientamount[9]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #11");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[10]=obj.nextLine(); clientid[9]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[10]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[10]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[10]);
        clientamount[10]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #13");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[12]=obj.nextLine(); clientid[12]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[12]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[12]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[12]);
        clientamount[12]=obj.nextDouble(); 
        
        
          System.out.println("Enter the data of CLIENT #14");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[13]=obj.nextLine(); clientid[13]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[13]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[13]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[13]);
        clientamount[13]=obj.nextDouble(); 
        
        System.out.println("Enter the data of CLIENT #15");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[14]=obj.nextLine(); clientid[14]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[14]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[14]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[14]);
        clientamount[14]=obj.nextDouble(); 
        
         System.out.println("Enter the data of CLIENT #16");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[15]=obj.nextLine(); clientid[15]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[15]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[15]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[14]);
        clientamount[15]=obj.nextDouble(); 
        
        
        
         System.out.println("Enter the data of CLIENT #17");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[16]=obj.nextLine(); clientid[16]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[16]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[16]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[16]);
        clientamount[16]=obj.nextDouble(); 
        
        
        System.out.println("Enter the data of CLIENT #18");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[17]=obj.nextLine(); clientid[17]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[17]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[17]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[17]);
        clientamount[17]=obj.nextDouble(); 
       
        System.out.println("Enter the data of CLIENT #19");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[18]=obj.nextLine(); clientid[18]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[18]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[18]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[18]);
        clientamount[18]=obj.nextDouble(); 
        
        System.out.println("Enter the data of CLIENT #20");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[19]=obj.nextLine(); clientid[19]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[19]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[19]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[19]);
        clientamount[19]=obj.nextDouble(); 
        
         System.out.println("Enter the data of CLIENT #21");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[20]=obj.nextLine(); clientid[20]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[20]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[20]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[20]);
        clientamount[20]=obj.nextDouble(); 
        
        System.out.println("Enter the data of CLIENT #22");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[21]=obj.nextLine(); clientid[21]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[21]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[21]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[21]);
        clientamount[21]=obj.nextDouble(); 
        
        
         System.out.println("Enter the data of CLIENT #23");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[22]=obj.nextLine(); clientid[22]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[22]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[22]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[22]);
        clientamount[22]=obj.nextDouble(); 
        
         System.out.println("Enter the data of CLIENT #24");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[23]=obj.nextLine(); clientid[23]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[23]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[23]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[23]);
        clientamount[23]=obj.nextDouble(); 
        
        System.out.println("Enter the data of CLIENT #25");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[24]=obj.nextLine(); clientid[24]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[24]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[24]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[24]);
        clientamount[24]=obj.nextDouble(); 
        
        
         System.out.println("Enter the data of CLIENT #26");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[25]=obj.nextLine(); clientid[25]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[25]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[25]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[25]);
        clientamount[25]=obj.nextDouble(); 
        
        System.out.println("Enter the data of CLIENT #27");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[26]=obj.nextLine(); clientid[26]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[26]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[26]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[26]);
        clientamount[26]=obj.nextDouble(); 
        
        System.out.println("Enter the data of CLIENT #28");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[27]=obj.nextLine(); clientid[27]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[27]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[27]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[26]);
        clientamount[27]=obj.nextDouble(); 
        
          System.out.println("Enter the data of CLIENT #29");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[28]=obj.nextLine(); clientid[28]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[28]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[28]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[28]);
        clientamount[28]=obj.nextDouble(); 
        
        System.out.println("Enter the data of CLIENT #30");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[29]=obj.nextLine(); clientid[29]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[29]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[29]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[29]);
        clientamount[29]=obj.nextDouble(); 
        
         
        System.out.println("Enter the data of CLIENT #31");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[30]=obj.nextLine(); clientid[30]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[30]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[29]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[30]);
        clientamount[30]=obj.nextDouble(); 
       
        
         System.out.println("Enter the data of CLIENT #32");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[31]=obj.nextLine(); clientid[31]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[31]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[31]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[31]);
        clientamount[31]=obj.nextDouble(); 
        
         System.out.println("Enter the data of CLIENT #33");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[32]=obj.nextLine(); clientid[32]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[32]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[32]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[32]);
        clientamount[32]=obj.nextDouble(); 
        
        System.out.println("Enter the data of CLIENT #34");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[33]=obj.nextLine(); clientid[33]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[33]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[33]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[33]);
        clientamount[33]=obj.nextDouble(); 
        
         System.out.println("Enter the data of CLIENT #35");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[34]=obj.nextLine(); clientid[34]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[34]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[34]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[34]);
        clientamount[34]=obj.nextDouble(); 
        
         System.out.println("Enter the data of CLIENT #36");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[35]=obj.nextLine(); clientid[35]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[35]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[35]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[35]);
        clientamount[35]=obj.nextDouble(); 
        
        
        System.out.println("Enter the data of CLIENT #37");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[36]=obj.nextLine(); clientid[36]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[36]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[36]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[36]);
        clientamount[36]=obj.nextDouble(); 
        
        
        System.out.println("Enter the data of CLIENT #38");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[37]=obj.nextLine(); clientid[37]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[37]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[37]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[37]);
        clientamount[37]=obj.nextDouble(); 
        
        System.out.println("Enter the data of CLIENT #39");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[38]=obj.nextLine(); clientid[38]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[38]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[38]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[38]);
        clientamount[38]=obj.nextDouble(); 
        
         System.out.println("Enter the data of CLIENT #40");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[39]=obj.nextLine(); clientid[39]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[39]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[39]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[38]);
        clientamount[39]=obj.nextDouble(); 
        
        System.out.println("Enter the data of CLIENT #41");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[40]=obj.nextLine(); clientid[40]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[40]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[40]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[40]);
        clientamount[40]=obj.nextDouble(); 
        
        System.out.println("Enter the data of CLIENT #42");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[41]=obj.nextLine(); clientid[41]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[41]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[41]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[41]);
        clientamount[41]=obj.nextDouble(); 
        
         System.out.println("Enter the data of CLIENT #43");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[42]=obj.nextLine(); clientid[42]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[42]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[42]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[42]);
        clientamount[42]=obj.nextDouble(); 
        
         System.out.println("Enter the data of CLIENT #44");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[43]=obj.nextLine(); clientid[43]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[43]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[43]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[43]);
        clientamount[43]=obj.nextDouble(); 
        
        System.out.println("Enter the data of CLIENT #45");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[44]=obj.nextLine(); clientid[44]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[44]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[44]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[44]);
        clientamount[44]=obj.nextDouble(); 
        
        
        
         System.out.println("Enter the data of CLIENT #46");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[45]=obj.nextLine(); clientid[45]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[45]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[45]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[45]);
        clientamount[45]=obj.nextDouble(); 
        
        
         System.out.println("Enter the data of CLIENT #47");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[46]=obj.nextLine(); clientid[46]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[46]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[46]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[46]);
        clientamount[46]=obj.nextDouble(); 
       
       
        
        break;
             
           case 48:
        
        System.out.println("Enter the data of CLIENT #01");        
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[0]=obj.nextLine(); clientid[0]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[0]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[0]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[0]);
        clientamount[0]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #02");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[1]=obj.nextLine(); clientid[1]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[1]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[1]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[1]);
        clientamount[1]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #03");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[2]=obj.nextLine(); clientid[2]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[2]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[2]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[2]);
        clientamount[2]=obj.nextDouble();
        
        
        System.out.println("Enter the data of CLIENT #04");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[3]=obj.nextLine(); clientid[3]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[3]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[3]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[3]);
        clientamount[3]=obj.nextDouble();
        
            
        System.out.println("Enter the data of CLIENT #05");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[4]=obj.nextLine(); clientid[4]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[4]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[4]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[4]);
        clientamount[4]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #06");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[5]=obj.nextLine(); clientid[5]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[5]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[5]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[5]);
        clientamount[5]=obj.nextDouble();
        
        
        System.out.println("Enter the data of CLIENT #07");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[6]=obj.nextLine(); clientid[6]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[6]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[6]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[6]);
        clientamount[6]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #08");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[7]=obj.nextLine(); clientid[7]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[7]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[7]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[7]);
        clientamount[7]=obj.nextDouble();
        
        
        System.out.println("Enter the data of CLIENT #09");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[8]=obj.nextLine(); clientid[8]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[8]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[8]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[8]);
        clientamount[8]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #10");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[9]=obj.nextLine(); clientid[9]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[9]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[9]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[9]);
        clientamount[9]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #11");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[10]=obj.nextLine(); clientid[9]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[10]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[10]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[10]);
        clientamount[10]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #13");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[12]=obj.nextLine(); clientid[12]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[12]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[12]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[12]);
        clientamount[12]=obj.nextDouble(); 
        
        
          System.out.println("Enter the data of CLIENT #14");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[13]=obj.nextLine(); clientid[13]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[13]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[13]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[13]);
        clientamount[13]=obj.nextDouble(); 
        
        System.out.println("Enter the data of CLIENT #15");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[14]=obj.nextLine(); clientid[14]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[14]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[14]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[14]);
        clientamount[14]=obj.nextDouble(); 
        
         System.out.println("Enter the data of CLIENT #16");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[15]=obj.nextLine(); clientid[15]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[15]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[15]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[14]);
        clientamount[15]=obj.nextDouble(); 
        
        
        
         System.out.println("Enter the data of CLIENT #17");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[16]=obj.nextLine(); clientid[16]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[16]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[16]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[16]);
        clientamount[16]=obj.nextDouble(); 
        
        
        System.out.println("Enter the data of CLIENT #18");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[17]=obj.nextLine(); clientid[17]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[17]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[17]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[17]);
        clientamount[17]=obj.nextDouble(); 
       
        System.out.println("Enter the data of CLIENT #19");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[18]=obj.nextLine(); clientid[18]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[18]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[18]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[18]);
        clientamount[18]=obj.nextDouble(); 
        
        System.out.println("Enter the data of CLIENT #20");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[19]=obj.nextLine(); clientid[19]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[19]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[19]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[19]);
        clientamount[19]=obj.nextDouble(); 
        
         System.out.println("Enter the data of CLIENT #21");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[20]=obj.nextLine(); clientid[20]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[20]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[20]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[20]);
        clientamount[20]=obj.nextDouble(); 
        
        System.out.println("Enter the data of CLIENT #22");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[21]=obj.nextLine(); clientid[21]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[21]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[21]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[21]);
        clientamount[21]=obj.nextDouble(); 
        
        
         System.out.println("Enter the data of CLIENT #23");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[22]=obj.nextLine(); clientid[22]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[22]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[22]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[22]);
        clientamount[22]=obj.nextDouble(); 
        
         System.out.println("Enter the data of CLIENT #24");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[23]=obj.nextLine(); clientid[23]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[23]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[23]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[23]);
        clientamount[23]=obj.nextDouble(); 
        
        System.out.println("Enter the data of CLIENT #25");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[24]=obj.nextLine(); clientid[24]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[24]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[24]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[24]);
        clientamount[24]=obj.nextDouble(); 
        
        
         System.out.println("Enter the data of CLIENT #26");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[25]=obj.nextLine(); clientid[25]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[25]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[25]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[25]);
        clientamount[25]=obj.nextDouble(); 
        
        System.out.println("Enter the data of CLIENT #27");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[26]=obj.nextLine(); clientid[26]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[26]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[26]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[26]);
        clientamount[26]=obj.nextDouble(); 
        
        System.out.println("Enter the data of CLIENT #28");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[27]=obj.nextLine(); clientid[27]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[27]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[27]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[26]);
        clientamount[27]=obj.nextDouble(); 
        
          System.out.println("Enter the data of CLIENT #29");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[28]=obj.nextLine(); clientid[28]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[28]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[28]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[28]);
        clientamount[28]=obj.nextDouble(); 
        
        System.out.println("Enter the data of CLIENT #30");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[29]=obj.nextLine(); clientid[29]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[29]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[29]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[29]);
        clientamount[29]=obj.nextDouble(); 
        
         
        System.out.println("Enter the data of CLIENT #31");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[30]=obj.nextLine(); clientid[30]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[30]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[29]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[30]);
        clientamount[30]=obj.nextDouble(); 
       
        
         System.out.println("Enter the data of CLIENT #32");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[31]=obj.nextLine(); clientid[31]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[31]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[31]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[31]);
        clientamount[31]=obj.nextDouble(); 
        
         System.out.println("Enter the data of CLIENT #33");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[32]=obj.nextLine(); clientid[32]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[32]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[32]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[32]);
        clientamount[32]=obj.nextDouble(); 
        
        System.out.println("Enter the data of CLIENT #34");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[33]=obj.nextLine(); clientid[33]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[33]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[33]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[33]);
        clientamount[33]=obj.nextDouble(); 
        
         System.out.println("Enter the data of CLIENT #35");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[34]=obj.nextLine(); clientid[34]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[34]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[34]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[34]);
        clientamount[34]=obj.nextDouble(); 
        
         System.out.println("Enter the data of CLIENT #36");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[35]=obj.nextLine(); clientid[35]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[35]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[35]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[35]);
        clientamount[35]=obj.nextDouble(); 
        
        
        System.out.println("Enter the data of CLIENT #37");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[36]=obj.nextLine(); clientid[36]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[36]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[36]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[36]);
        clientamount[36]=obj.nextDouble(); 
        
        
        System.out.println("Enter the data of CLIENT #38");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[37]=obj.nextLine(); clientid[37]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[37]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[37]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[37]);
        clientamount[37]=obj.nextDouble(); 
        
        System.out.println("Enter the data of CLIENT #39");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[38]=obj.nextLine(); clientid[38]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[38]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[38]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[38]);
        clientamount[38]=obj.nextDouble(); 
        
         System.out.println("Enter the data of CLIENT #40");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[39]=obj.nextLine(); clientid[39]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[39]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[39]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[38]);
        clientamount[39]=obj.nextDouble(); 
        
        System.out.println("Enter the data of CLIENT #41");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[40]=obj.nextLine(); clientid[40]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[40]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[40]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[40]);
        clientamount[40]=obj.nextDouble(); 
        
        System.out.println("Enter the data of CLIENT #42");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[41]=obj.nextLine(); clientid[41]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[41]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[41]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[41]);
        clientamount[41]=obj.nextDouble(); 
        
         System.out.println("Enter the data of CLIENT #43");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[42]=obj.nextLine(); clientid[42]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[42]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[42]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[42]);
        clientamount[42]=obj.nextDouble(); 
        
         System.out.println("Enter the data of CLIENT #44");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[43]=obj.nextLine(); clientid[43]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[43]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[43]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[43]);
        clientamount[43]=obj.nextDouble(); 
        
        System.out.println("Enter the data of CLIENT #45");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[44]=obj.nextLine(); clientid[44]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[44]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[44]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[44]);
        clientamount[44]=obj.nextDouble(); 
        
        
        
         System.out.println("Enter the data of CLIENT #46");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[45]=obj.nextLine(); clientid[45]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[45]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[45]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[45]);
        clientamount[45]=obj.nextDouble(); 
        
        
         System.out.println("Enter the data of CLIENT #47");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[46]=obj.nextLine(); clientid[46]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[46]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[46]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[46]);
        clientamount[46]=obj.nextDouble(); 
        
         System.out.println("Enter the data of CLIENT #48");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[47]=obj.nextLine(); clientid[47]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[47]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[47]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[47]);
        clientamount[47]=obj.nextDouble(); 
       
       
        
        break;
             
           case 49:
        
        System.out.println("Enter the data of CLIENT #01");        
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[0]=obj.nextLine(); clientid[0]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[0]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[0]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[0]);
        clientamount[0]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #02");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[1]=obj.nextLine(); clientid[1]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[1]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[1]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[1]);
        clientamount[1]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #03");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[2]=obj.nextLine(); clientid[2]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[2]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[2]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[2]);
        clientamount[2]=obj.nextDouble();
        
        
        System.out.println("Enter the data of CLIENT #04");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[3]=obj.nextLine(); clientid[3]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[3]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[3]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[3]);
        clientamount[3]=obj.nextDouble();
        
            
        System.out.println("Enter the data of CLIENT #05");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[4]=obj.nextLine(); clientid[4]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[4]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[4]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[4]);
        clientamount[4]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #06");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[5]=obj.nextLine(); clientid[5]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[5]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[5]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[5]);
        clientamount[5]=obj.nextDouble();
        
        
        System.out.println("Enter the data of CLIENT #07");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[6]=obj.nextLine(); clientid[6]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[6]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[6]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[6]);
        clientamount[6]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #08");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[7]=obj.nextLine(); clientid[7]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[7]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[7]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[7]);
        clientamount[7]=obj.nextDouble();
        
        
        System.out.println("Enter the data of CLIENT #09");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[8]=obj.nextLine(); clientid[8]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[8]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[8]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[8]);
        clientamount[8]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #10");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[9]=obj.nextLine(); clientid[9]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[9]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[9]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[9]);
        clientamount[9]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #11");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[10]=obj.nextLine(); clientid[9]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[10]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[10]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[10]);
        clientamount[10]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #13");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[12]=obj.nextLine(); clientid[12]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[12]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[12]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[12]);
        clientamount[12]=obj.nextDouble(); 
        
        
          System.out.println("Enter the data of CLIENT #14");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[13]=obj.nextLine(); clientid[13]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[13]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[13]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[13]);
        clientamount[13]=obj.nextDouble(); 
        
        System.out.println("Enter the data of CLIENT #15");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[14]=obj.nextLine(); clientid[14]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[14]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[14]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[14]);
        clientamount[14]=obj.nextDouble(); 
        
         System.out.println("Enter the data of CLIENT #16");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[15]=obj.nextLine(); clientid[15]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[15]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[15]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[14]);
        clientamount[15]=obj.nextDouble(); 
        
        
        
         System.out.println("Enter the data of CLIENT #17");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[16]=obj.nextLine(); clientid[16]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[16]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[16]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[16]);
        clientamount[16]=obj.nextDouble(); 
        
        
        System.out.println("Enter the data of CLIENT #18");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[17]=obj.nextLine(); clientid[17]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[17]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[17]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[17]);
        clientamount[17]=obj.nextDouble(); 
       
        System.out.println("Enter the data of CLIENT #19");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[18]=obj.nextLine(); clientid[18]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[18]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[18]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[18]);
        clientamount[18]=obj.nextDouble(); 
        
        System.out.println("Enter the data of CLIENT #20");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[19]=obj.nextLine(); clientid[19]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[19]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[19]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[19]);
        clientamount[19]=obj.nextDouble(); 
        
         System.out.println("Enter the data of CLIENT #21");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[20]=obj.nextLine(); clientid[20]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[20]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[20]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[20]);
        clientamount[20]=obj.nextDouble(); 
        
        System.out.println("Enter the data of CLIENT #22");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[21]=obj.nextLine(); clientid[21]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[21]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[21]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[21]);
        clientamount[21]=obj.nextDouble(); 
        
        
         System.out.println("Enter the data of CLIENT #23");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[22]=obj.nextLine(); clientid[22]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[22]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[22]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[22]);
        clientamount[22]=obj.nextDouble(); 
        
         System.out.println("Enter the data of CLIENT #24");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[23]=obj.nextLine(); clientid[23]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[23]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[23]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[23]);
        clientamount[23]=obj.nextDouble(); 
        
        System.out.println("Enter the data of CLIENT #25");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[24]=obj.nextLine(); clientid[24]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[24]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[24]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[24]);
        clientamount[24]=obj.nextDouble(); 
        
        
         System.out.println("Enter the data of CLIENT #26");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[25]=obj.nextLine(); clientid[25]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[25]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[25]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[25]);
        clientamount[25]=obj.nextDouble(); 
        
        System.out.println("Enter the data of CLIENT #27");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[26]=obj.nextLine(); clientid[26]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[26]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[26]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[26]);
        clientamount[26]=obj.nextDouble(); 
        
        System.out.println("Enter the data of CLIENT #28");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[27]=obj.nextLine(); clientid[27]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[27]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[27]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[26]);
        clientamount[27]=obj.nextDouble(); 
        
          System.out.println("Enter the data of CLIENT #29");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[28]=obj.nextLine(); clientid[28]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[28]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[28]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[28]);
        clientamount[28]=obj.nextDouble(); 
        
        System.out.println("Enter the data of CLIENT #30");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[29]=obj.nextLine(); clientid[29]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[29]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[29]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[29]);
        clientamount[29]=obj.nextDouble(); 
        
         
        System.out.println("Enter the data of CLIENT #31");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[30]=obj.nextLine(); clientid[30]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[30]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[29]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[30]);
        clientamount[30]=obj.nextDouble(); 
       
        
         System.out.println("Enter the data of CLIENT #32");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[31]=obj.nextLine(); clientid[31]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[31]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[31]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[31]);
        clientamount[31]=obj.nextDouble(); 
        
         System.out.println("Enter the data of CLIENT #33");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[32]=obj.nextLine(); clientid[32]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[32]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[32]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[32]);
        clientamount[32]=obj.nextDouble(); 
        
        System.out.println("Enter the data of CLIENT #34");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[33]=obj.nextLine(); clientid[33]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[33]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[33]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[33]);
        clientamount[33]=obj.nextDouble(); 
        
         System.out.println("Enter the data of CLIENT #35");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[34]=obj.nextLine(); clientid[34]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[34]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[34]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[34]);
        clientamount[34]=obj.nextDouble(); 
        
         System.out.println("Enter the data of CLIENT #36");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[35]=obj.nextLine(); clientid[35]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[35]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[35]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[35]);
        clientamount[35]=obj.nextDouble(); 
        
        
        System.out.println("Enter the data of CLIENT #37");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[36]=obj.nextLine(); clientid[36]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[36]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[36]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[36]);
        clientamount[36]=obj.nextDouble(); 
        
        
        System.out.println("Enter the data of CLIENT #38");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[37]=obj.nextLine(); clientid[37]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[37]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[37]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[37]);
        clientamount[37]=obj.nextDouble(); 
        
        System.out.println("Enter the data of CLIENT #39");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[38]=obj.nextLine(); clientid[38]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[38]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[38]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[38]);
        clientamount[38]=obj.nextDouble(); 
        
         System.out.println("Enter the data of CLIENT #40");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[39]=obj.nextLine(); clientid[39]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[39]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[39]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[38]);
        clientamount[39]=obj.nextDouble(); 
        
        System.out.println("Enter the data of CLIENT #41");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[40]=obj.nextLine(); clientid[40]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[40]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[40]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[40]);
        clientamount[40]=obj.nextDouble(); 
        
        System.out.println("Enter the data of CLIENT #42");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[41]=obj.nextLine(); clientid[41]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[41]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[41]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[41]);
        clientamount[41]=obj.nextDouble(); 
        
         System.out.println("Enter the data of CLIENT #43");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[42]=obj.nextLine(); clientid[42]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[42]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[42]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[42]);
        clientamount[42]=obj.nextDouble(); 
        
         System.out.println("Enter the data of CLIENT #44");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[43]=obj.nextLine(); clientid[43]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[43]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[43]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[43]);
        clientamount[43]=obj.nextDouble(); 
        
        System.out.println("Enter the data of CLIENT #45");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[44]=obj.nextLine(); clientid[44]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[44]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[44]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[44]);
        clientamount[44]=obj.nextDouble(); 
        
        
        
         System.out.println("Enter the data of CLIENT #46");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[45]=obj.nextLine(); clientid[45]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[45]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[45]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[45]);
        clientamount[45]=obj.nextDouble(); 
        
        
         System.out.println("Enter the data of CLIENT #47");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[46]=obj.nextLine(); clientid[46]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[46]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[46]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[46]);
        clientamount[46]=obj.nextDouble(); 
        
         System.out.println("Enter the data of CLIENT #48");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[47]=obj.nextLine(); clientid[47]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[47]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[47]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[47]);
        clientamount[47]=obj.nextDouble(); 
        
        
        
        
         System.out.println("Enter the data of CLIENT #49");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[48]=obj.nextLine(); clientid[48]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[48]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[48]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[48]);
        clientamount[48]=obj.nextDouble(); 
       
       
        
        break;
             
           case 50:
        
        System.out.println("Enter the data of CLIENT #01");        
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[0]=obj.nextLine(); clientid[0]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[0]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[0]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[0]);
        clientamount[0]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #02");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[1]=obj.nextLine(); clientid[1]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[1]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[1]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[1]);
        clientamount[1]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #03");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[2]=obj.nextLine(); clientid[2]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[2]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[2]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[2]);
        clientamount[2]=obj.nextDouble();
        
        
        System.out.println("Enter the data of CLIENT #04");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[3]=obj.nextLine(); clientid[3]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[3]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[3]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[3]);
        clientamount[3]=obj.nextDouble();
        
            
        System.out.println("Enter the data of CLIENT #05");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[4]=obj.nextLine(); clientid[4]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[4]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[4]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[4]);
        clientamount[4]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #06");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[5]=obj.nextLine(); clientid[5]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[5]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[5]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[5]);
        clientamount[5]=obj.nextDouble();
        
        
        System.out.println("Enter the data of CLIENT #07");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[6]=obj.nextLine(); clientid[6]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[6]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[6]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[6]);
        clientamount[6]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #08");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[7]=obj.nextLine(); clientid[7]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[7]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[7]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[7]);
        clientamount[7]=obj.nextDouble();
        
        
        System.out.println("Enter the data of CLIENT #09");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[8]=obj.nextLine(); clientid[8]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[8]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[8]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[8]);
        clientamount[8]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #10");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[9]=obj.nextLine(); clientid[9]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[9]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[9]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[9]);
        clientamount[9]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #11");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[10]=obj.nextLine(); clientid[9]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[10]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[10]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[10]);
        clientamount[10]=obj.nextDouble();
        
        System.out.println("Enter the data of CLIENT #13");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[12]=obj.nextLine(); clientid[12]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[12]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[12]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[12]);
        clientamount[12]=obj.nextDouble(); 
        
        
          System.out.println("Enter the data of CLIENT #14");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[13]=obj.nextLine(); clientid[13]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[13]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[13]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[13]);
        clientamount[13]=obj.nextDouble(); 
        
        System.out.println("Enter the data of CLIENT #15");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[14]=obj.nextLine(); clientid[14]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[14]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[14]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[14]);
        clientamount[14]=obj.nextDouble(); 
        
         System.out.println("Enter the data of CLIENT #16");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[15]=obj.nextLine(); clientid[15]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[15]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[15]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[14]);
        clientamount[15]=obj.nextDouble(); 
        
        
        
         System.out.println("Enter the data of CLIENT #17");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[16]=obj.nextLine(); clientid[16]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[16]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[16]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[16]);
        clientamount[16]=obj.nextDouble(); 
        
        
        System.out.println("Enter the data of CLIENT #18");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[17]=obj.nextLine(); clientid[17]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[17]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[17]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[17]);
        clientamount[17]=obj.nextDouble(); 
       
        System.out.println("Enter the data of CLIENT #19");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[18]=obj.nextLine(); clientid[18]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[18]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[18]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[18]);
        clientamount[18]=obj.nextDouble(); 
        
        System.out.println("Enter the data of CLIENT #20");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[19]=obj.nextLine(); clientid[19]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[19]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[19]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[19]);
        clientamount[19]=obj.nextDouble(); 
        
         System.out.println("Enter the data of CLIENT #21");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[20]=obj.nextLine(); clientid[20]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[20]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[20]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[20]);
        clientamount[20]=obj.nextDouble(); 
        
        System.out.println("Enter the data of CLIENT #22");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[21]=obj.nextLine(); clientid[21]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[21]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[21]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[21]);
        clientamount[21]=obj.nextDouble(); 
        
        
         System.out.println("Enter the data of CLIENT #23");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[22]=obj.nextLine(); clientid[22]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[22]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[22]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[22]);
        clientamount[22]=obj.nextDouble(); 
        
         System.out.println("Enter the data of CLIENT #24");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[23]=obj.nextLine(); clientid[23]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[23]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[23]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[23]);
        clientamount[23]=obj.nextDouble(); 
        
        System.out.println("Enter the data of CLIENT #25");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[24]=obj.nextLine(); clientid[24]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[24]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[24]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[24]);
        clientamount[24]=obj.nextDouble(); 
        
        
         System.out.println("Enter the data of CLIENT #26");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[25]=obj.nextLine(); clientid[25]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[25]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[25]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[25]);
        clientamount[25]=obj.nextDouble(); 
        
        System.out.println("Enter the data of CLIENT #27");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[26]=obj.nextLine(); clientid[26]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[26]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[26]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[26]);
        clientamount[26]=obj.nextDouble(); 
        
        System.out.println("Enter the data of CLIENT #28");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[27]=obj.nextLine(); clientid[27]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[27]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[27]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[26]);
        clientamount[27]=obj.nextDouble(); 
        
          System.out.println("Enter the data of CLIENT #29");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[28]=obj.nextLine(); clientid[28]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[28]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[28]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[28]);
        clientamount[28]=obj.nextDouble(); 
        
        System.out.println("Enter the data of CLIENT #30");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[29]=obj.nextLine(); clientid[29]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[29]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[29]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[29]);
        clientamount[29]=obj.nextDouble(); 
        
         
        System.out.println("Enter the data of CLIENT #31");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[30]=obj.nextLine(); clientid[30]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[30]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[29]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[30]);
        clientamount[30]=obj.nextDouble(); 
       
        
         System.out.println("Enter the data of CLIENT #32");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[31]=obj.nextLine(); clientid[31]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[31]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[31]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[31]);
        clientamount[31]=obj.nextDouble(); 
        
         System.out.println("Enter the data of CLIENT #33");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[32]=obj.nextLine(); clientid[32]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[32]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[32]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[32]);
        clientamount[32]=obj.nextDouble(); 
        
        System.out.println("Enter the data of CLIENT #34");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[33]=obj.nextLine(); clientid[33]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[33]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[33]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[33]);
        clientamount[33]=obj.nextDouble(); 
        
         System.out.println("Enter the data of CLIENT #35");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[34]=obj.nextLine(); clientid[34]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[34]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[34]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[34]);
        clientamount[34]=obj.nextDouble(); 
        
         System.out.println("Enter the data of CLIENT #36");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[35]=obj.nextLine(); clientid[35]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[35]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[35]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[35]);
        clientamount[35]=obj.nextDouble(); 
        
        
        System.out.println("Enter the data of CLIENT #37");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[36]=obj.nextLine(); clientid[36]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[36]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[36]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[36]);
        clientamount[36]=obj.nextDouble(); 
        
        
        System.out.println("Enter the data of CLIENT #38");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[37]=obj.nextLine(); clientid[37]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[37]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[37]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[37]);
        clientamount[37]=obj.nextDouble(); 
        
        System.out.println("Enter the data of CLIENT #39");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[38]=obj.nextLine(); clientid[38]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[38]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[38]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[38]);
        clientamount[38]=obj.nextDouble(); 
        
         System.out.println("Enter the data of CLIENT #40");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[39]=obj.nextLine(); clientid[39]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[39]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[39]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[38]);
        clientamount[39]=obj.nextDouble(); 
        
        System.out.println("Enter the data of CLIENT #41");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[40]=obj.nextLine(); clientid[40]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[40]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[40]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[40]);
        clientamount[40]=obj.nextDouble(); 
        
        System.out.println("Enter the data of CLIENT #42");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[41]=obj.nextLine(); clientid[41]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[41]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[41]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[41]);
        clientamount[41]=obj.nextDouble(); 
        
         System.out.println("Enter the data of CLIENT #43");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[42]=obj.nextLine(); clientid[42]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[42]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[42]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[42]);
        clientamount[42]=obj.nextDouble(); 
        
         System.out.println("Enter the data of CLIENT #44");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[43]=obj.nextLine(); clientid[43]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[43]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[43]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[43]);
        clientamount[43]=obj.nextDouble(); 
        
        System.out.println("Enter the data of CLIENT #45");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[44]=obj.nextLine(); clientid[44]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[44]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[44]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[44]);
        clientamount[44]=obj.nextDouble(); 
        
        
        
         System.out.println("Enter the data of CLIENT #46");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[45]=obj.nextLine(); clientid[45]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[45]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[45]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[45]);
        clientamount[45]=obj.nextDouble(); 
        
        
         System.out.println("Enter the data of CLIENT #47");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[46]=obj.nextLine(); clientid[46]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[46]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[46]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[46]);
        clientamount[46]=obj.nextDouble(); 
        
         System.out.println("Enter the data of CLIENT #48");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[47]=obj.nextLine(); clientid[47]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[47]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[47]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[47]);
        clientamount[47]=obj.nextDouble(); 
        
        
        
        
         System.out.println("Enter the data of CLIENT #49");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[48]=obj.nextLine(); clientid[48]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[48]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[48]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[48]);
        clientamount[48]=obj.nextDouble(); 
       
         System.out.println("Enter the data of CLIENT #50");
        System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
        clientid[49]=obj.nextLine(); clientid[49]=obj.nextLine();
        System.out.println("Enter the Client Name");
        clientName[49]=obj.nextLine();
        System.out.println("Enter the Date");
        clientdate[49]=obj.nextLine();
        System.out.println("Enter Amount of"+clientid[49]);
        clientamount[49]=obj.nextDouble(); 
        
             break;
    
           default: 
               System.out.print("*");System.out.println("**********************************************");System.out.print("*"); 
               System.out.print("*");System.out.println("Ops! Sorry there is no space for more Client..");System.out.print("*");
               System.out.print("*");System.out.println("**********************************************");System.out.print("*");
    
       }
    
    }
    
    public void employee(){
        System.out.println("Enter Number of Employee");
        noofemp=obj.nextInt();
        
            System.out.println("Enter their names");
        if(noofemp ==1 ){
        
            System.out.print("NAME of Employee#0"+(1)+" : ");  name1=obj.nextLine();name1=obj.nextLine();
            System.out.println("Enter the total Salary of "+name1); sal=obj.nextInt();
            
            total=sal;
        }
        else if(noofemp==2){
                        
            System.out.print("NAME of Employee#0"+(1)+" : ");  name1=obj.nextLine();name1=obj.nextLine();
            
            System.out.print("NAME of Employee#0"+(2)+" : ");  name2=obj.nextLine();
                
            System.out.println("Enter the total salary of "+name1);
            empArray[0]=obj.nextInt();
            
            System.out.println("Enter the total salary of "+name2);
            empArray[1]=obj.nextInt();
            
            total=empArray[0]+empArray[1];
            
        }
        else if(noofemp==3){
            System.out.println("NAME of Employee#0"+(1)+" : ");  name1=obj.nextLine();name1=obj.nextLine();
            
            System.out.print("NAME of Employee#0"+(2)+" : ");  name2=obj.nextLine();
            System.out.print("NAME of Employee#0"+(3)+" : ");  name3=obj.nextLine();
        
            System.out.println("Enter the total salary of "+name1);
            empArray[0]=obj.nextInt();
            
            System.out.println("Enter the total salary of "+name2);
            empArray[1]=obj.nextInt();
            
            
            System.out.println("Enter the total salary of "+name3);
            empArray[2]=obj.nextInt();
            
            total=empArray[0]+empArray[1]+empArray[2];
            
       
        }
        else if(noofemp==4){
            System.out.println("NAME of Employee#0"+(1)+" : ");  name1=obj.nextLine();name1=obj.nextLine();
            
            System.out.print("NAME of Employee#0"+(2)+" : ");  name2=obj.nextLine();
            System.out.print("NAME of Employee#0"+(3)+" : ");  name3=obj.nextLine();
            System.out.print("NAME of Employee#0"+(4)+" : ");  name4=obj.nextLine();
            
            System.out.println("Enter the total salary of "+name1);
            empArray[0]=obj.nextInt();
            
            System.out.println("Enter the total salary of "+name2);
            empArray[1]=obj.nextInt();
            
            
            System.out.println("Enter the total salary of "+name3);
            empArray[2]=obj.nextInt();
            
            System.out.println("Enter the total salary of "+name4);
            empArray[3]=obj.nextInt();
            
            total=empArray[0]+empArray[1]+empArray[2]+empArray[3];
            
        
        }
        else if(noofemp==5){
            System.out.println("NAME of Employee#0"+(1)+" : ");  name1=obj.nextLine();name1=obj.nextLine();
            
            System.out.print("NAME of Employee#0"+(2)+" : ");  name2=obj.nextLine();
            System.out.print("NAME of Employee#0"+(3)+" : ");  name3=obj.nextLine();
            System.out.print("NAME of Employee#0"+(4)+" : ");  name4=obj.nextLine();
            System.out.print("NAME of Employee#0"+(5)+" : ");  name5=obj.nextLine();
              
            
            System.out.println("Enter the total salary of "+name1);
            empArray[0]=obj.nextInt();
            
            System.out.println("Enter the total salary of "+name2);
            empArray[1]=obj.nextInt();
            
            
            System.out.println("Enter the total salary of "+name3);
            empArray[2]=obj.nextInt();
            
            System.out.println("Enter the total salary of "+name4);
            empArray[3]=obj.nextInt();
            
            System.out.println("Enter the total salary of "+name5);
            empArray[4]=obj.nextInt();
            
            total=empArray[0]+empArray[1]+empArray[2]+empArray[3]+empArray[4];
            
        }
        else if(noofemp==6){
            System.out.println("NAME of Employee#0"+(1)+" : ");  name1=obj.nextLine();name1=obj.nextLine();
            
            System.out.print("NAME of Employee#0"+(2)+" : ");  name2=obj.nextLine();
            System.out.print("NAME of Employee#0"+(3)+" : ");  name3=obj.nextLine();
            System.out.print("NAME of Employee#0"+(4)+" : ");  name4=obj.nextLine();
            System.out.print("NAME of Employee#0"+(5)+" : ");  name5=obj.nextLine();
            System.out.print("NAME of Employee#0"+(6)+" : ");  name6=obj.nextLine();  
            
            System.out.println("Enter the total salary of "+name1);
            empArray[0]=obj.nextInt();
            
            System.out.println("Enter the total salary of "+name2);
            empArray[1]=obj.nextInt();
            
            
            System.out.println("Enter the total salary of "+name3);
            empArray[2]=obj.nextInt();
            
            System.out.println("Enter the total salary of "+name4);
            empArray[3]=obj.nextInt();
            
            System.out.println("Enter the total salary of "+name5);
            empArray[4]=obj.nextInt();
            
            System.out.println("Enter the total salary of "+name6);
            empArray[5]=obj.nextInt();
            
            total=empArray[0]+empArray[1]+empArray[2]+empArray[3]+empArray[4]+empArray[5];
            
        }    
        
        else if(noofemp==7){
            System.out.println("NAME of Employee#0"+(1)+" : ");  name1=obj.nextLine();name1=obj.nextLine();
            
            System.out.print("NAME of Employee#0"+(2)+" : ");  name2=obj.nextLine();
            System.out.print("NAME of Employee#0"+(3)+" : ");  name3=obj.nextLine();
            System.out.print("NAME of Employee#0"+(4)+" : ");  name4=obj.nextLine();
            System.out.print("NAME of Employee#0"+(5)+" : ");  name5=obj.nextLine();
            System.out.print("NAME of Employee#0"+(6)+" : ");  name6=obj.nextLine();  
            System.out.print("NAME of Employee#0"+(7)+" : ");  name7=obj.nextLine();  
            
            System.out.println("Enter the total salary of "+name1);
            empArray[0]=obj.nextInt();
            
            System.out.println("Enter the total salary of "+name2);
            empArray[1]=obj.nextInt();
            
            
            System.out.println("Enter the total salary of "+name3);
            empArray[2]=obj.nextInt();
            
            System.out.println("Enter the total salary of "+name4);
            empArray[3]=obj.nextInt();
            
            System.out.println("Enter the total salary of "+name5);
            empArray[4]=obj.nextInt();
            
            System.out.println("Enter the total salary of "+name6);
            empArray[5]=obj.nextInt();
            
            System.out.println("Enter the total salary of "+name7);
            empArray[6]=obj.nextInt();
            
            
            
            total=empArray[0]+empArray[1]+empArray[2]+empArray[3]+empArray[4]+empArray[5]+empArray[6];
            
        }    
        
        else if(noofemp==8){
            System.out.println("NAME of Employee#0"+(1)+" : ");  name1=obj.nextLine();name1=obj.nextLine();
            
            System.out.print("NAME of Employee#0"+(2)+" : ");  name2=obj.nextLine();
            System.out.print("NAME of Employee#0"+(3)+" : ");  name3=obj.nextLine();
            System.out.print("NAME of Employee#0"+(4)+" : ");  name4=obj.nextLine();
            System.out.print("NAME of Employee#0"+(5)+" : ");  name5=obj.nextLine();
            System.out.print("NAME of Employee#0"+(6)+" : ");  name6=obj.nextLine();  
            System.out.print("NAME of Employee#0"+(7)+" : ");  name7=obj.nextLine();  
            System.out.print("NAME of Employee#0"+(8)+" : ");  name8=obj.nextLine();  
            
            System.out.println("Enter the total salary of "+name1);
            empArray[0]=obj.nextInt();
            
            System.out.println("Enter the total salary of "+name2);
            empArray[1]=obj.nextInt();
            
            
            System.out.println("Enter the total salary of "+name3);
            empArray[2]=obj.nextInt();
            
            System.out.println("Enter the total salary of "+name4);
            empArray[3]=obj.nextInt();
            
            System.out.println("Enter the total salary of "+name5);
            empArray[4]=obj.nextInt();
            
            System.out.println("Enter the total salary of "+name6);
            empArray[5]=obj.nextInt();
            
            System.out.println("Enter the total salary of "+name7);
            empArray[6]=obj.nextInt();
            
            System.out.println("Enter the total salary of "+name8);
            empArray[7]=obj.nextInt();
            
            
            
            total=empArray[0]+empArray[1]+empArray[2]+empArray[3]+empArray[4]+empArray[5]+empArray[6]+empArray[7];
            
        }    
        
        else if(noofemp==9){
            System.out.println("NAME of Employee#0"+(1)+" : ");  name1=obj.nextLine();name1=obj.nextLine();
            
            System.out.print("NAME of Employee#0"+(2)+" : ");  name2=obj.nextLine();
            System.out.print("NAME of Employee#0"+(3)+" : ");  name3=obj.nextLine();
            System.out.print("NAME of Employee#0"+(4)+" : ");  name4=obj.nextLine();
            System.out.print("NAME of Employee#0"+(5)+" : ");  name5=obj.nextLine();
            System.out.print("NAME of Employee#0"+(6)+" : ");  name6=obj.nextLine();  
            System.out.print("NAME of Employee#0"+(7)+" : ");  name7=obj.nextLine();  
            System.out.print("NAME of Employee#0"+(8)+" : ");  name8=obj.nextLine();  
            System.out.print("NAME of Employee#0"+(9)+" : ");  name8=obj.nextLine();  
            
            System.out.println("Enter the total salary of "+name1);
            empArray[0]=obj.nextInt();
            
            System.out.println("Enter the total salary of "+name2);
            empArray[1]=obj.nextInt();
            
            
            System.out.println("Enter the total salary of "+name3);
            empArray[2]=obj.nextInt();
            
            System.out.println("Enter the total salary of "+name4);
            empArray[3]=obj.nextInt();
            
            System.out.println("Enter the total salary of "+name5);
            empArray[4]=obj.nextInt();
            
            System.out.println("Enter the total salary of "+name6);
            empArray[5]=obj.nextInt();
            
            System.out.println("Enter the total salary of "+name7);
            empArray[6]=obj.nextInt();
            
            System.out.println("Enter the total salary of "+name8);
            empArray[7]=obj.nextInt();
            
            System.out.println("Enter the total salary of "+name9);
            empArray[8]=obj.nextInt();
            
            
            
            total=empArray[0]+empArray[1]+empArray[2]+empArray[3]+empArray[4]+empArray[5]+empArray[6]+empArray[7]+empArray[8];
            
        }    
        
        else if(noofemp==10){
            System.out.println("NAME of Employee#0"+(1)+" : ");  name1=obj.nextLine();name1=obj.nextLine();
            
            System.out.print("NAME of Employee#0"+(2)+" : ");  name2=obj.nextLine();
            System.out.print("NAME of Employee#0"+(3)+" : ");  name3=obj.nextLine();
            System.out.print("NAME of Employee#0"+(4)+" : ");  name4=obj.nextLine();
            System.out.print("NAME of Employee#0"+(5)+" : ");  name5=obj.nextLine();
            System.out.print("NAME of Employee#0"+(6)+" : ");  name6=obj.nextLine();  
            System.out.print("NAME of Employee#0"+(7)+" : ");  name7=obj.nextLine();  
            System.out.print("NAME of Employee#0"+(8)+" : ");  name8=obj.nextLine();  
            System.out.print("NAME of Employee#0"+(9)+" : ");  name9=obj.nextLine();  
            System.out.print("NAME of Employee#0"+(10)+" : ");  name10=obj.nextLine();  
            
            System.out.println("Enter the total salary of "+name1);
            empArray[0]=obj.nextInt();
            
            System.out.println("Enter the total salary of "+name2);
            empArray[1]=obj.nextInt();
            
            
            System.out.println("Enter the total salary of "+name3);
            empArray[2]=obj.nextInt();
            
            System.out.println("Enter the total salary of "+name4);
            empArray[3]=obj.nextInt();
            
            System.out.println("Enter the total salary of "+name5);
            empArray[4]=obj.nextInt();
            
            System.out.println("Enter the total salary of "+name6);
            empArray[5]=obj.nextInt();
            
            System.out.println("Enter the total salary of "+name7);
            empArray[6]=obj.nextInt();
            
            System.out.println("Enter the total salary of "+name8);
            empArray[7]=obj.nextInt();
            
            System.out.println("Enter the total salary of "+name9);
            empArray[8]=obj.nextInt();
            
            System.out.println("Enter the total salary of "+name10);
            empArray[9]=obj.nextInt();
            
            
            
            total=empArray[0]+empArray[1]+empArray[2]+empArray[3]+empArray[4]+empArray[5]+empArray[6]+empArray[7]+empArray[8]+empArray[9];
            
        }    
        
        else if(noofemp==11){
            System.out.println("NAME of Employee#0"+(1)+" : ");  name1=obj.nextLine();name1=obj.nextLine();
            System.out.print("NAME of Employee#0"+(2)+" : ");  name2=obj.nextLine();
            System.out.print("NAME of Employee#0"+(3)+" : ");  name3=obj.nextLine();
            System.out.print("NAME of Employee#0"+(4)+" : ");  name4=obj.nextLine();
            System.out.print("NAME of Employee#0"+(5)+" : ");  name5=obj.nextLine();
            System.out.print("NAME of Employee#0"+(6)+" : ");  name6=obj.nextLine();  
            System.out.print("NAME of Employee#0"+(7)+" : ");  name7=obj.nextLine();  
            System.out.print("NAME of Employee#0"+(8)+" : ");  name8=obj.nextLine();  
            System.out.print("NAME of Employee#0"+(9)+" : ");  name9=obj.nextLine();  
            System.out.print("NAME of Employee#"+(10)+" : ");  name10=obj.nextLine();  
            System.out.print("NAME of Employee#"+(11)+" : ");  name11=obj.nextLine();  
            
            System.out.println("Enter the total salary of "+name1);
            empArray[0]=obj.nextInt();
            
            System.out.println("Enter the total salary of "+name2);
            empArray[1]=obj.nextInt();
            
            
            System.out.println("Enter the total salary of "+name3);
            empArray[2]=obj.nextInt();
            
            System.out.println("Enter the total salary of "+name4);
            empArray[3]=obj.nextInt();
            
            System.out.println("Enter the total salary of "+name5);
            empArray[4]=obj.nextInt();
            
            System.out.println("Enter the total salary of "+name6);
            empArray[5]=obj.nextInt();
            
            System.out.println("Enter the total salary of "+name7);
            empArray[6]=obj.nextInt();
            
            System.out.println("Enter the total salary of "+name8);
            empArray[7]=obj.nextInt();
            
            System.out.println("Enter the total salary of "+name9);
            empArray[8]=obj.nextInt();
            
            System.out.println("Enter the total salary of "+name10);
            empArray[9]=obj.nextInt();
            
            
            System.out.println("Enter the total salary of "+name11);
            empArray[10]=obj.nextInt();
            
            
            total=empArray[0]+empArray[1]+empArray[2]+empArray[3]+empArray[4]+empArray[5]+empArray[6]+empArray[7]+empArray[8]+empArray[9]+empArray[10];
            
        }    
        
        else if(noofemp==12){
            System.out.print("\nNAME of Employee#0"+(1)+" : ");  name1=obj.nextLine();name1=obj.nextLine();
            System.out.print("\nNAME of Employee#0"+(2)+" : ");  name2=obj.nextLine();
            System.out.print("\nNAME of Employee#0"+(3)+" : ");  name3=obj.nextLine();
            System.out.print("\nNAME of Employee#0"+(4)+" : ");  name4=obj.nextLine();
            System.out.print("\nNAME of Employee#0"+(5)+" : ");  name5=obj.nextLine();
            System.out.print("\nNAME of Employee#0"+(6)+" : ");  name6=obj.nextLine();  
            System.out.print("\nNAME of Employee#0"+(7)+" : ");  name7=obj.nextLine();  
            System.out.print("\nNAME of Employee#0"+(8)+" : ");  name8=obj.nextLine();  
            System.out.print("\nNAME of Employee#0"+(9)+" : ");  name9=obj.nextLine();  
            System.out.print("\nNAME of Employee#"+(10)+" : ");  name10=obj.nextLine();  
            System.out.print("\nNAME of Employee#"+(11)+" : ");  name11=obj.nextLine();  
            System.out.print("\nNAME of Employee#"+(12)+" : ");  name12=obj.nextLine();  
            
            System.out.println("Enter the total salary of "+name1);
            empArray[0]=obj.nextInt();
            
            System.out.println("Enter the total salary of "+name2);
            empArray[1]=obj.nextInt();
            
            
            System.out.println("Enter the total salary of "+name3);
            empArray[2]=obj.nextInt();
            
            System.out.println("Enter the total salary of "+name4);
            empArray[3]=obj.nextInt();
            
            System.out.println("Enter the total salary of "+name5);
            empArray[4]=obj.nextInt();
            
            System.out.println("Enter the total salary of "+name6);
            empArray[5]=obj.nextInt();
            
            System.out.println("Enter the total salary of "+name7);
            empArray[6]=obj.nextInt();
            
            System.out.println("Enter the total salary of "+name8);
            empArray[7]=obj.nextInt();
            
            System.out.println("Enter the total salary of "+name9);
            empArray[8]=obj.nextInt();
            
            System.out.println("Enter the total salary of "+name10);
            empArray[9]=obj.nextInt();
            
            
            System.out.println("Enter the total salary of "+name11);
            empArray[10]=obj.nextInt();
            
            System.out.println("Enter the total salary of "+name12);
            empArray[11]=obj.nextInt();
            
            
            total=empArray[0]+empArray[1]+empArray[2]+empArray[3]+empArray[4]+empArray[5]+empArray[6]+empArray[7]+empArray[8]+empArray[9]+empArray[10]+empArray[11];
            
        }    
    
        else if(noofemp==13){
            System.out.print("\nNAME of Employee#0"+(1)+" : ");  name1=obj.nextLine();name1=obj.nextLine();
            System.out.print("\nNAME of Employee#0"+(2)+" : ");  name2=obj.nextLine();
            System.out.print("\nNAME of Employee#0"+(3)+" : ");  name3=obj.nextLine();
            System.out.print("\nNAME of Employee#0"+(4)+" : ");  name4=obj.nextLine();
            System.out.print("\nNAME of Employee#0"+(5)+" : ");  name5=obj.nextLine();
            System.out.print("\nNAME of Employee#0"+(6)+" : ");  name6=obj.nextLine();  
            System.out.print("\nNAME of Employee#0"+(7)+" : ");  name7=obj.nextLine();  
            System.out.print("\nNAME of Employee#0"+(8)+" : ");  name8=obj.nextLine();  
            System.out.print("\nNAME of Employee#0"+(9)+" : ");  name9=obj.nextLine();  
            System.out.print("\nNAME of Employee#"+(10)+" : ");  name10=obj.nextLine();  
            System.out.print("\nNAME of Employee#"+(11)+" : ");  name11=obj.nextLine();  
            System.out.print("\nNAME of Employee#"+(12)+" : ");  name12=obj.nextLine();  
            System.out.print("\nNAME of Employee#"+(13)+" : ");  name13=obj.nextLine();  
            
            System.out.println("Enter the total salary of "+name1);
            empArray[0]=obj.nextInt();
            
            System.out.println("Enter the total salary of "+name2);
            empArray[1]=obj.nextInt();
            
            
            System.out.println("Enter the total salary of "+name3);
            empArray[2]=obj.nextInt();
            
            System.out.println("Enter the total salary of "+name4);
            empArray[3]=obj.nextInt();
            
            System.out.println("Enter the total salary of "+name5);
            empArray[4]=obj.nextInt();
            
            System.out.println("Enter the total salary of "+name6);
            empArray[5]=obj.nextInt();
            
            System.out.println("Enter the total salary of "+name7);
            empArray[6]=obj.nextInt();
            
            System.out.println("Enter the total salary of "+name8);
            empArray[7]=obj.nextInt();
            
            System.out.println("Enter the total salary of "+name9);
            empArray[8]=obj.nextInt();
            
            System.out.println("Enter the total salary of "+name10);
            empArray[9]=obj.nextInt();
            
            
            System.out.println("Enter the total salary of "+name11);
            empArray[10]=obj.nextInt();
            
            System.out.println("Enter the total salary of "+name12);
            empArray[11]=obj.nextInt();
            System.out.println("Enter the total salary of "+name13);
            empArray[12]=obj.nextInt();
            
            
            total=empArray[0]+empArray[1]+empArray[2]+empArray[3]+empArray[4]+empArray[5]+empArray[6]+empArray[7]+empArray[8]+empArray[9]+empArray[10]+empArray[11]+empArray[12];
            
        }   
        
        else if(noofemp==14){
            System.out.println("\nNAME of Employee#0"+(1)+" : ");  name1=obj.nextLine();name1=obj.nextLine();
            System.out.println("\nNAME of Employee#0"+(2)+" : ");  name2=obj.nextLine();
            System.out.println("\nNAME of Employee#0"+(3)+" : ");  name3=obj.nextLine();
            System.out.println("\nNAME of Employee#0"+(4)+" : ");  name4=obj.nextLine();
            System.out.println("\nNAME of Employee#0"+(5)+" : ");  name5=obj.nextLine();
            System.out.println("\nNAME of Employee#0"+(6)+" : ");  name6=obj.nextLine();  
            System.out.println("\nNAME of Employee#0"+(7)+" : ");  name7=obj.nextLine();  
            System.out.println("\nNAME of Employee#0"+(8)+" : ");  name8=obj.nextLine();  
            System.out.println("\nNAME of Employee#0"+(9)+" : ");  name9=obj.nextLine();  
            System.out.println("\nNAME of Employee#"+(10)+" : ");  name10=obj.nextLine();  
            System.out.println("\nNAME of Employee#"+(11)+" : ");  name11=obj.nextLine();  
            System.out.println("\nNAME of Employee#"+(12)+" : ");  name12=obj.nextLine();  
            System.out.println("\nNAME of Employee#"+(13)+" : ");  name13=obj.nextLine();  
            System.out.println("\nNAME of Employee#"+(14)+" : ");  name14=obj.nextLine();  
            
            System.out.println("Enter the total salary of "+name1);
            empArray[0]=obj.nextInt();
            
            System.out.println("Enter the total salary of "+name2);
            empArray[1]=obj.nextInt();
            
            
            System.out.println("Enter the total salary of "+name3);
            empArray[2]=obj.nextInt();
            
            System.out.println("Enter the total salary of "+name4);
            empArray[3]=obj.nextInt();
            
            System.out.println("Enter the total salary of "+name5);
            empArray[4]=obj.nextInt();
            
            System.out.println("Enter the total salary of "+name6);
            empArray[5]=obj.nextInt();
            
            System.out.println("Enter the total salary of "+name7);
            empArray[6]=obj.nextInt();
            
            System.out.println("Enter the total salary of "+name8);
            empArray[7]=obj.nextInt();
            
            System.out.println("Enter the total salary of "+name9);
            empArray[8]=obj.nextInt();
            
            System.out.println("Enter the total salary of "+name10);
            empArray[   9]=obj.nextInt();
            
            
            System.out.println("Enter the total salary of "+name11);
            empArray[10]=obj.nextInt();
            
            System.out.println("Enter the total salary of "+name12);
            empArray[11]=obj.nextInt();
            System.out.println("Enter the total salary of "+name13);
            empArray[12]=obj.nextInt();
            
            System.out.println("Enter the total salary of "+name14);
            empArray[13]=obj.nextInt();
            
            
            total=empArray[0]+empArray[1]+empArray[2]+empArray[3]+empArray[4]+empArray[5]+empArray[6]+empArray[7]+empArray[8]+empArray[9]+empArray[10]+empArray[11]+empArray[12]+empArray[13];
            
        }
        else if(noofemp==15){
            System.out.println("\nNAME of Employee#0"+(1)+" : ");  name1=obj.nextLine();name1=obj.nextLine();
            System.out.println("\nNAME of Employee#0"+(2)+" : ");  name2=obj.nextLine();
            System.out.println("\nNAME of Employee#0"+(3)+" : ");  name3=obj.nextLine();
            System.out.println("\nNAME of Employee#0"+(4)+" : ");  name4=obj.nextLine();
            System.out.println("\nNAME of Employee#0"+(5)+" : ");  name5=obj.nextLine();
            System.out.println("\nNAME of Employee#0"+(6)+" : ");  name6=obj.nextLine();  
            System.out.println("\nNAME of Employee#0"+(7)+" : ");  name7=obj.nextLine();  
            System.out.println("\nNAME of Employee#0"+(8)+" : ");  name8=obj.nextLine();  
            System.out.println("\nNAME of Employee#0"+(9)+" : ");  name9=obj.nextLine();  
            System.out.println("\nNAME of Employee#"+(10)+" : ");  name10=obj.nextLine();  
            System.out.println("\nNAME of Employee#"+(11)+" : ");  name11=obj.nextLine();  
            System.out.println("\nNAME of Employee#"+(12)+" : ");  name12=obj.nextLine();  
            System.out.println("\nNAME of Employee#"+(13)+" : ");  name13=obj.nextLine();  
            System.out.println("\nNAME of Employee#"+(14)+" : ");  name14=obj.nextLine();  
            System.out.println("\nNAME of Employee#"+(15)+" : ");  name15=obj.nextLine();  
            
            System.out.println("Enter the total salary of "+name1);
            empArray[0]=obj.nextInt();
            
            System.out.println("Enter the total salary of "+name2);
            empArray[1]=obj.nextInt();
            
            
            System.out.println("Enter the total salary of "+name3);
            empArray[2]=obj.nextInt();
            
            System.out.println("Enter the total salary of "+name4);
            empArray[3]=obj.nextInt();
            
            System.out.println("Enter the total salary of "+name5);
            empArray[4]=obj.nextInt();
            
            System.out.println("Enter the total salary of "+name6);
            empArray[5]=obj.nextInt();
            
            System.out.println("Enter the total salary of "+name7);
            empArray[6]=obj.nextInt();
            
            System.out.println("Enter the total salary of "+name8);
            empArray[7]=obj.nextInt();
            
            System.out.println("Enter the total salary of "+name9);
            empArray[8]=obj.nextInt();
            
            System.out.println("Enter the total salary of "+name10);
            empArray[9]=obj.nextInt();
            
            
            System.out.println("Enter the total salary of "+name11);
            empArray[10]=obj.nextInt();
            
            System.out.println("Enter the total salary of "+name12);
            empArray[11]=obj.nextInt();
            System.out.println("Enter the total salary of "+name13);
            empArray[12]=obj.nextInt();
            
            System.out.println("Enter the total salary of "+name14);
            empArray[13]=obj.nextInt();
            
            System.out.println("Enter the total salary of "+name15);
            empArray[14]=obj.nextInt();
            
            
            total=empArray[0]+empArray[1]+empArray[2]+empArray[3]+empArray[4]+empArray[5]+empArray[6]+empArray[7]+empArray[8]+empArray[9]+empArray[10]+empArray[11]+empArray[12]+empArray[13]+empArray[14];
            
        }
    }
    
    public void otherexpense(){
        System.out.println("Enter the name of Month: ");month=obj.nextLine();month=obj.nextLine();
        System.out.print("\nEnter Amount of Rent: "); rent=obj.nextDouble();
        System.out.print("\nEnter Electricity Bill: ");electricitybill=obj.nextDouble();
     
        System.out.print("\nEnter Internet Payment: ");internetpayment=obj.nextDouble();
        System.out.print("\nEnter Stationary Expenses: ");stationarypayment=obj.nextDouble();
        System.out.print("\nEnter Other Expenses: ");otherexpenses=obj.nextDouble();
        

//    if(month== "december" && month=="December" && month=="DECEMBER" && month=="DEC" && month=="dec"){
//            System.out.println("Hello User This is the last Month of this year");
//            System.out.println("If, You want to check the record, Kindly Enter the total amounts from January to December");
//            System.out.println("Press 'Yes' to check the Highest Expenses in the month of this year \n 'NO' for Exit the program");
//            String answer=obj.nextLine();
//            if(answer == "Yes"){
//                
//                System.out.println("Total Amount of January: ");Months[0]=obj.nextDouble();
//                System.out.println("Total Amount of Feburary: ");Months[1]=obj.nextDouble();
//                System.out.println("Total Amount of March: ");Months[2]=obj.nextDouble();
//                System.out.println("Total Amount of April: ");Months[3]=obj.nextDouble();
//                System.out.println("Total Amount of May: ");Months[4]=obj.nextDouble();
//                System.out.println("Total Amount of June: ");Months[5]=obj.nextDouble();
//                System.out.println("Total Amount of July: ");Months[6]=obj.nextDouble();
//                System.out.println("Total Amount of August: ");Months[7]=obj.nextDouble();
//                System.out.println("Total Amount of September: ");Months[8]=obj.nextDouble();
//                System.out.println("Total Amount of October: ");Months[9]=obj.nextDouble();
//                System.out.println("Total Amount of November: ");Months[10]=obj.nextDouble();
//                System.out.println("Total Amount of December: ");Months[11]=obj.nextDouble();
//                Arrays.sort(Months);
//                System.out.println("The highest Expensed Month is: "+Months[Months.length-1]);
//
//            }
//            else{
//            System.out.println("Thanks for using Us -------- EASY WAYS AGENCIES------------");
//            System.out.println("http://easywayagencies.com/");
//        }
    }
    
    String answer; double Months[]=new double[12] ;
    public void showexpenses(){
        System.out.println("-----------------------------------------------------------------------------------------------");
        System.out.println("EASY WAYS AGENCIES");
//        System.out.println(obj.toString());
//        SimpleDateFormat obj1=new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss a zzz ");
//        System.out.println("\t\t\t\t\t\t\t\t\t Date: "+ (obj1.format(obj)));
   
        System.out.println("-----------------------------------------------------------------------------------------------");
        System.out.println("SNO# \t\t\t\t Description \t\t\t\t\t\t  Expenses");
        System.out.println();
       
        System.out.println(" "+ 1 +"\t\t\t\t"+" Employees "+"\t\t\t\t\t\t "+" "+total);
        System.out.println(" "+ 2 +"\t\t\t\t"+" Rent "+"\t\t\t\t\t\t\t "+" "+rent);
        System.out.println(" "+ 3 +"\t\t\t\t"+" Electricity Bill "+"\t\t\t\t\t "+" "+electricitybill);
     
        System.out.println(" "+ 5 +"\t\t\t\t"+" Internet Payment "+"\t\t\t\t\t "+" "+internetpayment);
        System.out.println(" "+ 6 +"\t\t\t\t"+" Stationary Expenses "+"\t\t\t\t\t "+" "+stationarypayment);
        System.out.println(" "+ 7 +"\t\t\t\t"+" Other Expenses "+"\t\t\t\t\t "+" "+otherexpenses);
       double totalamount=(total+rent+electricitybill+internetpayment+stationarypayment+otherexpenses);
        System.out.println("----------------------------------------------------------------------------------------------");
        System.out.println("\t\t\t\t\t\t\t\t\tTotal Expenses:   "+totalamount);
        System.out.println("----------------------------------------------------------------------------------------------");
            
            
        
        }
        
        
    
    
    
    public void ClientRecord(){
          if(noofclient==01){
           System.out.println("-----------------------------------------------------------------------------------------------");
           System.out.println("EASY WAYS AGENCIES");
        
           System.out.println("-----------------------------------------------------------------------------------------------");
           System.out.println("Client ID# \t\t\t\t DATE \t\t\t\t  Client Name \t\t\t\t Amount");
           
           System.out.println();
           System.out.println("-----------------------------------------------------------------------------------------------------------------");
           System.out.println(ClientID+"\t\t\t\t "+Clientdate+"\t\t\t"+clientname+"\t\t\t"+total);
           System.out.println("-----------------------------------------------------------------------------------------------------------------");
           System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t Total Amount:   "+total);
    }
    
        else if(noofclient==02){
               System.out.println("-----------------------------------------------------------------------------------------------");
           System.out.println("EASY WAYS AGENCIES");
        
           System.out.println("-----------------------------------------------------------------------------------------------");
           System.out.println("Client ID# \t\t\t\t DATE \t\t\t\t  Client Name \t\t\t\t Amount");
           
           System.out.println();
           System.out.println("-----------------------------------------------------------------------------------------------------------------");
           System.out.println(clientid[0]+"\t\t\t\t "+clientdate[0]+"\t\t\t"+clientName[0]+"\t\t\t"+clientamount[0]);
           System.out.println("-----------------------------------------------------------------------------------------------------------------");
           System.out.println(clientid[1]+"\t\t\t\t "+clientdate[1]+"\t\t\t"+clientName[1]+"\t\t\t"+clientamount[1]);
           System.out.println("-----------------------------------------------------------------------------------------------------------------");
           
           System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t Total Amount:   "+total);
           System.out.println("-----------------------------------------------------------------------------------------------------------------");
        
    }
          else if(noofclient==3){
               System.out.println("-----------------------------------------------------------------------------------------------");
           System.out.println("EASY WAYS AGENCIES");
        
           System.out.println("-----------------------------------------------------------------------------------------------");
           System.out.println("Client ID# \t\t\t\t DATE \t\t\t\t  Client Name \t\t\t\t Amount");
           
           System.out.println();
           System.out.println("-----------------------------------------------------------------------------------------------------------------");
           System.out.println(clientid[0]+"\t\t\t\t "+clientdate[0]+"\t\t\t"+clientName[0]+"\t\t\t"+clientamount[0]);
           System.out.println("-----------------------------------------------------------------------------------------------------------------");
           System.out.println(clientid[1]+"\t\t\t\t "+clientdate[1]+"\t\t\t"+clientName[1]+"\t\t\t"+clientamount[1]);
           System.out.println("-----------------------------------------------------------------------------------------------------------------");
           System.out.println(clientid[2]+"\t\t\t\t "+clientdate[2]+"\t\t\t"+clientName[2]+"\t\t\t"+clientamount[2]);
           System.out.println("-----------------------------------------------------------------------------------------------------------------");
           
           System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t Total Amount:   "+total);
           System.out.println("-----------------------------------------------------------------------------------------------------------------");
        
          }
          
          else if (noofclient==04){
           
           System.out.println("-----------------------------------------------------------------------------------------------");
           System.out.println("EASY WAYS AGENCIES");
           System.out.println("-----------------------------------------------------------------------------------------------");
           System.out.println("Client ID# \t\t\t\t DATE \t\t\t\t  Client Name \t\t\t\t Amount"); 
           System.out.println();
           System.out.println("-----------------------------------------------------------------------------------------------------------------");
           System.out.println(clientid[0]+"\t\t\t\t "+clientdate[0]+"\t\t\t"+clientName[0]+"\t\t\t"+clientamount[0]);
           System.out.println("-----------------------------------------------------------------------------------------------------------------");
           System.out.println(clientid[1]+"\t\t\t\t "+clientdate[1]+"\t\t\t"+clientName[1]+"\t\t\t"+clientamount[1]);
           System.out.println("-----------------------------------------------------------------------------------------------------------------");
           System.out.println(clientid[2]+"\t\t\t\t "+clientdate[2]+"\t\t\t"+clientName[2]+"\t\t\t"+clientamount[2]);
           System.out.println("-----------------------------------------------------------------------------------------------------------------");
           System.out.println(clientid[3]+"\t\t\t\t "+clientdate[3]+"\t\t\t"+clientName[3]+"\t\t\t"+clientamount[2]);
           System.out.println("-----------------------------------------------------------------------------------------------------------------");
           
           System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t Total Amount:   "+total);
           System.out.println("-----------------------------------------------------------------------------------------------------------------");
               
          }
          else if(noofclient==05){
           System.out.println("-----------------------------------------------------------------------------------------------");
           System.out.println("EASY WAYS AGENCIES");
           System.out.println("-----------------------------------------------------------------------------------------------");
           System.out.println("Client ID# \t\t\t\t DATE \t\t\t\t  Client Name \t\t\t\t Amount"); 
           System.out.println();
           System.out.println("-----------------------------------------------------------------------------------------------------------------");
           System.out.println(clientid[0]+"\t\t\t\t "+clientdate[0]+"\t\t\t"+clientName[0]+"\t\t\t"+clientamount[0]);
           System.out.println("-----------------------------------------------------------------------------------------------------------------");
           System.out.println(clientid[1]+"\t\t\t\t "+clientdate[1]+"\t\t\t"+clientName[1]+"\t\t\t"+clientamount[1]);
           System.out.println("-----------------------------------------------------------------------------------------------------------------");
           System.out.println(clientid[2]+"\t\t\t\t "+clientdate[2]+"\t\t\t"+clientName[2]+"\t\t\t"+clientamount[2]);
           System.out.println("-----------------------------------------------------------------------------------------------------------------");
           System.out.println(clientid[3]+"\t\t\t\t "+clientdate[3]+"\t\t\t"+clientName[3]+"\t\t\t"+clientamount[3]);
           System.out.println("-----------------------------------------------------------------------------------------------------------------");
           System.out.println(clientid[4]+"\t\t\t\t "+clientdate[4]+"\t\t\t"+clientName[4]+"\t\t\t"+clientamount[4]);
           System.out.println("-----------------------------------------------------------------------------------------------------------------");
           
           System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t Total Amount:   "+total);
           System.out.println("-----------------------------------------------------------------------------------------------------------------");
                       
          }
          
          else if(noofclient == 6){
          
           System.out.println("-----------------------------------------------------------------------------------------------");
           System.out.println("EASY WAYS AGENCIES");
           System.out.println("-----------------------------------------------------------------------------------------------");
           System.out.println("Client ID# \t\t\t\t DATE \t\t\t\t  Client Name \t\t\t\t Amount"); 
           System.out.println();
           System.out.println("-----------------------------------------------------------------------------------------------------------------");
           System.out.println(clientid[0]+"\t\t\t\t "+clientdate[0]+"\t\t\t"+clientName[0]+"\t\t\t"+clientamount[0]);
           System.out.println("-----------------------------------------------------------------------------------------------------------------");
           System.out.println(clientid[1]+"\t\t\t\t "+clientdate[1]+"\t\t\t"+clientName[1]+"\t\t\t"+clientamount[1]);
           System.out.println("-----------------------------------------------------------------------------------------------------------------");
           System.out.println(clientid[2]+"\t\t\t\t "+clientdate[2]+"\t\t\t"+clientName[2]+"\t\t\t"+clientamount[2]);
           System.out.println("-----------------------------------------------------------------------------------------------------------------");
           System.out.println(clientid[3]+"\t\t\t\t "+clientdate[3]+"\t\t\t"+clientName[3]+"\t\t\t"+clientamount[3]);
           System.out.println("-----------------------------------------------------------------------------------------------------------------");
           System.out.println(clientid[4]+"\t\t\t\t "+clientdate[4]+"\t\t\t"+clientName[4]+"\t\t\t"+clientamount[4]);
           System.out.println("-----------------------------------------------------------------------------------------------------------------");
           System.out.println(clientid[5]+"\t\t\t\t "+clientdate[5]+"\t\t\t"+clientName[5]+"\t\t\t"+clientamount[5]);
           System.out.println("-----------------------------------------------------------------------------------------------------------------");
           
           System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t Total Amount:   "+total);
           System.out.println("-----------------------------------------------------------------------------------------------------------------");
                       
          }
          
          else if(noofclient == 7){
          
           System.out.println("-----------------------------------------------------------------------------------------------");
           System.out.println("EASY WAYS AGENCIES");
           System.out.println("-----------------------------------------------------------------------------------------------");
           System.out.println("Client ID# \t\t\t\t DATE \t\t\t\t  Client Name \t\t\t\t Amount"); 
           System.out.println();
           System.out.println("-----------------------------------------------------------------------------------------------------------------");
           System.out.println(clientid[0]+"\t\t\t\t "+clientdate[0]+"\t\t\t"+clientName[0]+"\t\t\t"+clientamount[0]);
           System.out.println("-----------------------------------------------------------------------------------------------------------------");
           System.out.println(clientid[1]+"\t\t\t\t "+clientdate[1]+"\t\t\t"+clientName[1]+"\t\t\t"+clientamount[1]);
           System.out.println("-----------------------------------------------------------------------------------------------------------------");
           System.out.println(clientid[2]+"\t\t\t\t "+clientdate[2]+"\t\t\t"+clientName[2]+"\t\t\t"+clientamount[2]);
           System.out.println("-----------------------------------------------------------------------------------------------------------------");
           System.out.println(clientid[3]+"\t\t\t\t "+clientdate[3]+"\t\t\t"+clientName[3]+"\t\t\t"+clientamount[3]);
           System.out.println("-----------------------------------------------------------------------------------------------------------------");
           System.out.println(clientid[4]+"\t\t\t\t "+clientdate[4]+"\t\t\t"+clientName[4]+"\t\t\t"+clientamount[4]);
           System.out.println("-----------------------------------------------------------------------------------------------------------------");
           System.out.println(clientid[5]+"\t\t\t\t "+clientdate[5]+"\t\t\t"+clientName[5]+"\t\t\t"+clientamount[5]);
           System.out.println("-----------------------------------------------------------------------------------------------------------------");
           System.out.println(clientid[6]+"\t\t\t\t "+clientdate[6]+"\t\t\t"+clientName[6]+"\t\t\t"+clientamount[6]);
           System.out.println("-----------------------------------------------------------------------------------------------------------------");
           
           
           System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t Total Amount:   "+total);
           System.out.println("-----------------------------------------------------------------------------------------------------------------");
          
          }
          
          else if(noofclient == 8){
          
           System.out.println("-----------------------------------------------------------------------------------------------");
           System.out.println("EASY WAYS AGENCIES");
           System.out.println("-----------------------------------------------------------------------------------------------");
           System.out.println("Client ID# \t\t\t\t DATE \t\t\t\t  Client Name \t\t\t\t Amount"); 
           System.out.println();
           System.out.println("-----------------------------------------------------------------------------------------------------------------");
           System.out.println(clientid[0]+"\t\t\t\t "+clientdate[0]+"\t\t\t"+clientName[0]+"\t\t\t"+clientamount[0]);
           System.out.println("-----------------------------------------------------------------------------------------------------------------");
           System.out.println(clientid[1]+"\t\t\t\t "+clientdate[1]+"\t\t\t"+clientName[1]+"\t\t\t"+clientamount[1]);
           System.out.println("-----------------------------------------------------------------------------------------------------------------");
           System.out.println(clientid[2]+"\t\t\t\t "+clientdate[2]+"\t\t\t"+clientName[2]+"\t\t\t"+clientamount[2]);
           System.out.println("-----------------------------------------------------------------------------------------------------------------");
           System.out.println(clientid[3]+"\t\t\t\t "+clientdate[3]+"\t\t\t"+clientName[3]+"\t\t\t"+clientamount[3]);
           System.out.println("-----------------------------------------------------------------------------------------------------------------");
           System.out.println(clientid[4]+"\t\t\t\t "+clientdate[4]+"\t\t\t"+clientName[4]+"\t\t\t"+clientamount[4]);
           System.out.println("-----------------------------------------------------------------------------------------------------------------");
           System.out.println(clientid[5]+"\t\t\t\t "+clientdate[5]+"\t\t\t"+clientName[5]+"\t\t\t"+clientamount[5]);
           System.out.println("-----------------------------------------------------------------------------------------------------------------");
           System.out.println(clientid[6]+"\t\t\t\t "+clientdate[6]+"\t\t\t"+clientName[6]+"\t\t\t"+clientamount[6]);
           System.out.println("-----------------------------------------------------------------------------------------------------------------");
           System.out.println(clientid[7]+"\t\t\t\t "+clientdate[6]+"\t\t\t"+clientName[7]+"\t\t\t"+clientamount[7]);
           System.out.println("-----------------------------------------------------------------------------------------------------------------");
           
           
           
           System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t Total Amount:   "+total);
           System.out.println("-----------------------------------------------------------------------------------------------------------------");
          
          }
    
           else if(noofclient == 9){
          
           System.out.println("-----------------------------------------------------------------------------------------------");
           System.out.println("EASY WAYS AGENCIES");
           System.out.println("-----------------------------------------------------------------------------------------------");
           System.out.println("Client ID# \t\t\t\t DATE \t\t\t\t  Client Name \t\t\t\t Amount"); 
           System.out.println();
           System.out.println("-----------------------------------------------------------------------------------------------------------------");
           System.out.println(clientid[0]+"\t\t\t\t "+clientdate[0]+"\t\t\t"+clientName[0]+"\t\t\t"+clientamount[0]);
           System.out.println("-----------------------------------------------------------------------------------------------------------------");
           System.out.println(clientid[1]+"\t\t\t\t "+clientdate[1]+"\t\t\t"+clientName[1]+"\t\t\t"+clientamount[1]);
           System.out.println("-----------------------------------------------------------------------------------------------------------------");
           System.out.println(clientid[2]+"\t\t\t\t "+clientdate[2]+"\t\t\t"+clientName[2]+"\t\t\t"+clientamount[2]);
           System.out.println("-----------------------------------------------------------------------------------------------------------------");
           System.out.println(clientid[3]+"\t\t\t\t "+clientdate[3]+"\t\t\t"+clientName[3]+"\t\t\t"+clientamount[3]);
           System.out.println("-----------------------------------------------------------------------------------------------------------------");
           System.out.println(clientid[4]+"\t\t\t\t "+clientdate[4]+"\t\t\t"+clientName[4]+"\t\t\t"+clientamount[4]);
           System.out.println("-----------------------------------------------------------------------------------------------------------------");
           System.out.println(clientid[5]+"\t\t\t\t "+clientdate[5]+"\t\t\t"+clientName[5]+"\t\t\t"+clientamount[5]);
           System.out.println("-----------------------------------------------------------------------------------------------------------------");
           System.out.println(clientid[6]+"\t\t\t\t "+clientdate[6]+"\t\t\t"+clientName[6]+"\t\t\t"+clientamount[6]);
           System.out.println("-----------------------------------------------------------------------------------------------------------------");
           System.out.println(clientid[7]+"\t\t\t\t "+clientdate[6]+"\t\t\t"+clientName[7]+"\t\t\t"+clientamount[7]);
           System.out.println("-----------------------------------------------------------------------------------------------------------------");
           System.out.println(clientid[8]+"\t\t\t\t "+clientdate[8]+"\t\t\t"+clientName[8]+"\t\t\t"+clientamount[8]);
           System.out.println("-----------------------------------------------------------------------------------------------------------------");
           
           
           
           System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t Total Amount:   "+total);
           System.out.println("-----------------------------------------------------------------------------------------------------------------");
          
          }
           else if(noofclient == 10){
          
           System.out.println("-----------------------------------------------------------------------------------------------");
           System.out.println("EASY WAYS AGENCIES");
           System.out.println("-----------------------------------------------------------------------------------------------");
           System.out.println("Client ID# \t\t\t\t DATE \t\t\t\t  Client Name \t\t\t\t Amount"); 
           System.out.println();
           System.out.println("-----------------------------------------------------------------------------------------------------------------");
           System.out.println(clientid[0]+"\t\t\t\t "+clientdate[0]+"\t\t\t"+clientName[0]+"\t\t\t"+clientamount[0]);
           System.out.println("-----------------------------------------------------------------------------------------------------------------");
           System.out.println(clientid[1]+"\t\t\t\t "+clientdate[1]+"\t\t\t"+clientName[1]+"\t\t\t"+clientamount[1]);
           System.out.println("-----------------------------------------------------------------------------------------------------------------");
           System.out.println(clientid[2]+"\t\t\t\t "+clientdate[2]+"\t\t\t"+clientName[2]+"\t\t\t"+clientamount[2]);
           System.out.println("-----------------------------------------------------------------------------------------------------------------");
           System.out.println(clientid[3]+"\t\t\t\t "+clientdate[3]+"\t\t\t"+clientName[3]+"\t\t\t"+clientamount[3]);
           System.out.println("-----------------------------------------------------------------------------------------------------------------");
           System.out.println(clientid[4]+"\t\t\t\t "+clientdate[4]+"\t\t\t"+clientName[4]+"\t\t\t"+clientamount[4]);
           System.out.println("-----------------------------------------------------------------------------------------------------------------");
           System.out.println(clientid[5]+"\t\t\t\t "+clientdate[5]+"\t\t\t"+clientName[5]+"\t\t\t"+clientamount[5]);
           System.out.println("-----------------------------------------------------------------------------------------------------------------");
           System.out.println(clientid[6]+"\t\t\t\t "+clientdate[6]+"\t\t\t"+clientName[6]+"\t\t\t"+clientamount[6]);
           System.out.println("-----------------------------------------------------------------------------------------------------------------");
           System.out.println(clientid[7]+"\t\t\t\t "+clientdate[7]+"\t\t\t"+clientName[7]+"\t\t\t"+clientamount[7]);
           System.out.println("-----------------------------------------------------------------------------------------------------------------");
           System.out.println(clientid[8]+"\t\t\t\t "+clientdate[8]+"\t\t\t"+clientName[8]+"\t\t\t"+clientamount[8]);
           System.out.println("-----------------------------------------------------------------------------------------------------------------");
           System.out.println(clientid[9]+"\t\t\t\t "+clientdate[9]+"\t\t\t"+clientName[9]+"\t\t\t"+clientamount[9]);
           System.out.println("-----------------------------------------------------------------------------------------------------------------");
           
           
           
           System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t Total Amount:   "+total);
           System.out.println("-----------------------------------------------------------------------------------------------------------------");
          
          }
          
            else if(noofclient == 11){
          
           System.out.println("-----------------------------------------------------------------------------------------------");
           System.out.println("EASY WAYS AGENCIES");
           System.out.println("-----------------------------------------------------------------------------------------------");
           System.out.println("Client ID# \t\t\t\t DATE \t\t\t\t  Client Name \t\t\t\t Amount"); 
           System.out.println();
           System.out.println("-----------------------------------------------------------------------------------------------------------------");
           System.out.println(clientid[0]+"\t\t\t\t "+clientdate[0]+"\t\t\t"+clientName[0]+"\t\t\t"+clientamount[0]);
           System.out.println("-----------------------------------------------------------------------------------------------------------------");
           System.out.println(clientid[1]+"\t\t\t\t "+clientdate[1]+"\t\t\t"+clientName[1]+"\t\t\t"+clientamount[1]);
           System.out.println("-----------------------------------------------------------------------------------------------------------------");
           System.out.println(clientid[2]+"\t\t\t\t "+clientdate[2]+"\t\t\t"+clientName[2]+"\t\t\t"+clientamount[2]);
           System.out.println("-----------------------------------------------------------------------------------------------------------------");
           System.out.println(clientid[3]+"\t\t\t\t "+clientdate[3]+"\t\t\t"+clientName[3]+"\t\t\t"+clientamount[3]);
           System.out.println("-----------------------------------------------------------------------------------------------------------------");
           System.out.println(clientid[4]+"\t\t\t\t "+clientdate[4]+"\t\t\t"+clientName[4]+"\t\t\t"+clientamount[4]);
           System.out.println("-----------------------------------------------------------------------------------------------------------------");
           System.out.println(clientid[5]+"\t\t\t\t "+clientdate[5]+"\t\t\t"+clientName[5]+"\t\t\t"+clientamount[5]);
           System.out.println("-----------------------------------------------------------------------------------------------------------------");
           System.out.println(clientid[6]+"\t\t\t\t "+clientdate[6]+"\t\t\t"+clientName[6]+"\t\t\t"+clientamount[6]);
           System.out.println("-----------------------------------------------------------------------------------------------------------------");
           System.out.println(clientid[7]+"\t\t\t\t "+clientdate[7]+"\t\t\t"+clientName[7]+"\t\t\t"+clientamount[7]);
           System.out.println("-----------------------------------------------------------------------------------------------------------------");
           System.out.println(clientid[8]+"\t\t\t\t "+clientdate[8]+"\t\t\t"+clientName[8]+"\t\t\t"+clientamount[8]);
           System.out.println("-----------------------------------------------------------------------------------------------------------------");
           System.out.println(clientid[9]+"\t\t\t\t "+clientdate[9]+"\t\t\t"+clientName[9]+"\t\t\t"+clientamount[9]);
           System.out.println("-----------------------------------------------------------------------------------------------------------------");
           System.out.println(clientid[10]+"\t\t\t\t "+clientdate[10]+"\t\t\t"+clientName[10]+"\t\t\t"+clientamount[10]);
           System.out.println("-----------------------------------------------------------------------------------------------------------------");
           
           
           
           System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t Total Amount:   "+total);
           System.out.println("-----------------------------------------------------------------------------------------------------------------");
          
          }
          
          
    }
            
    
    
}

