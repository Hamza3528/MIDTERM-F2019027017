
package javaapplication8;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


@Entity
@Table(name = "Cities")
@NamedQueries({
    @NamedQuery(name = "Cities.findAll", query = "SELECT c FROM Cities c"),
    @NamedQuery(name = "Cities.findByCityID", query = "SELECT c FROM Cities c WHERE c.cityID = :cityID"),
    @NamedQuery(name = "Cities.findByCityName", query = "SELECT c FROM Cities c WHERE c.cityName = :cityName")})
public class Cities implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "City_ID")
    private Integer cityID;
    @Column(name = "City_Name")
    private Character cityName;

    public Cities() {
    }

    public Cities(Integer cityID) {
        this.cityID = cityID;
    }

    public Integer getCityID() {
        return cityID;
    }

    public void setCityID(Integer cityID) {
        this.cityID = cityID;
    }

    public Character getCityName() {
        return cityName;
    }

    public void setCityName(Character cityName) {
        this.cityName = cityName;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cityID != null ? cityID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        
        if (!(object instanceof Cities)) {
            return false;
        }
        Cities other = (Cities) object;
        if ((this.cityID == null && other.cityID != null) || (this.cityID != null && !this.cityID.equals(other.cityID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication8.Cities[ cityID=" + cityID + " ]";
    }
    
}
