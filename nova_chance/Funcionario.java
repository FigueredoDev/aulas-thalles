// cSpell: disable
/*
1º - Criar a classe funcionario;
1.1 - Atributos: Nome, idade, data de nascimento, rg, cpf, titulo de eleitor, nome do pai, nome da mãe, rua, estado, pais
 estado civil, nivel de ensino, ultima profissão;
1.2 - Criar os metodos pertinentes a classe;
1.3 - Gerar get e set;
2º - Instanciar a classe e criar o objeto a partir da classe funcionario;
3º - Defina o conceito de herança.
4º - Defina o conceito de polimorfismo.
5º - Defina o conceito de encapsulamento.
6º - Defina Programação orientada a objetos. */

package nova_chance;

class Funcionario {
    String nome, dataNascimento, rg, cpf, tituloDeEleitor, pai, mae, rua, estado, pais, estadoCivil, nivelDeEnsino,
            ultimaProfissao;
    int idade;

    public Funcionario(String nome, String cpf, int idade) {
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTituloDeEleitor() {
        return tituloDeEleitor;
    }

    public void setTituloDeEleitor(String tituloDeEleitor) {
        this.tituloDeEleitor = tituloDeEleitor;
    }

    public String getPai() {
        return pai;
    }

    public void setPai(String pai) {
        this.pai = pai;
    }

    public String getMae() {
        return mae;
    }

    public void setMae(String mae) {
        this.mae = mae;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getNivelDeEnsino() {
        return nivelDeEnsino;
    }

    public void setNivelDeEnsino(String nivelDeEnsino) {
        this.nivelDeEnsino = nivelDeEnsino;
    }

    public String getUltimaProfissao() {
        return ultimaProfissao;
    }

    public void setUltimaProfissao(String ultimaProfissao) {
        this.ultimaProfissao = ultimaProfissao;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void validaSeMaiorDeIdade() {
        if (this.idade >= 18) {
            System.out.println("O Funcionario tem mais de 18 anos de idade");
        } else {
            System.out.println("O Funcionario tem menos de 18 anos de idade");
        }
    }

    public static void main(String[] args) {
        Funcionario funcionarioNovo = new Funcionario("Thalles Canela", "999.999.999-99", 23);
        System.out.println("CPF: " + funcionarioNovo.getCpf());

        System.out.println("Verificando se o funcionario é adulto....");
        funcionarioNovo.validaSeMaiorDeIdade();

    }
}