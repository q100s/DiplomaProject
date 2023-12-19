package ru.skypro.homework.dto;

import lombok.Data;

import javax.validation.constraints.Size;

@Data
public class CreateOrUpdateAdDto {
    @Size(min = 4, max = 32)
    private String properties;
    @Size(max = 10_000_000)
    private Integer price;
    @Size(min = 8, max = 64)
    private String description;
}