package p000;

final class iol implements Runnable {
    final /* synthetic */ Object f18584a;
    final /* synthetic */ iok f18585b;

    iol(iok iok, Object obj) {
        this.f18585b = iok;
        this.f18584a = obj;
    }

    public void run() {
        this.f18585b.f18133p = this.f18584a;
    }
}
