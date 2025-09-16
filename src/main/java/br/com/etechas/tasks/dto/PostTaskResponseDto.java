package br.com.etechas.tasks.dto;
import br.com.etechas.tasks.entity.enums.StatusEnum;
import java.time.LocalDate;

public record PostTaskResponseDto (
        // Arthur Bonvecchio Batista
        // Gabriel Whanderson Silva de Castro
        String title,
        String description,
        String responsible,
        LocalDate dueDate
){

}
