package com.env.transexp;

import java.io.IOException;
import java.util.Optional;

public class ProcessHandeling {
	
	public static String pid;
	public static Process p;
	
	public static void startEcho(String echoString) throws IOException{
		ProcessBuilder pb = new ProcessBuilder("echo", echoString);
		p = pb.start();
	}
	
	public String getPid() {
		return Long.toString(p.pid());
	}
	
	public String getProcess() {
		return p.info().command() + "";
	}
	
	//Actually indepented of a pid
	public boolean isPid(String pid) {
		return Character.isDigit(pid.charAt(0));
	}
}
