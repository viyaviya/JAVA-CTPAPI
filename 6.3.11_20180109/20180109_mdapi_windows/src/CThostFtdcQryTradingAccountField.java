/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package test.thostmduserapi;

public class CThostFtdcQryTradingAccountField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected CThostFtdcQryTradingAccountField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcQryTradingAccountField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        thostmduserapiJNI.delete_CThostFtdcQryTradingAccountField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    thostmduserapiJNI.CThostFtdcQryTradingAccountField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return thostmduserapiJNI.CThostFtdcQryTradingAccountField_BrokerID_get(swigCPtr, this);
  }

  public void setInvestorID(String value) {
    thostmduserapiJNI.CThostFtdcQryTradingAccountField_InvestorID_set(swigCPtr, this, value);
  }

  public String getInvestorID() {
    return thostmduserapiJNI.CThostFtdcQryTradingAccountField_InvestorID_get(swigCPtr, this);
  }

  public void setCurrencyID(String value) {
    thostmduserapiJNI.CThostFtdcQryTradingAccountField_CurrencyID_set(swigCPtr, this, value);
  }

  public String getCurrencyID() {
    return thostmduserapiJNI.CThostFtdcQryTradingAccountField_CurrencyID_get(swigCPtr, this);
  }

  public void setBizType(char value) {
    thostmduserapiJNI.CThostFtdcQryTradingAccountField_BizType_set(swigCPtr, this, value);
  }

  public char getBizType() {
    return thostmduserapiJNI.CThostFtdcQryTradingAccountField_BizType_get(swigCPtr, this);
  }

  public void setAccountID(String value) {
    thostmduserapiJNI.CThostFtdcQryTradingAccountField_AccountID_set(swigCPtr, this, value);
  }

  public String getAccountID() {
    return thostmduserapiJNI.CThostFtdcQryTradingAccountField_AccountID_get(swigCPtr, this);
  }

  public CThostFtdcQryTradingAccountField() {
    this(thostmduserapiJNI.new_CThostFtdcQryTradingAccountField(), true);
  }

}
