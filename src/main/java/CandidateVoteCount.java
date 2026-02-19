public class CandidateVoteCount {
    private String candidateName;
    private Integer validVoteCount;

    @Override
    public String toString() {
        return "CandidateVoteCount{" +
                "candidateName='" + candidateName + '\'' +
                ", validVoteCount=" + validVoteCount +
                '}';
    }

    public CandidateVoteCount(String candidateName, Integer validVoteCount) {
        this.candidateName = candidateName;
        this.validVoteCount = validVoteCount;
    }
}
