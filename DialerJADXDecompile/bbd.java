import android.content.Context;
import android.os.AsyncTask;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: PG */
final class bbd extends AsyncTask {
    private /* synthetic */ awp a;
    private /* synthetic */ bad b;
    private /* synthetic */ ayo c;
    private /* synthetic */ Context d;

    bbd(bbc bbc, awp awp, bad bad, ayo ayo, Context context) {
        this.a = awp;
        this.b = bad;
        this.c = ayo;
        this.d = context;
    }

    protected final /* synthetic */ Object doInBackground(Object[] objArr) {
        return a();
    }

    private Void a() {
        aws aws = new aws();
        awq a = this.a.a(aws);
        a.a(5, "CNAP", 0);
        aws.d = this.b.g;
        aws.h = buf.c(this.c.b);
        aws.f = 12;
        try {
            a.a(new JSONObject().put("display_name", aws.d).put("display_name_source", 40).put("vnd.android.cursor.item/contact", new JSONObject().put("vnd.android.cursor.item/phone_v2", new JSONObject().put("data1", aws.h).put("data2", 12))).toString());
        } catch (JSONException e) {
            bdf.e(bbc.a, "Creation of lookup key failed when caching CNAP information");
        }
        this.a.a(this.d, a);
        return null;
    }
}
