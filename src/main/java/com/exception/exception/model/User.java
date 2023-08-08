package com.exception.exception.model;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class User {
    private Long id;
    private String first_name;
    private String last_name;
    private String emailId;
    private String phoneNo;
}
