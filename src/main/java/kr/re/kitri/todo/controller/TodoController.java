package kr.re.kitri.todo.controller;

import kr.re.kitri.todo.model.Todo;
import kr.re.kitri.todo.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TodoController {

    @Autowired
    private TodoService service;

    @GetMapping("/todos")
    public List<Todo> viewAllTodos(){
        return service.getAllTodos();
    }

//    @GetMapping("/todos/{id}")
//    public Todo viewTodos(@PathVariable int id){
//        return service.getTodos(id);
//    }
//
//    @PostMapping("/todos")
//    public Todo registTodos(){
//        return service.InsertTodos();
//    }
//
//    @PutMapping("/todos/{id}")
//    public String doneTodos(@PathVariable int id){
//        return service.completeTodos(id);
//    }
//
//    @DeleteMapping("/todos/{id}")
//    public String removeTodos(@PathVariable int id){
//        return service.removeTodos(id);
//    }
//
//    @GetMapping("/todos")
//    public String SearchTodos(){
//        return service.SearchTodos();
//    }
}
