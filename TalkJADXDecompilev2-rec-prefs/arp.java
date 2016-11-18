package p000;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.TreeMap;

public final class arp implements arn {
    private static final Config[] f2230a = new Config[]{Config.ARGB_8888, null};
    private static final Config[] f2231b = new Config[]{Config.RGB_565};
    private static final Config[] f2232c = new Config[]{Config.ARGB_4444};
    private static final Config[] f2233d = new Config[]{Config.ALPHA_8};
    private final ars f2234e = new ars();
    private final arg<arr, Bitmap> f2235f = new arg();
    private final Map<Config, NavigableMap<Integer, Integer>> f2236g = new HashMap();

    public void mo351a(Bitmap bitmap) {
        arr a = this.f2234e.m3881a(baq.m4681a(bitmap), bitmap.getConfig());
        this.f2235f.m3845a(a, bitmap);
        NavigableMap a2 = m3869a(bitmap.getConfig());
        Integer num = (Integer) a2.get(Integer.valueOf(a.f2238a));
        a2.put(Integer.valueOf(a.f2238a), Integer.valueOf(num == null ? 1 : num.intValue() + 1));
    }

    public Bitmap mo350a(int i, int i2, Config config) {
        Config[] configArr;
        aro a;
        Bitmap bitmap;
        int i3 = 0;
        int a2 = baq.m4680a(i, i2, config);
        aro a3 = this.f2234e.m3881a(a2, config);
        switch (arq.f2237a[config.ordinal()]) {
            case 1:
                configArr = f2230a;
                break;
            case 2:
                configArr = f2231b;
                break;
            case 3:
                configArr = f2232c;
                break;
            case 4:
                configArr = f2233d;
                break;
            default:
                configArr = new Config[]{config};
                break;
        }
        int length = configArr.length;
        while (i3 < length) {
            Config config2 = configArr[i3];
            Integer num = (Integer) m3869a(config2).ceilingKey(Integer.valueOf(a2));
            if (num == null || num.intValue() > (a2 << 3)) {
                i3++;
            } else {
                if (num.intValue() != a2 || (config2 != null ? !config2.equals(config) : config != null)) {
                    this.f2234e.m3821a(a3);
                    a = this.f2234e.m3881a(num.intValue(), config2);
                    bitmap = (Bitmap) this.f2235f.m3844a(a);
                    if (bitmap != null) {
                        m3870a(Integer.valueOf(a.f2238a), bitmap);
                        bitmap.reconfigure(i, i2, bitmap.getConfig() != null ? bitmap.getConfig() : Config.ARGB_8888);
                    }
                    return bitmap;
                }
                a = a3;
                bitmap = (Bitmap) this.f2235f.m3844a(a);
                if (bitmap != null) {
                    m3870a(Integer.valueOf(a.f2238a), bitmap);
                    if (bitmap.getConfig() != null) {
                    }
                    bitmap.reconfigure(i, i2, bitmap.getConfig() != null ? bitmap.getConfig() : Config.ARGB_8888);
                }
                return bitmap;
            }
        }
        a = a3;
        bitmap = (Bitmap) this.f2235f.m3844a(a);
        if (bitmap != null) {
            m3870a(Integer.valueOf(a.f2238a), bitmap);
            if (bitmap.getConfig() != null) {
            }
            bitmap.reconfigure(i, i2, bitmap.getConfig() != null ? bitmap.getConfig() : Config.ARGB_8888);
        }
        return bitmap;
    }

    public Bitmap mo349a() {
        Bitmap bitmap = (Bitmap) this.f2235f.m3843a();
        if (bitmap != null) {
            m3870a(Integer.valueOf(baq.m4681a(bitmap)), bitmap);
        }
        return bitmap;
    }

    private void m3870a(Integer num, Bitmap bitmap) {
        NavigableMap a = m3869a(bitmap.getConfig());
        Integer num2 = (Integer) a.get(num);
        if (num2 == null) {
            String valueOf = String.valueOf(num);
            String valueOf2 = String.valueOf(mo353b(bitmap));
            String valueOf3 = String.valueOf(this);
            throw new NullPointerException(new StringBuilder(((String.valueOf(valueOf).length() + 56) + String.valueOf(valueOf2).length()) + String.valueOf(valueOf3).length()).append("Tried to decrement empty size, size: ").append(valueOf).append(", removed: ").append(valueOf2).append(", this: ").append(valueOf3).toString());
        } else if (num2.intValue() == 1) {
            a.remove(num);
        } else {
            a.put(num, Integer.valueOf(num2.intValue() - 1));
        }
    }

    private NavigableMap<Integer, Integer> m3869a(Config config) {
        NavigableMap<Integer, Integer> navigableMap = (NavigableMap) this.f2236g.get(config);
        if (navigableMap != null) {
            return navigableMap;
        }
        NavigableMap treeMap = new TreeMap();
        this.f2236g.put(config, treeMap);
        return treeMap;
    }

    public String mo353b(Bitmap bitmap) {
        return arp.m3868a(baq.m4681a(bitmap), bitmap.getConfig());
    }

    public String mo352b(int i, int i2, Config config) {
        return arp.m3868a(baq.m4680a(i, i2, config), config);
    }

    public int mo354c(Bitmap bitmap) {
        return baq.m4681a(bitmap);
    }

    public String toString() {
        StringBuilder append = new StringBuilder("SizeConfigStrategy{groupedMap=").append(this.f2235f).append(", sortedSizes=(");
        for (Entry entry : this.f2236g.entrySet()) {
            append.append(entry.getKey()).append('[').append(entry.getValue()).append("], ");
        }
        if (!this.f2236g.isEmpty()) {
            append.replace(append.length() - 2, append.length(), "");
        }
        return append.append(")}").toString();
    }

    static String m3868a(int i, Config config) {
        String valueOf = String.valueOf(config);
        return new StringBuilder(String.valueOf(valueOf).length() + 15).append("[").append(i).append("](").append(valueOf).append(")").toString();
    }
}
