public final class itl {
    private String a;
    private String b;
    private String c;
    private boolean d;
    private boolean e;
    private boolean f;
    private boolean g;
    private boolean h;
    private String i;
    private long j;
    private boolean k;
    private boolean l;
    private boolean m;
    private boolean n;
    private int o;
    private lym p;

    public itl() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = true;
        this.e = true;
        this.f = false;
        this.g = false;
        this.h = false;
        this.i = null;
        this.j = 0;
        this.k = false;
        this.l = false;
        this.m = false;
        this.n = false;
    }

    public itl a(String str) {
        this.a = str;
        return this;
    }

    public String a() {
        return this.a;
    }

    public itl b(String str) {
        this.b = str;
        return this;
    }

    public String b() {
        return this.b;
    }

    public itl c(String str) {
        this.c = str;
        return this;
    }

    public String c() {
        return this.c;
    }

    public itl a(boolean z) {
        this.d = z;
        return this;
    }

    public boolean d() {
        return this.d;
    }

    public itl b(boolean z) {
        this.e = z;
        return this;
    }

    public boolean e() {
        return this.e;
    }

    public itl c(boolean z) {
        this.f = true;
        return this;
    }

    public boolean f() {
        return this.f;
    }

    public itl d(String str) {
        this.i = str;
        return this;
    }

    public String g() {
        return this.i;
    }

    public itl a(long j) {
        this.j = j;
        return this;
    }

    public long h() {
        return this.j;
    }

    public itl d(boolean z) {
        this.k = z;
        return this;
    }

    public itl e(boolean z) {
        this.l = z;
        return this;
    }

    public boolean i() {
        return this.l;
    }

    public itl f(boolean z) {
        this.m = z;
        return this;
    }

    public boolean j() {
        return this.m;
    }

    public boolean k() {
        return !j();
    }

    public itl g(boolean z) {
        this.n = z;
        return this;
    }

    public boolean l() {
        return this.n;
    }

    public itl h(boolean z) {
        this.g = z;
        return this;
    }

    public boolean m() {
        return this.g;
    }

    public itl i(boolean z) {
        this.h = z;
        return this;
    }

    public boolean n() {
        return this.h;
    }

    public itl a(int i) {
        this.o = i;
        return this;
    }

    public int o() {
        return this.o;
    }

    public itl a(lym lym) {
        this.p = lym;
        return this;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof itl)) {
            return false;
        }
        itl itl = (itl) obj;
        if (f() && itl.f()) {
            return true;
        }
        if (a() == null || itl.a() == null || !a().equals(itl.a())) {
            return false;
        }
        return true;
    }

    public String toString() {
        return "Participant: " + this.a + "\n userId: " + this.i + "\n isLoudestSpeaker: " + this.i + "\n connectionTime: " + this.j + "\n isAudioMuted: " + this.d + "\n isVideoMuted: " + this.e + "\n isLocalUser: " + this.f + "\n isLoudestSpeaker: " + this.k + "\n isFocused: " + this.l + "\n isPstn: " + this.m + "\n isMediaBlocked: " + this.n + "\n isAllowedToInvite: " + this.g + "\n isAllowedToKick: " + this.h;
    }
}
