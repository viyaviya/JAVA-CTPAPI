/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package ctp.thostmduserapi;

public class CThostFtdcUserPasswordUpdateField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected CThostFtdcUserPasswordUpdateField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcUserPasswordUpdateField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        thostmduserapiJNI.delete_CThostFtdcUserPasswordUpdateField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    thostmduserapiJNI.CThostFtdcUserPasswordUpdateField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return thostmduserapiJNI.CThostFtdcUserPasswordUpdateField_BrokerID_get(swigCPtr, this);
  }

  public void setUserID(String value) {
    thostmduserapiJNI.CThostFtdcUserPasswordUpdateField_UserID_set(swigCPtr, this, value);
  }

  public String getUserID() {
    return thostmduserapiJNI.CThostFtdcUserPasswordUpdateField_UserID_get(swigCPtr, this);
  }

  public void setOldPassword(String value) {
    thostmduserapiJNI.CThostFtdcUserPasswordUpdateField_OldPassword_set(swigCPtr, this, value);
  }

  public String getOldPassword() {
    return thostmduserapiJNI.CThostFtdcUserPasswordUpdateField_OldPassword_get(swigCPtr, this);
  }

  public void setNewPassword(String value) {
    thostmduserapiJNI.CThostFtdcUserPasswordUpdateField_NewPassword_set(swigCPtr, this, value);
  }

  public String getNewPassword() {
    return thostmduserapiJNI.CThostFtdcUserPasswordUpdateField_NewPassword_get(swigCPtr, this);
  }

  public CThostFtdcUserPasswordUpdateField() {
    this(thostmduserapiJNI.new_CThostFtdcUserPasswordUpdateField(), true);
  }

}
