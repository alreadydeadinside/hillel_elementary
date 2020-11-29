package services;

import entities.Account;
import utils.Database;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AccountService {
    private static final String CREATE = "INSERT INTO accounts (client_id, number, value) VALUES (?, ?, ?)";
    private static final String READ = "SELECT * FROM accounts";
    private static final String UPDATE = "UPDATE accounts SET client_id = ?, number = ?, value = ? WHERE id = ?";
    private static final String DELETE = "DELETE FROM accounts WHERE id = ?";
    private static final String GET_ACCOUNTS_WHERE_VALUE_BIGGER_THAN = "SELECT number FROM accounts WHERE value > ?";

    public List<Account> getAll() {
        List<Account> accounts = new ArrayList<>();
        try (Connection connection = Database.getConnection();
             Statement statement = connection.createStatement()) {
            ResultSet resultSet = statement.executeQuery(READ);
            connection.setAutoCommit(false);
            while (resultSet.next()) {
                Account account = new Account();
                account.setClientId(resultSet.getInt("client_id"));
                account.setNumber(resultSet.getString("number"));
                account.setValue(resultSet.getDouble("value"));
                accounts.add(account);
            }
            connection.commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return accounts;
    }

    public void insertValues(Account account) {
        try (Connection connection = Database.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(CREATE)) {
            connection.setAutoCommit(false);
            preparedStatement.setInt(1, account.getClientId());
            preparedStatement.setString(2, account.getNumber());
            preparedStatement.setDouble(3, account.getValue());
            preparedStatement.execute();
            connection.commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updateInfo(Account account) {
        try (Connection connection = Database.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(UPDATE)) {
            connection.setAutoCommit(false);
            preparedStatement.setInt(1, account.getClientId());
            preparedStatement.setString(2, account.getNumber());
            preparedStatement.setDouble(3, account.getValue());
            preparedStatement.setInt(4, account.getId());
            preparedStatement.execute();
            connection.commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteInfo(int id) {
        try (Connection connection = Database.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(DELETE)) {
            connection.setAutoCommit(false);
            preparedStatement.setInt(1, id);
            preparedStatement.execute();
            connection.commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public List<String> getValueBiggerThan(double value) {
        ArrayList<String> numbers = new ArrayList<>();
        try (Connection connection = Database.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(GET_ACCOUNTS_WHERE_VALUE_BIGGER_THAN)) {
            preparedStatement.setDouble(1, value);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                numbers.add(resultSet.getString("number"));
            }
            connection.commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return numbers;
    }
}
