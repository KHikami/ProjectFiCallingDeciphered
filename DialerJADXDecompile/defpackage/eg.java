package defpackage;

import android.util.Log;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;

/* compiled from: PG */
/* renamed from: eg */
final class eg extends ef {
    static boolean a;
    final ik b;
    final String c;
    boolean d;
    boolean e;
    dk f;
    private ik g;

    static {
        a = false;
    }

    final void b() {
        if (this.d) {
            Throwable runtimeException = new RuntimeException("here");
            runtimeException.fillInStackTrace();
            Log.w("LoaderManager", "Called doStart when already started: " + this, runtimeException);
            return;
        }
        this.d = true;
        for (int b = this.b.b() - 1; b >= 0; b--) {
            eh ehVar = (eh) this.b.c(b);
            if (ehVar.e && ehVar.f) {
                ehVar.d = true;
            } else if (ehVar.d) {
                continue;
            } else {
                ehVar.d = true;
                if (ehVar.b == null) {
                    continue;
                } else if (!ehVar.b.getClass().isMemberClass() || Modifier.isStatic(ehVar.b.getClass().getModifiers())) {
                    if (!ehVar.h) {
                        gi giVar = ehVar.b;
                        if (giVar.b != null) {
                            throw new IllegalStateException("There is already a listener registered");
                        }
                        giVar.b = ehVar;
                        giVar.a = 0;
                        giVar = ehVar.b;
                        if (giVar.c != null) {
                            throw new IllegalStateException("There is already a listener registered");
                        }
                        giVar.c = ehVar;
                        ehVar.h = true;
                    }
                    gi giVar2 = ehVar.b;
                    giVar2.d = true;
                    giVar2.f = false;
                    giVar2.e = false;
                } else {
                    throw new IllegalArgumentException("Object returned from onCreateLoader must not be a non-static inner member class: " + ehVar.b);
                }
            }
        }
    }

    final void c() {
        if (this.d) {
            for (int b = this.b.b() - 1; b >= 0; b--) {
                ((eh) this.b.c(b)).a();
            }
            this.d = false;
            return;
        }
        Throwable runtimeException = new RuntimeException("here");
        runtimeException.fillInStackTrace();
        Log.w("LoaderManager", "Called doStop when not started: " + this, runtimeException);
    }

    final void d() {
        if (this.d) {
            this.e = true;
            this.d = false;
            for (int b = this.b.b() - 1; b >= 0; b--) {
                eh ehVar = (eh) this.b.c(b);
                ehVar.e = true;
                ehVar.f = ehVar.d;
                ehVar.d = false;
                ehVar.a = null;
            }
            return;
        }
        Throwable runtimeException = new RuntimeException("here");
        runtimeException.fillInStackTrace();
        Log.w("LoaderManager", "Called doRetain when not started: " + this, runtimeException);
    }

    final void e() {
        for (int b = this.b.b() - 1; b >= 0; b--) {
            ((eh) this.b.c(b)).g = true;
        }
    }

    final void f() {
        for (int b = this.b.b() - 1; b >= 0; b--) {
            eh ehVar = (eh) this.b.c(b);
            if (ehVar.d && ehVar.g) {
                ehVar.g = false;
            }
        }
    }

    final void g() {
        int b;
        if (!this.e) {
            for (b = this.b.b() - 1; b >= 0; b--) {
                ((eh) this.b.c(b)).b();
            }
            this.b.c();
        }
        for (b = this.g.b() - 1; b >= 0; b--) {
            ((eh) this.g.c(b)).b();
        }
        this.g.c();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder(128);
        stringBuilder.append("LoaderManager{");
        stringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
        stringBuilder.append(" in ");
        buf.a(this.f, stringBuilder);
        stringBuilder.append("}}");
        return stringBuilder.toString();
    }

    public final void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int i = 0;
        if (this.b.b() > 0) {
            printWriter.print(str);
            printWriter.println("Active Loaders:");
            String str2 = str + "    ";
            for (int i2 = 0; i2 < this.b.b(); i2++) {
                eh ehVar = (eh) this.b.c(i2);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(this.b.b(i2));
                printWriter.print(": ");
                printWriter.println(ehVar.toString());
                ehVar.a(str2, fileDescriptor, printWriter, strArr);
            }
        }
        if (this.g.b() > 0) {
            printWriter.print(str);
            printWriter.println("Inactive Loaders:");
            String str3 = str + "    ";
            while (i < this.g.b()) {
                ehVar = (eh) this.g.c(i);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(this.g.b(i));
                printWriter.print(": ");
                printWriter.println(ehVar.toString());
                ehVar.a(str3, fileDescriptor, printWriter, strArr);
                i++;
            }
        }
    }

    public final boolean a() {
        int b = this.b.b();
        boolean z = false;
        for (int i = 0; i < b; i++) {
            int i2;
            eh ehVar = (eh) this.b.c(i);
            if (!ehVar.d || ehVar.c) {
                i2 = 0;
            } else {
                i2 = 1;
            }
            z |= i2;
        }
        return z;
    }
}
