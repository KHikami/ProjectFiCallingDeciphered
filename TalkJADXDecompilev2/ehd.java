package defpackage;

import android.text.TextUtils;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import java.util.ArrayList;
import java.util.List;

class ehd extends fje {
    final /* synthetic */ egv a;
    private final String b;

    ehd(egv egv) {
        this.a = egv;
        super(egv.context);
        String valueOf = String.valueOf(ehd.class.getName());
        this.b = new StringBuilder(String.valueOf(valueOf).length() + 11).append(valueOf).append(hashCode()).toString();
    }

    public void a(String str) {
        this.a.au.a("people_list_gplus_and_domain_contacts_load");
        fme a = ((fmf) this.a.binder.a(fmf.class)).a();
        a(a);
        RealTimeChatService.a(a, this.a.i, str, this.b);
    }

    protected void a(fiu fiu) {
        ezh ezh = (ezh) fiu.c();
        List arrayList = new ArrayList();
        List arrayList2 = new ArrayList();
        for (edk edk : ezh.k()) {
            bjj a = bjj.a(edk, null, false);
            if (edk.y) {
                arrayList.add(a);
            } else {
                arrayList2.add(a);
            }
        }
        this.a.f.d(new bjl(arrayList));
        this.a.f.f(new bjl(arrayList2));
        this.a.a(this.a.getView());
        egv egv = this.a;
        CharSequence j = egv.aj.j();
        if (egv.h) {
            if (egv.f.c(!TextUtils.isEmpty(j))) {
                if (egv.ao != null) {
                    egv.ao.a(egv.f.b());
                }
                egv.h = false;
            }
        }
        this.a.au.a(this.a.e.a(), "people_list_gplus_and_domain_contacts_load", 1019);
    }
}
