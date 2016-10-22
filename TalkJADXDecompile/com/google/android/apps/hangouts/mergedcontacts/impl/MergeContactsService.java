package com.google.android.apps.hangouts.mergedcontacts.impl;

import android.app.IntentService;
import android.content.Intent;
import dxg;
import glk;

public class MergeContactsService extends IntentService {
    private dxg a;

    public MergeContactsService() {
        super("MergeContactsService");
    }

    protected void onHandleIntent(Intent intent) {
        int intExtra = intent.getIntExtra("account_id", -1);
        if (intExtra == -1) {
            glk.d("Babel_db", "Invalid account id passed to MergeContactsService", new Object[0]);
            return;
        }
        this.a = new dxg(getApplicationContext(), getContentResolver(), intExtra, intent.getBooleanExtra("force_merge", false));
        this.a.a();
    }
}
