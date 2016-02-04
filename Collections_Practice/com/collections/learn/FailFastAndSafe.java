package com.collections.learn;

import java.util.*;

import org.omg.PortableInterceptor.ObjectReferenceTemplateSeqHelper;



public class FailFastAndSafe {

	public static void main(String[] args) {
		Set<String> coal= new HashSet<String>();
		//Set<String> coal= new LinkedHashSet<String>();
		//Set<String> coal= new TreeSet<String>();
		//Set<String> coal= new ConcurrentSkipListSet<String>();
		//Set<String> coal= new CopyOnWriteArraySet<String>();
		coal.add("Java");
		coal.add("J2EE");
		coal.add("Collection");
		coal.add("spring");
		coal.add("hibernate");
      
      
        Iterator<String> failXIterator = coal.iterator();
        while(failXIterator.hasNext()){
            System.out.println(failXIterator.next());
            coal.add("strut"); 
            
        }

	}

}
