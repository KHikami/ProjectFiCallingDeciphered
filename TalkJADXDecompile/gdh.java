final class gdh implements Runnable {
    final /* synthetic */ gdg a;

    gdh(gdg gdg) {
        this.a = gdg;
    }

    // switch from wifi to Sprint complete
    public void run() {
        glk.c("Babel_telephony", "TeleHandoffWifiToCellular.checkHandoffComplete, handoff is complete - carrier is Sprint and timer expired.", new Object[0]);
        gwb.f(2980);
        this.a.b.a(true, 0); // gdc.a(true, 0) -> handoff complete
    }
}
