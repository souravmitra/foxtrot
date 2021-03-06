package com.flipkart.foxtrot.common.count;

import com.flipkart.foxtrot.common.ActionResponse;
import com.flipkart.foxtrot.common.ResponseVisitor;

/**
 * Created by rishabh.goyal on 02/11/14.
 */
public class CountResponse implements ActionResponse {

    private long count;

    public CountResponse(long count) {
        this.count = count;
    }

    public long getCount() {
        return count;
    }

    public void setCount(long count) {
        this.count = count;
    }

    @Override
    public void accept(ResponseVisitor visitor) {
        visitor.visit(this);
    }
}
