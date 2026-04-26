package model;

public class Coach {
    private String coachId;
    private String type;

    public Coach(String coachId, String type) {
        this.coachId = coachId;
        this.type = type;
    }

    public String getCoachId() {
        return coachId;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return coachId + " (" + type + ")";
    }
}