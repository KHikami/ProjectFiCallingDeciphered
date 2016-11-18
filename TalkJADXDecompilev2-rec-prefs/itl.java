package p000;

public final class itl {
    private String f18970a = null;
    private String f18971b = null;
    private String f18972c = null;
    private boolean f18973d = true;
    private boolean f18974e = true;
    private boolean f18975f = false;
    private boolean f18976g = false;
    private boolean f18977h = false;
    private String f18978i = null;
    private long f18979j = 0;
    private boolean f18980k = false;
    private boolean f18981l = false;
    private boolean f18982m = false;
    private boolean f18983n = false;
    private int f18984o;
    private lym f18985p;

    public itl m23226a(String str) {
        this.f18970a = str;
        return this;
    }

    public String m23229a() {
        return this.f18970a;
    }

    public itl m23230b(String str) {
        this.f18971b = str;
        return this;
    }

    public String m23232b() {
        return this.f18971b;
    }

    public itl m23233c(String str) {
        this.f18972c = str;
        return this;
    }

    public String m23235c() {
        return this.f18972c;
    }

    public itl m23228a(boolean z) {
        this.f18973d = z;
        return this;
    }

    public boolean m23238d() {
        return this.f18973d;
    }

    public itl m23231b(boolean z) {
        this.f18974e = z;
        return this;
    }

    public boolean m23240e() {
        return this.f18974e;
    }

    public itl m23234c(boolean z) {
        this.f18975f = true;
        return this;
    }

    public boolean m23242f() {
        return this.f18975f;
    }

    public itl m23236d(String str) {
        this.f18978i = str;
        return this;
    }

    public String m23244g() {
        return this.f18978i;
    }

    public itl m23225a(long j) {
        this.f18979j = j;
        return this;
    }

    public long m23245h() {
        return this.f18979j;
    }

    public itl m23237d(boolean z) {
        this.f18980k = z;
        return this;
    }

    public itl m23239e(boolean z) {
        this.f18981l = z;
        return this;
    }

    public boolean m23248i() {
        return this.f18981l;
    }

    public itl m23241f(boolean z) {
        this.f18982m = z;
        return this;
    }

    public boolean m23249j() {
        return this.f18982m;
    }

    public boolean m23250k() {
        return !m23249j();
    }

    public itl m23243g(boolean z) {
        this.f18983n = z;
        return this;
    }

    public boolean m23251l() {
        return this.f18983n;
    }

    public itl m23246h(boolean z) {
        this.f18976g = z;
        return this;
    }

    public boolean m23252m() {
        return this.f18976g;
    }

    public itl m23247i(boolean z) {
        this.f18977h = z;
        return this;
    }

    public boolean m23253n() {
        return this.f18977h;
    }

    public itl m23224a(int i) {
        this.f18984o = i;
        return this;
    }

    public int m23254o() {
        return this.f18984o;
    }

    public itl m23227a(lym lym) {
        this.f18985p = lym;
        return this;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof itl)) {
            return false;
        }
        itl itl = (itl) obj;
        if (m23242f() && itl.m23242f()) {
            return true;
        }
        if (m23229a() == null || itl.m23229a() == null || !m23229a().equals(itl.m23229a())) {
            return false;
        }
        return true;
    }

    public String toString() {
        return "Participant: " + this.f18970a + "\n userId: " + this.f18978i + "\n isLoudestSpeaker: " + this.f18978i + "\n connectionTime: " + this.f18979j + "\n isAudioMuted: " + this.f18973d + "\n isVideoMuted: " + this.f18974e + "\n isLocalUser: " + this.f18975f + "\n isLoudestSpeaker: " + this.f18980k + "\n isFocused: " + this.f18981l + "\n isPstn: " + this.f18982m + "\n isMediaBlocked: " + this.f18983n + "\n isAllowedToInvite: " + this.f18976g + "\n isAllowedToKick: " + this.f18977h;
    }
}
