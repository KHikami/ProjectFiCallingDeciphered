package p000;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;

class gru {
    final bhl f15988a;
    final Context f15989b;

    public void m18373a(Uri uri, Bitmap bitmap) {
        int a = gwb.m1492a(this.f15989b, "babel_wear_app_conversation_avatar_request_stress_test_count", 1);
        for (int i = 0; i < a; i++) {
            this.f15988a.mo550a(new grk(uri, bitmap));
        }
    }

    public gru(Context context, bhl bhl) {
        this.f15989b = context;
        this.f15988a = bhl;
    }
}
