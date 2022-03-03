package com.simplilearn.virtualproject1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class FixBug {

	public static void main(String[] args) 
	{
        System.out.println("\n**************************************\n");
        System.out.println("\tWelcome to The Desk \n");
        System.out.println("**************************************");
        optionsSelection();

    }
    private static void optionsSelection() 
    {
        String[] arr = {"1. I wish to review my expenditure",
                "2. I wish to add my expenditure",
                "3. I wish to delete my expenditure",
                "4. I wish to sort the expenditures",
                "5. I wish to search for a expenditure",
                "6. Close this application...."
        };
        int[] arr1 = {1,2,3,4,5,6};
        int  slen = arr1.length;
        for(int i=0; i<slen;i++)
        {
            System.out.println(arr[i]);
        }
        ArrayList<Integer> arrlist = new ArrayList<Integer>();
        ArrayList<Integer> expenses = new ArrayList<Integer>();
        expenses.add(100);
        expenses.add(200);
        expenses.add(300);
        expenses.add(400);
        expenses.add(500);
        expenses.addAll(arrlist);
        System.out.println("\nEnter your choice:\t");
        Scanner sc = new Scanner(System.in);
        int  options =  sc.nextInt();
        for(int j=1;j<=slen;j++)
        {
            if(options==j)
            {
                switch (options)
                {
                    case 1:
                        System.out.println("Your saved expenses are listed below: \n");
                        System.out.println(expenses+"\n");
                        optionsSelection();
                        break;
                    case 2:
                        System.out.println("Enter the value to add : \n");
                        int value = sc.nextInt();
                        expenses.add(value);
                        System.out.println("Your value is sucessfully added \n");
                        expenses.addAll(arrlist);
                        System.out.println(expenses+"\n");
                        optionsSelection();

                        break;
                    case 3:
                        System.out.println("You are sure about to delete all your expenses! \nConfirm again by selecting the same option...\n");
                        int con_choice = sc.nextInt();
                        if(con_choice==options){
                               expenses.clear();
                            System.out.println(expenses+"\n");
                            System.out.println("All your expenses are erased!\n");
                        } else
                        {
                            System.out.println("Oops... try again!");
                        }
                        optionsSelection();
                        break;
                    case 4:
                        sortExpenses(expenses);
                        optionsSelection();
                        break;
                    case 5:
                        searchExpenses(expenses);
                        optionsSelection();
                        break;
                    case 6:
                        closeApp();
                        break;
                    default:
                        System.out.println(" invalid choice! ");
                        break;
                }
            }
        }
    }
    private static void closeApp() {
        System.out.println("Closing your application... \nThank you! \n visit again...");
    }
    private static void searchExpenses(ArrayList<Integer> arrayList) {
        int leng = arrayList.size();
        System.out.println("Enter what you want to search : \t");
        Scanner sc = new Scanner(System.in);
        Boolean flag = false;
        int exp = sc.nextInt();
        for(int i=0; i<leng; i++)
        {
        	if(exp == arrayList.get(i))
        	{
        		System.out.println("Expense "+exp+" found at index "+i);
        		flag = true;
        		break;
        	}
        }
        if(flag==false)
        {
        	System.out.println("No such expense found "+exp);
        }
    }
    private static void sortExpenses(ArrayList<Integer> arrayList) {
        int arrlength =  arrayList.size();
        Collections.sort(arrayList);
        System.out.println("Sorted Expenses are: ");
        for(int i=0; i<arrlength; i++)
        {
        	System.out.println(arrayList.get(i));
        }
    }
}
