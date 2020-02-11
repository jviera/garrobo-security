/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.vieracode.garrobo.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author jbvie
 */
@Embeddable
public class PrivilegePK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "rol")
    private String rol;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "resource")
    private String resource;

    public PrivilegePK() {
    }

    public PrivilegePK(String rol, String resource) {
        this.rol = rol;
        this.resource = resource;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public String getResource() {
        return resource;
    }

    public void setResource(String resource) {
        this.resource = resource;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (rol != null ? rol.hashCode() : 0);
        hash += (resource != null ? resource.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PrivilegePK)) {
            return false;
        }
        PrivilegePK other = (PrivilegePK) object;
        if ((this.rol == null && other.rol != null) || (this.rol != null && !this.rol.equals(other.rol))) {
            return false;
        }
        if ((this.resource == null && other.resource != null) || (this.resource != null && !this.resource.equals(other.resource))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.com.vieracode.garrobo.entity.PrivilegePK[ rol=" + rol + ", resource=" + resource + " ]";
    }
    
}
