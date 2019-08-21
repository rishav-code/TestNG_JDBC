package atmecs;

import java.sql.Connection;
import java.sql.Statement;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import jdbc.Database;
import jdbc.Fetch;
import jdbc.Insert;

public class Testjdbc {

	@BeforeTest
	public void testingconnection() {

		Database de = new Database();

		Connection con = de.loading();
		Assert.assertNotNull(con, "not Connected");
		System.out.println("connection established");

	}

	@Test(priority = (2))
	public void fetcinghdata() {
		Fetch fe = new Fetch();
		Connection con = fe.fetchData();
		Assert.assertNotNull(con, "Datafetched");
		System.out.println("Data fetched");

	}

	@Test(priority = (1))
	public void beforeconnection() {

		System.out.println("TESTING STARTED");
	}

	@AfterTest
	public void afterconnection() {

		System.out.println("TESTING COMPLEATED");
	}
}
