/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package test.thostmduserapi;

public class CThostFtdcVerifyFuturePasswordAndCustInfoField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected CThostFtdcVerifyFuturePasswordAndCustInfoField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcVerifyFuturePasswordAndCustInfoField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        thostmduserapiJNI.delete_CThostFtdcVerifyFuturePasswordAndCustInfoField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setCustomerName(String value) {
    thostmduserapiJNI.CThostFtdcVerifyFuturePasswordAndCustInfoField_CustomerName_set(swigCPtr, this, value);
  }

  public String getCustomerName() {
    return thostmduserapiJNI.CThostFtdcVerifyFuturePasswordAndCustInfoField_CustomerName_get(swigCPtr, this);
  }

  public void setIdCardType(char value) {
    thostmduserapiJNI.CThostFtdcVerifyFuturePasswordAndCustInfoField_IdCardType_set(swigCPtr, this, value);
  }

  public char getIdCardType() {
    return thostmduserapiJNI.CThostFtdcVerifyFuturePasswordAndCustInfoField_IdCardType_get(swigCPtr, this);
  }

  public void setIdentifiedCardNo(String value) {
    thostmduserapiJNI.CThostFtdcVerifyFuturePasswordAndCustInfoField_IdentifiedCardNo_set(swigCPtr, this, value);
  }

  public String getIdentifiedCardNo() {
    return thostmduserapiJNI.CThostFtdcVerifyFuturePasswordAndCustInfoField_IdentifiedCardNo_get(swigCPtr, this);
  }

  public void setCustType(char value) {
    thostmduserapiJNI.CThostFtdcVerifyFuturePasswordAndCustInfoField_CustType_set(swigCPtr, this, value);
  }

  public char getCustType() {
    return thostmduserapiJNI.CThostFtdcVerifyFuturePasswordAndCustInfoField_CustType_get(swigCPtr, this);
  }

  public void setAccountID(String value) {
    thostmduserapiJNI.CThostFtdcVerifyFuturePasswordAndCustInfoField_AccountID_set(swigCPtr, this, value);
  }

  public String getAccountID() {
    return thostmduserapiJNI.CThostFtdcVerifyFuturePasswordAndCustInfoField_AccountID_get(swigCPtr, this);
  }

  public void setPassword(String value) {
    thostmduserapiJNI.CThostFtdcVerifyFuturePasswordAndCustInfoField_Password_set(swigCPtr, this, value);
  }

  public String getPassword() {
    return thostmduserapiJNI.CThostFtdcVerifyFuturePasswordAndCustInfoField_Password_get(swigCPtr, this);
  }

  public void setCurrencyID(String value) {
    thostmduserapiJNI.CThostFtdcVerifyFuturePasswordAndCustInfoField_CurrencyID_set(swigCPtr, this, value);
  }

  public String getCurrencyID() {
    return thostmduserapiJNI.CThostFtdcVerifyFuturePasswordAndCustInfoField_CurrencyID_get(swigCPtr, this);
  }

  public void setLongCustomerName(String value) {
    thostmduserapiJNI.CThostFtdcVerifyFuturePasswordAndCustInfoField_LongCustomerName_set(swigCPtr, this, value);
  }

  public String getLongCustomerName() {
    return thostmduserapiJNI.CThostFtdcVerifyFuturePasswordAndCustInfoField_LongCustomerName_get(swigCPtr, this);
  }

  public CThostFtdcVerifyFuturePasswordAndCustInfoField() {
    this(thostmduserapiJNI.new_CThostFtdcVerifyFuturePasswordAndCustInfoField(), true);
  }

}
