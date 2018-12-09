/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package test.thostmduserapi;

public class CThostFtdcMdSpi {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected CThostFtdcMdSpi(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcMdSpi obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        thostmduserapiJNI.delete_CThostFtdcMdSpi(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  protected void swigDirectorDisconnect() {
    swigCMemOwn = false;
    delete();
  }

  public void swigReleaseOwnership() {
    swigCMemOwn = false;
    thostmduserapiJNI.CThostFtdcMdSpi_change_ownership(this, swigCPtr, false);
  }

  public void swigTakeOwnership() {
    swigCMemOwn = true;
    thostmduserapiJNI.CThostFtdcMdSpi_change_ownership(this, swigCPtr, true);
  }

  public void OnFrontConnected() {
    if (getClass() == CThostFtdcMdSpi.class) thostmduserapiJNI.CThostFtdcMdSpi_OnFrontConnected(swigCPtr, this); else thostmduserapiJNI.CThostFtdcMdSpi_OnFrontConnectedSwigExplicitCThostFtdcMdSpi(swigCPtr, this);
  }

  public void OnFrontDisconnected(int nReason) {
    if (getClass() == CThostFtdcMdSpi.class) thostmduserapiJNI.CThostFtdcMdSpi_OnFrontDisconnected(swigCPtr, this, nReason); else thostmduserapiJNI.CThostFtdcMdSpi_OnFrontDisconnectedSwigExplicitCThostFtdcMdSpi(swigCPtr, this, nReason);
  }

  public void OnHeartBeatWarning(int nTimeLapse) {
    if (getClass() == CThostFtdcMdSpi.class) thostmduserapiJNI.CThostFtdcMdSpi_OnHeartBeatWarning(swigCPtr, this, nTimeLapse); else thostmduserapiJNI.CThostFtdcMdSpi_OnHeartBeatWarningSwigExplicitCThostFtdcMdSpi(swigCPtr, this, nTimeLapse);
  }

  public void OnRspUserLogin(CThostFtdcRspUserLoginField pRspUserLogin, CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean bIsLast) {
    if (getClass() == CThostFtdcMdSpi.class) thostmduserapiJNI.CThostFtdcMdSpi_OnRspUserLogin(swigCPtr, this, CThostFtdcRspUserLoginField.getCPtr(pRspUserLogin), pRspUserLogin, CThostFtdcRspInfoField.getCPtr(pRspInfo), pRspInfo, nRequestID, bIsLast); else thostmduserapiJNI.CThostFtdcMdSpi_OnRspUserLoginSwigExplicitCThostFtdcMdSpi(swigCPtr, this, CThostFtdcRspUserLoginField.getCPtr(pRspUserLogin), pRspUserLogin, CThostFtdcRspInfoField.getCPtr(pRspInfo), pRspInfo, nRequestID, bIsLast);
  }

  public void OnRspUserLogout(CThostFtdcUserLogoutField pUserLogout, CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean bIsLast) {
    if (getClass() == CThostFtdcMdSpi.class) thostmduserapiJNI.CThostFtdcMdSpi_OnRspUserLogout(swigCPtr, this, CThostFtdcUserLogoutField.getCPtr(pUserLogout), pUserLogout, CThostFtdcRspInfoField.getCPtr(pRspInfo), pRspInfo, nRequestID, bIsLast); else thostmduserapiJNI.CThostFtdcMdSpi_OnRspUserLogoutSwigExplicitCThostFtdcMdSpi(swigCPtr, this, CThostFtdcUserLogoutField.getCPtr(pUserLogout), pUserLogout, CThostFtdcRspInfoField.getCPtr(pRspInfo), pRspInfo, nRequestID, bIsLast);
  }

  public void OnRspError(CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean bIsLast) {
    if (getClass() == CThostFtdcMdSpi.class) thostmduserapiJNI.CThostFtdcMdSpi_OnRspError(swigCPtr, this, CThostFtdcRspInfoField.getCPtr(pRspInfo), pRspInfo, nRequestID, bIsLast); else thostmduserapiJNI.CThostFtdcMdSpi_OnRspErrorSwigExplicitCThostFtdcMdSpi(swigCPtr, this, CThostFtdcRspInfoField.getCPtr(pRspInfo), pRspInfo, nRequestID, bIsLast);
  }

  public void OnRspSubMarketData(CThostFtdcSpecificInstrumentField pSpecificInstrument, CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean bIsLast) {
    if (getClass() == CThostFtdcMdSpi.class) thostmduserapiJNI.CThostFtdcMdSpi_OnRspSubMarketData(swigCPtr, this, CThostFtdcSpecificInstrumentField.getCPtr(pSpecificInstrument), pSpecificInstrument, CThostFtdcRspInfoField.getCPtr(pRspInfo), pRspInfo, nRequestID, bIsLast); else thostmduserapiJNI.CThostFtdcMdSpi_OnRspSubMarketDataSwigExplicitCThostFtdcMdSpi(swigCPtr, this, CThostFtdcSpecificInstrumentField.getCPtr(pSpecificInstrument), pSpecificInstrument, CThostFtdcRspInfoField.getCPtr(pRspInfo), pRspInfo, nRequestID, bIsLast);
  }

  public void OnRspUnSubMarketData(CThostFtdcSpecificInstrumentField pSpecificInstrument, CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean bIsLast) {
    if (getClass() == CThostFtdcMdSpi.class) thostmduserapiJNI.CThostFtdcMdSpi_OnRspUnSubMarketData(swigCPtr, this, CThostFtdcSpecificInstrumentField.getCPtr(pSpecificInstrument), pSpecificInstrument, CThostFtdcRspInfoField.getCPtr(pRspInfo), pRspInfo, nRequestID, bIsLast); else thostmduserapiJNI.CThostFtdcMdSpi_OnRspUnSubMarketDataSwigExplicitCThostFtdcMdSpi(swigCPtr, this, CThostFtdcSpecificInstrumentField.getCPtr(pSpecificInstrument), pSpecificInstrument, CThostFtdcRspInfoField.getCPtr(pRspInfo), pRspInfo, nRequestID, bIsLast);
  }

  public void OnRspSubForQuoteRsp(CThostFtdcSpecificInstrumentField pSpecificInstrument, CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean bIsLast) {
    if (getClass() == CThostFtdcMdSpi.class) thostmduserapiJNI.CThostFtdcMdSpi_OnRspSubForQuoteRsp(swigCPtr, this, CThostFtdcSpecificInstrumentField.getCPtr(pSpecificInstrument), pSpecificInstrument, CThostFtdcRspInfoField.getCPtr(pRspInfo), pRspInfo, nRequestID, bIsLast); else thostmduserapiJNI.CThostFtdcMdSpi_OnRspSubForQuoteRspSwigExplicitCThostFtdcMdSpi(swigCPtr, this, CThostFtdcSpecificInstrumentField.getCPtr(pSpecificInstrument), pSpecificInstrument, CThostFtdcRspInfoField.getCPtr(pRspInfo), pRspInfo, nRequestID, bIsLast);
  }

  public void OnRspUnSubForQuoteRsp(CThostFtdcSpecificInstrumentField pSpecificInstrument, CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean bIsLast) {
    if (getClass() == CThostFtdcMdSpi.class) thostmduserapiJNI.CThostFtdcMdSpi_OnRspUnSubForQuoteRsp(swigCPtr, this, CThostFtdcSpecificInstrumentField.getCPtr(pSpecificInstrument), pSpecificInstrument, CThostFtdcRspInfoField.getCPtr(pRspInfo), pRspInfo, nRequestID, bIsLast); else thostmduserapiJNI.CThostFtdcMdSpi_OnRspUnSubForQuoteRspSwigExplicitCThostFtdcMdSpi(swigCPtr, this, CThostFtdcSpecificInstrumentField.getCPtr(pSpecificInstrument), pSpecificInstrument, CThostFtdcRspInfoField.getCPtr(pRspInfo), pRspInfo, nRequestID, bIsLast);
  }

  public void OnRtnDepthMarketData(CThostFtdcDepthMarketDataField pDepthMarketData) {
    if (getClass() == CThostFtdcMdSpi.class) thostmduserapiJNI.CThostFtdcMdSpi_OnRtnDepthMarketData(swigCPtr, this, CThostFtdcDepthMarketDataField.getCPtr(pDepthMarketData), pDepthMarketData); else thostmduserapiJNI.CThostFtdcMdSpi_OnRtnDepthMarketDataSwigExplicitCThostFtdcMdSpi(swigCPtr, this, CThostFtdcDepthMarketDataField.getCPtr(pDepthMarketData), pDepthMarketData);
  }

  public void OnRtnForQuoteRsp(CThostFtdcForQuoteRspField pForQuoteRsp) {
    if (getClass() == CThostFtdcMdSpi.class) thostmduserapiJNI.CThostFtdcMdSpi_OnRtnForQuoteRsp(swigCPtr, this, CThostFtdcForQuoteRspField.getCPtr(pForQuoteRsp), pForQuoteRsp); else thostmduserapiJNI.CThostFtdcMdSpi_OnRtnForQuoteRspSwigExplicitCThostFtdcMdSpi(swigCPtr, this, CThostFtdcForQuoteRspField.getCPtr(pForQuoteRsp), pForQuoteRsp);
  }

  public CThostFtdcMdSpi() {
    this(thostmduserapiJNI.new_CThostFtdcMdSpi(), true);
    thostmduserapiJNI.CThostFtdcMdSpi_director_connect(this, swigCPtr, swigCMemOwn, true);
  }

}
