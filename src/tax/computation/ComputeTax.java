/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tax.computation;
import java.util.Scanner;
/**
 *
 * @author Ilija Milcinoski
 */
public class ComputeTax {
    public static void main(String[] args)
   {
  final double RATE1 =0.15;
  final double RATE2 =0.25;
  final double RATE3 =0.31; //Tax Rates
  
  final double S1 =21450.0;  //tax bracket for single 
  final double S2 =51900.0;
  final double M1 =35800.0; //Tax brackets for married
  final double M2 =86500.0;
  
  char  status;
  double income = 0;
  double tax = 0;
  
  Scanner in= new Scanner(System.in); //Construct Scanner object
  System.out.print("Enter status(S or M)=");
  status= in.next().charAt(0); //Read in next char into status
  System.out.print("Enter income =");
  income=in.nextDouble(); //read in next double into income
  if(status=='S')
  {//*****single
  if (income<=S1)
  tax=RATE1*income;
  else if(income<= S2);
  tax=RATE1*S1+RATE2*(income-S1);
  tax=RATE1*S1+RATE2*(S2-S1)+RATE3*(income-S2);
  
  
  }
  {// ***** married
if(income<=M1)
tax=RATE1*income;
else if(income<=M2);
tax=RATE1*M1+RATE2*(income-M1);
tax=RATE1*M1+RATE2*(M2-M1)+RATE3*(income-M2);
System.out.println("Tax="+tax);



  
  
   }
   }
}

