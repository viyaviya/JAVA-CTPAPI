/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package test.thosttraderapi;

public class CThostFtdcQryQuoteField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected CThostFtdcQryQuoteField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcQryQuoteField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        thosttradeapiJNI.delete_CThostFtdcQryQuoteField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    thosttradeapiJNI.CThostFtdcQryQuoteField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return thosttradeapiJNI.CThostFtdcQryQuoteField_BrokerID_get(swigCPtr, this);
  }

  public void setInvestorID(String value) {
    thosttradeapiJNI.CThostFtdcQryQuoteField_InvestorID_set(swigCPtr, this, value);
  }

  public String getInvestorID() {
    return thosttradeapiJNI.CThostFtdcQryQuoteField_InvestorID_get(swigCPtr, this);
  }

  public void setInstrumentID(String value) {
    thosttradeapiJNI.CThostFtdcQryQuoteField_InstrumentID_set(swigCPtr, this, value);
  }

  public String getInstrumentID() {
    return thosttradeapiJNI.CThostFtdcQryQuoteField_InstrumentID_get(swigCPtr, this);
  }

  public void setExchangeID(String value) {
    thosttradeapiJNI.CThostFtdcQryQuoteField_ExchangeID_set(swigCPtr, this, value);
  }

  public String getExchangeID() {
    return thosttradeapiJNI.CThostFtdcQryQuoteField_ExchangeID_get(swigCPtr, this);
  }

  public void setQuoteSysID(String value) {
    thosttradeapiJNI.CThostFtdcQryQuoteField_QuoteSysID_set(swigCPtr, this, value);
  }

  public String getQuoteSysID() {
    return thosttradeapiJNI.CThostFtdcQryQuoteField_QuoteSysID_get(swigCPtr, this);
  }

  public void setInsertTimeStart(String value) {
    thosttradeapiJNI.CThostFtdcQryQuoteField_InsertTimeStart_set(swigCPtr, this, value);
  }

  public String getInsertTimeStart() {
    return thosttradeapiJNI.CThostFtdcQryQuoteField_InsertTimeStart_get(swigCPtr, this);
  }

  public void setInsertTimeEnd(String value) {
    thosttradeapiJNI.CThostFtdcQryQuoteField_InsertTimeEnd_set(swigCPtr, this, value);
  }

  public String getInsertTimeEnd() {
    return thosttradeapiJNI.CThostFtdcQryQuoteField_InsertTimeEnd_get(swigCPtr, this);
  }

  public void setInvestUnitID(String value) {
    thosttradeapiJNI.CThostFtdcQryQuoteField_InvestUnitID_set(swigCPtr, this, value);
  }

  public String getInvestUnitID() {
    return thosttradeapiJNI.CThostFtdcQryQuoteField_InvestUnitID_get(swigCPtr, this);
  }

  public CThostFtdcQryQuoteField() {
    this(thosttradeapiJNI.new_CThostFtdcQryQuoteField(), true);
  }

}
