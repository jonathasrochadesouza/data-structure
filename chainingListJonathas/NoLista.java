package chainingListJonathas;

/**
 * @author Jonathas Rocha
 */
public class NoLista {
    
    private Integer info;
    private NoLista prox;
    
    public NoLista() {
        this(null, null);
    }
    
    /**
     *
     * @param info
     * @param prox
     */
    public NoLista(Integer info, NoLista prox) {
        this.info = info;
        this.prox = prox;
    }

    public Integer getInfo() {
        return info;
    }

    public void setInfo(Integer info) {
        this.info = info;
    }

    public NoLista getProx() {
        return prox;
    }

    public void setProx(NoLista prox) {
        this.prox = prox;
    }
}
