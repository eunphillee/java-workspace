package io.day13;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

// socket (java.net 패키지)
// ㄴ 네트워크 통신의 양끝 종단점 (end point)
// ㄴ 일반적으로 서버/클라이언트 역활에 따라. 소켓 설정이 다릅니다. 
// ㄴ 서버는 서버를 제공. 클라이언트는 서비스를 사용하기 위해 서버 연결 요청 합니다. 
// ㄴ 서버와 클라이언트 간의 데이터 송수신 테스트 합니다. 
public class ServerC01 {

    public static void main(String[] args) {
        
        ServerSocket serverSocket = null;
        Socket socket = null;
        try {

            serverSocket = new ServerSocket();
            serverSocket.bind(new InetSocketAddress("loacalhost",5050));
            System.out.println("[서버] : 연결 요청을 기다리는 중입니다. ");
            socket = serverSocket.accept();
            InputStream is = socket.getInputStream();
            OutputStream os = socket.getOutputStream();
            sc = new Scanner(is);
            PrintWriter pw = new PrintWriter(os, true);
            pw.println("From 서버 : 연결이 성공하였습니다.");
            System.out.println("연결 승인 하였습니다.");
            String message = sc.nextline();
            System.out.println(message);

            
        } catch (IOException e) {
          System.out.println("예외 : "+e.getMessage());
        }finally {
            try{
                socket.close(); sc.close();
            }catch (Exception e) {    }
        }
}
}

