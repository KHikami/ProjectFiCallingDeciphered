import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.io.FileNotFoundException;

public final class aon extends aos<ParcelFileDescriptor> {
    protected /* synthetic */ void a(Object obj) {
        ((ParcelFileDescriptor) obj).close();
    }

    public aon(ContentResolver contentResolver, Uri uri) {
        super(contentResolver, uri);
    }

    public Class<ParcelFileDescriptor> d() {
        return ParcelFileDescriptor.class;
    }

    protected /* synthetic */ Object a(Uri uri, ContentResolver contentResolver) {
        AssetFileDescriptor openAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, "r");
        if (openAssetFileDescriptor != null) {
            return openAssetFileDescriptor.getParcelFileDescriptor();
        }
        String valueOf = String.valueOf(uri);
        throw new FileNotFoundException(new StringBuilder(String.valueOf(valueOf).length() + 28).append("FileDescriptor is null for: ").append(valueOf).toString());
    }
}
