package defpackage;

final class nwc {
    static final Class<?> a = nwc.b();

    private static Class<?> b() {
        try {
            return Class.forName("com.google.protobuf.ExtensionRegistry");
        } catch (ClassNotFoundException e) {
            return null;
        }
    }

    public static nwd a() {
        if (a != null) {
            try {
                return (nwd) a.getMethod("getEmptyRegistry", new Class[0]).invoke(null, new Object[0]);
            } catch (Exception e) {
            }
        }
        return nwd.a;
    }
}
