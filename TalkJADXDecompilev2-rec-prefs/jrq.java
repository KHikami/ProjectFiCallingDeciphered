package p000;

import java.io.Closeable;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import java.util.concurrent.atomic.AtomicReference;
import org.chromium.net.UploadDataProvider;
import org.chromium.net.UploadDataSink;

final class jrq extends UploadDataProvider {
    final AtomicReference<ReadableByteChannel> f20903a = new AtomicReference(null);
    final long f20904b;
    long f20905c = 0;
    final /* synthetic */ jro f20906d;

    jrq(jro jro, long j) {
        this.f20906d = jro;
        this.f20904b = j;
    }

    public long m25097a() {
        return this.f20904b;
    }

    public void m25099a(UploadDataSink uploadDataSink, ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        while (position == byteBuffer.position()) {
            if (m25096c().read(byteBuffer) == -1) {
                throw new IOException("Insufficient bytes");
            }
        }
        this.f20905c = ((long) (byteBuffer.position() - position)) + this.f20905c;
        if (this.f20905c > this.f20904b) {
            throw new IOException("Incorrect length");
        }
        uploadDataSink.a(false);
    }

    public void m25098a(UploadDataSink uploadDataSink) {
        this.f20905c = 0;
        ba.m4571a((ReadableByteChannel) this.f20903a.getAndSet(m25095b()));
    }

    private jsl<ReadableByteChannel> m25095b() {
        return new jsl(Channels.newChannel(this.f20906d.f20892j.m25094a()), this.f20906d.f20893k, this.f20904b);
    }

    private ReadableByteChannel m25096c() {
        ReadableByteChannel readableByteChannel = (ReadableByteChannel) this.f20903a.get();
        if (readableByteChannel != null) {
            return readableByteChannel;
        }
        synchronized (this.f20903a) {
            if (this.f20903a.get() == null) {
                Closeable b = m25095b();
                if (!this.f20903a.compareAndSet(null, b)) {
                    ba.m4571a(b);
                }
            }
        }
        return (ReadableByteChannel) this.f20903a.get();
    }

    public void close() {
        ba.m4571a((Closeable) this.f20903a.getAndSet(null));
    }
}
