package com.example;

public class Main {

    public static void main(String[] args) {

        Cracha cracha1 = new Cracha(1, "15/05/2068");
        Cracha cracha2 = new Cracha(2, "19/12/2078");
        Funcionario funcionario1 = new Funcionario("Auxiliar geral", cracha1, "Marcos");
        Funcionario funcionario2 = new Funcionario("Auxiliar quase geral", cracha2, "Rodolfo");

        funcionario1.exibirFuncionario();
        funcionario2.exibirFuncionario();

        Prontuario prontuario = new Prontuario("Nenhuma", 158, "O+");
        Paciente paciente = new Paciente(19, "Joseias", prontuario);

        paciente.exibirPaciente();

        Endereco endereco = new Endereco("Jardim dos Palmares", "Cianorte", 288, "Nova Florenca");
        Casa casa = new Casa("Vermelho", endereco, 9);

        casa.exibirCasa();

        CNPJ cnpj = new CNPJ(15151515, "ativo");
        Empresa empresa = new Empresa(cnpj, "Mercado Dona Iracema", "Vender");

        empresa.exibirEmpresa();

        Perfil perfil = new Perfil("Paz e amor", "Sonic de meia", false);
        Usuario usuario = new Usuario("marilene@gmail.com", "marilene123", perfil);

        usuario.exibiUsuario();
    }
}
