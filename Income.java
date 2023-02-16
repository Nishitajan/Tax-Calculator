import java.util.*;

class calculator {
    Scanner sc = new Scanner(System.in);
    int income = 0;

    void Individual() {
        System.out.println("Press 1 : Salaried Employees ");
        System.out.println("Press 2 : Business professionals");
        System.out.println("Press 3 : Senior/Super senior citizen");
        System.out.println("Press 4 : Non resident");
        System.out.println("Press 5 : HUF/Hindu Undivided Family ");
        int choice = sc.nextInt();
        int tax = 0;
        switch (choice) {
            case 1:
                System.out.println("Press 1 for old resime /n Press 2 for new resime");
                int slab = sc.nextInt();
                switch (slab) {
                    case 1:
                        System.out.println("Enter Income");
                        income = sc.nextInt();
                        System.out.println("enter allowance");
                        int all = sc.nextInt();
                        System.out.println("Enter special allowance");
                        int spall = sc.nextInt();
                        income = income*12 + all*12 + spall* 12;
                        if (income <= 250000) {
                            System.out.println("no tax");
                        } else if (income > 500000 && income <= 1000000) {
                            tax = ((income - 500000) * 20) / 100;
                            System.out.println("Tax is :" + (tax + 12500));
                        } else if (income > 250000 && income <= 500000) {
                            tax = ((income) * 5) / 100;
                            System.out.println("Tax is : " + tax);
                        } else {
                            tax = ((income - 100000) * 30) / 100;
                            System.out.println("Tax is : " + (tax + 112500));
                        }
                        break;
                    case 2:
                        System.out.println("Enter Income");
                        income = sc.nextInt();
                        System.out.println("enter allowance");
                        int all5 = sc.nextInt();
                        System.out.println("Enter special allowance");
                        int spall5 = sc.nextInt();
                        income = income*12 + all5*12 + spall5* 12;
                        if (income <= 250000) {
                            System.out.println("no tax");
                        } else if (income > 250000 && income <= 500000) {
                            tax = (income * 5) / 100;
                            System.out.println("Tax is " + tax);
                        } else if (income > 500000 && income <= 1000000) {
                            tax = ((income - 500000) * 10) / 100;
                            System.out.println("Tax is : " + (tax + 12500));
                        } else {
                            tax = ((income - 1000000) * 15) / 100;
                            System.out.println("Tax is : " + (tax + 37500));

                        }
                        break;
                }
            case 2:
                int slab1 = sc.nextInt();
                switch (slab1) {
                    case 1:
                        System.out.println("Enter Income");
                        income = sc.nextInt();
                        System.out.println("enter allowance");
                        int all = sc.nextInt();
                        System.out.println("Enter special allowance");
                        int spall = sc.nextInt();
                        income = income*12 + all*12 + spall* 12;
                        if (income <= 250000) {
                            System.out.println("no tax");
                        } else if (income > 500000 && income <= 1000000) {
                            tax = ((income - 500000) * 20) / 100;
                            System.out.println("Tax is :" + (tax + 12500));
                        } else if (income > 250000 && income <= 500000) {
                            tax = ((income) * 5) / 100;
                            System.out.println("Tax is : " + tax);
                        } else {
                            tax = ((income - 100000) * 30) / 100;
                            System.out.println("Tax is : " + (tax + 112500));
                        }
                        break;
                    case 2:
                        System.out.println("Enter Income");
                        income = sc.nextInt();
                        System.out.println("enter allowance");
                        int all4 = sc.nextInt();
                        System.out.println("Enter special allowance");
                        int spall4 = sc.nextInt();
                        income = income*12 + all4*12 + spall4* 12;
                        if (income <= 250000) {
                            System.out.println("no tax");
                        } else if (income > 250000 && income <= 500000) {
                            tax = (income * 5) / 100;
                            System.out.println("Tax is " + tax);
                        } else if (income > 500000 && income <= 1000000) {
                            tax = ((income - 500000) * 10) / 100;
                            System.out.println("Tax is : " + (tax + 12500));
                        } else {
                            tax = ((income - 1000000) * 15) / 100;
                            System.out.println("Tax is : " + (tax + 37500));

                        }
                        break;
                }

            case 3:
                int slab2 = sc.nextInt();
                switch (slab2) {
                    case 1:
                        System.out.println("Enter Income");
                        income = sc.nextInt();
                        System.out.println("enter allowance");
                        int all = sc.nextInt();
                        System.out.println("Enter special allowance");
                        int spall = sc.nextInt();
                        income = income*12 + all*12 + spall* 12;
                        if (income <= 300000) {
                            System.out.println("no tax");
                        } else if (income > 500000 && income <= 1000000) {
                            tax = ((income - 500000) * 20) / 100;
                            System.out.println("Tax is :" + (tax + 10000));
                        } else if (income > 300000 && income <= 500000) {
                            tax = ((income) * 5) / 100;
                            System.out.println("Tax is : " + tax);
                        } else {
                            tax = ((income - 100000) * 30) / 100;
                            System.out.println("Tax is : " + (tax + 110000));
                        }
                        break;
                    case 2:
                        System.out.println("Enter Income");
                        income = sc.nextInt();
                        System.out.println("enter allowance");
                        int all3 = sc.nextInt();
                        System.out.println("Enter special allowance");
                        int spall3 = sc.nextInt();
                        income = income*12 + all3*12 + spall3* 12;
                        if (income <= 250000) {
                            System.out.println("no tax");
                        } else if (income > 250000 && income <= 500000) {
                            tax = (income * 5) / 100;
                            System.out.println("Tax is " + tax);
                        } else if (income > 500000 && income <= 1000000) {
                            tax = ((income - 500000) * 10) / 100;
                            System.out.println("Tax is : " + (tax + 12500));
                        } else {
                            tax = ((income - 1000000) * 15) / 100;
                            System.out.println("Tax is : " + (tax + 37500));

                        }
                        break;

                }

            case 4:
                int slab3 = sc.nextInt();
                switch (slab3) {
                    case 1:
                        System.out.println("Enter Income");
                        income = sc.nextInt();
                        System.out.println("enter allowance");
                        int all = sc.nextInt();
                        System.out.println("Enter special allowance");
                        int spall = sc.nextInt();
                        income = income*12 + all*12 + spall* 12;
                        if (income <= 250000) {
                            System.out.println("no tax");
                        } else if (income > 500000 && income <= 1000000) {
                            tax = ((income - 500000) * 20) / 100;
                            System.out.println("Tax is :" + (tax + 12500));
                        } else if (income > 250000 && income <= 500000) {
                            tax = ((income) * 5) / 100;
                            System.out.println("Tax is : " + tax);
                        } else {
                            tax = ((income - 100000) * 30) / 100;
                            System.out.println("Tax is : " + (tax + 112500));
                        }
                        break;
                    case 2:
                        System.out.println("Enter Income");
                        income = sc.nextInt();
                        System.out.println("enter allowance");
                        int all1 = sc.nextInt();
                        System.out.println("Enter special allowance");
                        int spall1 = sc.nextInt();
                        income = income*12 + all1*12 + spall1* 12;
                        if (income <= 250000) {
                            System.out.println("no tax");
                        } else if (income > 250000 && income <= 500000) {
                            tax = (income * 5) / 100;
                            System.out.println("Tax is " + tax);
                        } else if (income > 500000 && income <= 1000000) {
                            tax = ((income - 500000) * 10) / 100;
                            System.out.println("Tax is : " + (tax + 12500));
                        } else {
                            tax = ((income - 1000000) * 15) / 100;
                            System.out.println("Tax is : " + (tax + 37500));

                        }
                        break;

                }

            case 5:
                int slab4 = sc.nextInt();
                switch (slab4) {
                    case 1:
                        System.out.println("Enter Income");
                        income = sc.nextInt();
                        System.out.println("enter allowance");
                        int all = sc.nextInt();
                        System.out.println("Enter special allowance");
                        int spall = sc.nextInt();
                        income = income*12 + all*12 + spall* 12;
                        if (income <= 250000) {
                            System.out.println("no tax");
                        } else if (income > 500000 && income <= 1000000) {
                            tax = ((income - 500000) * 20) / 100;
                            System.out.println("Tax is :" + (tax + 12500));
                        } else if (income > 250000 && income <= 500000) {
                            tax = ((income) * 5) / 100;
                            System.out.println("Tax is : " + tax);
                        } else {
                            tax = ((income - 100000) * 30) / 100;
                            System.out.println("Tax is : " + (tax + 112500));
                        }
                        break;
                    case 2:
                        System.out.println("Enter Income");
                        income = sc.nextInt();
                        System.out.println("enter allowance");
                        int all2 = sc.nextInt();
                        System.out.println("Enter special allowance");
                        int spall2 = sc.nextInt();
                        income = income*12 + all2*12 + spall2* 12;
                        if (income <= 250000) {
                            System.out.println("no tax");
                        } else if (income > 250000 && income <= 500000) {
                            tax = (income * 5) / 100;
                            System.out.println("Tax is " + tax);
                        } else if (income > 500000 && income <= 1000000) {
                            tax = ((income - 500000) * 10) / 100;
                            System.out.println("Tax is : " + (tax + 12500));
                        } else {
                            tax = ((income - 1000000) * 15) / 100;
                            System.out.println("Tax is : " + (tax + 37500));

                        }
                        break;

                }

        }
        System.out.println("Tax is "+ tax);

    }

    void Company(){
        System.out.println(" Domestic Company");
        System.out.println(" & Foreign Company");
            System.out.println("Press 1 : urnover or Gross Receipt in previous year 2018-19 not exceed ₹ 400 crores::25%");
            System.out.println("Press 2 : If opted for Section 115BA ::25%");
            System.out.println("Press 3 : If opted for Section 115BAA::22%");
            System.out.println("Press 4 : If opted for Section 115BAB::15%");
            System.out.println("Press 5 : Any other Domestic Company::30%");
            int yy = sc.nextInt();
            int tax = 0;
            switch(yy) {
            case 1 :
            System.out.println("Enter Income");
            income = sc.nextInt();
            
             tax = ((income)*25)/100 ;
            System.out.println("Tax is :"+tax );
            break;
            case 2 :
            System.out.println("Enter Income");
            income = sc.nextInt();
            
            tax = ((income)*25)/100 ;
            System.out.println("Tax is :"+tax );
            break;
            case 3 :
            System.out.println("Enter Income");
            income = sc.nextInt();
            System.out.println("enter allowance");
            int all2 = sc.nextInt();
            System.out.println("Enter special allowance");
            int spall2 = sc.nextInt();
            income = income*12 + all2*12 + spall2* 12;
            tax = ((income)*25)/100 ;
            System.out.println("Tax is :"+tax );
            break;
            case 4 :
            System.out.println("Enter Income");
            income = sc.nextInt();
            tax = ((income)*25)/100 ;
            System.out.println("Tax is :"+tax );
            break;
            case 5 :
            System.out.println("Enter Income");
            income = sc.nextInt();
            tax = ((income)*25)/100 ;
            System.out.println("Tax is :"+tax );
            break;   
        
    }
}        
    }
    
public class Income extends calculator {
    public static void main(String args[]) {
        Income inc = new Income();
        Scanner sc = new Scanner(System.in);
        System.out.println("Categiory 1 : Individual/HUF");
        System.out.println("Categiory 2 : Company");
         
        int person_cat = sc.nextInt();
        switch (person_cat) {
            case 1:
                inc.Individual();
            case 2:
                inc.Company();
            case 3:
              
        }
    }
}
