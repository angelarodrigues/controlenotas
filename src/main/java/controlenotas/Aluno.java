package controlenotas;

import lombok.Getter;
import lombok.Setter;

public class Aluno extends Pessoa {

    @Getter
    @Setter
    private int matricula;
    @Getter
    @Setter
    private String curso;
    private Disciplina disciplina;

    public Aluno(final int cod, final String nome) {
	super(cod, nome);
    }

}
