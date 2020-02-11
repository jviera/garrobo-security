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
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "history_user", catalog = "garrobo_security")
public class HistoryUser implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "history_user_id")
    private Integer historyUserId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 60)
    @Column(name = "password")
    private String password;
    @Basic(optional = false)
    @NotNull
    @Column(name = "date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date date;
    @JoinColumn(name = "username", referencedColumnName = "username")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private User username;

    public HistoryUser() {
    }

    public HistoryUser(Integer historyUserId) {
        this.historyUserId = historyUserId;
    }

    public HistoryUser(Integer historyUserId, String password, Date date) {
        this.historyUserId = historyUserId;
        this.password = password;
        this.date = date;
    }

    public Integer getHistoryUserId() {
        return historyUserId;
    }

    public void setHistoryUserId(Integer historyUserId) {
        this.historyUserId = historyUserId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public User getUsername() {
        return username;
    }

    public void setUsername(User username) {
        this.username = username;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (historyUserId != null ? historyUserId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof HistoryUser)) {
            return false;
        }
        HistoryUser other = (HistoryUser) object;
        if ((this.historyUserId == null && other.historyUserId != null) || (this.historyUserId != null && !this.historyUserId.equals(other.historyUserId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.com.vieracode.garrobo.entity.HistoryUser[ historyUserId=" + historyUserId + " ]";
    }
    
}
