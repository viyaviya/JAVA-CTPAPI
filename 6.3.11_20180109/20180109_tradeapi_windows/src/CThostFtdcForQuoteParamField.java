/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package test.thosttraderapi;

public class CThostFtdcForQuoteParamField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected CThostFtdcForQuoteParamField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcForQuoteParamField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        thosttradeapiJNI.delete_CThostFtdcForQuoteParamField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    thosttradeapiJNI.CThostFtdcForQuoteParamField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return thosttradeapiJNI.CThostFtdcForQuoteParamField_BrokerID_get(swigCPtr, this);
  }

  public void setInstrumentID(String value) {
    thosttradeapiJNI.CThostFtdcForQuoteParamField_InstrumentID_set(swigCPtr, this, value);
  }

  public String getInstrumentID() {
    return thosttradeapiJNI.CThostFtdcForQuoteParamField_InstrumentID_get(swigCPtr, this);
  }

  public void setExchangeID(String value) {
    thosttradeapiJNI.CThostFtdcForQuoteParamField_ExchangeID_set(swigCPtr, this, value);
  }

  public String getExchangeID() {
    return thosttradeapiJNI.CThostFtdcForQuoteParamField_ExchangeID_get(swigCPtr, this);
  }

  public void setLastPrice(double value) {
    thosttradeapiJNI.CThostFtdcForQuoteParamField_LastPrice_set(swigCPtr, this, value);
  }

  public double getLastPrice() {
    return thosttradeapiJNI.CThostFtdcForQuoteParamField_LastPrice_get(swigCPtr, this);
  }

  public void setPriceInterval(double value) {
    thosttradeapiJNI.CThostFtdcForQuoteParamField_PriceInterval_set(swigCPtr, this, value);
  }

  public double getPriceInterval() {
    return thosttradeapiJNI.CThostFtdcForQuoteParamField_PriceInterval_get(swigCPtr, this);
  }

  public CThostFtdcForQuoteParamField() {
    this(thosttradeapiJNI.new_CThostFtdcForQuoteParamField(), true);
  }

}
