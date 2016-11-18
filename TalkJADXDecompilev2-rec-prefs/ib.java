package p000;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Arrays;

public class ib extends hv<Cursor> {
    final ih f794f = new ih(this);
    Uri f795g;
    String[] f796h;
    String f797i;
    String[] f798j;
    String f799k;
    Cursor f800l;
    ka f801m;

    public /* synthetic */ void mo210a(Object obj) {
        m1328b((Cursor) obj);
    }

    public /* synthetic */ void mo212b(Object obj) {
        mo626a((Cursor) obj);
    }

    public /* synthetic */ Object mo213d() {
        return mo218h();
    }

    public Cursor mo218h() {
        synchronized (this) {
            if (m1308g()) {
                throw new kb();
            }
            this.f801m = new ka();
        }
        Cursor a;
        try {
            a = hx.f17432a.mo3082a(m1286o().getContentResolver(), this.f795g, this.f796h, this.f797i, this.f798j, this.f799k, this.f801m);
            if (a != null) {
                a.getCount();
                a.registerContentObserver(this.f794f);
            }
            synchronized (this) {
                this.f801m = null;
            }
            return a;
        } catch (RuntimeException e) {
            a.close();
            throw e;
        } catch (Throwable th) {
            synchronized (this) {
                this.f801m = null;
            }
        }
    }

    public void mo217f() {
        super.mo217f();
        synchronized (this) {
            if (this.f801m != null) {
                this.f801m.m25495b();
            }
        }
    }

    public void mo626a(Cursor cursor) {
        if (!m1290s()) {
            Cursor cursor2 = this.f800l;
            this.f800l = cursor;
            if (m1288q()) {
                super.mo212b((Object) cursor);
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
        this.f795g = uri;
        this.f796h = strArr;
        this.f797i = str;
        this.f798j = strArr2;
        this.f799k = str2;
    }

    public void mo214i() {
        if (this.f800l != null) {
            mo626a(this.f800l);
        }
        if (m1297z() || this.f800l == null) {
            m1293v();
        }
    }

    public void mo215j() {
        m1292u();
    }

    public void m1328b(Cursor cursor) {
        if (cursor != null && !cursor.isClosed()) {
            cursor.close();
        }
    }

    public void mo216k() {
        super.mo216k();
        mo215j();
        if (!(this.f800l == null || this.f800l.isClosed())) {
            this.f800l.close();
        }
        this.f800l = null;
    }

    public Uri m1336l() {
        return this.f795g;
    }

    public void m1324a(Uri uri) {
        this.f795g = uri;
    }

    public void m1327a(String[] strArr) {
        this.f796h = strArr;
    }

    public String[] m1337m() {
        return this.f798j;
    }

    public void mo208a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.mo208a(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.print("mUri=");
        printWriter.println(this.f795g);
        printWriter.print(str);
        printWriter.print("mProjection=");
        printWriter.println(Arrays.toString(this.f796h));
        printWriter.print(str);
        printWriter.print("mSelection=");
        printWriter.println(this.f797i);
        printWriter.print(str);
        printWriter.print("mSelectionArgs=");
        printWriter.println(Arrays.toString(this.f798j));
        printWriter.print(str);
        printWriter.print("mSortOrder=");
        printWriter.println(this.f799k);
        printWriter.print(str);
        printWriter.print("mCursor=");
        printWriter.println(this.f800l);
        printWriter.print(str);
        printWriter.print("mContentChanged=");
        printWriter.println(this.u);
    }
}
