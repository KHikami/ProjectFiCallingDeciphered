package p000;

import android.app.Notification;
import android.net.Uri;

public final class itf {
    private String f18932a;
    private String f18933b;
    private int f18934c = 51;
    private int f18935d = 3;
    private String f18936e;
    private off f18937f;
    private String f18938g;
    private String f18939h;
    private String f18940i;
    private String f18941j;
    private String f18942k;
    private String f18943l;
    private String f18944m;
    private String f18945n;
    private Uri f18946o;
    private String f18947p;
    private String f18948q;
    private String f18949r;
    private Notification f18950s;
    private boolean f18951t;
    private boolean f18952u = true;
    private boolean f18953v;
    private boolean f18954w;
    private byte[] f18955x;
    private lkm f18956y;

    public itf m23154a(String str) {
        this.f18932a = str;
        return this;
    }

    public String m23159a() {
        return this.f18932a;
    }

    public itf m23161b(String str) {
        this.f18933b = str;
        return this;
    }

    public String m23163b() {
        return this.f18933b;
    }

    public itf m23151a(int i) {
        this.f18934c = i;
        return this;
    }

    public int m23164c() {
        return this.f18934c;
    }

    public itf m23156a(off off) {
        this.f18937f = off;
        return this;
    }

    public off m23169d() {
        return this.f18937f;
    }

    public itf m23160b(int i) {
        this.f18935d = i;
        return this;
    }

    public int m23170e() {
        return this.f18935d;
    }

    public itf m23165c(String str) {
        this.f18939h = str;
        if (this.f18940i == null && this.f18944m == null && this.f18945n == null && this.f18942k == null && this.f18946o == null) {
            return this;
        }
        throw new IllegalArgumentException("Setting the resolved id is incompatible with resolving.");
    }

    public String m23173f() {
        return this.f18939h;
    }

    public String m23175g() {
        return this.f18938g;
    }

    public itf m23167d(String str) {
        this.f18942k = str;
        return this;
    }

    public String m23177h() {
        return this.f18942k;
    }

    public itf m23171e(String str) {
        this.f18943l = str;
        return this;
    }

    public String m23179i() {
        return this.f18943l;
    }

    public itf m23172f(String str) {
        this.f18940i = str;
        return this;
    }

    public String m23181j() {
        return this.f18940i;
    }

    public itf m23174g(String str) {
        this.f18941j = str;
        return this;
    }

    public String m23183k() {
        return this.f18941j;
    }

    public itf m23176h(String str) {
        this.f18944m = str;
        return this;
    }

    public String m23185l() {
        return this.f18944m;
    }

    public itf m23178i(String str) {
        this.f18945n = str;
        return this;
    }

    public String m23187m() {
        return this.f18945n;
    }

    public itf m23153a(Uri uri) {
        this.f18946o = uri;
        return this;
    }

    public Uri m23188n() {
        return this.f18946o;
    }

    public itf m23180j(String str) {
        this.f18947p = str;
        return this;
    }

    public String m23189o() {
        return this.f18947p;
    }

    public itf m23182k(String str) {
        this.f18948q = str;
        return this;
    }

    public String m23190p() {
        return this.f18948q;
    }

    public itf m23184l(String str) {
        this.f18949r = str;
        return this;
    }

    public String m23191q() {
        return this.f18949r;
    }

    public itf m23186m(String str) {
        this.f18936e = str;
        return this;
    }

    public String m23192r() {
        return this.f18936e;
    }

    public itf m23152a(Notification notification) {
        this.f18950s = notification;
        return this;
    }

    public Notification m23193s() {
        return this.f18950s;
    }

    @Deprecated
    public itf m23157a(boolean z) {
        this.f18951t = z;
        return this;
    }

    @Deprecated
    public boolean m23194t() {
        return this.f18951t;
    }

    public itf m23162b(boolean z) {
        this.f18952u = z;
        return this;
    }

    public boolean m23195u() {
        return this.f18952u;
    }

    public itf m23166c(boolean z) {
        this.f18953v = z;
        return this;
    }

    public boolean m23196v() {
        return this.f18953v;
    }

    public itf m23168d(boolean z) {
        this.f18954w = z;
        return this;
    }

    public boolean m23197w() {
        return this.f18954w;
    }

    public itf m23158a(byte[] bArr) {
        this.f18955x = bArr;
        return this;
    }

    public byte[] m23198x() {
        return this.f18955x;
    }

    @Deprecated
    public itf m23199y() {
        return this;
    }

    public itf m23155a(lkm lkm) {
        this.f18956y = lkm;
        return this;
    }

    public lkm m23200z() {
        if (this.f18956y == null) {
            this.f18956y = new lkm();
        }
        return this.f18956y;
    }

    public String toString() {
        int i;
        if (this.f18955x == null) {
            i = 0;
        } else {
            i = this.f18955x.length;
        }
        return "CallInfo:" + "\n sessionId: " + this.f18932a + "\n resolvedHangoutId: " + this.f18939h + "\n participantId: " + this.f18938g + "\n domain: " + this.f18940i + "\n roomName: " + this.f18941j + "\n calendarId: " + this.f18944m + "\n eventId: " + this.f18945n + "\n externalKeyName: " + this.f18942k + "\n externalKeyId: " + this.f18943l + "\n originalUri: " + this.f18946o + "\n accountName: " + this.f18947p + "\n clientId: " + this.f18948q + "\n gcmRegistration: " + this.f18949r + "\n compressedLogFile: " + this.f18936e + "\n hasVideo: " + this.f18951t + "\n shouldManagePlatformInteraction: " + this.f18952u + "\n isUserMinor: " + this.f18953v + "\n isOnAirAllowed: " + this.f18954w + "\n userLocationBytes is " + (this.f18955x == null ? "" : "not ") + "null\n userLocationBytes length: " + i + "\n videoCallOptions: " + this.f18956y;
    }
}
