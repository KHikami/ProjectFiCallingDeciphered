package p000;

public final class jfs extends RuntimeException {
    public jfs(Throwable th) {
        super(th);
    }

    public jfs(String str) {
        super(str);
    }
}
