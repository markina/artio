/*
 * Copyright 2020 Monotonic Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package uk.co.real_logic.artio.ilink;

// NB: This is an experimental API and is subject to change or potentially removal.
public class IllegalResponseException extends RuntimeException
{
    public IllegalResponseException(final String message)
    {
        super(message);
    }

    public IllegalResponseException(final String message, final Throwable cause)
    {
        super(message, cause);
    }

    public IllegalResponseException(final Throwable cause)
    {
        super(cause);
    }
}
