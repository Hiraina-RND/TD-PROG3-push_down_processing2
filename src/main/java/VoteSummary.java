public class VoteSummary {
    private Integer validCount;
    private Integer blankCount;
    private Integer nullCount;

    @Override
    public String toString() {
        return "VoteSummary{" +
                "validCount=" + validCount +
                ", blankCount=" + blankCount +
                ", nullCount=" + nullCount +
                '}';
    }

    public Integer getValidCount() {
        return validCount;
    }

    public Integer getBlankCount() {
        return blankCount;
    }

    public Integer getNullCount() {
        return nullCount;
    }

    public void setValidCount(Integer validCount) {
        this.validCount = validCount;
    }

    public void setBlankCount(Integer blankCount) {
        this.blankCount = blankCount;
    }

    public void setNullCount(Integer nullCount) {
        this.nullCount = nullCount;
    }

    public VoteSummary(Integer validCount, Integer blankCount, Integer nullCount) {
        this.validCount = validCount;
        this.blankCount = blankCount;
        this.nullCount = nullCount;
    }

    public VoteSummary (){
    }
}
