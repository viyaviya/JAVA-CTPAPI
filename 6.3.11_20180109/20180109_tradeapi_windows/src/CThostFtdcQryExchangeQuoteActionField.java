/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package test.thosttraderapi;

public class CThostFtdcQryExchangeQuoteActionField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected CThostFtdcQryExchangeQuoteActionField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcQryExchangeQuoteActionField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        thosttradeapiJNI.delete_CThostFtdcQryExchangeQuoteActionField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setParticipantID(String value) {
    thosttradeapiJNI.CThostFtdcQryExchangeQuoteActionField_ParticipantID_set(swigCPtr, this, value);
  }

  public String getParticipantID() {
    return thosttradeapiJNI.CThostFtdcQryExchangeQuoteActionField_ParticipantID_get(swigCPtr, this);
  }

  public void setClientID(String value) {
    thosttradeapiJNI.CThostFtdcQryExchangeQuoteActionField_ClientID_set(swigCPtr, this, value);
  }

  public String getClientID() {
    return thosttradeapiJNI.CThostFtdcQryExchangeQuoteActionField_ClientID_get(swigCPtr, this);
  }

  public void setExchangeID(String value) {
    thosttradeapiJNI.CThostFtdcQryExchangeQuoteActionField_ExchangeID_set(swigCPtr, this, value);
  }

  public String getExchangeID() {
    return thosttradeapiJNI.CThostFtdcQryExchangeQuoteActionField_ExchangeID_get(swigCPtr, this);
  }

  public void setTraderID(String value) {
    thosttradeapiJNI.CThostFtdcQryExchangeQuoteActionField_TraderID_set(swigCPtr, this, value);
  }

  public String getTraderID() {
    return thosttradeapiJNI.CThostFtdcQryExchangeQuoteActionField_TraderID_get(swigCPtr, this);
  }

  public CThostFtdcQryExchangeQuoteActionField() {
    this(thosttradeapiJNI.new_CThostFtdcQryExchangeQuoteActionField(), true);
  }

}
