/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package test.thosttraderapi;

public class CThostFtdcMarketDataBid45Field {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected CThostFtdcMarketDataBid45Field(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcMarketDataBid45Field obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        thosttradeapiJNI.delete_CThostFtdcMarketDataBid45Field(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBidPrice4(double value) {
    thosttradeapiJNI.CThostFtdcMarketDataBid45Field_BidPrice4_set(swigCPtr, this, value);
  }

  public double getBidPrice4() {
    return thosttradeapiJNI.CThostFtdcMarketDataBid45Field_BidPrice4_get(swigCPtr, this);
  }

  public void setBidVolume4(int value) {
    thosttradeapiJNI.CThostFtdcMarketDataBid45Field_BidVolume4_set(swigCPtr, this, value);
  }

  public int getBidVolume4() {
    return thosttradeapiJNI.CThostFtdcMarketDataBid45Field_BidVolume4_get(swigCPtr, this);
  }

  public void setBidPrice5(double value) {
    thosttradeapiJNI.CThostFtdcMarketDataBid45Field_BidPrice5_set(swigCPtr, this, value);
  }

  public double getBidPrice5() {
    return thosttradeapiJNI.CThostFtdcMarketDataBid45Field_BidPrice5_get(swigCPtr, this);
  }

  public void setBidVolume5(int value) {
    thosttradeapiJNI.CThostFtdcMarketDataBid45Field_BidVolume5_set(swigCPtr, this, value);
  }

  public int getBidVolume5() {
    return thosttradeapiJNI.CThostFtdcMarketDataBid45Field_BidVolume5_get(swigCPtr, this);
  }

  public CThostFtdcMarketDataBid45Field() {
    this(thosttradeapiJNI.new_CThostFtdcMarketDataBid45Field(), true);
  }

}
