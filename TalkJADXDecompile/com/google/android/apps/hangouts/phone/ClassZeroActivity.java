package com.google.android.apps.hangouts.phone;

import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.telephony.SmsMessage;
import android.text.TextUtils;
import bc;
import bko;
import com.google.android.apps.hangouts.R$drawable;
import ejy;
import ejz;
import eka;
import fde;
import glk;
import iil;
import java.util.ArrayList;
import jca;
import jcu;
import jyy;
import kae;

public class ClassZeroActivity extends jyy {
    private static final boolean f;
    public SmsMessage a;
    public boolean b;
    public AlertDialog c;
    public ArrayList<SmsMessage> d;
    public bko e;
    private final jca g;
    private long h;
    private Handler i;
    private final OnClickListener l;
    private final OnClickListener m;

    public ClassZeroActivity() {
        this.g = new jcu(this, this.k).a(this.j);
        this.a = null;
        this.b = false;
        this.h = 0;
        this.c = null;
        this.d = null;
        this.i = new eka(this);
        this.l = new ejy(this);
        this.m = new ejz(this);
    }

    static {
        kae kae = glk.k;
        f = false;
    }

    private boolean a(Intent intent) {
        byte[] byteArrayExtra = intent.getByteArrayExtra("pdu");
        intent.getStringExtra("format");
        SmsMessage createFromPdu = SmsMessage.createFromPdu(byteArrayExtra);
        if (TextUtils.isEmpty(createFromPdu.getMessageBody())) {
            if (this.d.size() == 0) {
                finish();
            }
            return false;
        }
        this.d.add(createFromPdu);
        return true;
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        getWindow().setBackgroundDrawableResource(R$drawable.e);
        this.e = fde.e(this.g.a());
        if (this.d == null) {
            this.d = new ArrayList();
        }
        if (a(getIntent())) {
            boolean z;
            if (this.d.size() == 1) {
                z = true;
            } else {
                z = false;
            }
            iil.a("Expected condition to be true", z);
            if (this.d.size() == 1) {
                a((SmsMessage) this.d.get(0));
            }
            if (bundle != null) {
                this.h = bundle.getLong("timer_fire", this.h);
            }
        }
    }

    public void a(SmsMessage smsMessage) {
        CharSequence messageBody = smsMessage.getMessageBody();
        this.a = smsMessage;
        this.c = new Builder(this, 2).setMessage(messageBody.toString()).setPositiveButton(bc.ka, this.m).setNegativeButton(17039360, this.l).setCancelable(false).show();
        this.h = SystemClock.uptimeMillis() + 300000;
    }

    protected void onNewIntent(Intent intent) {
        a(intent);
    }

    protected void onStart() {
        super.onStart();
        if (this.h <= SystemClock.uptimeMillis()) {
            this.i.sendEmptyMessage(1);
            return;
        }
        this.i.sendEmptyMessageAtTime(1, this.h);
        if (f) {
            String valueOf = String.valueOf(Long.toString(this.h));
            String valueOf2 = String.valueOf(toString());
            new StringBuilder((String.valueOf(valueOf).length() + 18) + String.valueOf(valueOf2).length()).append("onRestart time = ").append(valueOf).append(" ").append(valueOf2);
        }
    }

    protected void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putLong("timer_fire", this.h);
        if (f) {
            String valueOf = String.valueOf(Long.toString(this.h));
            String valueOf2 = String.valueOf(toString());
            new StringBuilder((String.valueOf(valueOf).length() + 28) + String.valueOf(valueOf2).length()).append("onSaveInstanceState time = ").append(valueOf).append(" ").append(valueOf2);
        }
    }

    protected void onStop() {
        super.onStop();
        this.i.removeMessages(1);
        if (f) {
            String valueOf = String.valueOf(Long.toString(this.h));
            String valueOf2 = String.valueOf(toString());
            new StringBuilder((String.valueOf(valueOf).length() + 15) + String.valueOf(valueOf2).length()).append("onStop time = ").append(valueOf).append(" ").append(valueOf2);
        }
    }
}
