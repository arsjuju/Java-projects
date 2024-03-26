package pkg3d_juliana_a1;

/**
 *
 * @author 357510
 */
public class Apartamento {

    public int numero;
    public int torre;
    public Contrato contrato;
    public Porteiro porteiro;
    public Morador morador;
    public Visitante visitante;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getTorre() {
        return torre;
    }

    public void setTorre(int torre) {
        this.torre = torre;
    }

    public Contrato getContrato() {
        return contrato;
    }

    public void setContrato(Contrato contrato) {
        this.contrato = contrato;
    }

    public Porteiro getPorteiro() {
        return porteiro;
    }

    public void setPorteiro(Porteiro porteiro) {
        this.porteiro = porteiro;
    }

    public Morador getMorador() {
        return morador;
    }

    public void setMorador(Morador morador) {
        this.morador = morador;
    }

    public Visitante getVisitante() {
        return visitante;
    }

    public void setVisitante(Visitante visitante) {
        this.visitante = visitante;
    }

    public Apartamento(int numero, int torre, Contrato contrato, Porteiro porteiro, Morador morador, Visitante visitante) {
        this.numero = numero;
        this.torre = torre;
        this.contrato = contrato;
        this.porteiro = porteiro;
        this.morador = morador;
        this.visitante = visitante;
    }

    @Override
    public String toString() {
        return "\n-----------------------------------"
                + "\nDADOS DO APARTAMENTO"
                + "\n-----------------------------------"
                + "\nNúmero: " + getNumero()
                + "\nTorre: " + getTorre()
                + "\nContrato: " + getContrato()
                + "\nPorteiro: " + getPorteiro()
                + "\nMorador: " + getMorador()
                + "\nVisitante: " + getVisitante();
    }
}
