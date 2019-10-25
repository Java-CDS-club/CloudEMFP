package model.EO;

import oracle.jbo.domain.Number;

import java.sql.Timestamp;

import oracle.adf.share.ADFContext;

import oracle.jbo.Key;
import oracle.jbo.RowIterator;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.TransactionEvent;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Sat Jul 27 16:45:47 PKT 2019
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class TblGrantDisburseMasterImpl extends EntityImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        GrantDisburseMasterId,
        GrantApprovalMasterId,
        Dated,
        Status,
        CreatedBy,
        CreatedDate,
        UpdatedBy,
        UpdatedDate,
        AccountName,
        AccountNo,
        AdvNo,
        ChqNo,
        GrantApprovalDetailId,
        IssueTo,
        RoNumber,
        TblGrantDisburseDetail,
        TblGrantApprovalMaster;
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

    public static final int GRANTDISBURSEMASTERID = AttributesEnum.GrantDisburseMasterId.index();
    public static final int GRANTAPPROVALMASTERID = AttributesEnum.GrantApprovalMasterId.index();
    public static final int DATED = AttributesEnum.Dated.index();
    public static final int STATUS = AttributesEnum.Status.index();
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int CREATEDDATE = AttributesEnum.CreatedDate.index();
    public static final int UPDATEDBY = AttributesEnum.UpdatedBy.index();
    public static final int UPDATEDDATE = AttributesEnum.UpdatedDate.index();
    public static final int ACCOUNTNAME = AttributesEnum.AccountName.index();
    public static final int ACCOUNTNO = AttributesEnum.AccountNo.index();
    public static final int ADVNO = AttributesEnum.AdvNo.index();
    public static final int CHQNO = AttributesEnum.ChqNo.index();
    public static final int GRANTAPPROVALDETAILID = AttributesEnum.GrantApprovalDetailId.index();
    public static final int ISSUETO = AttributesEnum.IssueTo.index();
    public static final int RONUMBER = AttributesEnum.RoNumber.index();
    public static final int TBLGRANTDISBURSEDETAIL = AttributesEnum.TblGrantDisburseDetail.index();
    public static final int TBLGRANTAPPROVALMASTER = AttributesEnum.TblGrantApprovalMaster.index();

    /**
     * This is the default constructor (do not remove).
     */
    public TblGrantDisburseMasterImpl() {
    }

    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        return EntityDefImpl.findDefObject("model.EO.TblGrantDisburseMaster");
    }

    /**
     * Gets the attribute value for GrantDisburseMasterId, using the alias name GrantDisburseMasterId.
     * @return the value of GrantDisburseMasterId
     */
    public Number getGrantDisburseMasterId() {
        return (Number) getAttributeInternal(GRANTDISBURSEMASTERID);
    }

    /**
     * Sets <code>value</code> as the attribute value for GrantDisburseMasterId.
     * @param value value to set the GrantDisburseMasterId
     */
    public void setGrantDisburseMasterId(Number value) {
        setAttributeInternal(GRANTDISBURSEMASTERID, value);
    }

    /**
     * Gets the attribute value for GrantApprovalMasterId, using the alias name GrantApprovalMasterId.
     * @return the value of GrantApprovalMasterId
     */
    public Number getGrantApprovalMasterId() {
        return (Number) getAttributeInternal(GRANTAPPROVALMASTERID);
    }

    /**
     * Sets <code>value</code> as the attribute value for GrantApprovalMasterId.
     * @param value value to set the GrantApprovalMasterId
     */
    public void setGrantApprovalMasterId(Number value) {
        setAttributeInternal(GRANTAPPROVALMASTERID, value);
    }

    /**
     * Gets the attribute value for Dated, using the alias name Dated.
     * @return the value of Dated
     */
    public Timestamp getDated() {
        return (Timestamp) getAttributeInternal(DATED);
    }

    /**
     * Sets <code>value</code> as the attribute value for Dated.
     * @param value value to set the Dated
     */
    public void setDated(Timestamp value) {
        setAttributeInternal(DATED, value);
    }

    /**
     * Gets the attribute value for Status, using the alias name Status.
     * @return the value of Status
     */
    public Number getStatus() {
        return (Number) getAttributeInternal(STATUS);
    }

    /**
     * Sets <code>value</code> as the attribute value for Status.
     * @param value value to set the Status
     */
    public void setStatus(Number value) {
        setAttributeInternal(STATUS, value);
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
     * Gets the attribute value for CreatedDate, using the alias name CreatedDate.
     * @return the value of CreatedDate
     */
    public Timestamp getCreatedDate() {
        return (Timestamp) getAttributeInternal(CREATEDDATE);
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
     * Gets the attribute value for UpdatedDate, using the alias name UpdatedDate.
     * @return the value of UpdatedDate
     */
    public Timestamp getUpdatedDate() {
        return (Timestamp) getAttributeInternal(UPDATEDDATE);
    }

    /**
     * Gets the attribute value for AccountName, using the alias name AccountName.
     * @return the value of AccountName
     */
    public String getAccountName() {
        return (String) getAttributeInternal(ACCOUNTNAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for AccountName.
     * @param value value to set the AccountName
     */
    public void setAccountName(String value) {
        setAttributeInternal(ACCOUNTNAME, value);
    }

    /**
     * Gets the attribute value for AccountNo, using the alias name AccountNo.
     * @return the value of AccountNo
     */
    public String getAccountNo() {
        return (String) getAttributeInternal(ACCOUNTNO);
    }

    /**
     * Sets <code>value</code> as the attribute value for AccountNo.
     * @param value value to set the AccountNo
     */
    public void setAccountNo(String value) {
        setAttributeInternal(ACCOUNTNO, value);
    }

    /**
     * Gets the attribute value for AdvNo, using the alias name AdvNo.
     * @return the value of AdvNo
     */
    public String getAdvNo() {
        return (String) getAttributeInternal(ADVNO);
    }

    /**
     * Sets <code>value</code> as the attribute value for AdvNo.
     * @param value value to set the AdvNo
     */
    public void setAdvNo(String value) {
        setAttributeInternal(ADVNO, value);
    }

    /**
     * Gets the attribute value for ChqNo, using the alias name ChqNo.
     * @return the value of ChqNo
     */
    public String getChqNo() {
        return (String) getAttributeInternal(CHQNO);
    }

    /**
     * Sets <code>value</code> as the attribute value for ChqNo.
     * @param value value to set the ChqNo
     */
    public void setChqNo(String value) {
        setAttributeInternal(CHQNO, value);
    }

    /**
     * Gets the attribute value for GrantApprovalDetailId, using the alias name GrantApprovalDetailId.
     * @return the value of GrantApprovalDetailId
     */
    public Number getGrantApprovalDetailId() {
        return (Number) getAttributeInternal(GRANTAPPROVALDETAILID);
    }

    /**
     * Sets <code>value</code> as the attribute value for GrantApprovalDetailId.
     * @param value value to set the GrantApprovalDetailId
     */
    public void setGrantApprovalDetailId(Number value) {
        setAttributeInternal(GRANTAPPROVALDETAILID, value);
    }

    /**
     * Gets the attribute value for IssueTo, using the alias name IssueTo.
     * @return the value of IssueTo
     */
    public String getIssueTo() {
        return (String) getAttributeInternal(ISSUETO);
    }

    /**
     * Sets <code>value</code> as the attribute value for IssueTo.
     * @param value value to set the IssueTo
     */
    public void setIssueTo(String value) {
        setAttributeInternal(ISSUETO, value);
    }

    /**
     * Gets the attribute value for RoNumber, using the alias name RoNumber.
     * @return the value of RoNumber
     */
    public String getRoNumber() {
        return (String) getAttributeInternal(RONUMBER);
    }

    /**
     * Sets <code>value</code> as the attribute value for RoNumber.
     * @param value value to set the RoNumber
     */
    public void setRoNumber(String value) {
        setAttributeInternal(RONUMBER, value);
    }

    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getTblGrantDisburseDetail() {
        return (RowIterator) getAttributeInternal(TBLGRANTDISBURSEDETAIL);
    }

    /**
     * @return the associated entity oracle.jbo.server.EntityImpl.
     */
    public TblGrantApprovalMasterImpl getTblGrantApprovalMaster() {
        return (TblGrantApprovalMasterImpl) getAttributeInternal(TBLGRANTAPPROVALMASTER);
    }

    /**
     * Sets <code>value</code> as the associated entity oracle.jbo.server.EntityImpl.
     */
    public void setTblGrantApprovalMaster(TblGrantApprovalMasterImpl value) {
        setAttributeInternal(TBLGRANTAPPROVALMASTER, value);
    }


    /**
     * @param grantDisburseMasterId key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(Number grantDisburseMasterId) {
        return new Key(new Object[] { grantDisburseMasterId });
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
            loginId = new Number((String) ADFContext.getCurrent().getSessionScope().get("sessUID"));
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

