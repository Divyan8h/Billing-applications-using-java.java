package session1;
import java.util.*;

public class billproject {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Hello sir! Welcome to pizza hut");
		System.out.println("Your reply: ");
		String hello = sc.next();
		System.out.println("We have 3 type of pizza's");
		String arr[] = {"smallpizza(1)","large pizza(2)","medium pizza(3)"};
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i] + " ");
		}
		System.out.println("Your reply: ");
		String rep = sc.next();
		System.out.println("and the price is as follows: ");
		int cos[] = {800,1500,2500};
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("So price of " + arr[i] + "is - " + cos[i]);
		}
		
		System.out.println("Which pizza do you want 1st,2nd or 3rd one ?");
		int num = sc.nextInt();
		for(int i=0;i<arr.length;i++)
		{
			if(num == 1)
			{
				System.out.println("OK. Noted. But how many small pizza do you want");
				int count = sc.nextInt();
				System.out.println("Ok. We are bringing " +  count + " small in " + Math.floor(Math.random()*15) + " minutes");
				System.out.println("So How was the food?");
				String reply = sc.next();
				System.out.println("So shall I bring you the bill?");
				String ko;
				System.out.println("-----------------------------------------------------------------------------------------------");
				System.out.println("----------------------------------------PIZZA HUT----------------------------------------------");
				System.out.println("3/23/2022--------------------------------------------------------------------------------------");
				System.out.println("S.NO     ||      ITEM        ||          PRIZE   ||     Quantity");
				System.out.println("----------------------------------------------------------------");
				System.out.println(" 1.      ||  small pizza     ||          800     ||     " + count);
				System.out.println("------------------------------------------------------------------");
				int gst = (5*800*count)/100;
				System.out.println("Total - " + (800*count+gst) + " including 5% gst");
				System.out.println("------------------------------------------------------------------");
				System.out.println("----------------------------------------Thankyou!----------------------------------------------");
				System.out.println("------------------------------------HAVE A GOOD DAY--------------------------------------------");
				break;
			}
			else if(num == 2) {
				System.out.println("OK. Noted. But how many medium pizza do you want");
				int count = sc.nextInt();
				System.out.println("Ok. We are bringing " +  count + " medium in " + Math.floor(Math.random()*15) + " minutes");
				System.out.println("So How was the food?");
				String reply = sc.next();
				System.out.println("So shall I bring you the bill?");
				String ko;
				System.out.println("-----------------------------------------------------------------------------------------------");
				System.out.println("----------------------------------------PIZZA HUT----------------------------------------------");
				System.out.println("3/23/2022--------------------------------------------------------------------------------------");
				System.out.println("S.NO     ||      ITEM        ||          PRIZE   ||     Quantity");
				System.out.println("----------------------------------------------------------------");
				System.out.println(" 1.      ||  medium pizza     ||          1500     ||     " + count);
				System.out.println("------------------------------------------------------------------");
				int gst = (5*1500*count)/100;
				System.out.println("Total - " + (1500*count+gst) + " including 5% gst");
				System.out.println("------------------------------------------------------------------");
				System.out.println("----------------------------------------Thankyou!----------------------------------------------");
				System.out.println("------------------------------------HAVE A GOOD DAY--------------------------------------------");
				break;
			}
			else if(num == 3)
			{
				System.out.println("OK. Noted. But how many large pizza do you want");
				int count = sc.nextInt();
				System.out.println("Ok. We are bringing " +  count + " large in " + Math.floor(Math.random()*15) + " minutes");
				System.out.println("So How was the food?");
				String reply = sc.next();
				System.out.println("So shall I bring you the bill?");
				String ko;
				System.out.println("-----------------------------------------------------------------------------------------------");
				System.out.println("----------------------------------------PIZZA HUT----------------------------------------------");
				System.out.println("3/23/2022--------------------------------------------------------------------------------------");
				System.out.println("S.NO     ||      ITEM        ||          PRIZE   ||     Quantity");
				System.out.println("----------------------------------------------------------------");
				System.out.println(" 1.      ||  small pizza     ||          2500     ||     " + count);
				System.out.println("------------------------------------------------------------------");
				int gst = (5*2500*count)/100;
				System.out.println("Total - " + (2500*count+gst) + " including 5% gst");
				System.out.println("------------------------------------------------------------------");
				System.out.println("----------------------------------------Thankyou!----------------------------------------------");
				System.out.println("------------------------------------HAVE A GOOD DAY--------------------------------------------");
				break;
			}
		}
	}

}
