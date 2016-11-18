package p000;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.view.ViewConfiguration;

public final class ww {
    private Context f35620a;

    public static ww m41243a(Context context) {
        return new ww(context);
    }

    private ww(Context context) {
        this.f35620a = context;
    }

    public int m41244a() {
        Resources resources = this.f35620a.getResources();
        int b = ix.b(resources);
        int a = ix.a(resources);
        if (ix.a.c(resources) > 600 || b > 600 || ((b > 960 && a > 720) || (b > 720 && a > 960))) {
            return 5;
        }
        if (b >= 500 || ((b > 640 && a > 480) || (b > 480 && a > 640))) {
            return 4;
        }
        if (b >= 360) {
            return 3;
        }
        return 2;
    }

    public boolean m41245b() {
        if (VERSION.SDK_INT < 19 && om.m38703a(ViewConfiguration.get(this.f35620a))) {
            return false;
        }
        return true;
    }

    public int m41246c() {
        return this.f35620a.getResources().getDisplayMetrics().widthPixels / 2;
    }

    public boolean m41247d() {
        return this.f35620a.getResources().getBoolean(gwb.ae);
    }

    public int m41248e() {
        TypedArray obtainStyledAttributes = this.f35620a.obtainStyledAttributes(null, wi.a, gwb.s, 0);
        int layoutDimension = obtainStyledAttributes.getLayoutDimension(wi.j, 0);
        Resources resources = this.f35620a.getResources();
        if (!m41247d()) {
            layoutDimension = Math.min(layoutDimension, resources.getDimensionPixelSize(gwb.ao));
        }
        obtainStyledAttributes.recycle();
        return layoutDimension;
    }

    public boolean m41249f() {
        return this.f35620a.getApplicationInfo().targetSdkVersion < 14;
    }

    public int m41250g() {
        return this.f35620a.getResources().getDimensionPixelSize(gwb.ap);
    }
}
