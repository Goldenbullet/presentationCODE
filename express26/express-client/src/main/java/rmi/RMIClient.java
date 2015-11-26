package rmi;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import express.dataService.bankAccountDataService.BankAccountDataService;

public class RMIClient {

	  static String file="config/config.txt";
	  private static String IP; //read from config file
	  private static boolean inited = false;
	  private static BankAccountDataService bankAccount;

	  public synchronized static void init() throws ClientException {
	      if (inited) {
	          return;
	      }

	      try {
	          InputStreamReader read = new InputStreamReader(new FileInputStream(file));
		      BufferedReader br = new BufferedReader(read);
			  IP=br.readLine();
			  initObjects();
	          inited = true;
	      } catch (Exception e) {
	            throw new ClientException(e);
	      }
	  }

	  private static void initObjects() throws MalformedURLException, RemoteException, NotBoundException {
	      String urlPrefix = "rmi://" + IP + ":1099/";
	      bankAccount=(BankAccountDataService) Naming.lookup(urlPrefix+"BankAccount-data"); 
	  }

	  public static BankAccountDataService getBankAccountObject() {
	      return bankAccount;
	  }
}
