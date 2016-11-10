package domino.vista;

import domino.model.Fitxa;
import domino.model.Joc;
import domino.model.Jugador;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Scanner;

public class VistaText {
    
    Scanner lector=new Scanner(System.in);
    
    public void imprimirDadesTorn (int torn, String nom){
        System.out.println("Torn: "+torn+"\t\t\t\t Jugador: "+nom);
    }
    
    public void mostrarTaulell(ArrayDeque<Fitxa> fitxesJugades){
        StringBuilder sb= new StringBuilder();
        sb.append("-");
        for(Fitxa fitxa: fitxesJugades){
                sb.append(fitxa.getValors()[0]);
                sb.append(":");
                sb.append(fitxa.getValors()[1]);
                sb.append("-");
        }
        System.out.println(sb);
    }
    
    public void mostrarMa(List<Fitxa> fitxesJugador){
        StringBuilder sb= new StringBuilder();
        for (Fitxa fitxa : fitxesJugador) {
            sb.append(fitxa.getValors()[0]);
                sb.append(":");
                sb.append(fitxa.getValors()[1]);
                sb.append("-");
        }
        System.out.println(sb);
    }
    
    public int menuJugada(){
        do{
            System.out.println("Que vols fer?\n"
                            + "1.-Col·locar una fitxa.\n"
                            + "2.-Col·locar dues dobles\n"
                            + "3.-Passar.");
            
        }while(validarMenu(lector.nextInt()));

        return lector.nextInt();
    }
    
    public int introduirFitxa(List<Fitxa> fitxa){
        do{
            System.out.println("Quina fitxa vols col·locar?(Introdueix posicio)");    
        }while(validarFitxa(lector.nextInt(), fitxa.size()));
        
        return lector.nextInt()-1;
    }
    //Acabar/////////////////////////////
    public int introduirDobles(List<Fitxa> fitxa){
        do{
            System.out.println("Quines fitxes dobles vols col·locar?(Introdueix les posicions)");    
        }while(validarFitxa(lector.nextInt(), fitxa.size()));
        
        return lector.nextInt()-1;
    }
    
    public void introduirPosicio(){
        System.out.println("Vols col·locar");
    }
    
    private boolean validarMenu(int num){
        
        if(num>0 && num<3){
            return false;
        }
        
        return true;
    }
    
    private boolean validarFitxa(int num, int longitud){
        
        if(num>0 && longitud<3){
            return false;
        }
        
        return true;
    }
    
    
    
}
