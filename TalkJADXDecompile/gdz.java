import android.content.Context;
import com.google.android.gms.herrevad.PredictedNetworkQuality;

final class gdz implements gcl, gfb, ggq, guq<haw>, Runnable { //is TeleNetworkSelectionUtils
    //seems to be a multi cell evaluator
    //evaluates & creates the related WiFi, Network, Cell, and TeleStunPing objects

    private final Context a;
    private gea b; //some interface??? => if no this, timeout occurred
    private gui c; // guj
    private gcm d; //nework provider status
    private boolean e; //is on Cell state
    private gfv f; //wifi cell
    private gec g; //cell network status
    private boolean h; //is on Home Network (for voice)
    private PredictedNetworkQuality i;
    private boolean j; //on result (with network quality => call finished I guess???)

    //Ping result related items
    private gfa k; //TeleStunPing object. reset to null when ping finishes
    private boolean l;// last ping was successful
    private long m; //last recording ping latency
    private boolean n;//ping complete
    private boolean o; //timeout occurred

    gdz(Context context, gea gea) {
        this.a = context;
        this.b = gea;
    }

    void a() {
        glk.c("Babel_telephony", "TeleNetworkSelectionUtils.fetchState", new Object[0]);
        this.g = new gec(this.a, get.a(this.a)); //new cell network state
        this.f = gfq.a(this.a); //creates new wifi cell
        gck.a(this.a, this); //gck.a(Context, gcl) => uses gcn to listen if SimState is ready
        gwb.a(this.a, (ggq) this);// gwb.a(Context,ggq) => calls TychoAccount is on home network???
        this.c = new guj(this.a).a(hat.b).b();//new guj(Context) with a method call to a(hat.b).b()
        //hat.b is a new network quality API fed in a list of objects and a gue??? (called gtz)
        //=> a(gtz).b() => ???

        this.c.b(); //the above seems to generate a bunch of API calls and this is just checking it's nonempty.
        hat.c.a(this.c).a(this);
        this.k = new gfa(this.a, this);// creates new tele stun ping object
        this.k.a();
        gwb.a((Runnable) this, (long) gwb.a(this.a, "babel_network_selection_state_fetch_timeout_millis", 1000));
        //first calls gwb.a(context, string, int) => checks if there's a biw related?
        // Handler.postDelayed(Runnable, long)
    }

    private geb b() {
        return new geb(this.d, this.f, this.g, this.i, this.l, this.m, this.o);
    }

    public void a(gcm gcm) {
        String valueOf = String.valueOf(gcm);
        glk.c("Babel_telephony", new StringBuilder(String.valueOf(valueOf).length() + 50).append("TeleNetworkSelectionUtils.onCellState, cellState: ").append(valueOf).toString(), new Object[0]);
        this.d = gcm;
        this.e = true;
        c();
    }

    public void a(boolean z, boolean z2) {
        glk.c("Babel_telephony", "TeleNetworkSelectionUtils.onHomeVoiceNetworkResult, success: " + z + ", isOnHomeVoiceNetwork: " + z2, new Object[0]);
        int a = z ? z2 ? 2 : 1 : get.a(this.a);
        this.g = new gec(this.a, a);
        this.h = true;
        c();
    }

    private void a(haw haw) {
        String valueOf = String.valueOf(haw.a());
        glk.c("Babel_telephony", new StringBuilder(String.valueOf(valueOf).length() + 53).append("TeleNetworkSelectionUtils.onResult, network quality: ").append(valueOf).toString(), new Object[0]);
        this.i = haw.a();
        this.j = true;
        this.c.d();
        c();
    }

    public void run() {
        if (this.b != null) { //if no gea object time out occurred.
            glk.c("Babel_telephony", "TeleNetworkSelectionUtils.run, fetching state timeout", new Object[0]);
            this.o = true;
            c();
        }
    }

    public void a(boolean z, long j) {
        glk.c("Babel_telephony", "TeleNetworkSelectionUtils.onPingComplete, wasSuccessful: " + z + ", latencyMillis: " + j, new Object[0]);
        this.n = true;
        this.k = null;// reset stun ping object
        this.l = z;//l stores if ping were successful
        this.m = j;//m stores latency amount
        c();
    }

    private void c() { //resets all the fields it seems? (or at least most of the fields. Seems to be done for cleanup...)
        gwb.aJ();
        Object obj = (this.e && this.h && this.j && this.n) ? 1 : null;
        if (this.b == null) {
            return;
        }
        if (obj != null || this.o) {
            gwb.b((Runnable) this);
            gea gea = this.b;
            this.b = null;
            if (this.k != null) {
                this.k.b();
                this.k = null;
            }
            gea.a(b());
        }
    }
}
