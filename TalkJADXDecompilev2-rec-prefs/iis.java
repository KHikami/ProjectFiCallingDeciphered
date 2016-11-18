package p000;

import android.content.Context;
import android.os.SystemClock;
import android.util.Log;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class iis extends iir {
    private final int[] f8995a;
    private final SparseArray<Long> f8996b;
    private final SparseArray<iig> f8997c;
    private boolean f8998d;
    private final iid f8999e;

    public iis(Context context, int[] iArr) {
        this(context, iArr, iif.f17725a);
    }

    private iis(Context context, int[] iArr, SparseArray<iig> sparseArray) {
        this.f8995a = iArr;
        this.f8997c = sparseArray;
        this.f8996b = new SparseArray();
        this.f8998d = false;
        this.f8999e = new iit(this, context);
    }

    public synchronized void mo1401a() {
        if (!this.f8998d) {
            int i;
            int keyAt;
            boolean z;
            mdh mdh = new mdh();
            Set hashSet = new HashSet();
            ArrayList arrayList = new ArrayList();
            for (i = 0; i < this.f8996b.size(); i++) {
                keyAt = this.f8996b.keyAt(i);
                long longValue = ((Long) this.f8996b.valueAt(i)).longValue();
                if (hashSet.add(Integer.valueOf(keyAt))) {
                    mdj mdj = new mdj();
                    mdj.f27462a = Integer.valueOf(keyAt);
                    mdj.f27463b = Long.valueOf(longValue);
                    arrayList.add(mdj);
                }
            }
            if (arrayList.isEmpty()) {
                z = false;
            } else {
                mdh.f27454b = (mdj[]) arrayList.toArray(new mdj[arrayList.size()]);
                ArrayList arrayList2 = new ArrayList();
                for (i = 0; i < this.f8997c.size(); i++) {
                    int keyAt2 = this.f8997c.keyAt(i);
                    keyAt = ((iig) this.f8997c.valueAt(i)).f17726a;
                    Long l = (Long) this.f8996b.get(keyAt);
                    Long l2 = (Long) this.f8996b.get(((iig) this.f8997c.valueAt(i)).f17727b);
                    if (!(l == null || l2 == null)) {
                        mdi mdi = new mdi();
                        mdi.f27460d = Long.valueOf(l2.longValue() - l.longValue());
                        mdi.f27457a = Integer.valueOf(keyAt2);
                        arrayList2.add(mdi);
                        String.format("Clearcut[%d-%d]:%d", new Object[]{Integer.valueOf(keyAt), Integer.valueOf(r8), mdi.f27460d});
                    }
                }
                mdh.f27453a = (mdi[]) arrayList2.toArray(new mdi[arrayList2.size()]);
                mdh.f27455c = this.f8995a;
                mdg mdg = new mdg();
                mdg.f27447a = new mcv();
                mo1404a(mdg);
                mdg.f27447a.f27399n = mdh;
                this.f8999e.mo1691a(mdg);
                z = true;
            }
            this.f8998d = z;
            if (this.f8998d) {
                m10875a(2616);
            } else {
                m10875a(2617);
            }
        }
    }

    public synchronized void mo1403a(int... iArr) {
        if (!this.f8998d) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            for (int a : iArr) {
                mo1402a(a, elapsedRealtime);
            }
        }
    }

    public synchronized void mo1402a(int i, long j) {
        String.format("Marking [%d]=%d", new Object[]{Integer.valueOf(i), Long.valueOf(j)});
        if (j > 0) {
            if (this.f8996b.get(i) == null) {
                this.f8996b.put(i, Long.valueOf(j));
            } else {
                iie b = this.f8999e.mo1693b();
                if (b != null) {
                    b.mo1710b(i).mo1714c(2984);
                } else {
                    new StringBuilder(70).append("No Clearcut logger available when trying to log impression 2984");
                }
                Log.e("BabelMarkReporterDef", "Mark [" + i + "] is set more than once", new IllegalStateException());
            }
        }
    }

    public void mo1404a(mdg mdg) {
    }

    private void m10875a(int i) {
        iie b = this.f8999e.mo1693b();
        if (b != null) {
            b.mo1714c(i);
        } else {
            new StringBuilder(70).append("No Clearcut logger available when trying to log impression ").append(i);
        }
    }
}
