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
@Table(name = "role_members", catalog = "garrobo_security")
public class RoleMembers implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected RoleMembersPK roleMembersPK;
    @Basic(optional = false)
    @NotNull
    @Column(name = "last_update")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastUpdate;
    @JoinColumn(name = "rol", referencedColumnName = "rol_name", insertable = false, updatable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Rol rol1;
    @JoinColumn(name = "user", referencedColumnName = "username", insertable = false, updatable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private User user1;

    public RoleMembers() {
    }

    public RoleMembers(RoleMembersPK roleMembersPK) {
        this.roleMembersPK = roleMembersPK;
    }

    public RoleMembers(RoleMembersPK roleMembersPK, Date lastUpdate) {
        this.roleMembersPK = roleMembersPK;
        this.lastUpdate = lastUpdate;
    }

    public RoleMembers(String user, String rol) {
        this.roleMembersPK = new RoleMembersPK(user, rol);
    }

    public RoleMembersPK getRoleMembersPK() {
        return roleMembersPK;
    }

    public void setRoleMembersPK(RoleMembersPK roleMembersPK) {
        this.roleMembersPK = roleMembersPK;
    }

    public Date getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public Rol getRol1() {
        return rol1;
    }

    public void setRol1(Rol rol1) {
        this.rol1 = rol1;
    }

    public User getUser1() {
        return user1;
    }

    public void setUser1(User user1) {
        this.user1 = user1;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (roleMembersPK != null ? roleMembersPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RoleMembers)) {
            return false;
        }
        RoleMembers other = (RoleMembers) object;
        if ((this.roleMembersPK == null && other.roleMembersPK != null) || (this.roleMembersPK != null && !this.roleMembersPK.equals(other.roleMembersPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.com.vieracode.garrobo.entity.RoleMembers[ roleMembersPK=" + roleMembersPK + " ]";
    }
    
}
