package express.rmi;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import express.data.bankAccountData.BankAccountIO;

public class RMIServer {
	 private static Map<String, Class<? extends UnicastRemoteObject>> NAMING_MAP =
	            new HashMap<String, Class<? extends UnicastRemoteObject>>();

	    private static final int PORT = 1099;

	    private static boolean inited = false;

	    static {
	        NAMING_MAP.put("BankAccount-data", BankAccountIO.class);
	    }

	    public synchronized static void init() throws ServerException {
	        if (inited) {
	            return;
	        }
	        try {
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
