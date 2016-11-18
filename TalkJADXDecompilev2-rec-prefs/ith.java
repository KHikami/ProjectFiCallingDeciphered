package p000;

public final class ith {
    private iti f18957a;
    private itf f18958b;
    private itk f18959c;
    private String f18960d;
    private String f18961e;
    private int f18962f;
    private String f18963g;
    private int f18964h;

    public itf m23201a() {
        return this.f18958b;
    }

    public itk m23209b() {
        return this.f18959c;
    }

    public String m23211c() {
        return this.f18960d;
    }

    public String m23212d() {
        return this.f18961e;
    }

    public int m23213e() {
        return this.f18962f;
    }

    public String m23214f() {
        return this.f18963g;
    }

    public int m23215g() {
        return this.f18964h;
    }

    public ith m23204a(iti iti) {
        this.f18957a = iti;
        return this;
    }

    public ith m23203a(itf itf) {
        this.f18958b = itf;
        return this;
    }

    public ith m23205a(itk itk) {
        this.f18959c = itk;
        return this;
    }

    public ith m23206a(String str) {
        this.f18960d = str;
        return this;
    }

    public ith m23208b(String str) {
        this.f18961e = str;
        return this;
    }

    public ith m23202a(int i) {
        this.f18962f = i;
        return this;
    }

    public ith m23210c(String str) {
        this.f18963g = str;
        return this;
    }

    public ith m23207b(int i) {
        this.f18964h = i;
        return this;
    }

    public String toString() {
        String valueOf = String.valueOf("CallStateInfo: \n localMediaSessionId: ");
        String str = this.f18960d;
        String str2 = this.f18961e;
        int i = this.f18962f;
        String str3 = this.f18963g;
        int i2 = this.f18964h;
        String valueOf2 = String.valueOf(this.f18957a);
        if (new StringBuilder(((((String.valueOf(valueOf).length() + 106) + String.valueOf(str).length()) + String.valueOf(str2).length()) + String.valueOf(str3).length()) + String.valueOf(valueOf2).length()).append(valueOf).append(str).append("\n remoteMediaSessionId: ").append(str2).append("\n mediaSessionType: ").append(i).append("\n participantLogId: ").append(str3).append("\n mediaNetworkType: ").append(i2).append(valueOf2).toString() == null) {
            return "";
        }
        valueOf = String.valueOf(this.f18957a);
        str = String.valueOf(this.f18958b);
        if (new StringBuilder((String.valueOf(valueOf).length() + 1) + String.valueOf(str).length()).append("\n").append(valueOf).append(str).toString() == null) {
            return "";
        }
        valueOf = String.valueOf(this.f18958b);
        str = String.valueOf(this.f18959c);
        if (new StringBuilder((String.valueOf(valueOf).length() + 1) + String.valueOf(str).length()).append("\n").append(valueOf).append(str).toString() == null) {
            return "";
        }
        valueOf = String.valueOf(this.f18959c);
        return new StringBuilder(String.valueOf(valueOf).length() + 1).append("\n").append(valueOf).toString();
    }
}
