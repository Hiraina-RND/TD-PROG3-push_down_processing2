import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

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

    List<VoteTypeCount> countVotesByType() {
        DBConnection dbConnection = new DBConnection();
        String sql = """
                select vote.vote_type, COUNT(vote.id) as total_vote
                from vote
                group by vote.vote_type
                order by total_vote desc
                """;
        List<VoteTypeCount> result = new ArrayList<>();

        try (
                Connection connection = dbConnection.getConnection();
                PreparedStatement ps = connection.prepareStatement(sql);
                ResultSet resultSet = ps.executeQuery()
        ){
            while (resultSet.next()){
                result.add(
                        new VoteTypeCount(
                                VoteTypeEnum.valueOf(resultSet.getString("vote_type")),
                                resultSet.getInt("total_vote")
                        )
                );
            }
        } catch (SQLException e){
            throw new RuntimeException("Error executing query", e);
        }
        if (result.isEmpty()){
            throw new RuntimeException("No voteTypeCount found");
        }
        return result;
    }

    List<CandidateVoteCount> countValidVotesByCandidate (){
        DBConnection dbConnection = new DBConnection();
        String sql = """
                select c.name as candidate_name, count(v.id) as valid_vote
                from candidate c
                left join vote v on v.candidate_id = c.id
                    and v.vote_type = 'VALID'
                group by c.name
                order by valid_vote desc
                """;
        List<CandidateVoteCount> result = new ArrayList<>();

        try (
                Connection connection = dbConnection.getConnection();
                PreparedStatement ps = connection.prepareStatement(sql);
                ResultSet resultSet = ps.executeQuery()
        ){
            while (resultSet.next()){
                result.add(
                        new CandidateVoteCount(
                                resultSet.getString("candidate_name"),
                                resultSet.getInt("valid_vote")
                        )
                );
            }

        } catch (SQLException e){
            throw new RuntimeException("Error executing query", e);
        }
        return result;
    }
}
