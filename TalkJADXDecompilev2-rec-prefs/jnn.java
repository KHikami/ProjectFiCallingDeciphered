package p000;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

public final class jnn extends jzn implements jmi {
    jmo f20544a;
    jcf f20545b;

    protected void onAttachBinder(Bundle bundle) {
        super.onAttachBinder(bundle);
        this.f20544a = (jmo) this.binder.m25443a(jmo.class);
        this.f20545b = (jcf) this.binder.m25443a(jcf.class);
    }

    public void mo1739a(jmu jmu) {
        List arrayList = new ArrayList();
        for (Integer intValue : this.f20545b.mo3453a()) {
            int intValue2 = intValue.intValue();
            jch a = this.f20545b.mo3456a(intValue2);
            if (!(a.mo3448c("logged_in") || a.mo3448c("is_managed_account"))) {
                arrayList.add(Integer.valueOf(intValue2));
            }
        }
        if (arrayList.isEmpty()) {
            this.f20544a.mo3567b();
            return;
        }
        String string;
        int[] iArr = new int[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            iArr[i] = ((Integer) arrayList.get(i)).intValue();
        }
        Bundle arguments = getArguments();
        if (arguments != null) {
            string = arguments.getString("dialog_title");
        } else {
            string = null;
        }
        ed childFragmentManager = getChildFragmentManager();
        if (string == null) {
            string = this.context.getString(gwb.zn);
        }
        jnk.m24752a(childFragmentManager, string, iArr, true, true);
    }
}
