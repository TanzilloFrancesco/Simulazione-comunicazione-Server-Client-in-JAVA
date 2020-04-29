import java.util.Scanner;

public class client{
    private String indirizzoIP;
    private String porta;
    
    public client(String indirizzoIP, String porta){
        System.out.printf("\nCLIENT : Creazione socket in corso\nIndirizzo IP e numero di porta associati\n Indirizzo IP (client) = %s\t numero di porta (client) = %s\n", indirizzoIP, porta);
        this.indirizzoIP = indirizzoIP; 
        this.porta = porta;
    }
    
    public void connect(){
        server s = new server();
        System.out.printf("\nCLIENT : Richiesta di apertura comunicazione con il server INVIO(SYN = 1 --- ACK = 0)\n indirizzo IP (Server) = %s\t numero di porta (Server) = %s\n", s.getIndirizzoIP(), s.getPorta());
    }
    
    public void inoltroACK(){
        System.out.printf("CLIENT : INVIO (ACK = 1)\n");
    }
    
    public int write(){
        String dato;
        Scanner t = new Scanner(System.in);
        System.out.printf("\nSERVER : inserire l'operazione desiderata = ");//scrivere "quit" per uscire dalla comunicazione
        dato = t.nextLine();

        System.out.println("\t\t\t\t SCRIVERE <quit> SE SI VUOLE TERMINARE LA COMUNICAZIONE");
        if(dato.equals("quit")){
            return 0;
        }else{
            return 1;
        }
    }
    
    public void close(){
        System.out.println("CLIENT : Richiesta di chiusura della comunicazione invio FIN = 1");
    }
}