package p000;

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
    private final Activity f21278a;
    private jca f21279b;
    private uq f21280c;
    private jug f21281d;
    private boolean f21282e;
    private ArrayList<C0000a> f21283f;

    private jyj(Activity activity, kbu kbu) {
        this.f21282e = true;
        this.f21283f = new ArrayList();
        this.f21278a = activity;
        kbu.m25514a((kcq) this);
    }

    public jyj(uq uqVar, kbu kbu) {
        this((Activity) uqVar, kbu);
        this.f21280c = uqVar;
    }

    public void mo479a(Context context, jyn jyn, Bundle bundle) {
        this.f21281d = (jug) jyn.m25433b(this.f21278a, jug.class);
        this.f21279b = (jca) jyn.m25454b(jca.class);
    }

    public void b_(Bundle bundle) {
        if (this.f21280c != null) {
            tp g = this.f21280c.m8308g();
            if (g != null) {
                g.b(this.f21282e);
            }
        } else if (VERSION.SDK_INT >= 11) {
            ActionBar actionBar = this.f21278a.getActionBar();
            if (actionBar != null) {
                actionBar.setDisplayHomeAsUpEnabled(this.f21282e);
            }
        }
    }

    public boolean mo671a(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            return m25417a();
        }
        return false;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m25417a() {
        for (int size = this.f21283f.size() - 1; size >= 0; size--) {
            if (((C0000a) this.f21283f.get(size)).m24u()) {
                break;
            }
        }
        if (jyh.m25413a(this.f21278a)) {
            this.f21278a.onBackPressed();
        } else {
            if (this.f21280c == null) {
                if (VERSION.SDK_INT >= 16 && m25418a(this.f21278a)) {
                }
            }
            this.f21278a.onBackPressed();
        }
        return true;
    }

    private boolean m25419a(uq uqVar) {
        Intent H_ = uqVar.H_();
        if (H_ == null && this.f21281d != null) {
            jug jug = this.f21281d;
            if (this.f21279b != null) {
                this.f21279b.mo2317a();
            }
            H_ = jug.m25213a();
        }
        if (H_ == null || !uqVar.a_(H_)) {
            return false;
        }
        hq a = hq.m20483a((Context) uqVar);
        uqVar.m8303a(a);
        if (a.m20485a() == 0) {
            a.m20489a(H_);
        }
        a.m20491b();
        try {
            cq.m10681a(uqVar);
        } catch (IllegalStateException e) {
            uqVar.finish();
        }
        return true;
    }

    private boolean m25418a(Activity activity) {
        Intent parentActivityIntent = activity.getParentActivityIntent();
        if (parentActivityIntent == null && this.f21281d != null) {
            jug jug = this.f21281d;
            if (this.f21279b != null) {
                this.f21279b.mo2317a();
            }
            parentActivityIntent = jug.m25213a();
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
