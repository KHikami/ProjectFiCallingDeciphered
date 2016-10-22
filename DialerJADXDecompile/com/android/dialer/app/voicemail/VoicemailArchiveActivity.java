package com.android.dialer.app.voicemail;

import alf;
import alt;
import alz;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.Cursor;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.MenuItem;
import aq;
import arr;
import asp;
import ata;
import avq;
import avs;
import awg;
import awt;
import buf;
import cob;
import com.android.dialer.app.DialtactsActivity;
import com.android.dialer.app.widget.EmptyContentView;
import pl;
import xr;

/* compiled from: PG */
public class VoicemailArchiveActivity extends alf implements alz, avs {
    private RecyclerView g;
    private xr h;
    private EmptyContentView i;
    private alt j;
    private asp k;
    private avq l;

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (!this.u) {
            return true;
        }
        switch (menuItem.getItemId()) {
            case 16908332:
                Intent intent = new Intent(this, DialtactsActivity.class);
                intent.addFlags(67108864);
                startActivity(intent);
                return true;
            default:
                return super.onOptionsItemSelected(menuItem);
        }
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(buf.hC);
        getWindow().setBackgroundDrawable(null);
        pl a = e().a();
        a.a(true);
        a.b(true);
        a.c(true);
        a.a(0.0f);
        this.l = new avq(this, getContentResolver(), this);
        if (arr.a == null) {
            arr.a = new arr(this);
        }
        arr.a.a((Activity) this, bundle);
        this.k = arr.a;
        this.g = (RecyclerView) findViewById(aq.ba);
        this.g.n = true;
        this.h = new xr(this);
        this.g.a(this.h);
        this.i = (EmptyContentView) findViewById(aq.aq);
        this.i.a(cob.dz);
        this.i.b(cob.ak);
        this.j = buf.m((Context) this).a(this, this, new awt(this, buf.g((Context) this)), this.k, 2);
        this.g.a(this.j);
        this.l.startQuery(60, null, awg.a, null, "archived_by_user = 1", null, "date DESC");
    }

    protected void onPause() {
        this.k.b();
        this.j.d();
        super.onPause();
    }

    public void onResume() {
        super.onResume();
        this.j.c();
        ata ata = this.k.o.b;
        ata.e.registerReceiver(ata.b, new IntentFilter("android.intent.action.HEADSET_PLUG"));
    }

    public void onDestroy() {
        this.k.c();
        this.j.d(null);
        super.onDestroy();
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.k.a(bundle);
    }

    public final void a() {
        this.l.startQuery(60, null, awg.a, null, "archived_by_user = 1", null, "date DESC");
    }

    public final void b(Cursor cursor) {
    }

    public final void c(Cursor cursor) {
    }

    public final void d(Cursor cursor) {
    }

    public final boolean a(Cursor cursor) {
        boolean z;
        int i;
        int i2 = 0;
        this.j.c(cursor);
        if (cursor == null || cursor.getCount() <= 0) {
            z = false;
        } else {
            z = true;
        }
        RecyclerView recyclerView = this.g;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        recyclerView.setVisibility(i);
        EmptyContentView emptyContentView = this.i;
        if (z) {
            i2 = 8;
        }
        emptyContentView.setVisibility(i2);
        return true;
    }
}
