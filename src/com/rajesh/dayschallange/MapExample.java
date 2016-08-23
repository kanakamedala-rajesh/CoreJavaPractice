package com.rajesh.dayschallange;
//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class MapExample{
    public static void main(String []argh){
    	Map<String, String> phn_dict = new HashMap<String, String>();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i = 0; i < n; i++){
            String name = in.next();
            String phone = Integer.toString(in.nextInt());
            // Write code here
            //System.out.println("name: "+name+" phone: "+phone);
            phn_dict.put(name, phone);
        }
//        System.out.println();
//        System.out.println(phn_dict.keySet());
//        System.out.println(phn_dict.values());
        while(in.hasNext()){
            String s = in.next();
            // Write code here
           // System.out.println(s);
            if(!phn_dict.containsKey(s)){
            	System.out.println("Not found");
            }
            else
            	System.out.println(s+"="+phn_dict.get(s));
            //System.out.println(phn_dict.+"="+phn_dict.get(s));
        }
        in.close();
    }
}