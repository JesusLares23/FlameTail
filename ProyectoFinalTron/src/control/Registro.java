/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;

/**
 *
 * @author Lenovo
 */
public class Registro extends AccesoAleatorio {
    
    public Registro(String nomArchivo, int tamRegistro) {
        super(nomArchivo, tamRegistro);
    }

    public Registro(String nomArchivo) {
        super(nomArchivo, 236);
    }

    public Usuarios leeUsuario() throws IOException {
        Usuarios usuario = new Usuarios();
        usuario.setApodo(leeString(20));
        usuario.setNombre(leeString(35));
        usuario.setEmail(leeString(41));
        usuario.setContra(leeString(20));
        usuario.setScore(archivo.readInt());
        return usuario;
    }

    public void escribeUsuario(Usuario usuario) throws IOException {
        escribeString(usuario.getApodo(), 20);
        escribeString(usuario.getNombre(), 35);
        escribeString(usuario.getEmail(), 41);
        escribeString(usuario.getContra(), 20);
        archivo.writeInt(usuario.getScore());
    }

    public Usuarios obten(Usuarios usuario) throws Exception {
        Usuarios usuarioLeido;

        try {
            archivo = new RandomAccessFile(nomArchivo, "r");
        } catch (FileNotFoundException fnfe) {
            throw new Exception("Archivo inexistente");
        }
        try {
            while (true) {
                usuarioLeido = leeUsuario();

                if (usuario.equals(usuarioLeido)) {
                    return usuarioLeido;
                }
            }
        } catch (EOFException eofe) {
            return null;

        } catch (IOException ioe) {
            throw new Exception("No se puede obtener el usuario", ioe);

        } finally {
            try {
                archivo.close();
            } catch (IOException ioe) {
                throw new Exception("Error al cerrar el archivo", ioe);
            }
        }
    }

    public void agrega(Usuarios usuario) throws Exception {
        Usuarios usuarioAux = null;
        try {
            usuarioAux = obten(usuario);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
        if (usuarioAux != null) {

            if (usuario.equals(usuarioAux)) {
                throw new Exception("El nombre del usuario ya esta registrado");

            } else {
                throw new Exception("El correo ya esta registrado");
            }
        }

        try {
            archivo = new RandomAccessFile(nomArchivo, "rw");

        } catch (FileNotFoundException fnfe) {
            throw new Exception("Archivo inexistente");
        }

        try {

            archivo.seek(arhcivo.lenght());

            escribeUsuario(usuario);
        } catch (IOException ioe) {
            throw new Exception("No se puede registrar al usuario");
        } finally {
            try {
                archivo.close();
            } catch (IOException ioe) {
                throw new Exception("Error al cerrar el archivo");
            }
        }
    }

    public void actualiza(Usuarios usuario) throws Exception {
        Usuarios usuarioLeido;
        try {
            archivo = new RandomAccessFile(nomArchivo, "rw");

        } catch (FileNotFoundException fnfe) {
            throw new Exception("No existe la lista de usuarios", fnfe);

        }
        try {
            while (true) {
                usuarioLeido = leeUsuario();
                if (usuario.equals(usuarioLeido)) {
                    arhcivo.seek(archivo.getFilePointer() - tamRegistro);
                    escribeUsuario(usuario);
                    break;
                }
            }
        } catch (EOFEXception eofe) {
            throw new Exception("El usuario no existe", eofe);
        } catch (IOException ioe) {
            throw new Exception("Error al cerrar el catalogo de usuario", ioe);
        }
    }

    public void elimina(Usuarios usuario) throws Exception {
        Usuarios usuarioLeido;
        try {
            archivo = new RandomAccessFile(nomArchvio, "rw");
        } catch (FileNotFoundException fnfe) {
            throw new Exception("No existe el archivo de usuarios", fnfe);
        }
        try {
            while (true) {
                usuarioLeido = leeUsuario();
                if (usuario.equals(usuarioLeido)) {
                    arhcivo.seek(archivo.getFilePointer() - tamRegistro);
                    borraRegistro();
                    empaca();
                    break;
                }
            }
        } catch (EOFEXception eofe) {
            throw new Exception("El usuario no existe", eofe);
        } catch (IOException ioe) {
            throw new Exception("No se puede eliminar al usuario", ioe);
        } finally {
            try {
                archivo.close();
            } catch (IOException ioe){
                throw new Exception("Error al cerrar el archivo", ioe);
            }
        }
    }
    
    public ArrayList<Usuarios> lista() throws Exception {
        ArrayList<Usuarios> lista = new ArrayList<>();
        Usuarios usuario;
        try {
            archivo = new RandomAccessFile(nomArchivo, "r");
        
        } catch(FileNotFoundException fnfe){
            throw new FileNotFoundException("Archivo inexistente");
        }
        
        try{
            while(true) {
                usuario = leeUsuario();
                lista.add(usuario);
            }
        }
        catch (EOFException eofe) {
            return lista;
        }
        catch (IOException ioe) {
            throw new Exception("No se puede obtener el numero de usuarios", ioe);
        
        }finally {
            try {
                archivo.close();
            }
            catch (IOException ioe) {
                throw new Exception("Error al cerar el archivo", ioe);
            }
        }
        
    }
}
