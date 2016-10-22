package defpackage;

import android.app.Activity;
import android.content.Context;
import com.google.android.apps.hangouts.R$drawable;

/* renamed from: dzd */
public final class dzd extends dyy {
    private jyn f;

    public dzd(jyn jyn) {
        this.f = jyn;
    }

    public int a() {
        return bc.fY;
    }

    public int b() {
        return R$drawable.bT;
    }

    public int c() {
        return 6;
    }

    public void a(Activity activity) {
        gwb.a(this.a, 1601);
        activity.startActivity(gwb.m((Context) activity, this.a.g()));
    }

    public int d() {
        return 2;
    }

    public int e() {
        return 6;
    }
}
