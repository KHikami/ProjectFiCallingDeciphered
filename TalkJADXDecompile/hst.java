import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.widget.ImageView;

public final class hst extends hsz {
    public hst(Context context, gui gui) {
        super(context, gui, true);
    }

    public void a(ImageView imageView, hwn hwn, int i) {
        a(new hsu(this, imageView, hwn, i));
    }

    protected void a(hta hta, Bitmap bitmap) {
        if (bitmap == null) {
            hta.f.setImageBitmap(a(this.b));
        } else {
            super.a(hta, bitmap);
        }
    }

    public static Bitmap a(Context context) {
        return gwb.b(BitmapFactory.decodeResource(context.getResources(), gwb.xl));
    }
}
