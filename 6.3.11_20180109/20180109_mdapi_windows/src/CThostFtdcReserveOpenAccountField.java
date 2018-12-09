/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package test.thostmduserapi;

public class CThostFtdcReserveOpenAccountField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected CThostFtdcReserveOpenAccountField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcReserveOpenAccountField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        thostmduserapiJNI.delete_CThostFtdcReserveOpenAccountField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setTradeCode(String value) {
    thostmduserapiJNI.CThostFtdcReserveOpenAccountField_TradeCode_set(swigCPtr, this, value);
  }

  public String getTradeCode() {
    return thostmduserapiJNI.CThostFtdcReserveOpenAccountField_TradeCode_get(swigCPtr, this);
  }

  public void setBankID(String value) {
    thostmduserapiJNI.CThostFtdcReserveOpenAccountField_BankID_set(swigCPtr, this, value);
  }

  public String getBankID() {
    return thostmduserapiJNI.CThostFtdcReserveOpenAccountField_BankID_get(swigCPtr, this);
  }

  public void setBankBranchID(String value) {
    thostmduserapiJNI.CThostFtdcReserveOpenAccountField_BankBranchID_set(swigCPtr, this, value);
  }

  public String getBankBranchID() {
    return thostmduserapiJNI.CThostFtdcReserveOpenAccountField_BankBranchID_get(swigCPtr, this);
  }

  public void setBrokerID(String value) {
    thostmduserapiJNI.CThostFtdcReserveOpenAccountField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return thostmduserapiJNI.CThostFtdcReserveOpenAccountField_BrokerID_get(swigCPtr, this);
  }

  public void setBrokerBranchID(String value) {
    thostmduserapiJNI.CThostFtdcReserveOpenAccountField_BrokerBranchID_set(swigCPtr, this, value);
  }

  public String getBrokerBranchID() {
    return thostmduserapiJNI.CThostFtdcReserveOpenAccountField_BrokerBranchID_get(swigCPtr, this);
  }

  public void setTradeDate(String value) {
    thostmduserapiJNI.CThostFtdcReserveOpenAccountField_TradeDate_set(swigCPtr, this, value);
  }

  public String getTradeDate() {
    return thostmduserapiJNI.CThostFtdcReserveOpenAccountField_TradeDate_get(swigCPtr, this);
  }

  public void setTradeTime(String value) {
    thostmduserapiJNI.CThostFtdcReserveOpenAccountField_TradeTime_set(swigCPtr, this, value);
  }

  public String getTradeTime() {
    return thostmduserapiJNI.CThostFtdcReserveOpenAccountField_TradeTime_get(swigCPtr, this);
  }

  public void setBankSerial(String value) {
    thostmduserapiJNI.CThostFtdcReserveOpenAccountField_BankSerial_set(swigCPtr, this, value);
  }

  public String getBankSerial() {
    return thostmduserapiJNI.CThostFtdcReserveOpenAccountField_BankSerial_get(swigCPtr, this);
  }

  public void setTradingDay(String value) {
    thostmduserapiJNI.CThostFtdcReserveOpenAccountField_TradingDay_set(swigCPtr, this, value);
  }

  public String getTradingDay() {
    return thostmduserapiJNI.CThostFtdcReserveOpenAccountField_TradingDay_get(swigCPtr, this);
  }

  public void setPlateSerial(int value) {
    thostmduserapiJNI.CThostFtdcReserveOpenAccountField_PlateSerial_set(swigCPtr, this, value);
  }

  public int getPlateSerial() {
    return thostmduserapiJNI.CThostFtdcReserveOpenAccountField_PlateSerial_get(swigCPtr, this);
  }

  public void setLastFragment(char value) {
    thostmduserapiJNI.CThostFtdcReserveOpenAccountField_LastFragment_set(swigCPtr, this, value);
  }

  public char getLastFragment() {
    return thostmduserapiJNI.CThostFtdcReserveOpenAccountField_LastFragment_get(swigCPtr, this);
  }

  public void setSessionID(int value) {
    thostmduserapiJNI.CThostFtdcReserveOpenAccountField_SessionID_set(swigCPtr, this, value);
  }

  public int getSessionID() {
    return thostmduserapiJNI.CThostFtdcReserveOpenAccountField_SessionID_get(swigCPtr, this);
  }

  public void setCustomerName(String value) {
    thostmduserapiJNI.CThostFtdcReserveOpenAccountField_CustomerName_set(swigCPtr, this, value);
  }

  public String getCustomerName() {
    return thostmduserapiJNI.CThostFtdcReserveOpenAccountField_CustomerName_get(swigCPtr, this);
  }

  public void setIdCardType(char value) {
    thostmduserapiJNI.CThostFtdcReserveOpenAccountField_IdCardType_set(swigCPtr, this, value);
  }

  public char getIdCardType() {
    return thostmduserapiJNI.CThostFtdcReserveOpenAccountField_IdCardType_get(swigCPtr, this);
  }

  public void setIdentifiedCardNo(String value) {
    thostmduserapiJNI.CThostFtdcReserveOpenAccountField_IdentifiedCardNo_set(swigCPtr, this, value);
  }

  public String getIdentifiedCardNo() {
    return thostmduserapiJNI.CThostFtdcReserveOpenAccountField_IdentifiedCardNo_get(swigCPtr, this);
  }

  public void setGender(char value) {
    thostmduserapiJNI.CThostFtdcReserveOpenAccountField_Gender_set(swigCPtr, this, value);
  }

  public char getGender() {
    return thostmduserapiJNI.CThostFtdcReserveOpenAccountField_Gender_get(swigCPtr, this);
  }

  public void setCountryCode(String value) {
    thostmduserapiJNI.CThostFtdcReserveOpenAccountField_CountryCode_set(swigCPtr, this, value);
  }

  public String getCountryCode() {
    return thostmduserapiJNI.CThostFtdcReserveOpenAccountField_CountryCode_get(swigCPtr, this);
  }

  public void setCustType(char value) {
    thostmduserapiJNI.CThostFtdcReserveOpenAccountField_CustType_set(swigCPtr, this, value);
  }

  public char getCustType() {
    return thostmduserapiJNI.CThostFtdcReserveOpenAccountField_CustType_get(swigCPtr, this);
  }

  public void setAddress(String value) {
    thostmduserapiJNI.CThostFtdcReserveOpenAccountField_Address_set(swigCPtr, this, value);
  }

  public String getAddress() {
    return thostmduserapiJNI.CThostFtdcReserveOpenAccountField_Address_get(swigCPtr, this);
  }

  public void setZipCode(String value) {
    thostmduserapiJNI.CThostFtdcReserveOpenAccountField_ZipCode_set(swigCPtr, this, value);
  }

  public String getZipCode() {
    return thostmduserapiJNI.CThostFtdcReserveOpenAccountField_ZipCode_get(swigCPtr, this);
  }

  public void setTelephone(String value) {
    thostmduserapiJNI.CThostFtdcReserveOpenAccountField_Telephone_set(swigCPtr, this, value);
  }

  public String getTelephone() {
    return thostmduserapiJNI.CThostFtdcReserveOpenAccountField_Telephone_get(swigCPtr, this);
  }

  public void setMobilePhone(String value) {
    thostmduserapiJNI.CThostFtdcReserveOpenAccountField_MobilePhone_set(swigCPtr, this, value);
  }

  public String getMobilePhone() {
    return thostmduserapiJNI.CThostFtdcReserveOpenAccountField_MobilePhone_get(swigCPtr, this);
  }

  public void setFax(String value) {
    thostmduserapiJNI.CThostFtdcReserveOpenAccountField_Fax_set(swigCPtr, this, value);
  }

  public String getFax() {
    return thostmduserapiJNI.CThostFtdcReserveOpenAccountField_Fax_get(swigCPtr, this);
  }

  public void setEMail(String value) {
    thostmduserapiJNI.CThostFtdcReserveOpenAccountField_EMail_set(swigCPtr, this, value);
  }

  public String getEMail() {
    return thostmduserapiJNI.CThostFtdcReserveOpenAccountField_EMail_get(swigCPtr, this);
  }

  public void setMoneyAccountStatus(char value) {
    thostmduserapiJNI.CThostFtdcReserveOpenAccountField_MoneyAccountStatus_set(swigCPtr, this, value);
  }

  public char getMoneyAccountStatus() {
    return thostmduserapiJNI.CThostFtdcReserveOpenAccountField_MoneyAccountStatus_get(swigCPtr, this);
  }

  public void setBankAccount(String value) {
    thostmduserapiJNI.CThostFtdcReserveOpenAccountField_BankAccount_set(swigCPtr, this, value);
  }

  public String getBankAccount() {
    return thostmduserapiJNI.CThostFtdcReserveOpenAccountField_BankAccount_get(swigCPtr, this);
  }

  public void setBankPassWord(String value) {
    thostmduserapiJNI.CThostFtdcReserveOpenAccountField_BankPassWord_set(swigCPtr, this, value);
  }

  public String getBankPassWord() {
    return thostmduserapiJNI.CThostFtdcReserveOpenAccountField_BankPassWord_get(swigCPtr, this);
  }

  public void setInstallID(int value) {
    thostmduserapiJNI.CThostFtdcReserveOpenAccountField_InstallID_set(swigCPtr, this, value);
  }

  public int getInstallID() {
    return thostmduserapiJNI.CThostFtdcReserveOpenAccountField_InstallID_get(swigCPtr, this);
  }

  public void setVerifyCertNoFlag(char value) {
    thostmduserapiJNI.CThostFtdcReserveOpenAccountField_VerifyCertNoFlag_set(swigCPtr, this, value);
  }

  public char getVerifyCertNoFlag() {
    return thostmduserapiJNI.CThostFtdcReserveOpenAccountField_VerifyCertNoFlag_get(swigCPtr, this);
  }

  public void setCurrencyID(String value) {
    thostmduserapiJNI.CThostFtdcReserveOpenAccountField_CurrencyID_set(swigCPtr, this, value);
  }

  public String getCurrencyID() {
    return thostmduserapiJNI.CThostFtdcReserveOpenAccountField_CurrencyID_get(swigCPtr, this);
  }

  public void setDigest(String value) {
    thostmduserapiJNI.CThostFtdcReserveOpenAccountField_Digest_set(swigCPtr, this, value);
  }

  public String getDigest() {
    return thostmduserapiJNI.CThostFtdcReserveOpenAccountField_Digest_get(swigCPtr, this);
  }

  public void setBankAccType(char value) {
    thostmduserapiJNI.CThostFtdcReserveOpenAccountField_BankAccType_set(swigCPtr, this, value);
  }

  public char getBankAccType() {
    return thostmduserapiJNI.CThostFtdcReserveOpenAccountField_BankAccType_get(swigCPtr, this);
  }

  public void setBrokerIDByBank(String value) {
    thostmduserapiJNI.CThostFtdcReserveOpenAccountField_BrokerIDByBank_set(swigCPtr, this, value);
  }

  public String getBrokerIDByBank() {
    return thostmduserapiJNI.CThostFtdcReserveOpenAccountField_BrokerIDByBank_get(swigCPtr, this);
  }

  public void setTID(int value) {
    thostmduserapiJNI.CThostFtdcReserveOpenAccountField_TID_set(swigCPtr, this, value);
  }

  public int getTID() {
    return thostmduserapiJNI.CThostFtdcReserveOpenAccountField_TID_get(swigCPtr, this);
  }

  public void setReserveOpenAccStas(char value) {
    thostmduserapiJNI.CThostFtdcReserveOpenAccountField_ReserveOpenAccStas_set(swigCPtr, this, value);
  }

  public char getReserveOpenAccStas() {
    return thostmduserapiJNI.CThostFtdcReserveOpenAccountField_ReserveOpenAccStas_get(swigCPtr, this);
  }

  public void setErrorID(int value) {
    thostmduserapiJNI.CThostFtdcReserveOpenAccountField_ErrorID_set(swigCPtr, this, value);
  }

  public int getErrorID() {
    return thostmduserapiJNI.CThostFtdcReserveOpenAccountField_ErrorID_get(swigCPtr, this);
  }

  public void setErrorMsg(String value) {
    thostmduserapiJNI.CThostFtdcReserveOpenAccountField_ErrorMsg_set(swigCPtr, this, value);
  }

  public String getErrorMsg() {
    return thostmduserapiJNI.CThostFtdcReserveOpenAccountField_ErrorMsg_get(swigCPtr, this);
  }

  public CThostFtdcReserveOpenAccountField() {
    this(thostmduserapiJNI.new_CThostFtdcReserveOpenAccountField(), true);
  }

}
