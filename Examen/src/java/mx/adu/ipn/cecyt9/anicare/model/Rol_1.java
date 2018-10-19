package mx.adu.ipn.cecyt9.anicare.model;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
public class Rol_1 implements Serializable {

    private Collection<Usuario_1> usuarioCollection;

    private static final long serialVersionUID = 1L;
    private Integer idrol;
    private String rol;

    public Rol_1() {
    }

    public Rol_1(Integer idrol) {
        this.idrol = idrol;
    }

    public Integer getIdrol() {
        return idrol;
    }

    public void setIdrol(Integer idrol) {
        this.idrol = idrol;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idrol != null ? idrol.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Rol_1)) {
            return false;
        }
        Rol_1 other = (Rol_1) object;
        if ((this.idrol == null && other.idrol != null) || (this.idrol != null && !this.idrol.equals(other.idrol))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.adu.ipn.cecyt9.anicare.model.Rol[ idrol=" + idrol + " ]";
    }

    @XmlTransient
    public Collection<Usuario_1> getUsuarioCollection() {
        return usuarioCollection;
    }

    public void setUsuarioCollection(Collection<Usuario_1> usuarioCollection) {
        this.usuarioCollection = usuarioCollection;
    }
    
}
