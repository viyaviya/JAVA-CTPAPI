/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package test.thostmduserapi;

public class CThostFtdcExchangeOrderField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected CThostFtdcExchangeOrderField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcExchangeOrderField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        thostmduserapiJNI.delete_CThostFtdcExchangeOrderField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setOrderPriceType(char value) {
    thostmduserapiJNI.CThostFtdcExchangeOrderField_OrderPriceType_set(swigCPtr, this, value);
  }

  public char getOrderPriceType() {
    return thostmduserapiJNI.CThostFtdcExchangeOrderField_OrderPriceType_get(swigCPtr, this);
  }

  public void setDirection(char value) {
    thostmduserapiJNI.CThostFtdcExchangeOrderField_Direction_set(swigCPtr, this, value);
  }

  public char getDirection() {
    return thostmduserapiJNI.CThostFtdcExchangeOrderField_Direction_get(swigCPtr, this);
  }

  public void setCombOffsetFlag(String value) {
    thostmduserapiJNI.CThostFtdcExchangeOrderField_CombOffsetFlag_set(swigCPtr, this, value);
  }

  public String getCombOffsetFlag() {
    return thostmduserapiJNI.CThostFtdcExchangeOrderField_CombOffsetFlag_get(swigCPtr, this);
  }

  public void setCombHedgeFlag(String value) {
    thostmduserapiJNI.CThostFtdcExchangeOrderField_CombHedgeFlag_set(swigCPtr, this, value);
  }

  public String getCombHedgeFlag() {
    return thostmduserapiJNI.CThostFtdcExchangeOrderField_CombHedgeFlag_get(swigCPtr, this);
  }

  public void setLimitPrice(double value) {
    thostmduserapiJNI.CThostFtdcExchangeOrderField_LimitPrice_set(swigCPtr, this, value);
  }

  public double getLimitPrice() {
    return thostmduserapiJNI.CThostFtdcExchangeOrderField_LimitPrice_get(swigCPtr, this);
  }

  public void setVolumeTotalOriginal(int value) {
    thostmduserapiJNI.CThostFtdcExchangeOrderField_VolumeTotalOriginal_set(swigCPtr, this, value);
  }

  public int getVolumeTotalOriginal() {
    return thostmduserapiJNI.CThostFtdcExchangeOrderField_VolumeTotalOriginal_get(swigCPtr, this);
  }

  public void setTimeCondition(char value) {
    thostmduserapiJNI.CThostFtdcExchangeOrderField_TimeCondition_set(swigCPtr, this, value);
  }

  public char getTimeCondition() {
    return thostmduserapiJNI.CThostFtdcExchangeOrderField_TimeCondition_get(swigCPtr, this);
  }

  public void setGTDDate(String value) {
    thostmduserapiJNI.CThostFtdcExchangeOrderField_GTDDate_set(swigCPtr, this, value);
  }

  public String getGTDDate() {
    return thostmduserapiJNI.CThostFtdcExchangeOrderField_GTDDate_get(swigCPtr, this);
  }

  public void setVolumeCondition(char value) {
    thostmduserapiJNI.CThostFtdcExchangeOrderField_VolumeCondition_set(swigCPtr, this, value);
  }

  public char getVolumeCondition() {
    return thostmduserapiJNI.CThostFtdcExchangeOrderField_VolumeCondition_get(swigCPtr, this);
  }

  public void setMinVolume(int value) {
    thostmduserapiJNI.CThostFtdcExchangeOrderField_MinVolume_set(swigCPtr, this, value);
  }

  public int getMinVolume() {
    return thostmduserapiJNI.CThostFtdcExchangeOrderField_MinVolume_get(swigCPtr, this);
  }

  public void setContingentCondition(char value) {
    thostmduserapiJNI.CThostFtdcExchangeOrderField_ContingentCondition_set(swigCPtr, this, value);
  }

  public char getContingentCondition() {
    return thostmduserapiJNI.CThostFtdcExchangeOrderField_ContingentCondition_get(swigCPtr, this);
  }

  public void setStopPrice(double value) {
    thostmduserapiJNI.CThostFtdcExchangeOrderField_StopPrice_set(swigCPtr, this, value);
  }

  public double getStopPrice() {
    return thostmduserapiJNI.CThostFtdcExchangeOrderField_StopPrice_get(swigCPtr, this);
  }

  public void setForceCloseReason(char value) {
    thostmduserapiJNI.CThostFtdcExchangeOrderField_ForceCloseReason_set(swigCPtr, this, value);
  }

  public char getForceCloseReason() {
    return thostmduserapiJNI.CThostFtdcExchangeOrderField_ForceCloseReason_get(swigCPtr, this);
  }

  public void setIsAutoSuspend(int value) {
    thostmduserapiJNI.CThostFtdcExchangeOrderField_IsAutoSuspend_set(swigCPtr, this, value);
  }

  public int getIsAutoSuspend() {
    return thostmduserapiJNI.CThostFtdcExchangeOrderField_IsAutoSuspend_get(swigCPtr, this);
  }

  public void setBusinessUnit(String value) {
    thostmduserapiJNI.CThostFtdcExchangeOrderField_BusinessUnit_set(swigCPtr, this, value);
  }

  public String getBusinessUnit() {
    return thostmduserapiJNI.CThostFtdcExchangeOrderField_BusinessUnit_get(swigCPtr, this);
  }

  public void setRequestID(int value) {
    thostmduserapiJNI.CThostFtdcExchangeOrderField_RequestID_set(swigCPtr, this, value);
  }

  public int getRequestID() {
    return thostmduserapiJNI.CThostFtdcExchangeOrderField_RequestID_get(swigCPtr, this);
  }

  public void setOrderLocalID(String value) {
    thostmduserapiJNI.CThostFtdcExchangeOrderField_OrderLocalID_set(swigCPtr, this, value);
  }

  public String getOrderLocalID() {
    return thostmduserapiJNI.CThostFtdcExchangeOrderField_OrderLocalID_get(swigCPtr, this);
  }

  public void setExchangeID(String value) {
    thostmduserapiJNI.CThostFtdcExchangeOrderField_ExchangeID_set(swigCPtr, this, value);
  }

  public String getExchangeID() {
    return thostmduserapiJNI.CThostFtdcExchangeOrderField_ExchangeID_get(swigCPtr, this);
  }

  public void setParticipantID(String value) {
    thostmduserapiJNI.CThostFtdcExchangeOrderField_ParticipantID_set(swigCPtr, this, value);
  }

  public String getParticipantID() {
    return thostmduserapiJNI.CThostFtdcExchangeOrderField_ParticipantID_get(swigCPtr, this);
  }

  public void setClientID(String value) {
    thostmduserapiJNI.CThostFtdcExchangeOrderField_ClientID_set(swigCPtr, this, value);
  }

  public String getClientID() {
    return thostmduserapiJNI.CThostFtdcExchangeOrderField_ClientID_get(swigCPtr, this);
  }

  public void setExchangeInstID(String value) {
    thostmduserapiJNI.CThostFtdcExchangeOrderField_ExchangeInstID_set(swigCPtr, this, value);
  }

  public String getExchangeInstID() {
    return thostmduserapiJNI.CThostFtdcExchangeOrderField_ExchangeInstID_get(swigCPtr, this);
  }

  public void setTraderID(String value) {
    thostmduserapiJNI.CThostFtdcExchangeOrderField_TraderID_set(swigCPtr, this, value);
  }

  public String getTraderID() {
    return thostmduserapiJNI.CThostFtdcExchangeOrderField_TraderID_get(swigCPtr, this);
  }

  public void setInstallID(int value) {
    thostmduserapiJNI.CThostFtdcExchangeOrderField_InstallID_set(swigCPtr, this, value);
  }

  public int getInstallID() {
    return thostmduserapiJNI.CThostFtdcExchangeOrderField_InstallID_get(swigCPtr, this);
  }

  public void setOrderSubmitStatus(char value) {
    thostmduserapiJNI.CThostFtdcExchangeOrderField_OrderSubmitStatus_set(swigCPtr, this, value);
  }

  public char getOrderSubmitStatus() {
    return thostmduserapiJNI.CThostFtdcExchangeOrderField_OrderSubmitStatus_get(swigCPtr, this);
  }

  public void setNotifySequence(int value) {
    thostmduserapiJNI.CThostFtdcExchangeOrderField_NotifySequence_set(swigCPtr, this, value);
  }

  public int getNotifySequence() {
    return thostmduserapiJNI.CThostFtdcExchangeOrderField_NotifySequence_get(swigCPtr, this);
  }

  public void setTradingDay(String value) {
    thostmduserapiJNI.CThostFtdcExchangeOrderField_TradingDay_set(swigCPtr, this, value);
  }

  public String getTradingDay() {
    return thostmduserapiJNI.CThostFtdcExchangeOrderField_TradingDay_get(swigCPtr, this);
  }

  public void setSettlementID(int value) {
    thostmduserapiJNI.CThostFtdcExchangeOrderField_SettlementID_set(swigCPtr, this, value);
  }

  public int getSettlementID() {
    return thostmduserapiJNI.CThostFtdcExchangeOrderField_SettlementID_get(swigCPtr, this);
  }

  public void setOrderSysID(String value) {
    thostmduserapiJNI.CThostFtdcExchangeOrderField_OrderSysID_set(swigCPtr, this, value);
  }

  public String getOrderSysID() {
    return thostmduserapiJNI.CThostFtdcExchangeOrderField_OrderSysID_get(swigCPtr, this);
  }

  public void setOrderSource(char value) {
    thostmduserapiJNI.CThostFtdcExchangeOrderField_OrderSource_set(swigCPtr, this, value);
  }

  public char getOrderSource() {
    return thostmduserapiJNI.CThostFtdcExchangeOrderField_OrderSource_get(swigCPtr, this);
  }

  public void setOrderStatus(char value) {
    thostmduserapiJNI.CThostFtdcExchangeOrderField_OrderStatus_set(swigCPtr, this, value);
  }

  public char getOrderStatus() {
    return thostmduserapiJNI.CThostFtdcExchangeOrderField_OrderStatus_get(swigCPtr, this);
  }

  public void setOrderType(char value) {
    thostmduserapiJNI.CThostFtdcExchangeOrderField_OrderType_set(swigCPtr, this, value);
  }

  public char getOrderType() {
    return thostmduserapiJNI.CThostFtdcExchangeOrderField_OrderType_get(swigCPtr, this);
  }

  public void setVolumeTraded(int value) {
    thostmduserapiJNI.CThostFtdcExchangeOrderField_VolumeTraded_set(swigCPtr, this, value);
  }

  public int getVolumeTraded() {
    return thostmduserapiJNI.CThostFtdcExchangeOrderField_VolumeTraded_get(swigCPtr, this);
  }

  public void setVolumeTotal(int value) {
    thostmduserapiJNI.CThostFtdcExchangeOrderField_VolumeTotal_set(swigCPtr, this, value);
  }

  public int getVolumeTotal() {
    return thostmduserapiJNI.CThostFtdcExchangeOrderField_VolumeTotal_get(swigCPtr, this);
  }

  public void setInsertDate(String value) {
    thostmduserapiJNI.CThostFtdcExchangeOrderField_InsertDate_set(swigCPtr, this, value);
  }

  public String getInsertDate() {
    return thostmduserapiJNI.CThostFtdcExchangeOrderField_InsertDate_get(swigCPtr, this);
  }

  public void setInsertTime(String value) {
    thostmduserapiJNI.CThostFtdcExchangeOrderField_InsertTime_set(swigCPtr, this, value);
  }

  public String getInsertTime() {
    return thostmduserapiJNI.CThostFtdcExchangeOrderField_InsertTime_get(swigCPtr, this);
  }

  public void setActiveTime(String value) {
    thostmduserapiJNI.CThostFtdcExchangeOrderField_ActiveTime_set(swigCPtr, this, value);
  }

  public String getActiveTime() {
    return thostmduserapiJNI.CThostFtdcExchangeOrderField_ActiveTime_get(swigCPtr, this);
  }

  public void setSuspendTime(String value) {
    thostmduserapiJNI.CThostFtdcExchangeOrderField_SuspendTime_set(swigCPtr, this, value);
  }

  public String getSuspendTime() {
    return thostmduserapiJNI.CThostFtdcExchangeOrderField_SuspendTime_get(swigCPtr, this);
  }

  public void setUpdateTime(String value) {
    thostmduserapiJNI.CThostFtdcExchangeOrderField_UpdateTime_set(swigCPtr, this, value);
  }

  public String getUpdateTime() {
    return thostmduserapiJNI.CThostFtdcExchangeOrderField_UpdateTime_get(swigCPtr, this);
  }

  public void setCancelTime(String value) {
    thostmduserapiJNI.CThostFtdcExchangeOrderField_CancelTime_set(swigCPtr, this, value);
  }

  public String getCancelTime() {
    return thostmduserapiJNI.CThostFtdcExchangeOrderField_CancelTime_get(swigCPtr, this);
  }

  public void setActiveTraderID(String value) {
    thostmduserapiJNI.CThostFtdcExchangeOrderField_ActiveTraderID_set(swigCPtr, this, value);
  }

  public String getActiveTraderID() {
    return thostmduserapiJNI.CThostFtdcExchangeOrderField_ActiveTraderID_get(swigCPtr, this);
  }

  public void setClearingPartID(String value) {
    thostmduserapiJNI.CThostFtdcExchangeOrderField_ClearingPartID_set(swigCPtr, this, value);
  }

  public String getClearingPartID() {
    return thostmduserapiJNI.CThostFtdcExchangeOrderField_ClearingPartID_get(swigCPtr, this);
  }

  public void setSequenceNo(int value) {
    thostmduserapiJNI.CThostFtdcExchangeOrderField_SequenceNo_set(swigCPtr, this, value);
  }

  public int getSequenceNo() {
    return thostmduserapiJNI.CThostFtdcExchangeOrderField_SequenceNo_get(swigCPtr, this);
  }

  public void setBranchID(String value) {
    thostmduserapiJNI.CThostFtdcExchangeOrderField_BranchID_set(swigCPtr, this, value);
  }

  public String getBranchID() {
    return thostmduserapiJNI.CThostFtdcExchangeOrderField_BranchID_get(swigCPtr, this);
  }

  public void setIPAddress(String value) {
    thostmduserapiJNI.CThostFtdcExchangeOrderField_IPAddress_set(swigCPtr, this, value);
  }

  public String getIPAddress() {
    return thostmduserapiJNI.CThostFtdcExchangeOrderField_IPAddress_get(swigCPtr, this);
  }

  public void setMacAddress(String value) {
    thostmduserapiJNI.CThostFtdcExchangeOrderField_MacAddress_set(swigCPtr, this, value);
  }

  public String getMacAddress() {
    return thostmduserapiJNI.CThostFtdcExchangeOrderField_MacAddress_get(swigCPtr, this);
  }

  public CThostFtdcExchangeOrderField() {
    this(thostmduserapiJNI.new_CThostFtdcExchangeOrderField(), true);
  }

}