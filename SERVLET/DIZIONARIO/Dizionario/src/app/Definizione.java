package app;
public class Definizione{
    public String parola;
    public String sinonimo;
    public String contrario;
    public Definizione( String parola,  String sinonimo,  String contrario) {
        this.parola = parola;
        this.sinonimo = sinonimo;
        this.contrario = contrario;
    }
    public Definizione( String parola) {
        this.parola = parola;
    }
    public String getParola() {
        return this.parola;
    }
    public String getSinonimo() {
        return this.sinonimo;
    }

    public String getContrario() {
        return this.contrario;
    }
    public void setParola(String parola) {
         this.parola = parola;
    }
    public void setContrario( String contrario) {
        this.contrario=contrario;
    }

    public void setSinonimo( String sinonimo) {
        this.sinonimo=sinonimo;
    }
    public String  stampaDef(){
        return this.getParola() + " --> sinonimi: " + this.getSinonimo() + "; contrari : " + this.getContrario();
    }
}