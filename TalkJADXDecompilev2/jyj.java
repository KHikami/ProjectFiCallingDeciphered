package defpackage;

import android.app.ActionBar;
import android.app.Activity;
import android.app.TaskStackBuilder;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.MenuItem;
import java.util.ArrayList;

public final class jyj implements jza, kaw, kci, kcq {
    private final Activity a;
    private jca b;
    private uq c;
    private jug d;
    private boolean e;
    private ArrayList<a> f;

    private jyj(Activity activity, kbu kbu) {
        this.e = true;
        this.f = new ArrayList();
        this.a = activity;
        kbu.a((kcq) this);
    }

    public jyj(uq uqVar, kbu kbu) {
        this((Activity) uqVar, kbu);
        this.c = uqVar;
    }

    public void a(Context context, jyn jyn, Bundle bundle) {
        this.d = (jug) jyn.b(this.a, jug.class);
        this.b = (jca) jyn.b(jca.class);
    }

    public void b_(Bundle bundle) {
        if (this.c != null) {
            tp g = this.c.g();
            if (g != null) {
                g.b(this.e);
            }
        } else if (VERSION.SDK_INT >= 11) {
            ActionBar actionBar = this.a.getActionBar();
            if (actionBar != null) {
                actionBar.setDisplayHomeAsUpEnabled(this.e);
            }
        }
    }

    public boolean a(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            return a();
        }
        return false;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean a() {
        /*
        r3 = this;
        r2 = 1;
        r0 = r3.f;
        r0 = r0.size();
        r0 = r0 + -1;
        r1 = r0;
    L_0x000a:
        if (r1 < 0) goto L_0x001f;
    L_0x000c:
        r0 = r3.f;
        r0 = r0.get(r1);
        r0 = (defpackage.a) r0;
        r0 = r0.u();
        if (r0 == 0) goto L_0x001b;
    L_0x001a:
        return r2;
    L_0x001b:
        r0 = r1 + -1;
        r1 = r0;
        goto L_0x000a;
    L_0x001f:
        r0 = r3.a;
        r0 = defpackage.jyh.a(r0);
        if (r0 == 0) goto L_0x002d;
    L_0x0027:
        r0 = r3.a;
        r0.onBackPressed();
        goto L_0x001a;
    L_0x002d:
        r0 = r3.c;
        if (r0 == 0) goto L_0x003f;
    L_0x0031:
        r0 = r3.c;
        r0 = r3.a(r0);
        if (r0 != 0) goto L_0x001a;
    L_0x0039:
        r0 = r3.a;
        r0.onBackPressed();
        goto L_0x001a;
    L_0x003f:
        r0 = android.os.Build.VERSION.SDK_INT;
        r1 = 16;
        if (r0 < r1) goto L_0x0039;
    L_0x0045:
        r0 = r3.a;
        r0 = r3.a(r0);
        if (r0 == 0) goto L_0x0039;
    L_0x004d:
        goto L_0x001a;
        */
        throw new UnsupportedOperationException("Method not decompiled: jyj.a():boolean");
    }

    private boolean a(uq uqVar) {
        Intent H_ = uqVar.H_();
        if (H_ == null && this.d != null) {
            jug jug = this.d;
            if (this.b != null) {
                this.b.a();
            }
            H_ = jug.a();
        }
        if (H_ == null || !uqVar.a_(H_)) {
            return false;
        }
        hq a = hq.a((Context) uqVar);
        uqVar.a(a);
        if (a.a() == 0) {
            a.a(H_);
        }
        a.b();
        try {
            cq.a(uqVar);
        } catch (IllegalStateException e) {
            uqVar.finish();
        }
        return true;
    }

    private boolean a(Activity activity) {
        Intent parentActivityIntent = activity.getParentActivityIntent();
        if (parentActivityIntent == null && this.d != null) {
            jug jug = this.d;
            if (this.b != null) {
                this.b.a();
            }
            parentActivityIntent = jug.a();
        }
        if (parentActivityIntent == null || !activity.shouldUpRecreateTask(parentActivityIntent)) {
            return false;
        }
        TaskStackBuilder create = TaskStackBuilder.create(activity);
        activity.onCreateNavigateUpTaskStack(create);
        activity.onPrepareNavigateUpTaskStack(create);
        create.startActivities();
        try {
            activity.finishAffinity();
        } catch (IllegalStateException e) {
            activity.finish();
        }
        return true;
    }
}
