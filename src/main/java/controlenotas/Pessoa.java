package controlenotas;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import lombok.Getter;

public abstract class Pessoa {
    @Getter
    private final int cod;
    @Getter
    private final String nome;

    /**
     * @param cod
     * @param nome
     */
    public Pessoa(final int cod, final String nome) {
	this.cod = cod;
	this.nome = nome;
    }

    @Override
    public String toString() {
	return ReflectionToStringBuilder.toString(this);
    }

}
