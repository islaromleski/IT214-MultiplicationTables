package mp;

public class Table {
	String getTable12By12() {
		String aMessage = "";
		
		int i;
		int j;
		
		for(i = 1; i < 13; i++) {
			for(j = 1; j < 13; j++) {
				if(i < 10)
					aMessage += " ";
				aMessage += i + "*" + j + " = ";
				if(i*j < 100)
					aMessage += " ";
				if(i*j < 10)
					aMessage += " ";
				aMessage += (i*j) + ", ";
			}
			aMessage += "\n";
		}
		
		return aMessage;
		
	}
}
