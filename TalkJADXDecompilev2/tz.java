package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.RemoteException;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;

public class tz implements tu {
    public static final int e = 2131427598;
    public static final int f = 2131427579;
    public static final int g = 2131427591;
    public static final int h = 2131427592;
    final Toolbar b;
    final Drawable c;
    final CharSequence d;
    public final l i;
    public final ComponentName j;
    public final Intent k;
    public final Bundle l;

    public void a(Drawable drawable, int i) {
        this.b.b(drawable);
        a(i);
    }

    public void a(int i) {
        if (i == 0) {
            this.b.d(this.d);
        } else {
            this.b.d(i);
        }
    }

    public Drawable a() {
        return this.c;
    }

    public Context b() {
        return this.b.getContext();
    }

    public boolean c() {
        return true;
    }

    public tz(l lVar, ComponentName componentName) {
        this.i = lVar;
        this.j = componentName;
    }

    public static boolean a(Context context, String str, g gVar) {
        Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
        if (!TextUtils.isEmpty(str)) {
            intent.setPackage(str);
        }
        return context.bindService(intent, gVar, 33);
    }

    public boolean a(long j) {
        try {
            return this.i.a(0);
        } catch (RemoteException e) {
            return false;
        }
    }

    public ajk a(oto oto) {
        i fVar = new f(this, null);
        try {
            if (this.i.a(fVar)) {
                return new ajk(this.i, fVar, this.j);
            }
            return null;
        } catch (RemoteException e) {
            return null;
        }
    }

    public Bundle a(String str, Bundle bundle) {
        Bundle bundle2 = null;
        try {
            bundle2 = this.i.a(str, null);
        } catch (RemoteException e) {
        }
        return bundle2;
    }

    public tz(Intent intent, Bundle bundle) {
        this.k = intent;
        this.l = bundle;
    }
}
