/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package custommaingui;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Mazhar
 */
public class MySQLAccess {

    /*
     * DB information    
     */
    private final String dbServer = "localhost";
    private final String dbName = "ManBook";
    private final String dbUserID = "root";
    private final String dbPass = "nopass123";

    private Connection connect = null;
    private Statement statement = null;

    public void connectDataBase() {
        try {
            // this will load the MySQL driver, each DB has its own driver
            Class.forName("com.mysql.jdbc.Driver");
            // setup the connection with the DB.
            connect = DriverManager
                    .getConnection("jdbc:mysql://" + dbServer + "/" + dbName + "?"
                            + "user=" + dbUserID + "&password=" + dbPass);

            // statements allow to issue SQL queries to the database
            statement = connect.createStatement();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(MySQLAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public ResultSet executeQuery(String query) {
        try {
            ResultSet resultSetLocal = statement.executeQuery(query);
            return resultSetLocal;
        } catch (SQLException ex) {
            Logger.getLogger(MySQLAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public int executeQueryUpdate(String query) {
        int resultSetLocal = 0;
        try {
            resultSetLocal = statement.executeUpdate(query);
        } catch (SQLException ex) {
            Logger.getLogger(MySQLAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resultSetLocal;
    }

    private String[] readMetaData(ResultSet resultSet) {
        String[] columnName = new String[3];
        try {
            for (int i = 0; i < resultSet.getMetaData().getColumnCount(); i++) {
                columnName[i] = new String(resultSet.getMetaData().getColumnName(i + 1));
            }
        } catch (SQLException ex) {
            Logger.getLogger(MySQLAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("readMetaData : " + columnName.length);
        return columnName;
    }

    public String[][] readResultData(ResultSet resultSet) {
        try {
            String[][] columnName = new String[100][3];
            columnName[0] = readMetaData(resultSet);
            int index = 1;
            while (resultSet.next()) {
                for (int i = 0; i < resultSet.getMetaData().getColumnCount(); i++) {
                    columnName[index][i] = resultSet.getString(resultSet.getMetaData().getColumnName(i + 1));
                }
                index++;
            }
            System.out.println("readResultData : " + columnName.length);
            return columnName;
        } catch (SQLException ex) {
            Logger.getLogger(MySQLAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    // you need to close all three to make sure
    private void close() {
        close(statement);
        close(connect);
    }

    private void close(Statement c) {
        try {
            if (c != null) {
                c.close();
            }
        } catch (Exception e) {
            // don't throw now as it might leave following closables in undefined state
        }
    }

    private void close(Connection c) {
        try {
            if (c != null) {
                c.close();
            }
        } catch (Exception e) {
            // don't throw now as it might leave following closables in undefined state
        }
    }
}
