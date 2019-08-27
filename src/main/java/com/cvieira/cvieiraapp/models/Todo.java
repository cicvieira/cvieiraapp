package com.cvieira.cvieiraapp.models;

import org.springframework.data.mongodb.core.mapping.Document;

//Usando lombok gets e sets
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "todos")
public class Todo {
	private String id;
	private String title;	
}
