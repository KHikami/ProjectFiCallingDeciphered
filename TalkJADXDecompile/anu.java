import java.io.IOException;

public final class anu extends IOException {
    private final int a;

    public anu(int i) {
        this("Http request failed with status code: " + i, i);
    }

    public anu(String str) {
        this(str, -1);
    }

    public anu(String str, int i) {
        this(str, i, null);
    }

    private anu(String str, int i, Throwable th) {
        super(str, null);
        this.a = i;
    }

    public int a() {
        return this.a;
    }
}
