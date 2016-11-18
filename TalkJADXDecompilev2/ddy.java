package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class ddy extends cyp {
    deb i;

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle, gwb.hr);
        b().setOnTouchListener(new ddz(this));
        this.f.setOnTouchListener(new dea(this));
        return onCreateView;
    }

    public void a(deb deb) {
        this.i = deb;
    }

    protected boolean e() {
        return d() != null;
    }

    protected void b(CharSequence charSequence) {
        super.b(charSequence);
        dab dab = null;
        if (!TextUtils.isEmpty(charSequence)) {
            String c = glq.c(gwb.H(), charSequence.toString());
            if (c != null) {
                dab = new dec();
                dab.a(c, getActivity());
            }
        }
        a(2, dab);
    }

    public void a(fsb fsb, hwl hwl, hwq hwq) {
        super.a(fsb, hwl, hwq);
        if (fsb == this.c) {
            a(0, new frk(hwl));
            if (this.i != null) {
                this.i.e();
            }
        }
    }

    protected agh[] a() {
        return gwb.q();
    }

    protected boolean isEmpty() {
        return false;
    }
}
