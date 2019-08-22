
package org.docx4j.xr;

import javax.xml.bind.Unmarshaller;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

import org.jvnet.jaxb2_commons.ppp.Child;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "revisionPtr")
public class RevisionPtr implements Child {

    @XmlAttribute(name = "revIDLastSave", namespace = "http://schemas.microsoft.com/office/spreadsheetml/2014/revision")
    protected String revIDLastSave;
    @XmlAttribute(name = "documentId", namespace = "http://schemas.microsoft.com/office/spreadsheetml/2014/revision")
    protected String documentId;

    /**
     * Gets the value of the revIDLastSave property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRevIDLastSave() {
        return revIDLastSave;
    }

    /**
     * Sets the value of the revIDLastSave property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRevIDLastSave(String value) {
        this.revIDLastSave = value;
    }

    /**
     * Gets the value of the documentId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentId() {
        return documentId;
    }

    /**
     * Sets the value of the mustUnderstand property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentId(String value) {
        this.documentId = value;
    }

    @XmlTransient
    private Object parent;
    
    /**
     * Gets the parent object in the object tree representing the unmarshalled xml document.
     * 
     * @return
     *     The parent object.
     */
    public Object getParent() {
        return this.parent;
    }

    public void setParent(Object parent) {
        this.parent = parent;
    }

    /**
     * This method is invoked by the JAXB implementation on each instance when unmarshalling completes.
     * 
     * @param parent
     *     The parent object in the object tree.
     * @param unmarshaller
     *     The unmarshaller that generated the instance.
     */
    public void afterUnmarshal(Unmarshaller unmarshaller, Object parent) {
        setParent(parent);
    }

}
