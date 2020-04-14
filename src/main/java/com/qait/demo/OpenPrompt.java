package com.qait.demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.Reader;

public class OpenPrompt {

	public static void main(String[] args) throws IOException, InterruptedException {
		
//		String cmd = "mkdir //home//qainfotech//Desktop//new-folder";
		
		String[] command = { "gnome-terminal", "--","ifconfig" };
//		Process proc = Runtime.getRuntime().exec(command);
		Process proc = new ProcessBuilder(command).start();
			System.out.println(proc);
		
		BufferedReader br = new BufferedReader(new InputStreamReader(proc.getInputStream()));
		String line = "";
		while((line = br.readLine()) != null)
			System.out.println(line);
	
	}

}
