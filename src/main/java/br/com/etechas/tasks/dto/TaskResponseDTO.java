package br.com.etechas.tasks.dto;

import br.com.etechas.tasks.entity.enums.StatusEnum;

import java.time.LocalDate;

public record TaskResponseDTO(
        Long id,
        String title,
        String responsible,
        LocalDate dueDate,
        StatusEnum status

) {
}
