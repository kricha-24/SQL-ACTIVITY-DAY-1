package com.ltts.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

import com.ltts.model.Player;
import com.ltts.Dao.PlayerDao;

public class PlayerMain {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Player One Details ");
		String player1 = br.readLine();
		System.out.println("Enter Player Two Details");
		String player2 = br.readLine();
		String [] pl1 = player1.split("\\,");
		String [] pl2 = player2.split("\\,");
		String ps1 = pl1[0];
		String ps2 = pl1[1];
		String ps3 = pl1[2];
		int ps4 = Integer.parseInt(pl1[3]);
		int ps5 = Integer.parseInt(pl1[4]);
		int ps6 = Integer.parseInt(pl1[5]);
		String ps7 = pl1[6];
		double ps8 = Double.parseDouble(pl1[7]);
		
		
//		String ps11 = pl2[0];
		String ps12 = pl2[1];
//		String ps13 = pl2[2];
		int ps14 = Integer.parseInt(pl2[3]);
		int ps15 = Integer.parseInt(pl2[4]);
		int ps16 =  Integer.parseInt(pl2[5]);
		String ps17 = pl2[6];
		double ps18 = Double.parseDouble(pl2[7]);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy", Locale.ENGLISH);
		LocalDate date = LocalDate.parse(ps2, formatter);
		System.out.println(date);
		LocalDate date2 = LocalDate.parse(ps12, formatter);
		Player p1 = new Player(pl1[0], date, pl1[2], ps4, ps5, ps6, pl1[6], ps8);
		System.out.println("Player 1 \n" + p1 + "\n");
		Player p2 = new Player(pl2[0], date2, pl2[2], ps14, ps15, ps16, pl2[6], ps18);
		System.out.println("Player 2 \n" + p2 + "\n");
//		if(ps1.equals(ps11) && ps3.equals(ps13) && ps7.equals(ps17))
//		{
//			System.out.println("Player One is same as player two");
//		}
//		else
//		{
//			System.out.println("Player One and player 2 are different");
//		}
//		  Complex emp1 = new Complex(ps1, ps3, ps7);
//	      Complex emp2 = new Complex(ps11, ps13, ps17);
//	      //Comparing the two objects
//	      boolean bool = emp1.equals(emp2);
//	      System.out.println(bool);
//	      if(bool)
//	      {
//	    	  System.out.println("Player One is same as player two");
//	      }
//	      else
//	      {
//	    	  System.out.println("Player One and player 2 are different");
//	      }
			boolean bool = p1.equals(p2);
			System.out.println(bool);
			 if(bool)
			      {
			    	  System.out.println("Player One is same as player two");
			      }
			      else
			      {
			    	  System.out.println("Player One and player 2 are different");
			      }
	}

	}

