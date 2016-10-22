import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;

class gru {
    final bhl a;
    final Context b;

    public void a(Uri uri, Bitmap bitmap) {
        int a = gwb.a(this.b, "babel_wear_app_conversation_avatar_request_stress_test_count", 1);
        for (int i = 0; i < a; i++) {
            this.a.a(new grk(uri, bitmap));
        }
    }

    public gru(Context context, bhl bhl) {
        this.b = context;
        this.a = bhl;
    }
}
