/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package test.thosttraderapi;

public class CThostFtdcLoginForbiddenIPField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected CThostFtdcLoginForbiddenIPField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcLoginForbiddenIPField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        thosttradeapiJNI.delete_CThostFtdcLoginForbiddenIPField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setIPAddress(String value) {
    thosttradeapiJNI.CThostFtdcLoginForbiddenIPField_IPAddress_set(swigCPtr, this, value);
  }

  public String getIPAddress() {
    return thosttradeapiJNI.CThostFtdcLoginForbiddenIPField_IPAddress_get(swigCPtr, this);
  }

  public CThostFtdcLoginForbiddenIPField() {
    this(thosttradeapiJNI.new_CThostFtdcLoginForbiddenIPField(), true);
  }

}
