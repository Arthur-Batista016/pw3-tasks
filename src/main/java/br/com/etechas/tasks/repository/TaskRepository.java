package br.com.etechas.tasks.repository;

import br.com.etechas.tasks.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TaskRepository  extends JpaRepository<Task, Long> {
    //@Query("select t from Tarefa t where t.id =:id and " + "t.status = br.com.etechas.tasks.entity.enums.StatusEnum.PENDING")
    //Optional<Task> findByIdAndPending(Long id);
}
