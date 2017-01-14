/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wineshoppalette;
import java.util.Vector;


public class Carello {
    private Vector<Vino> prodotti;
    
    public Carello(){
        this.prodotti = new Vector<Vino>();
    }

    public Vector<Vino> getProdotti() {
        return prodotti;
    }
    
    public void addProdotto(Vino p){
        if(p != null){
            prodotti.add(p);
        }
        
    }
    
    public void removeProdotto(Vino p){
        for(int i=0;i<this.prodotti.size();i++){
            if(this.prodotti.elementAt(i).getNome().equals(p.getNome()))
                prodotti.remove(p);
        }
    }
    
    public double getCostoTotale(){
        double totale=0;
        for(int i=0; i<this.prodotti.size();i++){
            totale += this.prodotti.elementAt(i).getPrezzo();
        }
        return totale;
          
    }
    
}

