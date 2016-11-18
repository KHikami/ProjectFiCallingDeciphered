package p000;

public class iij {
    public final pbq f17728a;
    public pbr f17729b;
    public pbs f17730c;
    public final /* synthetic */ dvp f17731d;

    public iij m21861a(int i) {
        if (this.f17730c == null) {
            this.f17730c = new pbs();
        }
        pbt pbt = new pbt();
        pbt.a = Integer.valueOf(i);
        pbt.b = Integer.valueOf(0);
        this.f17730c.a = pbt;
        return this;
    }

    public iij m21862a(String str) {
        if (this.f17730c == null) {
            this.f17730c = new pbs();
        }
        pbu pbu = new pbu();
        pbu.a = str;
        this.f17730c.c = pbu;
        return this;
    }

    public iij m21863b(String str) {
        this.f17728a.a = str;
        return this;
    }

    public iij m21864c(String str) {
        if (this.f17729b == null) {
            this.f17729b = new pbr();
        }
        this.f17729b.a = str;
        return this;
    }

    public iij m21865d(String str) {
        if (this.f17729b == null) {
            this.f17729b = new pbr();
        }
        this.f17729b.b = str;
        return this;
    }

    public iij m21866e(String str) {
        if (this.f17729b == null) {
            this.f17729b = new pbr();
        }
        this.f17729b.c = str;
        return this;
    }

    public iii m21860a() {
        if (this.f17728a.a == null || this.f17729b == null) {
            this.f17728a.b = this.f17729b;
            this.f17728a.c = this.f17730c;
            this.f17731d.f10642a.add(this.f17728a);
            return this.f17731d;
        }
        throw new IllegalStateException("Cannot provide both a logging ID and entity ID for new SocialAffinityLog entity. Only one is acceptable.");
    }

    public iij(dvp dvp) {
        this.f17731d = dvp;
        this.f17728a = new pbq();
    }
}
