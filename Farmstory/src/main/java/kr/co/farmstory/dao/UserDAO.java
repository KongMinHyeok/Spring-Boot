package kr.co.farmstory.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface UserDAO {

    public void selectTerms();
    public void selectUser();
    public void selectUsers();
    public void insertUser();
    public void updateUser();
    public void deleteUser();
}
