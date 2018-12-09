/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package test.thostmduserapi;

public class CThostFtdcSyncingTradingAccountField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected CThostFtdcSyncingTradingAccountField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcSyncingTradingAccountField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        thostmduserapiJNI.delete_CThostFtdcSyncingTradingAccountField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    thostmduserapiJNI.CThostFtdcSyncingTradingAccountField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return thostmduserapiJNI.CThostFtdcSyncingTradingAccountField_BrokerID_get(swigCPtr, this);
  }

  public void setAccountID(String value) {
    thostmduserapiJNI.CThostFtdcSyncingTradingAccountField_AccountID_set(swigCPtr, this, value);
  }

  public String getAccountID() {
    return thostmduserapiJNI.CThostFtdcSyncingTradingAccountField_AccountID_get(swigCPtr, this);
  }

  public void setPreMortgage(double value) {
    thostmduserapiJNI.CThostFtdcSyncingTradingAccountField_PreMortgage_set(swigCPtr, this, value);
  }

  public double getPreMortgage() {
    return thostmduserapiJNI.CThostFtdcSyncingTradingAccountField_PreMortgage_get(swigCPtr, this);
  }

  public void setPreCredit(double value) {
    thostmduserapiJNI.CThostFtdcSyncingTradingAccountField_PreCredit_set(swigCPtr, this, value);
  }

  public double getPreCredit() {
    return thostmduserapiJNI.CThostFtdcSyncingTradingAccountField_PreCredit_get(swigCPtr, this);
  }

  public void setPreDeposit(double value) {
    thostmduserapiJNI.CThostFtdcSyncingTradingAccountField_PreDeposit_set(swigCPtr, this, value);
  }

  public double getPreDeposit() {
    return thostmduserapiJNI.CThostFtdcSyncingTradingAccountField_PreDeposit_get(swigCPtr, this);
  }

  public void setPreBalance(double value) {
    thostmduserapiJNI.CThostFtdcSyncingTradingAccountField_PreBalance_set(swigCPtr, this, value);
  }

  public double getPreBalance() {
    return thostmduserapiJNI.CThostFtdcSyncingTradingAccountField_PreBalance_get(swigCPtr, this);
  }

  public void setPreMargin(double value) {
    thostmduserapiJNI.CThostFtdcSyncingTradingAccountField_PreMargin_set(swigCPtr, this, value);
  }

  public double getPreMargin() {
    return thostmduserapiJNI.CThostFtdcSyncingTradingAccountField_PreMargin_get(swigCPtr, this);
  }

  public void setInterestBase(double value) {
    thostmduserapiJNI.CThostFtdcSyncingTradingAccountField_InterestBase_set(swigCPtr, this, value);
  }

  public double getInterestBase() {
    return thostmduserapiJNI.CThostFtdcSyncingTradingAccountField_InterestBase_get(swigCPtr, this);
  }

  public void setInterest(double value) {
    thostmduserapiJNI.CThostFtdcSyncingTradingAccountField_Interest_set(swigCPtr, this, value);
  }

  public double getInterest() {
    return thostmduserapiJNI.CThostFtdcSyncingTradingAccountField_Interest_get(swigCPtr, this);
  }

  public void setDeposit(double value) {
    thostmduserapiJNI.CThostFtdcSyncingTradingAccountField_Deposit_set(swigCPtr, this, value);
  }

  public double getDeposit() {
    return thostmduserapiJNI.CThostFtdcSyncingTradingAccountField_Deposit_get(swigCPtr, this);
  }

  public void setWithdraw(double value) {
    thostmduserapiJNI.CThostFtdcSyncingTradingAccountField_Withdraw_set(swigCPtr, this, value);
  }

  public double getWithdraw() {
    return thostmduserapiJNI.CThostFtdcSyncingTradingAccountField_Withdraw_get(swigCPtr, this);
  }

  public void setFrozenMargin(double value) {
    thostmduserapiJNI.CThostFtdcSyncingTradingAccountField_FrozenMargin_set(swigCPtr, this, value);
  }

  public double getFrozenMargin() {
    return thostmduserapiJNI.CThostFtdcSyncingTradingAccountField_FrozenMargin_get(swigCPtr, this);
  }

  public void setFrozenCash(double value) {
    thostmduserapiJNI.CThostFtdcSyncingTradingAccountField_FrozenCash_set(swigCPtr, this, value);
  }

  public double getFrozenCash() {
    return thostmduserapiJNI.CThostFtdcSyncingTradingAccountField_FrozenCash_get(swigCPtr, this);
  }

  public void setFrozenCommission(double value) {
    thostmduserapiJNI.CThostFtdcSyncingTradingAccountField_FrozenCommission_set(swigCPtr, this, value);
  }

  public double getFrozenCommission() {
    return thostmduserapiJNI.CThostFtdcSyncingTradingAccountField_FrozenCommission_get(swigCPtr, this);
  }

  public void setCurrMargin(double value) {
    thostmduserapiJNI.CThostFtdcSyncingTradingAccountField_CurrMargin_set(swigCPtr, this, value);
  }

  public double getCurrMargin() {
    return thostmduserapiJNI.CThostFtdcSyncingTradingAccountField_CurrMargin_get(swigCPtr, this);
  }

  public void setCashIn(double value) {
    thostmduserapiJNI.CThostFtdcSyncingTradingAccountField_CashIn_set(swigCPtr, this, value);
  }

  public double getCashIn() {
    return thostmduserapiJNI.CThostFtdcSyncingTradingAccountField_CashIn_get(swigCPtr, this);
  }

  public void setCommission(double value) {
    thostmduserapiJNI.CThostFtdcSyncingTradingAccountField_Commission_set(swigCPtr, this, value);
  }

  public double getCommission() {
    return thostmduserapiJNI.CThostFtdcSyncingTradingAccountField_Commission_get(swigCPtr, this);
  }

  public void setCloseProfit(double value) {
    thostmduserapiJNI.CThostFtdcSyncingTradingAccountField_CloseProfit_set(swigCPtr, this, value);
  }

  public double getCloseProfit() {
    return thostmduserapiJNI.CThostFtdcSyncingTradingAccountField_CloseProfit_get(swigCPtr, this);
  }

  public void setPositionProfit(double value) {
    thostmduserapiJNI.CThostFtdcSyncingTradingAccountField_PositionProfit_set(swigCPtr, this, value);
  }

  public double getPositionProfit() {
    return thostmduserapiJNI.CThostFtdcSyncingTradingAccountField_PositionProfit_get(swigCPtr, this);
  }

  public void setBalance(double value) {
    thostmduserapiJNI.CThostFtdcSyncingTradingAccountField_Balance_set(swigCPtr, this, value);
  }

  public double getBalance() {
    return thostmduserapiJNI.CThostFtdcSyncingTradingAccountField_Balance_get(swigCPtr, this);
  }

  public void setAvailable(double value) {
    thostmduserapiJNI.CThostFtdcSyncingTradingAccountField_Available_set(swigCPtr, this, value);
  }

  public double getAvailable() {
    return thostmduserapiJNI.CThostFtdcSyncingTradingAccountField_Available_get(swigCPtr, this);
  }

  public void setWithdrawQuota(double value) {
    thostmduserapiJNI.CThostFtdcSyncingTradingAccountField_WithdrawQuota_set(swigCPtr, this, value);
  }

  public double getWithdrawQuota() {
    return thostmduserapiJNI.CThostFtdcSyncingTradingAccountField_WithdrawQuota_get(swigCPtr, this);
  }

  public void setReserve(double value) {
    thostmduserapiJNI.CThostFtdcSyncingTradingAccountField_Reserve_set(swigCPtr, this, value);
  }

  public double getReserve() {
    return thostmduserapiJNI.CThostFtdcSyncingTradingAccountField_Reserve_get(swigCPtr, this);
  }

  public void setTradingDay(String value) {
    thostmduserapiJNI.CThostFtdcSyncingTradingAccountField_TradingDay_set(swigCPtr, this, value);
  }

  public String getTradingDay() {
    return thostmduserapiJNI.CThostFtdcSyncingTradingAccountField_TradingDay_get(swigCPtr, this);
  }

  public void setSettlementID(int value) {
    thostmduserapiJNI.CThostFtdcSyncingTradingAccountField_SettlementID_set(swigCPtr, this, value);
  }

  public int getSettlementID() {
    return thostmduserapiJNI.CThostFtdcSyncingTradingAccountField_SettlementID_get(swigCPtr, this);
  }

  public void setCredit(double value) {
    thostmduserapiJNI.CThostFtdcSyncingTradingAccountField_Credit_set(swigCPtr, this, value);
  }

  public double getCredit() {
    return thostmduserapiJNI.CThostFtdcSyncingTradingAccountField_Credit_get(swigCPtr, this);
  }

  public void setMortgage(double value) {
    thostmduserapiJNI.CThostFtdcSyncingTradingAccountField_Mortgage_set(swigCPtr, this, value);
  }

  public double getMortgage() {
    return thostmduserapiJNI.CThostFtdcSyncingTradingAccountField_Mortgage_get(swigCPtr, this);
  }

  public void setExchangeMargin(double value) {
    thostmduserapiJNI.CThostFtdcSyncingTradingAccountField_ExchangeMargin_set(swigCPtr, this, value);
  }

  public double getExchangeMargin() {
    return thostmduserapiJNI.CThostFtdcSyncingTradingAccountField_ExchangeMargin_get(swigCPtr, this);
  }

  public void setDeliveryMargin(double value) {
    thostmduserapiJNI.CThostFtdcSyncingTradingAccountField_DeliveryMargin_set(swigCPtr, this, value);
  }

  public double getDeliveryMargin() {
    return thostmduserapiJNI.CThostFtdcSyncingTradingAccountField_DeliveryMargin_get(swigCPtr, this);
  }

  public void setExchangeDeliveryMargin(double value) {
    thostmduserapiJNI.CThostFtdcSyncingTradingAccountField_ExchangeDeliveryMargin_set(swigCPtr, this, value);
  }

  public double getExchangeDeliveryMargin() {
    return thostmduserapiJNI.CThostFtdcSyncingTradingAccountField_ExchangeDeliveryMargin_get(swigCPtr, this);
  }

  public void setReserveBalance(double value) {
    thostmduserapiJNI.CThostFtdcSyncingTradingAccountField_ReserveBalance_set(swigCPtr, this, value);
  }

  public double getReserveBalance() {
    return thostmduserapiJNI.CThostFtdcSyncingTradingAccountField_ReserveBalance_get(swigCPtr, this);
  }

  public void setCurrencyID(String value) {
    thostmduserapiJNI.CThostFtdcSyncingTradingAccountField_CurrencyID_set(swigCPtr, this, value);
  }

  public String getCurrencyID() {
    return thostmduserapiJNI.CThostFtdcSyncingTradingAccountField_CurrencyID_get(swigCPtr, this);
  }

  public void setPreFundMortgageIn(double value) {
    thostmduserapiJNI.CThostFtdcSyncingTradingAccountField_PreFundMortgageIn_set(swigCPtr, this, value);
  }

  public double getPreFundMortgageIn() {
    return thostmduserapiJNI.CThostFtdcSyncingTradingAccountField_PreFundMortgageIn_get(swigCPtr, this);
  }

  public void setPreFundMortgageOut(double value) {
    thostmduserapiJNI.CThostFtdcSyncingTradingAccountField_PreFundMortgageOut_set(swigCPtr, this, value);
  }

  public double getPreFundMortgageOut() {
    return thostmduserapiJNI.CThostFtdcSyncingTradingAccountField_PreFundMortgageOut_get(swigCPtr, this);
  }

  public void setFundMortgageIn(double value) {
    thostmduserapiJNI.CThostFtdcSyncingTradingAccountField_FundMortgageIn_set(swigCPtr, this, value);
  }

  public double getFundMortgageIn() {
    return thostmduserapiJNI.CThostFtdcSyncingTradingAccountField_FundMortgageIn_get(swigCPtr, this);
  }

  public void setFundMortgageOut(double value) {
    thostmduserapiJNI.CThostFtdcSyncingTradingAccountField_FundMortgageOut_set(swigCPtr, this, value);
  }

  public double getFundMortgageOut() {
    return thostmduserapiJNI.CThostFtdcSyncingTradingAccountField_FundMortgageOut_get(swigCPtr, this);
  }

  public void setFundMortgageAvailable(double value) {
    thostmduserapiJNI.CThostFtdcSyncingTradingAccountField_FundMortgageAvailable_set(swigCPtr, this, value);
  }

  public double getFundMortgageAvailable() {
    return thostmduserapiJNI.CThostFtdcSyncingTradingAccountField_FundMortgageAvailable_get(swigCPtr, this);
  }

  public void setMortgageableFund(double value) {
    thostmduserapiJNI.CThostFtdcSyncingTradingAccountField_MortgageableFund_set(swigCPtr, this, value);
  }

  public double getMortgageableFund() {
    return thostmduserapiJNI.CThostFtdcSyncingTradingAccountField_MortgageableFund_get(swigCPtr, this);
  }

  public void setSpecProductMargin(double value) {
    thostmduserapiJNI.CThostFtdcSyncingTradingAccountField_SpecProductMargin_set(swigCPtr, this, value);
  }

  public double getSpecProductMargin() {
    return thostmduserapiJNI.CThostFtdcSyncingTradingAccountField_SpecProductMargin_get(swigCPtr, this);
  }

  public void setSpecProductFrozenMargin(double value) {
    thostmduserapiJNI.CThostFtdcSyncingTradingAccountField_SpecProductFrozenMargin_set(swigCPtr, this, value);
  }

  public double getSpecProductFrozenMargin() {
    return thostmduserapiJNI.CThostFtdcSyncingTradingAccountField_SpecProductFrozenMargin_get(swigCPtr, this);
  }

  public void setSpecProductCommission(double value) {
    thostmduserapiJNI.CThostFtdcSyncingTradingAccountField_SpecProductCommission_set(swigCPtr, this, value);
  }

  public double getSpecProductCommission() {
    return thostmduserapiJNI.CThostFtdcSyncingTradingAccountField_SpecProductCommission_get(swigCPtr, this);
  }

  public void setSpecProductFrozenCommission(double value) {
    thostmduserapiJNI.CThostFtdcSyncingTradingAccountField_SpecProductFrozenCommission_set(swigCPtr, this, value);
  }

  public double getSpecProductFrozenCommission() {
    return thostmduserapiJNI.CThostFtdcSyncingTradingAccountField_SpecProductFrozenCommission_get(swigCPtr, this);
  }

  public void setSpecProductPositionProfit(double value) {
    thostmduserapiJNI.CThostFtdcSyncingTradingAccountField_SpecProductPositionProfit_set(swigCPtr, this, value);
  }

  public double getSpecProductPositionProfit() {
    return thostmduserapiJNI.CThostFtdcSyncingTradingAccountField_SpecProductPositionProfit_get(swigCPtr, this);
  }

  public void setSpecProductCloseProfit(double value) {
    thostmduserapiJNI.CThostFtdcSyncingTradingAccountField_SpecProductCloseProfit_set(swigCPtr, this, value);
  }

  public double getSpecProductCloseProfit() {
    return thostmduserapiJNI.CThostFtdcSyncingTradingAccountField_SpecProductCloseProfit_get(swigCPtr, this);
  }

  public void setSpecProductPositionProfitByAlg(double value) {
    thostmduserapiJNI.CThostFtdcSyncingTradingAccountField_SpecProductPositionProfitByAlg_set(swigCPtr, this, value);
  }

  public double getSpecProductPositionProfitByAlg() {
    return thostmduserapiJNI.CThostFtdcSyncingTradingAccountField_SpecProductPositionProfitByAlg_get(swigCPtr, this);
  }

  public void setSpecProductExchangeMargin(double value) {
    thostmduserapiJNI.CThostFtdcSyncingTradingAccountField_SpecProductExchangeMargin_set(swigCPtr, this, value);
  }

  public double getSpecProductExchangeMargin() {
    return thostmduserapiJNI.CThostFtdcSyncingTradingAccountField_SpecProductExchangeMargin_get(swigCPtr, this);
  }

  public void setFrozenSwap(double value) {
    thostmduserapiJNI.CThostFtdcSyncingTradingAccountField_FrozenSwap_set(swigCPtr, this, value);
  }

  public double getFrozenSwap() {
    return thostmduserapiJNI.CThostFtdcSyncingTradingAccountField_FrozenSwap_get(swigCPtr, this);
  }

  public void setRemainSwap(double value) {
    thostmduserapiJNI.CThostFtdcSyncingTradingAccountField_RemainSwap_set(swigCPtr, this, value);
  }

  public double getRemainSwap() {
    return thostmduserapiJNI.CThostFtdcSyncingTradingAccountField_RemainSwap_get(swigCPtr, this);
  }

  public CThostFtdcSyncingTradingAccountField() {
    this(thostmduserapiJNI.new_CThostFtdcSyncingTradingAccountField(), true);
  }

}
