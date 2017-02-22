package com.draw.security;

import javax.ejb.Local;
import javax.ejb.Remote;
import java.io.Serializable;

/**
 * Created by cesardraw on 22/02/17.
 */
@Local
public interface Autenticator extends Serializable{
    public String testar();
}
