package defpackage;

import android.content.Context;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;

public final class vq {
    int a;
    int b;
    int c;
    int d;
    int e;
    int f;
    ViewGroup g;
    View h;
    View i;
    xy j;
    xv k;
    Context l;
    boolean m;
    boolean n;
    boolean o;
    public boolean p;
    boolean q = false;
    boolean r;
    Bundle s;

    vq(int i) {
        this.a = i;
    }

    public boolean a() {
        if (this.h == null) {
            return false;
        }
        if (this.i != null) {
            return true;
        }
        if (this.k.a().getCount() > 0) {
            return true;
        }
        return false;
    }

    void a(Context context) {
        TypedValue typedValue = new TypedValue();
        Theme newTheme = context.getResources().newTheme();
        newTheme.setTo(context.getTheme());
        newTheme.resolveAttribute(gwb.q, typedValue, true);
        if (typedValue.resourceId != 0) {
            newTheme.applyStyle(typedValue.resourceId, true);
        }
        newTheme.resolveAttribute(gwb.W, typedValue, true);
        if (typedValue.resourceId != 0) {
            newTheme.applyStyle(typedValue.resourceId, true);
        } else {
            newTheme.applyStyle(gwb.ch, true);
        }
        Context xaVar = new xa(context, 0);
        xaVar.getTheme().setTo(newTheme);
        this.l = xaVar;
        TypedArray obtainStyledAttributes = xaVar.obtainStyledAttributes(wi.af);
        this.b = obtainStyledAttributes.getResourceId(wi.ai, 0);
        this.f = obtainStyledAttributes.getResourceId(wi.ag, 0);
        obtainStyledAttributes.recycle();
    }

    void a(xy xyVar) {
        if (xyVar != this.j) {
            if (this.j != null) {
                this.j.b(this.k);
            }
            this.j = xyVar;
            if (xyVar != null && this.k != null) {
                xyVar.a(this.k);
            }
        }
    }

    yp a(yo yoVar) {
        if (this.j == null) {
            return null;
        }
        if (this.k == null) {
            this.k = new xv(this.l, gwb.bV);
            this.k.a(yoVar);
            this.j.a(this.k);
        }
        return this.k.a(this.g);
    }
}
