package p000;

import android.os.Build.VERSION;
import java.util.ArrayList;
import java.util.List;

public final class fq {
    static final gd f13726a;

    static void m15943a(fo foVar, ArrayList<fr> arrayList) {
        arrayList = arrayList;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            foVar.mo2304a((fr) obj);
        }
    }

    static void m15944a(fp fpVar, gl glVar) {
        if (glVar == null) {
            return;
        }
        if (glVar instanceof fw) {
            fw fwVar = (fw) glVar;
            gt.m18504a(fpVar, fwVar.e, fwVar.g, fwVar.f, fwVar.f14131a);
        } else if (glVar instanceof ga) {
            ga gaVar = (ga) glVar;
            gt.m18505a(fpVar, gaVar.e, gaVar.g, gaVar.f, gaVar.f14519a);
        } else if (glVar instanceof fv) {
            fv fvVar = (fv) glVar;
            gt.m18503a(fpVar, fvVar.e, fvVar.g, fvVar.f, fvVar.f14070a, fvVar.f14071b, fvVar.f14072c);
        }
    }

    static void m15945b(fp fpVar, gl glVar) {
        if (glVar == null) {
            return;
        }
        if (glVar instanceof gb) {
            gb gbVar = (gb) glVar;
            List arrayList = new ArrayList();
            List arrayList2 = new ArrayList();
            List arrayList3 = new ArrayList();
            List arrayList4 = new ArrayList();
            List arrayList5 = new ArrayList();
            for (gc gcVar : gbVar.f14576c) {
                arrayList.add(gcVar.m16884a());
                arrayList2.add(Long.valueOf(gcVar.m16885b()));
                arrayList3.add(gcVar.m16886c());
                arrayList4.add(gcVar.m16887d());
                arrayList5.add(gcVar.m16888e());
            }
            gwb.m1837a(fpVar, gbVar.f14574a, gbVar.f14575b, arrayList, arrayList2, arrayList3, arrayList4, arrayList5);
            return;
        }
        fq.m15944a(fpVar, glVar);
    }

    static {
        if (gwb.m2107c()) {
            f13726a = new gg();
        } else if (VERSION.SDK_INT >= 21) {
            f13726a = new gf();
        } else if (VERSION.SDK_INT >= 20) {
            f13726a = new ge();
        } else if (VERSION.SDK_INT >= 19) {
            f13726a = new gk();
        } else if (VERSION.SDK_INT >= 16) {
            f13726a = new gj();
        } else if (VERSION.SDK_INT >= 14) {
            f13726a = new gi();
        } else if (VERSION.SDK_INT >= 11) {
            f13726a = new gh();
        } else {
            f13726a = new gd();
        }
    }
}
