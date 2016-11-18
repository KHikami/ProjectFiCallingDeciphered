package p000;

public final class jqn extends Exception {
    private static final long serialVersionUID = -2575549139581664777L;
    private final String f20795a;
    private final boolean f20796b;

    private jqn(String str, String str2, boolean z) {
        super(str);
        this.f20795a = str2;
        this.f20796b = z;
    }

    public jqn(Exception exception, String str) {
        super(exception);
        this.f20795a = str;
        this.f20796b = false;
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
