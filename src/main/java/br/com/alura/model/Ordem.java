package br.com.alura.model;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Ordem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Double preco;

    private String tipo;

    private LocalDateTime data;

    private String status;

    @Column(name = "user_id")
    private Long userId;

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}
