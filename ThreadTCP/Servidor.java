import java.io.BufferedReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

import javax.swing.JOptionPane;

public class Servidor {
        public static void main(String[] args) throws IOException{
            System.out.println("servidor iniciando");
            ServerSocket socketServidor = new Serversocket(5000);
            Socket socketCliente = socketServidor.accept();
            PrintWriter out = new PrintWriter (socketCliente.getOutputStream(), true);
            BufferedReader in = new BufferedReader(new InputStreamReader(socketCliente.getInputStream()));
            EscutaThread escuta = new EscutaThread(in);
            escuta.start(); 
            String entrada;
            while (true){
                entrada = JOptionPane.showInputDialog(null, "mensagem para o cliente", "Servidor",
                JOptionPane.INFORMATION_MESSAGE);
                System.out.println("Servidor" + entrada);
                out.printIn(entrada);
                 }
                }
            }
            
