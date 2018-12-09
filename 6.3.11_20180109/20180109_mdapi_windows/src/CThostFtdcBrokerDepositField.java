/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package test.thostmduserapi;

public class CThostFtdcBrokerDepositField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected CThostFtdcBrokerDepositField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcBrokerDepositField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        thostmduserapiJNI.delete_CThostFtdcBrokerDepositField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setTradingDay(String value) {
    thostmduserapiJNI.CThostFtdcBrokerDepositField_TradingDay_set(swigCPtr, this, value);
  }

  public String getTradingDay() {
    return thostmduserapiJNI.CThostFtdcBrokerDepositField_TradingDay_get(swigCPtr, this);
  }

  public void setBrokerID(String value) {
    thostmduserapiJNI.CThostFtdcBrokerDepositField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return thostmduserapiJNI.CThostFtdcBrokerDepositField_BrokerID_get(swigCPtr, this);
  }

  public void setParticipantID(String value) {
    thostmduserapiJNI.CThostFtdcBrokerDepositField_ParticipantID_set(swigCPtr, this, value);
  }

  public String getParticipantID() {
    return thostmduserapiJNI.CThostFtdcBrokerDepositField_ParticipantID_get(swigCPtr, this);
  }

  public void setExchangeID(String value) {
    thostmduserapiJNI.CThostFtdcBrokerDepositField_ExchangeID_set(swigCPtr, this, value);
  }

  public String getExchangeID() {
    return thostmduserapiJNI.CThostFtdcBrokerDepositField_ExchangeID_get(swigCPtr, this);
  }

  public void setPreBalance(double value) {
    thostmduserapiJNI.CThostFtdcBrokerDepositField_PreBalance_set(swigCPtr, this, value);
  }

  public double getPreBalance() {
    return thostmduserapiJNI.CThostFtdcBrokerDepositField_PreBalance_get(swigCPtr, this);
  }

  public void setCurrMargin(double value) {
    thostmduserapiJNI.CThostFtdcBrokerDepositField_CurrMargin_set(swigCPtr, this, value);
  }

  public double getCurrMargin() {
    return thostmduserapiJNI.CThostFtdcBrokerDepositField_CurrMargin_get(swigCPtr, this);
  }

  public void setCloseProfit(double value) {
    thostmduserapiJNI.CThostFtdcBrokerDepositField_CloseProfit_set(swigCPtr, this, value);
  }

  public double getCloseProfit() {
    return thostmduserapiJNI.CThostFtdcBrokerDepositField_CloseProfit_get(swigCPtr, this);
  }

  public void setBalance(double value) {
    thostmduserapiJNI.CThostFtdcBrokerDepositField_Balance_set(swigCPtr, this, value);
  }

  public double getBalance() {
    return thostmduserapiJNI.CThostFtdcBrokerDepositField_Balance_get(swigCPtr, this);
  }

  public void setDeposit(double value) {
    thostmduserapiJNI.CThostFtdcBrokerDepositField_Deposit_set(swigCPtr, this, value);
  }

  public double getDeposit() {
    return thostmduserapiJNI.CThostFtdcBrokerDepositField_Deposit_get(swigCPtr, this);
  }

  public void setWithdraw(double value) {
    thostmduserapiJNI.CThostFtdcBrokerDepositField_Withdraw_set(swigCPtr, this, value);
  }

  public double getWithdraw() {
    return thostmduserapiJNI.CThostFtdcBrokerDepositField_Withdraw_get(swigCPtr, this);
  }

  public void setAvailable(double value) {
    thostmduserapiJNI.CThostFtdcBrokerDepositField_Available_set(swigCPtr, this, value);
  }

  public double getAvailable() {
    return thostmduserapiJNI.CThostFtdcBrokerDepositField_Available_get(swigCPtr, this);
  }

  public void setReserve(double value) {
    thostmduserapiJNI.CThostFtdcBrokerDepositField_Reserve_set(swigCPtr, this, value);
  }

  public double getReserve() {
    return thostmduserapiJNI.CThostFtdcBrokerDepositField_Reserve_get(swigCPtr, this);
  }

  public void setFrozenMargin(double value) {
    thostmduserapiJNI.CThostFtdcBrokerDepositField_FrozenMargin_set(swigCPtr, this, value);
  }

  public double getFrozenMargin() {
    return thostmduserapiJNI.CThostFtdcBrokerDepositField_FrozenMargin_get(swigCPtr, this);
  }

  public CThostFtdcBrokerDepositField() {
    this(thostmduserapiJNI.new_CThostFtdcBrokerDepositField(), true);
  }

}
