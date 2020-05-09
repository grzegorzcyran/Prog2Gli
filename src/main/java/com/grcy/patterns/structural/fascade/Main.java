package com.grcy.patterns.structural.fascade;

import java.sql.Connection;

public class Main {

	public static void main(String[] args) {
		String tableName="Employee";

		//generating MySql HTML report and Oracle PDF report without using Facade
		Connection conMySQL = MySQLReportGenerator.getMySqlDBConnection();
		MySQLReportGenerator mySQLReportGenerator = new MySQLReportGenerator();
		mySQLReportGenerator.generateMySqlHTMLReport(tableName, conMySQL);

		Connection conOracle = OracleReportGenerator.getOracleDBConnection();
		OracleReportGenerator oracleReportGenerator = new OracleReportGenerator();
		oracleReportGenerator.generateOraclePDFReport(tableName, conOracle);


		//generating MySql HTML report and Oracle PDF report using Facade
		Fascade.generateReport(Fascade.DBType.MYSQL, Fascade.ReportType.HTML, tableName);
		Fascade.generateReport(Fascade.DBType.ORACLE, Fascade.ReportType.PDF, tableName);

	}

}
