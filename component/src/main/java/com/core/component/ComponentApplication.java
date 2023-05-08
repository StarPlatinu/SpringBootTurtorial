package com.core.component;

import com.core.component.model.Girl;
import com.core.component.model.Outfit;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ComponentApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(ComponentApplication.class, args);
		Girl girl = context.getBean( Girl.class);
		System.out.println("Instance" + girl);
		girl.wear();

	}

}
