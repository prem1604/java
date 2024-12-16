import java.util.*;
class Bank1
{ int bano; double bankbal;
    String banknm;
    void getdetails(int accno, String accnm, double bal)
    {
        bano=accno;
        banknm=accnm;
        bankbal=bal;
    }
    void display(){
        System.out.println("Name:"+bano+"\t Balance:"+bankbal);
    }
}
    class Deposit extends Bank1{
        void depositamt(int d)
    {
        bankbal=d+bankbal;
    }
    }
class withdraw extends Bank1
{
    void withdrawamt(int wd)
    {
        if(bankbal>=1000)
        {
            bankbal=bankbal-wd;
        }
        else{
            System.out.println("Less balance");
        }
    }
}
class Pract{
    public static void main(String[] args) {
        int acc_no; String acc_nm; double acc_bal;
        Scanner sc= new Scanner(System.in);

        System.out.println("enter Account number");
        acc_no=sc.nextInt();

        System.out.println("enter account name: ");
        acc_nm=sc.next();

        System.out.println("enter balance");
        acc_bal=sc.nextDouble();
        System.out.println("press 1:Deposit 2:Withdraw");
        System.out.println("Enter choice: ");
        int choice= sc.nextInt();

        switch(choice){
            case 1:
            Deposit dd=new Deposit();
            dd.getdetails(acc_no, acc_nm, acc_bal);
                int deposit_amt;
                System.out.println("enter deposite amount");
                deposit_amt= sc.nextInt();
                dd.depositamt(deposit_amt);
            dd.display();
            break;

            case 2:
            withdraw ww=new withdraw();
            ww.getdetails(acc_no, acc_nm, acc_bal);
            System.out.println("enter withdraw amount");
            int wd= sc.nextInt();
            ww.withdrawamt(wd);
            ww.display();
            break;

            default:
            System.out.println("plz enter proper choice");
        }

    }
}