package org.ensa.ensacustomerservice.dto;

import lombok.*;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CustomerRequestDTO {
    private String id;
    private String name;
    private String email;
}
