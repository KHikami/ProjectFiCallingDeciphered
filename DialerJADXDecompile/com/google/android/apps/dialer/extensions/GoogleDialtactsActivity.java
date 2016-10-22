package com.google.android.apps.dialer.extensions;

import akz;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.telecom.TelecomManager;
import android.view.MenuItem;
import android.view.View;
import bdf;
import big;
import bih;
import bij;
import bik;
import bil;
import bix;
import bjy;
import brc;
import brd;
import buf;
import cka;
import ckf;
import cob;
import com.android.dialer.app.DialtactsActivity;
import com.google.android.apps.dialer.settings.GoogleDialerSettingsActivity;
import com.google.android.gms.feedback.ThemeSettings;
import com.google.android.gms.googlehelp.GoogleHelp;
import csn;
import gd;

/* compiled from: PG */
public class GoogleDialtactsActivity extends DialtactsActivity implements bik {
    public brc v;
    private bih w;
    private bix x;

    public final boolean l() {
        return PreferenceManager.getDefaultSharedPreferences(getApplicationContext()).getBoolean(getResources().getString(buf.lI), true);
    }

    protected final int m() {
        if (l()) {
            return buf.lz;
        }
        return buf.ly;
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.w = new bih(this, buf.b((TelecomManager) getSystemService("telecom")));
    }

    protected void onDestroy() {
        if (this.v != null) {
            this.v.c();
        }
        this.w.a();
        super.onDestroy();
    }

    public void onAttachFragment(Fragment fragment) {
        super.onAttachFragment(fragment);
        if (fragment instanceof bix) {
            this.x = (bix) fragment;
        }
    }

    public final void a(String str) {
        super.a(str);
        Object obj = this.w;
        if (!obj.c || obj.b == null) {
            bdf.b(obj, "Connection is not open; ignoring getCallRate operation");
        } else if (obj.a.containsKey(str)) {
            String str2 = "Already an in-flight request for ";
            String valueOf = String.valueOf(str);
            bdf.b(obj, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
        } else {
            bij bij = new bij(obj, str, this);
            obj.a.put(str, bij);
            bij.execute(new Void[0]);
        }
    }

    public final void a(bil bil) {
        if (bil.d != 0 || bil.a) {
            boolean z = bil.a;
            bdf.b((Object) this, "Not showing rate (free? " + z + ") (error? " + bil.d + ")");
            this.g.a(null, null);
            return;
        }
        this.g.a(bil.c, bil.b);
    }

    protected final akz a(View view) {
        akz a = super.a(view);
        a.getMenu().add(0, buf.ln, 0, getString(buf.lS));
        return a;
    }

    public boolean onMenuItemClick(MenuItem menuItem) {
        if (menuItem.getItemId() != buf.ln) {
            return super.onMenuItemClick(menuItem);
        }
        ThemeSettings themeSettings = new ThemeSettings();
        themeSettings.c = gd.c(this, cob.dO);
        themeSettings.b = 1;
        ckf ckf = new ckf();
        ckf.c = "com.google.android.dialer.USER_INITIATED_FEEDBACK_REPORT";
        ckf.a = GoogleHelp.a(this);
        ckf.e = themeSettings;
        this.v = new brd(this).a(new big(this, ckf.a())).a(cka.b).b();
        this.v.b();
        buf.H(this).a(12, this);
        return true;
    }

    protected final void f() {
        boolean a = csn.a(getContentResolver(), "dialer_enable_nearby_places_directory", true);
        boolean a2 = bjy.a();
        if (a || a2) {
            startActivity(new Intent(this, GoogleDialerSettingsActivity.class));
        } else {
            super.f();
        }
    }

    protected void onActivityResult(int i, int i2, Intent intent) {
        if (i != 1000) {
            super.onActivityResult(i, i2, intent);
        } else if (i2 == -1 && this.x != null) {
            this.x.h();
        }
    }
}
