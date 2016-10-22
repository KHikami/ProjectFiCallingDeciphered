public final class fxy extends ahz {
    private static final long serialVersionUID = 1;
    public final int a;

    public fxy(int i) {
        this.a = 119;
    }

    public fxy(int i, String str) {
        super(str);
        this.a = i;
    }

    public fxy(int i, Throwable th) {
        super(th);
        this.a = 119;
    }

    public fxy(int i, String str, Throwable th) {
        super(str, th);
        this.a = 136;
    }
}
