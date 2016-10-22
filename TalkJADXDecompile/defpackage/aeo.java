package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.IBinder;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import tz;

/* renamed from: aeo */
public class aeo {
    public static final int h = 2130838921;
    public int a;
    public int b;
    public int c;
    public int d;
    public Interpolator e;
    public boolean f;
    public int g;
    public final Intent i;
    public ArrayList<Bundle> j;
    public Bundle k;
    public ArrayList<Bundle> l;

    public boolean a() {
        return this.d >= 0;
    }

    public aeo() {
        this(null);
    }

    public aeo(ajk ajk) {
        IBinder iBinder = null;
        this.i = new Intent("android.intent.action.VIEW");
        this.j = null;
        this.k = null;
        this.l = null;
        if (ajk != null) {
            this.i.setPackage(ajk.b().getPackageName());
        }
        Bundle bundle = new Bundle();
        String str = "android.support.customtabs.extra.SESSION";
        if (ajk != null) {
            iBinder = ajk.a();
        }
        gwb.a(bundle, str, iBinder);
        this.i.putExtras(bundle);
    }

    public aeo a(int i) {
        this.i.putExtra("android.support.customtabs.extra.TOOLBAR_COLOR", i);
        return this;
    }

    public aeo a(boolean z) {
        this.i.putExtra("android.support.customtabs.extra.TITLE_VISIBILITY", 1);
        return this;
    }

    public aeo a(Bitmap bitmap, String str, PendingIntent pendingIntent, boolean z) {
        Bundle bundle = new Bundle();
        bundle.putInt("android.support.customtabs.customaction.ID", 0);
        bundle.putParcelable("android.support.customtabs.customaction.ICON", bitmap);
        bundle.putString("android.support.customtabs.customaction.DESCRIPTION", str);
        bundle.putParcelable("android.support.customtabs.customaction.PENDING_INTENT", pendingIntent);
        this.i.putExtra("android.support.customtabs.extra.ACTION_BUTTON_BUNDLE", bundle);
        this.i.putExtra("android.support.customtabs.extra.TINT_ACTION_BUTTON", false);
        return this;
    }

    public aeo a(Context context, int i, int i2) {
        this.k = cu.a(context, i, i2).a();
        return this;
    }

    public aeo b(Context context, int i, int i2) {
        this.i.putExtra("android.support.customtabs.extra.EXIT_ANIMATION_BUNDLE", cu.a(context, i, i2).a());
        return this;
    }

    public tz b() {
        if (this.j != null) {
            this.i.putParcelableArrayListExtra("android.support.customtabs.extra.MENU_ITEMS", this.j);
        }
        if (this.l != null) {
            this.i.putParcelableArrayListExtra("android.support.customtabs.extra.TOOLBAR_ITEMS", this.l);
        }
        return new tz(this.i, this.k, (byte) 0);
    }
}
