package defpackage;

/* compiled from: PG */
/* renamed from: cuw */
final class cuw implements cuz {
    private /* synthetic */ cuv a;

    cuw(cuv cuv) {
        this.a = cuv;
    }

    public final /* synthetic */ void a(Object obj) {
        Integer num = (Integer) obj;
        cuv cuv = this.a;
        int intValue = num.intValue();
        if (cuv.a.a()) {
            cvu cvu = cvu.c;
            cvu.a().submit(new cux(cuv, null, intValue));
        }
    }
}
