/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package test.thosttraderapi;

public class CThostFtdcCommRateModelField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected CThostFtdcCommRateModelField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcCommRateModelField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        thosttradeapiJNI.delete_CThostFtdcCommRateModelField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    thosttradeapiJNI.CThostFtdcCommRateModelField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return thosttradeapiJNI.CThostFtdcCommRateModelField_BrokerID_get(swigCPtr, this);
  }

  public void setCommModelID(String value) {
    thosttradeapiJNI.CThostFtdcCommRateModelField_CommModelID_set(swigCPtr, this, value);
  }

  public String getCommModelID() {
    return thosttradeapiJNI.CThostFtdcCommRateModelField_CommModelID_get(swigCPtr, this);
  }

  public void setCommModelName(String value) {
    thosttradeapiJNI.CThostFtdcCommRateModelField_CommModelName_set(swigCPtr, this, value);
  }

  public String getCommModelName() {
    return thosttradeapiJNI.CThostFtdcCommRateModelField_CommModelName_get(swigCPtr, this);
  }

  public CThostFtdcCommRateModelField() {
    this(thosttradeapiJNI.new_CThostFtdcCommRateModelField(), true);
  }

}
