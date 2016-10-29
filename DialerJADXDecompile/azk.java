/* compiled from: PG */
final class azk implements Runnable {
    private /* synthetic */ ayv a;

    azk(ayv ayv) {
        this.a = ayv;
    }

    public final void run() {
        String valueOf = String.valueOf(this.a.s);
        bdf.b((Object) this, new StringBuilder(String.valueOf(valueOf).length() + 34).append("restoringCallStateLabel : label = ").append(valueOf).toString());
        this.a.a(this.a.s); //ayv.a(CharSequence) => redraws the the screen based on the char sequence of built ayv (changes the call state)
        this.a.t = false;
    }
}
