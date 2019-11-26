package com.demo.lombok;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//this @Data from lombok refer to setters and getters and hashing , equals  so no need to create them anymore in class
//law 3aiz a7t getter bas or setter bas 
//@Getter
//@Setter
//@EqualsAndHashCode
//@NoArgsConstructor //bt create construcor fady

//dol keda l kol wa7da 3la 7eda sawa2 mn fo2 5ales aw gnb kol variable

public @Data class DemoClass {

	private int age;
	private String name;
	private String tech;
	private String job;

}
