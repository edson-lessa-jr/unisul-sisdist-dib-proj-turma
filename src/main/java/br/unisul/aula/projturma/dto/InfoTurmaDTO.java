package br.unisul.aula.projturma.dto;

import java.util.ArrayList;
import java.util.List;

public class InfoTurmaDTO {
    private Long id;
    private String nomeTurma;
    private String nomeProfessor;
    private List<String> nomesAlunos;

    public InfoTurmaDTO() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomeTurma() {
        return nomeTurma;
    }

    public void setNomeTurma(String nomeTurma) {
        this.nomeTurma = nomeTurma;
    }

    public String getNomeProfessor() {
        return nomeProfessor;
    }

    public void setNomeProfessor(String nomeProfessor) {
        this.nomeProfessor = nomeProfessor;
    }

    public List<String> getNomesAlunos() {
        return nomesAlunos;
    }

    public void setNomesAlunos(List<String> nomesAlunos) {
        this.nomesAlunos = nomesAlunos;
    }

    public void setNomesAlunosConvert(List<DadosAlunoDTO> dadosAlunoNomes) {
        this.nomesAlunos= new ArrayList<>();
        for (int i = 0; i < dadosAlunoNomes.size(); i++) {
            this.nomesAlunos.add(dadosAlunoNomes.get(i).getNome());
        }
    }
}
