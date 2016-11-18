package p000;

import com.google.api.client.http.HttpMethods;
import io.grpc.internal.bi;
import io.grpc.internal.bn;
import io.grpc.internal.cn;
import io.grpc.internal.db;
import io.grpc.internal.dc;
import io.grpc.internal.dm;
import io.grpc.internal.dn;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;
import java.util.Queue;
import java.util.concurrent.Executor;
import org.chromium.net.BidirectionalStream;
import org.chromium.net.BidirectionalStream.Builder;

final class omh extends bn {
    private static final ByteBuffer f33203m = ByteBuffer.allocateDirect(0);
    final omk f33204a;
    final Object f33205b;
    Queue<omj> f33206c = new LinkedList();
    boolean f33207d;
    olv f33208e;
    boolean f33209f;
    private final String f33210n;
    private final String f33211o;
    private final Executor f33212p;
    private final okw f33213q;
    private final Runnable f33214r;
    private final boolean f33215s;
    private BidirectionalStream f33216t;
    private boolean f33217u = false;
    private int f33218v;
    private boolean f33219w;

    public /* bridge */ /* synthetic */ Object m38719a() {
        return null;
    }

    omh(String str, String str2, Executor executor, okw okw, omk omk, Runnable runnable, Object obj, int i, boolean z, boolean z2) {
        super(new dn(), i);
        this.f33210n = (String) bm.a(str, "url");
        this.f33211o = (String) bm.a(str2, "userAgent");
        this.f33212p = (Executor) bm.a(executor, "executor");
        this.f33213q = (okw) bm.a(okw, "headers");
        this.f33204a = (omk) bm.a(omk, "transport");
        this.f33214r = (Runnable) bm.a(runnable, "startCallback");
        this.f33205b = bm.a(obj, "lock");
        this.f33215s = z;
        this.f33219w = z2;
    }

    public void m38720a(int i) {
        synchronized (this.f33205b) {
            try {
                this.h.a(i);
            } catch (Throwable th) {
                a(th);
            }
        }
    }

    public void m38723a(String str) {
        throw new UnsupportedOperationException("Cronet does not support overriding authority");
    }

    public void m38721a(db dbVar) {
        super.a(dbVar);
        this.f33214r.run();
    }

    public void m38729a(omg omg) {
        Builder a = omg.m38718a(this.f33210n, new omi(this), this.f33212p);
        if (this.f33215s) {
            a.m39321a(HttpMethods.PUT);
        }
        if (this.f33219w) {
            a.m39323a(true);
        }
        a.m39322a(bi.f.f33147a, this.f33211o);
        a.m39322a(bi.e.f33147a, "application/grpc");
        a.m39322a("te", "trailers");
        byte[][] a2 = dc.a(this.f33213q);
        for (int i = 0; i < a2.length; i += 2) {
            boolean z;
            String str = new String(a2[i], Charset.forName("UTF-8"));
            if (str.startsWith(":") || bi.e.f33147a.equalsIgnoreCase(str) || bi.f.f33147a.equalsIgnoreCase(str)) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                a.m39322a(str, new String(a2[i + 1], Charset.forName("UTF-8")));
            }
        }
        this.f33216t = a.m39324a();
        this.f33216t.m39325a();
    }

    void m38727a(List<Entry<String, String>> list, boolean z) {
        List arrayList = new ArrayList();
        for (Entry entry : list) {
            arrayList.add((String) entry.getKey());
            arrayList.add((String) entry.getValue());
        }
        byte[][] bArr = new byte[arrayList.size()][];
        for (int i = 0; i < arrayList.size(); i += 2) {
            bArr[i] = ((String) arrayList.get(i)).getBytes(Charset.forName("UTF-8"));
            bArr[i + 1] = ((String) arrayList.get(i + 1)).getBytes(Charset.forName("UTF-8"));
        }
        okw okw = new okw(dc.a(bArr));
        synchronized (this.f33205b) {
            if (z) {
                c(okw);
            } else {
                b(okw);
            }
        }
    }

    void m38725a(ByteBuffer byteBuffer, boolean z) {
        this.f33218v += byteBuffer.remaining();
        synchronized (this.f33205b) {
            super.b(cn.a(byteBuffer), z);
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void m38722a(dm dmVar, boolean z, boolean z2) {
        synchronized (this.f33205b) {
            if (this.f33217u) {
                return;
            }
            ByteBuffer c;
            if (dmVar != null) {
                c = dmVar.c();
                c.flip();
            } else {
                c = f33203m;
            }
            int remaining = c.remaining();
            synchronized (this.l) {
                this.k = remaining + this.k;
            }
            if (this.f33207d) {
                m38726a(c, z, z2);
            } else {
                this.f33206c.add(new omj(c, z, z2));
            }
        }
    }

    protected void m38730b(int i) {
        this.f33218v -= i;
        if (this.f33218v == 0 && !this.f33209f) {
            this.f33216t.m39326a(ByteBuffer.allocateDirect(4096));
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void m38728a(olv olv) {
        synchronized (this.f33205b) {
            if (this.f33217u) {
                return;
            }
            this.f33217u = true;
            this.f33208e = olv;
            for (omj omj : this.f33206c) {
                omj.f33222a.clear();
            }
            this.f33206c.clear();
            if (this.f33216t != null) {
                this.f33216t.m39329c();
            } else {
                this.f33204a.m38754a(this, olv);
            }
        }
    }

    void m38726a(ByteBuffer byteBuffer, boolean z, boolean z2) {
        this.f33216t.m39327a(byteBuffer, z);
        if (z2) {
            this.f33216t.m39328b();
        }
    }

    void m38724a(ByteBuffer byteBuffer) {
        Object obj = 1;
        int position = byteBuffer.position();
        synchronized (this.l) {
            Object obj2 = this.k < this.j ? 1 : null;
            this.k -= position;
            Object obj3;
            if (this.k < this.j) {
                obj3 = 1;
            } else {
                obj3 = null;
            }
            if (obj2 != null || r2 == null) {
                obj = null;
            }
        }
        if (obj != null) {
            k();
        }
    }
}
