package librarypackage;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

    public class library {

        static List<library2> books = new ArrayList<library2>();
        static Map<Integer, ArrayList<library1>> hm = new HashMap<Integer, ArrayList<library1>>();

        public static void main(String[] args)throws Exception {
            addIssueDetails();
            System.out.println("Library Management System");
            System.out.println("Press 1 to add Book");
            System.out.println("Press 2 to issue a book");
            System.out.println("Press 3 to return a book");
            System.out.println("Press 4 to print the book details");
            System.out.println("Press 5 to print complete issue detais");
            System.out.println("Press 6 to exit");
            Scanner c = new Scanner(System.in);
            int choice = c.nextInt();
            do {
                switch (choice) {
                    case 1:
                        addBook();
                        break;
                    case 2:
                        issueBook();
                        break;
                    case 3:
                        returnBook();
                        break;
                    case 4:
                        printBookDetails();
                        break;
                    case 5:
                        printCompleteIssueDetails();
                        break;
                    case 6:
                        System.exit(0);
                    default:
                        System.out.println("Invalid input");
                        break;
                }
                c = new Scanner(System.in);
                choice = c.nextInt();
            } while (choice > 0 && choice < 6);
        }

        private static void printCompleteIssueDetails() {
            for (Map.Entry<Integer, ArrayList<library1>> entry : hm
                    .entrySet()) {

                for (library1 b : entry.getValue()) {
                    System.out.println(entry.getKey() + " " + b.getBookNumber()
                            + " " + b.getName() + " " + b.getNoOfBookIssued()
                            + " " + b.getIssueDate() + " " + b.getReturnDate());
                }
            }
        }

        private static void printBookDetails() {
            for (library2 b:books) {
                System.out.print(b.getBookNumber() + " " + b.getBookName() + " "
                        + b.getCount() + " " + b.getPrice());
            }
        }

        private static void returnBook() {
            System.out.println("Enter userId & bookId");
            Scanner c = new Scanner(System.in);
            int id = c.nextInt();
            int bookId = c.nextInt();
            List<library1> bd = hm.get(id);
            for (library1 b : bd) {
                if (b.getBookNumber() == bookId) {
                    Date issueDate = b.getIssueDate();
                    Date todayDate = new Date();

                    long diff = todayDate.getTime() - issueDate.getTime();

                    long diffDays = diff / (24 * 60 * 60 * 1000);

                    if (diffDays > 10) {
                        int fine = (int) (diffDays - 10);
                        fine = fine * 10;
                        System.out.println("Total Fine " + fine + " Rs.");
                    }
                }
            }

        }

        private static void addIssueDetails() {
            library1 bd1 = new library1();
            library1 bd2 = new library1();
            library1 bd3 = new library1();
            library1 bd4 = new library1();
            ArrayList<library1> list1 = new ArrayList<library1>();
            ArrayList<library1> list2 = new ArrayList<library1>();
            ArrayList<library1> list3 = new ArrayList<library1>();
            ArrayList<library1> list4 = new ArrayList<library1>();

            list1.add(bd1);
            list2.add(bd2);
            list3.add(bd3);
            list4.add(bd4);
            hm.put(100, list1);
            hm.put(101, list2);
            hm.put(103, list3);
            hm.put(104, list4);

        }

        private static void issueBook() {
            System.out.println("Enter userId,Booknumber, name and price");
            Scanner c = new Scanner(System.in);
            int studentId = c.nextInt();
            Scanner c1 = new Scanner(System.in);
            int bookNumber = c1.nextInt();
            Scanner c2 = new Scanner(System.in);
            String name = c2.nextLine();
            Scanner c3 = new Scanner(System.in);
            String issueDate = c3.nextLine();
            library1 newIssuedBook = new library1();
            newIssuedBook.setName(name);
            newIssuedBook.setBookNumer(bookNumber);

            ArrayList<library1> l=new ArrayList<library1>();


            SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yyyy");

            try {

                Date date = formatter.parse(issueDate);
                newIssuedBook.setIssueDate(date);

            } catch (ParseException e) {
                e.printStackTrace();
            }


            List<library1> list = hm.get(name);
            for (library1 b : list) {
                int value = b.getNoOfBookIssued();
                newIssuedBook.setNoOfBookIssued(++value);
                l.add(newIssuedBook);
                if (value > 2)
                    System.out.println("You already issued max(2) books");
                else
                    hm.put(234, l);
            }
        }

        private static void addBook() {
            System.out.println("Enter Booknumber, name and price");
            Scanner c1 = new Scanner(System.in);
            int bookNumber = c1.nextInt();
            String name = c1.nextLine();
            Double price = c1.nextDouble();

            library2 book = new library2();
            books.add(book);

        }

    }





