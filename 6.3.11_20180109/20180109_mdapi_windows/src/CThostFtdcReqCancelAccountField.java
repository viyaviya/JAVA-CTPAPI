/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package test.thostmduserapi;

public class CThostFtdcReqCancelAccountField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected CThostFtdcReqCancelAccountField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcReqCancelAccountField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        thostmduserapiJNI.delete_CThostFtdcReqCancelAccountField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setTradeCode(String value) {
    thostmduserapiJNI.CThostFtdcReqCancelAccountField_TradeCode_set(swigCPtr, this, value);
  }

  public String getTradeCode() {
    return thostmduserapiJNI.CThostFtdcReqCancelAccountField_TradeCode_get(swigCPtr, this);
  }

  public void setBankID(String value) {
    thostmduserapiJNI.CThostFtdcReqCancelAccountField_BankID_set(swigCPtr, this, value);
  }

  public String getBankID() {
    return thostmduserapiJNI.CThostFtdcReqCancelAccountField_BankID_get(swigCPtr, this);
  }

  public void setBankBranchID(String value) {
    thostmduserapiJNI.CThostFtdcReqCancelAccountField_BankBranchID_set(swigCPtr, this, value);
  }

  public String getBankBranchID() {
    return thostmduserapiJNI.CThostFtdcReqCancelAccountField_BankBranchID_get(swigCPtr, this);
  }

  public void setBrokerID(String value) {
    thostmduserapiJNI.CThostFtdcReqCancelAccountField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return thostmduserapiJNI.CThostFtdcReqCancelAccountField_BrokerID_get(swigCPtr, this);
  }

  public void setBrokerBranchID(String value) {
    thostmduserapiJNI.CThostFtdcReqCancelAccountField_BrokerBranchID_set(swigCPtr, this, value);
  }

  public String getBrokerBranchID() {
    return thostmduserapiJNI.CThostFtdcReqCancelAccountField_BrokerBranchID_get(swigCPtr, this);
  }

  public void setTradeDate(String value) {
    thostmduserapiJNI.CThostFtdcReqCancelAccountField_TradeDate_set(swigCPtr, this, value);
  }

  public String getTradeDate() {
    return thostmduserapiJNI.CThostFtdcReqCancelAccountField_TradeDate_get(swigCPtr, this);
  }

  public void setTradeTime(String value) {
    thostmduserapiJNI.CThostFtdcReqCancelAccountField_TradeTime_set(swigCPtr, this, value);
  }

  public String getTradeTime() {
    return thostmduserapiJNI.CThostFtdcReqCancelAccountField_TradeTime_get(swigCPtr, this);
  }

  public void setBankSerial(String value) {
    thostmduserapiJNI.CThostFtdcReqCancelAccountField_BankSerial_set(swigCPtr, this, value);
  }

  public String getBankSerial() {
    return thostmduserapiJNI.CThostFtdcReqCancelAccountField_BankSerial_get(swigCPtr, this);
  }

  public void setTradingDay(String value) {
    thostmduserapiJNI.CThostFtdcReqCancelAccountField_TradingDay_set(swigCPtr, this, value);
  }

  public String getTradingDay() {
    return thostmduserapiJNI.CThostFtdcReqCancelAccountField_TradingDay_get(swigCPtr, this);
  }

  public void setPlateSerial(int value) {
    thostmduserapiJNI.CThostFtdcReqCancelAccountField_PlateSerial_set(swigCPtr, this, value);
  }

  public int getPlateSerial() {
    return thostmduserapiJNI.CThostFtdcReqCancelAccountField_PlateSerial_get(swigCPtr, this);
  }

  public void setLastFragment(char value) {
    thostmduserapiJNI.CThostFtdcReqCancelAccountField_LastFragment_set(swigCPtr, this, value);
  }

  public char getLastFragment() {
    return thostmduserapiJNI.CThostFtdcReqCancelAccountField_LastFragment_get(swigCPtr, this);
  }

  public void setSessionID(int value) {
    thostmduserapiJNI.CThostFtdcReqCancelAccountField_SessionID_set(swigCPtr, this, value);
  }

  public int getSessionID() {
    return thostmduserapiJNI.CThostFtdcReqCancelAccountField_SessionID_get(swigCPtr, this);
  }

  public void setCustomerName(String value) {
    thostmduserapiJNI.CThostFtdcReqCancelAccountField_CustomerName_set(swigCPtr, this, value);
  }

  public String getCustomerName() {
    return thostmduserapiJNI.CThostFtdcReqCancelAccountField_CustomerName_get(swigCPtr, this);
  }

  public void setIdCardType(char value) {
    thostmduserapiJNI.CThostFtdcReqCancelAccountField_IdCardType_set(swigCPtr, this, value);
  }

  public char getIdCardType() {
    return thostmduserapiJNI.CThostFtdcReqCancelAccountField_IdCardType_get(swigCPtr, this);
  }

  public void setIdentifiedCardNo(String value) {
    thostmduserapiJNI.CThostFtdcReqCancelAccountField_IdentifiedCardNo_set(swigCPtr, this, value);
  }

  public String getIdentifiedCardNo() {
    return thostmduserapiJNI.CThostFtdcReqCancelAccountField_IdentifiedCardNo_get(swigCPtr, this);
  }

  public void setGender(char value) {
    thostmduserapiJNI.CThostFtdcReqCancelAccountField_Gender_set(swigCPtr, this, value);
  }

  public char getGender() {
    return thostmduserapiJNI.CThostFtdcReqCancelAccountField_Gender_get(swigCPtr, this);
  }

  public void setCountryCode(String value) {
    thostmduserapiJNI.CThostFtdcReqCancelAccountField_CountryCode_set(swigCPtr, this, value);
  }

  public String getCountryCode() {
    return thostmduserapiJNI.CThostFtdcReqCancelAccountField_CountryCode_get(swigCPtr, this);
  }

  public void setCustType(char value) {
    thostmduserapiJNI.CThostFtdcReqCancelAccountField_CustType_set(swigCPtr, this, value);
  }

  public char getCustType() {
    return thostmduserapiJNI.CThostFtdcReqCancelAccountField_CustType_get(swigCPtr, this);
  }

  public void setAddress(String value) {
    thostmduserapiJNI.CThostFtdcReqCancelAccountField_Address_set(swigCPtr, this, value);
  }

  public String getAddress() {
    return thostmduserapiJNI.CThostFtdcReqCancelAccountField_Address_get(swigCPtr, this);
  }

  public void setZipCode(String value) {
    thostmduserapiJNI.CThostFtdcReqCancelAccountField_ZipCode_set(swigCPtr, this, value);
  }

  public String getZipCode() {
    return thostmduserapiJNI.CThostFtdcReqCancelAccountField_ZipCode_get(swigCPtr, this);
  }

  public void setTelephone(String value) {
    thostmduserapiJNI.CThostFtdcReqCancelAccountField_Telephone_set(swigCPtr, this, value);
  }

  public String getTelephone() {
    return thostmduserapiJNI.CThostFtdcReqCancelAccountField_Telephone_get(swigCPtr, this);
  }

  public void setMobilePhone(String value) {
    thostmduserapiJNI.CThostFtdcReqCancelAccountField_MobilePhone_set(swigCPtr, this, value);
  }

  public String getMobilePhone() {
    return thostmduserapiJNI.CThostFtdcReqCancelAccountField_MobilePhone_get(swigCPtr, this);
  }

  public void setFax(String value) {
    thostmduserapiJNI.CThostFtdcReqCancelAccountField_Fax_set(swigCPtr, this, value);
  }

  public String getFax() {
    return thostmduserapiJNI.CThostFtdcReqCancelAccountField_Fax_get(swigCPtr, this);
  }

  public void setEMail(String value) {
    thostmduserapiJNI.CThostFtdcReqCancelAccountField_EMail_set(swigCPtr, this, value);
  }

  public String getEMail() {
    return thostmduserapiJNI.CThostFtdcReqCancelAccountField_EMail_get(swigCPtr, this);
  }

  public void setMoneyAccountStatus(char value) {
    thostmduserapiJNI.CThostFtdcReqCancelAccountField_MoneyAccountStatus_set(swigCPtr, this, value);
  }

  public char getMoneyAccountStatus() {
    return thostmduserapiJNI.CThostFtdcReqCancelAccountField_MoneyAccountStatus_get(swigCPtr, this);
  }

  public void setBankAccount(String value) {
    thostmduserapiJNI.CThostFtdcReqCancelAccountField_BankAccount_set(swigCPtr, this, value);
  }

  public String getBankAccount() {
    return thostmduserapiJNI.CThostFtdcReqCancelAccountField_BankAccount_get(swigCPtr, this);
  }

  public void setBankPassWord(String value) {
    thostmduserapiJNI.CThostFtdcReqCancelAccountField_BankPassWord_set(swigCPtr, this, value);
  }

  public String getBankPassWord() {
    return thostmduserapiJNI.CThostFtdcReqCancelAccountField_BankPassWord_get(swigCPtr, this);
  }

  public void setAccountID(String value) {
    thostmduserapiJNI.CThostFtdcReqCancelAccountField_AccountID_set(swigCPtr, this, value);
  }

  public String getAccountID() {
    return thostmduserapiJNI.CThostFtdcReqCancelAccountField_AccountID_get(swigCPtr, this);
  }

  public void setPassword(String value) {
    thostmduserapiJNI.CThostFtdcReqCancelAccountField_Password_set(swigCPtr, this, value);
  }

  public String getPassword() {
    return thostmduserapiJNI.CThostFtdcReqCancelAccountField_Password_get(swigCPtr, this);
  }

  public void setInstallID(int value) {
    thostmduserapiJNI.CThostFtdcReqCancelAccountField_InstallID_set(swigCPtr, this, value);
  }

  public int getInstallID() {
    return thostmduserapiJNI.CThostFtdcReqCancelAccountField_InstallID_get(swigCPtr, this);
  }

  public void setVerifyCertNoFlag(char value) {
    thostmduserapiJNI.CThostFtdcReqCancelAccountField_VerifyCertNoFlag_set(swigCPtr, this, value);
  }

  public char getVerifyCertNoFlag() {
    return thostmduserapiJNI.CThostFtdcReqCancelAccountField_VerifyCertNoFlag_get(swigCPtr, this);
  }

  public void setCurrencyID(String value) {
    thostmduserapiJNI.CThostFtdcReqCancelAccountField_CurrencyID_set(swigCPtr, this, value);
  }

  public String getCurrencyID() {
    return thostmduserapiJNI.CThostFtdcReqCancelAccountField_CurrencyID_get(swigCPtr, this);
  }

  public void setCashExchangeCode(char value) {
    thostmduserapiJNI.CThostFtdcReqCancelAccountField_CashExchangeCode_set(swigCPtr, this, value);
  }

  public char getCashExchangeCode() {
    return thostmduserapiJNI.CThostFtdcReqCancelAccountField_CashExchangeCode_get(swigCPtr, this);
  }

  public void setDigest(String value) {
    thostmduserapiJNI.CThostFtdcReqCancelAccountField_Digest_set(swigCPtr, this, value);
  }

  public String getDigest() {
    return thostmduserapiJNI.CThostFtdcReqCancelAccountField_Digest_get(swigCPtr, this);
  }

  public void setBankAccType(char value) {
    thostmduserapiJNI.CThostFtdcReqCancelAccountField_BankAccType_set(swigCPtr, this, value);
  }

  public char getBankAccType() {
    return thostmduserapiJNI.CThostFtdcReqCancelAccountField_BankAccType_get(swigCPtr, this);
  }

  public void setDeviceID(String value) {
    thostmduserapiJNI.CThostFtdcReqCancelAccountField_DeviceID_set(swigCPtr, this, value);
  }

  public String getDeviceID() {
    return thostmduserapiJNI.CThostFtdcReqCancelAccountField_DeviceID_get(swigCPtr, this);
  }

  public void setBankSecuAccType(char value) {
    thostmduserapiJNI.CThostFtdcReqCancelAccountField_BankSecuAccType_set(swigCPtr, this, value);
  }

  public char getBankSecuAccType() {
    return thostmduserapiJNI.CThostFtdcReqCancelAccountField_BankSecuAccType_get(swigCPtr, this);
  }

  public void setBrokerIDByBank(String value) {
    thostmduserapiJNI.CThostFtdcReqCancelAccountField_BrokerIDByBank_set(swigCPtr, this, value);
  }

  public String getBrokerIDByBank() {
    return thostmduserapiJNI.CThostFtdcReqCancelAccountField_BrokerIDByBank_get(swigCPtr, this);
  }

  public void setBankSecuAcc(String value) {
    thostmduserapiJNI.CThostFtdcReqCancelAccountField_BankSecuAcc_set(swigCPtr, this, value);
  }

  public String getBankSecuAcc() {
    return thostmduserapiJNI.CThostFtdcReqCancelAccountField_BankSecuAcc_get(swigCPtr, this);
  }

  public void setBankPwdFlag(char value) {
    thostmduserapiJNI.CThostFtdcReqCancelAccountField_BankPwdFlag_set(swigCPtr, this, value);
  }

  public char getBankPwdFlag() {
    return thostmduserapiJNI.CThostFtdcReqCancelAccountField_BankPwdFlag_get(swigCPtr, this);
  }

  public void setSecuPwdFlag(char value) {
    thostmduserapiJNI.CThostFtdcReqCancelAccountField_SecuPwdFlag_set(swigCPtr, this, value);
  }

  public char getSecuPwdFlag() {
    return thostmduserapiJNI.CThostFtdcReqCancelAccountField_SecuPwdFlag_get(swigCPtr, this);
  }

  public void setOperNo(String value) {
    thostmduserapiJNI.CThostFtdcReqCancelAccountField_OperNo_set(swigCPtr, this, value);
  }

  public String getOperNo() {
    return thostmduserapiJNI.CThostFtdcReqCancelAccountField_OperNo_get(swigCPtr, this);
  }

  public void setTID(int value) {
    thostmduserapiJNI.CThostFtdcReqCancelAccountField_TID_set(swigCPtr, this, value);
  }

  public int getTID() {
    return thostmduserapiJNI.CThostFtdcReqCancelAccountField_TID_get(swigCPtr, this);
  }

  public void setUserID(String value) {
    thostmduserapiJNI.CThostFtdcReqCancelAccountField_UserID_set(swigCPtr, this, value);
  }

  public String getUserID() {
    return thostmduserapiJNI.CThostFtdcReqCancelAccountField_UserID_get(swigCPtr, this);
  }

  public void setLongCustomerName(String value) {
    thostmduserapiJNI.CThostFtdcReqCancelAccountField_LongCustomerName_set(swigCPtr, this, value);
  }

  public String getLongCustomerName() {
    return thostmduserapiJNI.CThostFtdcReqCancelAccountField_LongCustomerName_get(swigCPtr, this);
  }

  public CThostFtdcReqCancelAccountField() {
    this(thostmduserapiJNI.new_CThostFtdcReqCancelAccountField(), true);
  }

}
