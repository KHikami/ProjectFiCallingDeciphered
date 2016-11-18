package p000;

public class icr extends Exception {
    public icr(String str) {
        super(str);
    }

    public icr(String str, Throwable th) {
        super(str, th);
    }

    public icr(Throwable th) {
        super(th);
    }
}
