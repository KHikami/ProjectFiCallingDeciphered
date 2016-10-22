public final class jqi extends czm {
    private static final long serialVersionUID = 9057565284386560711L;
    private final boolean a;
    private final String b;

    public jqi(String str, boolean z) {
        super(new StringBuilder(String.valueOf(str).length() + 40).append("Invalid content-type: ").append(str).append(", permanent: ").append(z).toString());
        this.a = z;
        this.b = str;
    }
}
