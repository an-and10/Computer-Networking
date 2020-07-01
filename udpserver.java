import java.io.*;
import java.net.*;

public class udpserver{


public static void main(String[] args) {

    DatagramSocket sock = null;

    try{
      sock = new DatagramSocket(5000);

      byte[] buffer= new byte[30];
      DatagramPacket incoming = new DatagramPacket(buffer,buffer.length);
      sock.receive(incoming);
      byte[] data = incoming.getData();

      String msg = new String(data);
      System.out.println("The mess: "+msg);
    }
    catch (Exception e) {
      System.out.println("The Error:"+e);


    }
    sock.close();



  }
}
