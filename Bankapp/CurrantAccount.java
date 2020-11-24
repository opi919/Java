package Bankapp;

import java.util.Scanner;
import Bankapp.Account;

public class CurrantAccount extends Account {
    Scanner Input = new Scanner ( System.in ) ;
    public CurrantAccount ( )
    {

        CurrantBalance = 0 ;
    }
    public void GetBalance ( )
    {
        while ( true )
        {
            CurrantBalance = Input.nextDouble ( ) ;
            if ( CurrantBalance < 40000 )
            {
                System.out.print ( "Your starting balance must be minimum 40000 BDT " ) ;
                System.out.print("\nPlease re enter your starting balance ");
            }
            else break ;
        }
    }
    public void Transaction ( double Amount )
    {
        if ( Transaction < 6 )
        {
            CurrantBalance = CurrantBalance + Amount ;
        }
        else System.out.println ( "Transaction Limit Exceeded" ) ;
        Transaction ++ ;
    }
    public void WithdrawMoney ( double Amount )
    {
        if ( Amount < CurrantBalance )
        {
            CurrantBalance = CurrantBalance - Amount ;
        }
        else System.out.println ( "You Don't Have Enough Money" ) ;
    }
}
