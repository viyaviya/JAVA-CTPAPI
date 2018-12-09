/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package test.thostmduserapi;

public class CThostFtdcNotifyFutureSignInField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected CThostFtdcNotifyFutureSignInField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcNotifyFutureSignInField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        thostmduserapiJNI.delete_CThostFtdcNotifyFutureSignInField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setTradeCode(String value) {
    thostmduserapiJNI.CThostFtdcNotifyFutureSignInField_TradeCode_set(swigCPtr, this, value);
  }

  public String getTradeCode() {
    return thostmduserapiJNI.CThostFtdcNotifyFutureSignInField_TradeCode_get(swigCPtr, this);
  }

  public void setBankID(String value) {
    thostmduserapiJNI.CThostFtdcNotifyFutureSignInField_BankID_set(swigCPtr, this, value);
  }

  public String getBankID() {
    return thostmduserapiJNI.CThostFtdcNotifyFutureSignInField_BankID_get(swigCPtr, this);
  }

  public void setBankBranchID(String value) {
    thostmduserapiJNI.CThostFtdcNotifyFutureSignInField_BankBranchID_set(swigCPtr, this, value);
  }

  public String getBankBranchID() {
    return thostmduserapiJNI.CThostFtdcNotifyFutureSignInField_BankBranchID_get(swigCPtr, this);
  }

  public void setBrokerID(String value) {
    thostmduserapiJNI.CThostFtdcNotifyFutureSignInField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return thostmduserapiJNI.CThostFtdcNotifyFutureSignInField_BrokerID_get(swigCPtr, this);
  }

  public void setBrokerBranchID(String value) {
    thostmduserapiJNI.CThostFtdcNotifyFutureSignInField_BrokerBranchID_set(swigCPtr, this, value);
  }

  public String getBrokerBranchID() {
    return thostmduserapiJNI.CThostFtdcNotifyFutureSignInField_BrokerBranchID_get(swigCPtr, this);
  }

  public void setTradeDate(String value) {
    thostmduserapiJNI.CThostFtdcNotifyFutureSignInField_TradeDate_set(swigCPtr, this, value);
  }

  public String getTradeDate() {
    return thostmduserapiJNI.CThostFtdcNotifyFutureSignInField_TradeDate_get(swigCPtr, this);
  }

  public void setTradeTime(String value) {
    thostmduserapiJNI.CThostFtdcNotifyFutureSignInField_TradeTime_set(swigCPtr, this, value);
  }

  public String getTradeTime() {
    return thostmduserapiJNI.CThostFtdcNotifyFutureSignInField_TradeTime_get(swigCPtr, this);
  }

  public void setBankSerial(String value) {
    thostmduserapiJNI.CThostFtdcNotifyFutureSignInField_BankSerial_set(swigCPtr, this, value);
  }

  public String getBankSerial() {
    return thostmduserapiJNI.CThostFtdcNotifyFutureSignInField_BankSerial_get(swigCPtr, this);
  }

  public void setTradingDay(String value) {
    thostmduserapiJNI.CThostFtdcNotifyFutureSignInField_TradingDay_set(swigCPtr, this, value);
  }

  public String getTradingDay() {
    return thostmduserapiJNI.CThostFtdcNotifyFutureSignInField_TradingDay_get(swigCPtr, this);
  }

  public void setPlateSerial(int value) {
    thostmduserapiJNI.CThostFtdcNotifyFutureSignInField_PlateSerial_set(swigCPtr, this, value);
  }

  public int getPlateSerial() {
    return thostmduserapiJNI.CThostFtdcNotifyFutureSignInField_PlateSerial_get(swigCPtr, this);
  }

  public void setLastFragment(char value) {
    thostmduserapiJNI.CThostFtdcNotifyFutureSignInField_LastFragment_set(swigCPtr, this, value);
  }

  public char getLastFragment() {
    return thostmduserapiJNI.CThostFtdcNotifyFutureSignInField_LastFragment_get(swigCPtr, this);
  }

  public void setSessionID(int value) {
    thostmduserapiJNI.CThostFtdcNotifyFutureSignInField_SessionID_set(swigCPtr, this, value);
  }

  public int getSessionID() {
    return thostmduserapiJNI.CThostFtdcNotifyFutureSignInField_SessionID_get(swigCPtr, this);
  }

  public void setInstallID(int value) {
    thostmduserapiJNI.CThostFtdcNotifyFutureSignInField_InstallID_set(swigCPtr, this, value);
  }

  public int getInstallID() {
    return thostmduserapiJNI.CThostFtdcNotifyFutureSignInField_InstallID_get(swigCPtr, this);
  }

  public void setUserID(String value) {
    thostmduserapiJNI.CThostFtdcNotifyFutureSignInField_UserID_set(swigCPtr, this, value);
  }

  public String getUserID() {
    return thostmduserapiJNI.CThostFtdcNotifyFutureSignInField_UserID_get(swigCPtr, this);
  }

  public void setDigest(String value) {
    thostmduserapiJNI.CThostFtdcNotifyFutureSignInField_Digest_set(swigCPtr, this, value);
  }

  public String getDigest() {
    return thostmduserapiJNI.CThostFtdcNotifyFutureSignInField_Digest_get(swigCPtr, this);
  }

  public void setCurrencyID(String value) {
    thostmduserapiJNI.CThostFtdcNotifyFutureSignInField_CurrencyID_set(swigCPtr, this, value);
  }

  public String getCurrencyID() {
    return thostmduserapiJNI.CThostFtdcNotifyFutureSignInField_CurrencyID_get(swigCPtr, this);
  }

  public void setDeviceID(String value) {
    thostmduserapiJNI.CThostFtdcNotifyFutureSignInField_DeviceID_set(swigCPtr, this, value);
  }

  public String getDeviceID() {
    return thostmduserapiJNI.CThostFtdcNotifyFutureSignInField_DeviceID_get(swigCPtr, this);
  }

  public void setBrokerIDByBank(String value) {
    thostmduserapiJNI.CThostFtdcNotifyFutureSignInField_BrokerIDByBank_set(swigCPtr, this, value);
  }

  public String getBrokerIDByBank() {
    return thostmduserapiJNI.CThostFtdcNotifyFutureSignInField_BrokerIDByBank_get(swigCPtr, this);
  }

  public void setOperNo(String value) {
    thostmduserapiJNI.CThostFtdcNotifyFutureSignInField_OperNo_set(swigCPtr, this, value);
  }

  public String getOperNo() {
    return thostmduserapiJNI.CThostFtdcNotifyFutureSignInField_OperNo_get(swigCPtr, this);
  }

  public void setRequestID(int value) {
    thostmduserapiJNI.CThostFtdcNotifyFutureSignInField_RequestID_set(swigCPtr, this, value);
  }

  public int getRequestID() {
    return thostmduserapiJNI.CThostFtdcNotifyFutureSignInField_RequestID_get(swigCPtr, this);
  }

  public void setTID(int value) {
    thostmduserapiJNI.CThostFtdcNotifyFutureSignInField_TID_set(swigCPtr, this, value);
  }

  public int getTID() {
    return thostmduserapiJNI.CThostFtdcNotifyFutureSignInField_TID_get(swigCPtr, this);
  }

  public void setErrorID(int value) {
    thostmduserapiJNI.CThostFtdcNotifyFutureSignInField_ErrorID_set(swigCPtr, this, value);
  }

  public int getErrorID() {
    return thostmduserapiJNI.CThostFtdcNotifyFutureSignInField_ErrorID_get(swigCPtr, this);
  }

  public void setErrorMsg(String value) {
    thostmduserapiJNI.CThostFtdcNotifyFutureSignInField_ErrorMsg_set(swigCPtr, this, value);
  }

  public String getErrorMsg() {
    return thostmduserapiJNI.CThostFtdcNotifyFutureSignInField_ErrorMsg_get(swigCPtr, this);
  }

  public void setPinKey(String value) {
    thostmduserapiJNI.CThostFtdcNotifyFutureSignInField_PinKey_set(swigCPtr, this, value);
  }

  public String getPinKey() {
    return thostmduserapiJNI.CThostFtdcNotifyFutureSignInField_PinKey_get(swigCPtr, this);
  }

  public void setMacKey(String value) {
    thostmduserapiJNI.CThostFtdcNotifyFutureSignInField_MacKey_set(swigCPtr, this, value);
  }

  public String getMacKey() {
    return thostmduserapiJNI.CThostFtdcNotifyFutureSignInField_MacKey_get(swigCPtr, this);
  }

  public CThostFtdcNotifyFutureSignInField() {
    this(thostmduserapiJNI.new_CThostFtdcNotifyFutureSignInField(), true);
  }

}
