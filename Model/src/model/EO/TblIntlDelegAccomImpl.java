package model.EO;

import java.math.BigDecimal;

import java.sql.Timestamp;

import oracle.adf.share.ADFContext;

import oracle.jbo.Key;
import oracle.jbo.domain.Number;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.TransactionEvent;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Sat Nov 30 12:53:46 PKT 2019
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class TblIntlDelegAccomImpl extends EntityImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        IntlDelegAccomId,
        IntlDelegAppMId,
        LibrAccomTypesId,
        Ast,
        CreatedDate,
        CreatedBy,
        UpdatedDate,
        UpdatedBy,
        TblIntlDelegAppM;
        private static AttributesEnum[] vals = null;
        private static final int firstIndex = 0;

        public int index() {
            return AttributesEnum.firstIndex() + ordinal();
        }

        public static final int firstIndex() {
            return firstIndex;
        }

        public static int count() {
            return AttributesEnum.firstIndex() + AttributesEnum.staticValues().length;
        }

        public static final AttributesEnum[] staticValues() {
            if (vals == null) {
                vals = AttributesEnum.values();
            }
            return vals;
        }
    }
    public static final int INTLDELEGACCOMID = AttributesEnum.IntlDelegAccomId.index();
    public static final int INTLDELEGAPPMID = AttributesEnum.IntlDelegAppMId.index();
    public static final int LIBRACCOMTYPESID = AttributesEnum.LibrAccomTypesId.index();
    public static final int AST = AttributesEnum.Ast.index();
    public static final int CREATEDDATE = AttributesEnum.CreatedDate.index();
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int UPDATEDDATE = AttributesEnum.UpdatedDate.index();
    public static final int UPDATEDBY = AttributesEnum.UpdatedBy.index();
    public static final int TBLINTLDELEGAPPM = AttributesEnum.TblIntlDelegAppM.index();

    /**
     * This is the default constructor (do not remove).
     */
    public TblIntlDelegAccomImpl() {
    }

    /**
     * Gets the attribute value for IntlDelegAccomId, using the alias name IntlDelegAccomId.
     * @return the value of IntlDelegAccomId
     */
    public Number getIntlDelegAccomId() {
        return (Number) getAttributeInternal(INTLDELEGACCOMID);
    }

    /**
     * Sets <code>value</code> as the attribute value for IntlDelegAccomId.
     * @param value value to set the IntlDelegAccomId
     */
    public void setIntlDelegAccomId(Number value) {
        setAttributeInternal(INTLDELEGACCOMID, value);
    }

    /**
     * Gets the attribute value for IntlDelegAppMId, using the alias name IntlDelegAppMId.
     * @return the value of IntlDelegAppMId
     */
    public Number getIntlDelegAppMId() {
        return (Number) getAttributeInternal(INTLDELEGAPPMID);
    }

    /**
     * Sets <code>value</code> as the attribute value for IntlDelegAppMId.
     * @param value value to set the IntlDelegAppMId
     */
    public void setIntlDelegAppMId(Number value) {
        setAttributeInternal(INTLDELEGAPPMID, value);
    }

    /**
     * Gets the attribute value for LibrAccomTypesId, using the alias name LibrAccomTypesId.
     * @return the value of LibrAccomTypesId
     */
    public Number getLibrAccomTypesId() {
        return (Number) getAttributeInternal(LIBRACCOMTYPESID);
    }

    /**
     * Sets <code>value</code> as the attribute value for LibrAccomTypesId.
     * @param value value to set the LibrAccomTypesId
     */
    public void setLibrAccomTypesId(Number value) {
        setAttributeInternal(LIBRACCOMTYPESID, value);
    }

    /**
     * Gets the attribute value for Ast, using the alias name Ast.
     * @return the value of Ast
     */
    public String getAst() {
        return (String) getAttributeInternal(AST);
    }

    /**
     * Sets <code>value</code> as the attribute value for Ast.
     * @param value value to set the Ast
     */
    public void setAst(String value) {
        setAttributeInternal(AST, value);
    }

    /**
     * Gets the attribute value for CreatedDate, using the alias name CreatedDate.
     * @return the value of CreatedDate
     */
    public Timestamp getCreatedDate() {
        return (Timestamp) getAttributeInternal(CREATEDDATE);
    }

    /**
     * Gets the attribute value for CreatedBy, using the alias name CreatedBy.
     * @return the value of CreatedBy
     */
    public Number getCreatedBy() {
        return (Number) getAttributeInternal(CREATEDBY);
    }

    /**
     * Sets <code>value</code> as the attribute value for CreatedBy.
     * @param value value to set the CreatedBy
     */
    public void setCreatedBy(Number value) {
        setAttributeInternal(CREATEDBY, value);
    }

    /**
     * Gets the attribute value for UpdatedDate, using the alias name UpdatedDate.
     * @return the value of UpdatedDate
     */
    public Timestamp getUpdatedDate() {
        return (Timestamp) getAttributeInternal(UPDATEDDATE);
    }

    /**
     * Gets the attribute value for UpdatedBy, using the alias name UpdatedBy.
     * @return the value of UpdatedBy
     */
    public Number getUpdatedBy() {
        return (Number) getAttributeInternal(UPDATEDBY);
    }

    /**
     * Sets <code>value</code> as the attribute value for UpdatedBy.
     * @param value value to set the UpdatedBy
     */
    public void setUpdatedBy(Number value) {
        setAttributeInternal(UPDATEDBY, value);
    }

    /**
     * @return the associated entity TblIntlDelegAppMImpl.
     */
    public TblIntlDelegAppMImpl getTblIntlDelegAppM() {
        return (TblIntlDelegAppMImpl) getAttributeInternal(TBLINTLDELEGAPPM);
    }

    /**
     * Sets <code>value</code> as the associated entity TblIntlDelegAppMImpl.
     */
    public void setTblIntlDelegAppM(TblIntlDelegAppMImpl value) {
        setAttributeInternal(TBLINTLDELEGAPPM, value);
    }

    /**
     * @param intlDelegAccomId key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(Number intlDelegAccomId) {
        return new Key(new Object[] { intlDelegAccomId });
    }

    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        return EntityDefImpl.findDefObject("model.EO.TblIntlDelegAccom");
    }

    /**
     * Add locking logic here.
     */
    public void lock() {
        super.lock();
    }

    /**
     * Custom DML update/insert/delete logic here.
     * @param operation the operation type
     * @param e the transaction event
     */
    protected void doDML(int operation, TransactionEvent e) {
        Number loginId = null;
                 try {
                     loginId = new Number((String) ADFContext.getCurrent().getSessionScope().get("sessRID"));
                 } catch(Exception ex) {
                     ex.printStackTrace();
                 }
                 
                 if (operation == DML_INSERT) {
                     setCreatedBy(loginId);
                     setUpdatedBy(loginId);
                     } else if(operation == DML_UPDATE) {
                     setUpdatedBy(loginId);
                 }
        super.doDML(operation, e);
    }
}

