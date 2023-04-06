import java.io.BufferedReader;


public class EscutaThread extends {
        BufferedReader in;
        public Escuta Thread(BufferedReader in) {
            this.in = in;
        }
        public void run(){
            String entrada;
            try {
                while((entrada = in.readLine()) != null){
                    System.out.println("recebi " + entrada);
                }
            } catch (Exception e) {
            }
    }