import android.content.Context;
import com.google.api.client.http.HttpStatusCodes;

public class fkr implements bhf, bhj, bhm {
    private final int a;

    public fkr(int i) {
        this.a = i;
    }

    public String b() {
        String valueOf = String.valueOf(getClass().getName());
        return new StringBuilder(String.valueOf(valueOf).length() + 11).append(valueOf).append(this.a).toString();
    }

    public bhk c() {
        return bhk.REPLACE_OLD;
    }

    public int a(Context context, bhb bhb) {
        try {
            ((bhl) jyn.a(context, bhl.class)).a(new feg(new evb(gwb.a(context, "babel_sc_max_pinned", (int) HttpStatusCodes.STATUS_CODE_SERVER_ERROR), gwb.a(context, "babel_sc_max_favorites", 15), gwb.a(context, "babel_sc_max_you_hangout_with", (int) HttpStatusCodes.STATUS_CODE_SERVER_ERROR), gwb.a(context, "babel_sc_max_other_contacts_on_hangouts", (int) HttpStatusCodes.STATUS_CODE_SERVER_ERROR), gwb.a(context, "babel_sc_max_dismissed", (int) HttpStatusCodes.STATUS_CODE_SERVER_ERROR), bkq.c(context, this.a, "hash_pinned"), bkq.c(context, this.a, "hash_favorites"), bkq.c(context, this.a, "hash_people_you_hangout_with"), bkq.c(context, this.a, "hash_other_people_on_hangout"), bkq.c(context, this.a, "hash_dismissed_contacts")), this.a));
            bkq.b(context, this.a, "last_suggested_contacts_time", glj.a());
            return bhn.a;
        } catch (jcj e) {
            return bhn.c;
        }
    }

    public bhr a() {
        return null;
    }

    public void a(Context context) {
    }

    public bhu d() {
        return new bhv().a(true).a();
    }
}
