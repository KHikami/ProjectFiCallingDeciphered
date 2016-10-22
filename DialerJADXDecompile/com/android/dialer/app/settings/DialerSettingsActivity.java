package com.android.dialer.app.settings;

import abw;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.UserManager;
import android.preference.PreferenceActivity.Header;
import android.preference.PreferenceManager;
import android.provider.Settings.System;
import android.telephony.TelephonyManager;
import android.view.MenuItem;
import android.widget.Toast;
import aq;
import arh;
import ari;
import arj;
import buf;
import cob;
import com.android.dialer.app.UsedByReflection;
import java.util.List;

@UsedByReflection
/* compiled from: PG */
public class DialerSettingsActivity extends arh {
    private boolean b;

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        PreferenceManager.getDefaultSharedPreferences(this);
    }

    protected void onResume() {
        super.onResume();
        if (this.b != buf.x((Context) this)) {
            invalidateHeaders();
        }
    }

    public void onBuildHeaders(List list) {
        Header header;
        Header header2 = new Header();
        header2.titleRes = cob.cd;
        header2.fragment = ari.class.getName();
        list.add(header2);
        header2 = new Header();
        header2.titleRes = cob.cX;
        header2.fragment = arj.class.getName();
        header2.id = (long) aq.br;
        list.add(header2);
        if (abw.g()) {
            header2 = new Header();
            Intent intent = new Intent("android.telecom.action.SHOW_RESPOND_VIA_SMS_SETTINGS");
            header2.titleRes = cob.cI;
            header2.intent = intent;
            list.add(header2);
        }
        TelephonyManager telephonyManager = (TelephonyManager) getSystemService("phone");
        boolean isSystemUser = ((UserManager) getSystemService(UserManager.class)).isSystemUser();
        Intent intent2;
        if (isSystemUser && buf.a(telephonyManager) <= 1) {
            header = new Header();
            intent2 = new Intent("android.telecom.action.SHOW_CALL_SETTINGS");
            intent2.setFlags(67108864);
            header.titleRes = cob.by;
            header.intent = intent2;
            list.add(header);
        } else if (VERSION.SDK_INT >= 24 || isSystemUser) {
            header = new Header();
            intent2 = new Intent("android.telecom.action.CHANGE_PHONE_ACCOUNTS");
            intent2.setFlags(67108864);
            header.titleRes = cob.cF;
            header.intent = intent2;
            list.add(header);
        }
        if (buf.B((Context) this)) {
            header = new Header();
            header.titleRes = cob.cm;
            header.intent = buf.z((Context) this);
            list.add(header);
            this.b = buf.x((Context) this);
        }
        if (!isSystemUser) {
            return;
        }
        if (buf.b(telephonyManager) || buf.c(telephonyManager)) {
            header2 = new Header();
            intent = new Intent("android.telecom.action.SHOW_CALL_ACCESSIBILITY_SETTINGS");
            header2.titleRes = cob.aT;
            header2.intent = intent;
            list.add(header2);
        }
    }

    public void onHeaderClick(Header header, int i) {
        if (header.id != ((long) aq.br) || System.canWrite(this)) {
            super.onHeaderClick(header, i);
            return;
        }
        Toast.makeText(this, getResources().getString(cob.dg), 0).show();
        startActivity(new Intent("android.settings.SOUND_SETTINGS"));
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return false;
        }
        onBackPressed();
        return true;
    }

    protected boolean isValidFragment(String str) {
        return true;
    }

    public void onBackPressed() {
        if (this.a) {
            super.onBackPressed();
        }
    }
}
