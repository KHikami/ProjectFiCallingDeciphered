package defpackage;

public enum nyn {
    INT(Integer.valueOf(0)),
    LONG(Long.valueOf(0)),
    FLOAT(Float.valueOf(0.0f)),
    DOUBLE(Double.valueOf(0.0d)),
    BOOLEAN(Boolean.valueOf(false)),
    STRING(""),
    BYTE_STRING(nvn.a),
    ENUM(null),
    MESSAGE(null);
    
    private final Object j;

    private nyn(Object obj) {
        this.j = obj;
    }
}