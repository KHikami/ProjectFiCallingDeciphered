package defpackage;

/* renamed from: msd */
final class msd extends Throwable {
    msd(String str) {
        super(str);
    }

    public synchronized Throwable fillInStackTrace() {
        return this;
    }
}
