package defpackage;

import android.util.Patterns;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

final class ehb extends fje {
    final /* synthetic */ egv a;
    private bjk b;

    ehb(egv egv) {
        this.a = egv;
        super(egv.context);
    }

    public void a(String str) {
        dwx dwx = (dwx) this.a.binder.a(dwx.class);
        if (Patterns.EMAIL_ADDRESS.matcher(str).matches() || dwx.a(str)) {
            if (this.a.al) {
                if (this.a.b()) {
                    str = dwx.a(this.a.i.g(), str);
                }
                this.b = new bjk().a(str).g(str);
                this.a.f.a(Collections.singletonList(this.b.c(true).a()));
            }
            b(str, null);
            return;
        }
        String g = glq.g(gwb.H(), str);
        if (g == null && gwb.a(this.a.context, "babel_use_loose_number_match", true) && glq.c(str)) {
            g = glq.d(str);
        }
        if (g != null) {
            this.b = new bjk().a(str).h(g);
            this.a.f.a(Collections.singletonList(this.b.c(true).a()));
            b(null, g);
            return;
        }
        this.a.f.a(null);
        this.a.au.a(this.a.e.a(), "people_list_gebi_contacts_load", 1020);
    }

    private void b(String str, String str2) {
        this.a.au.a("people_list_gebi_contacts_load");
        ArrayList arrayList = new ArrayList();
        arrayList.add(fbt.a(str, str2, false));
        fme a = ((fmf) this.a.binder.a(fmf.class)).a();
        a(a);
        RealTimeChatService.a(a, this.a.i, arrayList, null, true);
    }

    protected void a(fiu fiu) {
        List<gkv> k = ((exj) fiu.c()).k();
        List arrayList = new ArrayList(k.size());
        for (gkv gkv : k) {
            ehb.a((edk[]) gkv.b, arrayList);
        }
        if (!this.a.al) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (!((bjg) arrayList.get(size)).z()) {
                    arrayList.remove(size);
                }
            }
        }
        if (!arrayList.isEmpty()) {
            this.a.f.a(arrayList);
        } else if (this.b != null) {
            this.a.f.a(Collections.singletonList(this.b.c(false).a()));
        }
    }

    private static void a(edk[] edkArr, List<bjg> list) {
        List arrayList = new ArrayList();
        for (edk edk : edkArr) {
            if (!(edk == null || edk.z || edk.c == null)) {
                arrayList.add(edk.c);
            }
        }
        boolean z = true;
        for (edk edk2 : edkArr) {
            if (edk2 != null && edk2.z) {
                List list2;
                if (z) {
                    list2 = arrayList;
                } else {
                    list2 = null;
                }
                list.add(bjj.a(edk2, list2, false));
                z = false;
            }
        }
    }
}
