import android.content.res.Resources;
import android.net.Uri;
import android.os.ParcelFileDescriptor;

public final class auu implements auj<Integer, ParcelFileDescriptor> {
    private final Resources a;

    public auu(Resources resources) {
        this.a = resources;
    }

    public auh<Integer, ParcelFileDescriptor> a(aup aup) {
        return new aut(this.a, aup.a(Uri.class, ParcelFileDescriptor.class));
    }
}
