package services;

import entities.Client;
import utils.Database;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;

public class ClientService {

    private static final String CREATE = "INSERT INTO clients (clientname, clientemail, clientphone, clientabout) VALUES (?, ?, ?, ?)";
    private static final String READ = "SELECT * FROM clients";
    private static final String UPDATE = "UPDATE clients SET clientname = ?, clientemail = ?, clientphone = ?, clientabout = ? WHERE id = ?";
    private static final String DELETE = "DELETE FROM clients WHERE id = ?";
    private static final String GET_VALUES_FROM_ACCOUNTS_AND_CLIENTS = "SELECT c.clientname, c.clientemail, s.alias FROM clients c INNER JOIN client_statuses cs ON c.id = cs.client_id INNER JOIN statuses s ON cs.status_id = s.id WHERE age > 18";
    private static final String GET_CLIENTS_WHERE_PHONE = "SELECT * FROM clients WHERE clientphone = ?";
    private static final String GET_CLIENTS_WHERE_ID_SAME = "SELECT c.* FROM clients c INNER JOIN accounts a ON c.id = a.client_id";

    public void insertValues(Client client) {
        try (Connection connection = Database.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(CREATE)) {
            preparedStatement.setString(1, client.getName());
            preparedStatement.setString(2, client.getEmail());
            preparedStatement.setLong(3, client.getPhone());
            preparedStatement.setString(4, client.getAbout());
            preparedStatement.setInt(5, client.getAge());
            preparedStatement.execute();
            connection.commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Client> getAll() {
        ArrayList<Client> clients = new ArrayList<>();
        try (Connection connection = Database.getConnection();
             Statement statement = connection.createStatement()) {
            ResultSet resultSet = statement.executeQuery(READ);
            while (resultSet.next()) {
                Client client = new Client();
                client.setName(resultSet.getString("clientname"));
                client.setEmail(resultSet.getString("clientemail"));
                client.setPhone(resultSet.getLong("clientphone"));
                client.setAbout(resultSet.getString("clientabout"));
                client.setAge(resultSet.getInt("age"));
                clients.add(client);
            }
            connection.commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return clients;
    }

    public void update(Client client) {
        try (Connection connection = Database.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(UPDATE)) {
            preparedStatement.setString(1, client.getName());
            preparedStatement.setString(2, client.getEmail());
            preparedStatement.setLong(3, client.getPhone());
            preparedStatement.setString(4, client.getAbout());
            preparedStatement.setInt(5, client.getAge());
            preparedStatement.setInt(6, client.getId());
            preparedStatement.execute();
            connection.commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void delete(int id) {
        try (Connection connection = Database.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(DELETE)) {
            preparedStatement.setInt(1, id);
            preparedStatement.execute();
            connection.commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Client> getClientsWherePhone(long phone) {
        ArrayList<Client> clients = new ArrayList<>();
        try (Connection connection = Database.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(GET_CLIENTS_WHERE_PHONE)) {
            preparedStatement.setLong(1, phone);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                Client client = new Client(
                        resultSet.getString("clientname"),
                        resultSet.getString("clientemail"),
                        resultSet.getLong("clientphone"),
                        resultSet.getString("clientabout"),
                        resultSet.getInt("age"));
                clients.add(client);
            }
            connection.commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return clients;
    }

    public List<Client> getClientsWhereIdSame() {
        ArrayList<Client> clients = new ArrayList<>();
        try (Connection connection = Database.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(GET_CLIENTS_WHERE_ID_SAME)) {
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                Client client = new Client(
                        resultSet.getString("clientname"),
                        resultSet.getString("clientemail"),
                        resultSet.getLong("clientphone"),
                        resultSet.getString("clientabout"),
                        resultSet.getInt("age"));
                clients.add(client);
            }
            connection.commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return clients;
    }

    public ArrayList<String> getValuesFromAccountsAndClients() {
        ArrayList<String> values = new ArrayList<>();
        try (Connection connection = Database.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(GET_VALUES_FROM_ACCOUNTS_AND_CLIENTS)) {
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                values.add(resultSet.getString("clientname"));
                values.add(resultSet.getString("clientemail"));
                values.add(resultSet.getString("alias"));
            }
            connection.commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return values;
    }
}

