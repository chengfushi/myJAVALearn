package collection.library;

import java.util.Scanner;

/*
利用面向对象的思想设计一个图书管理系统。
图书的属性有：编号，书名，作者，价格。要求提供如下功能：
1、提供操作菜单，可以选择要进行的操作。
2、可以添加图书，添加图书时，编号需要唯一，添加成功，返回到菜单。
3、可以查询图书，显示所有图书信息，然后返回到菜单。
4、可以根据书名，查询单本图书信息，显示信息后，返回到菜单。
5、可以删除图书，通过编号删除，删除成功后，返回到菜单。
6、可以修改图书的信息，但编号不可以修改，修改成功后，返回到菜单。
7、可以退出系统，结束程序运行。
*/
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Library library = new Library();

        boolean exit = false;

        while (!exit) {
            System.out.println("1.添加图书 2.查询图书 3.根据书名查询图书 4.删除图书 5.修改图书 6.退出");

            int choice = scan.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("请输入图书信息：");
                    Book book = new Book(scan.nextLine(), scan.nextLine(), scan.nextLine(), scan.nextDouble());
                    library.addBook(book);
                    break;
                case 2:
                    library.showBooks();
                    break;
                case 3:
                    System.out.println("请输入书名：");
                    library.findBook(scan.nextLine());
                    break;
                case 4:
                    System.out.println("请输入编号：");
                    library.deleteBook(scan.nextLine());
                    break;
                case 5:
                    System.out.println("请输入编号：");
                    library.updateBook(scan.nextLine());
                    break;
                case 6:
                    exit = true;
                    break;
            }

        }
    }
}
