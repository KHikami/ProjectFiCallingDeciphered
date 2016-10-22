package defpackage;

import java.io.FileDescriptor;
import java.io.PrintWriter;

/* compiled from: PG */
/* renamed from: eh */
final class eh implements fr {
    i a;
    gi b;
    boolean c;
    boolean d;
    boolean e;
    boolean f;
    boolean g;
    boolean h;
    private boolean i;
    private Object j;
    private boolean k;

    final void a() {
        this.d = false;
        if (!this.e && this.b != null && this.h) {
            this.h = false;
            this.b.a(this);
            this.b.b(this);
            this.b.d = false;
        }
    }

    final void b() {
        this.k = true;
        this.c = false;
        this.a = null;
        this.j = null;
        this.i = false;
        if (this.b != null) {
            if (this.h) {
                this.h = false;
                this.b.a(this);
                this.b.b(this);
            }
            gi giVar = this.b;
            giVar.f = true;
            giVar.d = false;
            giVar.e = false;
            giVar.g = false;
            giVar.h = false;
        }
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder(64);
        stringBuilder.append("LoaderInfo{");
        stringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
        stringBuilder.append(" #");
        stringBuilder.append(0);
        stringBuilder.append(" : ");
        buf.a(this.b, stringBuilder);
        stringBuilder.append("}}");
        return stringBuilder.toString();
    }

    public final void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mId=");
        printWriter.print(0);
        printWriter.print(" mArgs=");
        printWriter.println(null);
        printWriter.print(str);
        printWriter.print("mCallbacks=");
        printWriter.println(null);
        printWriter.print(str);
        printWriter.print("mLoader=");
        printWriter.println(this.b);
        if (this.b != null) {
            gi giVar = this.b;
            String str2 = str + "  ";
            printWriter.print(str2);
            printWriter.print("mId=");
            printWriter.print(giVar.a);
            printWriter.print(" mListener=");
            printWriter.println(giVar.b);
            if (giVar.d) {
                printWriter.print(str2);
                printWriter.print("mStarted=");
                printWriter.print(giVar.d);
                printWriter.print(" mContentChanged=");
                printWriter.print(false);
                printWriter.print(" mProcessingChange=");
                printWriter.println(false);
            }
            if (giVar.f) {
                printWriter.print(str2);
                printWriter.print("mAbandoned=");
                printWriter.print(false);
                printWriter.print(" mReset=");
                printWriter.println(giVar.f);
            }
        }
        if (this.c) {
            printWriter.print(str);
            printWriter.print("mHaveData=");
            printWriter.print(false);
            printWriter.print("  mDeliveredData=");
            printWriter.println(this.c);
            printWriter.print(str);
            printWriter.print("mData=");
            printWriter.println(null);
        }
        printWriter.print(str);
        printWriter.print("mStarted=");
        printWriter.print(this.d);
        printWriter.print(" mReportNextStart=");
        printWriter.print(this.g);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.k);
        printWriter.print(str);
        printWriter.print("mRetaining=");
        printWriter.print(this.e);
        printWriter.print(" mRetainingStarted=");
        printWriter.print(this.f);
        printWriter.print(" mListenerRegistered=");
        printWriter.println(this.h);
    }
}
