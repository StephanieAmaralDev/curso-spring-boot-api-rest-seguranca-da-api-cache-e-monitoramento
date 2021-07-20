package br.com.alura.forum.repository;

import br.com.alura.forum.modelo.Topico;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface TopicoRepository extends JpaRepository<Topico, Long> {

    //underline em caso de ambiguidade nos casos de nomes iguais em RELACIONAMENTO e tudo junto entre atributos.
    //List<Topico> findByCurso_Nome(String nomeCurso);

    Page<Topico> findByCursoNome(String nomeCurso, Pageable paginacao);


    //Não segue o padrão
    // @Query("SELECT t FROM topico t WHERE t.curso.nome = :nomeCurso")
    //List<Topico> carregarPorNome(@Param("nomeCurso")String nomeCurso);
}
