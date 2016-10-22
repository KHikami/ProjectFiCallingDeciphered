import android.content.Context;
import android.database.Cursor;
import android.os.Bundle;

final class chw implements dcz, kcd, kcn, kcq {
    private Context a;
    private bko b;
    private int c;
    private int d;
    private long e;
    private long f;
    private chx g;

    public void b(Bundle bundle) {
        bundle.putLong("key_last_compose_time_ms", this.e);
        bundle.putLong("key_otr_on_timestamp_ms", this.f);
    }

    public void a(Bundle bundle) {
        if (bundle != null) {
            this.e = bundle.getLong("key_last_compose_time_ms", -1);
            this.f = bundle.getLong("key_otr_on_timestamp_ms", -1);
        }
    }

    chw(Context context, bko bko, kbu kbu) {
        this.c = 1;
        this.d = 2;
        this.e = -1;
        this.f = -1;
        this.a = context;
        this.b = bko;
        kbu.a((kcq) this);
        this.g = (chx) jyn.a(context, chx.class);
    }

    public boolean a() {
        return this.c == 2;
    }

    public boolean b() {
        return this.b.l();
    }

    public boolean c() {
        return this.g.t();
    }

    int d() {
        return this.c;
    }

    int e() {
        return this.d;
    }

    void a(Cursor cursor) {
        this.c = cursor.getInt(7);
        this.d = cursor.getInt(8);
    }

    void a(long j) {
        if (this.e == -1) {
            this.e = j;
        }
    }

    void b(long j) {
        if (j > this.f) {
            this.f = j;
        }
    }

    boolean a(ed edVar) {
        if (this.e == -1 || this.f == -1 || this.f <= this.e) {
            this.e = -1;
            this.f = -1;
            return true;
        }
        chv.a(true, this.a, edVar);
        this.f = -1;
        this.e = -1;
        return false;
    }
}
