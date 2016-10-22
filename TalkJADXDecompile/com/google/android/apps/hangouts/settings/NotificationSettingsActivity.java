package com.google.android.apps.hangouts.settings;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import fve;
import fvf;
import gwb;
import jca;
import jcu;
import jwi;
import jwo;
import jyj;
import jyn;
import jzc;
import kbu;
import uq;

public class NotificationSettingsActivity extends jzc {
    public NotificationSettingsActivity() {
        new jcu(this, this.F).a(this.E).a(false);
        jyj jyj = new jyj((uq) this, this.F);
        fve fve = new fve(this, this, this.F);
    }

    public static jwi a(Context context, kbu kbu, jwo jwo, int i, String str, String str2, int i2, String str3) {
        CharSequence string = context.getString(i);
        jca jca = (jca) jyn.a(context, jca.class);
        int a = jca.a();
        Intent intent = new Intent(context, NotificationSettingsActivity.class);
        intent.putExtra("account_id", a);
        intent.putExtra("title_key", string);
        intent.putExtra("sound_key", str2);
        intent.putExtra("sound_type", i2);
        intent.putExtra("vibrate_key", str3);
        intent.putExtra("notifications_key", str);
        jwi a2 = jwo.a(string, null, intent);
        kbu.a(new fvf(a2, jca.c(), str, str3, str2));
        return a2;
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(gwb.gm);
        setTitle(getIntent().getStringExtra("title_key"));
    }
}
