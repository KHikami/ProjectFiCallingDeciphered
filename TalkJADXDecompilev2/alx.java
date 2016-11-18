package defpackage;

public class alx extends Exception {
    public final aln a;
    private long b;

    public alx() {
        this.a = null;
    }

    public alx(aln aln) {
        this.a = aln;
    }

    public alx(Throwable th) {
        super(th);
        this.a = null;
    }

    void a(long j) {
        this.b = j;
    }

    public alx(byte b) {
        this();
    }

    public alx(Throwable th, byte b) {
        this(th);
    }

    public alx(Throwable th, char c) {
        this(th, (byte) 0);
    }

    public alx(Throwable th, short s) {
        this(th);
    }

    public alx(aln aln, byte b) {
        this(aln);
    }

    public alx(int i) {
        this();
    }

    public alx(aln aln, char c) {
        this(aln, (byte) 0);
    }

    public alx(float f) {
        this();
    }
}
