import java.io.IOException;

final class atl<Data> implements aoe<Data> {
    private final String a;
    private final atk<Data> b;
    private Data c;

    public atl(String str, atk<Data> atk_Data) {
        this.a = str;
        this.b = atk_Data;
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
        try {
            this.b.a(this.c);
        } catch (IOException e) {
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
