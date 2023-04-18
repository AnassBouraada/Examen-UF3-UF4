package model.ennumerats;

public enum SexeEnum {
    HOME("Home"),
    DONA("Dona");
    
    private String sexe;
    
    private SexeEnum(String sexe) {
        this.sexe = sexe;
    }
    
    public String getSexe() {
        return sexe;
    }
    
    @Override
    public String toString() {
        return sexe;
    }
}
