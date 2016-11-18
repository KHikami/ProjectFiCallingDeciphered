package p000;

import android.content.Context;
import android.database.Cursor;
import android.view.View;
import android.view.ViewGroup;

public final class cbm extends enk {
    private final bko f4952j;
    private final edk f4953k;
    private final boolean f4954l;
    private final gou f4955m;
    private final gor f4956n;
    private final gos f4957o;

    public cbm(Context context, bko bko, edk edk, boolean z, boolean z2, gor gor, gos gos) {
        super(context, null);
        this.f4952j = bko;
        this.f4953k = edk;
        this.f4954l = z;
        this.f4956n = gor;
        this.f4957o = gos;
        if (!fdq.f12793i.m14370b(bko.m5638g()) || z2) {
            this.f4955m = gou.PEOPLE_OPTIONS_GUEST;
        } else {
            this.f4955m = gou.PEOPLE_OPTIONS;
        }
    }

    public boolean isEnabled(int i) {
        return false;
    }

    public int getCount() {
        int count = super.getCount();
        if (this.f4953k != null) {
            return Math.max(1, count);
        }
        return count;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        if (!(view == null || (view instanceof gon))) {
            view = null;
        }
        return super.getView(i, view, viewGroup);
    }

    public View mo803a(Context context, Cursor cursor, ViewGroup viewGroup) {
        View gon = new gon(context, this.f4952j, this.f4955m);
        gon.m18229a(this.f4956n);
        gon.m18230a(this.f4957o);
        return gon;
    }

    public void mo804a(View view, Cursor cursor) {
        edk edk;
        boolean z;
        if (this.f4953k != null) {
            edk = this.f4953k;
        } else {
            edk = bkf.m5577a(this.f4952j, cursor);
        }
        gon gon = (gon) view;
        gon.mo2312k();
        if (this.f4954l) {
            z = false;
        } else {
            z = true;
        }
        gon.m18228a(bjj.m5412a(edk, null, z), null, false, this.f4954l, this.f4955m);
    }
}
