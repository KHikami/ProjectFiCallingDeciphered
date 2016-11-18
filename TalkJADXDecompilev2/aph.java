package defpackage;

final /* synthetic */ class aph {
    static final /* synthetic */ int[] a = new int[apm.values().length];
    static final /* synthetic */ int[] b = new int[apn.values().length];

    static {
        try {
            b[apn.RESOURCE_CACHE.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
        }
        try {
            b[apn.DATA_CACHE.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
        }
        try {
            b[apn.SOURCE.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
        }
        try {
            b[apn.FINISHED.ordinal()] = 4;
        } catch (NoSuchFieldError e4) {
        }
        try {
            b[apn.INITIALIZE.ordinal()] = 5;
        } catch (NoSuchFieldError e5) {
        }
        try {
            a[apm.INITIALIZE.ordinal()] = 1;
        } catch (NoSuchFieldError e6) {
        }
        try {
            a[apm.SWITCH_TO_SOURCE_SERVICE.ordinal()] = 2;
        } catch (NoSuchFieldError e7) {
        }
        try {
            a[apm.DECODE_DATA.ordinal()] = 3;
        } catch (NoSuchFieldError e8) {
        }
    }
}
