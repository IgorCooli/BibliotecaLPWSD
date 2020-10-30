/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

import br.cesjf.bibliotecalpwsd.model.Assunto;
import br.cesjf.bibliotecalpwsd.model.Autor;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author igorcooli
 */
public class LivroAcervoDto {
    
    private Long id;
    private String titulo;
    private String capa;
    private String arquivo;
    private Integer ano;
    private List<Autor> autores;
    private List<Assunto> assuntos;

    public LivroAcervoDto() {
    }

    public LivroAcervoDto(Long id, String titulo, String capa, String arquivo, Integer ano, List<Autor> autores, List<Assunto> assuntos) {
        this.id = id;
        this.titulo = titulo;
        this.capa = capa;
        this.arquivo = arquivo;
        this.ano = ano;
        this.autores = autores;
        this.assuntos = assuntos;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCapa() {
        return capa;
    }

    public void setCapa(String capa) {
        this.capa = capa;
    }

    public String getArquivo() {
        return arquivo;
    }

    public void setArquivo(String arquivo) {
        this.arquivo = arquivo;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public List<Autor> getAutores() {
        return autores;
    }

    public void setAutores(List<Autor> autores) {
        this.autores = autores;
    }

    public List<Assunto> getAssuntos() {
        return assuntos;
    }

    public void setAssuntos(List<Assunto> assuntos) {
        this.assuntos = assuntos;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.id);
        hash = 29 * hash + Objects.hashCode(this.titulo);
        hash = 29 * hash + Objects.hashCode(this.capa);
        hash = 29 * hash + Objects.hashCode(this.arquivo);
        hash = 29 * hash + Objects.hashCode(this.ano);
        hash = 29 * hash + Objects.hashCode(this.autores);
        hash = 29 * hash + Objects.hashCode(this.assuntos);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final LivroAcervoDto other = (LivroAcervoDto) obj;
        if (!Objects.equals(this.titulo, other.titulo)) {
            return false;
        }
        if (!Objects.equals(this.capa, other.capa)) {
            return false;
        }
        if (!Objects.equals(this.arquivo, other.arquivo)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.ano, other.ano)) {
            return false;
        }
        if (!Objects.equals(this.autores, other.autores)) {
            return false;
        }
        if (!Objects.equals(this.assuntos, other.assuntos)) {
            return false;
        }
        return true;
    }

    
    
}
