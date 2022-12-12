package com.rest.validations;

public class ObjectMapper {

	public static ObjectNodeClass createObjectNode()
	
	{
		
		ObjectNodeClass x=new ObjectNodeClass();
		
		return x;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ObjectNodeClass ObjectNode =ObjectMapper.createObjectNode();
		
		ObjectNode.put("Name", "Manoj Kumar Sirivella ");
		
		ObjectNode.set("workspaces", ObjectNode);
	}

}
