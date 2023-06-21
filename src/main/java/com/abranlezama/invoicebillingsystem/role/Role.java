package com.abranlezama.invoicebillingsystem.role;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class Role {
    private Long roleId;
    private String name;
    private String permission;
}
