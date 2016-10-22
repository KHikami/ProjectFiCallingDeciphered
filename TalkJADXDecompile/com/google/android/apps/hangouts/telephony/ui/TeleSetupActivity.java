package com.google.android.apps.hangouts.telephony.ui;

import android.os.Bundle;
import gho;
import ghp;
import gkn;
import glk;
import jmj;
import jzp;

public class TeleSetupActivity extends jzp implements ghp {
    private final jmj n;

    public TeleSetupActivity() {
        this.n = new jmj(this, this.q).a(this.p);
    }

    protected void onCreate(Bundle bundle) {
        glk.c("Babel_telephony", "TeleSetupActivity.onCreate", new Object[0]);
        super.onCreate(bundle);
        h().a(this, this.n);
    }

    public void onSaveInstanceState(Bundle bundle) {
        glk.c("Babel_telephony", "TeleSetupActivity.onSaveInstanceState, finishing: " + isFinishing(), new Object[0]);
        super.onSaveInstanceState(bundle);
    }

    public void onResume() {
        glk.c("Babel_telephony", "TeleSetupActivity.onResume", new Object[0]);
        super.onResume();
    }

    public void onPause() {
        glk.c("Babel_telephony", "TeleSetupActivity.onPause, finishing: " + isFinishing(), new Object[0]);
        super.onPause();
    }

    public void onStop() {
        glk.c("Babel_telephony", "TeleSetupActivity.onStop, finishing: " + isFinishing(), new Object[0]);
        super.onStop();
    }

    public void onDestroy() {
        glk.c("Babel_telephony", "TeleSetupActivity.onDestroy, finishing: " + isFinishing(), new Object[0]);
        super.onDestroy();
        if (isFinishing()) {
            h().e();
        }
    }

    public Object g() {
        return h();
    }

    private gho h() {
        return (gho) ((gkn) getIntent().getParcelableExtra("controller")).a();
    }
}
