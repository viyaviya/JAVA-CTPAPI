/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package test.thostmduserapi;

public class CThostFtdcInvestorProductGroupMarginField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected CThostFtdcInvestorProductGroupMarginField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcInvestorProductGroupMarginField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        thostmduserapiJNI.delete_CThostFtdcInvestorProductGroupMarginField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setProductGroupID(String value) {
    thostmduserapiJNI.CThostFtdcInvestorProductGroupMarginField_ProductGroupID_set(swigCPtr, this, value);
  }

  public String getProductGroupID() {
    return thostmduserapiJNI.CThostFtdcInvestorProductGroupMarginField_ProductGroupID_get(swigCPtr, this);
  }

  public void setBrokerID(String value) {
    thostmduserapiJNI.CThostFtdcInvestorProductGroupMarginField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return thostmduserapiJNI.CThostFtdcInvestorProductGroupMarginField_BrokerID_get(swigCPtr, this);
  }

  public void setInvestorID(String value) {
    thostmduserapiJNI.CThostFtdcInvestorProductGroupMarginField_InvestorID_set(swigCPtr, this, value);
  }

  public String getInvestorID() {
    return thostmduserapiJNI.CThostFtdcInvestorProductGroupMarginField_InvestorID_get(swigCPtr, this);
  }

  public void setTradingDay(String value) {
    thostmduserapiJNI.CThostFtdcInvestorProductGroupMarginField_TradingDay_set(swigCPtr, this, value);
  }

  public String getTradingDay() {
    return thostmduserapiJNI.CThostFtdcInvestorProductGroupMarginField_TradingDay_get(swigCPtr, this);
  }

  public void setSettlementID(int value) {
    thostmduserapiJNI.CThostFtdcInvestorProductGroupMarginField_SettlementID_set(swigCPtr, this, value);
  }

  public int getSettlementID() {
    return thostmduserapiJNI.CThostFtdcInvestorProductGroupMarginField_SettlementID_get(swigCPtr, this);
  }

  public void setFrozenMargin(double value) {
    thostmduserapiJNI.CThostFtdcInvestorProductGroupMarginField_FrozenMargin_set(swigCPtr, this, value);
  }

  public double getFrozenMargin() {
    return thostmduserapiJNI.CThostFtdcInvestorProductGroupMarginField_FrozenMargin_get(swigCPtr, this);
  }

  public void setLongFrozenMargin(double value) {
    thostmduserapiJNI.CThostFtdcInvestorProductGroupMarginField_LongFrozenMargin_set(swigCPtr, this, value);
  }

  public double getLongFrozenMargin() {
    return thostmduserapiJNI.CThostFtdcInvestorProductGroupMarginField_LongFrozenMargin_get(swigCPtr, this);
  }

  public void setShortFrozenMargin(double value) {
    thostmduserapiJNI.CThostFtdcInvestorProductGroupMarginField_ShortFrozenMargin_set(swigCPtr, this, value);
  }

  public double getShortFrozenMargin() {
    return thostmduserapiJNI.CThostFtdcInvestorProductGroupMarginField_ShortFrozenMargin_get(swigCPtr, this);
  }

  public void setUseMargin(double value) {
    thostmduserapiJNI.CThostFtdcInvestorProductGroupMarginField_UseMargin_set(swigCPtr, this, value);
  }

  public double getUseMargin() {
    return thostmduserapiJNI.CThostFtdcInvestorProductGroupMarginField_UseMargin_get(swigCPtr, this);
  }

  public void setLongUseMargin(double value) {
    thostmduserapiJNI.CThostFtdcInvestorProductGroupMarginField_LongUseMargin_set(swigCPtr, this, value);
  }

  public double getLongUseMargin() {
    return thostmduserapiJNI.CThostFtdcInvestorProductGroupMarginField_LongUseMargin_get(swigCPtr, this);
  }

  public void setShortUseMargin(double value) {
    thostmduserapiJNI.CThostFtdcInvestorProductGroupMarginField_ShortUseMargin_set(swigCPtr, this, value);
  }

  public double getShortUseMargin() {
    return thostmduserapiJNI.CThostFtdcInvestorProductGroupMarginField_ShortUseMargin_get(swigCPtr, this);
  }

  public void setExchMargin(double value) {
    thostmduserapiJNI.CThostFtdcInvestorProductGroupMarginField_ExchMargin_set(swigCPtr, this, value);
  }

  public double getExchMargin() {
    return thostmduserapiJNI.CThostFtdcInvestorProductGroupMarginField_ExchMargin_get(swigCPtr, this);
  }

  public void setLongExchMargin(double value) {
    thostmduserapiJNI.CThostFtdcInvestorProductGroupMarginField_LongExchMargin_set(swigCPtr, this, value);
  }

  public double getLongExchMargin() {
    return thostmduserapiJNI.CThostFtdcInvestorProductGroupMarginField_LongExchMargin_get(swigCPtr, this);
  }

  public void setShortExchMargin(double value) {
    thostmduserapiJNI.CThostFtdcInvestorProductGroupMarginField_ShortExchMargin_set(swigCPtr, this, value);
  }

  public double getShortExchMargin() {
    return thostmduserapiJNI.CThostFtdcInvestorProductGroupMarginField_ShortExchMargin_get(swigCPtr, this);
  }

  public void setCloseProfit(double value) {
    thostmduserapiJNI.CThostFtdcInvestorProductGroupMarginField_CloseProfit_set(swigCPtr, this, value);
  }

  public double getCloseProfit() {
    return thostmduserapiJNI.CThostFtdcInvestorProductGroupMarginField_CloseProfit_get(swigCPtr, this);
  }

  public void setFrozenCommission(double value) {
    thostmduserapiJNI.CThostFtdcInvestorProductGroupMarginField_FrozenCommission_set(swigCPtr, this, value);
  }

  public double getFrozenCommission() {
    return thostmduserapiJNI.CThostFtdcInvestorProductGroupMarginField_FrozenCommission_get(swigCPtr, this);
  }

  public void setCommission(double value) {
    thostmduserapiJNI.CThostFtdcInvestorProductGroupMarginField_Commission_set(swigCPtr, this, value);
  }

  public double getCommission() {
    return thostmduserapiJNI.CThostFtdcInvestorProductGroupMarginField_Commission_get(swigCPtr, this);
  }

  public void setFrozenCash(double value) {
    thostmduserapiJNI.CThostFtdcInvestorProductGroupMarginField_FrozenCash_set(swigCPtr, this, value);
  }

  public double getFrozenCash() {
    return thostmduserapiJNI.CThostFtdcInvestorProductGroupMarginField_FrozenCash_get(swigCPtr, this);
  }

  public void setCashIn(double value) {
    thostmduserapiJNI.CThostFtdcInvestorProductGroupMarginField_CashIn_set(swigCPtr, this, value);
  }

  public double getCashIn() {
    return thostmduserapiJNI.CThostFtdcInvestorProductGroupMarginField_CashIn_get(swigCPtr, this);
  }

  public void setPositionProfit(double value) {
    thostmduserapiJNI.CThostFtdcInvestorProductGroupMarginField_PositionProfit_set(swigCPtr, this, value);
  }

  public double getPositionProfit() {
    return thostmduserapiJNI.CThostFtdcInvestorProductGroupMarginField_PositionProfit_get(swigCPtr, this);
  }

  public void setOffsetAmount(double value) {
    thostmduserapiJNI.CThostFtdcInvestorProductGroupMarginField_OffsetAmount_set(swigCPtr, this, value);
  }

  public double getOffsetAmount() {
    return thostmduserapiJNI.CThostFtdcInvestorProductGroupMarginField_OffsetAmount_get(swigCPtr, this);
  }

  public void setLongOffsetAmount(double value) {
    thostmduserapiJNI.CThostFtdcInvestorProductGroupMarginField_LongOffsetAmount_set(swigCPtr, this, value);
  }

  public double getLongOffsetAmount() {
    return thostmduserapiJNI.CThostFtdcInvestorProductGroupMarginField_LongOffsetAmount_get(swigCPtr, this);
  }

  public void setShortOffsetAmount(double value) {
    thostmduserapiJNI.CThostFtdcInvestorProductGroupMarginField_ShortOffsetAmount_set(swigCPtr, this, value);
  }

  public double getShortOffsetAmount() {
    return thostmduserapiJNI.CThostFtdcInvestorProductGroupMarginField_ShortOffsetAmount_get(swigCPtr, this);
  }

  public void setExchOffsetAmount(double value) {
    thostmduserapiJNI.CThostFtdcInvestorProductGroupMarginField_ExchOffsetAmount_set(swigCPtr, this, value);
  }

  public double getExchOffsetAmount() {
    return thostmduserapiJNI.CThostFtdcInvestorProductGroupMarginField_ExchOffsetAmount_get(swigCPtr, this);
  }

  public void setLongExchOffsetAmount(double value) {
    thostmduserapiJNI.CThostFtdcInvestorProductGroupMarginField_LongExchOffsetAmount_set(swigCPtr, this, value);
  }

  public double getLongExchOffsetAmount() {
    return thostmduserapiJNI.CThostFtdcInvestorProductGroupMarginField_LongExchOffsetAmount_get(swigCPtr, this);
  }

  public void setShortExchOffsetAmount(double value) {
    thostmduserapiJNI.CThostFtdcInvestorProductGroupMarginField_ShortExchOffsetAmount_set(swigCPtr, this, value);
  }

  public double getShortExchOffsetAmount() {
    return thostmduserapiJNI.CThostFtdcInvestorProductGroupMarginField_ShortExchOffsetAmount_get(swigCPtr, this);
  }

  public void setHedgeFlag(char value) {
    thostmduserapiJNI.CThostFtdcInvestorProductGroupMarginField_HedgeFlag_set(swigCPtr, this, value);
  }

  public char getHedgeFlag() {
    return thostmduserapiJNI.CThostFtdcInvestorProductGroupMarginField_HedgeFlag_get(swigCPtr, this);
  }

  public void setExchangeID(String value) {
    thostmduserapiJNI.CThostFtdcInvestorProductGroupMarginField_ExchangeID_set(swigCPtr, this, value);
  }

  public String getExchangeID() {
    return thostmduserapiJNI.CThostFtdcInvestorProductGroupMarginField_ExchangeID_get(swigCPtr, this);
  }

  public void setInvestUnitID(String value) {
    thostmduserapiJNI.CThostFtdcInvestorProductGroupMarginField_InvestUnitID_set(swigCPtr, this, value);
  }

  public String getInvestUnitID() {
    return thostmduserapiJNI.CThostFtdcInvestorProductGroupMarginField_InvestUnitID_get(swigCPtr, this);
  }

  public CThostFtdcInvestorProductGroupMarginField() {
    this(thostmduserapiJNI.new_CThostFtdcInvestorProductGroupMarginField(), true);
  }

}
