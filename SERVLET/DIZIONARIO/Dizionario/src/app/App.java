package app;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//import javax.servlet.http.*;
public class App extends HttpServlet{
    Dizionario diz=new Dizionario();
    
    
    Definizione def;
    private static final long serialVersionUID = -3967314453512919811L;
    
    private String mymsg;
    public void init() throws ServletException 
    {     
        
        diz.addDef(new Definizione("bravo", "coraggioso, animoso", "contrario di bravo"));
        diz.addDef(new Definizione("cattivo", "sinonimo di cattivo", "contrario di cattivo")); 
        mymsg = "Http Servlet Dizionario";   
    }
    

    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException{
        // Setting up the content type of web page      
        res.setContentType("text/html");
        // Writing the message on the web page      
        PrintWriter out = res.getWriter();
        //String  string= req.getParameter("p") ;
        out.println("<h1>" + mymsg + "</h1>");
        out.println("<p>" + "Usa la chiave:" + "</p>");
        out.println("<p>" + "--'termine' per cercare sinonimi e contrari di una parola" + "</p>");
        out.println("<p>" + "--'sinonimo' per cercare i sinonimi di una parola" + "</p>");
        out.println("<p>" + "--'contrario' per cercare i contrari di una parola" + "</p>");
        out.println("<p>" + "--'lista' per visualizzare una lista completa dei termini inseriti" + "</p>");
        out.println("<p>" + "--'add' per aggiungere" + "</p>");
        String  termine = req.getParameter("termine") ;
        String  sinonimo = req.getParameter("sinonimo") ;
        String  contrario = req.getParameter("contrario") ;
        String  lista = req.getParameter("lista") ;
        
        if(termine!=null){ 
            if(sinonimo!=null||contrario!=null){ 
                if(sinonimo!=null){
                    out.println("<p>" + "Sinonimi: " + diz.getSin(termine) + "</p>");
                } 
                if(contrario!=null){  
                    out.println("<p>" + "Contrari: " + diz.getCon(termine) + "</p>");
                }
            }
            else{
                out.println("<p>" + diz.cerca(termine) + "</p>");
            } 
        }
        if(lista!=null){  
            out.println("<p>" + diz.stampa() + "</p>");
        }  
    }
    public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
        res.setContentType("text/html");
              
        PrintWriter out = res.getWriter();
        /*if(add!=null){
            //req.setAttribute("add", def = new Definizione(add));
            //diz.addDef(def);
            
            out.println("<p>" + "parola inserita" + "</p>");
        }*/
    }
}

