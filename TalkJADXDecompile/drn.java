import android.content.Context;

public final class drn extends drk {
    private final String c;

    public drn(drp drp) {
        super(drp);
        this.c = drp.e();
    }

    protected euj a(Context context, int i, int i2) {
        return new dro(context, i, i2, (drp) this.a);
    }

    protected void a(Context context, int i, fdo fdo) {
        glk.e("Babel_Request_glss", "Failed to execute group link sharing network request.", new Object[0]);
        ((iih) jyn.a(context, iih.class)).a(i).b().c(3202);
        ayo bow = new bow(this.c, i, box.GROUP_LINK_SHARING_STATUS);
        ((gid) jyn.a(context, gid.class)).a(bow, fdo, bow.a());
    }
}
