package com.beitian.mylibrary;

import hugo.weaving.DebugLog;

public class LibrayUtils {
    @DebugLog
    public void testAop2() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
