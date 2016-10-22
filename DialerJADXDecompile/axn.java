import android.content.Context;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.preference.PreferenceManager;

/* compiled from: PG */
public final class axn implements avs {
    public boolean a;
    private SharedPreferences b;
    private avq c;
    private axp d;
    private Context e;
    private axo f;

    public axn(Context context, axo axo) {
        this.e = context;
        this.f = axo;
        this.b = PreferenceManager.getDefaultSharedPreferences(this.e);
        this.d = new axp();
        this.a = this.b.getBoolean("has_active_voicemail_provider", false);
    }

    public final void a() {
        this.c = new avq(this.e, this.e.getContentResolver(), this);
        this.c.a();
    }

    public final void b(Cursor cursor) {
        boolean z = this.d.a(cursor) > 0;
        if (z != this.a) {
            this.a = z;
            this.b.edit().putBoolean("has_active_voicemail_provider", this.a);
            if (this.f != null) {
                this.f.a();
            }
        }
    }

    public final void c(Cursor cursor) {
    }

    public final void d(Cursor cursor) {
    }

    public final boolean a(Cursor cursor) {
        return false;
    }
}
