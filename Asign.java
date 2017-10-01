/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asign;

import java.util.*;



public class Asign

{

	String saccount;int spinc,sbal;

	int scheck=0;

	public Asign()

	{

		try

		{ 

			Scanner obj=new Scanner(System.in);

			System.out.print("\nEnter your account number:");

			saccount=obj.nextLine();

			System.out.print("\nEnter your PIN number:");

			spinc=obj.nextInt();

		}

		catch(InputMismatchException e)

		{

			System.out.print("\nEnter the valid input");

		}

		catch(NumberFormatException e)

		{

			System.out.print("\nConversion not valid");

		}

	}

	void deposit(int n)

	{

		this.sbal+=n;

	}

	void withdrawl(int n)

	{

                if(n<=sbal)
		this.sbal-=n;
                else
                    System.out.println("Sorry, Not Enough Money");

	}

	void display()

	{

		System.out.println("\nTotal Balance : "+this.sbal);

	}

	public static void main(String args[])throws ClassNotFoundException

	{

		

		Map<String,Integer> mm=new HashMap<String,Integer>(); 

		mm.put("abc", 123);

		mm.put("efg", 567);

		mm.put("ijk",914);

		mm.put("mno",112);

		

		Scanner sc=new Scanner(System.in);

		Asign obj=new Asign();

		

		try{

			int am,amt;

			for(Map.Entry<String,Integer> entry : mm.entrySet())

			{

				if( obj.saccount.equals(entry.getKey()) && obj.spinc==entry.getValue())

				{

					obj.scheck++;

					while(true)

					{

						System.out.println("\nEnter Your Choice: 1.Deposit 2.Withdrawl 3.Show Balance 4.Exit");

						int n=sc.nextInt();

						switch(n)

						{

						case 1:

							System.out.print("\nAmount:");

							am=sc.nextInt();

							obj.deposit(am);

							break;

						case 2:

							System.out.print("\nAmount:");

							amt=sc.nextInt();

							obj.withdrawl(amt);

							break;

						case 3:

							obj.display();

							break;

						case 4:

							System.exit(1);

							break;

						}

					}

					

				}

			}

		}

		catch(NullPointerException e)

		{

			System.out.print("\nError"+e);

		}

		catch(InputMismatchException e)

		{

			System.out.print("\nError" +e);

		}

		catch(NoSuchElementException e)

		{

			System.out.print("\nElement not found"+e);

		}



		if(obj.scheck==0)

		{
                    System.out.println("\nInvalid details");

		}

	}

}