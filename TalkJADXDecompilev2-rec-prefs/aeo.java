package p000;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.IBinder;
import android.view.animation.Interpolator;
import java.util.ArrayList;

public class aeo {
    public static final int f403h = 2130838921;
    public int f404a;
    public int f405b;
    public int f406c;
    public int f407d;
    public Interpolator f408e;
    public boolean f409f;
    public int f410g;
    public final Intent f411i;
    public ArrayList<Bundle> f412j;
    public Bundle f413k;
    public ArrayList<Bundle> f414l;

    public boolean m838a() {
        return this.f407d >= 0;
    }

    public aeo() {
        this(null);
    }

    public aeo(ajk ajk) {
        IBinder iBinder = null;
        this.f411i = new Intent("android.intent.action.VIEW");
        this.f412j = null;
        this.f413k = null;
        this.f414l = null;
        if (ajk != null) {
            this.f411i.setPackage(ajk.m2640b().getPackageName());
        }
        Bundle bundle = new Bundle();
        String str = "android.support.customtabs.extra.SESSION";
        if (ajk != null) {
            iBinder = ajk.m2639a();
        }
        gwb.m1764a(bundle, str, iBinder);
        this.f411i.putExtras(bundle);
    }

    public aeo m834a(int i) {
        this.f411i.putExtra("android.support.customtabs.extra.TOOLBAR_COLOR", i);
        return this;
    }

    public aeo m837a(boolean z) {
        this.f411i.putExtra("android.support.customtabs.extra.TITLE_VISIBILITY", 1);
        return this;
    }

    public aeo m836a(Bitmap bitmap, String str, PendingIntent pendingIntent, boolean z) {
        Bundle bundle = new Bundle();
        bundle.putInt("android.support.customtabs.customaction.ID", 0);
        bundle.putParcelable("android.support.customtabs.customaction.ICON", bitmap);
        bundle.putString("android.support.customtabs.customaction.DESCRIPTION", str);
        bundle.putParcelable("android.support.customtabs.customaction.PENDING_INTENT", pendingIntent);
        this.f411i.putExtra("android.support.customtabs.extra.ACTION_BUTTON_BUNDLE", bundle);
        this.f411i.putExtra("android.support.customtabs.extra.TINT_ACTION_BUTTON", false);
        return this;
    }

    public aeo m835a(Context context, int i, int i2) {
        this.f413k = cu.m11010a(context, i, i2).mo1435a();
        return this;
    }

    public aeo m839b(Context context, int i, int i2) {
        this.f411i.putExtra("android.support.customtabs.extra.EXIT_ANIMATION_BUNDLE", cu.m11010a(context, i, i2).mo1435a());
        return this;
    }

    public tz m840b() {
        if (this.f412j != null) {
            this.f411i.putParcelableArrayListExtra("android.support.customtabs.extra.MENU_ITEMS", this.f412j);
        }
        if (this.f414l != null) {
            this.f411i.putParcelableArrayListExtra("android.support.customtabs.extra.TOOLBAR_ITEMS", this.f414l);
        }
        return new tz(this.f411i, this.f413k, (byte) 0);
    }
}
