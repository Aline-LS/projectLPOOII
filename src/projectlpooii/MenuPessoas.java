/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectlpooii;

import InterfacesIntrodutorias.IntoducaoCadastro;
import UserPessoa.Aluno;
import UserPessoa.ListaArrays;
import UserPessoaFuncionario.Auxiliar;
import UserPessoaFuncionario.Gestor;
import UserPessoaFuncionario.OutroFuncionario;
import UserPessoaFuncionario.Professor;
import UserPessoaFuncionario.Tecnico;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Emilio
 */
public class MenuPessoas {

    int menupessoa;
    String entrada;
    private String nome;
    private String usertyper;
    private String usertype;
    private String cpf;
    private Date datanasc;
    private String sexo;

    public MenuPessoas(int menupessoa) {
        this.menupessoa = menupessoa;
    }

    public int MostrarMenuPessoas() {
        do {

            boolean numeros;
            do {
                // menu principal apresentará 5 opção que o usuário pode escolher, sendo que quando o numero 5 é digitado o sistema finaliza
                 entrada = JOptionPane.showInputDialog("=====Cadastramento de Pessoas===== \n "
                        + "Qual tipo de Pessoa deseja cadastrar? \n \n"
                        + "1 - Introdução ao Sistema \n "
                        + "2 - Cadastro de Aluno  \n "
                        + "3 - Cadastro de Auxiliar \n "
                        + "4 - Cadastro de Gestor \n "
                        + "5 - Cadastro de Professor \n "
                        + "6 - Cadastro de Tecnico \n "
                        + "7 - Cadastro de Outro Funcionario \n "
                        + "8 - Sair");
                if (entrada == null) {
                    JOptionPane.showMessageDialog(null, "Finalizando Sistema", "Saindo...", JOptionPane.INFORMATION_MESSAGE);
                    System.exit(0);

                }
                 numeros = true;
                if (!entrada.matches("\\d+")) {
                    numeros = false;
                }
                } while (!numeros);

                //condição da opções
                
                if ("".equals(entrada)) {

                }

                menupessoa = Integer.parseInt(entrada);

            switch (menupessoa) {
                case 1:
                    // pequena explicação do sistema e apos lido o usuário retorna ao menu principal
                    //JOptionPane.showMessageDialog(null,"Este é um sistema na qual faz cadastramento de Pessoas, Você pode escolher dentre as opções: \n 1 - Professor \n 2 - Gestor \n 3 - Auxiliar \n 4 - Outro tipo de Funcionario");
                    //MenuPessoas mpe = new MenuPessoas(1);
                    //mpe.MostrarMenuPessoas();   
                    IntoducaoCadastro intoducaoCadastro = new IntoducaoCadastro();
                    intoducaoCadastro.Introducao();
                    break;
                case 2:
                    //chamar cadastro Aluno
                    Aluno aluno = new Aluno(usertyper, nome, cpf, datanasc, sexo);
                    aluno.MostrarDados();
                    ListaArrays.adicionaraluno(aluno);
                    break;
                case 3:
                    //chamar cadastro Professor
                    Auxiliar auxiliar = new Auxiliar(usertyper, usertype, nome, cpf, datanasc, sexo);
                    auxiliar.MostrarDados();
                    ListaArrays.adicionarauxiliar(auxiliar);
                    break;
                case 4:
                    //chamar cadastro Gestor
                    Gestor gestor = new Gestor(usertyper, usertype, nome, cpf, datanasc, sexo);
                    gestor.MostrarDados();
                    ListaArrays.adicionargestor(gestor);
                    break;
                case 5:
                    //chamar cadastro Professor
                    Professor professor = new Professor(usertyper, usertype, nome, cpf, datanasc, sexo);
                    professor.MostrarDados();
                    ListaArrays.adicionarprofessor(professor);
                    break;
                case 6:
                    //chamar cadastro Tecnico
                    Tecnico tecnico = new Tecnico(usertyper, usertype, nome, cpf, datanasc, sexo);
                    tecnico.MostrarDados();
                    ListaArrays.adicionartecnico(tecnico);
                    break;
                case 7:
                    //chamar cadastro Outro tipo de funcionario
                    OutroFuncionario outrofuncionario = new OutroFuncionario(usertyper, usertype, nome, cpf, datanasc, sexo);
                    outrofuncionario.MostrarDados();
                    ListaArrays.adicionaroutrofuncionario(outrofuncionario);
                    break;
                case 8:
                    //finaliza sistema
                    JOptionPane.showMessageDialog(null, "Retornando ao Menu Principal");
                    System.out.println("Retornando ao Menu Principal");
                    break;
                default:
                    //informara que foi digitado uma opçãoo que não esta dentro das condições
                    System.out.println("Opção inválida");
                    JOptionPane.showMessageDialog(null, "opção inválida");
            }
        } while (menupessoa != 8);

        return menupessoa;

    }

}

