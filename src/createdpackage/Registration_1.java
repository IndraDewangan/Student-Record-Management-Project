/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package createdpackage;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author indradewangan
 */
@Entity
@Table(name = "registration", catalog = "stud", schema = "")
@NamedQueries({
    @NamedQuery(name = "Registration_1.findAll", query = "SELECT r FROM Registration_1 r")
    , @NamedQuery(name = "Registration_1.findByRollno", query = "SELECT r FROM Registration_1 r WHERE r.rollno = :rollno")
    , @NamedQuery(name = "Registration_1.findByFirstName", query = "SELECT r FROM Registration_1 r WHERE r.firstName = :firstName")
    , @NamedQuery(name = "Registration_1.findByLastName", query = "SELECT r FROM Registration_1 r WHERE r.lastName = :lastName")
    , @NamedQuery(name = "Registration_1.findByClass1", query = "SELECT r FROM Registration_1 r WHERE r.class1 = :class1")
    , @NamedQuery(name = "Registration_1.findByGender", query = "SELECT r FROM Registration_1 r WHERE r.gender = :gender")
    , @NamedQuery(name = "Registration_1.findByContactno", query = "SELECT r FROM Registration_1 r WHERE r.contactno = :contactno")
    , @NamedQuery(name = "Registration_1.findByAddress", query = "SELECT r FROM Registration_1 r WHERE r.address = :address")
    , @NamedQuery(name = "Registration_1.findByDob", query = "SELECT r FROM Registration_1 r WHERE r.dob = :dob")})
public class Registration_1 implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Rollno")
    private Integer rollno;
    @Basic(optional = false)
    @Column(name = "FirstName")
    private String firstName;
    @Basic(optional = false)
    @Column(name = "LastName")
    private String lastName;
    @Column(name = "Class")
    private String class1;
    @Column(name = "Gender")
    private String gender;
    @Column(name = "Contactno")
    private String contactno;
    @Column(name = "Address")
    private String address;
    @Column(name = "DOB")
    private String dob;

    public Registration_1() {
    }

    public Registration_1(Integer rollno) {
        this.rollno = rollno;
    }

    public Registration_1(Integer rollno, String firstName, String lastName) {
        this.rollno = rollno;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Integer getRollno() {
        return rollno;
    }

    public void setRollno(Integer rollno) {
        Integer oldRollno = this.rollno;
        this.rollno = rollno;
        changeSupport.firePropertyChange("rollno", oldRollno, rollno);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        String oldFirstName = this.firstName;
        this.firstName = firstName;
        changeSupport.firePropertyChange("firstName", oldFirstName, firstName);
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        String oldLastName = this.lastName;
        this.lastName = lastName;
        changeSupport.firePropertyChange("lastName", oldLastName, lastName);
    }

    public String getClass1() {
        return class1;
    }

    public void setClass1(String class1) {
        String oldClass1 = this.class1;
        this.class1 = class1;
        changeSupport.firePropertyChange("class1", oldClass1, class1);
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        String oldGender = this.gender;
        this.gender = gender;
        changeSupport.firePropertyChange("gender", oldGender, gender);
    }

    public String getContactno() {
        return contactno;
    }

    public void setContactno(String contactno) {
        String oldContactno = this.contactno;
        this.contactno = contactno;
        changeSupport.firePropertyChange("contactno", oldContactno, contactno);
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        String oldAddress = this.address;
        this.address = address;
        changeSupport.firePropertyChange("address", oldAddress, address);
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        String oldDob = this.dob;
        this.dob = dob;
        changeSupport.firePropertyChange("dob", oldDob, dob);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (rollno != null ? rollno.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Registration_1)) {
            return false;
        }
        Registration_1 other = (Registration_1) object;
        if ((this.rollno == null && other.rollno != null) || (this.rollno != null && !this.rollno.equals(other.rollno))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "createdpackage.Registration_1[ rollno=" + rollno + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
