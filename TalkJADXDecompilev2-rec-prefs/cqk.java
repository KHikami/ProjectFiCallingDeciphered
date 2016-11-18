package p000;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;

public final class cqk extends ery {
    private View f8833a;

    public cqk() {
        super(gwb.nK, new int[]{gwb.nJ});
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f8833a = super.onCreateView(layoutInflater, viewGroup, bundle);
        ((Button) this.f8833a.findViewById(gwb.nJ)).setText(17039370);
        return this.f8833a;
    }

    protected String mo495a() {
        return getString(gwb.nL);
    }

    protected void mo517a(int i) {
        int a = ((jca) this.binder.m25443a(jca.class)).mo2317a();
        bkq.m5667a(getContext(), fde.m15018e(a), true);
        if (((CheckBox) this.f8833a.findViewById(gwb.nI)).isChecked()) {
            ((ful) this.binder.m25443a(ful.class)).m16263a(a, true);
        }
        super.mo517a(i);
    }
}
