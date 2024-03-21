package main.java.org.entities;

public class Login {

    //-----===| ATRIBUTOS |===-----//
    private Long cpf;

    //-----===| Construtor |===-----//
    public Login() {}

    public Login(Long cpf) {
        this.cpf = cpf;
    }

    //-----===| Getters e Setters |===-----//
    
    public Long getCpf() {
        return cpf;
    }

    public void setCpf(Long cpf) {
        this.cpf = cpf;
    }
}
