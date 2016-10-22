package defpackage;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.os.Build.VERSION;
import android.os.Looper;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Queue;

/* renamed from: baq */
public final class baq {
    private static final char[] a;
    private static final char[] b;

    static {
        a = "0123456789abcdef".toCharArray();
        b = new char[64];
    }

    public static String a(byte[] bArr) {
        String str;
        synchronized (b) {
            char[] cArr = b;
            for (int i = 0; i < bArr.length; i++) {
                int i2 = bArr[i] & 255;
                cArr[i << 1] = a[i2 >>> 4];
                cArr[(i << 1) + 1] = a[i2 & 15];
            }
            str = new String(cArr);
        }
        return str;
    }

    public static int a(Bitmap bitmap) {
        if (bitmap.isRecycled()) {
            String valueOf = String.valueOf(bitmap);
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            String valueOf2 = String.valueOf(bitmap.getConfig());
            throw new IllegalStateException(new StringBuilder((String.valueOf(valueOf).length() + 66) + String.valueOf(valueOf2).length()).append("Cannot obtain size for recycled Bitmap: ").append(valueOf).append("[").append(width).append("x").append(height).append("] ").append(valueOf2).toString());
        }
        if (VERSION.SDK_INT >= 19) {
            try {
                return bitmap.getAllocationByteCount();
            } catch (NullPointerException e) {
            }
        }
        return bitmap.getHeight() * bitmap.getRowBytes();
    }

    public static int a(int i, int i2, Config config) {
        int i3;
        int i4 = i * i2;
        if (config == null) {
            config = Config.ARGB_8888;
        }
        switch (bar.a[config.ordinal()]) {
            case wi.j /*1*/:
                i3 = 1;
                break;
            case wi.l /*2*/:
            case wi.z /*3*/:
                i3 = 2;
                break;
            default:
                i3 = 4;
                break;
        }
        return i3 * i4;
    }

    public static boolean a(int i, int i2) {
        return baq.b(i) && baq.b(i2);
    }

    private static boolean b(int i) {
        return i > 0 || i == nzf.UNSET_ENUM_VALUE;
    }

    public static void a() {
        if (!baq.b()) {
            throw new IllegalArgumentException("You must call this method on the main thread");
        }
    }

    public static boolean b() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    public static boolean c() {
        return !baq.b();
    }

    public static <T> Queue<T> a(int i) {
        return new ArrayDeque(i);
    }

    public static <T> List<T> a(Collection<T> collection) {
        List<T> arrayList = new ArrayList(collection.size());
        for (T add : collection) {
            arrayList.add(add);
        }
        return arrayList;
    }

    public static boolean a(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        } else {
            return obj.equals(obj2);
        }
    }
}
