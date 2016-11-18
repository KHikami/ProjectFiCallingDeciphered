package p000;

import android.text.TextUtils;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import java.util.ArrayList;
import java.util.List;

class ehd extends fje {
    final /* synthetic */ egv f11491a;
    private final String f11492b;

    ehd(egv egv) {
        this.f11491a = egv;
        super(egv.context);
        String valueOf = String.valueOf(ehd.class.getName());
        this.f11492b = new StringBuilder(String.valueOf(valueOf).length() + 11).append(valueOf).append(hashCode()).toString();
    }

    public void m13917a(String str) {
        this.f11491a.au.mo1670a("people_list_gplus_and_domain_contacts_load");
        fme a = ((fmf) this.f11491a.binder.m25443a(fmf.class)).mo2035a();
        m6418a(a);
        RealTimeChatService.m9054a(a, this.f11491a.f11475i, str, this.f11492b);
    }

    protected void mo651a(fiu fiu) {
        ezh ezh = (ezh) fiu.m15392c();
        List arrayList = new ArrayList();
        List arrayList2 = new ArrayList();
        for (edk edk : ezh.m14804k()) {
            bjj a = bjj.m5412a(edk, null, false);
            if (edk.f11236y) {
                arrayList.add(a);
            } else {
                arrayList2.add(a);
            }
        }
        this.f11491a.f11472f.m13884d(new bjl(arrayList));
        this.f11491a.f11472f.m13889f(new bjl(arrayList2));
        this.f11491a.m13901a(this.f11491a.getView());
        egv egv = this.f11491a;
        CharSequence j = egv.aj.m4881j();
        if (egv.f11474h) {
            if (egv.f11472f.m13883c(!TextUtils.isEmpty(j))) {
                if (egv.ao != null) {
                    egv.ao.m13923a(egv.f11472f.m13878b());
                }
                egv.f11474h = false;
            }
        }
        this.f11491a.au.mo1668a(this.f11491a.f11471e.mo2317a(), "people_list_gplus_and_domain_contacts_load", 1019);
    }
}
