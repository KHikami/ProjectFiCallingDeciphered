package defpackage;

import android.content.Context;
import android.os.SystemClock;
import android.util.Log;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/* renamed from: iis */
public class iis extends iir {
    private final int[] a;
    private final SparseArray<Long> b;
    private final SparseArray<iig> c;
    private boolean d;
    private final iid e;

    public iis(Context context, int[] iArr) {
        this(context, iArr, iif.a);
    }

    private iis(Context context, int[] iArr, SparseArray<iig> sparseArray) {
        this.a = iArr;
        this.c = sparseArray;
        this.b = new SparseArray();
        this.d = false;
        this.e = new iit(this, context);
    }

    public synchronized void a() {
        if (!this.d) {
            int i;
            int keyAt;
            boolean z;
            mdh mdh = new mdh();
            Set hashSet = new HashSet();
            ArrayList arrayList = new ArrayList();
            for (i = 0; i < this.b.size(); i++) {
                keyAt = this.b.keyAt(i);
                long longValue = ((Long) this.b.valueAt(i)).longValue();
                if (hashSet.add(Integer.valueOf(keyAt))) {
                    mdj mdj = new mdj();
                    mdj.a = Integer.valueOf(keyAt);
                    mdj.b = Long.valueOf(longValue);
                    arrayList.add(mdj);
                }
            }
            if (arrayList.isEmpty()) {
                z = false;
            } else {
                mdh.b = (mdj[]) arrayList.toArray(new mdj[arrayList.size()]);
                ArrayList arrayList2 = new ArrayList();
                for (i = 0; i < this.c.size(); i++) {
                    int keyAt2 = this.c.keyAt(i);
                    keyAt = ((iig) this.c.valueAt(i)).a;
                    Long l = (Long) this.b.get(keyAt);
                    Long l2 = (Long) this.b.get(((iig) this.c.valueAt(i)).b);
                    if (!(l == null || l2 == null)) {
                        mdi mdi = new mdi();
                        mdi.d = Long.valueOf(l2.longValue() - l.longValue());
                        mdi.a = Integer.valueOf(keyAt2);
                        arrayList2.add(mdi);
                        String.format("Clearcut[%d-%d]:%d", new Object[]{Integer.valueOf(keyAt), Integer.valueOf(r8), mdi.d});
                    }
                }
                mdh.a = (mdi[]) arrayList2.toArray(new mdi[arrayList2.size()]);
                mdh.c = this.a;
                mdg mdg = new mdg();
                mdg.a = new mcv();
                a(mdg);
                mdg.a.n = mdh;
                this.e.a(mdg);
                z = true;
            }
            this.d = z;
            if (this.d) {
                a(2616);
            } else {
                a(2617);
            }
        }
    }

    public synchronized void a(int... iArr) {
        if (!this.d) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            for (int a : iArr) {
                a(a, elapsedRealtime);
            }
        }
    }

    public synchronized void a(int i, long j) {
        String.format("Marking [%d]=%d", new Object[]{Integer.valueOf(i), Long.valueOf(j)});
        if (j > 0) {
            if (this.b.get(i) == null) {
                this.b.put(i, Long.valueOf(j));
            } else {
                iie b = this.e.b();
                if (b != null) {
                    b.b(i).c(2984);
                } else {
                    new StringBuilder(70).append("No Clearcut logger available when trying to log impression 2984");
                }
                Log.e("BabelMarkReporterDef", "Mark [" + i + "] is set more than once", new IllegalStateException());
            }
        }
    }

    public void a(mdg mdg) {
    }

    private void a(int i) {
        iie b = this.e.b();
        if (b != null) {
            b.c(i);
        } else {
            new StringBuilder(70).append("No Clearcut logger available when trying to log impression ").append(i);
        }
    }
}
