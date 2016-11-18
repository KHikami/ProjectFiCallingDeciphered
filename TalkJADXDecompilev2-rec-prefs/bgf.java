package p000;

final class bgf implements Runnable {
    final /* synthetic */ fed f3299a;
    final /* synthetic */ int f3300b;
    final /* synthetic */ loa[] f3301c;
    final /* synthetic */ bge f3302d;

    bgf(bge bge, fed fed, int i, loa[] loaArr) {
        this.f3302d = bge;
        this.f3299a = fed;
        this.f3300b = i;
        this.f3301c = loaArr;
    }

    public void run() {
        this.f3299a.mo535a(this.f3300b, this.f3301c);
    }
}
