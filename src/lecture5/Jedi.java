package lecture5;

public class Jedi {
    private String name;
    private Affiliation affiliation;
    private double height;
    private LightsaberColor lightsaberColor;
    private Jedi[] masters;
    private Jedi[] apprentices;

    public Jedi(String name, Affiliation affiliation) {
        this.name = name;
        this.affiliation = affiliation;
    }

    public Jedi(String name, Affiliation affiliation, double height, LightsaberColor lightsaberColor) {
        this.name = name;
        this.affiliation = affiliation;
        this.height = height;
        this.lightsaberColor = lightsaberColor;
    }

    public String getName() {
        return name;
    }

    public Affiliation getAffiliation() {
        return affiliation;
    }

    public double getHeight() {
        return height;
    }

    public LightsaberColor getLightsaberColor() {
        return lightsaberColor;
    }

    public Jedi[] getMasters() {
        return masters;
    }

    public Jedi[] getApprentices() {
        return apprentices;
    }

    public void setLightsaberColor(LightsaberColor lightsaberColor) {
        this.lightsaberColor = lightsaberColor;
    }

    public void setApprentices(Jedi ... apprentices) {
        this.apprentices = apprentices;
    }

    public void setMasters(Jedi ... masters) {
        this.masters = masters;
    }

    public void setAffiliation(Affiliation affiliation) {
        this.affiliation = affiliation;
    }
}
