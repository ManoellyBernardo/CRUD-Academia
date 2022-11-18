package domain.dto;

import org.hibernate.validator.constraints.br.CPF;

import javax.validation.constraints.*;

public class PersonalTreinerDTO {

    @Min(50)
    @Max(100)
    @NotBlank(message = "Nome do Personal Trainer invalido.")
    private String nomeCompleto;
    @CPF(message = "CPF obrigatorio.")
    @NotBlank
    private String cpf;
    @NotBlank
    private String cref;
    @NotNull
    private Integer idade;
    @NotBlank
    private String telefone;
    @Email
    @NotBlank
    private String email;
    @NotBlank
    private String numeroCasa;
    @NotBlank
    private String rua;
    @NotBlank
    private String bairro;
    @NotBlank
    private String cidade;
    @NotNull
    private Double salario;

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCref() {
        return cref;
    }

    public void setCref(String cref) {
        this.cref = cref;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNumeroCasa() {
        return numeroCasa;
    }

    public void setNumeroCasa(String numeroCasa) {
        this.numeroCasa = numeroCasa;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }
}
