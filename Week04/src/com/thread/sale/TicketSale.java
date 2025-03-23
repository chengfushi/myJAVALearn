package com.thread.sale;

/**
 *@Description Use multiple threads to sale tickets. Three threads to sale 100 tickets.
 *@date 2025/3/23 16:36
 *@auther Chengfu Shi
 */
public class TicketSale {
    public static void main(String[] args) {
        SaleTicket1 saleTicket1 = new SaleTicket1();
        SaleTicket1 saleTicket2 = new SaleTicket1();
        SaleTicket1 saleTicket3 = new SaleTicket1();
        Thread thread1 = new Thread(saleTicket1);
        Thread thread2 = new Thread(saleTicket2);
        Thread thread3 = new Thread(saleTicket3);
        thread1.start();
        thread2.start();
        thread3.start();
        
        
        
    }
}


class SaleTicket1 implements Runnable{
    
    private static int ticketNumber = 100;
    
    @Override
    public void run() {
        while (true) {
            if (ticketNumber <= 0) {
                System.out.println("the tickets is null");
                break;
            }
            
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            
            System.out.println(Thread.currentThread().getName() + " is sale 1 ticket, the ticket number is " + ticketNumber--);
        }
    }
}
