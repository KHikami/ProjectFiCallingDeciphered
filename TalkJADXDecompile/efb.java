import android.content.Context;
import android.database.Cursor;
import android.os.CancellationSignal;
import com.google.android.apps.hangouts.content.EsProvider;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

final class efb extends hv<Cursor> {
    final ih f;
    Cursor g;
    CancellationSignal h;
    private final bko i;
    private final List<String> j;

    public /* synthetic */ void a(Object obj) {
        Cursor cursor = (Cursor) obj;
        if (cursor != null && !cursor.isClosed()) {
            cursor.close();
        }
    }

    public /* synthetic */ void b(Object obj) {
        a((Cursor) obj);
    }

    public /* synthetic */ Object d() {
        return l();
    }

    public efb(Context context, bko bko, List<String> list) {
        super(context);
        this.i = bko;
        this.f = new ih(this);
        this.j = list;
    }

    public List<String> h() {
        return this.j;
    }

    private Cursor l() {
        String valueOf;
        synchronized (this) {
            if (g()) {
                valueOf = String.valueOf(this.j);
                glk.c("Babel_GroupSearch", new StringBuilder(String.valueOf(valueOf).length() + 26).append(" LoadInBackgroundCanceled ").append(valueOf).toString(), new Object[0]);
                throw new kb();
            }
            this.h = new CancellationSignal();
        }
        valueOf = String.valueOf(this.j);
        new StringBuilder(String.valueOf(valueOf).length() + 16).append("start query for ").append(valueOf);
        if (this.j == null || this.j.isEmpty()) {
            return null;
        }
        Cursor rawQuery;
        try {
            List arrayList = new ArrayList();
            String a = efm.a(this.j, arrayList);
            String[] strArr = new String[arrayList.size()];
            arrayList.toArray(strArr);
            rawQuery = bmr.a(o(), this.i.g()).getReadableDatabase().rawQuery(a, strArr);
            if (rawQuery != null) {
                rawQuery.getCount();
                rawQuery.setNotificationUri(o().getContentResolver(), EsProvider.a(EsProvider.h, this.i.g()));
                rawQuery.registerContentObserver(this.f);
            }
            synchronized (this) {
                this.h = null;
            }
            return rawQuery;
        } catch (Throwable e) {
            rawQuery.close();
            glk.c("Babel_GroupSearch", "Error in sqlite query", e);
            synchronized (this) {
            }
            this.h = null;
            return null;
        } catch (Throwable th) {
            synchronized (this) {
            }
            this.h = null;
        }
    }

    public void f() {
        String valueOf = String.valueOf(this.j);
        new StringBuilder(String.valueOf(valueOf).length() + 16).append("cancel load for ").append(valueOf);
        super.f();
        synchronized (this) {
            if (this.h != null) {
                this.h.cancel();
            }
        }
    }

    private void a(Cursor cursor) {
        String valueOf = String.valueOf(this.j);
        new StringBuilder(String.valueOf(valueOf).length() + 21).append("delivery results for ").append(valueOf);
        if (!s()) {
            Cursor cursor2 = this.g;
            this.g = cursor;
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

    protected void i() {
        if (this.g != null) {
            a(this.g);
        }
        if (z() || this.g == null) {
            v();
        }
    }

    protected void j() {
        u();
    }

    protected void k() {
        super.k();
        j();
        if (!(this.g == null || this.g.isClosed())) {
            this.g.close();
        }
        this.g = null;
    }

    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.a(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.print("query");
        printWriter.println(this.j);
    }
}
