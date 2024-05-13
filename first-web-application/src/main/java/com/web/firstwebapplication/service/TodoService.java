package com.web.firstwebapplication.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Service;

import com.web.firstwebapplication.model.Todo;

@Service
public class TodoService {
	
	
    private static List<Todo> todos = new ArrayList<Todo>();
    
    static{
        todos.add(new Todo(1, "Hari","N Harinatha Reddy",2111655,87684764, new Date()
                ));
       
        
    }

    private static int todoCount = 0;
    
   
   
    public List<Todo> retrieveTodos(String user) {
        List<Todo> filteredTodos = new ArrayList<Todo>();
        for (Todo todo : todos) {
            if (todo.getUser().equalsIgnoreCase(user)) {
                filteredTodos.add(todo);
            }
        }
        return filteredTodos;
    }
    
    public Todo retrieveTodo(int sno) {
        for (Todo todo : todos) {
            if (todo.getSno()==sno) {
                return todo;
            }
        }
        return null;
    }

    public void updateTodo(Todo todo){
    		todos.remove(todo);
    		todos.add(todo);
    }

    public void addTodo(String name, String studentName,long rollNumber,long phno, Date checkingDate
    		) {
        todos.add(new Todo(++todoCount, name,studentName,rollNumber,phno, checkingDate));
    }

    public void deleteTodo(int sno) {
        Iterator<Todo> iterator = todos.iterator();
        while (iterator.hasNext()) {
            Todo todo = iterator.next();
            if (todo.getSno() == sno) {
                iterator.remove();
            }
        }
    }
}