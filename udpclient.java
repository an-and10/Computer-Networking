import java.io.*;
import java.net.*;

public class udpclient{


public static void main(String[] args) {
    DatagramSocket sock = null;

    try{
      sock = new DatagramSocket();

        String msg = "Hello Anand";



      byte[] buffer= msg.getBytes();
      InetAddress addr =  InetAddress.getByName("localhost");


      DatagramPacket incoming = new DatagramPacket(buffer,buffer.length,addr,5000);
      sock.send(incoming);


      System.out.println("The mess: "+msg);
    }
    catch (Exception e) {
      System.out.println("The Error:"+e);


    }
    sock.close();



  }
}
