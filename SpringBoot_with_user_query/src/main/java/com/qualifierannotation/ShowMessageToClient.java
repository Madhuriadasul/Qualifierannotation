package com.qualifierannotation;

import org.springframework.stereotype.Component;

@Component("client")
public class ShowMessageToClient  implements ShowMessage{

	@Override
	public String getMessage() {
		String message=" This message is for client ";
		return message;
	}

}
