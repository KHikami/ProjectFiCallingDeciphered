import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;

public final class are implements ard {
    public void a(Bitmap bitmap) {
        bitmap.recycle();
    }

    public Bitmap a(int i, int i2, Config config) {
        return Bitmap.createBitmap(i, i2, config);
    }

    public Bitmap b(int i, int i2, Config config) {
        return a(i, i2, config);
    }

    public void a() {
    }

    public void a(int i) {
    }
}
