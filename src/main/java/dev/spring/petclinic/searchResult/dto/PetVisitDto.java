package dev.spring.petclinic.searchResult.dto;

import lombok.Builder;
import lombok.Getter;

import java.time.LocalDate;

@Builder
@Getter
public class PetVisitDto {
    private int id;
    private int petId;
    private LocalDate visitDate;
    private String description;
}
