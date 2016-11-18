package p000;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.os.Build.VERSION;
import android.os.Looper;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Queue;

public final class baq {
    private static final char[] f2740a = "0123456789abcdef".toCharArray();
    private static final char[] f2741b = new char[64];

    public static String m4682a(byte[] bArr) {
        String str;
        synchronized (f2741b) {
            char[] cArr = f2741b;
            for (int i = 0; i < bArr.length; i++) {
                int i2 = bArr[i] & 255;
                cArr[i << 1] = f2740a[i2 >>> 4];
                cArr[(i << 1) + 1] = f2740a[i2 & 15];
            }
            str = new String(cArr);
        }
        return str;
    }

    public static int m4681a(Bitmap bitmap) {
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

    public static int m4680a(int i, int i2, Config config) {
        int i3;
        int i4 = i * i2;
        if (config == null) {
            config = Config.ARGB_8888;
        }
        switch (bar.f2742a[config.ordinal()]) {
            case 1:
                i3 = 1;
                break;
            case 2:
            case 3:
                i3 = 2;
                break;
            default:
                i3 = 4;
                break;
        }
        return i3 * i4;
    }

    public static boolean m4686a(int i, int i2) {
        return baq.m4689b(i) && baq.m4689b(i2);
    }

    private static boolean m4689b(int i) {
        return i > 0 || i == nzf.UNSET_ENUM_VALUE;
    }

    public static void m4685a() {
        if (!baq.m4688b()) {
            throw new IllegalArgumentException("You must call this method on the main thread");
        }
    }

    public static boolean m4688b() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    public static boolean m4690c() {
        return !baq.m4688b();
    }

    public static <T> Queue<T> m4684a(int i) {
        return new ArrayDeque(i);
    }

    public static <T> List<T> m4683a(Collection<T> collection) {
        List<T> arrayList = new ArrayList(collection.size());
        for (T add : collection) {
            arrayList.add(add);
        }
        return arrayList;
    }

    public static boolean m4687a(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        } else {
            return obj.equals(obj2);
        }
    }
}
