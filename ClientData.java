package javastream;

import java.util.Arrays;
import java.util.List;

public class ClientData {
	 public static List<Client> getClients() {
	        return Arrays.asList(
	                new Client(1, "Ahmed", "Lyon", 120000.50),
	                new Client(2, "Sara", "Paris", 90000.00),
	                new Client(3, "Yassine", "Lyon", 45000.75),
	                new Client(4, "Nadia", "Marseille", 70000.10),
	                new Client(5, "Omar", "Lyon", 200000.00),
	                new Client(6, "Mouna", "Toulouse", 65000.50)
	        );
	    }

}
