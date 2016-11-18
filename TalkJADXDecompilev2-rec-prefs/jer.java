package p000;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class jer implements kca, kcd, kcn, kcq {
    private final Activity f19946a;
    private final Set<jes> f19947b = new HashSet();
    private jfb<jeh> f19948c;

    public jer(Activity activity, kbu kbu) {
        this.f19946a = activity;
        kbu.m25514a((kcq) this);
    }

    public void mo643a(Bundle bundle) {
        if (bundle != null) {
            this.f19948c = (jfb) bundle.getParcelable("com.google.android.libraries.social.activityresult.ActivityResultManager.Results");
        } else {
            this.f19948c = new jfb(jeh.class);
        }
    }

    public void mo645b(Bundle bundle) {
        bundle.putParcelable("com.google.android.libraries.social.activityresult.ActivityResultManager.Results", this.f19948c);
    }

    void m24054a(jes jes) {
        this.f19947b.add(jes);
    }

    void m24056b(jes jes) {
        this.f19947b.remove(jes);
    }

    void m24052a(int i, Intent intent) {
        this.f19946a.startActivityForResult(intent, i);
    }

    public List<jeh> m24050a(int i) {
        List<jeh> a = this.f19948c.m24073a(Integer.valueOf(i));
        if (a == null) {
            return Collections.emptyList();
        }
        return a;
    }

    public void mo3488a(int i, int i2, Intent intent) {
        Parcelable jeh = new jeh(i, i2, intent);
        Object obj = null;
        for (jes a : this.f19947b) {
            Object obj2;
            if (a.mo3485a(jeh)) {
                obj2 = 1;
            } else {
                obj2 = obj;
            }
            obj = obj2;
        }
        if (obj == null) {
            this.f19948c.m24074a(Integer.valueOf(i), jeh);
        }
    }
}
