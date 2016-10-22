import java.io.File;
import java.io.IOException;

final class atr<Data> implements aoe<Data> {
    private final File a;
    private final ats<Data> b;
    private Data c;

    public atr(File file, ats<Data> ats_Data) {
        this.a = file;
        this.b = ats_Data;
    }

    public void a(amq amq, aof<? super Data> aof__super_Data) {
        try {
            this.c = this.b.a(this.a);
            aof__super_Data.a(this.c);
        } catch (Exception e) {
            aof__super_Data.a(e);
        }
    }

    public void a() {
        if (this.c != null) {
            try {
                this.b.a(this.c);
            } catch (IOException e) {
            }
        }
    }

    public void b() {
    }

    public Class<Data> d() {
        return this.b.a();
    }

    public anq c() {
        return anq.LOCAL;
    }
}
