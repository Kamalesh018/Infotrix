import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static void display(ArrayList<Employee> al) {
        System.out.println("------------Employee List!------------");
        System.out.println(String.format("%-10s%-15s%-10s%-20s", "ID", "Name", "salary", "contact"));
        for (Employee e : al) {
            System.out.println(String.format("%-5s%-20s%-10s%-15s", e.id, e.name, e.salary, e.contact));
        }
    }

    public static void main(String[] args) {

        int id;
        String name;
        float salary;
        long contact;

        ArrayList<Employee> al = new ArrayList<>();

        File f = null;
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            f = new File("EmployeeDetails.txt");
            if (f.exists()) {
                fis = new FileInputStream(f);
                ois = new ObjectInputStream(fis);
                al = (ArrayList<Employee>) ois.readObject();
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        do {
            System.out.println("\n************Employee data List**********\n");
            System.out.println("1. Add Employee to the database\n" +
                    "2. Search for Employee\n" +
                    "3. Delete Employee details\n" +
                    "4. Display all Employee\n" +
                    "5. Exit\n");
            System.out.println("Enter your choice: ");
            Scanner sc = new Scanner(System.in);
            int ch = sc.nextInt();

            switch (ch) {
                case 1:
                    System.out.println("\nEnter the following details to ADD list:\n");
                    System.out.println("Enter ID :");
                    id = sc.nextInt();
                    System.out.println("Enter Name :");
                    name = sc.next();
                    System.out.println("Enter Salary :");
                    salary = sc.nextFloat();
                    System.out.println("Enter Contact No :");
                    contact = sc.nextLong();
                    al.add(new Employee(id, name, salary, contact));
                    try {
                        fos = new FileOutputStream(f);
                        oos = new ObjectOutputStream(fos);
                        oos.writeObject(al);
                    } catch (IOException e) {
                        System.out.println(e.getMessage());
                    }
                    display(al);
                    break;

                case 2:
                    System.out.println("Enter the Employee id to Search");
                    id = sc.nextInt();
                    int i = 0;
                    for (Employee e : al) {
                        if (id == e.id) {
                            System.out.println(e + "\n");
                            i++;
                        }
                    }
                    if (i == 0) {
                        System.out.println("Please enter the Valid Employee ID");
                    }
                    break;
                case 3:
                    System.out.println("\n Enter the Employee ID to delete from the Database");
                    id = sc.nextInt();

                    int j = 0;
                    for (Employee e : al) {
                        if (id == e.id) {
                            al.remove(e);
                            display(al);
                            j++;
                        }
                    }
                    if (j == 0) {
                        System.out.println("Please enter the Valid Employee ID");
                    }
                    break;
                case 4:
                    try {
                        al = (ArrayList<Employee>) ois.readObject();
                    } catch (ClassNotFoundException e1) {
                        System.out.println(e1);
                    } catch (Exception e1) {
                        if (al.isEmpty()) System.out.println("No data available");
                    }
                    display(al);
                    break;

                case 5:
                    try {
                        fos = new FileOutputStream(f);
                        oos = new ObjectOutputStream(fos);
                        oos.writeObject(al);
                    } catch (IOException e1) {
                        e1.printStackTrace();
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    } finally {
                        try {
                            if (fis!=null) fis.close();
                            if (ois!=null) ois.close();
                            if (fos!=null) fos.close();
                            if (oos!=null) oos.close();
                        } catch (Exception e1) {
                            e1.printStackTrace();
                        }
                    }
                    System.out.println("\nYou have chosen EXIT !! Saving Files and closing the tool.");
                    sc.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("\nEnter a correct choice from the List :");
            }
        }while(true);
    }
}
