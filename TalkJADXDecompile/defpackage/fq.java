package defpackage;

import android.os.Build.VERSION;
import java.util.ArrayList;
import java.util.List;

/* renamed from: fq */
public final class fq {
    static final gd a;

    static void a(fo foVar, ArrayList<fr> arrayList) {
        arrayList = arrayList;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            foVar.a((fr) obj);
        }
    }

    static void a(fp fpVar, gl glVar) {
        if (glVar == null) {
            return;
        }
        if (glVar instanceof fw) {
            fw fwVar = (fw) glVar;
            gt.a(fpVar, fwVar.e, fwVar.g, fwVar.f, fwVar.a);
        } else if (glVar instanceof ga) {
            ga gaVar = (ga) glVar;
            gt.a(fpVar, gaVar.e, gaVar.g, gaVar.f, gaVar.a);
        } else if (glVar instanceof fv) {
            fv fvVar = (fv) glVar;
            gt.a(fpVar, fvVar.e, fvVar.g, fvVar.f, fvVar.a, fvVar.b, fvVar.c);
        }
    }

    static void b(fp fpVar, gl glVar) {
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
            for (gc gcVar : gbVar.c) {
                arrayList.add(gcVar.a());
                arrayList2.add(Long.valueOf(gcVar.b()));
                arrayList3.add(gcVar.c());
                arrayList4.add(gcVar.d());
                arrayList5.add(gcVar.e());
            }
            gwb.a(fpVar, gbVar.a, gbVar.b, arrayList, arrayList2, arrayList3, arrayList4, arrayList5);
            return;
        }
        fq.a(fpVar, glVar);
    }

    static {
        if (gwb.c()) {
            a = new gg();
        } else if (VERSION.SDK_INT >= 21) {
            a = new gf();
        } else if (VERSION.SDK_INT >= 20) {
            a = new ge();
        } else if (VERSION.SDK_INT >= 19) {
            a = new gk();
        } else if (VERSION.SDK_INT >= 16) {
            a = new gj();
        } else if (VERSION.SDK_INT >= 14) {
            a = new gi();
        } else if (VERSION.SDK_INT >= 11) {
            a = new gh();
        } else {
            a = new gd();
        }
    }
}
