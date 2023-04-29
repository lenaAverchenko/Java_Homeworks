package de.telran.averchenko.elena.homework20New.task3;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ListOutputWriter extends Writer {
    private List<String> strings;
    boolean isClosed = false;

    public ListOutputWriter(List<String> strings) {
        this.strings = strings;
    }

    public void writeWord(String string) throws IOException {
        if (isClosed) {
            throw new IOException("Stream closed");
        } else {
            char[] chars = string.toCharArray();
            if (chars.length != 0) {
                int off = 0;
                int len = chars.length - 1;
                try {
                    write(chars, off, len);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    public void write(String string) throws IOException {
        if (isClosed) {
            throw new IOException("Stream closed");
        } else {
            String[] strArray = string.split(" ");
            for (int i = 0; i < strArray.length; i++) {
                char[] chars = strArray[i].toCharArray();
                if (chars.length != 0) {
                    int off = 0;
                    int len = chars.length - 1;
                    try {
                        write(chars, off, len);
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }
    }

    @Override
    public void write(char[] cbuf, int off, int len) throws IOException {
        if (isClosed) {
            throw new IOException("Stream closed");
        } else {
            //Option 1 - with Stream API
//        String subString = new String((IntStream.range(0,cbuf.length).skip(off)
//                .map(i -> cbuf[i])
//                .skip(off)
//                .limit(len)
//                .toArray()),0,len) +  cbuf[cbuf.length-1];

            // Option 2 - with substring()
            String subString = new String(cbuf).substring(off, len) + cbuf[cbuf.length - 1];

            // Option 3
//        String subString = new String(cbuf,off,len);

//         Option 4 - with StringBuilder
//        StringBuilder stringBuilder = new StringBuilder();
//        for (int i = off; i <= off + len; i++) {
//            stringBuilder.append(cbuf[i]);
//        }
//        strings.add(stringBuilder.toString());

            strings.add(subString);
        }
    }

    @Override
    public void flush() throws IOException {
        strings = new ArrayList<>();
    }

    @Override
    public void close() throws IOException {
        isClosed = true;
        flush();
    }

}
