/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package test.thostmduserapi;

public class CThostFtdcQryTransferSerialField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected CThostFtdcQryTransferSerialField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcQryTransferSerialField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        thostmduserapiJNI.delete_CThostFtdcQryTransferSerialField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    thostmduserapiJNI.CThostFtdcQryTransferSerialField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return thostmduserapiJNI.CThostFtdcQryTransferSerialField_BrokerID_get(swigCPtr, this);
  }

  public void setAccountID(String value) {
    thostmduserapiJNI.CThostFtdcQryTransferSerialField_AccountID_set(swigCPtr, this, value);
  }

  public String getAccountID() {
    return thostmduserapiJNI.CThostFtdcQryTransferSerialField_AccountID_get(swigCPtr, this);
  }

  public void setBankID(String value) {
    thostmduserapiJNI.CThostFtdcQryTransferSerialField_BankID_set(swigCPtr, this, value);
  }

  public String getBankID() {
    return thostmduserapiJNI.CThostFtdcQryTransferSerialField_BankID_get(swigCPtr, this);
  }

  public void setCurrencyID(String value) {
    thostmduserapiJNI.CThostFtdcQryTransferSerialField_CurrencyID_set(swigCPtr, this, value);
  }

  public String getCurrencyID() {
    return thostmduserapiJNI.CThostFtdcQryTransferSerialField_CurrencyID_get(swigCPtr, this);
  }

  public CThostFtdcQryTransferSerialField() {
    this(thostmduserapiJNI.new_CThostFtdcQryTransferSerialField(), true);
  }

}
