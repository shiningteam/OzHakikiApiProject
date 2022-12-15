package shiningTeam;

public class Api006_PojoClass {
    private String ResponseJSON;
    private int ResponseCode;

    public String getResponseJSON() {
        return ResponseJSON;
    }

    public void setResponseJSON(String responseJSON) {
        ResponseJSON = responseJSON;
    }

    public int getResponseCode() {
        return ResponseCode;
    }

    public void setResponseCode(int responseCode) {
        ResponseCode = responseCode;
    }

    public Api006_PojoClass() {

    }

    public Api006_PojoClass(String responseJSON, int responseCode) {
        ResponseJSON = responseJSON;
        ResponseCode = responseCode;
    }

    @Override
    public String toString() {
        return "Pojo_05{" +
                "ResponseJSON='" + ResponseJSON + '\'' +
                ", ResponseCode=" + ResponseCode +
                '}';
    }
}

