import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DataRetriever {
    long countAllVotes() {
        DBConnection dbConnection = new DBConnection();
        String sql = """
                select COUNT(vote.id) as total_vote
                from vote
                """;
        long result = 0;

        try (
                Connection connection = dbConnection.getConnection();
                PreparedStatement ps = connection.prepareStatement(sql);
                ResultSet resultSet = ps.executeQuery()
        ){
            if (resultSet.next()) {
                result = resultSet.getLong("total_vote");
            }
        } catch (SQLException e) {
            throw new RuntimeException("Error executing query", e);
        }
        return result;
    }
}
