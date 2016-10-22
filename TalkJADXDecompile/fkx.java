public final class fkx extends fhb {
    private final String a;
    private String b;
    private Integer g;
    private boolean h;
    private String i;
    private boolean j;
    private String k;

    public fkx(bko bko, String str) {
        super(bko);
        this.b = null;
        this.g = null;
        this.h = false;
        this.j = false;
        this.a = str;
    }

    public void a(String str) {
        this.b = str;
    }

    public void a(int i) {
        this.g = Integer.valueOf(i);
    }

    public void w_() {
        blo blo = new blo(gwb.H(), this.c.a);
        if (this.a != null) {
            String i;
            if (!(this.b == null || blo.a(this.a))) {
                i = blo.i();
                a(new evg(i, this.a, this.b, a(blo, i)));
            }
            if (this.g != null) {
                new fky(this.a, gwb.a(this.g)).a(blo, this.d);
            }
            if (this.j || this.h) {
                blo.a();
                try {
                    for (String i2 : blo.ab(this.a)) {
                        if (this.h) {
                            blo.e(i2, this.i);
                        }
                        if (this.j) {
                            blo.f(i2, this.k);
                        }
                    }
                    blo.b();
                } finally {
                    blo.c();
                }
            }
        } else if (this.g != null) {
            new fky(null, gwb.a(this.g)).a(blo, this.d);
        }
    }

    private String a(blo blo, String str) {
        String valueOf;
        if (glk.a("Babel", 3)) {
            String str2 = "Babel";
            String str3 = "updateConversationNameLocally conversationId: ";
            valueOf = String.valueOf(this.a);
            if (valueOf.length() != 0) {
                valueOf = str3.concat(valueOf);
            } else {
                valueOf = new String(str3);
            }
            glk.a(str2, valueOf, new Object[0]);
        }
        blo.a();
        try {
            valueOf = blo.o(this.a);
            long M = blo.M(this.a);
            long j = 0;
            if (blo.z(this.a) == 1) {
                j = Long.MAX_VALUE;
            }
            new flc(this.a, this.c.b.b(), M, j, str, null, this.b, fwx.QUEUED).a(blo, this.d);
            blo.b();
            return valueOf;
        } finally {
            blo.c();
        }
    }

    public void b(String str) {
        this.i = str;
        this.h = true;
    }

    public void c(String str) {
        this.k = str;
        this.j = true;
    }
}
