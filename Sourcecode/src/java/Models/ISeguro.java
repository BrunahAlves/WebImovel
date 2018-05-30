package Models;

/**
 *
 * @author Guilherme
 */
public interface ISeguro {
    public double calcularImposto();
    public String getTipoImovel();
    public double getValorImovel();
    public float getPorcentagem();
    public void setPorcentagem(float porcentagem);
    public void setTipoImovel(String tipoImovel);
    public void setValorImovel(double valorImovel);
    public String getStatus();
    public void setStatus(String status);
}
