package com.google.android.apps.hangouts.settings;

import android.os.Bundle;
import bc;
import fuu;
import gwb;
import jcu;
import jyj;
import jzc;
import uq;

public class MessageNotificationSettingsActivity extends jzc {
    public MessageNotificationSettingsActivity() {
        new jcu(this, this.F).a(this.E).a(false);
        jyj jyj = new jyj((uq) this, this.F);
        fuu fuu = new fuu(this, this, this.F);
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(gwb.gm);
        setTitle(getApplicationContext().getString(bc.ab));
    }
}
