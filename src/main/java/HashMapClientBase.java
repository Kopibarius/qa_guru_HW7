import java.util.HashMap;

public class HashMapClientBase {
    protected Integer i = 0;

    public void addClient (HashMap <Integer, String> table, String clientName){
        i++;
        table.put(i, clientName);
    }

    public void addClients (HashMap <Integer, String> table, String[] clientName){
        for (String s : clientName) {
            i++;
            table.put(i, s);
        }
    }

    public void deleteClient (HashMap<Integer, String> table, Integer clientId){
        table.remove(clientId);
    }

    public String findShortestClientName (HashMap<Integer, String> table, Integer clientId){
        return table.get(clientId);
    }
}
