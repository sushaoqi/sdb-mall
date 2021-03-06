package io.sdb.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseLogistics<M extends BaseLogistics<M>> extends Model<M> implements IBean {

	public void setTrackingNo(java.lang.String trackingNo) {
		set("tracking_no", trackingNo);
	}
	
	public java.lang.String getTrackingNo() {
		return getStr("tracking_no");
	}

	public void setCheckState(java.lang.Integer checkState) {
		set("check_state", checkState);
	}
	
	public java.lang.Integer getCheckState() {
		return getInt("check_state");
	}

	public void setOrderState(java.lang.Integer orderState) {
		set("order_state", orderState);
	}
	
	public java.lang.Integer getOrderState() {
		return getInt("order_state");
	}

	public void setData(java.lang.String data) {
		set("data", data);
	}
	
	public java.lang.String getData() {
		return getStr("data");
	}

	public void setCreateDate(java.util.Date createDate) {
		set("create_date", createDate);
	}
	
	public java.util.Date getCreateDate() {
		return get("create_date");
	}

	public void setUpdateDate(java.util.Date updateDate) {
		set("update_date", updateDate);
	}
	
	public java.util.Date getUpdateDate() {
		return get("update_date");
	}

}
