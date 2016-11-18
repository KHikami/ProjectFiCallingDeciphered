package p000;

import android.content.ContentResolver;
import android.content.UriMatcher;
import android.net.Uri;
import android.os.Build.VERSION;
import android.provider.ContactsContract.Contacts;
import java.io.FileNotFoundException;
import java.io.InputStream;

public final class aou extends aos<InputStream> {
    private static final UriMatcher f1976a;

    protected /* synthetic */ Object mo322a(Uri uri, ContentResolver contentResolver) {
        return m3589b(uri, contentResolver);
    }

    protected /* synthetic */ void mo323a(Object obj) {
        ((InputStream) obj).close();
    }

    static {
        UriMatcher uriMatcher = new UriMatcher(-1);
        f1976a = uriMatcher;
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*/#", 1);
        f1976a.addURI("com.android.contacts", "contacts/lookup/*", 1);
        f1976a.addURI("com.android.contacts", "contacts/#/photo", 2);
        f1976a.addURI("com.android.contacts", "contacts/#", 3);
        f1976a.addURI("com.android.contacts", "contacts/#/display_photo", 4);
    }

    public aou(ContentResolver contentResolver, Uri uri) {
        super(contentResolver, uri);
    }

    private static InputStream m3588a(ContentResolver contentResolver, Uri uri) {
        if (VERSION.SDK_INT < 14) {
            return Contacts.openContactPhotoInputStream(contentResolver, uri);
        }
        return Contacts.openContactPhotoInputStream(contentResolver, uri, true);
    }

    public Class<InputStream> mo321d() {
        return InputStream.class;
    }

    private InputStream m3589b(Uri uri, ContentResolver contentResolver) {
        InputStream a;
        switch (f1976a.match(uri)) {
            case 1:
                Uri lookupContact = Contacts.lookupContact(contentResolver, uri);
                if (lookupContact != null) {
                    a = aou.m3588a(contentResolver, lookupContact);
                    break;
                }
                throw new FileNotFoundException("Contact cannot be found");
            case 3:
                a = aou.m3588a(contentResolver, uri);
                break;
            default:
                a = contentResolver.openInputStream(uri);
                break;
        }
        if (a != null) {
            return a;
        }
        String valueOf = String.valueOf(uri);
        throw new FileNotFoundException(new StringBuilder(String.valueOf(valueOf).length() + 24).append("InputStream is null for ").append(valueOf).toString());
    }
}
