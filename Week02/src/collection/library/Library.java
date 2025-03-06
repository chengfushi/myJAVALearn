package collection.library;

import java.util.ArrayList;
import java.util.Scanner;

public class Library {
    private ArrayList<Book> books = new ArrayList<>();
    private Scanner scan = new Scanner(System.in);

//    添加图书，添加图书时，编号需要唯一，添加成功，返回到菜单。
    public void addBook(Book book) {

        //遍历集合，判断编号是否存在
        boolean flag = false;
        for (Book b : books) {
            if (b.getId().equals(book.getId())) flag = true;
        }
        if (flag) System.out.println("编号已存在");
        else books.add(book);

    }
//    查询图书，显示所有图书信息，然后返回到菜单。
    public void showBooks(){
        for (Book b : books) {
            System.out.println("编号：" + b.getId() + " 书名：" + b.getName() + " 作者：" + b.getAuthor() + " 价格：" + b.getPrice());
        }
    }

//    根据书名，查询单本图书信息，显示信息后，返回到菜单。
    public void findBook(String name) {
        boolean flag = false;
        for (Book b : books) {
            if (b.getName().equals(name)) {
                System.out.println("编号：" + b.getId() + " 书名：" + b.getName() + " 作者：" + b.getAuthor() + " 价格：" + b.getPrice());
                flag = true;
            }
        }
        if (!flag) System.out.println("未找到图书");
    }
//    删除图书，通过编号删除，删除成功后，返回到菜单。
    public void deleteBook(String id) {
        boolean flag = false;
        for (Book b : books) {
            if (b.getId().equals(id)) {
                books.remove(b);
                flag = true;
            }
        }
        if (!flag) System.out.println("未找到图书");
    }
//    修改图书的信息，但编号不可以修改，修改成功后，返回到菜单。
    public void updateBook(String id) {
        for (Book b : books) {
            if (b.getId().equals(id)) {
                b.setName(scan.nextLine());
                b.setAuthor(scan.nextLine());
                b.setPrice(scan.nextDouble());
            }
        }
    }

}
