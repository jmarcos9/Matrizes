package pooInterfceHeranca;

public interface BancoDados extends SqlDCL, SqlDDL, SqlDML {

    void abrirConexao();
    void fecharConexao();

}
