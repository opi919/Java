package Bankapp;

import java.util.Scanner;

public class BankApp {
    public static void main ( String [] args )
    {
        Scanner Input = new Scanner ( System.in ) ;
        int help ;
        double Amount ;
        System.out.println("What type of account you need");
        System.out.println ( "1 : Currant Account \n2 : Savings Account " ) ;
        System.out.print ( "Enter your preferable number") ;
        help = Input.nextInt ( ) ;
        if ( help == 1 )
        {
            CurrantAccount CurAcc = new CurrantAccount ( ) ;
            CurAcc.UserInformation ( ) ;
            System.out.print ( "Enter Starting Balance " ) ;
            CurAcc.GetBalance ( ) ;
            while ( true )
            {
                CurAcc.ShowOption ( ) ;
                System.out.print ( "\nChoose your option " ) ;
                help = Input.nextInt ( ) ;
                if ( help == 1 )
                {
                    CurAcc.ShowInformation ( ) ;
                }
                else if ( help == 2 )
                {
                    System.out.print ( "\nEnter The Amount " ) ;
                    Amount = Input.nextDouble ( ) ;
                    CurAcc.Transaction ( Amount ) ;
                }
                else if ( help == 3 )
                {
                    System.out.print ( "\nEnter The Amount " ) ;
                    Amount = Input.nextDouble ( ) ;
                    CurAcc.WithdrawMoney ( Amount ); ;
                }
                else
                {
                    break ;
                }
            }
        }
        else
        {
            SavingsAccount SavAcc = new SavingsAccount ( ) ;
            SavAcc.UserInformation ( ) ;
            System.out.print ( "Enter Starting Balance " ) ;
            SavAcc.GetBalance ( ) ;
            while ( true )
            {
                SavAcc.ShowOption ( ) ;
                System.out.print ( "\nChoose your option " ) ;
                help = Input.nextInt ( ) ;
                if ( help == 1 )
                {
                    SavAcc.ShowInformation ( ) ;
                }
                else if ( help == 2 )
                {
                    System.out.print ( "\nEnter The Amount " ) ;
                    Amount = Input.nextDouble ( ) ;
                    SavAcc.Transaction ( Amount ) ;
                }
                else if ( help == 3 )
                {
                    System.out.print ( "\nEnter The Amount " ) ;
                    Amount = Input.nextDouble ( ) ;
                    SavAcc.WithdrawMoney ( Amount ); ;
                }
                else
                {
                    break ;
                }
            }
        }
    }
}
