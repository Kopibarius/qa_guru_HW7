import java.util.HashMap;

public class Main {
    public static void main(String[] arg){
        HashMap<Integer, String> clients = new HashMap<>();
        HashMapClientBase clientBase = new HashMapClientBase();

        clientBase.addClient(clients, "Egor");
        System.out.println("Добавил нового клиента " + clients);
        clientBase.addClients(clients, new String[]{"Ula", "Jora", "Nikita"});
        System.out.println("Добавил еще трёх клиентов " + clients);
        System.out.println(clientBase.findShortestClientName(clients,3));
        clientBase.deleteClient(clients,3);
        System.out.println("Удалил одного " + clients);
    }
}
