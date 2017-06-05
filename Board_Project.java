import java.io.*;
import java.awt.*;
import java.util.*;
import java.lang.*;
import javax.swing.*;

public class Board_Project
{
    BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
    int num,n;

    public void Main () throws IOException
    {
        Board_Project obj = new Board_Project();

        //Calling all the other methods in the main function

        obj.Welcome();
        obj.Menu();
        obj.Test();
        obj.Review();
        obj.Scoring();

    }

    public void Welcome () throws IOException
    {

        System.out.println("\t\t\t\t\t____    __    ____  _______   __         _______    ______     ___    ___   _______    ");
        System.out.println("\t\t\t\t\t\\   \\  /  \\  /   / |   ____| |  |       /  _____|  /  __  \\   |   \\  /   | |   ____|   ");
        System.out.println("\t\t\t\t\t \\   \\/    \\/   /  |  |__    |  |      |  /       |  |  |  |  |    \\/    | |  |__      ");
        System.out.println("\t\t\t\t\t  \\            /   |   __|   |  |      |  |       |  |  |  |  |  | \\/ |  | |   __|     ");
        System.out.println("\t\t\t\t\t   \\    /\\    /    |  |____  |  |____  |  \\_____  |  |__|  |  |  |    |  | |  |____    ");
        System.out.println("\t\t\t\t\t    \\__/  \\__/     |_______| |_______|  \\_______|  \\______/   |__|    |__| |_______|   ");
        System.out.println("");
        System.out.println("\t\t\t\t\t----------------------------------------------------------------------------------------");

    }

    int Flag=0;

    public void Menu () throws IOException
    {

        Board_Project obj = new Board_Project();
        //Creating an object to call other methods in this method

        System.out.println("");

        try
        {
            System.out.println("\t\t\t\t\t========================================================================================");
            Thread.sleep(250);
            System.out.println("\t\t\t\t\t||                                                                                    ||");
            Thread.sleep(250);
            System.out.println("\t\t\t\t\t||          __  __       _         __  __                                             ||");
            Thread.sleep(250);
            System.out.println("\t\t\t\t\t||         |  \\/  | __ _(_)_ __   |  \\/  | ___ _ __  _   _                            ||");
            Thread.sleep(250);
            System.out.println("\t\t\t\t\t||         | |\\/| |/ _` | | '_ \\  | |\\/| |/ _ \\ '_ \\| | | |                           ||");
            Thread.sleep(250);
            System.out.println("\t\t\t\t\t||         | |  | | (_| | | | | | | |  | |  __/ | | | |_| |                           ||");
            Thread.sleep(250);
            System.out.println("\t\t\t\t\t||         |_|  |_|\\__,_|_|_| |_| |_|  |_|\\___|_| |_|\\__,_|                           ||");
            Thread.sleep(250);
            System.out.println("\t\t\t\t\t||                                                                                    ||");
            Thread.sleep(250);
            System.out.println("\t\t\t\t\t||                                                                                    ||");
            Thread.sleep(250);
            System.out.println("\t\t\t\t\t||           1) IQ test                                                               ||");
            Thread.sleep(250);
            System.out.println("\t\t\t\t\t||           2) Score Guide                                                           ||");
            Thread.sleep(250);
            System.out.println("\t\t\t\t\t||           3) Review Questions                                                      ||");
            Thread.sleep(250);
            System.out.println("\t\t\t\t\t||           4) Logout and exit                                                       ||");
            Thread.sleep(250);
            System.out.println("\t\t\t\t\t||                                                                                    ||");
            Thread.sleep(250);
            System.out.println("\t\t\t\t\t========================================================================================");
        }
        catch (Exception E){}
        //The choice made by the user
        int flag=0 , topic = 5;
        do
        {
            System.out.println("\t\t\t\t\tEnter the number corresponding to the topic you wish to choose.");

            try { 
                System.out.print("\t\t\t\t\t\t\t");
                topic = Integer.parseInt(br.readLine());            
            }
            catch(Exception ee) { 
                flag = 0;
            }

            if (topic==1)
            {
                obj.Test();
                flag=1;
            }
            else if (topic==2)
            {
                obj.Scoring();
                flag=1;
            }
            else if (topic==3)
            {
                obj.Review();
                flag=1;
            }
            else if (topic==4)
            {
                System.out.println("\t\t\t\t\tSuccessfully LOGGED OUT!");
                flag=1;
                System.exit(5);  //to terminate the program after 
            }
            else
            {
                System.out.println("\t\t\t\t\tINVALID input. Please Enter one of the options");
                flag=0;
            }
        }while (flag==0);        
    }

    String   a[] = new String[11]; //array to store the user's answers 
    String  a1[] = {"c","e","c","b","a","c","b","d","d","a","d"}; //array to store the correct answers 

    String q1 = "\t\t\t1. At the end of a banquet 10 people shake hands with each other. How many handshakes will there be in total?\n\t\t\t   A. 100\n\t\t\t   B. 20\n\t\t\t   C. 45\n\t\t\t   D. 50\n\t\t\t   E. 90";
    String q2 = "\t\t\t2. The day before the day before yesterday is three days after Saturday. What day is it today?\n\t\t\t   A. Monday\n\t\t\t   B. Tuesday\n\t\t\t   C. Wednesday\n\t\t\t   D. Thursday\n\t\t\t   E. Friday";
    String q3 = "\t\t\t3. Select the number that best completes the analogy 10 : 6 :: 3 : ?\n\t\t\t   A. 2\n\t\t\t   B. 1\n\t\t\t   C. -1\n\t\t\t   D. 4";
    String q4 = "\t\t\t4. 165135 is to peace as 1215225 is to\n\t\t\t   A. lead\n\t\t\t   B. love\n\t\t\t   C. loop\n\t\t\t   D. castle";
    String q5 = "\t\t\t5. Library is to book as book is to?\n\t\t\t   A. Page\n\t\t\t   B. Copy\n\t\t\t   C. Binding\n\t\t\t   D. Cover";
    String q6 = "\t\t\t6. Some months have 30 days, some months have 31 days. How many months have 28 days?\n\t\t\t   A. 13 months\n\t\t\t   B. 1 months\n\t\t\t   C. 12 months\n\t\t\t   D. 6 months";
    String q7 = "\t\t\t7. Divide 30 by half and add ten. What do you get?\n\t\t\t   A. 25\n\t\t\t   B. 70\n\t\t\t   C. 35\n\t\t\t   D. 45";
    String q8 = "\t\t\t8. If you had only one match and entered a COLD and DARK room, where there was an oil heater, an oil lamp and a candle, Which would you light first?\n\t\t\t   A. The candle\n\t\t\t   B. The oil lamp\n\t\t\t   C. The oil heater\n\t\t\t   D. None of the above";
    String q9 = "\t\t\t9. A farmer had 17 sheep. All but 9 died. How many live sheep were left? \n\t\t\t   A. 9 sheep\n\t\t\t   B. 8 sheep\n\t\t\t   C. 17 sheep\n\t\t\t   D. 7 sheep";
    String q10 = "\t\t\t10. If you cross the second person in a race, then what5 position are you?\n\t\t\t   A. second\n\t\t\t   B. first\n\t\t\t   C. third\n\t\t\t   D. None of the above";
    String q11 = "\t\t\tBONUS QUESTION !!!!!!!\n\t\t\t11. A man is walking outside in the rain. He does not have an umbrella even though it is pouring outside. Nothing is covering his head, yet his hair doesn't get wet. How is this possible?\n\t\t\t   A. He has super high-tech gel on his hair and the water slides right off.\n\t\t\t   B. He is chuck norris. The rain is afraid to touch him.\n\t\t\t   C. He uses PANTENE so his hair is soo silky that the water just slides off it\n\t\t\t   D. eh...He dosn't have hair";

    //initialising the questions in variables which in turn can be initialised in an array, hence improving the readability of the program.

    String arr[] = {q1,q2,q3,q4,q5,q6,q7,q8,q9,q10,q11}; //array to store the questions, so accessing them in the review method is easier and more efficient

    int score = 0; //variable to store the user's score
    int iq = 0; //variable to store the user's IQ score

    public void Test () throws IOException
    {

        Board_Project obj = new Board_Project();

        System.out.print("\u000C");
        System.out.println("");
        try
        {
            System.out.println("\t\t\t\t==================================================================================================================");
            Thread.sleep(250);
            System.out.println("\t\t\t\t||                                                                                                      \t||");
            Thread.sleep(250);
            System.out.println("\t\t\t\t||\t\t\t\t\t             _____ ____                                                 ||");
            Thread.sleep(250);
            System.out.println("\t\t\t\t||\t\t\t\t\t            |_   _/ __ \\                                                ||");
            Thread.sleep(250);
            System.out.println("\t\t\t\t||\t\t\t\t\t              | || |  | |                                               ||");
            Thread.sleep(250);
            System.out.println("\t\t\t\t||\t\t\t\t\t              | || |  | |                                               ||"); 
            Thread.sleep(250);
            System.out.println("\t\t\t\t||\t\t\t\t\t             _| || |__| |                                               ||");
            Thread.sleep(250);
            System.out.println("\t\t\t\t||\t\t\t\t\t            |_____\\___\\_\\                                               ||");
            Thread.sleep(250);
            System.out.println("\t\t\t\t||                                                                                                       \t||");
            Thread.sleep(250);
            System.out.println("\t\t\t\t||\tAn intelligence  quotient (IQ) is a score derived from one  of several standardized tests designed   \t||");
            Thread.sleep(250);
            System.out.println("\t\t\t\t||\tto assess human  intelligence. The abbreviation 'IQ' was  coined by the psychologist William Stern   \t||");
            Thread.sleep(250);
            System.out.println("\t\t\t\t||\tfor the German  term Intelligenzquotient, his term for  a scoring method for intelligence tests he   \t||");
            Thread.sleep(250);
            System.out.println("\t\t\t\t||\tadvocated in a 1912 book. When current IQ tests are developed, the median raw score of the norming  \t||");
            Thread.sleep(250);
            System.out.println("\t\t\t\t||\tnorming sample is defined as IQ 100 and scores each standard deviation (SD) up or down are defined   \t||");
            Thread.sleep(250);
            System.out.println("\t\t\t\t||\tas 15 IQ points greater or less, although this was not always  so historically. By this definition,    \t||");
            Thread.sleep(250);
            System.out.println("\t\t\t\t||\tapproximately two-thirds  of the population scores  between  IQ 85 and IQ 115, and about 5 percent    \t||");
            Thread.sleep(250);
            System.out.println("\t\t\t\t||\tof the population scores above 125.                                                                 \t||");
            Thread.sleep(250);
            System.out.println("\t\t\t\t||                                                                                                      \t||");
            Thread.sleep(250);
            System.out.println("\t\t\t\t==================================================================================================================");
            Thread.sleep(250);
            System.out.println("\t\t\t\tINSTRUCTIONS: Enter the letter corresponding to the option you choose.");
            Thread.sleep(250);
            System.out.println("\t\t\t\t              If you get 7 or more questions correct, you will get to answer a bonus question!!");
        }
        catch (Exception E){}

        System.out.println("");  

        System.out.println("\t\t\t\tPress 'ENTER' key to START the EPIC IQ TEST !!!");
        System.out.print("\t\t\t\t");
        br.readLine();
        
        { //question 1
            int flag=0; //flag variable to break the loop at the right time
            do  //makes the user type in a valid choice by asking the question again to the user everytime he/she enters an invalid choice.
            {
                System.out.println(arr[0]);
                System.out.print("\t\t\t");
                a[0] = br.readLine(); 

                if (a[0].equalsIgnoreCase("a")||a[0].equalsIgnoreCase("b")||a[0].equalsIgnoreCase("d")||a[0].equalsIgnoreCase("e"))
                {
                    flag=0;
                    System.out.println("\t\tSORRY, WRONG ANSWER  :(\n");
                }
                else if (a[0].equalsIgnoreCase("c"))
                {
                    flag=0;
                    System.out.println("\t\tGOOD WORK!! YOU GOT THAT RIGHT!!!  ;)\n");
                    score++;
                    iq = iq + 14;
                }
                else
                {
                    System.out.println("\t\tInvalid input. Please enter one of the options.\n");
                    flag=1;
                }
            }while(flag==1);

        }

        { //question 2
            int flag=0;
            do 
            {
                System.out.println(arr[1]);
                System.out.print("\t\t\t");
                a[1] = br.readLine(); 

                if (a[1].equalsIgnoreCase("a")||a[1].equalsIgnoreCase("b")||a[1].equalsIgnoreCase("d")||a[1].equalsIgnoreCase("c"))
                {
                    flag=0;
                    System.out.println("\t\tSORRY, WRONG ANSWER  :(\n");
                }
                else if (a[1].equalsIgnoreCase("e"))
                {
                    flag=0;
                    System.out.println("\t\tGOOD WORK!! YOU GOT THAT RIGHT!!!  ;)\n");
                    score++;
                    iq = iq + 14;
                }
                else
                {
                    System.out.println("\t\tInvalid input. Please enter one of the options.\n");
                    flag=1;
                }
            }while(flag==1);

        }

        { //question 3
            int flag=0;
            do
            {
                System.out.println(arr[2]);
                System.out.print("\t\t\t");
                a[2] = br.readLine(); 
                if (a[2].equalsIgnoreCase("a")||a[2].equalsIgnoreCase("b")||a[2].equalsIgnoreCase("d")||a[2].equalsIgnoreCase("e"))
                {
                    flag=0;
                    System.out.println("\t\tSORRY, WRONG ANSWER  :(\n");
                }
                else if (a[2].equalsIgnoreCase("c"))
                {
                    flag=0;
                    System.out.println("\t\tGOOD WORK!! YOU GOT THAT RIGHT!!!  ;)\n");
                    score++;
                    iq = iq + 14;
                }
                else
                {
                    System.out.println("\t\tInvalid input. Please enter one of the options.\n");
                    flag=1;
                }
            }while(flag==1);

        }

        { //question 4
            int flag=0;
            do
            {
                System.out.println(arr[3]);
                System.out.print("\t\t\t");
                a[3] = br.readLine(); 

                if (a[3].equalsIgnoreCase("a")||a[3].equalsIgnoreCase("c")||a[3].equalsIgnoreCase("d"))
                {
                    flag=0;
                    System.out.println("\t\tSORRY, WRONG ANSWER  :(\n");
                }
                else if (a[3].equalsIgnoreCase("b"))
                {
                    flag=0;
                    System.out.println("\t\tGOOD WORK!! YOU GOT THAT RIGHT!!!  ;)\n");
                    score++;
                    iq = iq + 14;
                }
                else
                {
                    System.out.println("\t\tInvalid input. Please enter one of the options.\n");
                    flag=1;
                }
            }while(flag==1);

        }

        { //question 5
            int flag=0;
            do
            {
                System.out.println(arr[4]);
                System.out.print("\t\t\t");
                a[4] = br.readLine(); 

                if (a[4].equalsIgnoreCase("c")||a[4].equalsIgnoreCase("b")||a[4].equalsIgnoreCase("d"))
                {
                    flag=0;
                    System.out.println("\t\tSORRY, WRONG ANSWER  :(\n");
                }
                else if (a[4].equalsIgnoreCase("a"))
                {
                    flag=0;
                    System.out.println("\t\tGOOD WORK!! YOU GOT THAT RIGHT!!!  ;)\n");
                    score++;
                    iq = iq + 14;
                }
                else
                {
                    System.out.println("\t\tInvalid input. Please enter one of the options.\n");
                    flag=1;
                }
            }while(flag==1);

        }

        { //question 6
            int flag=0;
            do
            {
                System.out.println(arr[5]);
                System.out.print("\t\t\t");
                a[5] = br.readLine(); 

                if (a[5].equalsIgnoreCase("a")||a[5].equalsIgnoreCase("b")||a[5].equalsIgnoreCase("d"))
                {
                    flag=0;
                    System.out.println("\t\tSORRY, WRONG ANSWER  :(\n");
                }
                else if (a[5].equalsIgnoreCase("c"))
                {
                    flag=0;
                    System.out.println("\t\tGOOD WORK!! YOU GOT THAT RIGHT!!!  ;)\n");
                    score++;
                    iq = iq + 14;
                }
                else
                {
                    System.out.println("\t\tInvalid input. Please enter one of the options.\n");
                    flag=1;
                }
            }while(flag==1);

        }

        {  //question 7
            int flag=0;
            do
            {
                System.out.println(arr[6]);
                System.out.print("\t\t\t");
                a[6] = br.readLine(); 

                if (a[6].equalsIgnoreCase("a")||a[6].equalsIgnoreCase("c")||a[6].equalsIgnoreCase("d"))
                {
                    flag=0;
                    System.out.println("\t\tSORRY, WRONG ANSWER  :(\n");
                }
                else if (a[6].equalsIgnoreCase("b"))
                {
                    flag=0;
                    System.out.println("\t\tGOOD WORK!! YOU GOT THAT RIGHT!!!  ;)\n");
                    score++;
                    iq = iq + 14;
                }
                else
                {
                    System.out.println("\t\tInvalid input. Please enter one of the options.\n");
                    flag=1;
                }
            }while(flag==1);

        }

        { //question 8
            int flag=0;
            do
            {
                System.out.println(arr[7]);
                System.out.print("\t\t\t");
                a[7] = br.readLine(); 

                if (a[7].equalsIgnoreCase("a")||a[7].equalsIgnoreCase("b")||a[7].equalsIgnoreCase("c"))
                {
                    flag=0;
                    System.out.println("\t\tSORRY, WRONG ANSWER  :(\n");
                }
                else if (a[7].equalsIgnoreCase("d"))
                {
                    flag=0;
                    System.out.println("\t\tGOOD WORK!! YOU GOT THAT RIGHT!!!  ;)\n");
                    score++;
                    iq = iq + 14;
                }
                else
                {
                    System.out.println("\t\tInvalid input. Please enter one of the options.\n");
                    flag=1;
                }
            }while(flag==1);

        }

        { //question 9
            int flag=0;
            do
            {
                System.out.println(arr[8]);
                System.out.print("\t\t\t");
                a[8] = br.readLine(); 

                if (a[8].equalsIgnoreCase("d")||a[8].equalsIgnoreCase("b")||a[8].equalsIgnoreCase("c"))
                {
                    flag=0;
                    System.out.println("\t\tSORRY, WRONG ANSWER  :(\n");
                }
                else if (a[8].equalsIgnoreCase("a"))
                {
                    flag=0;
                    System.out.println("\t\tGOOD WORK!! YOU GOT THAT RIGHT!!!  ;)\n");
                    score++;
                    iq = iq + 14;
                }
                else
                {
                    System.out.println("\t\tInvalid input. Please enter one of the options.\n");
                    flag=1;
                }
            }while(flag==1);

        }

        { //question 10
            int flag=0;
            do
            {
                System.out.println(arr[9]);
                System.out.print("\t\t\t");
                a[9] = br.readLine(); 

                if (a[9].equalsIgnoreCase("c")||a[9].equalsIgnoreCase("b")||a[9].equalsIgnoreCase("d"))
                {
                    flag=0;
                    System.out.println("\t\tSORRY, WRONG ANSWER  :(\n");
                }
                else if (a[9].equalsIgnoreCase("a"))
                {
                    flag=0;
                    System.out.println("\t\tGOOD WORK!! YOU GOT THAT RIGHT!!!  ;)\n");
                    score++;
                    iq = iq + 14;
                }
                else
                {
                    System.out.println("\t\tInvalid input. Please enter one of the options.\n");
                    flag=1;
                }
            }while(flag==1);

        }

        if (score>=7)
        { //question 11
            int flag=0;
            do
            {
                System.out.println(arr[10]);
                System.out.print("\t\t\t");
                a[10] = br.readLine(); 

                if (a[10].equalsIgnoreCase("a")||a[10].equalsIgnoreCase("b")||a[10].equalsIgnoreCase("c"))
                {
                    flag=0;
                    System.out.println("\t\tSORRY, WRONG ANSWER  :(\n");
                }
                else if (a[10].equalsIgnoreCase("d"))
                {
                    flag=0;
                    System.out.println("\t\tGOOD WORK!! YOU GOT THAT RIGHT!!!  ;) BUT...you dont get any points for this question because its a BONUS question so u WON this EXTRA question!!\n");
                }
                else
                {
                    System.out.println("\t\tInvalid input. Please enter one of the options.\n");
                    flag=1;
                }
            }while(flag==1);            

        }

        try
        {
            Thread.sleep(2500);
            System.out.print("\u000C");
        }
        catch (Exception E){}

        System.out.println("\t\t\t\tCongrtulations! on finishing THE EPIC LEGENDARY IQ TEST !!!!!!!!");
        System.out.println("");
        System.out.println("\t\t\t\tRESULTS:-");
        System.out.println("\t\t\t\tScore = " + score + "/10 !!");
        System.out.println("\t\t\t\tIQ = " + iq);
        System.out.println("");
        System.out.println("\t\t\t\t---------------------------------------");
        System.out.println("");

        obj.Scoring();     

        System.out.println("\t\t\t\tEnter :-");
        System.out.println("\t\t\t\t      'm' if u want to return to the main menu");
        System.out.println("\t\t\t\t      'e' if u want to exit the portal");

        String re = br.readLine();

        if (re.equalsIgnoreCase("m"))
        {
            System.out.print("\u000C");
            obj.Menu();
        }
        else if (re.equalsIgnoreCase("e"))
        {
            System.out.print("\u000C");
            System.out.println("\t\t\t\t\t\t\t\tYOU HAVE BEEN SUCCESSFULLY LOGGED OUT!");
            System.exit(0);
        }
        else
        {
            System.out.println("\t\t\t\tINVALID.");
            System.out.print("\u000C");
            obj.Menu();
        }

    }

    public void Review () throws IOException
    {        

        Board_Project obj = new Board_Project();

        System.out.println("\f");

        try 
        {
            System.out.println("\t\t\t\t\t==================================================================================");
            Thread.sleep(250);
            System.out.println("\t\t\t\t\t||                                                                             \t||");
            Thread.sleep(250);
            System.out.println("\t\t\t\t\t||\t         _____  ________      _______ ________          __\t\t||");
            Thread.sleep(250);
            System.out.println("\t\t\t\t\t||\t        |  __ \\|  ____\\ \\    / /_   _|  ____\\ \\        / /\t\t||");
            Thread.sleep(250);
            System.out.println("\t\t\t\t\t||\t        | |__) | |__   \\ \\  / /  | | | |__   \\ \\  /\\  / / \t\t||");
            Thread.sleep(250);
            System.out.println("\t\t\t\t\t||\t        |  _  /|  __|   \\ \\/ /   | | |  __|   \\ \\/  \\/ /  \t\t||");
            Thread.sleep(250);
            System.out.println("\t\t\t\t\t||\t        | | \\ \\| |____   \\  /   _| |_| |____   \\  /\\  /   \t\t||");
            Thread.sleep(250);
            System.out.println("\t\t\t\t\t||\t        |_|  \\_\\______|   \\/   |_____|______|   \\/  \\/    \t\t||");
            Thread.sleep(250);
            System.out.println("\t\t\t\t\t||                                                                             \t||");  
            Thread.sleep(250);
            System.out.println("\t\t\t\t\t||\t    IMPORTANT: Press any key other than 'm','M','e' or 'E'\t        ||");
            Thread.sleep(250);
            System.out.println("\t\t\t\t\t||\t               after each question if you wish to review\t        ||");
            Thread.sleep(250);
            System.out.println("\t\t\t\t\t||\t               another question else...\t\t\t\t\t||");
            Thread.sleep(250);
            System.out.println("\t\t\t\t\t||\t    ENTER :-                                                            ||");
            Thread.sleep(250);
            System.out.println("\t\t\t\t\t||\t          'm' OR 'M' if u want to return to the main menu               ||");
            Thread.sleep(250);
            System.out.println("\t\t\t\t\t||\t          'e' OR 'E' if u want to exit the portal                       ||");
            Thread.sleep(250);
            System.out.println("\t\t\t\t\t||                                                                             \t||");
            Thread.sleep(250);
            System.out.println("\t\t\t\t\t==================================================================================");
        }
        catch (Exception E){}

        System.out.println("");

        int flag=0;
        do 
        {                       
            System.out.println("\t\t\tENTER the question number you wish to review.");
            try { 
                System.out.print("\t\t\t");
                num = Integer.parseInt(br.readLine()); 
            } 
            catch(Exception e_review) {
                flag = 0;
                n = 100;
            }
            n = num-1;
            if ( n > 10) {
                System.out.println("\t\t\tInvalid question number. Question numbers lie between 1 and 11");
            }
            else {
                System.out.println("" + arr[n]);
                System.out.println("\t\t\tCORRECT ANSWER: " + a1[n]);
            }
            System.out.println("\n\t\t\tEnter 'm' for menu or 'e' to Exit or 'Enter' to review another question.\n\t\t");
            System.out.print("\t\t\t");
            String re = br.readLine();
            if (re.equalsIgnoreCase("m"))
            {
                flag=1;
                System.out.print("\u000C");
                obj.Menu();
            }
            else if (re.equalsIgnoreCase("e"))
            {
                flag=1;
                System.out.print("\u000C");
                System.out.println("\t\t\t\t\t\t\t\tYOU HAVE BEEN SUCCESSFULLY LOGGED OUT!");
                System.exit(0);
            }
            else
            {
                flag=0;
            }
        }while(flag==0);
    }

    public void Scoring () throws IOException
    {

        Board_Project obj = new Board_Project();

        //System.out.print("\u000C");

        System.out.println("");

        System.out.println("\t\t\t\tIntelligence Quotient                               Cognitive Designation");
        System.out.println("");
        System.out.println("\t\t\t\t      40 - 54                                       Severely challenged (Less than 1% of test takers)");
        System.out.println("\t\t\t\t      55 - 69                                       Challenged (2.3% of test takers)");
        System.out.println("\t\t\t\t      70 - 84                                       Below average");
        System.out.println("\t\t\t\t      85 - 114                                      Average (68% of test takers)");
        System.out.println("\t\t\t\t      115 - 129                                     Above average");
        System.out.println("\t\t\t\t      130 - 144                                     Gifted (2.3% of test takers)");
        System.out.println("\t\t\t\t      145 - 159                                     Genius (Less than 1% of test takers)");
        System.out.println("\t\t\t\t      160 - 175                                     Extraordinary genius");

        System.out.println("");

        System.out.println("\t\t\t\tEnter :-");
        System.out.println("\t\t\t\t      'm' if u want to return to the main menu");
        System.out.println("\t\t\t\t      'e' if u want to exit the portal");
        System.out.print("\t\t\t\t\t");
        String re = br.readLine();

        if (re.equalsIgnoreCase("m"))
        {
            System.out.print("\u000C");
            obj.Menu();
        }
        else if (re.equalsIgnoreCase("e"))
        {
            System.out.print("\u000C");
            System.out.println("\t\t\t\t\t\t\t\tYOU HAVE BEEN SUCCESSFULLY LOGGED OUT!");
            System.exit(0);
        }
        else
        {
            System.out.println("\t\t\t\tINVALID.");
            obj.Menu();
        }

    }

}