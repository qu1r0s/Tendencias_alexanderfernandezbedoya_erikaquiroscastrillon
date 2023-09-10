package ClubMax;

import java.util.ArrayList;

public class Socio {

    private String Nombre;
    private long Cedula;
    private ArrayList<PersonaAut> PersonasAut;
    private float FondoDispo;
    private String TipoSuscrip;

    public Socio(long Cedula, String Nombre, String TipoSuscrip) {
        this.Cedula = Cedula;
        this.Nombre = Nombre;
        this.PersonasAut = new ArrayList();
        this.TipoSuscrip = TipoSuscrip;
        if (TipoSuscrip.equals("VIP")) {
            this.FondoDispo = 100000;
        } else if (TipoSuscrip.equals("Regular")) {
            this.FondoDispo = 50000;
        }
    }

    public Socio(long Cedula, float FondoDispo) {
        this.Cedula = Cedula;
        this.FondoDispo = FondoDispo;
    }

// Get and Set
    public long getCedula() {
        return Cedula;
    }

    public void setCedula(int Cedula) {
        this.Cedula = Cedula;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public ArrayList<PersonaAut> getPersonasAut() {
        return PersonasAut;
    }

    public void setPersonasAut(ArrayList<PersonaAut> PersonasAut) {
        this.PersonasAut = PersonasAut;
    }

    public float getFondoDispo() {
        return FondoDispo;
    }

    public void setFondoDispo(float FondoDispo) {
        this.FondoDispo = FondoDispo;
    }

    public String getTipoSuscrip() {
        return TipoSuscrip;
    }

    public void setTipoSuscrip(String TipoSuscrip) {
        this.TipoSuscrip = TipoSuscrip;
    }

}
