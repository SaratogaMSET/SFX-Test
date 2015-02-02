import java.util.UUID;


public class GenerateUUID {
	static UUID uuid;
	
	public static void main(String[] args){
		uuid = UUID.randomUUID();
		System.out.println("UUID: " + uuid);
	}
}
