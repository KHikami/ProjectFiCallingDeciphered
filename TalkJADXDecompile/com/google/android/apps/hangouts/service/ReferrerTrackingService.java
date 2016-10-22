package com.google.android.apps.hangouts.service;

import android.app.IntentService;
import android.content.Context;
import android.content.Intent;
import bkq;

public class ReferrerTrackingService extends IntentService {
    public ReferrerTrackingService() {
        super("ReferrerTrackingService");
    }

    protected void onHandleIntent(Intent intent) {
        bkq.b((Context) this, intent.getStringExtra("referrer"));
    }
}
