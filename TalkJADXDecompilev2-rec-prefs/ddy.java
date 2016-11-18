package p000;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class ddy extends cyp {
    deb f9546i;

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle, gwb.hr);
        m11280b().setOnTouchListener(new ddz(this));
        this.f.setOnTouchListener(new dea(this));
        return onCreateView;
    }

    public void m11502a(deb deb) {
        this.f9546i = deb;
    }

    protected boolean mo1497e() {
        return m11283d() != null;
    }

    protected void mo1496b(CharSequence charSequence) {
        super.mo1496b(charSequence);
        dab dab = null;
        if (!TextUtils.isEmpty(charSequence)) {
            String c = glq.m18012c(gwb.m1400H(), charSequence.toString());
            if (c != null) {
                dab = new dec();
                dab.m11513a(c, getActivity());
            }
        }
        mo1493a(2, dab);
    }

    public void mo1473a(fsb fsb, hwl hwl, hwq hwq) {
        super.mo1473a(fsb, hwl, hwq);
        if (fsb == this.c) {
            mo1493a(0, new frk(hwl));
            if (this.f9546i != null) {
                this.f9546i.mo1100e();
            }
        }
    }

    protected agh[] mo495a() {
        return gwb.m2334q();
    }

    protected boolean isEmpty() {
        return false;
    }
}
