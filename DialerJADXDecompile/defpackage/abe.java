package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.media.ThumbnailUtils;
import android.net.Uri;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Message;
import android.util.Log;
import android.util.LruCache;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import java.lang.ref.SoftReference;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* renamed from: abe */
final class abe extends aaz implements Callback {
    static final String[] b;
    static final String[] c;
    private static final abh i;
    private static int j;
    final Context d;
    final LruCache e;
    final int f;
    final Handler g;
    String h;
    private final LruCache k;
    private final ConcurrentHashMap l;
    private volatile boolean m;
    private abi n;
    private boolean o;
    private boolean p;

    static {
        b = new String[0];
        c = new String[]{"_id", "data15"};
        abh abh = new abh(new byte[0], 0);
        i = abh;
        abh.e = new SoftReference(null);
    }

    public abe(Context context) {
        this.l = new ConcurrentHashMap();
        this.g = new Handler(this);
        AtomicInteger atomicInteger = new AtomicInteger();
        atomicInteger = new AtomicInteger();
        this.m = true;
        this.d = context;
        float f = ((ActivityManager) context.getSystemService("activity")).isLowRamDevice() ? 0.5f : 1.0f;
        this.k = new abf(this, (int) (1769472.0f * f));
        int i = (int) (2000000.0f * f);
        this.e = new abg(this, i);
        this.f = (int) (((double) i) * 0.75d);
        new StringBuilder(26).append("Cache adj: ").append(f);
        j = context.getResources().getDimensionPixelSize(buf.cN);
        this.h = buf.c(context).a();
        if (this.h == null) {
            this.h = "";
        }
    }

    private static boolean a(View view, View view2) {
        return view2.getParent() != null && (view2.getParent() == view || ((view2.getParent() instanceof ViewGroup) && abe.a(view, (ViewGroup) view2.getParent())));
    }

    private static void a(abh abh, int i) {
        int d = buf.d(abh.b, i);
        byte[] bArr = abh.a;
        if (bArr != null && bArr.length != 0) {
            if (d == abh.f && abh.e != null) {
                abh.d = (Bitmap) abh.e.get();
                if (abh.d != null) {
                    return;
                }
            }
            try {
                Bitmap a = buf.a(bArr, d);
                int height = a.getHeight();
                int width = a.getWidth();
                if (height != width && Math.min(height, width) <= (j << 1)) {
                    height = Math.min(height, width);
                    a = ThumbnailUtils.extractThumbnail(a, height, height);
                }
                abh.f = d;
                abh.d = a;
                abh.e = new SoftReference(a);
            } catch (OutOfMemoryError e) {
            }
        }
    }

    public final void onTrimMemory(int i) {
        if (i >= 60) {
            this.l.clear();
            this.e.evictAll();
            this.k.evictAll();
        }
    }

    public final void d() {
        f();
        this.n.b();
    }

    public final void a(ImageView imageView, long j, boolean z, boolean z2, abc abc, abb abb) {
        if (j == 0) {
            abb.a(imageView, abc);
            this.l.remove(imageView);
            return;
        }
        a(imageView, new abj(j, null, -1, z, z2, abb));
    }

    public final void a(ImageView imageView, Uri uri, int i, boolean z, boolean z2, abc abc, abb abb) {
        if (uri == null) {
            abb.a(imageView, abc);
            this.l.remove(imageView);
        } else if ("defaultimage".equals(uri.getScheme())) {
            abc c = aaz.c(uri);
            c.j = z2;
            abb.a(imageView, c);
        } else {
            a(imageView, new abj(0, uri, i, z, z2, abb));
        }
    }

    private final void a(ImageView imageView, abj abj) {
        if (a(imageView, abj, false)) {
            this.l.remove(imageView);
            return;
        }
        this.l.put(imageView, abj);
        if (!this.p) {
            e();
        }
    }

    public final void a(View view) {
        if (view == null) {
            this.l.clear();
            return;
        }
        Iterator it = this.l.entrySet().iterator();
        while (it.hasNext()) {
            View view2 = (ImageView) ((Entry) it.next()).getKey();
            if (view2.getParent() == null || abe.a(view, view2)) {
                it.remove();
            }
        }
    }

    public final void c() {
        if (!this.m) {
            this.m = true;
            for (abh abh : this.e.snapshot().values()) {
                if (abh != i) {
                    abh.c = false;
                }
            }
        }
    }

    private final boolean a(ImageView imageView, abj abj, boolean z) {
        abh abh = (abh) this.e.get(abj.a());
        if (abh == null) {
            abj.a(imageView, abj.d);
            return false;
        } else if (abh.a == null) {
            abj.a(imageView, abj.d);
            return abh.c;
        } else {
            Bitmap bitmap = abh.e == null ? null : (Bitmap) abh.e.get();
            if (bitmap == null) {
                abj.a(imageView, abj.d);
                return false;
            }
            Drawable a;
            imageView.getDrawable();
            Resources resources = this.d.getResources();
            if (abj.d) {
                a = buf.a(resources, bitmap);
                a.a(true);
                a.a((float) (bitmap.getHeight() / 2));
            } else {
                a = new BitmapDrawable(resources, bitmap);
            }
            imageView.setImageDrawable(a);
            if (bitmap.getByteCount() < this.k.maxSize() / 6) {
                this.k.put(abj.a(), bitmap);
            }
            abh.d = null;
            return abh.c;
        }
    }

    public final void a() {
        this.p = true;
    }

    public final void b() {
        this.p = false;
        if (!this.l.isEmpty()) {
            e();
        }
    }

    private final void e() {
        if (!this.o) {
            this.o = true;
            this.g.sendEmptyMessage(1);
        }
    }

    public final boolean handleMessage(Message message) {
        switch (message.what) {
            case rq.b /*1*/:
                this.o = false;
                if (!this.p) {
                    f();
                    abi abi = this.n;
                    abi.a();
                    abi.a.removeMessages(0);
                    abi.a.sendEmptyMessage(1);
                }
                return true;
            case rq.c /*2*/:
                if (!this.p) {
                    Iterator it = this.l.entrySet().iterator();
                    while (it.hasNext()) {
                        Entry entry = (Entry) it.next();
                        if (a((ImageView) entry.getKey(), (abj) entry.getValue(), false)) {
                            it.remove();
                        }
                    }
                    for (abh abh : this.e.snapshot().values()) {
                        abh.d = null;
                    }
                    if (!this.l.isEmpty()) {
                        e();
                    }
                }
                return true;
            default:
                return false;
        }
    }

    private void f() {
        if (this.n == null) {
            this.n = new abi(this, this.d.getContentResolver());
            this.n.start();
        }
    }

    private final void a(Object obj, byte[] bArr, boolean z, int i) {
        abh abh = new abh(bArr, bArr == null ? -1 : buf.a(bArr));
        if (!z) {
            abe.a(abh, i);
        }
        if (bArr != null) {
            this.e.put(obj, abh);
            if (this.e.get(obj) != abh) {
                Log.w("ContactPhotoManager", "Bitmap too big to fit in cache.");
                this.e.put(obj, i);
            }
        } else {
            this.e.put(obj, i);
        }
        this.m = false;
    }

    final void a(Set set, Set set2, Set set3) {
        set.clear();
        set2.clear();
        set3.clear();
        Object obj = null;
        for (abj abj : this.l.values()) {
            abh abh = (abh) this.e.get(abj.a());
            if (abh != i) {
                if (abh != null && abh.a != null && abh.c && (abh.e == null || abh.e.get() == null)) {
                    abe.a(abh, abj.c);
                    obj = 1;
                } else if (abh == null || !abh.c) {
                    Object obj2;
                    if (abj.b != null) {
                        obj2 = 1;
                    } else {
                        obj2 = null;
                    }
                    if (obj2 != null) {
                        set3.add(abj);
                    } else {
                        set.add(Long.valueOf(abj.a));
                        set2.add(String.valueOf(abj.a));
                    }
                }
            }
        }
        if (obj != null) {
            this.g.sendEmptyMessage(2);
        }
    }
}
