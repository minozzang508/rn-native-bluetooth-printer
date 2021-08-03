package com.payhere.sewoo;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;

public class RNSewooAndroidPrinterModule extends ReactContextBaseJavaModule {

    private final ReactApplicationContext reactContext;

    public RNSewooAndroidPrinterModule(ReactApplicationContext reactContext) {
        super(reactContext);
        this.reactContext = reactContext;
    }

    @Override
    public String getName() {
        return "RNSewooAndroidPrinter";
    }
}
