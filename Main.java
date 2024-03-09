/* Contact book using linked list - Louisa Mandy Halim - 2702325552 - Data Structure
* 1. create a contact book program that manage your friends contact
* (name, phone number, email ) -check
* 2. input : The program prompts as shown in the figure
* 3. Output : The results of the operations
*
* Due before week 6  */

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] oui) {

        LinkedList<String> name = new LinkedList<String>();
        LinkedList<String> number = new LinkedList<String>(); // declare the number to string, so it could fit more characters
        LinkedList<String> email = new LinkedList<String>();

        while (true){ // use while true to keep the program running until user quits program

            System.out.println(" ");
            System.out.println("Contact Book Program : ");
            System.out.println("(A)dd \n(D)elete \n(E)mail Search \n(P)rint List \n(S)earch \n(Q)uit ");
            System.out.println(" ");
            System.out.println("enter a choice : ");

            Scanner mandy = new Scanner(System.in);  // Create a Scanner object
            String user_input = mandy.nextLine(); // user input


            switch(user_input) {
                case "A": // add ( ask the persons name and number ) output example " Mandy : 09230752819020

                    System.out.println("Enter Name : ");
                    String input_name = mandy.next();

                    System.out.println("Enter Phone Number : ");
                    String input_number = mandy.next();

                    System.out.println("Enter Email : ");
                    String input_email = mandy.next();

                    name.add(input_name);
                    number.add(input_number);
                    email.add(input_email);

                    System.out.println(" ");
                    System.out.println("Name : " + name);
                    System.out.println("Number : " + number);
                    System.out.println("Email : " + email);
                    System.out.println(" ");

                    break;

                case "D": // delete

                    System.out.println(" ");
                    System.out.println("Name : " + name);
                    System.out.println(" ");
                    System.out.println("Enter the name that you want to delete from the phone book : ");
                    System.out.println(" ");

                    String Delete = mandy.next();
                    if (name.contains(Delete)) { // Check if the input is a name in the list
                        int index = name.indexOf(Delete); // Get the index of the name
                        name.remove(index); // remove / delete the name from phonebook
                        number.remove(index); // deletes number
                        email.remove(index); // deletes email
                    } else {
                        System.out.println("Invalid input. Please enter a valid name or index.");
                    }
                    break;


                case "E": // email search
                    System.out.println(" ");
                    System.out.println("Here are the available names to search: ");
                    System.out.println(name);

                    System.out.println(" ");
                    System.out.println("Who's email would you like to search?");

                    String search_name = mandy.next();
                        if (name.contains(search_name)) { // Check if the input is a name in the list
                            int index = name.indexOf(search_name); // Get the index of the name
                            System.out.println("Email : " + email.get(index)); // Print the email corresponding to the index
                        } else {
                                System.out.println("Invalid input. Please enter a valid name or index.");
                        }
                        break;


                case "P": //print list:

                        System.out.println(" ");
                        System.out.println("Name : " + name);
                        System.out.println("Number : " + number);
                        System.out.println("Email : " + email);
                        System.out.println(" ");


                        break;

                case "S": // search

                    System.out.println(" ");
                    System.out.println("Here are the available names to search: ");
                    System.out.println(name);

                    System.out.println(" ");
                    System.out.println("Who's information would you like to search?");

                    String search = mandy.next();
                    if (name.contains(search)) { // Check if the input is a name in the list
                        int index = name.indexOf(search); // Get the index of the name

                        System.out.println(" ");
                        System.out.println("Name : " + name.get(index));
                        System.out.println("Number : " + number.get(index));
                        System.out.println("Email : " + email.get(index)); // Print the rest of the info corresponding to the index

                    } else {
                        System.out.println("Invalid input. Please enter a valid name or index.");
                    }
                    break;

                case "Q": // quit
                    System.out.println("Thank you for using this program, goodbyeeee ");
                    return;
        }


        }


    }
}