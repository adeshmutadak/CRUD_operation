package com.example.Practice.CRUD_operation.model;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

import java.security.PrivateKey;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Model {

    private int turfID;
    @NotNull(message = "Name cannot be empty")
    @Length(min = 4 ,max = 20,message = "Name shuold be in 4 and 20 letters")
    private String turfName;
    private String  turfAddress;

    // @Pattern(regexp = "^([1-9]|1[0-2])$",message = "enter correct Number")
    private String number;
    private String ownerName;


}
