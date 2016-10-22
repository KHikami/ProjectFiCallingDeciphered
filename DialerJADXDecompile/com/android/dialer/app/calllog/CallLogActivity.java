package com.android.dialer.app.calllog;

import add;
import alf;
import als;
import alt;
import amo;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import ang;
import aq;
import buf;
import cob;
import com.android.contacts.common.list.ViewPagerTabs;
import com.android.dialer.app.DialtactsActivity;
import lm;
import pl;

/* compiled from: PG */
public class CallLogActivity extends alf implements lm {
    public als g;
    public amo h;
    public String[] i;
    private ViewPager j;
    private ViewPagerTabs k;
    private boolean l;

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            add.a.a((int) motionEvent.getRawX(), (int) motionEvent.getRawY());
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    protected void onCreate(Bundle bundle) {
        int i;
        super.onCreate(bundle);
        setContentView(buf.hB);
        getWindow().setBackgroundDrawable(null);
        pl a = e().a();
        a.a(true);
        a.b(true);
        a.c(true);
        a.a(0.0f);
        Intent intent = getIntent();
        if (intent == null || intent.getIntExtra("android.provider.extra.CALL_TYPE_FILTER", -1) != 3) {
            i = 0;
        } else {
            i = 1;
        }
        this.i = new String[2];
        this.i[0] = getString(cob.bn);
        this.i[1] = getString(cob.bt);
        this.j = (ViewPager) findViewById(aq.z);
        this.g = new als(this, getFragmentManager());
        this.j.a(this.g);
        this.j.c(1);
        this.j.d = this;
        this.k = (ViewPagerTabs) findViewById(aq.bH);
        this.k.a(this.j);
        this.j.b(i);
    }

    protected void onResume() {
        this.l = true;
        super.onResume();
        int i = this.j.c;
        f();
    }

    protected void onPause() {
        this.l = false;
        super.onPause();
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(buf.hR, menu);
        return true;
    }

    public boolean onPrepareOptionsMenu(Menu menu) {
        boolean z = false;
        MenuItem findItem = menu.findItem(aq.X);
        if (!(this.h == null || findItem == null)) {
            alt alt = this.h.c;
            if (alt != null) {
                boolean z2;
                if (alt.n || alt.a() != 0) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (!z2) {
                    z = true;
                }
            }
            findItem.setVisible(z);
        }
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (!this.u) {
            return true;
        }
        if (menuItem.getItemId() == 16908332) {
            Intent intent = new Intent(this, DialtactsActivity.class);
            intent.addFlags(67108864);
            startActivity(intent);
            return true;
        } else if (menuItem.getItemId() != aq.X) {
            return super.onOptionsItemSelected(menuItem);
        } else {
            new ang().show(getFragmentManager(), "deleteCallLog");
            return true;
        }
    }

    public final void a(int i, float f, int i2) {
        this.k.a(i, f, i2);
    }

    public final void a(int i) {
        if (this.l) {
            f();
        }
        this.k.a(i);
    }

    public final void a_(int i) {
        ViewPagerTabs viewPagerTabs = this.k;
    }

    private final void f() {
        buf.H(this).a(8, this);
    }
}
