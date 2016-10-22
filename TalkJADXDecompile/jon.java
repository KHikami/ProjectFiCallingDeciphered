import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

public final class jon extends jzn implements jmi {
    jmo a;
    jcf b;
    jmq c;

    protected void onAttachBinder(Bundle bundle) {
        super.onAttachBinder(bundle);
        this.a = (jmo) this.binder.a(jmo.class);
        this.b = (jcf) this.binder.a(jcf.class);
        this.c = (jmq) this.binder.a(jmq.class);
    }

    public void a(jmu jmu) {
        jmb jmb;
        boolean z = false;
        Bundle arguments = getArguments();
        if (arguments != null) {
            jmb = (jmb) arguments.getParcelable("account_filter");
        } else {
            jmb = null;
        }
        List arrayList = new ArrayList();
        for (Integer intValue : this.b.a()) {
            int intValue2 = intValue.intValue();
            jch a = this.b.a(intValue2);
            if (this.c.a(jmu, intValue2) && (jmb == null || jmb.a(intValue2, a))) {
                arrayList.add(Integer.valueOf(intValue2));
            }
        }
        if (arrayList.isEmpty()) {
            for (Integer intValue3 : this.b.a()) {
                intValue2 = intValue3.intValue();
                a = this.b.a(intValue2);
                if ((jmb == null || jmb.a(intValue2, a)) && !a.c("is_managed_account")) {
                    arrayList.add(Integer.valueOf(intValue2));
                }
            }
        }
        if (arrayList.isEmpty()) {
            if (arguments == null || arguments.getBoolean("add_account")) {
                z = true;
            }
            if (z) {
                this.a.b();
                return;
            } else {
                this.a.c();
                return;
            }
        }
        String string;
        boolean z2;
        boolean z3 = arguments == null || !arguments.getBoolean("never_auto_select_single_account");
        if (arrayList.size() == 1 && z3) {
            jch a2 = this.b.a(((Integer) arrayList.get(0)).intValue());
            if (arguments == null || arguments.getBoolean("auto_select_single_logged_out_account")) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (!a2.c("logged_out") || r0) {
                this.a.a(a2.b("account_name"), a2.b("effective_gaia_id"));
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
        jnk.a(childFragmentManager, string, iArr, z2, z);
    }
}
