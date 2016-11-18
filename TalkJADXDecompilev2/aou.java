package defpackage;

import android.content.ContentResolver;
import android.content.UriMatcher;
import android.net.Uri;
import android.os.Build.VERSION;
import android.provider.ContactsContract.Contacts;
import java.io.FileNotFoundException;
import java.io.InputStream;

public final class aou extends aos<InputStream> {
    private static final UriMatcher a;

    protected /* synthetic */ Object a(Uri uri, ContentResolver contentResolver) {
        return b(uri, contentResolver);
    }

    protected /* synthetic */ void a(Object obj) {
        ((InputStream) obj).close();
    }

    static {
        UriMatcher uriMatcher = new UriMatcher(-1);
        a = uriMatcher;
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*/#", 1);
        a.addURI("com.android.contacts", "contacts/lookup/*", 1);
        a.addURI("com.android.contacts", "contacts/#/photo", 2);
        a.addURI("com.android.contacts", "contacts/#", 3);
        a.addURI("com.android.contacts", "contacts/#/display_photo", 4);
    }

    public aou(ContentResolver contentResolver, Uri uri) {
        super(contentResolver, uri);
    }

    private static InputStream a(ContentResolver contentResolver, Uri uri) {
        if (VERSION.SDK_INT < 14) {
            return Contacts.openContactPhotoInputStream(contentResolver, uri);
        }
        return Contacts.openContactPhotoInputStream(contentResolver, uri, true);
    }

    public Class<InputStream> d() {
        return InputStream.class;
    }

    private InputStream b(Uri uri, ContentResolver contentResolver) {
        InputStream a;
        switch (a.match(uri)) {
            case 1:
                Uri lookupContact = Contacts.lookupContact(contentResolver, uri);
                if (lookupContact != null) {
                    a = aou.a(contentResolver, lookupContact);
                    break;
                }
                throw new FileNotFoundException("Contact cannot be found");
            case 3:
                a = aou.a(contentResolver, uri);
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
