package com.sg.todo.data;

import com.sg.todo.models.ToDo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class ToDoDatabaseDao  implements  ToDoDao {

    @Autowired
    private final JdbcTemplate jdbcTemplate;

    public ToDoDatabaseDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public ToDo add(ToDo todo) {
        return null;
    }

    @Override
    public List<ToDo> getAll() {
        final String sql = "Select * from todo;";
        return jdbcTemplate.query(sql, new ToDoMapper());
    }

    @Override
    public ToDo findById(int id) {
        return null;
    }

    @Override
    public boolean update(ToDo todo) {
        return false;
    }

    @Override
    public boolean deleteById(int id) {
        return false;
    }

    private static final class ToDoMapper implements RowMapper<ToDo> {

        @Override
        public ToDo mapRow(ResultSet rs, int index) throws SQLException {
            ToDo td = new ToDo();
            td.setId(rs.getInt("id"));
            td.setTodo((rs.getString("todo")));
            td.setNote((rs.getString("note")));
            td.setFinished((rs.getBoolean("finished")));
            return td;
        }

    }
}
