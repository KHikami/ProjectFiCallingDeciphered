package p000;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.RemoteException;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;

public class tz implements tu {
    public static final int f35174e = 2131427598;
    public static final int f35175f = 2131427579;
    public static final int f35176g = 2131427591;
    public static final int f35177h = 2131427592;
    final Toolbar f35178b;
    final Drawable f35179c;
    final CharSequence f35180d;
    public final l f35181i;
    public final ComponentName f35182j;
    public final Intent f35183k;
    public final Bundle f35184l;

    public void mo4389a(Drawable drawable, int i) {
        this.f35178b.b(drawable);
        mo4388a(i);
    }

    public void mo4388a(int i) {
        if (i == 0) {
            this.f35178b.d(this.f35180d);
        } else {
            this.f35178b.d(i);
        }
    }

    public Drawable mo4387a() {
        return this.f35179c;
    }

    public Context mo4390b() {
        return this.f35178b.getContext();
    }

    public boolean mo4391c() {
        return true;
    }

    public tz(l lVar, ComponentName componentName) {
        this.f35181i = lVar;
        this.f35182j = componentName;
    }

    public static boolean m40850a(Context context, String str, g gVar) {
        Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
        if (!TextUtils.isEmpty(str)) {
            intent.setPackage(str);
        }
        return context.bindService(intent, gVar, 33);
    }

    public boolean m40856a(long j) {
        try {
            return this.f35181i.a(0);
        } catch (RemoteException e) {
            return false;
        }
    }

    public ajk m40851a(oto oto) {
        i fVar = new f(this, null);
        try {
            if (this.f35181i.a(fVar)) {
                return new ajk(this.f35181i, fVar, this.f35182j);
            }
            return null;
        } catch (RemoteException e) {
            return null;
        }
    }

    public Bundle m40853a(String str, Bundle bundle) {
        Bundle bundle2 = null;
        try {
            bundle2 = this.f35181i.a(str, null);
        } catch (RemoteException e) {
        }
        return bundle2;
    }

    public tz(Intent intent, Bundle bundle) {
        this.f35183k = intent;
        this.f35184l = bundle;
    }
}
