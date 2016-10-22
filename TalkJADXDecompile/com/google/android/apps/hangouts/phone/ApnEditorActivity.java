package com.google.android.apps.hangouts.phone;

import android.app.ActionBar;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.OnSharedPreferenceChangeListener;
import android.content.res.Resources;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.preference.EditTextPreference;
import android.preference.Preference;
import android.preference.Preference.OnPreferenceChangeListener;
import android.preference.PreferenceActivity;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import bc;
import bjs;
import com.google.android.apps.hangouts.R$drawable;
import eit;
import eiu;
import eiv;
import glq;
import gwb;
import wi;

public class ApnEditorActivity extends PreferenceActivity implements OnSharedPreferenceChangeListener, OnPreferenceChangeListener {
    public static final String[] i;
    private static String k;
    public EditTextPreference a;
    public EditTextPreference b;
    public EditTextPreference c;
    public String d;
    public String e;
    public Cursor f;
    public boolean g;
    public String h;
    public SQLiteDatabase j;
    private EditTextPreference l;
    private EditTextPreference m;
    private EditTextPreference n;
    private boolean o;
    private Resources p;

    static {
        i = new String[]{"_id", "name", "mmsc", "mcc", "mnc", "numeric", "mmsproxy", "mmsport", "type"};
    }

    protected void onCreate(Bundle bundle) {
        boolean z;
        super.onCreate(bundle);
        addPreferencesFromResource(gwb.iG);
        k = getResources().getString(bc.n);
        this.l = (EditTextPreference) findPreference("apn_name");
        this.b = (EditTextPreference) findPreference("apn_mms_proxy");
        this.c = (EditTextPreference) findPreference("apn_mms_port");
        this.a = (EditTextPreference) findPreference("apn_mmsc");
        this.m = (EditTextPreference) findPreference("apn_mcc");
        this.n = (EditTextPreference) findPreference("apn_mnc");
        this.p = getResources();
        Intent intent = getIntent();
        this.o = bundle == null;
        this.h = intent.getStringExtra("apn_row_id");
        if (this.h == null) {
            z = true;
        } else {
            z = false;
        }
        this.g = z;
        this.j = bjs.a(getApplicationContext());
        if (this.g) {
            a();
        } else {
            new eit(this).execute(new Void[]{null});
        }
        ActionBar actionBar = getActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
    }

    public void onDestroy() {
        super.onDestroy();
        if (this.f != null) {
            this.f.close();
            this.f = null;
        }
    }

    public void onResume() {
        super.onResume();
        getPreferenceScreen().getSharedPreferences().registerOnSharedPreferenceChangeListener(this);
    }

    public void onPause() {
        getPreferenceScreen().getSharedPreferences().unregisterOnSharedPreferenceChangeListener(this);
        super.onPause();
    }

    public void a() {
        if (this.g) {
            this.m.setText(null);
            this.n.setText(null);
            String k = glq.k(this);
            if (k != null && k.length() > 4) {
                String substring = k.substring(0, 3);
                k = k.substring(3);
                this.m.setText(substring);
                this.n.setText(k);
                this.d = k;
                this.e = substring;
            }
            this.l.setText(null);
            this.b.setText(null);
            this.c.setText(null);
            this.a.setText(null);
        } else if (this.o) {
            this.o = false;
            this.l.setText(this.f.getString(1));
            this.b.setText(this.f.getString(6));
            this.c.setText(this.f.getString(7));
            this.a.setText(this.f.getString(2));
            this.m.setText(this.f.getString(3));
            this.n.setText(this.f.getString(4));
        }
        this.l.setSummary(b(this.l.getText()));
        this.b.setSummary(b(this.b.getText()));
        this.c.setSummary(b(this.c.getText()));
        this.a.setSummary(b(this.a.getText()));
        this.m.setSummary(b(this.m.getText()));
        this.n.setSummary(b(this.n.getText()));
    }

    public boolean onPreferenceChange(Preference preference, Object obj) {
        preference.getKey();
        return true;
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        if (!this.g) {
            menu.add(0, 1, 0, bc.fS).setIcon(R$drawable.bo);
        }
        menu.add(0, 2, 0, bc.gh).setIcon(17301582);
        menu.add(0, 3, 0, bc.fV).setIcon(17301560);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case wi.j /*1*/:
                new eiv(this).execute(new Void[]{null});
                finish();
                return true;
            case wi.l /*2*/:
                if (!a(false)) {
                    return true;
                }
                finish();
                return true;
            case wi.z /*3*/:
                finish();
                return true;
            case 16908332:
                onBackPressed();
                return true;
            default:
                return super.onOptionsItemSelected(menuItem);
        }
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        switch (i) {
            case wi.h /*4*/:
                if (a(false)) {
                    finish();
                }
                return true;
            default:
                return super.onKeyDown(i, keyEvent);
        }
    }

    protected void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (a(true) && this.f != null) {
            bundle.putInt("pos", this.f.getInt(0));
        }
    }

    private boolean a(boolean z) {
        String a = a(this.l.getText());
        String a2 = a(this.m.getText());
        String a3 = a(this.n.getText());
        if (b() == null || z) {
            new eiu(this, a, a2, a3).execute(new Void[]{null});
            return true;
        }
        showDialog(0);
        return false;
    }

    private String b() {
        String a = a(this.l.getText());
        String a2 = a(this.m.getText());
        String a3 = a(this.n.getText());
        if (a.length() <= 0) {
            return this.p.getString(bc.cH);
        }
        if (a2.length() != 3) {
            return this.p.getString(bc.cJ);
        }
        if ((a3.length() & 65534) != 2) {
            return this.p.getString(bc.cK);
        }
        return null;
    }

    protected Dialog onCreateDialog(int i) {
        if (i != 0) {
            return super.onCreateDialog(i);
        }
        return new Builder(this).setPositiveButton(17039370, null).setMessage(b()).create();
    }

    protected void onPrepareDialog(int i, Dialog dialog) {
        super.onPrepareDialog(i, dialog);
        if (i == 0) {
            CharSequence b = b();
            if (b != null) {
                ((AlertDialog) dialog).setMessage(b);
            }
        }
    }

    private static String b(String str) {
        if (str == null || str.length() == 0) {
            return k;
        }
        return str;
    }

    public static String a(String str) {
        if (str == null || str.equals(k)) {
            return "";
        }
        return str;
    }

    public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        Preference findPreference = findPreference(str);
        if (findPreference != null) {
            findPreference.setSummary(b(sharedPreferences.getString(str, "")));
        }
    }
}
