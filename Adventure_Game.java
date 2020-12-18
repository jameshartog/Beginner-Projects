/**
* Adventure Game utilizing Scanner.
*
* @author (JJH)
* @version (1.0)
*/
import java.util.Scanner;
public class Adventure_Game
{
    //Methods
    public static Scanner inp = new Scanner(System.in);
    public static String loc;
    public static String name;
    public static String start = "Restart";
    public static String loop = "True";
    public static String pinkKey = "False";
    public static String bronzeKey = "False";
    public static String begin;
    static void howto() {
        System.out.println("The Labrinth");
        System.out.println("Version 1.0");
        System.out.print("Words in quotation marks should");
        System.out.println(" be entered as below");
        System.out.println("");
        System.out.println("\"Command\" --> Command");
        System.out.println("Find the Key then the exit to escape");
        System.out.println("Enter anything to continue");
        String cont = inp.next();
        System.out.print('\u000C');
    }
    static void start() {
        System.out.println("On the left is a blank Gold door");
        System.out.println("On the right is a blank Green door");
        System.out.println("An inscription in the middle reads:");
        System.out.println();
        System.out.println("\"All rusts with age");
        System.out.println("From the small penny");
        System.out.println("To even the best copper statues\"");
        System.out.println();
        System.out.println("Which door you choose?");
        System.out.println("\"Gold\" or \"Green\"");
        loc = inp.next();
        System.out.print('\u000C');
    }
    
    //3 room
    public static String optionL;
    public static String optionM;
    public static String optionR;
    static void rooms3() {
        System.out.println("On the left is a " + optionL + " door");
        System.out.println("In the middle is a " + optionM + " door");
        System.out.println("On the right is a " + optionR + " door");
        System.out.println("Which door do you choose?");
        System.out.print("\"" + optionL + "\" \"" + optionM + "\"");
        System.out.println("or \"" + optionR + "\"");
        loc = inp.next();
        System.out.print('\u000C');
    }
    
    //2 room
    static void rooms2() {
        System.out.println("On the left is a " + optionL + " door");
        System.out.println("In the middle is a " + optionR + " door");
        System.out.println("Which door do you choose?");
        System.out.println("\"" + optionL + "\" \"" + optionR + "\"");
        loc = inp.next();
        System.out.print('\u000C');
    }
    //key room entrance
    static void roomkey() {
        loop = "True";
        System.out.print("There is one " + optionM);
        System.out.println(" door with a key mark on it");
        System.out.println("Enter the door (\"Y\" or \"N\")");
        String ent = inp.next();
        
        do {
            if (ent.equals("Y")) {
                loc = optionM;
                loop = "False";
            }
            else {
                System.out.println("You wait...");
                System.out.println("Enter (\"Y\" or \"N\")");
                ent = inp.next();
            }
        }
        while (loop.equals("True"));
        
        loop = "True";
        System.out.print('\u000C');
    }
    
    //Keys
    public static String pickup;
    static void roomK() {
        System.out.println("In the middle of the room is a " + optionM + " key");
        System.out.println("Do you take the key? (\"Y\" or \"N\")");
        pickup = inp.next();
        System.out.println("A portal opens in front of you");
        System.out.println("Do you wish to enter? (\"Y\" or \"N\")");
        begin = inp.next();
        loop = "True";
        while (loop.equals("True")) {
            if (begin.equals("Y")) {
                loc = "Start";
                loop = "False";
            }
            else {
                System.out.println("Nothing happens");
                System.out.println("Do you wish to enter the portal?");
                begin = inp.next();
            }
        }
        loop = "True";
        System.out.print('\u000C');
    }
    
    //empty room (only one)
    static void roomY() {
        System.out.println("The room is empty");
        System.out.println("Return? (\"Y\" or \"N\")");
        String ret = inp.next();
        loop = "True";
        while (loop.equals("True")) {
             if (ret.equals("Y")) {
                 loc = "White";
                 loop = "False";
             }
             else {
                 System.out.println("You wait...");
                 System.out.println("Return? (\"Y\" or \"N\")");
                 ret = inp.next();
             }
        }
        loop = "True";
        System.out.print('\u000C');
    }
    
    //death room
    static void roomD() {
        System.out.println("You find yourself in front of a portal");
        System.out.println("\"Enter\" or \"Wait\"");
        loc = inp.next();
        if (loc.equals("Enter")) {
            death = 1;
            dead();
        }
        else {
            System.out.println("You wait...");
            System.out.println("Enter the Portal? (\"Y\" or \"N\")");
            String surv = inp.next();
            if (surv.equals("Y")) {
                loc = "Start";
            }
            else {
                System.out.println("You wait...");
                System.out.println("Enter the Portal? (\"Y\" or \"N\")");
                String fin = inp.next();
                loop = "True";
                if (fin.equals("Y")) {
                    death = 1;
                    dead();
                }
                else {
                    death = 2;
                    dead();
                }
            }
        }
        System.out.print('\u000C');
    }
    
    //death options
    public static int death;
    static void dead() {
        switch (death) {
            case 1:
                System.out.println("You are ripped apart piece by piece");
                break;
            case 2:
                System.out.println("You give into starvation and pass");
                break;
        }
        System.out.println("Game Over");
        System.out.println("Try Again? \"Y\" or \"N\"");
        String die1 = inp.next();
        if (die1.equals("Y")) {
            start = "Restart";
            loc = "Start";
            pinkKey = "False";
            bronzeKey = "False";
        }
        else {
            start = "End";
        }
    }
    
    //exit room
    
    
    public static void main(String[] args) {
        System.out.print('\u000C');
        
        //Open
        System.out.println("What is your name, Adventurer?");
        name = inp.next();
        System.out.print('\u000C');
        System.out.print("Oh, the great adventurer " + name + ", ");
        System.out.println("Would you like the How to Play?");
        System.out.println("For Yes:\"How\"");
        System.out.println("For No: \"No\"");
        loc = inp.next();
        System.out.print('\u000C');
        
        //How to play
        if (loc.equals("How")) {
            howto();
        }
        
        //Location set
        loc = "Start";
        while (start.equals("Restart")) {
            //Room 1
            if (loc.equals("Start")) {
                start();
            }
            //Left Side
            else if (loc.equals("Gold")) {
                optionL = "Red";
                optionM = "Orange";
                optionR = "Yellow";
                rooms3();
            }
            else if (loc.equals("Red")) {
                optionL = "Pink";
                optionR = "Rose";
                rooms2();
            }
            else if (loc.equals("Orange")) {
                optionM = "Bronze";
                roomkey();
            }
            else if (loc.equals("Yellow")) {
                roomY();
            }
            //Keys Rooms
            else if (loc.equals("Pink")) {
                optionM = "Pink";
                roomK();
                if (pickup.equals("Y")) {
                    pinkKey = "Y";
                }
            }
            else if (loc.equals("Bronze")) {
                optionM = "Bronze";
                roomK();
                if (pickup.equals("Y")) {
                    bronzeKey = "Y";
                }
            }
            //Death Room
            else if (loc.equals("Rose")) {
                roomD();
            }
            //Exit
            else if (loc.equals("Green")) {
                System.out.println("There is one door with a bronze lock");
                if (bronzeKey.equals("Y")) {
                    System.out.println("You insert the bronze key into the hole");
                    System.out.println("The door opens and a bright light fills the room...");
                    System.out.println("THE END");
                    start = "Fin";
                }
                else {
                    if (pinkKey.equals("Y")) {
                        System.out.println("The pink key does not fit");
                    }
                    else {
                        System.out.println("You have no key");
                    }
                    System.out.println("You return to the beginning...");
                    String sad = inp.next();
                    loc = "Start";
                    System.out.print('\u000C');
                }
            }
        }
        System.out.print('\u000C');
        if (start.equals("End")) {
            System.out.println(name + " has given up to the insanity of the labrinth");
        }
        else {
            System.out.println("You still lost");
        }
        if (start.equals("Fin")) {
            System.out.println();
        }
    }
}