package br.com.etechas.tasks.mapper;

import br.com.etechas.tasks.dto.TaskResponseDTO;
import br.com.etechas.tasks.entity.Task;
import org.hibernate.sql.ast.tree.from.TableReference;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import javax.swing.*;
import java.util.List;

// definir qual o framework que esta utilizando
@Mapper(componentModel = "spring")
public interface TaskMapper {

    TaskMapper INSTANCE = Mappers.getMapper(TaskMapper.class);

    //converte uma lista de tarefa em tarefas dto
    List<TaskResponseDTO> toResponseDTOList(List<Task> tarefa);
}
