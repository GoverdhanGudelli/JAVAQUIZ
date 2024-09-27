import java.util.Scanner;
class Quiz{
	public static void main(String[] args) {
		String  next;
                 int option;
              
		int age,points=0, password,cpassword, Pin;
	System.out.println("\n");
		System.out.println("                     THE QUIZ PAGE");
		System.out.println("\n");
	
		Scanner Input=new Scanner (System.in);
System.out.print("          Create a password you wish : ");	

		
		cpassword=Input.nextInt();
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("\n");
		String name;
		System.out.print("           Enter the participant name :");
		name=sc.nextLine();
		
		System.out.println("\n");
		System.out.print("         Dear ");
		System.out.print(name);
		
	
		
		System.out.println(" Welcome to the  Quiz game");
		
		
		System.out.println("\n");
		System.out.print("\t Enter your Age:");
		age=Input.nextInt();
		
		System.out.println("\n");
		if(age>=15){
		    System.out.println("      You are eligible to participate in this Quiz!!");




		
		System.out.println("\n");
	       	System.out.print("       Hello!!    "     );
	       	System.out.print(name);
	     	System.out.println(   "    Test  your Knowledge,by answering   the  following questions,  Good luck bro!!");	
	     	
System.out.println();
	     	System.out.println("    NOTE: 1.Each correct answer offers 10 points");
	     	System.out.println(". 2. Each Wrong answer  reduces 10 points");
	     	
System.out.println();
	     	System.out.println("      Try it! and know how many points you can earn");	
		
			System.out.println("\n");
		System.out.println(" 1Q :  Which city is the Capital of France?");
		
       System.out.println();
		System.out.println(" 1. Phillipines   2.Paris    3.London    4.Parcillie  ");
		 System.out.println();
	System.out.print(" Enter your  option   1, 2, 3 & 4   here: "); 
		
             option=sc.nextInt();
		
		
		
		if(option == 2.) {		
		    System.out.println(" Your answer is correct!!(✔️) ");
		    
		
		    points=points+10;
		    System.out.println();
		    System.out.println(" You have earned 10 Points ");
		    }
		 	else{
			System.out.println(" U have entered wrong option (❌)");
	 		
			System.out.println(" Noo points earned👎!!");
		         }
		
	

System.out.println();
System.out.println();

System.out.println(" 2Q:  In which year the first  I phone was launched??");
System.out.println();
System.out.println();
System.out.println(". 1.2010    2.2001   3.2003     4.2007");

       System.out.println();
       System.out.print("Enter your option  1,2,3&4. :  ");
option=sc.nextInt();
if(option==4)
{
    System.out.println(" Your option is correct (✔️) ");
    
    points=points+10;
    System.out.println(" You have earned  points : "+points);
}
else
{
    System.out.println(" You entered wrong option broo(❌)");
    points =points-10;
    System.out.println(" Noo points earned👎" +points);
}
    
		}

System.out.println();

System.out.println();

System.out.println("  3Q: Which is the Fastest bird🕊️  in the World?"); 

       System.out.println();
System.out.println(". 1.Vulture    2.Kingfisher   3.Falcon  4. Australian Eagle");

       System.out.println();
System.out.print(" Enter options 1, 2 3, 4 : ");


option =sc.nextInt();

if(option ==3){
    System.out.println(" Your option is correct!! ");
 points =points+10;
 System.out.println(" You have earned  points: "+points);
}
else {
    System.out.println(" Your option is wrong ");
    points=points-10;
System.out.println(" Noo points earned👎"); 
}

System.out.println();

System.out.println();


System.out.println(". 4Q. Which is the Capital city of Australia? ");

System.out.println();
System.out.println(". 1.Sydney   2.Canberra   3.Melbourne    4.Adelaide City ");

System.out.println();
System.out.print(" Enter your option. 1,2,3&4: ");


option=sc.nextInt();
if(option==2){
    System.out.println(" Your option is correct (✔️)");
    
System.out.println();
    points=points+10;
    System.out.println(" You have earned  points: "+points);
}
    else{
        
System.out.println(" Your option is wrong");
points=points-10;
System.out.println(" Noo points earned");
    }

System.out.println();

System.out.println();

System.out.println(". 5Q:  Which country is named as highest milk producer in   the  World?");

System.out.println();
System.out.println(". 1.China    2.America    3.Japan    4. India");

       System.out.println();

System.out.print(" Enter your option    1,2,3&4: "); 
option=sc.nextInt(); 


System.out.println();
if(option==4){
    System.out.println(" Your option is correct ( ✔️)");
    points=points+10;
System.out.println(" You have earned  points: "+points);

}
else {
    

System.out.println(" Your option is wrong");
points=points-10;
System.out.println(" Noo points earned❌");
}
System.out.println();
System.out.println();

System.out.println("  6Q. Most important thing for  a Living thing's  Life is    ______________ ?");

       System.out.println();

System.out.println(" 1.Food     2.Water   3.Air       4.Sunlight");


       System.out.println();
    
System.out.print(" Enter your option: 1,2,3&4 : ");
 
 option=sc.nextInt();
 
 
System.out.println();
if( option ==3)
{
    
System.out.println(" Your option is correct (✔️)");
 
 points= points+10;
 System.out.println(" You have earned some points");
 
}
 else {
     System.out.println(" You entered wrong option ");
     points= points-10; 
 }
System.out.println();
System.out.println();

System.out.println("  7Q.Which meaning  of the following suits for this Hindi    word  ---> *   कामयाब * ?") ;

       System.out.println();
System.out.println("  1. Disease    2.  Injury   3.Labour    4. Success ");

       System.out.println();
System.out.print(" Enter your option 1,2,3&4: ");


      
option=sc.nextInt();
System.out.println();
if(option==4)
{
    System.out.println(" Your option is right(✔️)");
    points=points+10;
     System.out.println(" You have earned some points");
}
else
{
    System.out.println(". You option is wrong (❌)");
    points=points-10;
    }
    System.out.println();
    System.out.println();
    
   System.out.println("  8Q .  Which. state has the Highest literacy Rate in India ? ");
   
   
       System.out.println();
   System.out.println("  1.Maharashtra    2.Kerala.  3.Andhra Pradesh  4.New Delhi " );
   
       System.out.println();
     
   
   System.out.print(" Enter your option 1,2,3&4: ");
   option =sc.nextInt();
   System.out.println();
   if(option ==2)
   {
       System.out.println("  Your option is correct ✔️");
       
       points=points+10;
       
       System.out.println("  You have earned some points");
       
   }
   
   else{
       System.out.println(" Your option is wrong ❌");
       points= points-10;
       
   }
   
/*   System.out.println("Do you want to Continue this Game!!");*/
   
    
    System.out.println();
      
       System.out.println("  9Q. Which celebrity among the following had won the Oscar Award?");
       
       System.out.println();
 System.out.println(" 1.Sharukh Khan    2.Chiranjeevi   3.Amitabh bachchan              4. A.R Rahman ");
       
       
       System.out.println();
       System.out.print(". Enter your option 1,2,3&4: ");
       
       
       
       option=sc.nextInt();
       
       System.out.println();
       if(option==4)
       {
        System.out.println(". Your option is correct ✔️");
        points=points+10;
       }
        
        else{
            System.out.println(". Your option is wrong ❌");
        }
      /*  System.out.println("Do you want to continue the Game");*/
        
        
        
        
       /* String next;
        next=sc.nextLine();
        
        System.out.println(next);*/
        
       System.out.println("  10 Q: Which of these vegetable is considered under  a  Root vegetable?");
       
       System.out.println();
       System.out.println("  1.Bottle Guard     2.Spinach     3.Onion   4.Brinjal");
       System.out.println();
       System.out.print(" Enter your option 1,2,3&4: ");
       
   
               option=sc.nextInt();
               if(option == 3)
               {
                  System.out.println(" Your option is Correct ✔️");
          points=points+10;
               }
          else{
            
       System.out.println(".  Your option is wrong ❌");
       points=points -10;
          }
          
            
 System.out.println();
//    ans=sc.nextLine();
    
    
  //next=sc.nextLine();
  
  System.out.println(" To know how many points you earned");
  
       System.out.println();
  System.out.print( ". Enter the password you have created Initially :   ");
    
password=sc.nextInt();

       System.out.println();

if(password==cpassword ){
    
    System.out.println(". Aahaa!!  password bane gurthupettukunnav bro !!");


       System.out.println();
System.out.println("  Points Earned = " +points);

}

else{
    System.out.println(" You entered wrong password bro!!");
    
    
       System.out.println();
       
       System.out.println();
       System.out.println(" Try again");
       password =sc.nextInt();
}
//this braces belongs to main function



       System.out.println("Well Played bro!!");
       
       
       System.out.println("If you want the Answer key, Please enter the Password Pin");
       
       Pin=sc.nextInt();
       if(Pin==password)
      {
          
          
       System.out.println(".   You entered the correct Password");
       
       System.out.println();
       
       System.out.println(".  Here is your Answer Key");
       
       System.out.println();
       
       System.out.println("Know the Answer's ' which you don't know!!");
       
       System.out.println();
      System.out.println("  1Q:  Capital City of France.  Ans:  (4) Paris  ");
          
       System.out.println("  2Q.  First I phone launched year.  Ans:(4). 2007");
       
       System.out.println(". 3Q.  Fastest Bird in the World 🌎.  Ans: (3). Falcon");
       
       System.out.println(". 4Q. Capital city of Australia.  Ans:(2). Canberra ");
       
       System.out.println(" 5Q. Highest Milk producing  Country in the World.  Ans: (4) INDIA");
       
       
       System.out.println(".   6Q. Most important thing for living things life.  Ans:(3). Air");
       
       
       System.out.println(". 7Q.   कामयाब.     means . Ans:(4) Success");
       
       System.out.println(". 8Q. State with Highest Literacy rate in India.          Ans:(2).Kerala " );
       
       System.out.println();
  System.out.println(".  9Q. Oscar Award Winner in India. Ans:(4) A.R Rahman");
       
   System.out.println(". 10Q. Root vegetable among the options.          Ans:(3) Onion");
       
       System.out.println();
       
       System.out.println();
       System.out.println(". Participation Certificate kaavalaa  bro , Thayaaru                 cheyadaniki try chesi ,chesaka isthaalee bro!!  Ippatiki Byee");
      }
       else{
           
       System.out.println("You entered Wrong password");
       
       
       System.out.println("Try again");
       
       Pin=sc.nextInt();

       }
}
	}