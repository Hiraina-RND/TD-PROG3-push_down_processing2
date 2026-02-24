public class Main {
    static void main() {
        DataRetriever dataRetriever = new DataRetriever();
        System.out.println("Q1/   totalVote = " + dataRetriever.countAllVotes());
        System.out.println("=========================");
        System.out.println("Q2/   " + dataRetriever.countVotesByType());
        System.out.println("=========================");
        System.out.println("Q3/   " + dataRetriever.countValidVotesByCandidate());
        System.out.println("=========================");
        System.out.println("Q4/    " + dataRetriever.computeVoteSummary());
        System.out.println("=========================");
        System.out.println("Q5/    " + dataRetriever.computeTurnoutRate() + "%");
        System.out.println("=========================");
        System.out.println("Q6/    " + dataRetriever.findWinner());
    }
}
