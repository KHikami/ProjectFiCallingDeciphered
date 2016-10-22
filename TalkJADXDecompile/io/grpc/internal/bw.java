package io.grpc.internal;

import bm;
import java.util.ArrayList;
import java.util.Collection;
import okr;
import olk;

final class bw implements Runnable {
    boolean a;
    final /* synthetic */ br b;

    bw(br brVar) {
        this.b = brVar;
    }

    public void run() {
        Collection arrayList = new ArrayList();
        synchronized (this.b.k) {
            if (this.a) {
                return;
            }
            okr okr = this.b.r;
            this.b.r = null;
            olk olk = this.b.q;
            this.b.q = br.a(this.b.e, this.b.f, this.b.g);
            arrayList.addAll(this.b.s.values());
            this.b.s.clear();
            this.b.t.addAll(arrayList);
            ArrayList arrayList2 = (ArrayList) arrayList;
            int size = arrayList2.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList2.get(i);
                i++;
                dd ddVar = (dd) obj;
                synchronized (ddVar.b) {
                    if (ddVar.o) {
                    } else {
                        Object obj2;
                        ddVar.o = true;
                        ca caVar = ddVar.p;
                        ae aeVar = ddVar.m;
                        ddVar.p = null;
                        if (ddVar.k.isEmpty()) {
                            bm.b(ddVar.j == null, (Object) "Should have no reconnectTask scheduled");
                            obj2 = 1;
                        } else {
                            obj2 = null;
                        }
                        if (caVar != null) {
                            caVar.a();
                        }
                        if (aeVar != null) {
                            aeVar.a();
                        }
                        if (obj2 != null) {
                            ddVar.e.a(ddVar);
                        }
                    }
                }
            }
            okr.b();
            olk.b();
        }
    }
}
