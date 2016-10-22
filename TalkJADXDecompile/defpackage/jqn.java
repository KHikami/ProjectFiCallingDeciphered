package defpackage;

/* renamed from: jqn */
public final class jqn extends Exception {
    private static final long serialVersionUID = -2575549139581664777L;
    private final String a;
    private final boolean b;

    private jqn(String str, String str2, boolean z) {
        super(str);
        this.a = str2;
        this.b = z;
    }

    public jqn(Exception exception, String str) {
        super(exception);
        this.a = str;
        this.b = false;
    }

    public jqn(String str) {
        this(str, null, false);
    }

    public jqn(String str, boolean z) {
        this(str, null, true);
    }

    public jqn(String str, String str2) {
        this(str, str2, false);
    }
}
