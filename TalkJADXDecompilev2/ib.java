package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Arrays;

public class ib extends hv<Cursor> {
    final ih f = new ih(this);
    Uri g;
    String[] h;
    String i;
    String[] j;
    String k;
    Cursor l;
    ka m;

    public /* synthetic */ void a(Object obj) {
        b((Cursor) obj);
    }

    public /* synthetic */ void b(Object obj) {
        a((Cursor) obj);
    }

    public /* synthetic */ Object d() {
        return h();
    }

    public Cursor h() {
        synchronized (this) {
            if (g()) {
                throw new kb();
            }
            this.m = new ka();
        }
        Cursor a;
        try {
            a = hx.a.a(o().getContentResolver(), this.g, this.h, this.i, this.j, this.k, this.m);
            if (a != null) {
                a.getCount();
                a.registerContentObserver(this.f);
            }
            synchronized (this) {
                this.m = null;
            }
            return a;
        } catch (RuntimeException e) {
            a.close();
            throw e;
        } catch (Throwable th) {
            synchronized (this) {
                this.m = null;
            }
        }
    }

    public void f() {
        super.f();
        synchronized (this) {
            if (this.m != null) {
                this.m.b();
            }
        }
    }

    public void a(Cursor cursor) {
        if (!s()) {
            Cursor cursor2 = this.l;
            this.l = cursor;
            if (q()) {
                super.b((Object) cursor);
            }
            if (cursor2 != null && cursor2 != cursor && !cursor2.isClosed()) {
                cursor2.close();
            }
        } else if (cursor != null) {
            cursor.close();
        }
    }

    public ib(Context context) {
        super(context);
    }

    public ib(Context context, Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        super(context);
        this.g = uri;
        this.h = strArr;
        this.i = str;
        this.j = strArr2;
        this.k = str2;
    }

    public void i() {
        if (this.l != null) {
            a(this.l);
        }
        if (z() || this.l == null) {
            v();
        }
    }

    public void j() {
        u();
    }

    public void b(Cursor cursor) {
        if (cursor != null && !cursor.isClosed()) {
            cursor.close();
        }
    }

    public void k() {
        super.k();
        j();
        if (!(this.l == null || this.l.isClosed())) {
            this.l.close();
        }
        this.l = null;
    }

    public Uri l() {
        return this.g;
    }

    public void a(Uri uri) {
        this.g = uri;
    }

    public void a(String[] strArr) {
        this.h = strArr;
    }

    public String[] m() {
        return this.j;
    }

    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.a(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.print("mUri=");
        printWriter.println(this.g);
        printWriter.print(str);
        printWriter.print("mProjection=");
        printWriter.println(Arrays.toString(this.h));
        printWriter.print(str);
        printWriter.print("mSelection=");
        printWriter.println(this.i);
        printWriter.print(str);
        printWriter.print("mSelectionArgs=");
        printWriter.println(Arrays.toString(this.j));
        printWriter.print(str);
        printWriter.print("mSortOrder=");
        printWriter.println(this.k);
        printWriter.print(str);
        printWriter.print("mCursor=");
        printWriter.println(this.l);
        printWriter.print(str);
        printWriter.print("mContentChanged=");
        printWriter.println(this.u);
    }
}
