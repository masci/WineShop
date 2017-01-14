package wineshoppalette;

public class Vino {
    private String nome;
    private double prezzo;
    private int pezziDisponibili;


    private boolean bianco;
    private boolean rosso;


    
    public Vino(String nome, int pezziDisponibili, double prezzo, boolean bianco, boolean rosso){
        if(nome != null)
            this.nome = nome;
        else
            throw new IllegalArgumentException("nome cannot be null");
        this.pezziDisponibili = pezziDisponibili;
        if(prezzo > 0)
            this.prezzo = prezzo;
        else
            throw new IllegalArgumentException("prezzo cannot be < 0");
        this.bianco = bianco;
        this.rosso = rosso;

        
    }

    public String getNome() {
        return nome;
    }

    public double getPrezzo() {
        return prezzo;
    }

    
    public boolean isBianco() {
        return bianco;
    }

    public boolean isRosso() {
        return rosso;
    }
    
    public int getPezziDisponibili() {
        return pezziDisponibili;
    }

    

}
