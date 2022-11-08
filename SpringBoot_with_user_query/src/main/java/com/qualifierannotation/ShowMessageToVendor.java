package com.qualifierannotation;

import org.springframework.stereotype.Component;

@Component("vendor")
public class ShowMessageToVendor implements ShowMessage{

	@Override
	public String getMessage() {
		String message= " This message is for vendor";
		return message;
	}

}
