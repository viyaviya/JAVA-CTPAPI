/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package test.thostmduserapi;

public class CThostFtdcReqChangeAccountField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected CThostFtdcReqChangeAccountField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcReqChangeAccountField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        thostmduserapiJNI.delete_CThostFtdcReqChangeAccountField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setTradeCode(String value) {
    thostmduserapiJNI.CThostFtdcReqChangeAccountField_TradeCode_set(swigCPtr, this, value);
  }

  public String getTradeCode() {
    return thostmduserapiJNI.CThostFtdcReqChangeAccountField_TradeCode_get(swigCPtr, this);
  }

  public void setBankID(String value) {
    thostmduserapiJNI.CThostFtdcReqChangeAccountField_BankID_set(swigCPtr, this, value);
  }

  public String getBankID() {
    return thostmduserapiJNI.CThostFtdcReqChangeAccountField_BankID_get(swigCPtr, this);
  }

  public void setBankBranchID(String value) {
    thostmduserapiJNI.CThostFtdcReqChangeAccountField_BankBranchID_set(swigCPtr, this, value);
  }

  public String getBankBranchID() {
    return thostmduserapiJNI.CThostFtdcReqChangeAccountField_BankBranchID_get(swigCPtr, this);
  }

  public void setBrokerID(String value) {
    thostmduserapiJNI.CThostFtdcReqChangeAccountField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return thostmduserapiJNI.CThostFtdcReqChangeAccountField_BrokerID_get(swigCPtr, this);
  }

  public void setBrokerBranchID(String value) {
    thostmduserapiJNI.CThostFtdcReqChangeAccountField_BrokerBranchID_set(swigCPtr, this, value);
  }

  public String getBrokerBranchID() {
    return thostmduserapiJNI.CThostFtdcReqChangeAccountField_BrokerBranchID_get(swigCPtr, this);
  }

  public void setTradeDate(String value) {
    thostmduserapiJNI.CThostFtdcReqChangeAccountField_TradeDate_set(swigCPtr, this, value);
  }

  public String getTradeDate() {
    return thostmduserapiJNI.CThostFtdcReqChangeAccountField_TradeDate_get(swigCPtr, this);
  }

  public void setTradeTime(String value) {
    thostmduserapiJNI.CThostFtdcReqChangeAccountField_TradeTime_set(swigCPtr, this, value);
  }

  public String getTradeTime() {
    return thostmduserapiJNI.CThostFtdcReqChangeAccountField_TradeTime_get(swigCPtr, this);
  }

  public void setBankSerial(String value) {
    thostmduserapiJNI.CThostFtdcReqChangeAccountField_BankSerial_set(swigCPtr, this, value);
  }

  public String getBankSerial() {
    return thostmduserapiJNI.CThostFtdcReqChangeAccountField_BankSerial_get(swigCPtr, this);
  }

  public void setTradingDay(String value) {
    thostmduserapiJNI.CThostFtdcReqChangeAccountField_TradingDay_set(swigCPtr, this, value);
  }

  public String getTradingDay() {
    return thostmduserapiJNI.CThostFtdcReqChangeAccountField_TradingDay_get(swigCPtr, this);
  }

  public void setPlateSerial(int value) {
    thostmduserapiJNI.CThostFtdcReqChangeAccountField_PlateSerial_set(swigCPtr, this, value);
  }

  public int getPlateSerial() {
    return thostmduserapiJNI.CThostFtdcReqChangeAccountField_PlateSerial_get(swigCPtr, this);
  }

  public void setLastFragment(char value) {
    thostmduserapiJNI.CThostFtdcReqChangeAccountField_LastFragment_set(swigCPtr, this, value);
  }

  public char getLastFragment() {
    return thostmduserapiJNI.CThostFtdcReqChangeAccountField_LastFragment_get(swigCPtr, this);
  }

  public void setSessionID(int value) {
    thostmduserapiJNI.CThostFtdcReqChangeAccountField_SessionID_set(swigCPtr, this, value);
  }

  public int getSessionID() {
    return thostmduserapiJNI.CThostFtdcReqChangeAccountField_SessionID_get(swigCPtr, this);
  }

  public void setCustomerName(String value) {
    thostmduserapiJNI.CThostFtdcReqChangeAccountField_CustomerName_set(swigCPtr, this, value);
  }

  public String getCustomerName() {
    return thostmduserapiJNI.CThostFtdcReqChangeAccountField_CustomerName_get(swigCPtr, this);
  }

  public void setIdCardType(char value) {
    thostmduserapiJNI.CThostFtdcReqChangeAccountField_IdCardType_set(swigCPtr, this, value);
  }

  public char getIdCardType() {
    return thostmduserapiJNI.CThostFtdcReqChangeAccountField_IdCardType_get(swigCPtr, this);
  }

  public void setIdentifiedCardNo(String value) {
    thostmduserapiJNI.CThostFtdcReqChangeAccountField_IdentifiedCardNo_set(swigCPtr, this, value);
  }

  public String getIdentifiedCardNo() {
    return thostmduserapiJNI.CThostFtdcReqChangeAccountField_IdentifiedCardNo_get(swigCPtr, this);
  }

  public void setGender(char value) {
    thostmduserapiJNI.CThostFtdcReqChangeAccountField_Gender_set(swigCPtr, this, value);
  }

  public char getGender() {
    return thostmduserapiJNI.CThostFtdcReqChangeAccountField_Gender_get(swigCPtr, this);
  }

  public void setCountryCode(String value) {
    thostmduserapiJNI.CThostFtdcReqChangeAccountField_CountryCode_set(swigCPtr, this, value);
  }

  public String getCountryCode() {
    return thostmduserapiJNI.CThostFtdcReqChangeAccountField_CountryCode_get(swigCPtr, this);
  }

  public void setCustType(char value) {
    thostmduserapiJNI.CThostFtdcReqChangeAccountField_CustType_set(swigCPtr, this, value);
  }

  public char getCustType() {
    return thostmduserapiJNI.CThostFtdcReqChangeAccountField_CustType_get(swigCPtr, this);
  }

  public void setAddress(String value) {
    thostmduserapiJNI.CThostFtdcReqChangeAccountField_Address_set(swigCPtr, this, value);
  }

  public String getAddress() {
    return thostmduserapiJNI.CThostFtdcReqChangeAccountField_Address_get(swigCPtr, this);
  }

  public void setZipCode(String value) {
    thostmduserapiJNI.CThostFtdcReqChangeAccountField_ZipCode_set(swigCPtr, this, value);
  }

  public String getZipCode() {
    return thostmduserapiJNI.CThostFtdcReqChangeAccountField_ZipCode_get(swigCPtr, this);
  }

  public void setTelephone(String value) {
    thostmduserapiJNI.CThostFtdcReqChangeAccountField_Telephone_set(swigCPtr, this, value);
  }

  public String getTelephone() {
    return thostmduserapiJNI.CThostFtdcReqChangeAccountField_Telephone_get(swigCPtr, this);
  }

  public void setMobilePhone(String value) {
    thostmduserapiJNI.CThostFtdcReqChangeAccountField_MobilePhone_set(swigCPtr, this, value);
  }

  public String getMobilePhone() {
    return thostmduserapiJNI.CThostFtdcReqChangeAccountField_MobilePhone_get(swigCPtr, this);
  }

  public void setFax(String value) {
    thostmduserapiJNI.CThostFtdcReqChangeAccountField_Fax_set(swigCPtr, this, value);
  }

  public String getFax() {
    return thostmduserapiJNI.CThostFtdcReqChangeAccountField_Fax_get(swigCPtr, this);
  }

  public void setEMail(String value) {
    thostmduserapiJNI.CThostFtdcReqChangeAccountField_EMail_set(swigCPtr, this, value);
  }

  public String getEMail() {
    return thostmduserapiJNI.CThostFtdcReqChangeAccountField_EMail_get(swigCPtr, this);
  }

  public void setMoneyAccountStatus(char value) {
    thostmduserapiJNI.CThostFtdcReqChangeAccountField_MoneyAccountStatus_set(swigCPtr, this, value);
  }

  public char getMoneyAccountStatus() {
    return thostmduserapiJNI.CThostFtdcReqChangeAccountField_MoneyAccountStatus_get(swigCPtr, this);
  }

  public void setBankAccount(String value) {
    thostmduserapiJNI.CThostFtdcReqChangeAccountField_BankAccount_set(swigCPtr, this, value);
  }

  public String getBankAccount() {
    return thostmduserapiJNI.CThostFtdcReqChangeAccountField_BankAccount_get(swigCPtr, this);
  }

  public void setBankPassWord(String value) {
    thostmduserapiJNI.CThostFtdcReqChangeAccountField_BankPassWord_set(swigCPtr, this, value);
  }

  public String getBankPassWord() {
    return thostmduserapiJNI.CThostFtdcReqChangeAccountField_BankPassWord_get(swigCPtr, this);
  }

  public void setNewBankAccount(String value) {
    thostmduserapiJNI.CThostFtdcReqChangeAccountField_NewBankAccount_set(swigCPtr, this, value);
  }

  public String getNewBankAccount() {
    return thostmduserapiJNI.CThostFtdcReqChangeAccountField_NewBankAccount_get(swigCPtr, this);
  }

  public void setNewBankPassWord(String value) {
    thostmduserapiJNI.CThostFtdcReqChangeAccountField_NewBankPassWord_set(swigCPtr, this, value);
  }

  public String getNewBankPassWord() {
    return thostmduserapiJNI.CThostFtdcReqChangeAccountField_NewBankPassWord_get(swigCPtr, this);
  }

  public void setAccountID(String value) {
    thostmduserapiJNI.CThostFtdcReqChangeAccountField_AccountID_set(swigCPtr, this, value);
  }

  public String getAccountID() {
    return thostmduserapiJNI.CThostFtdcReqChangeAccountField_AccountID_get(swigCPtr, this);
  }

  public void setPassword(String value) {
    thostmduserapiJNI.CThostFtdcReqChangeAccountField_Password_set(swigCPtr, this, value);
  }

  public String getPassword() {
    return thostmduserapiJNI.CThostFtdcReqChangeAccountField_Password_get(swigCPtr, this);
  }

  public void setBankAccType(char value) {
    thostmduserapiJNI.CThostFtdcReqChangeAccountField_BankAccType_set(swigCPtr, this, value);
  }

  public char getBankAccType() {
    return thostmduserapiJNI.CThostFtdcReqChangeAccountField_BankAccType_get(swigCPtr, this);
  }

  public void setInstallID(int value) {
    thostmduserapiJNI.CThostFtdcReqChangeAccountField_InstallID_set(swigCPtr, this, value);
  }

  public int getInstallID() {
    return thostmduserapiJNI.CThostFtdcReqChangeAccountField_InstallID_get(swigCPtr, this);
  }

  public void setVerifyCertNoFlag(char value) {
    thostmduserapiJNI.CThostFtdcReqChangeAccountField_VerifyCertNoFlag_set(swigCPtr, this, value);
  }

  public char getVerifyCertNoFlag() {
    return thostmduserapiJNI.CThostFtdcReqChangeAccountField_VerifyCertNoFlag_get(swigCPtr, this);
  }

  public void setCurrencyID(String value) {
    thostmduserapiJNI.CThostFtdcReqChangeAccountField_CurrencyID_set(swigCPtr, this, value);
  }

  public String getCurrencyID() {
    return thostmduserapiJNI.CThostFtdcReqChangeAccountField_CurrencyID_get(swigCPtr, this);
  }

  public void setBrokerIDByBank(String value) {
    thostmduserapiJNI.CThostFtdcReqChangeAccountField_BrokerIDByBank_set(swigCPtr, this, value);
  }

  public String getBrokerIDByBank() {
    return thostmduserapiJNI.CThostFtdcReqChangeAccountField_BrokerIDByBank_get(swigCPtr, this);
  }

  public void setBankPwdFlag(char value) {
    thostmduserapiJNI.CThostFtdcReqChangeAccountField_BankPwdFlag_set(swigCPtr, this, value);
  }

  public char getBankPwdFlag() {
    return thostmduserapiJNI.CThostFtdcReqChangeAccountField_BankPwdFlag_get(swigCPtr, this);
  }

  public void setSecuPwdFlag(char value) {
    thostmduserapiJNI.CThostFtdcReqChangeAccountField_SecuPwdFlag_set(swigCPtr, this, value);
  }

  public char getSecuPwdFlag() {
    return thostmduserapiJNI.CThostFtdcReqChangeAccountField_SecuPwdFlag_get(swigCPtr, this);
  }

  public void setTID(int value) {
    thostmduserapiJNI.CThostFtdcReqChangeAccountField_TID_set(swigCPtr, this, value);
  }

  public int getTID() {
    return thostmduserapiJNI.CThostFtdcReqChangeAccountField_TID_get(swigCPtr, this);
  }

  public void setDigest(String value) {
    thostmduserapiJNI.CThostFtdcReqChangeAccountField_Digest_set(swigCPtr, this, value);
  }

  public String getDigest() {
    return thostmduserapiJNI.CThostFtdcReqChangeAccountField_Digest_get(swigCPtr, this);
  }

  public void setLongCustomerName(String value) {
    thostmduserapiJNI.CThostFtdcReqChangeAccountField_LongCustomerName_set(swigCPtr, this, value);
  }

  public String getLongCustomerName() {
    return thostmduserapiJNI.CThostFtdcReqChangeAccountField_LongCustomerName_get(swigCPtr, this);
  }

  public CThostFtdcReqChangeAccountField() {
    this(thostmduserapiJNI.new_CThostFtdcReqChangeAccountField(), true);
  }

}
