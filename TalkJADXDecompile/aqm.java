import android.util.Log;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class aqm extends Exception {
    private static final StackTraceElement[] a;
    private final List<Exception> b;
    private anv c;
    private anq d;
    private Class<?> e;

    static {
        a = new StackTraceElement[0];
    }

    public aqm(String str) {
        this(str, Collections.emptyList());
    }

    public aqm(String str, Exception exception) {
        this(str, Collections.singletonList(exception));
    }

    public aqm(String str, List<Exception> list) {
        super(str);
        setStackTrace(a);
        this.b = list;
    }

    void a(anv anv, anq anq) {
        a(anv, anq, null);
    }

    void a(anv anv, anq anq, Class<?> cls) {
        this.c = anv;
        this.d = anq;
        this.e = cls;
    }

    public Throwable fillInStackTrace() {
        return this;
    }

    private List<Exception> a() {
        return this.b;
    }

    private List<Exception> b() {
        List arrayList = new ArrayList();
        a((Exception) this, arrayList);
        return arrayList;
    }

    public void a(String str) {
        String valueOf = String.valueOf(getClass());
        String valueOf2 = String.valueOf(getMessage());
        Log.e(str, new StringBuilder((String.valueOf(valueOf).length() + 2) + String.valueOf(valueOf2).length()).append(valueOf).append(": ").append(valueOf2).toString());
        List b = b();
        int size = b.size();
        for (int i = 0; i < size; i++) {
            new StringBuilder(39).append("Root cause (").append(i + 1).append(" of ").append(size).append(")");
            b.get(i);
        }
    }

    private void a(Exception exception, List<Exception> list) {
        if (exception instanceof aqm) {
            for (Exception a : ((aqm) exception).a()) {
                a(a, (List) list);
            }
            return;
        }
        list.add(exception);
    }

    public void printStackTrace() {
        printStackTrace(System.err);
    }

    public void printStackTrace(PrintStream printStream) {
        a((Appendable) printStream);
    }

    public void printStackTrace(PrintWriter printWriter) {
        a((Appendable) printWriter);
    }

    private void a(Appendable appendable) {
        a((Exception) this, appendable);
        List a = a();
        Appendable aqn = new aqn(appendable);
        try {
            int size = a.size();
            for (int i = 0; i < size; i++) {
                aqn.append("Cause (").append(String.valueOf(i + 1)).append(" of ").append(String.valueOf(size)).append("): ");
                Exception exception = (Exception) a.get(i);
                if (exception instanceof aqm) {
                    ((aqm) exception).a(aqn);
                } else {
                    a(exception, aqn);
                }
            }
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public String getMessage() {
        String valueOf;
        String valueOf2;
        String valueOf3;
        String valueOf4 = String.valueOf(super.getMessage());
        if (this.e != null) {
            valueOf = String.valueOf(this.e);
            valueOf = new StringBuilder(String.valueOf(valueOf).length() + 2).append(", ").append(valueOf).toString();
        } else {
            valueOf = "";
        }
        if (this.d != null) {
            valueOf2 = String.valueOf(this.d);
            valueOf2 = new StringBuilder(String.valueOf(valueOf2).length() + 2).append(", ").append(valueOf2).toString();
        } else {
            valueOf2 = "";
        }
        if (this.c != null) {
            valueOf3 = String.valueOf(this.c);
            valueOf3 = new StringBuilder(String.valueOf(valueOf3).length() + 2).append(", ").append(valueOf3).toString();
        } else {
            valueOf3 = "";
        }
        return new StringBuilder((((String.valueOf(valueOf4).length() + 0) + String.valueOf(valueOf).length()) + String.valueOf(valueOf2).length()) + String.valueOf(valueOf3).length()).append(valueOf4).append(valueOf).append(valueOf2).append(valueOf3).toString();
    }

    private static void a(Exception exception, Appendable appendable) {
        try {
            appendable.append(exception.getClass().toString()).append(": ").append(exception.getMessage()).append('\n');
        } catch (IOException e) {
            throw new RuntimeException(exception);
        }
    }
}
