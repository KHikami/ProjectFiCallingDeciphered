package p000;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

public final class jon extends jzn implements jmi {
    jmo f20616a;
    jcf f20617b;
    jmq f20618c;

    protected void onAttachBinder(Bundle bundle) {
        super.onAttachBinder(bundle);
        this.f20616a = (jmo) this.binder.m25443a(jmo.class);
        this.f20617b = (jcf) this.binder.m25443a(jcf.class);
        this.f20618c = (jmq) this.binder.m25443a(jmq.class);
    }

    public void mo1739a(jmu jmu) {
        jmb jmb;
        boolean z = false;
        Bundle arguments = getArguments();
        if (arguments != null) {
            jmb = (jmb) arguments.getParcelable("account_filter");
        } else {
            jmb = null;
        }
        List arrayList = new ArrayList();
        for (Integer intValue : this.f20617b.mo3453a()) {
            int intValue2 = intValue.intValue();
            jch a = this.f20617b.mo3456a(intValue2);
            if (this.f20618c.mo3576a(jmu, intValue2) && (jmb == null || jmb.mo459a(intValue2, a))) {
                arrayList.add(Integer.valueOf(intValue2));
            }
        }
        if (arrayList.isEmpty()) {
            for (Integer intValue3 : this.f20617b.mo3453a()) {
                intValue2 = intValue3.intValue();
                a = this.f20617b.mo3456a(intValue2);
                if ((jmb == null || jmb.mo459a(intValue2, a)) && !a.mo3448c("is_managed_account")) {
                    arrayList.add(Integer.valueOf(intValue2));
                }
            }
        }
        if (arrayList.isEmpty()) {
            if (arguments == null || arguments.getBoolean("add_account")) {
                z = true;
            }
            if (z) {
                this.f20616a.mo3567b();
                return;
            } else {
                this.f20616a.mo3569c();
                return;
            }
        }
        String string;
        boolean z2;
        boolean z3 = arguments == null || !arguments.getBoolean("never_auto_select_single_account");
        if (arrayList.size() == 1 && z3) {
            jch a2 = this.f20617b.mo3456a(((Integer) arrayList.get(0)).intValue());
            if (arguments == null || arguments.getBoolean("auto_select_single_logged_out_account")) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (!a2.mo3448c("logged_out") || r0) {
                this.f20616a.mo3566a(a2.mo3440b("account_name"), a2.mo3440b("effective_gaia_id"));
                return;
            }
        }
        int[] iArr = new int[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            iArr[i] = ((Integer) arrayList.get(i)).intValue();
        }
        if (arguments != null) {
            string = arguments.getString("dialog_title");
        } else {
            string = null;
        }
        if (arguments == null || !arguments.getBoolean("add_account_button_shown")) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (arguments == null || arguments.getBoolean("canceled_on_outside_touch")) {
            z = true;
        }
        ed childFragmentManager = getChildFragmentManager();
        if (string == null) {
            string = this.context.getString(gwb.zn);
        }
        jnk.m24752a(childFragmentManager, string, iArr, z2, z);
    }
}
