package io.grpc.internal;

import cob;
import dbv;
import dfo;
import dfp;
import dgi;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: PG */
public final class bn {
    co a;
    dfp b;
    boolean c;
    final bp d;
    final byte[] e;
    final cp f;
    boolean g;
    private final bq h;

    public bn(bq bqVar, cp cpVar) {
        this.b = dfo.a;
        this.d = new bp(this);
        this.e = new byte[5];
        this.h = (bq) cob.b((Object) bqVar, (Object) "sink");
        this.f = (cp) cob.b((Object) cpVar, (Object) "bufferAllocator");
    }

    final int a(InputStream inputStream) {
        bo boVar = new bo(this);
        OutputStream a = this.b.a(boVar);
        try {
            int a2 = a(inputStream, a);
            a(boVar, true);
            return a2;
        } finally {
            a.close();
        }
    }

    final void a(bo boVar, boolean z) {
        byte b;
        ByteBuffer wrap = ByteBuffer.wrap(this.e);
        if (z) {
            b = (byte) 1;
        } else {
            b = (byte) 0;
        }
        wrap.put(b);
        int i = 0;
        for (co b2 : boVar.a) {
            i = b2.b() + i;
        }
        wrap.putInt(i);
        co b22 = this.f.a(5);
        b22.a(this.e, 0, wrap.position());
        if (i == 0) {
            this.a = b22;
            return;
        }
        this.h.a(b22, false, false);
        List list = boVar.a;
        for (i = 0; i < list.size() - 1; i++) {
            this.h.a((co) list.get(i), false, false);
        }
        this.a = (co) list.get(list.size() - 1);
    }

    static int a(InputStream inputStream, OutputStream outputStream) {
        if (inputStream instanceof dgi) {
            return ((dgi) inputStream).a();
        }
        long a = dbv.a(inputStream, outputStream);
        cob.a(a <= 2147483647L, "Message size overflow: %s", a);
        return (int) a;
    }

    final void a(byte[] bArr, int i, int i2) {
        while (i2 > 0) {
            if (this.a != null && this.a.a() == 0) {
                a(false, false);
            }
            if (this.a == null) {
                this.a = this.f.a(i2);
            }
            int min = Math.min(i2, this.a.a());
            this.a.a(bArr, i, min);
            i += min;
            i2 -= min;
        }
    }

    final void a() {
        if (this.a != null) {
            this.a = null;
        }
    }

    final void a(boolean z, boolean z2) {
        co coVar = this.a;
        this.a = null;
        this.h.a(coVar, z, z2);
    }
}
