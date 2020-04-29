import java.util.Scanner;
public class Main{
    
    public static void main(String args[]){
    String indirizzoIP, porta;
    int c;
    
    server s = new server();
    
    Scanner tast = new Scanner(System.in);
    System.out.println("inserisci l'indirizzo IP del primo client = ");
    indirizzoIP = tast.nextLine();
    System.out.println("inserisci la porta su cui vuoi comunicare = ");
    porta = tast.nextLine();
    client c1 = new client(indirizzoIP, porta);
    c1.connect();
    s.accept();
    
    System.out.println("inserisci l'indirizzo IP del secondo client = ");
    indirizzoIP = tast.nextLine();
    System.out.println("inserisci la porta su cui vuoi comunicare = ");
    porta = tast.nextLine();
    client c2 = new client(indirizzoIP, porta);
    c2.connect();
    s.accept();
    
    System.out.println("inserisci l'indirizzo IP del terzo client = ");
    indirizzoIP = tast.nextLine();
    System.out.println("inserisci la porta su cui vuoi comunicare = ");
    porta = tast.nextLine();
    client c3 = new client(indirizzoIP, porta);
    c3.connect();
    s.accept();
    
    System.out.println("\nSimulazione trasmissione con il client 1\n");
    do{
        c = c1.write();
        s.recieve();
    }while(c == 1);
    c1.close();
    s.close("primo client");
    
    System.out.println("\nSimulazione trasmissione con il client 2\n");
    do{
        c = c2.write();
        s.recieve();
    }while(c == 1);
    c2.close();
    s.close("secondo client");
    
    System.out.println("\nSimulazione trasmissione con il client 3\n");
    do{
        c = c3.write();
        s.recieve();
    }while(c == 1);
    c3.close();
    s.close("terzo client");
}
}