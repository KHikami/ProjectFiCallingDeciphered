package p000;

import android.graphics.Bitmap.Config;

final /* synthetic */ class arq {
    static final /* synthetic */ int[] f2237a = new int[Config.values().length];

    static {
        try {
            f2237a[Config.ARGB_8888.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
        }
        try {
            f2237a[Config.RGB_565.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
        }
        try {
            f2237a[Config.ARGB_4444.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
        }
        try {
            f2237a[Config.ALPHA_8.ordinal()] = 4;
        } catch (NoSuchFieldError e4) {
        }
    }
}
