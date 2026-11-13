package rmiServer;

import rmiService.BanqueImpl;
import javax.naming.Context;
import javax.naming.InitialContext;
import java.rmi.registry.LocateRegistry;

public class BanqueServer {
    public static void main(String[] args) {
        try {
            LocateRegistry.createRegistry(1099);
            BanqueImpl banque = new BanqueImpl();

            Context ctx = new InitialContext();   // lit jndi.properties
            ctx.rebind("BanqueService", banque);

            System.out.println("Serveur Banque prêt (JNDI)...");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}