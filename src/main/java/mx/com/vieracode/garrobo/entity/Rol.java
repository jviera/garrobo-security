/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.vieracode.garrobo.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author jbvie
 */
@Entity
@Table(name = "rol", catalog = "garrobo_security")
public class Rol implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "rol_name")
    private String rolName;
    @Basic(optional = false)
    @NotNull
    @Column(name = "status")
    private Character status;
    @Basic(optional = false)
    @NotNull
    @Column(name = "last_update")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastUpdate;  

    public Rol() {
    }

    public Rol(String rolName) {
        this.rolName = rolName;
    }

    public Rol(String rolName, Character status, Date lastUpdate) {
        this.rolName = rolName;
        this.status = status;
        this.lastUpdate = lastUpdate;
    }

    public String getRolName() {
        return rolName;
    }

    public void setRolName(String rolName) {
        this.rolName = rolName;
    }

    public Character getStatus() {
        return status;
    }

    public void setStatus(Character status) {
        this.status = status;
    }

    public Date getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }   

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (rolName != null ? rolName.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Rol)) {
            return false;
        }
        Rol other = (Rol) object;
        if ((this.rolName == null && other.rolName != null) || (this.rolName != null && !this.rolName.equals(other.rolName))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.com.vieracode.garrobo.entity.Rol[ rolName=" + rolName + " ]";
    }
    
}
