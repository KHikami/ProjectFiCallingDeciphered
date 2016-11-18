package p000;

import android.text.TextUtils;
import com.google.android.gms.wearable.Asset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;

public final class hxz {
    private final HashMap<String, Object> f17445a = new HashMap();

    public static hxz m21208a(byte[] bArr) {
        try {
            return gwb.m1614a(new hcd(hce.m19215a(bArr), new ArrayList()));
        } catch (Throwable e) {
            throw new IllegalArgumentException("Unable to convert data", e);
        }
    }

    private void m21209a(String str, Object obj, String str2, ClassCastException classCastException) {
        hxz.m21210a(str, obj, str2, "<null>", classCastException);
    }

    private static void m21210a(String str, Object obj, String str2, Object obj2, ClassCastException classCastException) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Key ");
        stringBuilder.append(str);
        stringBuilder.append(" expected ");
        stringBuilder.append(str2);
        stringBuilder.append(" but value was a ");
        stringBuilder.append(obj.getClass().getName());
        stringBuilder.append(".  The default value ");
        stringBuilder.append(obj2);
        stringBuilder.append(" was returned.");
    }

    private long m21211b(String str, long j) {
        Object obj = this.f17445a.get(str);
        if (obj == null) {
            return 0;
        }
        try {
            return ((Long) obj).longValue();
        } catch (ClassCastException e) {
            m21209a(str, obj, "long", e);
            return 0;
        }
    }

    private boolean m21212b(String str, boolean z) {
        Object obj = this.f17445a.get(str);
        if (obj == null) {
            return false;
        }
        try {
            return ((Boolean) obj).booleanValue();
        } catch (ClassCastException e) {
            hxz.m21210a(str, obj, "Boolean", Boolean.valueOf(false), e);
            return false;
        }
    }

    private int m21213c() {
        return this.f17445a.size();
    }

    public <T> T m21214a(String str) {
        return this.f17445a.get(str);
    }

    public void m21215a(hxz hxz) {
        for (String str : hxz.m21233b()) {
            this.f17445a.put(str, hxz.m21214a(str));
        }
    }

    public void m21216a(String str, byte b) {
        this.f17445a.put(str, Byte.valueOf(b));
    }

    public void m21217a(String str, double d) {
        this.f17445a.put(str, Double.valueOf(d));
    }

    public void m21218a(String str, float f) {
        this.f17445a.put(str, Float.valueOf(f));
    }

    public void m21219a(String str, int i) {
        this.f17445a.put(str, Integer.valueOf(i));
    }

    public void m21220a(String str, long j) {
        this.f17445a.put(str, Long.valueOf(j));
    }

    public void m21221a(String str, Asset asset) {
        this.f17445a.put(str, asset);
    }

    public void m21222a(String str, hxz hxz) {
        this.f17445a.put(str, hxz);
    }

    public void m21223a(String str, String str2) {
        this.f17445a.put(str, str2);
    }

    public void m21224a(String str, ArrayList<hxz> arrayList) {
        this.f17445a.put(str, arrayList);
    }

    public void m21225a(String str, boolean z) {
        this.f17445a.put(str, Boolean.valueOf(z));
    }

    public void m21226a(String str, byte[] bArr) {
        this.f17445a.put(str, bArr);
    }

    public void m21227a(String str, float[] fArr) {
        this.f17445a.put(str, fArr);
    }

    public void m21228a(String str, long[] jArr) {
        this.f17445a.put(str, jArr);
    }

    public void m21229a(String str, String[] strArr) {
        this.f17445a.put(str, strArr);
    }

    public byte[] m21230a() {
        return hcq.m19203a(gwb.m1610a(this).f16572a);
    }

    public int m21231b(String str, int i) {
        Object obj = this.f17445a.get(str);
        if (obj == null) {
            return 0;
        }
        try {
            return ((Integer) obj).intValue();
        } catch (ClassCastException e) {
            m21209a(str, obj, "Integer", e);
            return 0;
        }
    }

    public String m21232b(String str, String str2) {
        String e = m21239e(str);
        return e == null ? str2 : e;
    }

    public Set<String> m21233b() {
        return this.f17445a.keySet();
    }

    public void m21234b(String str, ArrayList<Integer> arrayList) {
        this.f17445a.put(str, arrayList);
    }

    public boolean m21235b(String str) {
        return m21212b(str, false);
    }

    public int m21236c(String str) {
        return m21231b(str, 0);
    }

    public void m21237c(String str, ArrayList<String> arrayList) {
        this.f17445a.put(str, arrayList);
    }

    public long m21238d(String str) {
        return m21211b(str, 0);
    }

    public String m21239e(String str) {
        Object obj = this.f17445a.get(str);
        if (obj == null) {
            return null;
        }
        try {
            return (String) obj;
        } catch (ClassCastException e) {
            m21209a(str, obj, "String", e);
            return null;
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof hxz)) {
            return false;
        }
        hxz hxz = (hxz) obj;
        if (m21213c() != hxz.m21213c()) {
            return false;
        }
        for (String str : m21233b()) {
            Object a = m21214a(str);
            Object a2 = hxz.m21214a(str);
            if (a instanceof Asset) {
                if (!(a2 instanceof Asset)) {
                    return false;
                }
                Asset asset = (Asset) a;
                Asset asset2 = (Asset) a2;
                boolean equals = (asset == null || asset2 == null) ? asset == asset2 : !TextUtils.isEmpty(asset.m10002b()) ? asset.m10002b().equals(asset2.m10002b()) : Arrays.equals(asset.m10001a(), asset2.m10001a());
                if (!equals) {
                    return false;
                }
            } else if (a instanceof String[]) {
                if (!(a2 instanceof String[])) {
                    return false;
                }
                if (!Arrays.equals((String[]) a, (String[]) a2)) {
                    return false;
                }
            } else if (a instanceof long[]) {
                if (!(a2 instanceof long[])) {
                    return false;
                }
                if (!Arrays.equals((long[]) a, (long[]) a2)) {
                    return false;
                }
            } else if (a instanceof float[]) {
                if (!(a2 instanceof float[])) {
                    return false;
                }
                if (!Arrays.equals((float[]) a, (float[]) a2)) {
                    return false;
                }
            } else if (a instanceof byte[]) {
                if (!(a2 instanceof byte[])) {
                    return false;
                }
                if (!Arrays.equals((byte[]) a, (byte[]) a2)) {
                    return false;
                }
            } else if (a == null || a2 == null) {
                if (a != a2) {
                    return false;
                }
                return true;
            } else if (!a.equals(a2)) {
                return false;
            }
        }
        return true;
    }

    public Asset m21240f(String str) {
        Object obj = this.f17445a.get(str);
        if (obj == null) {
            return null;
        }
        try {
            return (Asset) obj;
        } catch (ClassCastException e) {
            m21209a(str, obj, "Asset", e);
            return null;
        }
    }

    public int hashCode() {
        return this.f17445a.hashCode() * 29;
    }

    public String toString() {
        return this.f17445a.toString();
    }
}
