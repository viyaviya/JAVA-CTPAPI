/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package test.thosttraderapi;

public class CThostFtdcCurrTransferIdentityField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected CThostFtdcCurrTransferIdentityField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcCurrTransferIdentityField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        thosttradeapiJNI.delete_CThostFtdcCurrTransferIdentityField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setIdentityID(int value) {
    thosttradeapiJNI.CThostFtdcCurrTransferIdentityField_IdentityID_set(swigCPtr, this, value);
  }

  public int getIdentityID() {
    return thosttradeapiJNI.CThostFtdcCurrTransferIdentityField_IdentityID_get(swigCPtr, this);
  }

  public CThostFtdcCurrTransferIdentityField() {
    this(thosttradeapiJNI.new_CThostFtdcCurrTransferIdentityField(), true);
  }

}
