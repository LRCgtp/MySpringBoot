package com.hand.exam1.service.imp;

import com.hand.exam1.entity.Film;
import com.hand.exam1.service.IFilmService;
import com.hand.exam1.utills.JdbcUtill;
import org.springframework.stereotype.Service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

@Service
public class FilmService implements IFilmService {

    private Connection connection;
    private PreparedStatement preparedStatement;

    @Override
    public Boolean inseartData(Film film) {
        String sql="insert  into t_cloud values(film.getLanguage_id(),film.getOriginal_language_id()" +
                ",film.getRental_duration(),film.getRental_rate(),film.getLength(),film.getReplacement_cost()" +
                ",null ,null , film.getLast_update()) ";
         connection = JdbcUtill.getConnection();
        try {
            /*preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1,film.getLanguage_id());
            preparedStatement.setInt(2,film.getOriginal_language_id());
            preparedStatement.setInt(3,film.getRental_duration());
            preparedStatement.setDouble(4,film.getRental_rate());
            preparedStatement.setInt(5,film.getLength());
            preparedStatement.setDouble(6,film.getReplacement_cost());
            preparedStatement.setDate(, (Date) film.getLast_update());*/
            int i = preparedStatement.executeUpdate();
            if (i>0){
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JdbcUtill.close(connection,preparedStatement);
        }
        return false;
    }
}
