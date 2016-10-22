package com.android.contacts.common.vcard;

import aja;
import ajb;
import ajc;
import ajv;
import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.ComponentName;
import android.content.ServiceConnection;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import buf;
import cob;

/* compiled from: PG */
public class CancelActivity extends Activity implements ServiceConnection {
    private final aja a;
    private int b;
    private String c;
    private int d;

    public CancelActivity() {
        this.a = new aja(this);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Uri data = getIntent().getData();
        this.b = Integer.parseInt(data.getQueryParameter("job_id"));
        this.c = data.getQueryParameter("display_name");
        this.d = Integer.parseInt(data.getQueryParameter("type"));
        showDialog(cob.F);
    }

    protected Dialog onCreateDialog(int i, Bundle bundle) {
        if (i == cob.F) {
            CharSequence string;
            if (this.d == 1) {
                string = getString(buf.ec, new Object[]{this.c});
            } else {
                string = getString(buf.eb, new Object[]{this.c});
            }
            return new Builder(this).setMessage(string).setPositiveButton(17039370, new ajb(this)).setOnCancelListener(this.a).setNegativeButton(17039360, this.a).create();
        } else if (i == cob.G) {
            return new Builder(this).setTitle(buf.ed).setIconAttribute(16843605).setMessage(getString(buf.fi)).setOnCancelListener(this.a).setPositiveButton(17039370, this.a).create();
        } else {
            Log.w("VCardCancel", "Unknown dialog id: " + i);
            return super.onCreateDialog(i, bundle);
        }
    }

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        try {
            ((ajv) iBinder).a.a(new ajc(this.b, this.c), null);
            finish();
        } finally {
            unbindService(this);
        }
    }

    public void onServiceDisconnected(ComponentName componentName) {
    }
}
