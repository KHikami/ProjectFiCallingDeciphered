package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: cqw */
public class cqw implements bnq {
    private final Context a;
    private final boz b;
    private final Map<String, bnn> c;
    private final Map<String, Bitmap> d;
    private final Map<String, String> e;
    private final Object f;
    private CountDownLatch g;
    private boolean h;

    cqw(Context context) {
        this.c = new ConcurrentHashMap();
        this.d = new ConcurrentHashMap();
        this.e = new ConcurrentHashMap();
        this.f = new Object();
        this.a = context;
        this.b = (boz) jyn.a(context, boz.class);
    }

    public void a() {
        this.c.clear();
        this.d.clear();
        this.g = null;
        this.h = false;
    }

    public boolean a(String str, String str2, String str3, String str4) {
        ba.a((Object) str2);
        ba.a((Object) str3);
        if (this.h) {
            return false;
        }
        int i;
        if (TextUtils.isEmpty(str4)) {
            i = 0;
        } else {
            i = str4.split(", ").length;
        }
        List arrayList = new ArrayList();
        List arrayList2 = new ArrayList();
        gwb.a(str3, arrayList, arrayList2);
        String stringBuilder = new StringBuilder((String.valueOf(str2).length() + 1) + String.valueOf(str3).length()).append(str2).append(".").append(str3).toString();
        frj a = bjw.a(arrayList, i - arrayList.size(), arrayList2, str, this.b.a(), stringBuilder, this, null, null, false, bjy.NONE, true);
        fsi fsi = (fsi) jyn.a(this.a, fsi.class);
        if (a == null || a.c() == null) {
            glk.d("Babel_DirectSharing", "Failed to create a request for an avatar image.", new Object[0]);
            return false;
        }
        String c = a.c();
        fsi.a(a);
        if (!this.c.containsKey(c)) {
            this.c.put(c, a);
        }
        this.e.put(stringBuilder, c);
        return true;
    }

    public void b() {
        for (Entry entry : this.c.entrySet()) {
            if (!this.d.containsKey(entry.getKey())) {
                ((bnn) entry.getValue()).b();
            }
        }
    }

    public Bitmap a(String str, String str2) {
        String str3 = (String) this.e.get(new StringBuilder((String.valueOf(str).length() + 1) + String.valueOf(str2).length()).append(str).append(".").append(str2).toString());
        if (str3 != null) {
            return (Bitmap) this.d.get(str3);
        }
        return null;
    }

    public void a(long j) {
        this.h = true;
        synchronized (this.f) {
            this.g = new CountDownLatch(this.c.size() - this.d.size());
        }
        try {
            this.g.await(j, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    public void a(gkt gkt, gjo gjo, boolean z, bnn bnn, boolean z2) {
        boolean z3 = false;
        if (gjo == null) {
            z3 = true;
        }
        ba.a(z3, (Object) "Expected a null GIF image.");
        if (z && gkt != null) {
            synchronized (this.f) {
                Bitmap e = gkt.e();
                e = e.copy(e.getConfig(), false);
                gkt.b();
                this.d.put(bnn.c(), e);
                if (this.g != null) {
                    this.g.countDown();
                }
            }
        }
    }
}
