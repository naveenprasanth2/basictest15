package org.example.interview1;

import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Stream;

public class EncodeJPEG extends Encoder implements EncoderSpec{


    public String encodeJPEG(String path) {
        int index = path.lastIndexOf('.');
        String type = path.substring(1, path.length());

        //illegal characters
        //accessiblity
        //size limits
        //list encoding
        //type

        if (type.equals("png")) {
            return encode(path);
        } else {
            throw new IncorrectFormatException("Please enter a valid png image");
        }
    }

    @Override
    public String encode(String url) {
        List<String> encodedList = Stream.of(url.split("")).map(x -> mapper.get(x)).toList();
        StringJoiner stringJoiner = new StringJoiner("");
        encodedList.forEach(stringJoiner::add);
        return stringJoiner.toString();
    }
}
