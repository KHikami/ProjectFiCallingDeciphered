package p000;

import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import com.google.android.libraries.hangouts.util.MemoryManager.MemoryCache;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class ld<K, V> implements MemoryCache {
    private final LinkedHashMap<K, V> f709a;
    private int f710b;
    private int f711c;
    private int f712d;
    private int f713e;
    private int f714f;
    private int f715g;

    public ld(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.f711c = i;
        this.f709a = new LinkedHashMap(0, 0.75f, true);
    }

    public final V m1200a(K k) {
        if (k == null) {
            throw new NullPointerException("key == null");
        }
        synchronized (this) {
            V v = this.f709a.get(k);
            if (v != null) {
                this.f714f++;
                return v;
            }
            this.f715g++;
            return null;
        }
    }

    public final V m1201a(K k, V v) {
        if (k == null || v == null) {
            throw new NullPointerException("key == null || value == null");
        }
        V put;
        synchronized (this) {
            this.f712d++;
            this.f710b += m1196c(k, v);
            put = this.f709a.put(k, v);
            if (put != null) {
                this.f710b -= m1196c(k, put);
            }
        }
        if (put != null) {
            mo189a(false, k, put, v);
        }
        m1202a(this.f711c);
        return put;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m1202a(int i) {
        while (true) {
            Object key;
            Object value;
            synchronized (this) {
                if (this.f710b >= 0 && (!this.f709a.isEmpty() || this.f710b == 0)) {
                    if (this.f710b <= i || this.f709a.isEmpty()) {
                    } else {
                        Entry entry = (Entry) this.f709a.entrySet().iterator().next();
                        key = entry.getKey();
                        value = entry.getValue();
                        this.f709a.remove(key);
                        this.f710b -= m1196c(key, value);
                        this.f713e++;
                    }
                }
            }
            mo189a(true, key, value, null);
        }
    }

    public final V m1206b(K k) {
        if (k == null) {
            throw new NullPointerException("key == null");
        }
        V remove;
        synchronized (this) {
            remove = this.f709a.remove(k);
            if (remove != null) {
                this.f710b -= m1196c(k, remove);
            }
        }
        if (remove != null) {
            mo189a(false, k, remove, null);
        }
        return remove;
    }

    public void mo189a(boolean z, K k, V v, V v2) {
    }

    private int m1196c(K k, V v) {
        int b = mo3556b((Object) k, (Object) v);
        if (b >= 0) {
            return b;
        }
        throw new IllegalStateException("Negative size: " + k + "=" + v);
    }

    public int mo3556b(K k, V v) {
        return 1;
    }

    public final synchronized int m1197a() {
        return this.f710b;
    }

    public final synchronized int m1204b() {
        return this.f711c;
    }

    public final synchronized int m1208c() {
        return this.f714f;
    }

    public final synchronized int m1209d() {
        return this.f715g;
    }

    public final synchronized int m1210e() {
        return this.f712d;
    }

    public final synchronized int m1211f() {
        return this.f713e;
    }

    public final synchronized Map<K, V> m1212g() {
        return new LinkedHashMap(this.f709a);
    }

    public final synchronized String toString() {
        String format;
        int i = 0;
        synchronized (this) {
            int i2 = this.f714f + this.f715g;
            if (i2 != 0) {
                i = (this.f714f * 100) / i2;
            }
            format = String.format("LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", new Object[]{Integer.valueOf(this.f711c), Integer.valueOf(this.f714f), Integer.valueOf(this.f715g), Integer.valueOf(i)});
        }
        return format;
    }

    public ld(int i, byte b) {
        this(6);
    }

    public PorterDuffColorFilter m1198a(int i, Mode mode) {
        return (PorterDuffColorFilter) m1200a(Integer.valueOf(ld.m1195b(i, mode)));
    }

    public PorterDuffColorFilter m1199a(int i, Mode mode, PorterDuffColorFilter porterDuffColorFilter) {
        return (PorterDuffColorFilter) m1201a(Integer.valueOf(ld.m1195b(i, mode)), (Object) porterDuffColorFilter);
    }

    public static int m1195b(int i, Mode mode) {
        return ((i + 31) * 31) + mode.hashCode();
    }

    public ld() {
        this(1000);
    }

    public void mo2283h() {
        m1202a(-1);
    }

    public void mo2282b(int i) {
        switch (i) {
            case 10:
                m1202a(m1204b() / 2);
                return;
            case 15:
            case 60:
            case 80:
                m1202a(-1);
                return;
            default:
                return;
        }
    }
}
