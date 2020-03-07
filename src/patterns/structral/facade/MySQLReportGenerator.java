package patterns.structral.facade;

import org.w3c.dom.ls.LSOutput;

import java.sql.Connection;

public class MySQLReportGenerator {
    public static Connection getMySQLDBConnection() {
        System.out.println("Retrieving connection to MySQL database.");
        return null;
    }
    public void generateMySQLReportPDF(String table, Connection connection) {
        System.out.println("Printing report from " + table + " to " + "PDF");
    }
    public void generateMySQLReportHTML(String table, Connection connection) {
        System.out.println("Printing report from " + table + " to " + "HTML");
    }
}
