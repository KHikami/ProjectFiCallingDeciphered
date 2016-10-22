package com.google.android.libraries.componentview.core;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class IdProvider {
    private static final AtomicInteger a;
    private static final Map<String, Integer> b;

    static {
        a = new AtomicInteger(1);
        b = new HashMap();
    }

    private IdProvider() {
    }
}
