package com.tka.june12;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Example
{ 
   public static void main(String[] args)throws IOException
   {
	   String filepath="C:\\Users\\udpat\\OneDrive\\Desktop\\Certificates\\student.ser";
	   FileOutputStream fos=null;
	   ObjectOutputStream oos=null;
	   Student s=null;
	   s=new Student(1,"UD Patil",123456);
	   fos=new FileOutputStream(filepath);
	   oos = new ObjectOutputStream (fos);
	   oos.writeObject(s);
	   System.out.println("Object written to file successfully");
	   oos.flush();
	   oos.close();
	   fos.close();
   }
}
