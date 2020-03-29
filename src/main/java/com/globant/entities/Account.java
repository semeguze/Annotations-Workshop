package com.globant.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * Entity tat represents an Account
 */

@Getter
@Setter
@AllArgsConstructor
public class Account {
    private String username;
    private String password;
}
