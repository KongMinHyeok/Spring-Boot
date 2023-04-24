package kr.co.todo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.todo.dao.AppDAO;
import kr.co.todo.vo.TodoVO;

@Service
public class AppService {

	@Autowired
	private AppDAO dao;
	
	public void insertTodo(TodoVO vo) {
		dao.insertTodo(vo);
	};
	public TodoVO selectTodo(int vo) {
		return dao.selectTodo(vo);
	};
	public List<TodoVO> selectTodos(){
		return dao.selectTodos();
	};
	public void updateTodo(TodoVO vo) {
		dao.updateTodo(vo);
	};
	public void deleteTodo(int vo) {
		dao.deleteTodo(vo);
	};
	public void deleteTodoAll() {
		dao.deleteTodoAll();
	}
}
