package p000;

public final class fkx extends fhb {
    private final String f13344a;
    private String f13345b = null;
    private Integer f13346g = null;
    private boolean f13347h = false;
    private String f13348i;
    private boolean f13349j = false;
    private String f13350k;

    public fkx(bko bko, String str) {
        super(bko);
        this.f13344a = str;
    }

    public void m15587a(String str) {
        this.f13345b = str;
    }

    public void m15586a(int i) {
        this.f13346g = Integer.valueOf(i);
    }

    public void w_() {
        blo blo = new blo(gwb.m1400H(), this.f5736c.f12721a);
        if (this.f13344a != null) {
            String i;
            if (!(this.f13345b == null || blo.m5871a(this.f13344a))) {
                i = blo.m5900i();
                m8039a(new evg(i, this.f13344a, this.f13345b, m15585a(blo, i)));
            }
            if (this.f13346g != null) {
                new fky(this.f13344a, gwb.m1507a(this.f13346g)).m15593a(blo, this.f5737d);
            }
            if (this.f13349j || this.f13347h) {
                blo.m5958a();
                try {
                    for (String i2 : blo.ab(this.f13344a)) {
                        if (this.f13347h) {
                            blo.m6048e(i2, this.f13348i);
                        }
                        if (this.f13349j) {
                            blo.m6054f(i2, this.f13350k);
                        }
                    }
                    blo.m6015b();
                } finally {
                    blo.m6028c();
                }
            }
        } else if (this.f13346g != null) {
            new fky(null, gwb.m1507a(this.f13346g)).m15593a(blo, this.f5737d);
        }
    }

    private String m15585a(blo blo, String str) {
        String valueOf;
        if (glk.m17973a("Babel", 3)) {
            String str2 = "Babel";
            String str3 = "updateConversationNameLocally conversationId: ";
            valueOf = String.valueOf(this.f13344a);
            if (valueOf.length() != 0) {
                valueOf = str3.concat(valueOf);
            } else {
                valueOf = new String(str3);
            }
            glk.m17970a(str2, valueOf, new Object[0]);
        }
        blo.m5958a();
        try {
            valueOf = blo.m6094o(this.f13344a);
            long M = blo.m5921M(this.f13344a);
            long j = 0;
            if (blo.m6116z(this.f13344a) == 1) {
                j = Long.MAX_VALUE;
            }
            new flc(this.f13344a, this.f5736c.f12722b.m5632b(), M, j, str, null, this.f13345b, fwx.QUEUED).m15601a(blo, this.f5737d);
            blo.m6015b();
            return valueOf;
        } finally {
            blo.m6028c();
        }
    }

    public void m15588b(String str) {
        this.f13348i = str;
        this.f13347h = true;
    }

    public void m15589c(String str) {
        this.f13350k = str;
        this.f13349j = true;
    }
}
