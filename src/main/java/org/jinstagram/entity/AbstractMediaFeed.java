package org.jinstagram.entity;

import java.util.List;

import org.jinstagram.InstagramObject;
import org.jinstagram.entity.common.Meta;
import org.jinstagram.entity.common.Pagination;
import org.jinstagram.entity.users.feed.MediaFeedData;
import com.google.gson.annotations.SerializedName;

public abstract class AbstractMediaFeed extends InstagramObject {

    @SerializedName("data")
    private List<MediaFeedData> data;

    @SerializedName("meta")
    private Meta meta;

    @SerializedName("pagination")
    private Pagination pagination;

    /**
     * @return the pagination
     */
    public Pagination getPagination() {
        return pagination;
    }

    /**
     * @param pagination the pagination to set
     */
    public void setPagination(Pagination pagination) {
        this.pagination = pagination;
    }

    /**
     * @return the meta
     */
    public Meta getMeta() {
        return meta;
    }

    /**
     * @param meta the meta to set
     */
    public void setMeta(Meta meta) {
        this.meta = meta;
    }

    /**
     * @return the data
     */
    public List<MediaFeedData> getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(List<MediaFeedData> data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return String.format(getClass().getSimpleName() + " [data=%s, meta=%s, pagination=%s]", data, meta, pagination);
    }
}
