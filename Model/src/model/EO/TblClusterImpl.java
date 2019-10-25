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
// ---    Wed Jul 31 12:30:32 PKT 2019
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class TblClusterImpl extends EntityImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        ClusterId,
        CropId,
        Name,
        CityLibrDetail,
        DistrictLibrDetail,
        TehsilLibrDetail,
        MauzaLibrDetail,
        VillageLibrDetail,
        Ast,
        PhaseId,
        ClusterNo,
        UcLibrDetail,
        CreatedBy,
        CreatedDate,
        UpdatedBy,
        UpdatedDate,
        TblClusterAttMaster,
        TblClusterMaster,
        TblCrop,
        TblFarmerReg,
        TblGrantApprovalMaster,
        TblGrantAppMaster,
        TblLibrDetail,
        TblLibrDetail1,
        TblLibrDetail2,
        TblLibrDetail3,
        TblLibrDetail4,
        TblPhase,
        TblTrainingSchDetail,
        Map_Farmer_Detail;
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


    public static final int CLUSTERID = AttributesEnum.ClusterId.index();
    public static final int CROPID = AttributesEnum.CropId.index();
    public static final int NAME = AttributesEnum.Name.index();
    public static final int CITYLIBRDETAIL = AttributesEnum.CityLibrDetail.index();
    public static final int DISTRICTLIBRDETAIL = AttributesEnum.DistrictLibrDetail.index();
    public static final int TEHSILLIBRDETAIL = AttributesEnum.TehsilLibrDetail.index();
    public static final int MAUZALIBRDETAIL = AttributesEnum.MauzaLibrDetail.index();
    public static final int VILLAGELIBRDETAIL = AttributesEnum.VillageLibrDetail.index();
    public static final int AST = AttributesEnum.Ast.index();
    public static final int PHASEID = AttributesEnum.PhaseId.index();
    public static final int CLUSTERNO = AttributesEnum.ClusterNo.index();
    public static final int UCLIBRDETAIL = AttributesEnum.UcLibrDetail.index();
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int CREATEDDATE = AttributesEnum.CreatedDate.index();
    public static final int UPDATEDBY = AttributesEnum.UpdatedBy.index();
    public static final int UPDATEDDATE = AttributesEnum.UpdatedDate.index();
    public static final int TBLCLUSTERATTMASTER = AttributesEnum.TblClusterAttMaster.index();
    public static final int TBLCLUSTERMASTER = AttributesEnum.TblClusterMaster.index();
    public static final int TBLCROP = AttributesEnum.TblCrop.index();
    public static final int TBLFARMERREG = AttributesEnum.TblFarmerReg.index();
    public static final int TBLGRANTAPPROVALMASTER = AttributesEnum.TblGrantApprovalMaster.index();
    public static final int TBLGRANTAPPMASTER = AttributesEnum.TblGrantAppMaster.index();
    public static final int TBLLIBRDETAIL = AttributesEnum.TblLibrDetail.index();
    public static final int TBLLIBRDETAIL1 = AttributesEnum.TblLibrDetail1.index();
    public static final int TBLLIBRDETAIL2 = AttributesEnum.TblLibrDetail2.index();
    public static final int TBLLIBRDETAIL3 = AttributesEnum.TblLibrDetail3.index();
    public static final int TBLLIBRDETAIL4 = AttributesEnum.TblLibrDetail4.index();
    public static final int TBLPHASE = AttributesEnum.TblPhase.index();
    public static final int TBLTRAININGSCHDETAIL = AttributesEnum.TblTrainingSchDetail.index();
    public static final int MAP_FARMER_DETAIL = AttributesEnum.Map_Farmer_Detail.index();

    /**
     * This is the default constructor (do not remove).
     */
    public TblClusterImpl() {
    }

    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        return EntityDefImpl.findDefObject("model.EO.TblCluster");
    }


    /**
     * Gets the attribute value for ClusterId, using the alias name ClusterId.
     * @return the value of ClusterId
     */
    public Number getClusterId() {
        return (Number) getAttributeInternal(CLUSTERID);
    }

    /**
     * Sets <code>value</code> as the attribute value for ClusterId.
     * @param value value to set the ClusterId
     */
    public void setClusterId(Number value) {
        setAttributeInternal(CLUSTERID, value);
    }

    /**
     * Gets the attribute value for CropId, using the alias name CropId.
     * @return the value of CropId
     */
    public Number getCropId() {
        return (Number) getAttributeInternal(CROPID);
    }

    /**
     * Sets <code>value</code> as the attribute value for CropId.
     * @param value value to set the CropId
     */
    public void setCropId(Number value) {
        setAttributeInternal(CROPID, value);
    }

    /**
     * Gets the attribute value for Name, using the alias name Name.
     * @return the value of Name
     */
    public String getName() {
        return (String) getAttributeInternal(NAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for Name.
     * @param value value to set the Name
     */
    public void setName(String value) {
        setAttributeInternal(NAME, value);
    }

    /**
     * Gets the attribute value for CityLibrDetail, using the alias name CityLibrDetail.
     * @return the value of CityLibrDetail
     */
    public Number getCityLibrDetail() {
        return (Number) getAttributeInternal(CITYLIBRDETAIL);
    }

    /**
     * Sets <code>value</code> as the attribute value for CityLibrDetail.
     * @param value value to set the CityLibrDetail
     */
    public void setCityLibrDetail(Number value) {
        setAttributeInternal(CITYLIBRDETAIL, value);
    }

    /**
     * Gets the attribute value for DistrictLibrDetail, using the alias name DistrictLibrDetail.
     * @return the value of DistrictLibrDetail
     */
    public Number getDistrictLibrDetail() {
        return (Number) getAttributeInternal(DISTRICTLIBRDETAIL);
    }

    /**
     * Sets <code>value</code> as the attribute value for DistrictLibrDetail.
     * @param value value to set the DistrictLibrDetail
     */
    public void setDistrictLibrDetail(Number value) {
        setAttributeInternal(DISTRICTLIBRDETAIL, value);
    }

    /**
     * Gets the attribute value for TehsilLibrDetail, using the alias name TehsilLibrDetail.
     * @return the value of TehsilLibrDetail
     */
    public Number getTehsilLibrDetail() {
        return (Number) getAttributeInternal(TEHSILLIBRDETAIL);
    }

    /**
     * Sets <code>value</code> as the attribute value for TehsilLibrDetail.
     * @param value value to set the TehsilLibrDetail
     */
    public void setTehsilLibrDetail(Number value) {
        setAttributeInternal(TEHSILLIBRDETAIL, value);
    }

    /**
     * Gets the attribute value for MauzaLibrDetail, using the alias name MauzaLibrDetail.
     * @return the value of MauzaLibrDetail
     */
    public Number getMauzaLibrDetail() {
        return (Number) getAttributeInternal(MAUZALIBRDETAIL);
    }

    /**
     * Sets <code>value</code> as the attribute value for MauzaLibrDetail.
     * @param value value to set the MauzaLibrDetail
     */
    public void setMauzaLibrDetail(Number value) {
        setAttributeInternal(MAUZALIBRDETAIL, value);
    }

    /**
     * Gets the attribute value for VillageLibrDetail, using the alias name VillageLibrDetail.
     * @return the value of VillageLibrDetail
     */
    public Number getVillageLibrDetail() {
        return (Number) getAttributeInternal(VILLAGELIBRDETAIL);
    }

    /**
     * Sets <code>value</code> as the attribute value for VillageLibrDetail.
     * @param value value to set the VillageLibrDetail
     */
    public void setVillageLibrDetail(Number value) {
        setAttributeInternal(VILLAGELIBRDETAIL, value);
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
     * Gets the attribute value for PhaseId, using the alias name PhaseId.
     * @return the value of PhaseId
     */
    public Number getPhaseId() {
        return (Number) getAttributeInternal(PHASEID);
    }

    /**
     * Sets <code>value</code> as the attribute value for PhaseId.
     * @param value value to set the PhaseId
     */
    public void setPhaseId(Number value) {
        setAttributeInternal(PHASEID, value);
    }

    /**
     * Gets the attribute value for ClusterNo, using the alias name ClusterNo.
     * @return the value of ClusterNo
     */
    public String getClusterNo() {
        return (String) getAttributeInternal(CLUSTERNO);
    }

    /**
     * Sets <code>value</code> as the attribute value for ClusterNo.
     * @param value value to set the ClusterNo
     */
    public void setClusterNo(String value) {
        setAttributeInternal(CLUSTERNO, value);
    }

    /**
     * Gets the attribute value for UcLibrDetail, using the alias name UcLibrDetail.
     * @return the value of UcLibrDetail
     */
    public Number getUcLibrDetail() {
        return (Number) getAttributeInternal(UCLIBRDETAIL);
    }

    /**
     * Sets <code>value</code> as the attribute value for UcLibrDetail.
     * @param value value to set the UcLibrDetail
     */
    public void setUcLibrDetail(Number value) {
        setAttributeInternal(UCLIBRDETAIL, value);
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
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getTblClusterAttMaster() {
        return (RowIterator) getAttributeInternal(TBLCLUSTERATTMASTER);
    }

    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getTblClusterMaster() {
        return (RowIterator) getAttributeInternal(TBLCLUSTERMASTER);
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
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getTblFarmerReg() {
        return (RowIterator) getAttributeInternal(TBLFARMERREG);
    }

    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getTblGrantApprovalMaster() {
        return (RowIterator) getAttributeInternal(TBLGRANTAPPROVALMASTER);
    }

    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getTblGrantAppMaster() {
        return (RowIterator) getAttributeInternal(TBLGRANTAPPMASTER);
    }

    /**
     * @return the associated entity TblLibrDetailImpl.
     */
    public TblLibrDetailImpl getTblLibrDetail() {
        return (TblLibrDetailImpl) getAttributeInternal(TBLLIBRDETAIL);
    }

    /**
     * Sets <code>value</code> as the associated entity TblLibrDetailImpl.
     */
    public void setTblLibrDetail(TblLibrDetailImpl value) {
        setAttributeInternal(TBLLIBRDETAIL, value);
    }

    /**
     * @return the associated entity TblLibrDetailImpl.
     */
    public TblLibrDetailImpl getTblLibrDetail1() {
        return (TblLibrDetailImpl) getAttributeInternal(TBLLIBRDETAIL1);
    }

    /**
     * Sets <code>value</code> as the associated entity TblLibrDetailImpl.
     */
    public void setTblLibrDetail1(TblLibrDetailImpl value) {
        setAttributeInternal(TBLLIBRDETAIL1, value);
    }

    /**
     * @return the associated entity TblLibrDetailImpl.
     */
    public TblLibrDetailImpl getTblLibrDetail2() {
        return (TblLibrDetailImpl) getAttributeInternal(TBLLIBRDETAIL2);
    }

    /**
     * Sets <code>value</code> as the associated entity TblLibrDetailImpl.
     */
    public void setTblLibrDetail2(TblLibrDetailImpl value) {
        setAttributeInternal(TBLLIBRDETAIL2, value);
    }

    /**
     * @return the associated entity TblLibrDetailImpl.
     */
    public TblLibrDetailImpl getTblLibrDetail3() {
        return (TblLibrDetailImpl) getAttributeInternal(TBLLIBRDETAIL3);
    }

    /**
     * Sets <code>value</code> as the associated entity TblLibrDetailImpl.
     */
    public void setTblLibrDetail3(TblLibrDetailImpl value) {
        setAttributeInternal(TBLLIBRDETAIL3, value);
    }

    /**
     * @return the associated entity TblLibrDetailImpl.
     */
    public TblLibrDetailImpl getTblLibrDetail4() {
        return (TblLibrDetailImpl) getAttributeInternal(TBLLIBRDETAIL4);
    }

    /**
     * Sets <code>value</code> as the associated entity TblLibrDetailImpl.
     */
    public void setTblLibrDetail4(TblLibrDetailImpl value) {
        setAttributeInternal(TBLLIBRDETAIL4, value);
    }

    /**
     * @return the associated entity oracle.jbo.server.EntityImpl.
     */
    public TblPhaseImpl getTblPhase() {
        return (TblPhaseImpl) getAttributeInternal(TBLPHASE);
    }

    /**
     * Sets <code>value</code> as the associated entity oracle.jbo.server.EntityImpl.
     */
    public void setTblPhase(TblPhaseImpl value) {
        setAttributeInternal(TBLPHASE, value);
    }

    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getTblTrainingSchDetail() {
        return (RowIterator) getAttributeInternal(TBLTRAININGSCHDETAIL);
    }

    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getMap_Farmer_Detail() {
        return (RowIterator) getAttributeInternal(MAP_FARMER_DETAIL);
    }


    /**
     * @param clusterId key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(Number clusterId) {
        return new Key(new Object[] { clusterId });
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

