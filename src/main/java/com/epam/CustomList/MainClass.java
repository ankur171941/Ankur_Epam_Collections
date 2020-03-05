package com.epam.CustomList;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;

public class MainClass {
    public static final Logger logger = LogManager.getLogger(MainClass.class);
    public static void main(String[] args)
    {
        List<Integer> list = new List<Integer>();
        Scanner s=new Scanner(System.in);
        int ch=1;
        while (ch<7)
        {
            logger.info("Press 1 for input to list");
            logger.info("Press 2 for getting the element");
            logger.info("Press 3 to know the position of the Element");
            logger.info("Press 4 to remove a particular element");
            logger.info("Press 5 to remove the last element");

            logger.info("Press 6 number to print the full list");
            logger.info("Press 7 to exit");

            ch=s.nextInt();
            logger.info("The choice Entered is "+ ch);
            if(ch==1)
            {
                logger.info("Please Enter an element to add to the list");
                list.add(s.nextInt());
            }
            else if(ch==2)
            {
                logger.info("Enter the index of the element to be displayed");
                logger.info(list.get(s.nextInt()));
            }
            else if(ch==3)
            {
                logger.info("Enter the element to know the position of the entered element");
                logger.info(list.position(s.nextInt()));
            }
            else if(ch==4)
            {
                logger.info("Enter the element to be removed");
               list.remove(s.nextInt());
            }

            else if(ch==5)
            {

                list.removelast();
            }
            else if(ch ==6)
            {
                list.print();
            }
            else
            {
                logger.info("--------You are exiting the program. ThankYou for your precious time------------");
                break;
            }
        }

    }
}
