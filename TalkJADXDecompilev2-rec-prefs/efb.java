package p000;

import android.content.Context;
import android.database.Cursor;
import android.os.CancellationSignal;
import com.google.android.apps.hangouts.content.EsProvider;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

final class efb extends hv<Cursor> {
    final ih f11335f = new ih(this);
    Cursor f11336g;
    CancellationSignal f11337h;
    private final bko f11338i;
    private final List<String> f11339j;

    public /* synthetic */ void mo210a(Object obj) {
        Cursor cursor = (Cursor) obj;
        if (cursor != null && !cursor.isClosed()) {
            cursor.close();
        }
    }

    public /* synthetic */ void mo212b(Object obj) {
        m13746a((Cursor) obj);
    }

    public /* synthetic */ Object mo213d() {
        return m13747l();
    }

    public efb(Context context, bko bko, List<String> list) {
        super(context);
        this.f11338i = bko;
        this.f11339j = list;
    }

    public List<String> m13753h() {
        return this.f11339j;
    }

    private Cursor m13747l() {
        String valueOf;
        synchronized (this) {
            if (m1308g()) {
                valueOf = String.valueOf(this.f11339j);
                glk.m17979c("Babel_GroupSearch", new StringBuilder(String.valueOf(valueOf).length() + 26).append(" LoadInBackgroundCanceled ").append(valueOf).toString(), new Object[0]);
                throw new kb();
            }
            this.f11337h = new CancellationSignal();
        }
        valueOf = String.valueOf(this.f11339j);
        new StringBuilder(String.valueOf(valueOf).length() + 16).append("start query for ").append(valueOf);
        if (this.f11339j == null || this.f11339j.isEmpty()) {
            return null;
        }
        Cursor rawQuery;
        try {
            List arrayList = new ArrayList();
            String a = efm.m13796a(this.f11339j, arrayList);
            String[] strArr = new String[arrayList.size()];
            arrayList.toArray(strArr);
            rawQuery = bmr.m6166a(m1286o(), this.f11338i.m5638g()).getReadableDatabase().rawQuery(a, strArr);
            if (rawQuery != null) {
                rawQuery.getCount();
                rawQuery.setNotificationUri(m1286o().getContentResolver(), EsProvider.m8251a(EsProvider.f6005h, this.f11338i.m5638g()));
                rawQuery.registerContentObserver(this.f11335f);
            }
            synchronized (this) {
                this.f11337h = null;
            }
            return rawQuery;
        } catch (Throwable e) {
            rawQuery.close();
            glk.m17978c("Babel_GroupSearch", "Error in sqlite query", e);
            synchronized (this) {
                this.f11337h = null;
                return null;
            }
        } catch (Throwable th) {
            synchronized (this) {
                this.f11337h = null;
            }
        }
    }

    public void mo217f() {
        String valueOf = String.valueOf(this.f11339j);
        new StringBuilder(String.valueOf(valueOf).length() + 16).append("cancel load for ").append(valueOf);
        super.mo217f();
        synchronized (this) {
            if (this.f11337h != null) {
                this.f11337h.cancel();
            }
        }
    }

    private void m13746a(Cursor cursor) {
        String valueOf = String.valueOf(this.f11339j);
        new StringBuilder(String.valueOf(valueOf).length() + 21).append("delivery results for ").append(valueOf);
        if (!m1290s()) {
            Cursor cursor2 = this.f11336g;
            this.f11336g = cursor;
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

    protected void mo214i() {
        if (this.f11336g != null) {
            m13746a(this.f11336g);
        }
        if (m1297z() || this.f11336g == null) {
            m1293v();
        }
    }

    protected void mo215j() {
        m1292u();
    }

    protected void mo216k() {
        super.mo216k();
        mo215j();
        if (!(this.f11336g == null || this.f11336g.isClosed())) {
            this.f11336g.close();
        }
        this.f11336g = null;
    }

    public void mo208a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.mo208a(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.print("query");
        printWriter.println(this.f11339j);
    }
}
