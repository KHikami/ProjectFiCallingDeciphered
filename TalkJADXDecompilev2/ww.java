package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.view.ViewConfiguration;

public final class ww {
    private Context a;

    public static ww a(Context context) {
        return new ww(context);
    }

    private ww(Context context) {
        this.a = context;
    }

    public int a() {
        Resources resources = this.a.getResources();
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

    public boolean b() {
        if (VERSION.SDK_INT < 19 && om.a(ViewConfiguration.get(this.a))) {
            return false;
        }
        return true;
    }

    public int c() {
        return this.a.getResources().getDisplayMetrics().widthPixels / 2;
    }

    public boolean d() {
        return this.a.getResources().getBoolean(gwb.ae);
    }

    public int e() {
        TypedArray obtainStyledAttributes = this.a.obtainStyledAttributes(null, wi.a, gwb.s, 0);
        int layoutDimension = obtainStyledAttributes.getLayoutDimension(wi.j, 0);
        Resources resources = this.a.getResources();
        if (!d()) {
            layoutDimension = Math.min(layoutDimension, resources.getDimensionPixelSize(gwb.ao));
        }
        obtainStyledAttributes.recycle();
        return layoutDimension;
    }

    public boolean f() {
        return this.a.getApplicationInfo().targetSdkVersion < 14;
    }

    public int g() {
        return this.a.getResources().getDimensionPixelSize(gwb.ap);
    }
}
