package Bankapp;

import java.util.Scanner;
import Bankapp.Account;

public class SavingsAccount extends Account {
    double TotalWithdraw = 0 ;
    Scanner Input = new Scanner ( System.in ) ;
    public SavingsAccount ( )
    {
        CurrantBalance = 0 ;
    }
    public void GetBalance ( )
    {
        while ( true )
        {
            CurrantBalance = Input.nextDouble ( ) ;
            if ( CurrantBalance < 1000 )
            {
                System.out.println ( "Your starting balance must be minimum 1000 BDT") ;
                System.out.print("Please re enter your starting balance");
            }
            else break ;
        }
    }
    public void Transaction ( double Amount )
    {
        if ( Transaction < 3 )
        {
            CurrantBalance = CurrantBalance + Amount ;
        }
        else System.out.println ( "Transaction Limit Exceeded" ) ;
        Transaction ++ ;
    }
    public void WithdrawMoney ( double  Amount )
    {
        if ( Amount > 50000)
        {
            System.out.println ( "Can't Withdraw More Than 50000 Tk" ) ;
        }
        else if ( TotalWithdraw > 120000 )
        {
            System.out.println ( "Daily Withdraw Limit Exceeded" ) ;
        }
        else if ( CurrantBalance - Amount < 500 )
        {
            System.out.println ( "You Must Have To Keep 500 Tk or More" ) ;
        }
        else CurrantBalance = CurrantBalance - Amount ;
    }
}
