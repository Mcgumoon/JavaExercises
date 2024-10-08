package lab7;

import java.util.Scanner;

import lab7.LinkedBinarySearchTree.LinkedBST;

public class Menu{
	private static LinkedBinarySearchTree.LinkedBST<Integer> bst = new LinkedBinarySearchTree.LinkedBST<Integer>();

    public static void mainMenu(){
        System.out.println("\nPlease input a integer number 0-5:");
        System.out.println("    1: Insert a node.");
        System.out.println("    2: Delete a node.");
        System.out.println("    3: Search a node.");
        System.out.println("    4: Display BST.");
        System.out.println("    0: Exit.");
        
        Scanner scanner = new Scanner(System.in);

        while(scanner.hasNextInt())
        {
            if (scanner.hasNextInt()){
                switch (scanner.nextInt()){
                    case 0:
                        System.out.println("Exit system!");
                        return;
                    case 1:
                        System.out.println("Insert a new node.");
                        insertMenu();
                        break;
                    case 2:
                        System.out.println("Delete a node.");
                        deleteMenu();
                        break;
                    case 3:
                        System.out.println("Search a node.");
                        searchMenu();
                        break;
                    case 4:
                    	bst.display();
                        break;
                    default:
                        System.out.println("Invalid input, try again!");
                        scanner.next();
                        break;
                }
                System.out.println("\nPlease input a integer number 0-5:");
                System.out.println("    1: Insert a new node.");
                System.out.println("    2: Delete a node.");
                System.out.println("    3: Search a node.");
                System.out.println("    4: Display BST.");
                System.out.println("    0: Exit.");
            }
            else{
                System.out.println("Invalid input, try again!");
                scanner.next();
            }
        }
    }

    public static void insertMenu(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input a node (positive integer number) to be inserted (input <= 0: return to Main Menu):");

        while(scanner.hasNext())
        {
            if (scanner.hasNextInt()){
                int num = scanner.nextInt();
                if(num <= 0)
                    break;

                if (bst.insert(num)) {
                	bst.printTreeGraph();

                    System.out.println("\n");
                    System.out.println("Please input a node (positive integer number) to be inserted (input <= 0: return to Main Menu):");

                } else {
                	System.out.println("Failed to insert a new node, try again!");
                }
                   
            }
            else{
                System.out.println("Invalid input, try again!");
                scanner.next();
            }
        }
    }


    public static void searchMenu(){
        System.out.println("Please input a node (positive integer number) to be searched (input <= 0: return to Main Menu):");
        Scanner scanner = new Scanner(System.in);

        while(scanner.hasNext())
        {
            if (scanner.hasNextInt()){
                int num = scanner.nextInt();
                if(num <= 0)
                    break;

                if (bst.search(num))
                    System.out.println("Found it!");
                else{
                    System.out.println("Can not find this node, try again!");
                  
                }
                 bst.printTreeGraph();
                System.out.println("\n");
                System.out.println("Please input a node (positive integer number) to be searched (input <= 0: return to Main Menu):");
            }
            else{
                System.out.println("Invalid input, try again!");
                scanner.next();
            }
        }
    }

    public static void deleteMenu(){
        System.out.println("Please input a node (positive integer number) to be deleted (input <= 0: return to Main Menu):");
        Scanner scanner = new Scanner(System.in);

        while(scanner.hasNext())
        {
            if (scanner.hasNextInt()){
                int num = scanner.nextInt();
                if(num <= 0)
                    break;

                if (bst.delete(num)) {
                	bst.printTreeGraph();
                    System.out.println("\n");
                    System.out.println("Please input a node (positive integer number) to be deleted (input <= 0: return to Main Menu):");

                } else {
                    System.out.println("Failed to delete this node, try again!");
                }
                    
            }
            else{
                System.out.println("Invalid input, try again!");
                scanner.next();
            }
        }
    }
    
    public static void main(String[] args) {
    	mainMenu();
    }

}
