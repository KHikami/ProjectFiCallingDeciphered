package p000;

public final class jqi extends czm {
    private static final long serialVersionUID = 9057565284386560711L;
    private final boolean f20793a;
    private final String f20794b;

    public jqi(String str, boolean z) {
        super(new StringBuilder(String.valueOf(str).length() + 40).append("Invalid content-type: ").append(str).append(", permanent: ").append(z).toString());
        this.f20793a = z;
        this.f20794b = str;
    }
}
