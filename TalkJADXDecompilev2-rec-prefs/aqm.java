package p000;

import android.util.Log;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class aqm extends Exception {
    private static final StackTraceElement[] f2143a = new StackTraceElement[0];
    private final List<Exception> f2144b;
    private anv f2145c;
    private anq f2146d;
    private Class<?> f2147e;

    public aqm(String str) {
        this(str, Collections.emptyList());
    }

    public aqm(String str, Exception exception) {
        this(str, Collections.singletonList(exception));
    }

    public aqm(String str, List<Exception> list) {
        super(str);
        setStackTrace(f2143a);
        this.f2144b = list;
    }

    void m3747a(anv anv, anq anq) {
        m3748a(anv, anq, null);
    }

    void m3748a(anv anv, anq anq, Class<?> cls) {
        this.f2145c = anv;
        this.f2146d = anq;
        this.f2147e = cls;
    }

    public Throwable fillInStackTrace() {
        return this;
    }

    private List<Exception> m3742a() {
        return this.f2144b;
    }

    private List<Exception> m3746b() {
        List arrayList = new ArrayList();
        m3745a((Exception) this, arrayList);
        return arrayList;
    }

    public void m3749a(String str) {
        String valueOf = String.valueOf(getClass());
        String valueOf2 = String.valueOf(getMessage());
        Log.e(str, new StringBuilder((String.valueOf(valueOf).length() + 2) + String.valueOf(valueOf2).length()).append(valueOf).append(": ").append(valueOf2).toString());
        List b = m3746b();
        int size = b.size();
        for (int i = 0; i < size; i++) {
            new StringBuilder(39).append("Root cause (").append(i + 1).append(" of ").append(size).append(")");
            b.get(i);
        }
    }

    private void m3745a(Exception exception, List<Exception> list) {
        if (exception instanceof aqm) {
            for (Exception a : ((aqm) exception).m3742a()) {
                m3745a(a, (List) list);
            }
            return;
        }
        list.add(exception);
    }

    public void printStackTrace() {
        printStackTrace(System.err);
    }

    public void printStackTrace(PrintStream printStream) {
        m3743a((Appendable) printStream);
    }

    public void printStackTrace(PrintWriter printWriter) {
        m3743a((Appendable) printWriter);
    }

    private void m3743a(Appendable appendable) {
        aqm.m3744a((Exception) this, appendable);
        List a = m3742a();
        Appendable aqn = new aqn(appendable);
        try {
            int size = a.size();
            for (int i = 0; i < size; i++) {
                aqn.append("Cause (").append(String.valueOf(i + 1)).append(" of ").append(String.valueOf(size)).append("): ");
                Exception exception = (Exception) a.get(i);
                if (exception instanceof aqm) {
                    ((aqm) exception).m3743a(aqn);
                } else {
                    aqm.m3744a(exception, aqn);
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
        if (this.f2147e != null) {
            valueOf = String.valueOf(this.f2147e);
            valueOf = new StringBuilder(String.valueOf(valueOf).length() + 2).append(", ").append(valueOf).toString();
        } else {
            valueOf = "";
        }
        if (this.f2146d != null) {
            valueOf2 = String.valueOf(this.f2146d);
            valueOf2 = new StringBuilder(String.valueOf(valueOf2).length() + 2).append(", ").append(valueOf2).toString();
        } else {
            valueOf2 = "";
        }
        if (this.f2145c != null) {
            valueOf3 = String.valueOf(this.f2145c);
            valueOf3 = new StringBuilder(String.valueOf(valueOf3).length() + 2).append(", ").append(valueOf3).toString();
        } else {
            valueOf3 = "";
        }
        return new StringBuilder((((String.valueOf(valueOf4).length() + 0) + String.valueOf(valueOf).length()) + String.valueOf(valueOf2).length()) + String.valueOf(valueOf3).length()).append(valueOf4).append(valueOf).append(valueOf2).append(valueOf3).toString();
    }

    private static void m3744a(Exception exception, Appendable appendable) {
        try {
            appendable.append(exception.getClass().toString()).append(": ").append(exception.getMessage()).append('\n');
        } catch (IOException e) {
            throw new RuntimeException(exception);
        }
    }
}
