package defpackage;

enum mpa {
    BOOLEAN,
    STRING,
    LONG,
    DOUBLE;

    abstract int a(Object obj, Object obj2);

    static mpa a(Object obj) {
        if (obj instanceof String) {
            return STRING;
        }
        if (obj instanceof Boolean) {
            return BOOLEAN;
        }
        if (obj instanceof Long) {
            return LONG;
        }
        if (obj instanceof Double) {
            return DOUBLE;
        }
        String valueOf = String.valueOf(obj.getClass());
        throw new AssertionError(new StringBuilder(String.valueOf(valueOf).length() + 18).append("invalid tag type: ").append(valueOf).toString());
    }
}
