public class ElectionResult {
    private String candidateName;
    private Integer validVoteCount;

    @Override
    public String toString() {
        return "ElectionResult{" +
                "candidateName='" + candidateName + '\'' +
                ", validVoteCount=" + validVoteCount +
                '}';
    }

    public ElectionResult(String candidateName, Integer validVoteCount) {
        this.candidateName = candidateName;
        this.validVoteCount = validVoteCount;
    }

    public ElectionResult(){
    }

    public String getCandidateName() {
        return candidateName;
    }

    public void setCandidateName(String candidateName) {
        this.candidateName = candidateName;
    }

    public Integer getValidVoteCount() {
        return validVoteCount;
    }

    public void setValidVoteCount(Integer validVoteCount) {
        this.validVoteCount = validVoteCount;
    }
}
