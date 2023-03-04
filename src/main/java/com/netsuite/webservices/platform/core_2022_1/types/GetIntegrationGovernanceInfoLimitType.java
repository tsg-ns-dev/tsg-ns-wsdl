
package com.netsuite.webservices.platform.core_2022_1.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetIntegrationGovernanceInfoLimitType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="GetIntegrationGovernanceInfoLimitType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="_account"/&gt;
 *     &lt;enumeration value="_integrationSpecific"/&gt;
 *     &lt;enumeration value="_internal"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "GetIntegrationGovernanceInfoLimitType", namespace = "urn:types.core_2022_1.platform.webservices.netsuite.com")
@XmlEnum
public enum GetIntegrationGovernanceInfoLimitType {

    @XmlEnumValue("_account")
    ACCOUNT("_account"),
    @XmlEnumValue("_integrationSpecific")
    INTEGRATION_SPECIFIC("_integrationSpecific"),
    @XmlEnumValue("_internal")
    INTERNAL("_internal");
    private final String value;

    GetIntegrationGovernanceInfoLimitType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static GetIntegrationGovernanceInfoLimitType fromValue(String v) {
        for (GetIntegrationGovernanceInfoLimitType c: GetIntegrationGovernanceInfoLimitType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
