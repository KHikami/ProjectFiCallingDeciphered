package p000;

final class nwc {
    static final Class<?> f31165a = nwc.m36918b();

    private static Class<?> m36918b() {
        try {
            return Class.forName("com.google.protobuf.ExtensionRegistry");
        } catch (ClassNotFoundException e) {
            return null;
        }
    }

    public static nwd m36917a() {
        if (f31165a != null) {
            try {
                return (nwd) f31165a.getMethod("getEmptyRegistry", new Class[0]).invoke(null, new Object[0]);
            } catch (Exception e) {
            }
        }
        return nwd.f31166a;
    }
}
