/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package test.thostmduserapi;

public class CThostFtdcAuthenticationInfoField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected CThostFtdcAuthenticationInfoField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcAuthenticationInfoField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        thostmduserapiJNI.delete_CThostFtdcAuthenticationInfoField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    thostmduserapiJNI.CThostFtdcAuthenticationInfoField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return thostmduserapiJNI.CThostFtdcAuthenticationInfoField_BrokerID_get(swigCPtr, this);
  }

  public void setUserID(String value) {
    thostmduserapiJNI.CThostFtdcAuthenticationInfoField_UserID_set(swigCPtr, this, value);
  }

  public String getUserID() {
    return thostmduserapiJNI.CThostFtdcAuthenticationInfoField_UserID_get(swigCPtr, this);
  }

  public void setUserProductInfo(String value) {
    thostmduserapiJNI.CThostFtdcAuthenticationInfoField_UserProductInfo_set(swigCPtr, this, value);
  }

  public String getUserProductInfo() {
    return thostmduserapiJNI.CThostFtdcAuthenticationInfoField_UserProductInfo_get(swigCPtr, this);
  }

  public void setAuthInfo(String value) {
    thostmduserapiJNI.CThostFtdcAuthenticationInfoField_AuthInfo_set(swigCPtr, this, value);
  }

  public String getAuthInfo() {
    return thostmduserapiJNI.CThostFtdcAuthenticationInfoField_AuthInfo_get(swigCPtr, this);
  }

  public void setIsResult(int value) {
    thostmduserapiJNI.CThostFtdcAuthenticationInfoField_IsResult_set(swigCPtr, this, value);
  }

  public int getIsResult() {
    return thostmduserapiJNI.CThostFtdcAuthenticationInfoField_IsResult_get(swigCPtr, this);
  }

  public CThostFtdcAuthenticationInfoField() {
    this(thostmduserapiJNI.new_CThostFtdcAuthenticationInfoField(), true);
  }

}
