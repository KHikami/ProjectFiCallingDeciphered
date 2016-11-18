package p000;

import java.io.File;
import java.nio.ByteBuffer;

final class ath implements aoe<ByteBuffer> {
    private final File f2315a;

    public ath(File file) {
        this.f2315a = file;
    }

    public void mo312a(amq amq, aof<? super ByteBuffer> aof__super_java_nio_ByteBuffer) {
        try {
            aof__super_java_nio_ByteBuffer.mo326a(bah.m4665a(this.f2315a));
        } catch (Exception e) {
            aof__super_java_nio_ByteBuffer.mo325a(e);
        }
    }

    public void mo311a() {
    }

    public void mo313b() {
    }

    public Class<ByteBuffer> mo321d() {
        return ByteBuffer.class;
    }

    public anq mo314c() {
        return anq.LOCAL;
    }
}
