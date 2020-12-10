import entities.Account;
import entities.Client;
import entities.Status;
import services.*;

public class Main {
    public static void main(String[] args) {



        ClientService service = new ClientServiceImpl();
        Client client = new Client(1, "Alex Bobovich", "qwerty12345@mail.com", 791231912321L, "Cooker", 21);
        Client clientById = service.findUser(1);
        System.out.println(clientById.toString());

        Status status = new Status("sampler", "some sample");
        StatusService service_2 = new StatusServiceImpl();
        // service.delete(status);

        Account account = new Account(12,22, "1111111111", 123.25);
        AccountService service_1 = new AccountServiceImpl();
       // service.delete(account);

        Client clientByPhone = service.findPhone(791231912321L);
        System.out.println(clientByPhone.toString());

        service.save(client);

        service.update(client);

        service.delete(client);


    }
}