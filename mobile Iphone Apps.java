
public interface ReprodutorMusical {
    void reproduzir();
    void pausar();
    void avancar();
    void retroceder();
}

public class AparelhoTelefonico {
    private String numero;
    
    public AparelhoTelefonico(String numero) {
        this.numero = numero;
    }
    
    public void fazerChamada(String numeroDestino) {
        
    }
    
    public void receberChamada() {
        
    }
}

public class NavegadorBrowser {
    public void abrirURL(String url) {
        // Implementação para abrir uma URL
    }
    
    public void fechar() {
        // Implementação para fechar o navegador
    }
}
