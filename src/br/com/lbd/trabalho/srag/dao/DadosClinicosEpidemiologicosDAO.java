package br.com.lbd.trabalho.srag.dao;

import br.com.lbd.trabalho.srag.factory.ConnectionFactory;
import br.com.lbd.trabalho.srag.modelo.DadosClinicosEpidemiologicos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author lsnascimento
 */
public class DadosClinicosEpidemiologicosDAO {

    private Connection connection;

    public DadosClinicosEpidemiologicosDAO() {
        this.connection = new ConnectionFactory().getConnection();
    }

    public void inserir(DadosClinicosEpidemiologicos dce) {
        String sql = "INSERT INTO public.dados_clinicos_epidemiologicos(historico_viagem, pais, local, data_viagem, data_retorno, proveniente_surto, caso_nosocomial, contato_direto, contato_direto_especificacao,"
                + " fator_risco, vacina_gripe, data_vacinacao, mae_vacinou, data_vacinacao_mae, amamenta, data_dose_unica, data_primeira_dose, data_segunda_dose)"
                + " VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try (PreparedStatement ps = connection.prepareStatement(sql)) {
            ps.setString(1, dce.getHistoricoViagem());
            ps.setString(2, dce.getPais());
            ps.setString(3, dce.getLocal());
            ps.setDate(4, dce.getDataViagem());
            ps.setDate(5, dce.getDataRetorno());
            ps.setString(6, dce.getProvenienteSurto());
            ps.setString(7, dce.getCasoNosocomial());
            ps.setString(8, dce.getContatoDireto());
            ps.setString(9, dce.getContatoDiretoEspecificacao());
            ps.setString(10, dce.getFatorRisco());
            ps.setString(11, dce.getVacinaGripe());
            ps.setDate(12, dce.getDataVacinacao());
            ps.setString(13, dce.getMaeVacinou());
            ps.setDate(14, dce.getDataVacinacaoMae());
            ps.setString(15, dce.getAmamenta());
            ps.setDate(16, dce.getDataDoseUnica());
            ps.setDate(17, dce.getDataPrimeiraDose());
            ps.setDate(18, dce.getDataSegundaDose());
            ps.execute();
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }

}
