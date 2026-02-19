public class VoteTypeCount {

    private VoteTypeEnum voteType;
    private Integer count;

    @Override
    public String toString() {
        return "VoteTypeCount{" +
                "voteType=" + voteType +
                ", count=" + count +
                '}';
    }

    public VoteTypeCount(VoteTypeEnum voteType, Integer count) {
        this.voteType = voteType;
        this.count = count;
    }
}
