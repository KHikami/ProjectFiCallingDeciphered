package defpackage;

import android.os.IInterface;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.wearable.internal.AddLocalCapabilityResponse;
import com.google.android.gms.wearable.internal.ChannelReceiveFileResponse;
import com.google.android.gms.wearable.internal.ChannelSendFileResponse;
import com.google.android.gms.wearable.internal.CloseChannelResponse;
import com.google.android.gms.wearable.internal.DeleteDataItemsResponse;
import com.google.android.gms.wearable.internal.GetAllCapabilitiesResponse;
import com.google.android.gms.wearable.internal.GetCapabilityResponse;
import com.google.android.gms.wearable.internal.GetChannelInputStreamResponse;
import com.google.android.gms.wearable.internal.GetChannelOutputStreamResponse;
import com.google.android.gms.wearable.internal.GetCloudSyncOptInOutDoneResponse;
import com.google.android.gms.wearable.internal.GetCloudSyncOptInStatusResponse;
import com.google.android.gms.wearable.internal.GetCloudSyncSettingResponse;
import com.google.android.gms.wearable.internal.GetConfigResponse;
import com.google.android.gms.wearable.internal.GetConfigsResponse;
import com.google.android.gms.wearable.internal.GetConnectedNodesResponse;
import com.google.android.gms.wearable.internal.GetDataItemResponse;
import com.google.android.gms.wearable.internal.GetFdForAssetResponse;
import com.google.android.gms.wearable.internal.GetLocalNodeResponse;
import com.google.android.gms.wearable.internal.OpenChannelResponse;
import com.google.android.gms.wearable.internal.PutDataResponse;
import com.google.android.gms.wearable.internal.RemoveLocalCapabilityResponse;
import com.google.android.gms.wearable.internal.SendMessageResponse;
import com.google.android.gms.wearable.internal.StorageInfoResponse;

/* renamed from: hzw */
public interface hzw extends IInterface {
    void a(Status status);

    void a(DataHolder dataHolder);

    void a(AddLocalCapabilityResponse addLocalCapabilityResponse);

    void a(ChannelReceiveFileResponse channelReceiveFileResponse);

    void a(ChannelSendFileResponse channelSendFileResponse);

    void a(CloseChannelResponse closeChannelResponse);

    void a(DeleteDataItemsResponse deleteDataItemsResponse);

    void a(GetAllCapabilitiesResponse getAllCapabilitiesResponse);

    void a(GetCapabilityResponse getCapabilityResponse);

    void a(GetChannelInputStreamResponse getChannelInputStreamResponse);

    void a(GetChannelOutputStreamResponse getChannelOutputStreamResponse);

    void a(GetCloudSyncOptInOutDoneResponse getCloudSyncOptInOutDoneResponse);

    void a(GetCloudSyncOptInStatusResponse getCloudSyncOptInStatusResponse);

    void a(GetCloudSyncSettingResponse getCloudSyncSettingResponse);

    void a(GetConfigResponse getConfigResponse);

    void a(GetConfigsResponse getConfigsResponse);

    void a(GetConnectedNodesResponse getConnectedNodesResponse);

    void a(GetDataItemResponse getDataItemResponse);

    void a(GetFdForAssetResponse getFdForAssetResponse);

    void a(GetLocalNodeResponse getLocalNodeResponse);

    void a(OpenChannelResponse openChannelResponse);

    void a(PutDataResponse putDataResponse);

    void a(RemoveLocalCapabilityResponse removeLocalCapabilityResponse);

    void a(SendMessageResponse sendMessageResponse);

    void a(StorageInfoResponse storageInfoResponse);

    void b(CloseChannelResponse closeChannelResponse);
}
