/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package test.thostmduserapi;

public class CThostFtdcQrySuperUserField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected CThostFtdcQrySuperUserField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcQrySuperUserField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        thostmduserapiJNI.delete_CThostFtdcQrySuperUserField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setUserID(String value) {
    thostmduserapiJNI.CThostFtdcQrySuperUserField_UserID_set(swigCPtr, this, value);
  }

  public String getUserID() {
    return thostmduserapiJNI.CThostFtdcQrySuperUserField_UserID_get(swigCPtr, this);
  }

  public CThostFtdcQrySuperUserField() {
    this(thostmduserapiJNI.new_CThostFtdcQrySuperUserField(), true);
  }

}