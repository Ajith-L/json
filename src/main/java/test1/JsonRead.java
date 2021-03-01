package test1;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonRead {

	public static void main(String[] args) throws IOException, ParseException {
		// TODO Auto-generated method stub
     
		JSONParser parser = new JSONParser();
		FileReader reader = new FileReader("ak.json");
			Object obj=	parser.parse(reader);
			
			JSONObject jobj=(JSONObject) obj;
			String name= (String) jobj.get("name");
		Long sal= (Long) jobj.get("salary");
		JSONArray arry= (JSONArray) jobj.get("spe");
		System.out.println(name);
		System.out.println(sal);
		Iterator<JSONObject> iterator = arry.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}
