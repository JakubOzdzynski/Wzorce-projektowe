package patterns.structral.facade;

import java.sql.Connection;

public class OracleReportGenerator {
    public static Connection getOracleDBConnection() {
        System.out.println("Retrieving connection to Oracle database.");
        return null;
    }
    public void generateOracleReportPDF(String table, Connection connection) {
        System.out.println("Printing report from " + table + " to " + "PDF");
    }
    public void generateOracleReportHTML(String table, Connection connection) {
        System.out.println("Printing report from " + table + " to " + "HTML");
    }
}

