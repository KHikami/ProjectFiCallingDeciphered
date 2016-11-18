package p000;

import java.io.IOException;

final class atl<Data> implements aoe<Data> {
    private final String f2317a;
    private final atk<Data> f2318b;
    private Data f2319c;

    public atl(String str, atk<Data> atk_Data) {
        this.f2317a = str;
        this.f2318b = atk_Data;
    }

    public void mo312a(amq amq, aof<? super Data> aof__super_Data) {
        try {
            this.f2319c = this.f2318b.mo385a(this.f2317a);
            aof__super_Data.mo326a(this.f2319c);
        } catch (Exception e) {
            aof__super_Data.mo325a(e);
        }
    }

    public void mo311a() {
        try {
            this.f2318b.mo386a(this.f2319c);
        } catch (IOException e) {
        }
    }

    public void mo313b() {
    }

    public Class<Data> mo321d() {
        return this.f2318b.mo384a();
    }

    public anq mo314c() {
        return anq.LOCAL;
    }
}
