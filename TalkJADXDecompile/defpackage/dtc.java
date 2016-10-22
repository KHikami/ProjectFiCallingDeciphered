package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.ViewGroup;

/* renamed from: dtc */
public final class dtc implements grg {
    public gpe a(ViewGroup viewGroup, int i, LayoutInflater layoutInflater) {
        return new dtf(layoutInflater.getContext(), i, layoutInflater.inflate(gwb.rx, viewGroup, true));
    }

    public gpe a(Context context, int i, das das, Resources resources) {
        return new dta(context, i, das, resources);
    }
}
