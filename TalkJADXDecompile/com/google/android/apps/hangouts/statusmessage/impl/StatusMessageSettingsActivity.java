package com.google.android.apps.hangouts.statusmessage.impl;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources.Theme;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import gbe;
import gwb;
import kcw;
import lhj;
import lhk;
import lhl;
import lhn;
import lho;
import lhq;
import lhs;
import liv;

public final class StatusMessageSettingsActivity extends kcw implements lhj<Object>, lhk<StatusMessageSettingsActivityPeer>, lhl {
    private StatusMessageSettingsActivityPeer n;
    private volatile gbe o;
    private volatile Object p;
    private final Object r;
    private final Object s;
    private final liv t;
    private boolean u;

    public StatusMessageSettingsActivity() {
        this.r = new Object();
        this.s = new Object();
        this.t = new liv(this);
    }

    public Class<StatusMessageSettingsActivityPeer> g() {
        return StatusMessageSettingsActivityPeer.class;
    }

    protected void onCreate(Bundle bundle) {
        this.u = true;
        this.t.a();
        try {
            i();
            if (this.n == null) {
                if (this.u) {
                    i();
                    this.n = this.o.c();
                } else {
                    throw new IllegalStateException("createPeer() called outside of onCreate");
                }
            }
            this.o.a().a();
            super.onCreate(bundle);
            this.n.a();
            this.u = false;
        } finally {
            this.t.b();
        }
    }

    protected void onStart() {
        this.t.d();
        try {
            super.onStart();
        } finally {
            this.t.e();
        }
    }

    protected void onPostCreate(Bundle bundle) {
        this.t.f();
        try {
            super.onPostCreate(bundle);
        } finally {
            this.t.g();
        }
    }

    protected void onResume() {
        this.t.h();
        try {
            super.onResume();
        } finally {
            this.t.i();
        }
    }

    protected void onPostResume() {
        this.t.j();
        try {
            super.onPostResume();
        } finally {
            this.t.k();
        }
    }

    protected void onPause() {
        this.t.l();
        try {
            super.onPause();
        } finally {
            this.t.m();
        }
    }

    protected void onStop() {
        this.t.n();
        try {
            super.onStop();
        } finally {
            this.t.o();
        }
    }

    public Object g_() {
        this.t.p();
        try {
            Object g_ = super.g_();
            return g_;
        } finally {
            this.t.q();
        }
    }

    protected void onDestroy() {
        this.t.r();
        try {
            super.onDestroy();
        } finally {
            this.t.s();
        }
    }

    public void onBackPressed() {
        this.t.t();
        try {
            super.onBackPressed();
        } finally {
            this.t.u();
        }
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.t.v();
        try {
            super.onRequestPermissionsResult(i, strArr, iArr);
        } finally {
            this.t.w();
        }
    }

    protected void onActivityResult(int i, int i2, Intent intent) {
        this.t.x();
        try {
            super.onActivityResult(i, i2, intent);
        } finally {
            this.t.y();
        }
    }

    protected void onNewIntent(Intent intent) {
        this.t.a(intent);
        try {
            super.onNewIntent(intent);
        } finally {
            this.t.c();
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        this.t.z();
        try {
            boolean onOptionsItemSelected = super.onOptionsItemSelected(menuItem);
            return onOptionsItemSelected;
        } finally {
            this.t.A();
        }
    }

    public void h() {
        synchronized (this.s) {
            i();
            this.p = ((lhn) this.o).a(new lhq(gwb.O(this.o)));
        }
    }

    private void i() {
        if (this.o == null) {
            synchronized (this.r) {
                if (this.o == null) {
                    try {
                        this.o = (gbe) ((lho) ((lhj) getApplication()).a()).a(new lhs(this));
                    } catch (Throwable e) {
                        throw new IllegalStateException("Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class.", e);
                    }
                }
            }
        }
    }

    protected void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
    }

    protected void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
    }

    protected void onUserLeaveHint() {
        super.onUserLeaveHint();
    }

    protected void f_() {
        super.f_();
    }

    protected boolean a(View view, Menu menu) {
        return super.a(view, menu);
    }

    protected void onRestart() {
        super.onRestart();
    }

    @Deprecated
    protected Dialog onCreateDialog(int i) {
        return super.onCreateDialog(i);
    }

    @Deprecated
    protected Dialog onCreateDialog(int i, Bundle bundle) {
        return super.onCreateDialog(i, bundle);
    }

    @Deprecated
    protected void onPrepareDialog(int i, Dialog dialog) {
        super.onPrepareDialog(i, dialog);
    }

    @Deprecated
    protected void onPrepareDialog(int i, Dialog dialog, Bundle bundle) {
        super.onPrepareDialog(i, dialog, bundle);
    }

    protected void onApplyThemeResource(Theme theme, int i, boolean z) {
        super.onApplyThemeResource(theme, i, z);
    }

    protected void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
    }

    protected void onChildTitleChanged(Activity activity, CharSequence charSequence) {
        super.onChildTitleChanged(activity, charSequence);
    }

    protected void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    public Object a() {
        if (this.p == null) {
            synchronized (this.s) {
                if (this.p == null) {
                    i();
                    this.p = ((lhn) this.o).a(new lhq(gwb.O(this.o)));
                }
            }
        }
        return this.p;
    }
}
