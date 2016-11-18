package p000;

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

public class cqw implements bnq {
    private final Context f8895a;
    private final boz f8896b;
    private final Map<String, bnn> f8897c = new ConcurrentHashMap();
    private final Map<String, Bitmap> f8898d = new ConcurrentHashMap();
    private final Map<String, String> f8899e = new ConcurrentHashMap();
    private final Object f8900f = new Object();
    private CountDownLatch f8901g;
    private boolean f8902h;

    cqw(Context context) {
        this.f8895a = context;
        this.f8896b = (boz) jyn.m25426a(context, boz.class);
    }

    public void m10743a() {
        this.f8897c.clear();
        this.f8898d.clear();
        this.f8901g = null;
        this.f8902h = false;
    }

    public boolean m10746a(String str, String str2, String str3, String str4) {
        ba.m4536a((Object) str2);
        ba.m4536a((Object) str3);
        if (this.f8902h) {
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
        gwb.m1871a(str3, arrayList, arrayList2);
        String stringBuilder = new StringBuilder((String.valueOf(str2).length() + 1) + String.valueOf(str3).length()).append(str2).append(".").append(str3).toString();
        frj a = bjw.m5528a(arrayList, i - arrayList.size(), arrayList2, str, this.f8896b.mo636a(), stringBuilder, this, null, null, false, bjy.NONE, true);
        fsi fsi = (fsi) jyn.m25426a(this.f8895a, fsi.class);
        if (a == null || a.mo594c() == null) {
            glk.m17981d("Babel_DirectSharing", "Failed to create a request for an avatar image.", new Object[0]);
            return false;
        }
        String c = a.mo594c();
        fsi.mo2072a(a);
        if (!this.f8897c.containsKey(c)) {
            this.f8897c.put(c, a);
        }
        this.f8899e.put(stringBuilder, c);
        return true;
    }

    public void m10747b() {
        for (Entry entry : this.f8897c.entrySet()) {
            if (!this.f8898d.containsKey(entry.getKey())) {
                ((bnn) entry.getValue()).mo607b();
            }
        }
    }

    public Bitmap m10742a(String str, String str2) {
        String str3 = (String) this.f8899e.get(new StringBuilder((String.valueOf(str).length() + 1) + String.valueOf(str2).length()).append(str).append(".").append(str2).toString());
        if (str3 != null) {
            return (Bitmap) this.f8898d.get(str3);
        }
        return null;
    }

    public void m10744a(long j) {
        this.f8902h = true;
        synchronized (this.f8900f) {
            this.f8901g = new CountDownLatch(this.f8897c.size() - this.f8898d.size());
        }
        try {
            this.f8901g.await(j, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    public void mo604a(gkt gkt, gjo gjo, boolean z, bnn bnn, boolean z2) {
        boolean z3 = false;
        if (gjo == null) {
            z3 = true;
        }
        ba.m4578a(z3, (Object) "Expected a null GIF image.");
        if (z && gkt != null) {
            synchronized (this.f8900f) {
                Bitmap e = gkt.m17898e();
                e = e.copy(e.getConfig(), false);
                gkt.mo2292b();
                this.f8898d.put(bnn.mo594c(), e);
                if (this.f8901g != null) {
                    this.f8901g.countDown();
                }
            }
        }
    }
}
