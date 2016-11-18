package defpackage;

public enum asq {
    IGNORE,
    LOG,
    THROW;
    
    public static final asq d = null;

    static {
        d = LOG;
    }

    protected void a(Throwable th) {
    }
}
