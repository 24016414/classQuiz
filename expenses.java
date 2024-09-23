package planner;
import java.util.*;
abstract class expenses  {
 Scanner sim = new Scanner(System.in);
  
  public   void income(){
    
   System.out.println("enter your monthly income");
    double GrossIncome = sim.nextDouble();
 
    System.out.println("enter the estimated monthly tax deducted");
    double tax = sim.nextDouble();
    
    double totalIncome = GrossIncome - tax;
    
    System.out.println("Your income is :"+totalIncome);
    
        Double [] home = new Double[5];
        
        double food = 0,water = 0,transport=0,phone=0,other=0;
        
         for(int i =0; i<home.length;i++){

          if(i==0){
          System.out.println("enter the food price");
          home[i] = sim.nextDouble();
           food = home[i];
         }
            
            else if(i==1){
         System.out.println("enter the amount you spend on water and electricity");
         home[i] = sim.nextDouble();
          water =home[i] ;
            }
            
            else if(i==2){
         System.out.println("enter the amount you spend on travelling costs  ");
         home[i] = sim.nextDouble();
          transport =home[i] ;
            }
            
            else if(i==3){
         System.out.println("enter the amount you spend on cellphone and Telephone");
         home[i] = sim.nextDouble();
          phone = home[i] ;
            }
            
            else if(i==4){
         System.out.println("enter the amount you spend on other expenses");
         home[i] = sim.nextDouble();
          other = home[i] ;
            }
            
             else {
         System.out.println("please select the iteam again");
            }
         }
        
            
         double spent = food+water+transport+phone+other;
    double  change = totalIncome - spent;
    System.out.println( "Amount left is :"+change ); 
  
    
    
    System.out.println("would you like to buy a property or rent accomodation select the number of the option you choose below ");
    System.out.println("1.rent accomodation");
    System.out.println("2.buy prperty");
    int choice = sim.nextInt();
    
    if(choice ==1){
               System.out.println("please enter the monthly rental amount you can afford to pay");
               double rent = sim.nextDouble();
               
               double left = change - rent;
               System.out.println("you will have  : "+(left*100.0)/100.0+" remaining in your account monthly");
    }
    else if(choice == 2){
               System.out.println("pleasse enter the purchase price for the property");
               double price = sim.nextDouble();
               
               System.out.println("please enter the total deposit for the property in percentage");
               double deposit = sim.nextDouble(); 
               double amount = price-((deposit/100)*price);
               
    
               System.out.println("please enter the interest rate for the property in percentage");
               double interestpercent = sim.nextDouble();
               double interest = (interestpercent/100);
              
    
               System.out.println("how  many years will you be paying for the house ");
               double period = sim.nextDouble();
    
               double monthly = amount*(1+(interest*period));
               double YIM = period*12;
               double payment = monthly/YIM;
               payment = Math.round(payment*100.0)/100.0;
               System.out.println("your monthly payment is : "+payment);
    
        if(payment> (GrossIncome/3)){
                System.out.println("the approval for home loan is unlikely");
                                               }
         else{
                double snack = change - payment;
                 System.out.println(" home loan is approved. money left monthly will be : "+ snack);
               }
     }
    else{
        System.out.println("please select the option you want again");   
         }  
        
    }
    
    
}