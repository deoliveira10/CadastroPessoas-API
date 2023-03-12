package Desafios.desafioJavaAPI.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tb_endereco")
public class Endereco {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    @Column(name = "Logradouro")
    private String logradouro;
    @Column(name = "CEP")
    private int cep;

    @Column(name = "Numero")
    private int numero;
    @Column(name = "Cidade")
    private String cidade;


}
