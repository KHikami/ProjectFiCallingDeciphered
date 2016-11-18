package defpackage;

import android.net.Uri;
import android.os.Bundle;
import android.os.IInterface;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.server.FavaDiagnosticsEntity;
import com.google.android.gms.people.identity.internal.AccountToken;
import com.google.android.gms.people.identity.internal.ParcelableGetOptions;
import com.google.android.gms.people.identity.internal.ParcelableListOptions;
import com.google.android.gms.people.internal.ParcelableLoadImageOptions;
import com.google.android.gms.people.internal.autocomplete.ParcelableLoadAutocompleteResultsOptions;
import com.google.android.gms.people.internal.autocomplete.ParcelableLoadContactGroupFieldsOptions;
import com.google.android.gms.people.model.AvatarReference;
import java.util.List;

public interface hve extends IInterface {
    Bundle a(Uri uri);

    Bundle a(hvb hvb, boolean z, String str, String str2, int i);

    Bundle a(String str, String str2);

    Bundle a(String str, String str2, long j);

    Bundle a(String str, String str2, long j, boolean z);

    Bundle a(String str, String str2, long j, boolean z, boolean z2);

    gws a(hvb hvb, DataHolder dataHolder, int i, int i2, long j);

    gws a(hvb hvb, AccountToken accountToken, ParcelableListOptions parcelableListOptions);

    gws a(hvb hvb, AvatarReference avatarReference, ParcelableLoadImageOptions parcelableLoadImageOptions);

    gws a(hvb hvb, String str, int i);

    gws a(hvb hvb, String str, ParcelableLoadAutocompleteResultsOptions parcelableLoadAutocompleteResultsOptions);

    gws a(hvb hvb, String str, ParcelableLoadContactGroupFieldsOptions parcelableLoadContactGroupFieldsOptions);

    gws a(hvb hvb, String str, String str2, boolean z, String str3, String str4, int i, int i2, int i3, boolean z2);

    void a(hvb hvb, long j, boolean z);

    void a(hvb hvb, Bundle bundle);

    void a(hvb hvb, AccountToken accountToken, List<String> list, ParcelableGetOptions parcelableGetOptions);

    void a(hvb hvb, String str);

    void a(hvb hvb, String str, int i, int i2);

    void a(hvb hvb, String str, String str2);

    void a(hvb hvb, String str, String str2, int i);

    void a(hvb hvb, String str, String str2, int i, int i2);

    void a(hvb hvb, String str, String str2, Uri uri);

    void a(hvb hvb, String str, String str2, Uri uri, boolean z);

    void a(hvb hvb, String str, String str2, Bundle bundle);

    void a(hvb hvb, String str, String str2, String str3);

    void a(hvb hvb, String str, String str2, String str3, int i, String str4);

    void a(hvb hvb, String str, String str2, String str3, int i, String str4, boolean z);

    void a(hvb hvb, String str, String str2, String str3, int i, boolean z, int i2, int i3, String str4);

    void a(hvb hvb, String str, String str2, String str3, int i, boolean z, int i2, int i3, String str4, boolean z2);

    void a(hvb hvb, String str, String str2, String str3, int i, boolean z, int i2, int i3, String str4, boolean z2, int i4, int i5);

    void a(hvb hvb, String str, String str2, String str3, String str4);

    void a(hvb hvb, String str, String str2, String str3, String str4, int i, String str5);

    void a(hvb hvb, String str, String str2, String str3, String str4, boolean z);

    void a(hvb hvb, String str, String str2, String str3, List<String> list);

    void a(hvb hvb, String str, String str2, String str3, List<String> list, int i, boolean z, long j);

    void a(hvb hvb, String str, String str2, String str3, List<String> list, int i, boolean z, long j, String str4, int i2);

    void a(hvb hvb, String str, String str2, String str3, List<String> list, int i, boolean z, long j, String str4, int i2, int i3);

    void a(hvb hvb, String str, String str2, String str3, List<String> list, int i, boolean z, long j, String str4, int i2, int i3, int i4);

    void a(hvb hvb, String str, String str2, String str3, List<String> list, List<String> list2);

    void a(hvb hvb, String str, String str2, String str3, List<String> list, List<String> list2, FavaDiagnosticsEntity favaDiagnosticsEntity);

    void a(hvb hvb, String str, String str2, String str3, boolean z);

    void a(hvb hvb, String str, String str2, String str3, boolean z, int i);

    void a(hvb hvb, String str, String str2, String str3, boolean z, int i, int i2);

    void a(hvb hvb, String str, boolean z, String[] strArr);

    void a(hvb hvb, boolean z, boolean z2, String str, String str2);

    void a(hvb hvb, boolean z, boolean z2, String str, String str2, int i);

    void a(boolean z);

    boolean a();

    Bundle b(String str, String str2);

    gws b(hvb hvb, long j, boolean z);

    gws b(hvb hvb, String str);

    gws b(hvb hvb, String str, int i, int i2);

    gws b(hvb hvb, String str, String str2, int i, int i2);

    gws b(hvb hvb, String str, String str2, Bundle bundle);

    void b(hvb hvb, Bundle bundle);

    void b(hvb hvb, String str, String str2);

    void b(hvb hvb, String str, String str2, int i);

    void b(hvb hvb, String str, String str2, String str3, int i, String str4);

    void b(hvb hvb, String str, String str2, String str3, boolean z);

    gws c(hvb hvb, String str, String str2, int i);

    void c(hvb hvb, String str, String str2);

    void d(hvb hvb, String str, String str2);
}
