
package app; 
import java.util.ArrayList;
public class Dizionario{
    private ArrayList<Definizione> dizionario;
    public Dizionario(){
        dizionario = new ArrayList<Definizione>();
    }
    public void addDef(Definizione definizione){
        dizionario.add(definizione);
    }
    public void addDef(String parola){
        dizionario.add(new Definizione(parola));
    }
    public String cerca(String parola){
        for(int i=0; i<dizionario.size(); i++){
            if(dizionario.get(i).getParola().equals(parola)){
                return dizionario.get(i).stampaDef();    
            }
        }
        return ("parola non trovata");
    }
    public String getSin(String parola){
        for(int i=0; i<dizionario.size(); i++){
            if(dizionario.get(i).getParola().equals(parola)){
                return dizionario.get(i).getSinonimo();   
            }
        }
        return ("parola non trovata");
    }
    public String getCon(String parola){
        for(int i=0; i<dizionario.size(); i++){
            if(dizionario.get(i).getParola().equals(parola)){
                return dizionario.get(i).getContrario();   
            }
        }
        return ("parola non trovata");
    }
    public String stampa(){
        String result = "";
        for(int i=0; i<dizionario.size(); i++){
            result += dizionario.get(i).stampaDef()  + "</br>";
        }
        return result;
    }
}