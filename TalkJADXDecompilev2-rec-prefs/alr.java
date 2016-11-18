package p000;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

public final class alr {
    private AtomicInteger f1234a;
    private final Map<String, Queue<alo<?>>> f1235b;
    private final Set<alo<?>> f1236c;
    private final PriorityBlockingQueue<alo<?>> f1237d;
    private final PriorityBlockingQueue<alo<?>> f1238e;
    private final alf f1239f;
    private final all f1240g;
    private final alv f1241h;
    private alm[] f1242i;
    private alh f1243j;
    private List<C0000a> f1244k;

    private alr(alf alf, all all, int i, alv alv) {
        this.f1234a = new AtomicInteger();
        this.f1235b = new HashMap();
        this.f1236c = new HashSet();
        this.f1237d = new PriorityBlockingQueue();
        this.f1238e = new PriorityBlockingQueue();
        this.f1244k = new ArrayList();
        this.f1239f = alf;
        this.f1240g = all;
        this.f1242i = new alm[i];
        this.f1241h = alv;
    }

    public alr(alf alf, all all, int i) {
        this(alf, all, i, new alv(new Handler(Looper.getMainLooper())));
    }

    public void m2867a() {
        m2864c();
        this.f1243j = new alh(this.f1237d, this.f1238e, this.f1239f, this.f1241h);
        this.f1243j.start();
        for (int i = 0; i < this.f1242i.length; i++) {
            alm alm = new alm(this.f1238e, this.f1240g, this.f1239f, this.f1241h);
            this.f1242i[i] = alm;
            alm.start();
        }
    }

    private void m2864c() {
        if (this.f1243j != null) {
            this.f1243j.m2831a();
        }
        for (int i = 0; i < this.f1242i.length; i++) {
            if (this.f1242i[i] != null) {
                this.f1242i[i].m2833a();
            }
        }
    }

    private int m2865d() {
        return this.f1234a.incrementAndGet();
    }

    public alf m2868b() {
        return this.f1239f;
    }

    public <T> alo<T> m2866a(alo<T> alo_T) {
        alo_T.m2838a(this);
        synchronized (this.f1236c) {
            this.f1236c.add(alo_T);
        }
        alo_T.f1214b = Integer.valueOf(m2865d());
        alo_T.m2843a("add-to-queue");
        if (alo_T.f1215c) {
            synchronized (this.f1235b) {
                String d = alo_T.m2848d();
                if (this.f1235b.containsKey(d)) {
                    Queue queue = (Queue) this.f1235b.get(d);
                    if (queue == null) {
                        queue = new LinkedList();
                    }
                    queue.add(alo_T);
                    this.f1235b.put(d, queue);
                    if (aly.f1262b) {
                        aly.m2882a("Request for cacheKey=%s is in flight, putting on hold.", d);
                    }
                } else {
                    this.f1235b.put(d, null);
                    this.f1237d.add(alo_T);
                }
            }
        } else {
            this.f1238e.add(alo_T);
        }
        return alo_T;
    }

    <T> void m2869b(alo<T> alo_T) {
        synchronized (this.f1236c) {
            this.f1236c.remove(alo_T);
        }
        synchronized (this.f1244k) {
            Iterator it = this.f1244k.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
        if (alo_T.f1215c) {
            synchronized (this.f1235b) {
                Queue queue = (Queue) this.f1235b.remove(alo_T.m2848d());
                if (queue != null) {
                    if (aly.f1262b) {
                        aly.m2882a("Releasing %d waiting requests for cacheKey=%s.", Integer.valueOf(queue.size()), r2);
                    }
                    this.f1237d.addAll(queue);
                }
            }
        }
    }
}
