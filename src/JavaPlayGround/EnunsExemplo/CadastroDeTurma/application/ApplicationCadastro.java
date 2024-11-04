package JavaPlayGround.EnunsExemplo.CadastroDeTurma.application;

import JavaPlayGround.EnunsExemplo.CadastroDeTurma.entities.Cadastro;
import JavaPlayGround.EnunsExemplo.CadastroDeTurma.entities.Enuns.Turno;

import java.util.ArrayList;
import java.util.List;

public class ApplicationCadastro {
    public static void main(String[] args) {

        Cadastro c = new Cadastro("Yuri", "Yuri@gmail.com", 20, Turno.MANHA);
        Cadastro c1 = new Cadastro("Yuri", "Yuri@gmail.com", 20, Turno.TARDE);
        Cadastro c2 = new Cadastro("Yuri", "Yuri@gmail.com", 20, Turno.TARDE);

        List<Cadastro> cadastros = new ArrayList<>();

        cadastros.add(c);
        cadastros.add(c1);
        cadastros.add(c2);

        for (Cadastro ca : cadastros) {
            if (ca.getTurno().equals("TARDE")){
                System.out.println(ca);
            }
        }

    }
}
