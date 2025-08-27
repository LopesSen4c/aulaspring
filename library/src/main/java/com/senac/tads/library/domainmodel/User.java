package com.senac.tads.library.domainmodel;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
public class User{
    private @Setter
    @Getter UUID id;
    private @Setter @Getter String name;
    private @Setter @Getter String email;
    private @Setter @Getter String password;


}