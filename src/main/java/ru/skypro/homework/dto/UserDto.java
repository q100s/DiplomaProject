package ru.skypro.homework.dto;

import lombok.Data;
import ru.skypro.homework.model.Role;

@Data
public class UserDto {
    private Integer id;
    private String email;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private Role role;
    private String imageUrl;
}