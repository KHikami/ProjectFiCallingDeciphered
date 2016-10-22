import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.provider.MediaStore.Audio.Media;

public final class ftw extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        if (Media.EXTERNAL_CONTENT_URI.equals(intent.getData())) {
            context.unregisterReceiver(this);
            ftv.a();
        }
    }
}
