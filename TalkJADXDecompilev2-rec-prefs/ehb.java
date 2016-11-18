package p000;

import android.util.Patterns;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

final class ehb extends fje {
    final /* synthetic */ egv f11488a;
    private bjk f11489b;

    ehb(egv egv) {
        this.f11488a = egv;
        super(egv.context);
    }

    public void m13915a(String str) {
        dwx dwx = (dwx) this.f11488a.binder.m25443a(dwx.class);
        if (Patterns.EMAIL_ADDRESS.matcher(str).matches() || dwx.mo1749a(str)) {
            if (this.f11488a.al) {
                if (this.f11488a.m13907b()) {
                    str = dwx.mo1748a(this.f11488a.f11475i.m5638g(), str);
                }
                this.f11489b = new bjk().m5443a(str).m5458g(str);
                this.f11488a.f11472f.m13876a(Collections.singletonList(this.f11489b.m5451c(true).m5438a()));
            }
            m13913b(str, null);
            return;
        }
        String g = glq.m18030g(gwb.m1400H(), str);
        if (g == null && gwb.m1906a(this.f11488a.context, "babel_use_loose_number_match", true) && glq.m18016c(str)) {
            g = glq.m18017d(str);
        }
        if (g != null) {
            this.f11489b = new bjk().m5443a(str).m5459h(g);
            this.f11488a.f11472f.m13876a(Collections.singletonList(this.f11489b.m5451c(true).m5438a()));
            m13913b(null, g);
            return;
        }
        this.f11488a.f11472f.m13876a(null);
        this.f11488a.au.mo1668a(this.f11488a.f11471e.mo2317a(), "people_list_gebi_contacts_load", 1020);
    }

    private void m13913b(String str, String str2) {
        this.f11488a.au.mo1670a("people_list_gebi_contacts_load");
        ArrayList arrayList = new ArrayList();
        arrayList.add(fbt.m14918a(str, str2, false));
        fme a = ((fmf) this.f11488a.binder.m25443a(fmf.class)).mo2035a();
        m6418a(a);
        RealTimeChatService.m9055a(a, this.f11488a.f11475i, arrayList, null, true);
    }

    protected void mo651a(fiu fiu) {
        List<gkv> k = ((exj) fiu.m15392c()).m14747k();
        List arrayList = new ArrayList(k.size());
        for (gkv gkv : k) {
            ehb.m13912a((edk[]) gkv.f15525b, arrayList);
        }
        if (!this.f11488a.al) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (!((bjg) arrayList.get(size)).m5407z()) {
                    arrayList.remove(size);
                }
            }
        }
        if (!arrayList.isEmpty()) {
            this.f11488a.f11472f.m13876a(arrayList);
        } else if (this.f11489b != null) {
            this.f11488a.f11472f.m13876a(Collections.singletonList(this.f11489b.m5451c(false).m5438a()));
        }
    }

    private static void m13912a(edk[] edkArr, List<bjg> list) {
        List arrayList = new ArrayList();
        for (edk edk : edkArr) {
            if (!(edk == null || edk.f11237z || edk.f11214c == null)) {
                arrayList.add(edk.f11214c);
            }
        }
        boolean z = true;
        for (edk edk2 : edkArr) {
            if (edk2 != null && edk2.f11237z) {
                List list2;
                if (z) {
                    list2 = arrayList;
                } else {
                    list2 = null;
                }
                list.add(bjj.m5412a(edk2, list2, false));
                z = false;
            }
        }
    }
}
