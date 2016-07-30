/*
 * Copyright 2015-2016 Real Logic Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package uk.co.real_logic.fix_gateway.replication;

import io.aeron.Publication;
import io.aeron.logbuffer.BufferClaim;

class SoloPublication extends ClusterablePublication
{
    private final Publication dataPublication;

    SoloPublication(final Publication dataPublication)
    {
        this.dataPublication = dataPublication;
    }

    public long tryClaim(final int length, final BufferClaim bufferClaim)
    {
        return dataPublication.tryClaim(length, bufferClaim);
    }

    public void close()
    {
        dataPublication.close();
    }

    public int id()
    {
        return dataPublication.sessionId();
    }
}