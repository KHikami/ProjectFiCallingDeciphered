package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: jer */
public class jer implements kca, kcd, kcn, kcq {
    private final Activity a;
    private final Set<jes> b;
    private jfb<jeh> c;

    public jer(Activity activity, kbu kbu) {
        this.b = new HashSet();
        this.a = activity;
        kbu.a((kcq) this);
    }

    public void a(Bundle bundle) {
        if (bundle != null) {
            this.c = (jfb) bundle.getParcelable("com.google.android.libraries.social.activityresult.ActivityResultManager.Results");
        } else {
            this.c = new jfb(jeh.class);
        }
    }

    public void b(Bundle bundle) {
        bundle.putParcelable("com.google.android.libraries.social.activityresult.ActivityResultManager.Results", this.c);
    }

    void a(jes jes) {
        this.b.add(jes);
    }

    void b(jes jes) {
        this.b.remove(jes);
    }

    void a(int i, Intent intent) {
        this.a.startActivityForResult(intent, i);
    }

    public List<jeh> a(int i) {
        List<jeh> a = this.c.a(Integer.valueOf(i));
        if (a == null) {
            return Collections.emptyList();
        }
        return a;
    }

    public void a(int i, int i2, Intent intent) {
        Parcelable jeh = new jeh(i, i2, intent);
        Object obj = null;
        for (jes a : this.b) {
            Object obj2;
            if (a.a(jeh)) {
                obj2 = 1;
            } else {
                obj2 = obj;
            }
            obj = obj2;
        }
        if (obj == null) {
            this.c.a(Integer.valueOf(i), jeh);
        }
    }
}
