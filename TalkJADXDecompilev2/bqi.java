package defpackage;

final class bqi implements bpz {
    final /* synthetic */ bqf a;

    bqi(bqf bqf) {
        this.a = bqf;
    }

    public void a(int i) {
        glk.a("Babel_ConvCreator", "Selected transport type " + i, new Object[0]);
        for (bcn bcn : this.a.e.d()) {
            fcm a = ((fcn) this.a.d.a(fcn.class)).a(this.a.g.a(), this.a.f, i, bcn.b().d);
            if (!a.a()) {
                String str = "Babel_ConvCreator";
                String str2 = "Conversation not created due to unreachable ";
                String valueOf = String.valueOf(bcn.toString());
                glk.a(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2), new Object[0]);
                a.a(this.a.b, null, false);
                ((bpu) this.a.d.a(bpu.class)).a();
                return;
            }
        }
        this.a.a(i);
    }

    public void a() {
        glk.a("Babel_ConvCreator", "Transport type selection dialog cancelled", new Object[0]);
        ((bpu) this.a.d.a(bpu.class)).a();
    }
}
