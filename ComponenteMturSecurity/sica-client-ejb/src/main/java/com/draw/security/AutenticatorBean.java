package com.draw.security;

import javax.ejb.Stateless;

/**
 * Created by cesardraw on 22/02/17.
 */
@Stateless
public class AutenticatorBean implements Autenticator {
    public AutenticatorBean() {
    }

    public String testar(){
        return "Funcionou!";
    }
}
