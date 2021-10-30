package com.ms.dtos;

import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

@Data
public class EmailDTO {

    @NotBlank
    private String ownerReferency;
    @NotBlank
    @Email
    private String emailTo;
    @Email
    private String copyTo;
    @NotBlank
    @Email
    private String emailFrom;
    @NotBlank
    private String subject;
    @NotBlank
    private String text;
}
