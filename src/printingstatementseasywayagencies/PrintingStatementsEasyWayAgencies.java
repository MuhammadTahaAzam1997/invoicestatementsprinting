/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package printingstatementseasywayagencies;

import java.util.Scanner;

/**
 *
 * @author Muhammad Taha Azam
 */
public class PrintingStatementsEasyWayAgencies {

    
    public static void main(String[] args) {
        // TODO code application logic here
   Scanner sc=new Scanner(System.in);
       
        int select=0;
        
        while(select!=3 && select <=3){
            System.out.println("Enter 1- Expenses Record 2- Client Record ");
            select=sc.nextInt();
            switch(select){
                
                case 1:
        
    CreatingRecords obj=new CreatingRecords();
   obj.employee();
   obj.otherexpense();
   obj.showexpenses();
     
   obj.EmployeeAttributes(obj.noofemp,obj.sal , obj.n, obj.rent, obj.electricitybill, obj.internetpayment, obj.stationarypayment, obj.otherexpenses,obj.month);
       
   
   break;
        
        
                case 2:

    CreatingRecords obj1=new CreatingRecords();
                    
                    obj1.Client();
                    obj1.ClientRecord();
                    obj1.ClientAttributes(obj1.clientname, obj1.amount, obj1.Clientdate, obj1.ClientID);
                    
                    break;
                    
                default:
                    System.out.println("Kindly Press either 1 or 2");
                    
            }
        }
        }}  

