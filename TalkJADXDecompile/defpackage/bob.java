package defpackage;

/* renamed from: bob */
final /* synthetic */ class bob {
    static final /* synthetic */ int[] a;

    static {
        a = new int[ets.values().length];
        try {
            a[ets.PUBLIC_ACL.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
        }
        try {
            a[ets.PHONE_ACL.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
        }
        try {
            a[ets.EMAIL_ACL.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
        }
        try {
            a[ets.CIRCLE_ACL.ordinal()] = 4;
        } catch (NoSuchFieldError e4) {
        }
    }
}
