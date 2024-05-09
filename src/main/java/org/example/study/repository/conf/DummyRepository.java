package org.example.study.repository.conf;

import lombok.AllArgsConstructor;
import org.example.study.model.Dummy;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

@Repository
@AllArgsConstructor
public class DummyRepository {
    private final Connection connection;

    public List<Dummy> getAll() throws SQLException {
        String query = "SELECT * FROM \"dummy\";";
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(query);
        List<Dummy> lists = new ArrayList<>();

        while(resultSet.next()){
            lists.add(
                new Dummy(
                    resultSet.getString("id"),
                    resultSet.getString("name")
                )
            );
        }

        return lists;
    }
}