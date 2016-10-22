package com.google.android.apps.hangouts.settings;

import android.os.Bundle;
import fvp;
import gwb;
import jcu;
import jyj;
import jzc;
import uq;

public class SettingsActivity extends jzc {
    public SettingsActivity() {
        new jcu(this, this.F).a(this.E).a(false);
        jyj jyj = new jyj((uq) this, this.F);
        fvp fvp = new fvp(this, this, this.F);
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(gwb.gm);
    }
}
