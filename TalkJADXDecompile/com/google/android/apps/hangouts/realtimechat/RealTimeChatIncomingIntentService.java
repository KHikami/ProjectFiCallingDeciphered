package com.google.android.apps.hangouts.realtimechat;

import android.app.IntentService;
import android.content.Intent;
import fha;
import java.util.Iterator;
import jyn;
import mkp;
import mkq;

public class RealTimeChatIncomingIntentService extends IntentService {
    private static final String a;
    private mkp<Integer, fha> b;

    static {
        a = RealTimeChatIncomingIntentService.class.getSimpleName();
    }

    public RealTimeChatIncomingIntentService() {
        super(a);
    }

    public void onCreate() {
        super.onCreate();
        mkq mkq = new mkq();
        for (fha fha : jyn.c(getApplicationContext(), fha.class)) {
            for (Integer a : fha.a()) {
                mkq.a(a, fha);
            }
        }
        this.b = mkq.a();
    }

    public void onHandleIntent(Intent intent) {
        if (intent.hasExtra("op_code")) {
            Iterator a = this.b.d(Integer.valueOf(intent.getIntExtra("op_code", -1))).a();
            while (a.hasNext()) {
                a.next();
                getApplicationContext();
            }
        }
    }
}
