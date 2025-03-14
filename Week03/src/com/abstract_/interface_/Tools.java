package com.abstract_.interface_;

public class Tools {

    public void work(UsbInterface usbInterface){
        usbInterface.start();
        usbInterface.close();
    }
}
