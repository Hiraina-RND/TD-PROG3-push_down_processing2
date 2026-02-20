public class Main {
    static void main() {
        DataRetriever dataRetriever = new DataRetriever();
        System.out.println("totalVote = " + dataRetriever.countAllVotes());
        System.out.println("=========================");
        System.out.println(dataRetriever.countVotesByType());
        System.out.println("=========================");
        System.out.println(dataRetriever.countValidVotesByCandidate());
        System.out.println("=========================");
        System.out.println(dataRetriever.computeVoteSummary());
        System.out.println("=========================");
        System.out.println(dataRetriever.computeTurnoutRate() + "%");
    }
}
