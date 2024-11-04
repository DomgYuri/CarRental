package JavaPlayGround.EnunsExemplo.CadastroDeTurma.entities;

import JavaPlayGround.EnunsExemplo.CadastroDeTurma.entities.Enuns.Turno;

public class Cadastro {

    private String name;

    private String email;

    private Integer idade;

    private Turno turno;

    public Cadastro(String name, String email, Integer idade, Turno turno) {
        this.name = name;
        this.email = email;
        this.idade = idade;
        this.turno = turno;
    }

    public Turno getTurno() {
        return turno;
    }

    public void setTurno(Turno turno) {
        this.turno = turno;
    }

    @Override
    public String toString() {
        return "Name: " + name +
                " Age: " + idade +
                " E-mail: " + email +
                " Turno: " + turno;
    }
}
