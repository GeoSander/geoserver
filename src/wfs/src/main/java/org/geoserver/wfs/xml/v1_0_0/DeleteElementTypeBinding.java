/* (c) 2014 Open Source Geospatial Foundation - all rights reserved
 * (c) 2001 - 2013 OpenPlans
 * This code is licensed under the GPL 2.0 license, available at the root
 * application directory.
 */
package org.geoserver.wfs.xml.v1_0_0;

import javax.xml.namespace.QName;
import net.opengis.wfs.DeleteElementType;
import net.opengis.wfs.WfsFactory;
import org.geotools.xsd.AbstractComplexEMFBinding;
import org.geotools.xsd.ElementInstance;
import org.geotools.xsd.Node;
import org.opengis.filter.Filter;

/**
 * Binding object for the type http://www.opengis.net/wfs:DeleteElementType.
 *
 * <p>
 *
 * <pre>
 *         <code>
 *  &lt;xsd:complexType name="DeleteElementType"&gt;
 *      &lt;xsd:sequence&gt;
 *          &lt;xsd:element maxOccurs="1" minOccurs="1" ref="ogc:Filter"&gt;
 *              &lt;xsd:annotation&gt;
 *                  &lt;xsd:documentation&gt;
 *                    The Filter element is used to constrain the scope
 *                    of the delete operation to those features identified
 *                    by the filter.  Feature instances can be specified
 *                    explicitly and individually using the identifier of
 *                    each feature instance OR a set of features to be
 *                    operated on can be identified by specifying spatial
 *                    and non-spatial constraints in the filter.
 *                    If no filter is specified then an exception should
 *                    be raised since it is unlikely that a client application
 *                    intends to delete all feature instances.
 *                 &lt;/xsd:documentation&gt;
 *              &lt;/xsd:annotation&gt;
 *          &lt;/xsd:element&gt;
 *      &lt;/xsd:sequence&gt;
 *      &lt;xsd:attribute name="handle" type="xsd:string" use="optional"/&gt;
 *      &lt;xsd:attribute name="typeName" type="xsd:QName" use="required"/&gt;
 *  &lt;/xsd:complexType&gt;
 *
 *          </code>
 *         </pre>
 *
 * @generated
 */
public class DeleteElementTypeBinding extends AbstractComplexEMFBinding {
    WfsFactory wfsfactory;

    public DeleteElementTypeBinding(WfsFactory wfsfactory) {
        super(wfsfactory);
        this.wfsfactory = wfsfactory;
    }

    /** @generated */
    @Override
    public QName getTarget() {
        return WFS.DELETEELEMENTTYPE;
    }

    /**
     *
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated modifiable
     */
    @Override
    public Class getType() {
        return DeleteElementType.class;
    }

    /**
     *
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated modifiable
     */
    @Override
    public Object parse(ElementInstance instance, Node node, Object value) throws Exception {
        DeleteElementType deleteElement = wfsfactory.createDeleteElementType();

        // &lt;xsd:element maxOccurs="1" minOccurs="1" ref="ogc:Filter"&gt;
        deleteElement.setFilter(node.getChildValue(Filter.class));

        // &lt;xsd:attribute name="handle" type="xsd:string" use="optional"/&gt;
        if (node.hasAttribute("handle")) {
            deleteElement.setHandle((String) node.getAttributeValue("handle"));
        }

        // &lt;xsd:attribute name="typeName" type="xsd:QName" use="required"/&gt;
        deleteElement.setTypeName((QName) node.getAttributeValue(QName.class));

        return deleteElement;
    }
}
