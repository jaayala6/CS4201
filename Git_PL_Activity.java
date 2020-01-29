/************************
CS 2401 Lab
MW 12:00pm-1:20pm
Names: Jonathan Adam Ayala, Kristen Arce, Matt Kalman
dasdsa
************************/
public class Git_PL_Activity{

    /*
    Coding Bat Activity: RedTicket
    You have a red lottery ticket showing ints a, b, and c, each of which is
    0, 1, or 2. If they are all the value 2, the result is 10. Otherwise if 
    they are all the same, the result is 5. Otherwise so long as both b and 
    c are different from a, the result is 1. Otherwise the result is 0.
    */

    public static void main(String[] args){
        int ticket1 = redTicket(2,2,2);
        int ticket2 = redTicket(1,2,1);
        int ticket3 = redTicket(1,1,1);

        System.out.println("Ticket 1 won " + ticket1 + " dollars."); //Answer = 10
        System.out.println("Ticket 2 won " + ticket2 + " dollars."); //Answer = 0
        System.out.println("Ticket 3 won " + ticket3 + " dollars."); //Answer = 5
    }

    public static int redTicket(int a, int b, int c) {
   	    return -1;
    }
}