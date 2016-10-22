package defpackage;

import android.app.Notification;
import android.net.Uri;

/* renamed from: itf */
public final class itf {
    private String a;
    private String b;
    private int c;
    private int d;
    private String e;
    private off f;
    private String g;
    private String h;
    private String i;
    private String j;
    private String k;
    private String l;
    private String m;
    private String n;
    private Uri o;
    private String p;
    private String q;
    private String r;
    private Notification s;
    private boolean t;
    private boolean u;
    private boolean v;
    private boolean w;
    private byte[] x;
    private lkm y;

    public itf() {
        this.c = 51;
        this.d = 3;
        this.u = true;
    }

    public itf a(String str) {
        this.a = str;
        return this;
    }

    public String a() {
        return this.a;
    }

    public itf b(String str) {
        this.b = str;
        return this;
    }

    public String b() {
        return this.b;
    }

    public itf a(int i) {
        this.c = i;
        return this;
    }

    public int c() {
        return this.c;
    }

    public itf a(off off) {
        this.f = off;
        return this;
    }

    public off d() {
        return this.f;
    }

    public itf b(int i) {
        this.d = i;
        return this;
    }

    public int e() {
        return this.d;
    }

    public itf c(String str) {
        this.h = str;
        if (this.i == null && this.m == null && this.n == null && this.k == null && this.o == null) {
            return this;
        }
        throw new IllegalArgumentException("Setting the resolved id is incompatible with resolving.");
    }

    public String f() {
        return this.h;
    }

    public String g() {
        return this.g;
    }

    public itf d(String str) {
        this.k = str;
        return this;
    }

    public String h() {
        return this.k;
    }

    public itf e(String str) {
        this.l = str;
        return this;
    }

    public String i() {
        return this.l;
    }

    public itf f(String str) {
        this.i = str;
        return this;
    }

    public String j() {
        return this.i;
    }

    public itf g(String str) {
        this.j = str;
        return this;
    }

    public String k() {
        return this.j;
    }

    public itf h(String str) {
        this.m = str;
        return this;
    }

    public String l() {
        return this.m;
    }

    public itf i(String str) {
        this.n = str;
        return this;
    }

    public String m() {
        return this.n;
    }

    public itf a(Uri uri) {
        this.o = uri;
        return this;
    }

    public Uri n() {
        return this.o;
    }

    public itf j(String str) {
        this.p = str;
        return this;
    }

    public String o() {
        return this.p;
    }

    public itf k(String str) {
        this.q = str;
        return this;
    }

    public String p() {
        return this.q;
    }

    public itf l(String str) {
        this.r = str;
        return this;
    }

    public String q() {
        return this.r;
    }

    public itf m(String str) {
        this.e = str;
        return this;
    }

    public String r() {
        return this.e;
    }

    public itf a(Notification notification) {
        this.s = notification;
        return this;
    }

    public Notification s() {
        return this.s;
    }

    @Deprecated
    public itf a(boolean z) {
        this.t = z;
        return this;
    }

    @Deprecated
    public boolean t() {
        return this.t;
    }

    public itf b(boolean z) {
        this.u = z;
        return this;
    }

    public boolean u() {
        return this.u;
    }

    public itf c(boolean z) {
        this.v = z;
        return this;
    }

    public boolean v() {
        return this.v;
    }

    public itf d(boolean z) {
        this.w = z;
        return this;
    }

    public boolean w() {
        return this.w;
    }

    public itf a(byte[] bArr) {
        this.x = bArr;
        return this;
    }

    public byte[] x() {
        return this.x;
    }

    @Deprecated
    public itf y() {
        return this;
    }

    public itf a(lkm lkm) {
        this.y = lkm;
        return this;
    }

    public lkm z() {
        if (this.y == null) {
            this.y = new lkm();
        }
        return this.y;
    }

    public String toString() {
        int i;
        if (this.x == null) {
            i = 0;
        } else {
            i = this.x.length;
        }
        return "CallInfo:" + "\n sessionId: " + this.a + "\n resolvedHangoutId: " + this.h + "\n participantId: " + this.g + "\n domain: " + this.i + "\n roomName: " + this.j + "\n calendarId: " + this.m + "\n eventId: " + this.n + "\n externalKeyName: " + this.k + "\n externalKeyId: " + this.l + "\n originalUri: " + this.o + "\n accountName: " + this.p + "\n clientId: " + this.q + "\n gcmRegistration: " + this.r + "\n compressedLogFile: " + this.e + "\n hasVideo: " + this.t + "\n shouldManagePlatformInteraction: " + this.u + "\n isUserMinor: " + this.v + "\n isOnAirAllowed: " + this.w + "\n userLocationBytes is " + (this.x == null ? "" : "not ") + "null\n userLocationBytes length: " + i + "\n videoCallOptions: " + this.y;
    }
}
