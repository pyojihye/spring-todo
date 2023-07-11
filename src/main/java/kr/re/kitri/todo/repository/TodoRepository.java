package kr.re.kitri.todo.repository;

import kr.re.kitri.todo.model.Todo;
import org.apache.el.parser.AstFalse;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class TodoRepository {

    public List<Todo> SelectAllTodos(){
        List<Todo> todo = new ArrayList<>();
        todo.add(new Todo(1,"강의듣기",true));
        todo.add(new Todo(2,"운동하기",false));
        todo.add(new Todo(3,"집가기",false));
        return todo;
    }

    /*public Todo SelectTodos(int id){
        return new Todo(4,"밥먹기",false);
    }

    public Todo InsertTodos(){
        return new Todo(5,"잠자기",false);
    }

    public String DoneTodos(int id){
        return "완료되었습니다";
    }

    public String DeleteTodos(int id){
        return "삭제 되었습니다";
    }

    public String SearchTodos(){
        return "검색중입니다..";
    }*/

}
