package defpackage;

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
    private AtomicInteger a;
    private final Map<String, Queue<alo<?>>> b;
    private final Set<alo<?>> c;
    private final PriorityBlockingQueue<alo<?>> d;
    private final PriorityBlockingQueue<alo<?>> e;
    private final alf f;
    private final all g;
    private final alv h;
    private alm[] i;
    private alh j;
    private List<a> k;

    private alr(alf alf, all all, int i, alv alv) {
        this.a = new AtomicInteger();
        this.b = new HashMap();
        this.c = new HashSet();
        this.d = new PriorityBlockingQueue();
        this.e = new PriorityBlockingQueue();
        this.k = new ArrayList();
        this.f = alf;
        this.g = all;
        this.i = new alm[i];
        this.h = alv;
    }

    public alr(alf alf, all all, int i) {
        this(alf, all, i, new alv(new Handler(Looper.getMainLooper())));
    }

    public void a() {
        c();
        this.j = new alh(this.d, this.e, this.f, this.h);
        this.j.start();
        for (int i = 0; i < this.i.length; i++) {
            alm alm = new alm(this.e, this.g, this.f, this.h);
            this.i[i] = alm;
            alm.start();
        }
    }

    private void c() {
        if (this.j != null) {
            this.j.a();
        }
        for (int i = 0; i < this.i.length; i++) {
            if (this.i[i] != null) {
                this.i[i].a();
            }
        }
    }

    private int d() {
        return this.a.incrementAndGet();
    }

    public alf b() {
        return this.f;
    }

    public <T> alo<T> a(alo<T> alo_T) {
        alo_T.a(this);
        synchronized (this.c) {
            this.c.add(alo_T);
        }
        alo_T.b = Integer.valueOf(d());
        alo_T.a("add-to-queue");
        if (alo_T.c) {
            synchronized (this.b) {
                String d = alo_T.d();
                if (this.b.containsKey(d)) {
                    Queue queue = (Queue) this.b.get(d);
                    if (queue == null) {
                        queue = new LinkedList();
                    }
                    queue.add(alo_T);
                    this.b.put(d, queue);
                    if (aly.b) {
                        aly.a("Request for cacheKey=%s is in flight, putting on hold.", d);
                    }
                } else {
                    this.b.put(d, null);
                    this.d.add(alo_T);
                }
            }
        } else {
            this.e.add(alo_T);
        }
        return alo_T;
    }

    <T> void b(alo<T> alo_T) {
        synchronized (this.c) {
            this.c.remove(alo_T);
        }
        synchronized (this.k) {
            Iterator it = this.k.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
        if (alo_T.c) {
            synchronized (this.b) {
                Queue queue = (Queue) this.b.remove(alo_T.d());
                if (queue != null) {
                    if (aly.b) {
                        aly.a("Releasing %d waiting requests for cacheKey=%s.", Integer.valueOf(queue.size()), r2);
                    }
                    this.d.addAll(queue);
                }
            }
        }
    }
}
