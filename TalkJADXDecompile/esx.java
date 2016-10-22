import android.content.Context;
import com.google.api.client.http.GenericUrl;
import java.util.Locale;

public abstract class esx extends esw {
    private static final long serialVersionUID = 1;

    public GenericUrl b(Context context) {
        String b = gwb.b(context, "babel_google_voice_api_key", "AIzaSyAMX775bK7F5ciFA6w9pXNJyvzqcSPeHH0");
        GenericUrl b2 = super.b(context);
        b2.put("key", (Object) b);
        b2.put("locale", (Object) Locale.getDefault().toString());
        return b2;
    }

    protected fom j() {
        return fom.GOOGLE_VOICE;
    }

    public boolean a(Context context, eaf eaf, fdo fdo) {
        return false;
    }

    public String K_() {
        return "ui_queue";
    }
}
