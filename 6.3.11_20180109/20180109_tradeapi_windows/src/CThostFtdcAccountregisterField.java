/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package test.thosttraderapi;

public class CThostFtdcAccountregisterField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected CThostFtdcAccountregisterField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcAccountregisterField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        thosttradeapiJNI.delete_CThostFtdcAccountregisterField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setTradeDay(String value) {
    thosttradeapiJNI.CThostFtdcAccountregisterField_TradeDay_set(swigCPtr, this, value);
  }

  public String getTradeDay() {
    return thosttradeapiJNI.CThostFtdcAccountregisterField_TradeDay_get(swigCPtr, this);
  }

  public void setBankID(String value) {
    thosttradeapiJNI.CThostFtdcAccountregisterField_BankID_set(swigCPtr, this, value);
  }

  public String getBankID() {
    return thosttradeapiJNI.CThostFtdcAccountregisterField_BankID_get(swigCPtr, this);
  }

  public void setBankBranchID(String value) {
    thosttradeapiJNI.CThostFtdcAccountregisterField_BankBranchID_set(swigCPtr, this, value);
  }

  public String getBankBranchID() {
    return thosttradeapiJNI.CThostFtdcAccountregisterField_BankBranchID_get(swigCPtr, this);
  }

  public void setBankAccount(String value) {
    thosttradeapiJNI.CThostFtdcAccountregisterField_BankAccount_set(swigCPtr, this, value);
  }

  public String getBankAccount() {
    return thosttradeapiJNI.CThostFtdcAccountregisterField_BankAccount_get(swigCPtr, this);
  }

  public void setBrokerID(String value) {
    thosttradeapiJNI.CThostFtdcAccountregisterField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return thosttradeapiJNI.CThostFtdcAccountregisterField_BrokerID_get(swigCPtr, this);
  }

  public void setBrokerBranchID(String value) {
    thosttradeapiJNI.CThostFtdcAccountregisterField_BrokerBranchID_set(swigCPtr, this, value);
  }

  public String getBrokerBranchID() {
    return thosttradeapiJNI.CThostFtdcAccountregisterField_BrokerBranchID_get(swigCPtr, this);
  }

  public void setAccountID(String value) {
    thosttradeapiJNI.CThostFtdcAccountregisterField_AccountID_set(swigCPtr, this, value);
  }

  public String getAccountID() {
    return thosttradeapiJNI.CThostFtdcAccountregisterField_AccountID_get(swigCPtr, this);
  }

  public void setIdCardType(char value) {
    thosttradeapiJNI.CThostFtdcAccountregisterField_IdCardType_set(swigCPtr, this, value);
  }

  public char getIdCardType() {
    return thosttradeapiJNI.CThostFtdcAccountregisterField_IdCardType_get(swigCPtr, this);
  }

  public void setIdentifiedCardNo(String value) {
    thosttradeapiJNI.CThostFtdcAccountregisterField_IdentifiedCardNo_set(swigCPtr, this, value);
  }

  public String getIdentifiedCardNo() {
    return thosttradeapiJNI.CThostFtdcAccountregisterField_IdentifiedCardNo_get(swigCPtr, this);
  }

  public void setCustomerName(String value) {
    thosttradeapiJNI.CThostFtdcAccountregisterField_CustomerName_set(swigCPtr, this, value);
  }

  public String getCustomerName() {
    return thosttradeapiJNI.CThostFtdcAccountregisterField_CustomerName_get(swigCPtr, this);
  }

  public void setCurrencyID(String value) {
    thosttradeapiJNI.CThostFtdcAccountregisterField_CurrencyID_set(swigCPtr, this, value);
  }

  public String getCurrencyID() {
    return thosttradeapiJNI.CThostFtdcAccountregisterField_CurrencyID_get(swigCPtr, this);
  }

  public void setOpenOrDestroy(char value) {
    thosttradeapiJNI.CThostFtdcAccountregisterField_OpenOrDestroy_set(swigCPtr, this, value);
  }

  public char getOpenOrDestroy() {
    return thosttradeapiJNI.CThostFtdcAccountregisterField_OpenOrDestroy_get(swigCPtr, this);
  }

  public void setRegDate(String value) {
    thosttradeapiJNI.CThostFtdcAccountregisterField_RegDate_set(swigCPtr, this, value);
  }

  public String getRegDate() {
    return thosttradeapiJNI.CThostFtdcAccountregisterField_RegDate_get(swigCPtr, this);
  }

  public void setOutDate(String value) {
    thosttradeapiJNI.CThostFtdcAccountregisterField_OutDate_set(swigCPtr, this, value);
  }

  public String getOutDate() {
    return thosttradeapiJNI.CThostFtdcAccountregisterField_OutDate_get(swigCPtr, this);
  }

  public void setTID(int value) {
    thosttradeapiJNI.CThostFtdcAccountregisterField_TID_set(swigCPtr, this, value);
  }

  public int getTID() {
    return thosttradeapiJNI.CThostFtdcAccountregisterField_TID_get(swigCPtr, this);
  }

  public void setCustType(char value) {
    thosttradeapiJNI.CThostFtdcAccountregisterField_CustType_set(swigCPtr, this, value);
  }

  public char getCustType() {
    return thosttradeapiJNI.CThostFtdcAccountregisterField_CustType_get(swigCPtr, this);
  }

  public void setBankAccType(char value) {
    thosttradeapiJNI.CThostFtdcAccountregisterField_BankAccType_set(swigCPtr, this, value);
  }

  public char getBankAccType() {
    return thosttradeapiJNI.CThostFtdcAccountregisterField_BankAccType_get(swigCPtr, this);
  }

  public void setLongCustomerName(String value) {
    thosttradeapiJNI.CThostFtdcAccountregisterField_LongCustomerName_set(swigCPtr, this, value);
  }

  public String getLongCustomerName() {
    return thosttradeapiJNI.CThostFtdcAccountregisterField_LongCustomerName_get(swigCPtr, this);
  }

  public CThostFtdcAccountregisterField() {
    this(thosttradeapiJNI.new_CThostFtdcAccountregisterField(), true);
  }

}
