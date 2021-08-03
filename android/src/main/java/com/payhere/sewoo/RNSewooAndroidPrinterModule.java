package com.payhere.sewoo;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;

public class RNSewooAndroidPrinterModule extends ReactContextBaseJavaModule {

    private final String TAG = "RNSewooPrinter";

  public RNSewooAndroidPrinterModule(ReactApplicationContext reactContext) {
        super(reactContext);
  }

    @Override
    public String getName() {
        return "RNSewooAndroidPrinter";
    }

}
