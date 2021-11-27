package br.com.lbd.trabalho.srag.modelo;

import java.sql.Date;

/**
 *
 * @author lsnascimento
 */
public class DadosClinicosEpidemiologicos {

    private Long id;
    private String historicoViagem;
    private String pais;
    private String local;
    private Date dataViagem;
    private Date dataRetorno;
    private String provenienteSurto;
    private String casoNosocomial;
    private String contatoDireto;
    private String contatoDiretoEspecificacao;
    private String fatorRisco;
    private String vacinaGripe;
    private Date dataVacinacao;
    private String maeVacinou;
    private Date dataVacinacaoMae;
    private String amamenta;
    private Date dataDoseUnica;
    private Date dataPrimeiraDose;
    private Date dataSegundaDose;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getHistoricoViagem() {
        return historicoViagem;
    }

    public void setHistoricoViagem(String historicoViagem) {
        this.historicoViagem = historicoViagem;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public Date getDataViagem() {
        return dataViagem;
    }

    public void setDataViagem(Date dataViagem) {
        this.dataViagem = dataViagem;
    }

    public Date getDataRetorno() {
        return dataRetorno;
    }

    public void setDataRetorno(Date dataRetorno) {
        this.dataRetorno = dataRetorno;
    }

    public String getProvenienteSurto() {
        return provenienteSurto;
    }

    public void setProvenienteSurto(String provenienteSurto) {
        this.provenienteSurto = provenienteSurto;
    }

    public String getCasoNosocomial() {
        return casoNosocomial;
    }

    public void setCasoNosocomial(String casoNosocomial) {
        this.casoNosocomial = casoNosocomial;
    }

    public String getContatoDireto() {
        return contatoDireto;
    }

    public void setContatoDireto(String contatoDireto) {
        this.contatoDireto = contatoDireto;
    }

    public String getContatoDiretoEspecificacao() {
        return contatoDiretoEspecificacao;
    }

    public void setContatoDiretoEspecificacao(String contatoDiretoEspecificacao) {
        this.contatoDiretoEspecificacao = contatoDiretoEspecificacao;
    }

    public String getFatorRisco() {
        return fatorRisco;
    }

    public void setFatorRisco(String fatorRisco) {
        this.fatorRisco = fatorRisco;
    }

    public String getVacinaGripe() {
        return vacinaGripe;
    }

    public void setVacinaGripe(String vacinaGripe) {
        this.vacinaGripe = vacinaGripe;
    }

    public Date getDataVacinacao() {
        return dataVacinacao;
    }

    public void setDataVacinacao(Date dataVacinacao) {
        this.dataVacinacao = dataVacinacao;
    }

    public String getMaeVacinou() {
        return maeVacinou;
    }

    public void setMaeVacinou(String maeVacinou) {
        this.maeVacinou = maeVacinou;
    }

    public Date getDataVacinacaoMae() {
        return dataVacinacaoMae;
    }

    public void setDataVacinacaoMae(Date dataVacinacaoMae) {
        this.dataVacinacaoMae = dataVacinacaoMae;
    }

    public String getAmamenta() {
        return amamenta;
    }

    public void setAmamenta(String amamenta) {
        this.amamenta = amamenta;
    }

    public Date getDataDoseUnica() {
        return dataDoseUnica;
    }

    public void setDataDoseUnica(Date dataDoseUnica) {
        this.dataDoseUnica = dataDoseUnica;
    }

    public Date getDataPrimeiraDose() {
        return dataPrimeiraDose;
    }

    public void setDataPrimeiraDose(Date dataPrimeiraDose) {
        this.dataPrimeiraDose = dataPrimeiraDose;
    }

    public Date getDataSegundaDose() {
        return dataSegundaDose;
    }

    public void setDataSegundaDose(Date dataSegundaDose) {
        this.dataSegundaDose = dataSegundaDose;
    }

}
