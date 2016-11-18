package p000;

import android.content.Context;
import android.database.Cursor;
import android.os.Bundle;

final class chw implements dcz, kcd, kcn, kcq {
    private Context f5347a;
    private bko f5348b;
    private int f5349c = 1;
    private int f5350d = 2;
    private long f5351e = -1;
    private long f5352f = -1;
    private chx f5353g;

    public void mo645b(Bundle bundle) {
        bundle.putLong("key_last_compose_time_ms", this.f5351e);
        bundle.putLong("key_otr_on_timestamp_ms", this.f5352f);
    }

    public void mo643a(Bundle bundle) {
        if (bundle != null) {
            this.f5351e = bundle.getLong("key_last_compose_time_ms", -1);
            this.f5352f = bundle.getLong("key_otr_on_timestamp_ms", -1);
        }
    }

    chw(Context context, bko bko, kbu kbu) {
        this.f5347a = context;
        this.f5348b = bko;
        kbu.m25514a((kcq) this);
        this.f5353g = (chx) jyn.m25426a(context, chx.class);
    }

    public boolean mo975a() {
        return this.f5349c == 2;
    }

    public boolean mo976b() {
        return this.f5348b.m5643l();
    }

    public boolean mo977c() {
        return this.f5353g.mo873t();
    }

    int m7694d() {
        return this.f5349c;
    }

    int m7695e() {
        return this.f5350d;
    }

    void m7686a(Cursor cursor) {
        this.f5349c = cursor.getInt(7);
        this.f5350d = cursor.getInt(8);
    }

    void m7685a(long j) {
        if (this.f5351e == -1) {
            this.f5351e = j;
        }
    }

    void m7690b(long j) {
        if (j > this.f5352f) {
            this.f5352f = j;
        }
    }

    boolean m7689a(ed edVar) {
        if (this.f5351e == -1 || this.f5352f == -1 || this.f5352f <= this.f5351e) {
            this.f5351e = -1;
            this.f5352f = -1;
            return true;
        }
        chv.m7680a(true, this.f5347a, edVar);
        this.f5352f = -1;
        this.f5351e = -1;
        return false;
    }
}
