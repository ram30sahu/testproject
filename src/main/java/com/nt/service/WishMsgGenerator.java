package com.nt.service;

import java.util.Calendar;

import org.springframework.stereotype.Service;
@Service("wish")
public class WishMsgGenerator {

	public String generateWishMsg(String name){
		int hour=0;
		Calendar calander=null;
		calander=Calendar.getInstance();
        hour=calander.get(Calendar.HOUR_OF_DAY);
		//hi how r u
        
        	if(hour<=12)
   			 return "GM:"+name;
   		 else if(hour<=16)
   			 return "GA:"+name;
   		 else if(hour<=20)
   			 return "GE   "+name;
   		 else 
   			 return "GN:"+name;
		
   	}//method
   }//class

