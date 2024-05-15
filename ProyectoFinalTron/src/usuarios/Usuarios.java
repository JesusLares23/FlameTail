/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usuarios;

import java.util.Objects;

/**
 *
 * @author Lenovo
 */
public class Usuarios {

    private String apodo;
    private String nombre;
    private String contra;
    private String email;
    private int score;

    public Usuarios() {
        this.score = 0;
    }

    public Usuarios(String apodo, String nombre, String contra, String email) {
        this.apodo = apodo;
        this.nombre = nombre;
        this.contra = contra;
        this.email = email;
        this.score = 0;
    }

    public String getApodo() {
        return apodo;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String toString() {
        return "Usuario(" + "apodo = " + apodo + ", nombre = " + nombre + ", contraseña = " + contra + ", email = " + email + ", score = " + score + ')';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + Objects.hashCode(this.apodo);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Usuarios other = (Usuarios) obj;
        if (!Objects.equals(this.apodo, other.apodo)) {
            return false;
        }
        return true;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
