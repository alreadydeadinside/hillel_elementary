import entities.Account;
import entities.Client;
import entities.Status;
import services.AccountService;
import services.ClientService;
import services.StatusService;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        ClientService clientService = new ClientService();
        AccountService accountService = new AccountService();
        StatusService statusService = new StatusService();

        List<Client> clients = clientService.getAll();
        List<Account> accounts = accountService.getAll();
        List<Status>  statuses = statusService.getAll();

        List<Client> clientsWherePhone = clientService.getClientsWherePhone(380956666666L);
        List<String> accountServiceValueBiggerThan = accountService.getValueBiggerThan(1234.0);
        List<Client> clientsWhereIdSame = clientService.getClientsWhereIdSame();
        List<String> all = clientService.getValuesFromAccountsAndClients();

        for (int i = 0; i < all.size(); i++) {
            System.out.println(all.get(i));
        }

        Client client = new Client("qwerty123", "qwerty123@gmail.com", 38095666666L, "sample", 11);
        Account account = new Account(22, "1234232142214", 232131);
        Status status = new Status("some alias", "some description");

        clientService.insertValues(client);
        accountService.insertValues(account);
        statusService.insertValues(status);

        Client client123 = new Client(8, "qwertyy", "qwertyy@gmail.com", 3809923292131L, "sample", 101);
        Account account123 = new Account(9, 5, "23123213", 11111111.11);
        Status status123 = new Status(11, "idk", "some another description");

        clientService.update(client);
        accountService.updateInfo(account);
        statusService.update(status);
        clientService.delete(10);
        accountService.deleteInfo(21);
        statusService.delete(4);
    }
}