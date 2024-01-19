public class CitizenInfo {
    private String citizenId;
    private String name;
    private String address;

    public CitizenInfo(String citizenId, String name, String address) {
        this.citizenId = citizenId;
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }
}
