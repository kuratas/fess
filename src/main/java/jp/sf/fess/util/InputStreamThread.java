/*
 * Copyright 2009-2013 the Fess Project and the Others.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied. See the License for the specific language
 * governing permissions and limitations under the License.
 */

package jp.sf.fess.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.LinkedList;
import java.util.List;

import jp.sf.fess.FessSystemException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class InputStreamThread extends Thread {
    private static final Logger logger = LoggerFactory
            .getLogger(InputStreamThread.class);

    private BufferedReader br;

    private static final int MAX_BUFFER_SIZE = 1000;

    private final List<String> list = new LinkedList<String>();

    public InputStreamThread(final InputStream is, final String charset) {
        try {
            br = new BufferedReader(new InputStreamReader(is, charset));
        } catch (final UnsupportedEncodingException e) {
            throw new FessSystemException(e);
        }
    }

    @Override
    public void run() {
        for (;;) {
            try {
                final String line = br.readLine();
                if (line == null) {
                    break;
                }
                if (logger.isDebugEnabled()) {
                    logger.debug(line);
                }
                list.add(line);
                if (list.size() > MAX_BUFFER_SIZE) {
                    list.remove(0);
                }
            } catch (final IOException e) {
                throw new FessSystemException(e);
            }
        }
    }

    public String getOutput() {
        final StringBuilder buf = new StringBuilder();
        for (final String value : list) {
            buf.append(value).append("\n");
        }
        return buf.toString();
    }

    public boolean contains(final String value) {
        for (final String line : list) {
            if (line.trim().equals(value)) {
                return true;
            }
        }
        return false;
    }
}