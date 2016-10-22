package defpackage;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.TreeMap;

/* renamed from: arp */
public final class arp implements arn {
    private static final Config[] a;
    private static final Config[] b;
    private static final Config[] c;
    private static final Config[] d;
    private final ars e;
    private final arg<arr, Bitmap> f;
    private final Map<Config, NavigableMap<Integer, Integer>> g;

    public arp() {
        this.e = new ars();
        this.f = new arg();
        this.g = new HashMap();
    }

    static {
        a = new Config[]{Config.ARGB_8888, null};
        b = new Config[]{Config.RGB_565};
        c = new Config[]{Config.ARGB_4444};
        d = new Config[]{Config.ALPHA_8};
    }

    public void a(Bitmap bitmap) {
        arr a = this.e.a(baq.a(bitmap), bitmap.getConfig());
        this.f.a(a, bitmap);
        NavigableMap a2 = a(bitmap.getConfig());
        Integer num = (Integer) a2.get(Integer.valueOf(a.a));
        a2.put(Integer.valueOf(a.a), Integer.valueOf(num == null ? 1 : num.intValue() + 1));
    }

    public Bitmap a(int i, int i2, Config config) {
        Config[] configArr;
        aro a;
        Bitmap bitmap;
        int i3 = 0;
        int a2 = baq.a(i, i2, config);
        aro a3 = this.e.a(a2, config);
        switch (arq.a[config.ordinal()]) {
            case wi.j /*1*/:
                configArr = a;
                break;
            case wi.l /*2*/:
                configArr = b;
                break;
            case wi.z /*3*/:
                configArr = c;
                break;
            case wi.h /*4*/:
                configArr = d;
                break;
            default:
                configArr = new Config[]{config};
                break;
        }
        int length = configArr.length;
        while (i3 < length) {
            Config config2 = configArr[i3];
            Integer num = (Integer) a(config2).ceilingKey(Integer.valueOf(a2));
            if (num == null || num.intValue() > (a2 << 3)) {
                i3++;
            } else {
                if (num.intValue() != a2 || (config2 != null ? !config2.equals(config) : config != null)) {
                    this.e.a(a3);
                    a = this.e.a(num.intValue(), config2);
                    bitmap = (Bitmap) this.f.a(a);
                    if (bitmap != null) {
                        a(Integer.valueOf(a.a), bitmap);
                        bitmap.reconfigure(i, i2, bitmap.getConfig() != null ? bitmap.getConfig() : Config.ARGB_8888);
                    }
                    return bitmap;
                }
                a = a3;
                bitmap = (Bitmap) this.f.a(a);
                if (bitmap != null) {
                    a(Integer.valueOf(a.a), bitmap);
                    if (bitmap.getConfig() != null) {
                    }
                    bitmap.reconfigure(i, i2, bitmap.getConfig() != null ? bitmap.getConfig() : Config.ARGB_8888);
                }
                return bitmap;
            }
        }
        a = a3;
        bitmap = (Bitmap) this.f.a(a);
        if (bitmap != null) {
            a(Integer.valueOf(a.a), bitmap);
            if (bitmap.getConfig() != null) {
            }
            bitmap.reconfigure(i, i2, bitmap.getConfig() != null ? bitmap.getConfig() : Config.ARGB_8888);
        }
        return bitmap;
    }

    public Bitmap a() {
        Bitmap bitmap = (Bitmap) this.f.a();
        if (bitmap != null) {
            a(Integer.valueOf(baq.a(bitmap)), bitmap);
        }
        return bitmap;
    }

    private void a(Integer num, Bitmap bitmap) {
        NavigableMap a = a(bitmap.getConfig());
        Integer num2 = (Integer) a.get(num);
        if (num2 == null) {
            String valueOf = String.valueOf(num);
            String valueOf2 = String.valueOf(b(bitmap));
            String valueOf3 = String.valueOf(this);
            throw new NullPointerException(new StringBuilder(((String.valueOf(valueOf).length() + 56) + String.valueOf(valueOf2).length()) + String.valueOf(valueOf3).length()).append("Tried to decrement empty size, size: ").append(valueOf).append(", removed: ").append(valueOf2).append(", this: ").append(valueOf3).toString());
        } else if (num2.intValue() == 1) {
            a.remove(num);
        } else {
            a.put(num, Integer.valueOf(num2.intValue() - 1));
        }
    }

    private NavigableMap<Integer, Integer> a(Config config) {
        NavigableMap<Integer, Integer> navigableMap = (NavigableMap) this.g.get(config);
        if (navigableMap != null) {
            return navigableMap;
        }
        NavigableMap treeMap = new TreeMap();
        this.g.put(config, treeMap);
        return treeMap;
    }

    public String b(Bitmap bitmap) {
        return arp.a(baq.a(bitmap), bitmap.getConfig());
    }

    public String b(int i, int i2, Config config) {
        return arp.a(baq.a(i, i2, config), config);
    }

    public int c(Bitmap bitmap) {
        return baq.a(bitmap);
    }

    public String toString() {
        StringBuilder append = new StringBuilder("SizeConfigStrategy{groupedMap=").append(this.f).append(", sortedSizes=(");
        for (Entry entry : this.g.entrySet()) {
            append.append(entry.getKey()).append('[').append(entry.getValue()).append("], ");
        }
        if (!this.g.isEmpty()) {
            append.replace(append.length() - 2, append.length(), "");
        }
        return append.append(")}").toString();
    }

    static String a(int i, Config config) {
        String valueOf = String.valueOf(config);
        return new StringBuilder(String.valueOf(valueOf).length() + 15).append("[").append(i).append("](").append(valueOf).append(")").toString();
    }
}
