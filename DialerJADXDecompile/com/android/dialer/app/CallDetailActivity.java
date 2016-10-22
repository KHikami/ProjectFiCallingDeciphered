package com.android.dialer.app;

import aaz;
import abw;
import add;
import aic;
import akm;
import ako;
import ala;
import ame;
import amf;
import amg;
import amm;
import amn;
import android.content.ContentUris;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.text.BidiFormatter;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ListView;
import android.widget.QuickContactBadge;
import android.widget.TextView;
import ane;
import aq;
import aup;
import avm;
import avn;
import awt;
import axk;
import buf;
import cob;
import pz;

@UsedByReflection
/* compiled from: PG */
public class CallDetailActivity extends pz implements OnMenuItemClickListener, OnClickListener {
    private static final String C;
    public View A;
    public aup B;
    private Uri D;
    private amm E;
    public final avm g;
    public String h;
    public Context i;
    public awt j;
    public aic k;
    public ane l;
    public aaz m;
    public BidiFormatter n;
    public LayoutInflater o;
    public Resources p;
    public ala q;
    public String r;
    public ListView s;
    public QuickContactBadge t;
    public TextView u;
    public TextView v;
    public TextView w;
    public View x;
    public View y;
    public View z;

    public CallDetailActivity() {
        this.g = avn.a();
        this.n = BidiFormatter.getInstance();
        this.r = "";
        this.E = new akm(this);
    }

    static {
        C = CallDetailActivity.class.getSimpleName();
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.i = this;
        this.p = getResources();
        this.j = new awt(this, buf.g((Context) this));
        this.k = new aic(this.i);
        this.l = new ane(getResources());
        this.B = new aup(this.i);
        this.D = (Uri) getIntent().getParcelableExtra("EXTRA_VOICEMAIL_URI");
        e().a().b(true);
        setContentView(buf.hx);
        this.o = (LayoutInflater) getSystemService("layout_inflater");
        this.s = (ListView) findViewById(aq.av);
        this.s.addHeaderView(this.o.inflate(buf.hz, null));
        this.s.addFooterView(this.o.inflate(buf.hy, null), null, false);
        this.t = (QuickContactBadge) findViewById(aq.aZ);
        this.t.setOverlay(null);
        if (abw.a()) {
            this.t.setPrioritizedMimeType("vnd.android.cursor.item/phone_v2");
        }
        this.u = (TextView) findViewById(aq.H);
        this.v = (TextView) findViewById(aq.I);
        this.w = (TextView) findViewById(aq.aP);
        this.m = aaz.a((Context) this);
        this.x = findViewById(aq.q);
        this.x.setOnClickListener(new ako(this));
        this.y = findViewById(aq.t);
        this.y.setOnClickListener(this);
        this.z = findViewById(aq.u);
        this.z.setOnClickListener(this);
        this.A = findViewById(aq.s);
        this.A.setOnClickListener(this);
        if (getIntent().getBooleanExtra("EXTRA_FROM_NOTIFICATION", false)) {
            sendBroadcast(new Intent("android.intent.action.CLOSE_SYSTEM_DIALOGS"));
        }
    }

    public void onResume() {
        super.onResume();
        this.k.a("android.contacts.DISPLAY_ORDER");
        f();
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            add.a.a((int) motionEvent.getRawX(), (int) motionEvent.getRawY());
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void f() {
        amm amm = this.E;
        Uri[] h = h();
        if (ame.b == null) {
            ame.b = avn.b();
        }
        avm avm = ame.b;
        amn amn = amn.GET_CALL_DETAILS;
        avm.a(new amf(h, this, amm), new Void[0]);
    }

    private final Uri[] h() {
        int i = 0;
        if (getIntent().getData() != null) {
            return new Uri[]{getIntent().getData()};
        }
        long[] longArrayExtra = getIntent().getLongArrayExtra("EXTRA_CALL_LOG_IDS");
        int length = longArrayExtra == null ? 0 : longArrayExtra.length;
        Uri[] uriArr = new Uri[length];
        while (i < length) {
            uriArr[i] = ContentUris.withAppendedId(axk.e(this), longArrayExtra[i]);
            i++;
        }
        return uriArr;
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        MenuItem add = menu.add(0, aq.v, 0, cob.bi);
        add.setIcon(cob.as);
        add.setShowAsAction(1);
        add.setOnMenuItemClickListener(this);
        return super.onCreateOptionsMenu(menu);
    }

    public boolean onMenuItemClick(MenuItem menuItem) {
        if (menuItem.getItemId() == aq.v) {
            boolean z;
            if (this.D != null) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                ame.a(this, this.D, this.E);
            } else {
                StringBuilder stringBuilder = new StringBuilder();
                for (Uri uri : h()) {
                    if (stringBuilder.length() != 0) {
                        stringBuilder.append(",");
                    }
                    stringBuilder.append(ContentUris.parseId(uri));
                }
                String stringBuilder2 = stringBuilder.toString();
                amm amm = this.E;
                if (ame.b == null) {
                    ame.b = avn.b();
                }
                avm avm = ame.b;
                amn amn = amn.DELETE_CALL;
                avm.a(new amg(this, stringBuilder2, amm), new Void[0]);
            }
        }
        return true;
    }

    public void onClick(View view) {
        int id = view.getId();
        if (id == aq.s) {
            buf.a(this.i, null, this.h, true);
        } else if (id == aq.t) {
            buf.d(this.i, new Intent("android.intent.action.DIAL", buf.e(g())));
        } else {
            String str = C;
            String valueOf = String.valueOf(view);
            Log.wtf(str, new StringBuilder(String.valueOf(valueOf).length() + 30).append("Unexpected onClick event from ").append(valueOf).toString());
        }
    }

    public final String g() {
        String valueOf = String.valueOf(this.h);
        String valueOf2 = String.valueOf(this.r);
        return valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
    }
}
