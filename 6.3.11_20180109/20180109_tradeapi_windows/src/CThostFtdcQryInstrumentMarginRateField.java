/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package test.thosttraderapi;

public class CThostFtdcQryInstrumentMarginRateField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected CThostFtdcQryInstrumentMarginRateField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcQryInstrumentMarginRateField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        thosttradeapiJNI.delete_CThostFtdcQryInstrumentMarginRateField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    thosttradeapiJNI.CThostFtdcQryInstrumentMarginRateField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return thosttradeapiJNI.CThostFtdcQryInstrumentMarginRateField_BrokerID_get(swigCPtr, this);
  }

  public void setInvestorID(String value) {
    thosttradeapiJNI.CThostFtdcQryInstrumentMarginRateField_InvestorID_set(swigCPtr, this, value);
  }

  public String getInvestorID() {
    return thosttradeapiJNI.CThostFtdcQryInstrumentMarginRateField_InvestorID_get(swigCPtr, this);
  }

  public void setInstrumentID(String value) {
    thosttradeapiJNI.CThostFtdcQryInstrumentMarginRateField_InstrumentID_set(swigCPtr, this, value);
  }

  public String getInstrumentID() {
    return thosttradeapiJNI.CThostFtdcQryInstrumentMarginRateField_InstrumentID_get(swigCPtr, this);
  }

  public void setHedgeFlag(char value) {
    thosttradeapiJNI.CThostFtdcQryInstrumentMarginRateField_HedgeFlag_set(swigCPtr, this, value);
  }

  public char getHedgeFlag() {
    return thosttradeapiJNI.CThostFtdcQryInstrumentMarginRateField_HedgeFlag_get(swigCPtr, this);
  }

  public void setExchangeID(String value) {
    thosttradeapiJNI.CThostFtdcQryInstrumentMarginRateField_ExchangeID_set(swigCPtr, this, value);
  }

  public String getExchangeID() {
    return thosttradeapiJNI.CThostFtdcQryInstrumentMarginRateField_ExchangeID_get(swigCPtr, this);
  }

  public void setInvestUnitID(String value) {
    thosttradeapiJNI.CThostFtdcQryInstrumentMarginRateField_InvestUnitID_set(swigCPtr, this, value);
  }

  public String getInvestUnitID() {
    return thosttradeapiJNI.CThostFtdcQryInstrumentMarginRateField_InvestUnitID_get(swigCPtr, this);
  }

  public CThostFtdcQryInstrumentMarginRateField() {
    this(thosttradeapiJNI.new_CThostFtdcQryInstrumentMarginRateField(), true);
  }

}
