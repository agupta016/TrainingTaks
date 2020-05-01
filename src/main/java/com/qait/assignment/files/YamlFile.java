package com.qait.assignment.files;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.yaml.snakeyaml.DumperOptions;
import org.yaml.snakeyaml.Yaml;

public class YamlFile {
	File file = new File("SampleFiles/file.yaml");
	FileWriter writer;
	
	
	public void createFile() throws IOException {
		
		if(!file.exists())
			file.createNewFile();		
	}
	
	public void writeData() throws IOException {
		
		DumperOptions options = new DumperOptions();
		options.setDefaultFlowStyle(DumperOptions.FlowStyle.BLOCK);
		options.setPrettyFlow(true);
		
		Map<String, Map<String, String>> map = new HashMap<>();
	    for (int i = 1; i <= 3; i++) {
	          Map<String, String> map2 = new HashMap<>();
	          map2.put("key1" + i, "value1" + i);
	          map2.put("key2" + i, "value2" + i);
	          map2.put("key3" + i, "value4" + i);
	          map.put("key" + i, map2);
	    }
		
		HashMap<String,Object> data  = new HashMap<String, Object>();
		data.put("name", "jimmy batola");
		data.put("age", 50);
		data.put("hobbies", new String[]{"play","sleep"});
		
		Yaml yaml = new Yaml(options);
		writer = new FileWriter(file);
		yaml.dump(data, writer);
		yaml.dump(map,writer);
		
	}
	
	
	
	
	public static void main(String[] args) throws IOException {
		
		YamlFile pf = new YamlFile();
		pf.createFile();
		pf.writeData();
		
		
		
		
	}

}
