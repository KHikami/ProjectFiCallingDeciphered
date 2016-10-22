package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.provider.MediaStore.Images.Media;
import android.util.Log;
import java.io.IOException;
import java.util.Objects;

/* compiled from: PG */
/* renamed from: aoj */
public final class aoj {
    public final Context a;
    public final aws b;

    public aoj(Context context, aws aws) {
        this.a = (Context) Objects.requireNonNull(context);
        this.b = (aws) Objects.requireNonNull(aws);
    }

    public final Drawable a() {
        if (this.b.l == null) {
            return null;
        }
        try {
            Bitmap bitmap = Media.getBitmap(this.a.getContentResolver(), this.b.l);
            Drawable a = buf.a(this.a.getResources(), bitmap);
            a.a(true);
            a.a((float) (bitmap.getHeight() / 2));
            return a;
        } catch (IOException e) {
            Log.e("ContactPhotoLoader", e.toString());
            return null;
        }
    }
}
