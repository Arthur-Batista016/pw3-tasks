package br.com.etechas.tasks.services;

import br.com.etechas.tasks.entity.Task;
import br.com.etechas.tasks.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {

    @Autowired
    private TaskRepository repository;

    public List<Task> findTasks(){
        List<Task> result = repository.findAll();
        return result;
    }


}
