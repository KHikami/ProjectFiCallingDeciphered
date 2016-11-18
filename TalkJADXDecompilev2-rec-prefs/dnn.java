package p000;

import android.content.Context;

final class dnn {
    private final cxd f10174a = new cxe().m11190a("knocking").m11192b("Module that enables responding to knocks").m11191a(true).m11189a();

    public cxd[] m12306a() {
        return new cxd[]{this.f10174a};
    }

    public dnc m12305a(Context context) {
        return this.f10174a.mo1450a(context) ? new dny() : null;
    }

    public dna m12307b(Context context) {
        return this.f10174a.mo1450a(context) ? new dnh(context) : null;
    }

    public dlb[] m12308c(Context context) {
        return (dlb[]) this.f10174a.mo1452a(context, dlb.class, new dno(this), new dnp(this));
    }
}
