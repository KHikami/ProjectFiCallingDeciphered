package p000;

import java.net.HttpURLConnection;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import org.chromium.net.UploadDataProvider;
import org.chromium.net.UploadDataSink;

final class ovo implements UploadDataSink {
    final AtomicReference<ovv> f34378a = new AtomicReference(ovv.NOT_STARTED);
    final Executor f34379b;
    final Executor f34380c;
    final HttpURLConnection f34381d;
    WritableByteChannel f34382e;
    final UploadDataProvider f34383f;
    ByteBuffer f34384g;
    long f34385h;
    long f34386i = 0;
    final /* synthetic */ oup f34387j;

    ovo(oup oup, Executor executor, Executor executor2, HttpURLConnection httpURLConnection, UploadDataProvider uploadDataProvider) {
        this.f34387j = oup;
        this.f34379b = new ovp(this, oup, executor);
        this.f34380c = executor2;
        this.f34381d = httpURLConnection;
        this.f34383f = uploadDataProvider;
    }

    public void mo4237a(boolean z) {
        if (this.f34378a.compareAndSet(ovv.AWAITING_READ_RESULT, ovv.UPLOADING)) {
            this.f34380c.execute(this.f34387j.m39741a(ovw.STARTED, new ovq(this, false)));
            return;
        }
        throw new IllegalStateException("Not expecting a read result, expecting: " + this.f34378a.get());
    }

    public void mo4236a() {
        if (this.f34378a.compareAndSet(ovv.AWAITING_REWIND_RESULT, ovv.UPLOADING)) {
            m39772b();
            return;
        }
        throw new IllegalStateException("Not expecting a read result");
    }

    void m39772b() {
        this.f34380c.execute(this.f34387j.m39741a(ovw.STARTED, new ovs(this)));
    }

    void m39774c() {
        if (this.f34382e != null) {
            this.f34382e.close();
        }
        oup oup = this.f34387j;
        oup.f34328k = 13;
        oup.f34319b.execute(oup.m39741a(ovw.STARTED, new ouz(oup)));
    }

    void m39773b(boolean z) {
        this.f34379b.execute(this.f34387j.m39740a(new ovu(this, z)));
    }
}
