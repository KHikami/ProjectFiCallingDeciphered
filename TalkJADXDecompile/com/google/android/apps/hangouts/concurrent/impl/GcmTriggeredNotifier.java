package com.google.android.apps.hangouts.concurrent.impl;

import android.content.Context;
import android.os.Bundle;
import bhl;
import bhp;
import bhz;
import ify;
import ifz;
import igi;
import jyn;

public class GcmTriggeredNotifier extends ify {
    private static final bhp[] a;
    private Context b;

    static {
        a = bhp.values();
    }

    public void onCreate() {
        this.b = getApplicationContext();
        super.onCreate();
    }

    public ifz a() {
        return (ifz) jyn.a(this.b, ifz.class);
    }

    public int a(igi igi) {
        int ordinal;
        String a = igi.a();
        String str = "Received callback from GcmNetworkManager with tag: ";
        String valueOf = String.valueOf(a);
        if (valueOf.length() != 0) {
            str.concat(valueOf);
        } else {
            valueOf = new String(str);
        }
        ConcurrentService e = ((bhz) jyn.a(this.b, bhl.class)).e();
        e.a().c(a);
        Bundle b = igi.b();
        if (b == null) {
            ordinal = bhp.DEFAULT.ordinal();
        } else {
            ordinal = b.getInt("conc_wakeup_priority_group", -1);
        }
        if (ordinal < 0 || ordinal >= a.length) {
            return 2;
        }
        e.a(a[ordinal]);
        return 0;
    }
}
