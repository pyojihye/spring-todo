package kr.re.kitri.todo.service;

import kr.re.kitri.todo.model.Todo;
import kr.re.kitri.todo.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoService {

    @Autowired
    private TodoRepository repository;

    public List<Todo> getAllTodos(){
        return repository.SelectAllTodos();
    }

    /*public Todo getTodos(int id){
        return repository.SelectTodos(id);
    }

    public Todo InsertTodos(){
        return repository.InsertTodos();
    }

    public String completeTodos(int id){
        return repository.DoneTodos(id);
    }

    public String removeTodos(int id){
        return repository.DeleteTodos(id);
    }

    public String SearchTodos(){
        return repository.SearchTodos();
    }*/
}
