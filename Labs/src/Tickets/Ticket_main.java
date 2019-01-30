package Tickets;


public class Ticket_main {

		public static void main(String[] args) {

		WalkUpTicket james= new WalkUpTicket(1);
		
		AdvanceTicket jan = new AdvanceTicket(1,5);
		AdvanceTicket jin = new AdvanceTicket(1,12);

		StudentAdvanceTicket  stu1 = new StudentAdvanceTicket(2, 12);
		StudentAdvanceTicket  stu2 = new StudentAdvanceTicket(2, 5);

		System.out.print(stu1);
		System.out.print(stu2);
		System.out.print(james);
		System.out.print(jan);
		System.out.print(jin);
		System.out.print("_____________________________________");
		
		Tickets[] a = new Tickets [3];
		for(int b=0; b < 3; b++) {
			
			if(b==0) { 
				a[b]= new WalkUpTicket(1);
				}
			if(b==1) { 
				a[b]= new AdvanceTicket(1,10);
				}
			if(b==2) {
				a[b]= new StudentAdvanceTicket(1,5);
			}
			System.out.print(a[b]);

	}
		
		
		
		}
		
}



