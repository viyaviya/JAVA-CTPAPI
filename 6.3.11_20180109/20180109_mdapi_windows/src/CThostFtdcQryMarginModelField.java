/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package test.thostmduserapi;

public class CThostFtdcQryMarginModelField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected CThostFtdcQryMarginModelField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcQryMarginModelField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        thostmduserapiJNI.delete_CThostFtdcQryMarginModelField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    thostmduserapiJNI.CThostFtdcQryMarginModelField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return thostmduserapiJNI.CThostFtdcQryMarginModelField_BrokerID_get(swigCPtr, this);
  }

  public void setMarginModelID(String value) {
    thostmduserapiJNI.CThostFtdcQryMarginModelField_MarginModelID_set(swigCPtr, this, value);
  }

  public String getMarginModelID() {
    return thostmduserapiJNI.CThostFtdcQryMarginModelField_MarginModelID_get(swigCPtr, this);
  }

  public CThostFtdcQryMarginModelField() {
    this(thostmduserapiJNI.new_CThostFtdcQryMarginModelField(), true);
  }

}
