package p000;

import android.content.Context;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;

public final class vq {
    int f35377a;
    int f35378b;
    int f35379c;
    int f35380d;
    int f35381e;
    int f35382f;
    ViewGroup f35383g;
    View f35384h;
    View f35385i;
    xy f35386j;
    xv f35387k;
    Context f35388l;
    boolean f35389m;
    boolean f35390n;
    boolean f35391o;
    public boolean f35392p;
    boolean f35393q = false;
    boolean f35394r;
    Bundle f35395s;

    vq(int i) {
        this.f35377a = i;
    }

    public boolean m41053a() {
        if (this.f35384h == null) {
            return false;
        }
        if (this.f35385i != null) {
            return true;
        }
        if (this.f35387k.m41384a().getCount() > 0) {
            return true;
        }
        return false;
    }

    void m41051a(Context context) {
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
        this.f35388l = xaVar;
        TypedArray obtainStyledAttributes = xaVar.obtainStyledAttributes(wi.af);
        this.f35378b = obtainStyledAttributes.getResourceId(wi.ai, 0);
        this.f35382f = obtainStyledAttributes.getResourceId(wi.ag, 0);
        obtainStyledAttributes.recycle();
    }

    void m41052a(xy xyVar) {
        if (xyVar != this.f35386j) {
            if (this.f35386j != null) {
                this.f35386j.m41424b(this.f35387k);
            }
            this.f35386j = xyVar;
            if (xyVar != null && this.f35387k != null) {
                xyVar.m41415a(this.f35387k);
            }
        }
    }

    yp m41050a(yo yoVar) {
        if (this.f35386j == null) {
            return null;
        }
        if (this.f35387k == null) {
            this.f35387k = new xv(this.f35388l, gwb.bV);
            this.f35387k.mo4511a(yoVar);
            this.f35386j.m41415a(this.f35387k);
        }
        return this.f35387k.m41385a(this.f35383g);
    }
}
