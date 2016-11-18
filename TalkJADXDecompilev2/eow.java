package defpackage;

public enum eow {
    TRANSPORT_SPINNER("transport_spinner_promo_shown"),
    AUTOSWITCH_TRANSPORT("autoswitch_transport_promo_shown");
    
    public final String c;

    private eow(String str) {
        this.c = str;
    }
}
