package Source;

public class Auto {
    private String firm;
    private int maxSpeed;
    private String govId;

    public Auto() {
        this.firm = "Без названия";
        this.maxSpeed = 0;
        this.govId = "";
    }

    public Auto(String firm, int maxSpeed, String govId) {
        this.firm = firm;
        this.maxSpeed = maxSpeed;
        this.govId = govId;
    }

    public String getFirm() {
        return firm;
    }

    public void setFirm(String firm) {
        this.firm = firm;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String getGovId() {
        return govId;
    }

    public void setGovId(String govId) {
        this.govId = govId;
    }
}
