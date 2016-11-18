package defpackage;

import java.net.HttpURLConnection;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import org.chromium.net.UploadDataProvider;
import org.chromium.net.UploadDataSink;

final class ovo implements UploadDataSink {
    final AtomicReference<ovv> a = new AtomicReference(ovv.NOT_STARTED);
    final Executor b;
    final Executor c;
    final HttpURLConnection d;
    WritableByteChannel e;
    final UploadDataProvider f;
    ByteBuffer g;
    long h;
    long i = 0;
    final /* synthetic */ oup j;

    ovo(oup oup, Executor executor, Executor executor2, HttpURLConnection httpURLConnection, UploadDataProvider uploadDataProvider) {
        this.j = oup;
        this.b = new ovp(this, oup, executor);
        this.c = executor2;
        this.d = httpURLConnection;
        this.f = uploadDataProvider;
    }

    public void a(boolean z) {
        if (this.a.compareAndSet(ovv.AWAITING_READ_RESULT, ovv.UPLOADING)) {
            this.c.execute(this.j.a(ovw.STARTED, new ovq(this, false)));
            return;
        }
        throw new IllegalStateException("Not expecting a read result, expecting: " + this.a.get());
    }

    public void a() {
        if (this.a.compareAndSet(ovv.AWAITING_REWIND_RESULT, ovv.UPLOADING)) {
            b();
            return;
        }
        throw new IllegalStateException("Not expecting a read result");
    }

    void b() {
        this.c.execute(this.j.a(ovw.STARTED, new ovs(this)));
    }

    void c() {
        if (this.e != null) {
            this.e.close();
        }
        oup oup = this.j;
        oup.k = 13;
        oup.b.execute(oup.a(ovw.STARTED, new ouz(oup)));
    }

    void b(boolean z) {
        this.b.execute(this.j.a(new ovu(this, z)));
    }
}
