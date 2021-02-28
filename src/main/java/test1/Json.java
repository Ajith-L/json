package test1;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class Json {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
    
		JSONObject object = new JSONObject();
		object.put("name", "ajith");
		object.put("salary", 35000);
		
		JSONArray array = new JSONArray();
		array.add("think positive");
		array.add("hardwork never fail");
		
		object.put("spe", array);
		
		FileWriter file = new FileWriter("ak.json");
		file.write(object.toString());
		file.close();
	}

}
