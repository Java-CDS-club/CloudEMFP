package model.EO;

import java.math.BigDecimal;

import java.sql.Timestamp;

import oracle.adf.share.ADFContext;

import oracle.jbo.Key;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.TransactionEvent;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Wed Jul 31 12:43:07 PKT 2019
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class TblFarmerRegCropsImpl extends EntityImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        FarmerRegCropsId,
        FarmerRegId,
        CropId,
        AnnualProd,
        YearlySales,
        MainBuyer,
        MainBuyerAddr,
        MainBuyerCity,
        CreatedBy,
        CreatedDate,
        UpdatedBy,
        UpdatedDate,
        CropTypeId,
        TblCrop,
        TblFarmerReg;
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

    public static final int FARMERREGCROPSID = AttributesEnum.FarmerRegCropsId.index();
    public static final int FARMERREGID = AttributesEnum.FarmerRegId.index();
    public static final int CROPID = AttributesEnum.CropId.index();
    public static final int ANNUALPROD = AttributesEnum.AnnualProd.index();
    public static final int YEARLYSALES = AttributesEnum.YearlySales.index();
    public static final int MAINBUYER = AttributesEnum.MainBuyer.index();
    public static final int MAINBUYERADDR = AttributesEnum.MainBuyerAddr.index();
    public static final int MAINBUYERCITY = AttributesEnum.MainBuyerCity.index();
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int CREATEDDATE = AttributesEnum.CreatedDate.index();
    public static final int UPDATEDBY = AttributesEnum.UpdatedBy.index();
    public static final int UPDATEDDATE = AttributesEnum.UpdatedDate.index();
    public static final int CROPTYPEID = AttributesEnum.CropTypeId.index();
    public static final int TBLCROP = AttributesEnum.TblCrop.index();
    public static final int TBLFARMERREG = AttributesEnum.TblFarmerReg.index();

    /**
     * This is the default constructor (do not remove).
     */
    public TblFarmerRegCropsImpl() {
    }

    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        return EntityDefImpl.findDefObject("model.EO.TblFarmerRegCrops");
    }

    /**
     * Gets the attribute value for FarmerRegCropsId, using the alias name FarmerRegCropsId.
     * @return the value of FarmerRegCropsId
     */
    public BigDecimal getFarmerRegCropsId() {
        return (BigDecimal) getAttributeInternal(FARMERREGCROPSID);
    }

    /**
     * Sets <code>value</code> as the attribute value for FarmerRegCropsId.
     * @param value value to set the FarmerRegCropsId
     */
    public void setFarmerRegCropsId(BigDecimal value) {
        setAttributeInternal(FARMERREGCROPSID, value);
    }

    /**
     * Gets the attribute value for FarmerRegId, using the alias name FarmerRegId.
     * @return the value of FarmerRegId
     */
    public BigDecimal getFarmerRegId() {
        return (BigDecimal) getAttributeInternal(FARMERREGID);
    }

    /**
     * Sets <code>value</code> as the attribute value for FarmerRegId.
     * @param value value to set the FarmerRegId
     */
    public void setFarmerRegId(BigDecimal value) {
        setAttributeInternal(FARMERREGID, value);
    }

    /**
     * Gets the attribute value for CropId, using the alias name CropId.
     * @return the value of CropId
     */
    public BigDecimal getCropId() {
        return (BigDecimal) getAttributeInternal(CROPID);
    }

    /**
     * Sets <code>value</code> as the attribute value for CropId.
     * @param value value to set the CropId
     */
    public void setCropId(BigDecimal value) {
        setAttributeInternal(CROPID, value);
    }

    /**
     * Gets the attribute value for AnnualProd, using the alias name AnnualProd.
     * @return the value of AnnualProd
     */
    public BigDecimal getAnnualProd() {
        return (BigDecimal) getAttributeInternal(ANNUALPROD);
    }

    /**
     * Sets <code>value</code> as the attribute value for AnnualProd.
     * @param value value to set the AnnualProd
     */
    public void setAnnualProd(BigDecimal value) {
        setAttributeInternal(ANNUALPROD, value);
    }

    /**
     * Gets the attribute value for YearlySales, using the alias name YearlySales.
     * @return the value of YearlySales
     */
    public BigDecimal getYearlySales() {
        return (BigDecimal) getAttributeInternal(YEARLYSALES);
    }

    /**
     * Sets <code>value</code> as the attribute value for YearlySales.
     * @param value value to set the YearlySales
     */
    public void setYearlySales(BigDecimal value) {
        setAttributeInternal(YEARLYSALES, value);
    }

    /**
     * Gets the attribute value for MainBuyer, using the alias name MainBuyer.
     * @return the value of MainBuyer
     */
    public String getMainBuyer() {
        return (String) getAttributeInternal(MAINBUYER);
    }

    /**
     * Sets <code>value</code> as the attribute value for MainBuyer.
     * @param value value to set the MainBuyer
     */
    public void setMainBuyer(String value) {
        setAttributeInternal(MAINBUYER, value);
    }

    /**
     * Gets the attribute value for MainBuyerAddr, using the alias name MainBuyerAddr.
     * @return the value of MainBuyerAddr
     */
    public String getMainBuyerAddr() {
        return (String) getAttributeInternal(MAINBUYERADDR);
    }

    /**
     * Sets <code>value</code> as the attribute value for MainBuyerAddr.
     * @param value value to set the MainBuyerAddr
     */
    public void setMainBuyerAddr(String value) {
        setAttributeInternal(MAINBUYERADDR, value);
    }

    /**
     * Gets the attribute value for MainBuyerCity, using the alias name MainBuyerCity.
     * @return the value of MainBuyerCity
     */
    public String getMainBuyerCity() {
        return (String) getAttributeInternal(MAINBUYERCITY);
    }

    /**
     * Sets <code>value</code> as the attribute value for MainBuyerCity.
     * @param value value to set the MainBuyerCity
     */
    public void setMainBuyerCity(String value) {
        setAttributeInternal(MAINBUYERCITY, value);
    }

    /**
     * Gets the attribute value for CreatedBy, using the alias name CreatedBy.
     * @return the value of CreatedBy
     */
    public BigDecimal getCreatedBy() {
        return (BigDecimal) getAttributeInternal(CREATEDBY);
    }

    /**
     * Sets <code>value</code> as the attribute value for CreatedBy.
     * @param value value to set the CreatedBy
     */
    public void setCreatedBy(BigDecimal value) {
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
    public BigDecimal getUpdatedBy() {
        return (BigDecimal) getAttributeInternal(UPDATEDBY);
    }

    /**
     * Sets <code>value</code> as the attribute value for UpdatedBy.
     * @param value value to set the UpdatedBy
     */
    public void setUpdatedBy(BigDecimal value) {
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
     * Gets the attribute value for CropTypeId, using the alias name CropTypeId.
     * @return the value of CropTypeId
     */
    public BigDecimal getCropTypeId() {
        return (BigDecimal) getAttributeInternal(CROPTYPEID);
    }

    /**
     * Sets <code>value</code> as the attribute value for CropTypeId.
     * @param value value to set the CropTypeId
     */
    public void setCropTypeId(BigDecimal value) {
        setAttributeInternal(CROPTYPEID, value);
    }

    /**
     * @return the associated entity TblCropImpl.
     */
    public TblCropImpl getTblCrop() {
        return (TblCropImpl) getAttributeInternal(TBLCROP);
    }

    /**
     * Sets <code>value</code> as the associated entity TblCropImpl.
     */
    public void setTblCrop(TblCropImpl value) {
        setAttributeInternal(TBLCROP, value);
    }

    /**
     * @return the associated entity TblFarmerRegImpl.
     */
    public TblFarmerRegImpl getTblFarmerReg() {
        return (TblFarmerRegImpl) getAttributeInternal(TBLFARMERREG);
    }

    /**
     * Sets <code>value</code> as the associated entity TblFarmerRegImpl.
     */
    public void setTblFarmerReg(TblFarmerRegImpl value) {
        setAttributeInternal(TBLFARMERREG, value);
    }


    /**
     * @param farmerRegCropsId key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(BigDecimal farmerRegCropsId) {
        return new Key(new Object[] { farmerRegCropsId });
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
        BigDecimal loginId = null;
         try {
             loginId = new BigDecimal((String) ADFContext.getCurrent().getSessionScope().get("sessUID"));
         } catch(Exception ex) {
             ex.printStackTrace();
         }
         
         if (operation == DML_INSERT) {
             setCreatedBy(loginId);
             setUpdatedBy(loginId);
         } else {
             setUpdatedBy(loginId);
         }
        super.doDML(operation, e);
    }
}

