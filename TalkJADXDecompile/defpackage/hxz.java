package defpackage;

import android.text.TextUtils;
import com.google.android.gms.wearable.Asset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;

/* renamed from: hxz */
public final class hxz {
    private final HashMap<String, Object> a;

    public hxz() {
        this.a = new HashMap();
    }

    public static hxz a(byte[] bArr) {
        try {
            return gwb.a(new hcd(hce.a(bArr), new ArrayList()));
        } catch (Throwable e) {
            throw new IllegalArgumentException("Unable to convert data", e);
        }
    }

    private void a(String str, Object obj, String str2, ClassCastException classCastException) {
        hxz.a(str, obj, str2, "<null>", classCastException);
    }

    private static void a(String str, Object obj, String str2, Object obj2, ClassCastException classCastException) {
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

    private long b(String str, long j) {
        Object obj = this.a.get(str);
        if (obj == null) {
            return 0;
        }
        try {
            return ((Long) obj).longValue();
        } catch (ClassCastException e) {
            a(str, obj, "long", e);
            return 0;
        }
    }

    private boolean b(String str, boolean z) {
        Object obj = this.a.get(str);
        if (obj == null) {
            return false;
        }
        try {
            return ((Boolean) obj).booleanValue();
        } catch (ClassCastException e) {
            hxz.a(str, obj, "Boolean", Boolean.valueOf(false), e);
            return false;
        }
    }

    private int c() {
        return this.a.size();
    }

    public <T> T a(String str) {
        return this.a.get(str);
    }

    public void a(hxz hxz) {
        for (String str : hxz.b()) {
            this.a.put(str, hxz.a(str));
        }
    }

    public void a(String str, byte b) {
        this.a.put(str, Byte.valueOf(b));
    }

    public void a(String str, double d) {
        this.a.put(str, Double.valueOf(d));
    }

    public void a(String str, float f) {
        this.a.put(str, Float.valueOf(f));
    }

    public void a(String str, int i) {
        this.a.put(str, Integer.valueOf(i));
    }

    public void a(String str, long j) {
        this.a.put(str, Long.valueOf(j));
    }

    public void a(String str, Asset asset) {
        this.a.put(str, asset);
    }

    public void a(String str, hxz hxz) {
        this.a.put(str, hxz);
    }

    public void a(String str, String str2) {
        this.a.put(str, str2);
    }

    public void a(String str, ArrayList<hxz> arrayList) {
        this.a.put(str, arrayList);
    }

    public void a(String str, boolean z) {
        this.a.put(str, Boolean.valueOf(z));
    }

    public void a(String str, byte[] bArr) {
        this.a.put(str, bArr);
    }

    public void a(String str, float[] fArr) {
        this.a.put(str, fArr);
    }

    public void a(String str, long[] jArr) {
        this.a.put(str, jArr);
    }

    public void a(String str, String[] strArr) {
        this.a.put(str, strArr);
    }

    public byte[] a() {
        return hcq.a(gwb.a(this).a);
    }

    public int b(String str, int i) {
        Object obj = this.a.get(str);
        if (obj == null) {
            return 0;
        }
        try {
            return ((Integer) obj).intValue();
        } catch (ClassCastException e) {
            a(str, obj, "Integer", e);
            return 0;
        }
    }

    public String b(String str, String str2) {
        String e = e(str);
        return e == null ? str2 : e;
    }

    public Set<String> b() {
        return this.a.keySet();
    }

    public void b(String str, ArrayList<Integer> arrayList) {
        this.a.put(str, arrayList);
    }

    public boolean b(String str) {
        return b(str, false);
    }

    public int c(String str) {
        return b(str, 0);
    }

    public void c(String str, ArrayList<String> arrayList) {
        this.a.put(str, arrayList);
    }

    public long d(String str) {
        return b(str, 0);
    }

    public String e(String str) {
        Object obj = this.a.get(str);
        if (obj == null) {
            return null;
        }
        try {
            return (String) obj;
        } catch (ClassCastException e) {
            a(str, obj, "String", e);
            return null;
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof hxz)) {
            return false;
        }
        hxz hxz = (hxz) obj;
        if (c() != hxz.c()) {
            return false;
        }
        for (String str : b()) {
            Object a = a(str);
            Object a2 = hxz.a(str);
            if (a instanceof Asset) {
                if (!(a2 instanceof Asset)) {
                    return false;
                }
                Asset asset = (Asset) a;
                Asset asset2 = (Asset) a2;
                boolean equals = (asset == null || asset2 == null) ? asset == asset2 : !TextUtils.isEmpty(asset.b()) ? asset.b().equals(asset2.b()) : Arrays.equals(asset.a(), asset2.a());
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

    public Asset f(String str) {
        Object obj = this.a.get(str);
        if (obj == null) {
            return null;
        }
        try {
            return (Asset) obj;
        } catch (ClassCastException e) {
            a(str, obj, "Asset", e);
            return null;
        }
    }

    public int hashCode() {
        return this.a.hashCode() * 29;
    }

    public String toString() {
        return this.a.toString();
    }
}
