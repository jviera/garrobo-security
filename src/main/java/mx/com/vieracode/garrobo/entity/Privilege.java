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
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

/**
 *
 * @author jbvie
 */
@Entity
@Table(name = "privilege", catalog = "garrobo_security")
public class Privilege implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PrivilegePK privilegePK;
    @Basic(optional = false)
    @NotNull
    @Column(name = "last_update")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastUpdate;
    @JoinColumn(name = "resource", referencedColumnName = "resource_name", insertable = false, updatable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Resource resource1;
    @JoinColumn(name = "rol", referencedColumnName = "rol_name", insertable = false, updatable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Rol rol1;

    public Privilege() {
    }

    public Privilege(PrivilegePK privilegePK) {
        this.privilegePK = privilegePK;
    }

    public Privilege(PrivilegePK privilegePK, Date lastUpdate) {
        this.privilegePK = privilegePK;
        this.lastUpdate = lastUpdate;
    }

    public Privilege(String rol, String resource) {
        this.privilegePK = new PrivilegePK(rol, resource);
    }

    public PrivilegePK getPrivilegePK() {
        return privilegePK;
    }

    public void setPrivilegePK(PrivilegePK privilegePK) {
        this.privilegePK = privilegePK;
    }

    public Date getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public Resource getResource1() {
        return resource1;
    }

    public void setResource1(Resource resource1) {
        this.resource1 = resource1;
    }

    public Rol getRol1() {
        return rol1;
    }

    public void setRol1(Rol rol1) {
        this.rol1 = rol1;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (privilegePK != null ? privilegePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Privilege)) {
            return false;
        }
        Privilege other = (Privilege) object;
        if ((this.privilegePK == null && other.privilegePK != null) || (this.privilegePK != null && !this.privilegePK.equals(other.privilegePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.com.vieracode.garrobo.entity.Privilege[ privilegePK=" + privilegePK + " ]";
    }
    
}
