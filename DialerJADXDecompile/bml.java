final class bml implements Runnable {
    private /* synthetic */ int a;
    private /* synthetic */ bot b;
    private /* synthetic */ bmi c;

    bml(bmi bmi, int i, bot bot) {
        this.c = bmi;
        this.a = i;
        this.b = bot;
    }

    public final void run() {
        boolean stopSelfResult = this.c.stopSelfResult(this.a);
        if (stopSelfResult) {
            this.b.a("Install campaign broadcast processed", Boolean.valueOf(stopSelfResult));
        }
    }
}
