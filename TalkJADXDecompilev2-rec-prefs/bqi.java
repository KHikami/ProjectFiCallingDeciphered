package p000;

final class bqi implements bpz {
    final /* synthetic */ bqf f4237a;

    bqi(bqf bqf) {
        this.f4237a = bqf;
    }

    public void mo661a(int i) {
        glk.m17970a("Babel_ConvCreator", "Selected transport type " + i, new Object[0]);
        for (bcn bcn : this.f4237a.f4217e.m4874d()) {
            fcm a = ((fcn) this.f4237a.f4216d.m25443a(fcn.class)).mo1976a(this.f4237a.f4219g.mo2317a(), this.f4237a.f4218f, i, bcn.m4893b().f12669d);
            if (!a.m14964a()) {
                String str = "Babel_ConvCreator";
                String str2 = "Conversation not created due to unreachable ";
                String valueOf = String.valueOf(bcn.toString());
                glk.m17970a(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2), new Object[0]);
                a.m14963a(this.f4237a.f4214b, null, false);
                ((bpu) this.f4237a.f4216d.m25443a(bpu.class)).mo902a();
                return;
            }
        }
        this.f4237a.m6425a(i);
    }

    public void mo660a() {
        glk.m17970a("Babel_ConvCreator", "Transport type selection dialog cancelled", new Object[0]);
        ((bpu) this.f4237a.f4216d.m25443a(bpu.class)).mo902a();
    }
}
