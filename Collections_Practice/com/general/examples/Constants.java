package com.general.examples;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;



/**
 * This class holds the application level variables which required through the application.
 * 
 * @author Ramkumar
 *
 */
public class Constants {

	

	
	public enum AGENT_FAMILY {
		APPLICATION("APPLICATION"), 
		SERVER("SERVER"),  
		DATABASE("DATABASE"), 
		NETWORK("NETWORK");
		
		private String strAgentFamily;
		
		private AGENT_FAMILY(String agentFamily) {
			strAgentFamily = agentFamily;
		}
		
		public String getAgentFamily() {
			return this.strAgentFamily;
		}
		
		public String toString() {
			return strAgentFamily;
		}
	}
	
	public enum AGENT_TYPE {
		TOMCAT("TOMCAT", "APPLICATION"), JBOSS("JBOSS", "APPLICATION"), MSIIS("MSIIS", "APPLICATION"), 
		LINUX("LINUX", "SERVER"), WINDOWS("WINDOWS", "SERVER"), 
		MYSQL("MYSQL", "DATABASE"), MSSQL("MSSQL", "DATABASE"),
		POSTGRES("POSTGRES", "DATABASE"),
		NETWORK("NETWORK", "NETWORK"),
		JAVA_PROFILER("JAVA_PROFILER", "APPLICATION"), DOTNET_PROFILER("DOTNET_PROFILER", "APPLICATION");
		
		private String strAgentType;
		private String strAgentCategory;
		
		private AGENT_TYPE(String agentType, String agentCategory) {
			strAgentType = agentType;
			strAgentCategory = agentCategory;
		}

		public void setMySQLVersion(String strVersionNo) {
			strAgentType = "MYSQL "+strVersionNo;
		}
		
		public String getAgentCategory() {
			return this.strAgentCategory;
		}
		
		public String toString() {
			return strAgentType;
		}
	}
	
	public enum PROFILER_KEY {
		THREAD_ID(1), TYPE(2), START_TIME(3), DURATION_MS(4), APPROX_NANO_SEC_START(5), DURATION_NS(6), REQUEST_URI(7), LOCALHOST_NAME_IP(8), REFERER_URI(9), TICK_VALUE_MS(10),
		CLASS_NAME(51), METHOD_NAME(52), METHOD_SIGNATURE(53), CALLER_METHOD_ID(54), CALLEE_METHOD_ID(55), 
		QUERY(101), 
		EXCEPTION_TYPE(151), EXCEPTION_MESSAGE(152), EXCEPTION_STACKTRACE(153);
		
		private Integer key;
		
		private PROFILER_KEY(Integer nKey) {
			key = nKey;
		}
		
		public String toString() {
			return key+"";
		}
	}

	public enum SLOW_QUERY {
		QUERY("query"),CALLS("calls"),DURATION_MS("duration_ms");
		
		private String key;
		
		private SLOW_QUERY(String strKey) {
			key = strKey;
		}
		
		public String toString() {
			return key+"";
		}
	}
	/**
	 * Loads constants properties 
	 * 
	 * @param srtConstantsPath
	 */
	

	}
