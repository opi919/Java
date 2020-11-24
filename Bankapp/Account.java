package Bankapp;

import java.util.Scanner;

public abstract class Account {
    public String UserName , UserAddress , PhoneNumber ;
    public double CurrantBalance ;
    public int Transaction = 0 , Choice ;
    Scanner input = new Scanner ( System.in ) ;
    public void UserInformation ( )
    {
        System.out.print ( "Enter Your Name " ) ;
        UserName = input.nextLine ( ) ;
        System.out.print ( "Enter Your Address " ) ;
        UserAddress = input.nextLine ( ) ;
        System.out.print ( "Enter Your Phone Number " ) ;
        PhoneNumber = input.nextLine ( ) ;
    }
    public abstract void GetBalance ( ) ;
    public void ShowOption ( )
    {
        System.out.println ( "\nUser Options " ) ;
        System.out.println ( "1 : Show Information" ) ;
        System.out.println ( "2 : Transaction" ) ;
        System.out.println ( "3 : Withdraw Money" ) ;
        System.out.println ( "4 : Exit" ) ;
    }
    public void ShowInformation ( )
    {
        System.out.println ( "User Name : " + UserName ) ;
        System.out.println ( "User Address : " + UserAddress ) ;
        System.out.println ( "User Phone Number : " + PhoneNumber ) ;
        System.out.println ( "Currant Balance : " + CurrantBalance ) ;
    }
}
