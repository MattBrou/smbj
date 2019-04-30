/*
 * Copyright (C)2016 - SMBJ Contributors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.hierynomus.mssmb2;

import com.hierynomus.protocol.commons.buffer.Buffer;
import com.hierynomus.smb.SMBBuffer;
import com.hierynomus.smb.SMBHeader;

public class SMB3EncryptedPacketHeader implements SMBHeader {
    @Override
    public void writeTo(SMBBuffer buffer) {

    }

    @Override
    public void readFrom(Buffer<?> buffer) throws Buffer.BufferException {

    }

    @Override
    public int getHeaderStartPosition() {
        return 0;
    }

    @Override
    public int getMessageEndPosition() {
        return 0;
    }
}
