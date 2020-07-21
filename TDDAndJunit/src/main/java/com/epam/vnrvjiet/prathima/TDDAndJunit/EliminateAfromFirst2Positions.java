package com.epam.vnrvjiet.prathima.TDDAndJunit;

public class EliminateAfromFirst2Positions {
	public String removeA(String string)
	{
		int stringLength=string.length();
		String result="";
		if(stringLength==1)
		{
			if(string.charAt(0)!='A')
				result=string;
		}
		else if(stringLength>1) {
		if(string.charAt(0)=='A')
		{
			if(string.charAt(1)=='A')
				result=string.substring(2,stringLength);
			else
				result=string.substring(1,stringLength);
				
		}
		else
		{
			if(string.charAt(1)=='A')
				result=string.charAt(0)+string.substring(2,stringLength);
			else
				result=string;
		}
		}
		return result;
		
			
		
	}

}
