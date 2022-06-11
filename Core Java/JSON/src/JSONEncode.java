import org.json.simple.JSONObject;

public class JSONEncode {

	public static void main(String[] args) {
		
		JSONObject obj = new JSONObject();
		obj.put("name", new String("Pooja"));
		obj.put("age",new Integer(20));
		obj.put("salary", new Float(30000.5));
		System.out.println(obj);

	}

}
