import android.content.ContentResolver;
import android.content.ContentUris;
import android.database.Cursor;
import android.net.Uri;
import android.os.AsyncTask;
import com.android.dialer.app.voicemail.VoicemailPlaybackLayout;
import java.util.Objects;

/* compiled from: PG */
public final class asl extends AsyncTask {
    private /* synthetic */ Uri a;
    private /* synthetic */ VoicemailPlaybackLayout b;

    public asl(VoicemailPlaybackLayout voicemailPlaybackLayout, Uri uri) {
        this.b = voicemailPlaybackLayout;
        this.a = uri;
    }

    public final /* synthetic */ Object doInBackground(Object[] objArr) {
        ContentResolver contentResolver = this.b.b.getContentResolver();
        Uri uri = awg.a;
        String valueOf = String.valueOf("server_id=");
        long parseId = ContentUris.parseId(this.b.d);
        String valueOf2 = String.valueOf("archived_by_user");
        Cursor query = contentResolver.query(uri, null, new StringBuilder((String.valueOf(valueOf).length() + 28) + String.valueOf(valueOf2).length()).append(valueOf).append(parseId).append(" AND ").append(valueOf2).append("= 1").toString(), null, null);
        boolean z = query != null && query.getCount() > 0;
        query.close();
        return Boolean.valueOf(z);
    }

    public final /* synthetic */ void onPostExecute(Object obj) {
        Boolean bool = (Boolean) obj;
        if (!Objects.equals(this.a, this.b.d)) {
            return;
        }
        if (bool.booleanValue()) {
            this.b.l();
            return;
        }
        this.b.g.setVisibility(0);
        this.b.f.setVisibility(0);
        this.b.f.setClickable(true);
        this.b.f.setEnabled(true);
    }
}
