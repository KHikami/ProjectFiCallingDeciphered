package defpackage;

/* renamed from: bji */
public enum bji {
    NONE(""),
    NAME("display_name"),
    EMAIL("email"),
    PHONE("phone_number");
    
    private final String e;

    private bji(String str) {
        this.e = str;
    }

    public String a() {
        return this.e;
    }
}
