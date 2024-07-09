//package org.example.interview1;
//
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//import java.util.StringJoiner;
//import java.util.stream.Stream;
//
//public class Encoder {
//    private final EncoderSpec encoderSpec;
//    Map<String, String> mapper = new HashMap<>();
//
//    {
//        mapper.put("a", "z");
//    }
//
//    public Encoder(EncoderSpec encoderSpec){
//        this.encoderSpec = encoderSpec;
//    }
//
//    public String encode(String url) {
//        List<String> encodedList = Stream.of(url.split("")).map(x -> mapper.get(x)).toList();
//        StringJoiner stringJoiner = new StringJoiner("");
//        encodedList.forEach(stringJoiner::add);
//        return stringJoiner.toString();
//    }
//
//    public String encoder(String url, Type type) {
//        List<String> encodedList = Stream.of(url.split("")).map(x -> mapper.get(x)).toList();
//        StringJoiner stringJoiner = new StringJoiner("");
//        encodedList.forEach(stringJoiner::add);
//        return stringJoiner.toString();
//    }
//
//    public String encodePng(String path) {
//        int index = path.lastIndexOf('.');
//        String type = path.substring(1, path.length());
//
//        //illegal characters
//        //accessiblity
//        //size limits
//        //list encoding
//        //type
//
//        if (type.equals("png")) {
//            return encode(path);
//        } else {
//            throw new IncorrectFormatException("Please enter a valid png image");
//        }
//    }
//
//    public static void main(String[] args) {
//        Encoder encoder = new Encoder(new EncodeJPEG());
//        encoder.encoder("path", Type.PNG);
//    }
//}
