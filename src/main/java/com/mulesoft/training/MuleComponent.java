package com.mulesoft.training;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.mule.api.annotations.param.InboundHeaders;
import org.mule.api.annotations.param.Payload;

public class MuleComponent {
	
	int count;
	public MuleComponent(){
		count = 1;
	}

  public Map<String,String> processMap(Map<String,String> input) {
    // processMap implementation
	  input.put("executedBy", "processMap method");
    return input;
  }

  public Map<String,String> processArray(List<String> input ) {
    // processArray implementation
	  Map<String, String> output = new HashMap<String,String>();
	  output.put("message", input.get(0));
	  output.put("executedBy", "processArray method");
    return output;
  }

  public Map<String,String> processString(String input) {
	  Map<String, String> output = new HashMap<String,String>();
	  output.put("message", input);
	  output.put("executedBy", "processArray method");
    return output;
  }

  public Map<String,String> processString2(@Payload Object input,@InboundHeaders("http.method") String myhttpMethod) {
	  Map<String, String> output = new HashMap<String,String>();
	  output.put("message", input.toString());
	  output.put("executedBy", "processArray method");
	  output.put("http.method", myhttpMethod);
	  output.put("count", String.valueOf(count));
	  
	  count++;
    return output;
  }

} 
