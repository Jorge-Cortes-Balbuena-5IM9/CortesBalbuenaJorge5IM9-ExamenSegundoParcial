package mx.adu.ipn.cecyt9.anicare.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

public class Usuario_1 implements Serializable {
private String Nombre;
private String ApellidoPaterno;
private String ApellidoMaterno;
private String Escuela;
private String MateriaFavorita;
private String DeporteFavorito;
private String Contraseña;
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellidoPaterno() {
        return ApellidoPaterno;
    }

    public void setApellidoPaterno(String ApellidoPaterno) {
        this.ApellidoPaterno = ApellidoPaterno;
    }

    public String getApellidoMaterno() {
        return ApellidoMaterno;
    }

    public void setApellidoMaterno(String ApellidoMaterno) {
        this.ApellidoMaterno = ApellidoMaterno;
    }

    public String getEscuela() {
        return Escuela;
    }

    public void setEscuela(String Escuela) {
        this.Escuela = Escuela;
    }

    public String getMateriaFavorita() {
        return MateriaFavorita;
    }

    public void setMateriaFavorita(String MateriaFavorita) {
        this.MateriaFavorita = MateriaFavorita;
    }

    public String getDeporteFavorito() {
        return DeporteFavorito;
    }

    public void setDeporteFavorito(String DeporteFavorito) {
        this.DeporteFavorito = DeporteFavorito;
    }

    public String getContraseña() {
        return Contraseña;
    }

    public void setContraseña(String Contraseña) {
        this.Contraseña = Contraseña;
    }


    @Override
    public int hashCode() {
        int hash = 0;
        hash += (Nombre != null ? Nombre.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Usuario_1)) {
            return false;
        }
        Usuario_1 other = (Usuario_1) object;
        if ((this.Nombre == null && other.Nombre != null) || (this.Nombre != null && !this.Nombre.equals(other.Nombre))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.adu.ipn.cecyt9.anicare.model.Usuario_1[ idusuario=" + Nombre + " ]";
    }
    
}
