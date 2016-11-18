package p000;

import java.io.File;
import java.io.IOException;

final class atr<Data> implements aoe<Data> {
    private final File f2324a;
    private final ats<Data> f2325b;
    private Data f2326c;

    public atr(File file, ats<Data> ats_Data) {
        this.f2324a = file;
        this.f2325b = ats_Data;
    }

    public void mo312a(amq amq, aof<? super Data> aof__super_Data) {
        try {
            this.f2326c = this.f2325b.mo388a(this.f2324a);
            aof__super_Data.mo326a(this.f2326c);
        } catch (Exception e) {
            aof__super_Data.mo325a(e);
        }
    }

    public void mo311a() {
        if (this.f2326c != null) {
            try {
                this.f2325b.mo389a(this.f2326c);
            } catch (IOException e) {
            }
        }
    }

    public void mo313b() {
    }

    public Class<Data> mo321d() {
        return this.f2325b.mo387a();
    }

    public anq mo314c() {
        return anq.LOCAL;
    }
}
