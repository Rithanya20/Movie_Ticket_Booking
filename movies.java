package ticketbs;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author rithu
 */

import java.util.*;
class movies{
	String mvName;
	String mvTime;
	String mvPrice;
	//int availSeat=100;
        int avalSeats;
	int noftic;
	int[][] seats = new int[10][10];
	Scanner sc = new Scanner(System.in);
	movies(String mvName,String mvPrice,String mvTime, int avalSeats){
		this.mvName=mvName;
		this.mvPrice=mvPrice;
		this.mvTime=mvTime;
                this.avalSeats = avalSeats;
		int s=1;
		for(int i=0;i<10;i++){
			for(int j=0;j<10;j++){
				seats[i][j]=s;
				s++;
			}

	}
        }
        public void showMovie(){
        System.out.println("Movie Name: "+mvName);
        System.out.println("Movie Price: "+mvPrice);
        System.out.println("Movie Time: "+mvTime);
        System.out.println("Available Seats: "+avalSeats);
        System.out.println();
    }
	public int[] book(){
		System.out.println("Enter no of tickets you want to book:");
		noftic=sc.nextInt();
		viewSeat();
		int[] bookseat = new int[noftic];
		for(int i=0;i<noftic;i++){
			System.out.println(" Enter the seat no  for person:"+(i+1));
			int seno=sc.nextInt();
			for(int i1=0;i1<10;i1++){
				for(int j=0;j<10;j++){
					if(seats[i1][j]==seno){
						seats[i1][j]= -1;
						bookseat[i]=seno;
					}	
					}
		        }
				System.out.println(seno+" is booked");
		}
                avalSeats -= noftic;
		return bookseat;
	}
	public void viewSeat(){
		System.out.println("--------------------------------------------------");
		System.out.println("----------------------SCREEN----------------------");
		System.out.println("--------------------------------------------------");
		for(int i=0;i<10;i++){
			for(int j=0;j<10;j++){
				System.out.print(" | "+seats[i][j]);
			}
			System.out.println("\n-------------------------------------------------");
		}
		System.out.println("\n-1 means Seat is booked..\n");
	}
}
