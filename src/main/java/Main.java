import entities.Account;
import entities.Client;
import services.ClientService;
import services.ClientServiceImpl;

public class Main {
    public static void main(String[] args) {
        Client client = new Client(0, "sample", "sample@ukr.net", 3806335122551L, "sample descriptiom", 19);
        ClientService service = new ClientServiceImpl();

        service.save(client);
    }
}
