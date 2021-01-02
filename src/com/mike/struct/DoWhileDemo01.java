package com.mike.struct;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

public class DoWhileDemo01 {
    public static void main(String[] args) {
        int i = 0;
        int sum = 0;
        do {
            sum = sum + i;
            i++;
        }while (i<=100);
        //while先判断后执行，dowhile先执行后判断；
        //dowhile保证至少执行一次
        System.out.println(sum);
    }


}
