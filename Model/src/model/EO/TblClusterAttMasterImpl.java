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
// ---    Wed Jul 31 12:28:41 PKT 2019
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class TblClusterAttMasterImpl extends EntityImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        ClusterAttMasterId,
        TrainerId,
        ClusterId,
        Dated,
        Status,
        Remarks,
        Latitude,
        Longitude,
        TrainingSchDetailId,
        CreatedBy,
        CreatedDate,
        UpdatedBy,
        UpdatedDate,
        TblClusterAttDetail,
        TblCluster,
        TblTrainer,
        Map_Cluster_Detail;
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


    public static final int CLUSTERATTMASTERID = AttributesEnum.ClusterAttMasterId.index();
    public static final int TRAINERID = AttributesEnum.TrainerId.index();
    public static final int CLUSTERID = AttributesEnum.ClusterId.index();
    public static final int DATED = AttributesEnum.Dated.index();
    public static final int STATUS = AttributesEnum.Status.index();
    public static final int REMARKS = AttributesEnum.Remarks.index();
    public static final int LATITUDE = AttributesEnum.Latitude.index();
    public static final int LONGITUDE = AttributesEnum.Longitude.index();
    public static final int TRAININGSCHDETAILID = AttributesEnum.TrainingSchDetailId.index();
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int CREATEDDATE = AttributesEnum.CreatedDate.index();
    public static final int UPDATEDBY = AttributesEnum.UpdatedBy.index();
    public static final int UPDATEDDATE = AttributesEnum.UpdatedDate.index();
    public static final int TBLCLUSTERATTDETAIL = AttributesEnum.TblClusterAttDetail.index();
    public static final int TBLCLUSTER = AttributesEnum.TblCluster.index();
    public static final int TBLTRAINER = AttributesEnum.TblTrainer.index();
    public static final int MAP_CLUSTER_DETAIL = AttributesEnum.Map_Cluster_Detail.index();

    /**
     * This is the default constructor (do not remove).
     */
    public TblClusterAttMasterImpl() {
    }

    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        return EntityDefImpl.findDefObject("model.EO.TblClusterAttMaster");
    }


    /**
     * Gets the attribute value for ClusterAttMasterId, using the alias name ClusterAttMasterId.
     * @return the value of ClusterAttMasterId
     */
    public Number getClusterAttMasterId() {
        return (Number) getAttributeInternal(CLUSTERATTMASTERID);
    }

    /**
     * Sets <code>value</code> as the attribute value for ClusterAttMasterId.
     * @param value value to set the ClusterAttMasterId
     */
    public void setClusterAttMasterId(Number value) {
        setAttributeInternal(CLUSTERATTMASTERID, value);
    }

    /**
     * Gets the attribute value for TrainerId, using the alias name TrainerId.
     * @return the value of TrainerId
     */
    public Number getTrainerId() {
        return (Number) getAttributeInternal(TRAINERID);
    }

    /**
     * Sets <code>value</code> as the attribute value for TrainerId.
     * @param value value to set the TrainerId
     */
    public void setTrainerId(Number value) {
        setAttributeInternal(TRAINERID, value);
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
     * Gets the attribute value for Remarks, using the alias name Remarks.
     * @return the value of Remarks
     */
    public String getRemarks() {
        return (String) getAttributeInternal(REMARKS);
    }

    /**
     * Sets <code>value</code> as the attribute value for Remarks.
     * @param value value to set the Remarks
     */
    public void setRemarks(String value) {
        setAttributeInternal(REMARKS, value);
    }

    /**
     * Gets the attribute value for Latitude, using the alias name Latitude.
     * @return the value of Latitude
     */
    public Number getLatitude() {
        return (Number) getAttributeInternal(LATITUDE);
    }

    /**
     * Sets <code>value</code> as the attribute value for Latitude.
     * @param value value to set the Latitude
     */
    public void setLatitude(Number value) {
        setAttributeInternal(LATITUDE, value);
    }

    /**
     * Gets the attribute value for Longitude, using the alias name Longitude.
     * @return the value of Longitude
     */
    public Number getLongitude() {
        return (Number) getAttributeInternal(LONGITUDE);
    }

    /**
     * Sets <code>value</code> as the attribute value for Longitude.
     * @param value value to set the Longitude
     */
    public void setLongitude(Number value) {
        setAttributeInternal(LONGITUDE, value);
    }

    /**
     * Gets the attribute value for TrainingSchDetailId, using the alias name TrainingSchDetailId.
     * @return the value of TrainingSchDetailId
     */
    public Number getTrainingSchDetailId() {
        return (Number) getAttributeInternal(TRAININGSCHDETAILID);
    }

    /**
     * Sets <code>value</code> as the attribute value for TrainingSchDetailId.
     * @param value value to set the TrainingSchDetailId
     */
    public void setTrainingSchDetailId(Number value) {
        setAttributeInternal(TRAININGSCHDETAILID, value);
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
    public RowIterator getTblClusterAttDetail() {
        return (RowIterator) getAttributeInternal(TBLCLUSTERATTDETAIL);
    }

    /**
     * @return the associated entity oracle.jbo.server.EntityImpl.
     */
    public TblClusterImpl getTblCluster() {
        return (TblClusterImpl) getAttributeInternal(TBLCLUSTER);
    }

    /**
     * Sets <code>value</code> as the associated entity oracle.jbo.server.EntityImpl.
     */
    public void setTblCluster(TblClusterImpl value) {
        setAttributeInternal(TBLCLUSTER, value);
    }

    /**
     * @return the associated entity TblTrainerImpl.
     */
    public TblTrainerImpl getTblTrainer() {
        return (TblTrainerImpl) getAttributeInternal(TBLTRAINER);
    }

    /**
     * Sets <code>value</code> as the associated entity TblTrainerImpl.
     */
    public void setTblTrainer(TblTrainerImpl value) {
        setAttributeInternal(TBLTRAINER, value);
    }

    /**
     * @return the associated entity oracle.jbo.server.EntityImpl.
     */
    public EntityImpl getMap_Cluster_Detail() {
        return (EntityImpl) getAttributeInternal(MAP_CLUSTER_DETAIL);
    }

    /**
     * Sets <code>value</code> as the associated entity oracle.jbo.server.EntityImpl.
     */
    public void setMap_Cluster_Detail(EntityImpl value) {
        setAttributeInternal(MAP_CLUSTER_DETAIL, value);
    }


    /**
     * @param clusterAttMasterId key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(Number clusterAttMasterId) {
        return new Key(new Object[] { clusterAttMasterId });
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

