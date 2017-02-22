package com.draw;

/**
 * Created by cesardraw on 22/02/17.
 */
import java.util.Properties;
import javax.ejb.EJB;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import com.draw.security.Autenticator;
import com.draw.security.AutenticatorBean;



public class Teste {
    //private final Context context;

    @EJB
    private Autenticator autenticator;

    public Teste() throws NamingException {
    }

    public String testar() throws NamingException{
        return autenticator.testar();
    }

}
