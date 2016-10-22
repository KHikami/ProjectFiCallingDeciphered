package defpackage;

import android.graphics.Matrix;
import java.util.ArrayList;

/* compiled from: PG */
/* renamed from: bq */
final class bq {
    final Matrix a;
    final ArrayList b;
    float c;
    float d;
    float e;
    float f;
    float g;
    float h;
    float i;
    final Matrix j;
    int k;
    int[] l;
    String m;

    public bq(bq bqVar, hv hvVar) {
        this.a = new Matrix();
        this.b = new ArrayList();
        this.c = 0.0f;
        this.d = 0.0f;
        this.e = 0.0f;
        this.f = 1.0f;
        this.g = 1.0f;
        this.h = 0.0f;
        this.i = 0.0f;
        this.j = new Matrix();
        this.m = null;
        this.c = bqVar.c;
        this.d = bqVar.d;
        this.e = bqVar.e;
        this.f = bqVar.f;
        this.g = bqVar.g;
        this.h = bqVar.h;
        this.i = bqVar.i;
        this.l = bqVar.l;
        this.m = bqVar.m;
        this.k = bqVar.k;
        if (this.m != null) {
            hvVar.put(this.m, this);
        }
        this.j.set(bqVar.j);
        ArrayList arrayList = bqVar.b;
        for (int i = 0; i < arrayList.size(); i++) {
            Object obj = arrayList.get(i);
            if (obj instanceof bq) {
                this.b.add(new bq((bq) obj, hvVar));
            } else {
                br bpVar;
                if (obj instanceof bp) {
                    bpVar = new bp((bp) obj);
                } else if (obj instanceof bo) {
                    bpVar = new bo((bo) obj);
                } else {
                    throw new IllegalStateException("Unknown object in the tree!");
                }
                this.b.add(bpVar);
                if (bpVar.n != null) {
                    hvVar.put(bpVar.n, bpVar);
                }
            }
        }
    }

    public bq() {
        this.a = new Matrix();
        this.b = new ArrayList();
        this.c = 0.0f;
        this.d = 0.0f;
        this.e = 0.0f;
        this.f = 1.0f;
        this.g = 1.0f;
        this.h = 0.0f;
        this.i = 0.0f;
        this.j = new Matrix();
        this.m = null;
    }
}
