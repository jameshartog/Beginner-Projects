/**
* Adventure Game utilizing Scanner.
*
* @author (JJH)
* @version (1.0)
*/
import java.util.Scanner;
public class Adventure_Game
{
    //purpose
    public static void main(String[] args) {
        System.out.print('\u000C');
        //Variables
        Scanner inp = new Scanner(System.in);
        String name;
        String loc;
        String pinkKey = "False";
        String bronzeKey = "False";
        String begin;
        String loop;
            
        //Name Chooser
        System.out.println("What is your name, Adventurer?");
        name = inp.next();
        System.out.print('\u000C');
        System.out.print("Oh, the great adventurer " + name + ", ");
        System.out.println("Would you like the How to Play?");
        System.out.println("1) \"Yes\"");
        System.out.println("2) \"No\"");
            
        //Expicative
        loc = inp.next();
        System.out.print('\u000C');
            
        if (loc.equals("Yes")) {
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
        else {
            
        }
        String start = "Restart";
        loc = "Start";
        while (start.equals("Restart")) {
            //Start
            if (loc.equals("Start")) {
                loop = "True";
                System.out.println("On the left is a blank white door");
                System.out.println("On the right is a blank green door");
                System.out.println("An inscription in the middle reads:");
                System.out.println();
                System.out.println("\"All this rust with age");
                System.out.println("From the small penny");
                System.out.println("To even the best copper statues\"");
                System.out.println();
                System.out.println("Which door you choose?");
                System.out.println("\"White\" or \"Green\"");
                loc = inp.next();
                System.out.print('\u000C');
            }
            //Left Doors
            else if (loc.equals("White")) {
                System.out.println("On the left is a blank red door");
                System.out.println("In the middle is a blank orange door");
                System.out.println("On the right is a blank yellow door");
                System.out.println("Which door do you choose?");
                System.out.println("\"Red\" \"Orange\" or \"Yellow\"");
                loc = inp.next();
                System.out.print('\u000C');
            }
            else if (loc.equals("Red")) {
                System.out.println("On the left is a blank pink door");
                System.out.println("In the middle is a rose door with a purple lock");
                System.out.println("Which door do you choose?");
                System.out.println("\"Pink\" or \"Rose\"");
                loc = inp.next();
                System.out.print('\u000C');
            }
            else if (loc.equals("Orange")) {
                System.out.println("There is one bronze door with a key mark on it");
                System.out.println("Enter the door (\"Y\" or \"N\")");
                loop = "True";
                String ent = inp.next();
                while (loop.equals("True")) {
                    if (ent.equals("Y")) {
                        loc = "Bronze";
                        loop = "False";
                    }
                    else {
                        System.out.println("You wait...");
                        System.out.println("Enter (\"Y\" or \"N\")");
                        ent = inp.next();
                    }
                }
                loop = "True";
                System.out.print('\u000C');
            }
            else if (loc.equals("Yellow")) {
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
            //Keys Rooms
            else if (loc.equals("Pink")) {
                System.out.println("In the middle of the room is a pink key");
                System.out.println("Do you take the key? (\"Y\" or \"N\")");
                pinkKey = inp.next();
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
            else if (loc.equals("Bronze")) {
                System.out.println("In the middle of the room is a bronze key");
                System.out.println("Do you take the key? (\"Y\" or \"N\")");
                bronzeKey = inp.next();
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
            //Lock Rooms
                
            //Death Rooms
            else if (loc.equals("Rose")) {
                System.out.println("You find yourself in front of a portal");
                System.out.println("\"Enter\" or \"Wait\"");
                loc = inp.next();
                if (loc.equals("Enter")) {
                    System.out.println("You are ripped apart piece by piece");
                    System.out.println("Games Over");
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
                        while (loop.equals("True")) {
                            if (fin.equals("Y")) {
                                System.out.println("You are ripped apart piece by piece");
                                System.out.println("Games Over");
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
                                loop = "False";
                            }
                            else {
                                System.out.println("You wait...");
                                System.out.println("Enter the Portal? (\"Y\" or \"N\")");
                                fin = inp.next();
                            }
                        }
                    }
                }
                System.out.print('\u000C');
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
            //Cheat
            else if (loc.equals("Cheat")) {
                System.out.println("Order:");
                System.out.print("White > Orange > Bronze > Key >");
                System.out.println(" Black > Green");
            }
        }
        System.out.print('\u000C');
        if (start.equals("End")) {
            System.out.println(name + " has given up to the insanity of the labrinth");
        }
        else {
            System.out.println("Please ensure commands are capitalized");
        }
        if (start.equals("Fin")) {
            System.out.println();
        }
    }
}