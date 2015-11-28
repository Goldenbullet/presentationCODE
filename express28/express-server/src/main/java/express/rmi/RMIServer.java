package express.rmi;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import express.data.bankAccountData.BankAccountIO;
import express.data.documentData.ArrivalDocIO;
import express.data.documentData.DeliverDocIO;
import express.data.documentData.GoodTransStatusIO;
import express.data.documentData.OrderIO;
import express.data.documentData.PaymentDocIO;
import express.data.innerAccountData.InnerAccountIO;
import express.data.logData.LogIO;
import express.data.organiationData.OrganizationIO;
import express.data.repoData.RepoInfoIO;
import express.data.statisticsData.OperateFormIO;
import express.data.statisticsData.ProfitFormIO;
import express.data.strategyData.DistanceIO;
import express.data.strategyData.PriceIO;
import express.data.strategyData.SalaryIO;
import express.data.userData.UserAdminIO;
import express.data.userData.UserInfoIO;
import express.data.userData.UserSignIO;
import express.data.vehicleAndDriverData.DriverIO;
import express.data.vehicleAndDriverData.VehicleIO;

public class RMIServer {
	 private static Map<String, Class<? extends UnicastRemoteObject>> NAMING_MAP =
	            new HashMap<>();

	 private static String file="config/config.txt";
	 private static String IP; //read from config file
	 private static final int PORT = 1099;

	 private static boolean inited = false;

	 static {
		 NAMING_MAP.put("BankAccount-data", BankAccountIO.class);
		 NAMING_MAP.put("PaymentDoc-data", PaymentDocIO.class);
		 NAMING_MAP.put("Log-data", LogIO.class);
		 NAMING_MAP.put("Driver-data", DriverIO.class);
		 NAMING_MAP.put("Vehicle-data", VehicleIO.class);
		 NAMING_MAP.put("Organization-data", OrganizationIO.class);
		 NAMING_MAP.put("InnerAccount-data", InnerAccountIO.class);
		 NAMING_MAP.put("ProfitForm-data", ProfitFormIO.class);
		 NAMING_MAP.put("OperateForm-data", OperateFormIO.class);
		 NAMING_MAP.put("SalaryStartegy-data", SalaryIO.class);
		 NAMING_MAP.put("DistanceStrategy-data", DistanceIO.class);
		 NAMING_MAP.put("PriceStrategy-data", PriceIO.class);
		 NAMING_MAP.put("RepoInfo-data", RepoInfoIO.class);
		 NAMING_MAP.put("UserAdmin-data", UserAdminIO.class);
		 NAMING_MAP.put("UserInfo-data", UserInfoIO.class);
		 NAMING_MAP.put("UserSign-data", UserSignIO.class);
		 NAMING_MAP.put("Search-data", GoodTransStatusIO.class);
	     NAMING_MAP.put("DeliverDoc-data", DeliverDocIO.class);
	     NAMING_MAP.put("ArrivalDoc-data", ArrivalDocIO.class);
	     
	     NAMING_MAP.put("Order-data", OrderIO.class);
	 }

     public synchronized static void init() throws ServerException {
	     if (inited) {
	         return;
	     }
	     try {
	    	 if(!System.getProperty("os.name").equals("Mac OS X")){
		    	 InputStreamReader read = new InputStreamReader(new FileInputStream(file));
			     BufferedReader br = new BufferedReader(read);
				 IP=br.readLine();
				 br.close();
				 System.out.println(IP);
		    	 System.setProperty("java.rmi.server.hostname", IP);
	    	 }
	         LocateRegistry.createRegistry(PORT);
	         for (Entry<String, Class<? extends UnicastRemoteObject>> entry : NAMING_MAP.entrySet()) {
	             String name = entry.getKey();
	             Class<? extends UnicastRemoteObject> clazz = entry.getValue();
	             UnicastRemoteObject proxy = clazz.newInstance();
	             Naming.rebind(name, proxy);
	         }
	         inited = true;
	     } catch (Exception e) {
	         throw new ServerException(e);
	     }
	 }
}
