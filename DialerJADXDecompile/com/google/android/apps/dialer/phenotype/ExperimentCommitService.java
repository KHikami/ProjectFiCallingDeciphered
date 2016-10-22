package com.google.android.apps.dialer.phenotype;

import android.app.IntentService;
import android.content.Intent;
import bjc;
import brc;
import brd;
import buf;
import cre;
import crs;

/* compiled from: PG */
public final class ExperimentCommitService extends IntentService {
    private brc a;

    public ExperimentCommitService() {
        super("ExperimentCommitService");
    }

    public final void onDestroy() {
        super.onDestroy();
        if (this.a != null) {
            this.a.c();
        }
    }

    protected final void onHandleIntent(Intent intent) {
        this.a = new brd(this).a(cre.b).b();
        this.a.b();
        crs bjc = new bjc(this.a, "com.google.android.dialer", this);
        Object obj = "";
        buf.A(obj);
        bjc.a(obj, 3);
    }
}
