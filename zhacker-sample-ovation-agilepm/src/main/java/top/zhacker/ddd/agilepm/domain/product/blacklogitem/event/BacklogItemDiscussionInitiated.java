//   Copyright 2012,2013 Vaughn Vernon
//
//   Licensed under the Apache License, Version 2.0 (the "License");
//   you may not use this file except in compliance with the License.
//   You may obtain a copy of the License at
//
//       http://www.apache.org/licenses/LICENSE-2.0
//
//   Unless required by applicable law or agreed to in writing, software
//   distributed under the License is distributed on an "AS IS" BASIS,
//   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
//   See the License for the specific language governing permissions and
//   limitations under the License.

package top.zhacker.ddd.agilepm.domain.product.blacklogitem.event;


import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import top.zhacker.core.model.DomainEvent;
import top.zhacker.ddd.agilepm.domain.product.blacklogitem.BacklogItemDiscussion;
import top.zhacker.ddd.agilepm.domain.product.blacklogitem.BacklogItemId;
import top.zhacker.ddd.agilepm.domain.tenant.TenantId;

import java.util.Date;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class BacklogItemDiscussionInitiated implements DomainEvent {

    private BacklogItemId backlogItemId;
    private BacklogItemDiscussion discussion;
    private int eventVersion;
    private Date occurredOn;
    private TenantId tenantId;

    public BacklogItemDiscussionInitiated(TenantId aTenantId, BacklogItemId aBacklogItemId, BacklogItemDiscussion aDiscussion) {
        super();

        this.backlogItemId = aBacklogItemId;
        this.discussion = aDiscussion;
        this.eventVersion = 1;
        this.occurredOn = new Date();
        this.tenantId = aTenantId;
    }

    public BacklogItemId backlogItemId() {
        return this.backlogItemId;
    }

    public BacklogItemDiscussion discussion() {
        return this.discussion;
    }

    @Override
    public int eventVersion() {
        return this.eventVersion;
    }

    @Override
    public Date occurredOn() {
        return this.occurredOn;
    }

    public TenantId tenantId() {
        return this.tenantId;
    }
}