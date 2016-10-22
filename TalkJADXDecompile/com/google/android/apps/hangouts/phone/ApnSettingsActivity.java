package com.google.android.apps.hangouts.phone;

import android.app.ActionBar;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.os.HandlerThread;
import android.preference.Preference;
import android.preference.Preference.OnPreferenceChangeListener;
import android.preference.PreferenceActivity;
import android.preference.PreferenceScreen;
import android.view.Menu;
import android.view.MenuItem;
import bc;
import bjs;
import com.google.android.apps.hangouts.R$drawable;
import eix;
import eiy;
import eiz;
import eja;
import fzo;
import glq;
import gwb;
import wi;

public class ApnSettingsActivity extends PreferenceActivity implements OnPreferenceChangeListener {
    public static final String[] a;
    public static boolean b;
    public static final ContentValues d;
    public static final ContentValues e;
    public static final String[] g;
    public String c;
    public SQLiteDatabase f;
    private eja h;
    private eiz i;
    private HandlerThread j;

    static {
        a = new String[]{"_id", "name", "apn", "type"};
        ContentValues contentValues = new ContentValues(1);
        d = contentValues;
        contentValues.putNull("current");
        contentValues = new ContentValues(1);
        e = contentValues;
        contentValues.put("current", "2");
        g = new String[]{"2"};
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f = bjs.a(getApplicationContext());
        addPreferencesFromResource(gwb.iH);
        getListView().setItemsCanFocus(true);
    }

    protected void onResume() {
        super.onResume();
        if (b) {
            showDialog(1001);
        } else {
            a();
        }
    }

    protected void onPause() {
        super.onPause();
    }

    protected void onDestroy() {
        super.onDestroy();
        if (this.j != null) {
            this.j.quit();
        }
    }

    public void a() {
        new eix(this, fzo.a(glq.k(this))).execute(new Void[]{null});
        ActionBar actionBar = getActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        menu.add(0, 1, 0, getResources().getString(bc.ge)).setIcon(R$drawable.bI).setShowAsAction(1);
        menu.add(0, 2, 0, getResources().getString(bc.gg)).setIcon(17301589);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case wi.j /*1*/:
                startActivity(gwb.y(null));
                return true;
            case wi.l /*2*/:
                showDialog(1001);
                b = true;
                if (this.h == null) {
                    this.h = new eja(this);
                }
                if (this.i == null || this.j == null) {
                    this.j = new HandlerThread("Restore default APN Handler: Process Thread");
                    this.j.start();
                    this.i = new eiz(this.f, this.j.getLooper(), this.h);
                }
                this.i.sendEmptyMessage(1);
                return true;
            case 16908332:
                onBackPressed();
                return true;
            default:
                return super.onOptionsItemSelected(menuItem);
        }
    }

    public boolean onPreferenceTreeClick(PreferenceScreen preferenceScreen, Preference preference) {
        startActivity(gwb.y(preference.getKey()));
        return true;
    }

    public boolean onPreferenceChange(Preference preference, Object obj) {
        if (obj instanceof String) {
            String str = (String) obj;
            this.c = str;
            new eiy(this, str).execute(new Void[]{null});
        }
        return true;
    }

    protected Dialog onCreateDialog(int i) {
        if (i != 1001) {
            return null;
        }
        Dialog progressDialog = new ProgressDialog(this);
        progressDialog.setMessage(getResources().getString(bc.jR));
        progressDialog.setCancelable(false);
        return progressDialog;
    }

    protected void onPrepareDialog(int i, Dialog dialog) {
        if (i == 1001) {
            getPreferenceScreen().setEnabled(false);
        }
    }
}
