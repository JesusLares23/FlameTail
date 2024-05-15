/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validadores;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Lenovo
 */
public class Validadores {

    public Validadores() {
    }

    public boolean validaDoble(String numDoble) {
        String patron = "[-+]?[0-9]*\\.?[0-9]+([eE][-+]?[0-9]+)?";
        Pattern p = Pattern.compile(patron);
        Matcher matcher = p.matcher(numDoble);
        if (matcher.matches()) {
            return true;
        }
        return false;
    }

    public boolean validaTelefono(String tel) {
        String patron = "(\\((81|55|33)\\)[-]?([0-9][-]?){8})|((\\([0-9]{3})\\)[-]?([0-9][-]?){7})";
        Pattern p = Pattern.compile(patron);
        Matcher matcher = p.matcher(tel);
        if (matcher.matches()) {
            return true;
        }
        return false;
    }

    public boolean validaEmail(String email) {
        String patron = "^([a-zA-Z0-9_]|\\.(?:[^.])){1,20}@([a-zA-Z0-9_]|\\.(?:[^.])){1,20}$";
        Pattern p = Pattern.compile(patron);
        Matcher matcher = p.matcher(email);
        if (matcher.matches()) {
            return true;
        }
        return false;
    }

    public boolean validaApodo(String apodo) {
        String patron = "^([A-Za-z0-9_]){5,20}$";
        Pattern p = Pattern.compile(patron);
        Matcher matcher = p.matcher(apodo);
        if (matcher.matches()) {
            return true;
        }
        return false;
    }

    public boolean validaNombre(String nombre) {
        String patron = "^([A-Za-z ]){1,35}$";
        Pattern p = Pattern.compile(patron);
        Matcher matcher = p.matcher(nombre);
        if (matcher.matches()) {
            return true;
        }
        return false;
    }

    public boolean validaContrasena(String contra) {
        String patron = "^(?i)(?=.*[a-z])(?=.*[0-9])[a-z0-9#.!@$*&_]{8,20}$";
        Pattern p = Pattern.compile(patron);
        Matcher matcher = p.matcher(contra);
        if (matcher.matches()) {
            return true;
        }
        return false;
    }
}
