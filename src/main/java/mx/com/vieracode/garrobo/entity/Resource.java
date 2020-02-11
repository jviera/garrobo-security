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
@Table(name = "resource", catalog = "garrobo_security")
public class Resource implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "resource_name")
    private String resourceName;
    @Size(max = 200)
    @Column(name = "path")
    private String path;
    @Basic(optional = false)
    @NotNull
    @Column(name = "status")
    private Character status;
    @Basic(optional = false)
    @NotNull
    @Column(name = "last_update")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastUpdate;
    

    public Resource() {
    }

    public Resource(String resourceName) {
        this.resourceName = resourceName;
    }

    public Resource(String resourceName, Character status, Date lastUpdate) {
        this.resourceName = resourceName;
        this.status = status;
        this.lastUpdate = lastUpdate;
    }

    public String getResourceName() {
        return resourceName;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
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
        hash += (resourceName != null ? resourceName.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Resource)) {
            return false;
        }
        Resource other = (Resource) object;
        if ((this.resourceName == null && other.resourceName != null) || (this.resourceName != null && !this.resourceName.equals(other.resourceName))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.com.vieracode.garrobo.entity.Resource[ resourceName=" + resourceName + " ]";
    }
    
}
