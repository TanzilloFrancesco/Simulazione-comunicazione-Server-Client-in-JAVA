public class server{
    private String indirizzoIP;
    private String porta;
    
    public server(){
        this.indirizzoIP = "12.0.33.21"; //indirizzo IP pubblico di classe A
        this.porta = "10000";
    }
    
    public void accept(){
        System.out.println("SERVER : Richiesta accettata, connessione effettuata con successo");
    }
    
    public void recieve(){
        System.out.println("SERVER : Messaggio ricevuto con successo");
    }
    
    public void close(String client){
        String c = client;
        System.out.printf("\nSERVER : Comunicazione con il client %s chiusa, invio ACK = 1\n", c);
    }
    
    public String getIndirizzoIP(){
        return this.indirizzoIP;
    }
    
    public String getPorta(){
        return this.porta;
    }
}