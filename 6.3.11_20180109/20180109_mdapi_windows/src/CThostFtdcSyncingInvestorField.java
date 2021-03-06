/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package ctp.thostmduserapi;

public class CThostFtdcSyncingInvestorField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected CThostFtdcSyncingInvestorField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcSyncingInvestorField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        thostmduserapiJNI.delete_CThostFtdcSyncingInvestorField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setInvestorID(String value) {
    thostmduserapiJNI.CThostFtdcSyncingInvestorField_InvestorID_set(swigCPtr, this, value);
  }

  public String getInvestorID() {
    return thostmduserapiJNI.CThostFtdcSyncingInvestorField_InvestorID_get(swigCPtr, this);
  }

  public void setBrokerID(String value) {
    thostmduserapiJNI.CThostFtdcSyncingInvestorField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return thostmduserapiJNI.CThostFtdcSyncingInvestorField_BrokerID_get(swigCPtr, this);
  }

  public void setInvestorGroupID(String value) {
    thostmduserapiJNI.CThostFtdcSyncingInvestorField_InvestorGroupID_set(swigCPtr, this, value);
  }

  public String getInvestorGroupID() {
    return thostmduserapiJNI.CThostFtdcSyncingInvestorField_InvestorGroupID_get(swigCPtr, this);
  }

  public void setInvestorName(String value) {
    thostmduserapiJNI.CThostFtdcSyncingInvestorField_InvestorName_set(swigCPtr, this, value);
  }

  public String getInvestorName() {
    return thostmduserapiJNI.CThostFtdcSyncingInvestorField_InvestorName_get(swigCPtr, this);
  }

  public void setIdentifiedCardType(char value) {
    thostmduserapiJNI.CThostFtdcSyncingInvestorField_IdentifiedCardType_set(swigCPtr, this, value);
  }

  public char getIdentifiedCardType() {
    return thostmduserapiJNI.CThostFtdcSyncingInvestorField_IdentifiedCardType_get(swigCPtr, this);
  }

  public void setIdentifiedCardNo(String value) {
    thostmduserapiJNI.CThostFtdcSyncingInvestorField_IdentifiedCardNo_set(swigCPtr, this, value);
  }

  public String getIdentifiedCardNo() {
    return thostmduserapiJNI.CThostFtdcSyncingInvestorField_IdentifiedCardNo_get(swigCPtr, this);
  }

  public void setIsActive(int value) {
    thostmduserapiJNI.CThostFtdcSyncingInvestorField_IsActive_set(swigCPtr, this, value);
  }

  public int getIsActive() {
    return thostmduserapiJNI.CThostFtdcSyncingInvestorField_IsActive_get(swigCPtr, this);
  }

  public void setTelephone(String value) {
    thostmduserapiJNI.CThostFtdcSyncingInvestorField_Telephone_set(swigCPtr, this, value);
  }

  public String getTelephone() {
    return thostmduserapiJNI.CThostFtdcSyncingInvestorField_Telephone_get(swigCPtr, this);
  }

  public void setAddress(String value) {
    thostmduserapiJNI.CThostFtdcSyncingInvestorField_Address_set(swigCPtr, this, value);
  }

  public String getAddress() {
    return thostmduserapiJNI.CThostFtdcSyncingInvestorField_Address_get(swigCPtr, this);
  }

  public void setOpenDate(String value) {
    thostmduserapiJNI.CThostFtdcSyncingInvestorField_OpenDate_set(swigCPtr, this, value);
  }

  public String getOpenDate() {
    return thostmduserapiJNI.CThostFtdcSyncingInvestorField_OpenDate_get(swigCPtr, this);
  }

  public void setMobile(String value) {
    thostmduserapiJNI.CThostFtdcSyncingInvestorField_Mobile_set(swigCPtr, this, value);
  }

  public String getMobile() {
    return thostmduserapiJNI.CThostFtdcSyncingInvestorField_Mobile_get(swigCPtr, this);
  }

  public void setCommModelID(String value) {
    thostmduserapiJNI.CThostFtdcSyncingInvestorField_CommModelID_set(swigCPtr, this, value);
  }

  public String getCommModelID() {
    return thostmduserapiJNI.CThostFtdcSyncingInvestorField_CommModelID_get(swigCPtr, this);
  }

  public void setMarginModelID(String value) {
    thostmduserapiJNI.CThostFtdcSyncingInvestorField_MarginModelID_set(swigCPtr, this, value);
  }

  public String getMarginModelID() {
    return thostmduserapiJNI.CThostFtdcSyncingInvestorField_MarginModelID_get(swigCPtr, this);
  }

  public CThostFtdcSyncingInvestorField() {
    this(thostmduserapiJNI.new_CThostFtdcSyncingInvestorField(), true);
  }

}
